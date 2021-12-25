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

ThisBuild / organization := "org.typelevel"
ThisBuild / organizationName := "Typelevel"
ThisBuild / organizationHomepage := Some(url("https://typelevel.org"))

ThisBuild / homepage := Some(url("https://github.com/typelevel/jdk-index"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/typelevel/jdk-index"),
    "git@github.com:typelevel/jdk-index.git"
  )
)

ThisBuild / developers := List(
  Developer(
    "vasilmkd",
    "Vasil Vasilev",
    "vasil@vasilev.io",
    url("https://github.com/vasilmkd")),
  Developer(
    "rossabaker",
    "Ross A. Baker",
    "ross@rossabaker.com",
    url("https://github.com/rossabaker")),
  Developer(
    "durban",
    "Daniel Urban",
    "urban.dani@gmail.com",
    url("https://github.com/durban")
  )
)

ThisBuild / startYear := Some(2021)
ThisBuild / licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))

ThisBuild / scalaVersion := "3.1.0"

val `jdk-index` = project
  .in(file("."))
  .settings(
    headerLicense := Some(HeaderLicense.ALv2("2021", (ThisBuild / organizationName).value)),
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-io" % "3.2.4",
      "io.circe" %% "circe-core" % "0.14.1"
    )
  )

addCommandAlias("generateIndex", "runMain org.typelevel.jdk.index.Generate")
addCommandAlias("checkIndex", "runMain org.typelevel.jdk.index.Check")
