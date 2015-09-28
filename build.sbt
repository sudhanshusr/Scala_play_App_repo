name := "Play_DB"

version := "1.0-SNAPSHOT"

//Scala version
scalaVersion := "2.11.4"

			
libraryDependencies ++= Seq(
  "org.scalatestplus" % "play_2.10" % "1.3.0" % "test",
  jdbc,
  anorm,
  cache,
  "mysql" % "mysql-connector-java" % "5.1.22",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)    

jacoco.settings

play.Project.playScalaSettings

import de.johoop.cpd4sbt.CopyPasteDetector._

cpdSettings