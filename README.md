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

# Features
* construct [TemporalAmount](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAmount.html) using dot notation (e.g. 1.hour, 27.days)
* perform [TemporalAmount](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/TemporalAmount.html) operators on
[Temporal](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/Temporal.html) (e.g. LocalDateTime.now() + 1.year, ZonedDateTime.now() - 10.s)

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

## Unit Abbreviations
Units less than or equal to the "[HOURS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#HOURS)"
provide abbreviations.
For example
* [HOURS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#HOURS) -> h, hr, hrs
* [MINUTES](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#MINUTES) -> m, mins (min is a keyword for Rich* refer to [scala.runtime.ScalaNumberProxy](https://www.scala-lang.org/api/current/scala/runtime/ScalaNumberProxy.html))
* [SECONDS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#SECONDS) -> s, sec, secs
* [MILLIS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#MILLIS) -> ms
* [MICROS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#MICROS) -> us
* [NANOS](https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html#NANOS) -> ns

## Usage and examples
```scala
import scala.time._

val oneMonthFromToday = java.time.LocalDate.now() + 1.month
val oneMonthFromNow = java.time.LocalDateTime.now() + 1.month
val oneMonthFromNowAtUtcTimeZone = java.time.ZonedDateTime.now(java.time.ZoneId.of("UTC")) + 1.month
```
