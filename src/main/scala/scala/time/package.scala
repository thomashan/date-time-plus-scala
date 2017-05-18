package scala

import java.time.temporal.ChronoUnit.{DAYS, HOURS, MINUTES, MONTHS, NANOS, SECONDS, YEARS}
import java.time.temporal.{TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

package object time {

  implicit final class TemporalAmountInt(private val n: Int) extends AnyVal with TemporalAmountIntConversions {
    override protected def temporalAmount(temporalUnit: TemporalUnit): TemporalAmount = temporalUnit match {
      case YEARS => Period.ofYears(n)
      case MONTHS => Period.ofMonths(n)
      case DAYS => Period.ofDays(n)
      case HOURS => Duration.ofHours(n)
      case MINUTES => Duration.ofMinutes(n)
      case SECONDS => Duration.ofSeconds(n)
      case NANOS => Duration.ofNanos(n)
    }
  }

  implicit final class TemporalAmountLong(private val n: Long) extends AnyVal with TemporalAmountLongConversions {
    override protected def temporalAmount(temporalUnit: TemporalUnit): TemporalAmount = temporalUnit match {
      case HOURS => Duration.ofHours(n)
      case MINUTES => Duration.ofMinutes(n)
      case SECONDS => Duration.ofSeconds(n)
      case NANOS => Duration.ofNanos(n)
    }
  }

}
