lazy val root = (project in file(".")).
  settings(
    organization := "com.lorealconsulting",
    name := "nexoRetailerAPI-okhttp-client",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger.core.v3" % "swagger-annotations" % "2.0.0",
      "com.squareup.okhttp" % "okhttp" % "2.7.5",
      "com.squareup.okhttp" % "logging-interceptor" % "2.7.5",
      "com.google.code.gson" % "gson" % "2.8.1",
      "io.gsonfire" % "gson-fire" % "1.8.3" % "compile",
      "org.threeten" % "threetenbp" % "1.3.5" % "compile",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
