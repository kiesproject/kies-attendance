lazy val skinnyMicroVersion = "1.3.+"

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.5",
      version      := "0.1"
    )),
    name := "kies-attendance",
    libraryDependencies ++= Seq(
      "org.skinny-framework" %% "skinny-micro"         % skinnyMicroVersion,
      "ch.qos.logback"       %  "logback-classic"      % "1.2.3",
      "javax.servlet"        %  "javax.servlet-api"    % "3.1.0"
    )
  )