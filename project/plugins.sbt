// Comment to get more information during initialization
logLevel := Level.Warn

// Use the Play sbt plugin for Play projects
//addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.6")
//addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")

// The Typesafe repository 
resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

resolvers += Resolver.url("scoverage-bintray", url("https://dl.bintray.com/sksamuel/sbt-plugins/"))(Resolver.ivyStylePatterns)

// Use the Play sbt plugin for Play projects
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.2.6")

//For code coverage
addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.1")

//for scoverage
//addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.1.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.3")


//for scala style
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.7.0")
//For CPD
addSbtPlugin("de.johoop" % "cpd4sbt" % "1.1.5")

addSbtPlugin("de.johoop" % "findbugs4sbt" % "1.4.0")
