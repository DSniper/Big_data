ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Hello_To_Scala",
    idePackagePrefix := Some("daisy.manmohan.singh.hello")
  )
