import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "event-adapter-tagging",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-persistence" % "2.5.6",
      scalaTest % Test
    )
  )
