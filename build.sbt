
name := "locker"

scalaVersion := "2.11.1"

version := "1.0"

testOptions += Tests.Argument(TestFrameworks.JUnit, "-q", "-v")

libraryDependencies += "junit" % "junit" % "4.8" % "test"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10" % "test"