name := "pizza-sov-relay-v2"

version := "1.0"

scalaVersion := "2.11.8"


resolvers += Resolver.jcenterRepo

fork := true
parallelExecution in Test := false

val HTTP4S_VERSION = "0.13.2"

// main dependencies
libraryDependencies ++= Seq(
  // frameworks
  "org.http4s"                       %% "http4s-core"               % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-server"             % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-dsl"                % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-blaze-server"       % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-blaze-client"       % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-circe"              % HTTP4S_VERSION,
  "org.http4s"                       %% "http4s-json4s"             % HTTP4S_VERSION,
  "io.spray"                         %% "spray-caching"             % "1.3.3",
  "org.json4s"                       %% "json4s-jackson"            % "3.3.0",
  "com.flipkart.zjsonpatch"          % "zjsonpatch"                 % "0.2.3"
)

// test frameworks and tools
libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.4"   % "test",
  "org.mockito"    % "mockito-all" % "1.10.19" % "test",
  "org.scalacheck" %% "scalacheck" % "1.13.0"  % "test"
)

testOptions in Test += Tests.Argument(TestFrameworks.ScalaCheck, "-maxSize", "5", "-minSuccessfulTests", "33", "-workers", "1", "-verbosity", "1")
