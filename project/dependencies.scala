import sbt._

object Dependencies {

  val vaadinVersion = "8.1.1"

  val vaadinServer = "com.vaadin" % "vaadin-server" % vaadinVersion
  val vaadinClient = "com.vaadin" % "vaadin-client" % vaadinVersion
  val vaadinCompatibilityClient = "com.vaadin" % "vaadin-compatibility-client" % vaadinVersion
  val vaadinCompatibilityServer = "com.vaadin" % "vaadin-compatibility-server" % vaadinVersion
  val vaadinClientCompiler = "com.vaadin" % "vaadin-client-compiler" % vaadinVersion
  val vaadinThemes = "com.vaadin" % "vaadin-themes" % vaadinVersion

  val addonDeps = Seq(
    vaadinServer,
    vaadinClient,
    vaadinCompatibilityClient,
    vaadinCompatibilityServer
  )

  val demoDeps = Seq(
    vaadinClientCompiler % "provided",
    vaadinThemes,
    vaadinCompatibilityClient,
    vaadinCompatibilityServer
  )

}
