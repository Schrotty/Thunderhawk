name := "Thunderhawk"

version := "0.1.0"

scalaVersion := "2.13.0"

assemblyJarName in assembly := "thunder.jar"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.23",
  "com.typesafe.akka" %% "akka-stream" % "2.5.23",
  "org.antlr" % "antlr4-runtime" % "4.7",
  "org.antlr" % "stringtemplate" % "3.2"
)

antlr4PackageName in Antlr4 := Some("thunderhawk")

