
val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "kafka-client-3-7",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
//      "org.apache.kafka" % "kafka-clients" % "3.6.1",
      "org.apache.kafka" % "kafka-clients" % "3.7.0",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),

  ).enablePlugins(PackPlugin)

