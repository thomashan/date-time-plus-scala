# date-time-plus-scala [![Build Status](https://travis-ci.org/thomashan/date-time-plus-scala.svg)](https://travis-ci.org/thomashan/date-time-plus-scala) [![codecov](https://codecov.io/gh/thomashan/date-time-plus-scala/branch/master/graph/badge.svg)](https://codecov.io/gh/thomashan/date-time-plus-scala) [![Coverage Status](https://coveralls.io/repos/github/thomashan/date-time-plus-scala/badge.svg)](https://coveralls.io/github/thomashan/date-time-plus-scala)
Simplify java date time in scala!

Suggestions and feedback is very much appreciated.


# Design objectives
* simplify java date time API and make developers' lives happier!
* minimal dependencies
* make it work with multiple versions of java, scala and always aim to be backwards compatible

## Prerequisites
* JDK 1.8+
* Scala 2.12

There will be multiple branches for different scala versions.

## Install
I can't publish to public maven repos so the best way to install it at the moment is to checkout the code and build it yourself.
```
> sbt clean publishLocal
```


## Usage and examples
```scala
import scala.time._

val oneMonthFromToday = java.time.LocalDate.now() + 1.month
val oneMonthFromNow = java.time.LocalDateTime.now() + 1.month
val oneMonthFromNowAtUtcTimeZone = java.time.ZonedDateTime.now(java.time.ZoneId.of("UTC")) + 1.month
```
