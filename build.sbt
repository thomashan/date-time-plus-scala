name := "date-time-plus-scala"
version := "0.1-SNAPSHOT"
organization := "com.thomashan"
scalaVersion := "2.10.6"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
