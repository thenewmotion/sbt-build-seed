resolvers += "TNM" at "https://nexus.thenewmotion.com/content/groups/public"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.9")
addSbtPlugin("no.arktekk.sbt" % "aether-deploy" % "0.21")
addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.2")

// Use itself as a plugin
unmanagedSourceDirectories in Compile += baseDirectory.value.getParentFile
