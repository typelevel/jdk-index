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
    url("https://github.com/rossabaker"))
)

ThisBuild / startYear := Some(2021)

val MacOS = "macos-latest"
val GraalVMJDK8 = "graalvm-ce-java8@21.2"
val GraalVMJDK11 = "graalvm-ce-java11@21.2"
val OpenJ9JDK8 = "openj9-java8@0.27"
val OpenJ9JDK11 = "openj9-java11@0.27"

ThisBuild / baseVersion := "0.1"

ThisBuild / crossScalaVersions := Seq("3.1.0")
ThisBuild / githubWorkflowJavaVersions := Seq(
  "adoptium@8",
  "adoptium@11",
  "adoptium@17",
  GraalVMJDK8,
  GraalVMJDK11,
  OpenJ9JDK8,
  OpenJ9JDK11
)

// Use the index from the current commit. This essentially tests that JDKs can be installed from the current changes to the index.
ThisBuild / githubWorkflowEnv += ("JABBA_INDEX" -> "${{ github.server_url }}/${{ github.repository }}/raw/${{ github.sha }}/index.json")

ThisBuild / githubWorkflowOSes := Seq("ubuntu-latest", MacOS, "windows-latest")

// Graal VM 8 is not available for MacOS
ThisBuild / githubWorkflowBuildMatrixExclusions := Seq(
  MatrixExclude(Map("os" -> MacOS, "java" -> GraalVMJDK8))
)

ThisBuild / githubWorkflowPublishTargetBranches := Seq()

ThisBuild / githubWorkflowBuild := Seq(
  WorkflowStep.Sbt(
    name = Some("Check if the JDK index is up to date"),
    commands = List("checkIndex")
  )
)

val `jdk-index` = project
  .in(file("."))
  .settings(
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-io" % "3.2.1",
      "io.circe" %% "circe-core" % "0.14.1"
    )
  )

addCommandAlias("generateIndex", "runMain org.typelevel.jdk.index.Generate")
addCommandAlias("checkIndex", "runMain org.typelevel.jdk.index.Check")
