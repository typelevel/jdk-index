/*
 * Copyright 2021 Typelevel
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

import cats.effect.{ExitCode, IO, IOApp}
import cats.effect.std.Console
import cats.syntax.eq._
import fs2.io.file.{Files, Path}
import fs2.text
import io.circe.syntax._
import model.json.given

object Check extends IOApp:
  def run(args: List[String]): IO[ExitCode] =
    Files[IO]
      .readAll(Path("index.json"))
      .through(text.utf8.decode)
      .compile
      .lastOrError
      .flatMap { actual =>
        IO {
          val expected = MainIndex.asJson.spaces4.concat(System.lineSeparator)
          actual === expected
        }
      }
      .ifM(
        IO.pure(ExitCode.Success),
        Console[IO]
          .errorln(
            "Current index does not match the main index defined in the code. Please regenerate the index.")
          .as(ExitCode.Error)
      )
