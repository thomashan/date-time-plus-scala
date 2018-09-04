name := "date-time-plus-scala"
version := "0.1-SNAPSHOT"
organization := "com.thomashan"
scalaVersion := "2.11.11"

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies ++= Seq(
  "org.threeten" % "threeten-extra" % "1.4",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)
