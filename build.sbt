organization := "fr.acinq"
name := "bitcoin-lib"
scalaVersion := "2.12.4"

version := "0.9.15-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.google.protobuf" % "protobuf-java" % "2.5.0",
  "com.madgag.spongycastle" % "core" % "1.58.0.0",
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "ch.qos.logback" % "logback-classic" % "1.2.3" % "test",
  "org.scalatest" %% "scalatest" % "3.0.3" % "test",
  "org.json4s" %% "json4s-jackson" % "3.5.2" % "test",
  "com.google.guava" % "guava" % "19.0" % "test"
)


crossScalaVersions := Seq("2.11.12", "2.12.4")