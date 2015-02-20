# maven-scala-java-continuous-test
POC for a continuous test facility (a-la-sbt) for mixed java and scala projects

Uses scala-maven-plugin (More info on http://davidb.github.io/scala-maven-plugin/index.html and https://github.com/davidB/scala-maven-plugin)


**Current features:**

1. Runs tests in an infinite loop (thus, continuous test) making feedback almost instantaneous when modifying source and test codes.
2. Uses surefire maven plugin to run Junits for java classes
3. Incremental compile a-la-sbt. Saving a java/scala file will re-trigger the test.

**To-do:**

1. Add test frameworks for Scala (ScalaTest, Specs2, ScalaCheck)


**Usage:**

To run Surefire:

`mvn -Dcctest.goals="surefire:test" scala:cctest`

To run Surefire and ScalaTest (pending, won't work at the moment):

`mvn -Dcctest.goals="surefire:test scalatest:test" scala:cctest`
