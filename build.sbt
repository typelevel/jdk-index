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

ThisBuild / licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0"))

ThisBuild / scalaVersion := "3.1.1"

val `jdk-index` = project
  .in(file("."))
  .enablePlugins(AutomateHeaderPlugin)
  .settings(
    headerLicense := Some(
      HeaderLicense.ALv2("2021-2022", (ThisBuild / organizationName).value)),
    libraryDependencies ++= Seq(
      "co.fs2" %% "fs2-io" % "3.2.7",
      "io.circe" %% "circe-core" % "0.14.1"
    ),
    scalacOptions ++= {
      val version = System.getProperty("java.version")
      if (version.startsWith("1.8"))
        Seq()
      else
        Seq("-release", "8")
    }
  )

addCommandAlias("generateIndex", "runMain org.typelevel.jdk.index.Generate")
addCommandAlias("checkIndex", "runMain org.typelevel.jdk.index.Check")
