name := "Akka Http Testkit Example"

version := "0.1"

scalaVersion := "2.12.12"

val akkaVersion = "2.5.20"
val akkaHttpVersion = "10.1.7"
val scalaTestVersion = "3.0.5"

libraryDependencies ++= Seq(

  // akka streams
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  // akka http
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  // testing
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion
)