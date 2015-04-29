name := "scoverage-multi-module"

lazy val one = project.
		settings(commonSettings: _*)

lazy val two = project.
		settings(commonSettings: _*).
		dependsOn(one)

lazy val three = project.
		settings(commonSettings: _*).
		dependsOn(two)

lazy val commonSettings = Seq(
    scalaVersion := "2.11.6",
    libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4"
)

