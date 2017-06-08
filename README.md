# date-time-plus-scala
[![Build Status](https://travis-ci.org/thomashan/date-time-plus-scala.svg)](https://travis-ci.org/thomashan/date-time-plus-scala)
[![Quality Gate](https://sonarcloud.io/api/badges/gate?key=scala.time)](https://sonarcloud.io/dashboard?id=scala.time)
[![codecov](https://codecov.io/gh/thomashan/date-time-plus-scala/branch/master/graph/badge.svg)](https://codecov.io/gh/thomashan/date-time-plus-scala)
[![Coverage Status](https://coveralls.io/repos/github/thomashan/date-time-plus-scala/badge.svg)](https://coveralls.io/github/thomashan/date-time-plus-scala)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1984f0cf64464a238c59219751d77794)](https://www.codacy.com/app/thomashan/date-time-plus-scala?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=thomashan/date-time-plus-scala&amp;utm_campaign=Badge_Grade)

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

### Publish to local ivy
```
> sbt clean publish-local
```

### Publish to local maven
```
> sbt clean publish-m2
```


## Usage and examples
```scala
import scala.time._

val oneMonthFromToday = java.time.LocalDate.now() + 1.month
val oneMonthFromNow = java.time.LocalDateTime.now() + 1.month
val oneMonthFromNowAtUtcTimeZone = java.time.ZonedDateTime.now(java.time.ZoneId.of("UTC")) + 1.month
```
