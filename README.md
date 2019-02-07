gradle-java-clojure-skeleton
============================

A basic skeleton application for a Java application that calls Clojure, with the following
features:

- uses the [Gradle](https://www.gradle.org/) build tool
- uses the [clojuresque](https://github.com/clojuresque/clojuresque) Gradle plugin
- main() is in Java
- includes local Java files
- includes non-compiled local Clojure files
- includes 3rd party Clojure libraries libraries
- can build an uberjar
- uses the 1.6+
  [Clojure Java API](http://clojure.github.io/clojure/javadoc/clojure/java/api/Clojure.html) to
  invoke Clojure code from Java.

To use:
```
$ gradle wrapper --gradle-version 4.1
$ ./gradlew run
```


