import sbt._

object Dependencies {

  val akkaVersion     = "2.5.26"
  val akkaHttpVersion = "10.1.10"
  val zioVersion      = "1.0.0-RC16"

  lazy val akkaHttp         = "com.typesafe.akka"  %% "akka-http"            % akkaHttpVersion
  lazy val akkaStream       = "com.typesafe.akka"  %% "akka-stream"          % akkaVersion
  lazy val json4s           = "de.heikoseeberger"  %% "akka-http-json4s"     % "1.29.1"
  lazy val json4sJackson    = "org.json4s"         %% "json4s-jackson"       % "3.6.7"
  lazy val scalazZio        = "dev.zio"            %% "zio"                  % zioVersion
  lazy val scalazZioRS      = "dev.zio"            %% "zio-streams"          % zioVersion
  lazy val scalazZioIntRS   = "dev.zio"            %% "zio-interop-reactivestreams" % "1.0.3.5-RC1"
  lazy val slick            = "com.typesafe.slick" %% "slick"                % "3.3.2"
  lazy val akkaHttpTestkit  = "com.typesafe.akka"  %% "akka-http-testkit"    % akkaHttpVersion
  lazy val akkaTestkit      = "com.typesafe.akka"  %% "akka-testkit"         % akkaVersion
  lazy val scalaTest        = "org.scalatest"      %% "scalatest"            % "3.0.8"
  lazy val scalaTestMockito = "org.scalatestplus"  %% "mockito-1-10"         % "3.2.0.0-M1"
  lazy val h2               = "com.h2database"     %  "h2"                   % "1.4.200"
}