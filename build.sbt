ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "FTIFunctions"
  )
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.3" % Test
