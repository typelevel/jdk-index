/*
 * Copyright 2021-2022 Typelevel
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

import cats.Monoid
import cats.effect.{ExitCode, IO, IOApp}
import cats.effect.std.Console
import cats.syntax.all.*
import fs2.Stream
import fs2.io.file.{Files, Path}
import fs2.text
import io.circe.syntax.*
import org.typelevel.jdk.index.model.files.*
import org.typelevel.jdk.index.model.json.given

object Check extends IOApp:

  private given Monoid[ExitCode] with
    val empty: ExitCode = ExitCode.Success
    def combine(a: ExitCode, b: ExitCode): ExitCode =
      if (a == ExitCode.Error) a else b

  val checkJabbaIndex: IO[ExitCode] =
    Files[IO]
      .readAll(Path("index.json"))
      .through(text.utf8.decode)
      .compile
      .last
      .flatMap {
        case Some(actual) =>
          IO {
            val expected = MainIndex.asJson.spaces4.concat("\n")
            actual === expected
          }
        case None => IO.pure(false)
      }
      .ifM(
        IO.pure(ExitCode.Success),
        Console[IO]
          .errorln(
            "Current index does not match the main index defined in the code. Please regenerate the index.")
          .as(ExitCode.Error)
      )

  val checkFilesIndex: IO[ExitCode] =
    Stream(MainIndex.releases: _*)
      .map(releaseToPath)
      .evalMap { (path, url) =>
        IO((path.resolve("jdk"), url.toString))
      }
      .evalMap { (path, contents) =>
        Files[IO]
          .readAll(Path.fromNioPath(path))
          .through(text.utf8.decode)
          .compile
          .last
          .map {
            case Some(actual) => actual === contents
            case None => false
          }
          .map {
            case true => ExitCode.Success
            case false => ExitCode.Error
          }
      }
      .compile
      .foldMonoid

  def run(args: List[String]): IO[ExitCode] =
    IO.both(checkJabbaIndex, checkFilesIndex).map(_ |+| _)
