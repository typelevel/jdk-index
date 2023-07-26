/*
 * Copyright 2021-2023 Typelevel
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.typelevel.jdk.index

import cats.effect.{IO, IOApp}
import fs2.{text, Stream}
import fs2.io.file.{Files, Path}
import io.circe.syntax.*
import org.typelevel.jdk.index.model.files.*
import org.typelevel.jdk.index.model.json.given

object Generate extends IOApp.Simple:
  val writeJabbaIndex: IO[Unit] =
    Stream
      .eval(IO(MainIndex.asJson.spaces4.concat("\n")))
      .through(text.utf8.encode)
      .through(Files[IO].writeAll(Path("index.json")))
      .compile
      .drain

  val writeFileIndex: IO[Unit] =
    Stream(MainIndex.releases: _*)
      .covary[IO]
      .map(releaseToPath)
      .evalMap((path, url) => IO((path, url.toString)))
      .evalTap((path, _) => Files[IO].createDirectories(Path.fromNioPath(path)))
      .flatMap { (path, contents) =>
        Stream(contents)
          .through(text.utf8.encode)
          .through(Files[IO].writeAll(Path.fromNioPath(path.resolve("jdk"))))
      }
      .compile
      .drain

  def run: IO[Unit] =
    IO.both(writeJabbaIndex, writeFileIndex).void
