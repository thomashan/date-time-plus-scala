package scala

import java.time.temporal.ChronoUnit._
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

import org.threeten.extra.PeriodDuration

package object time {

  implicit final class TemporalAmountInt(val n: Int) extends AnyVal with TemporalAmountIntConversions {
    override protected def temporalAmount(temporalUnit: TemporalUnit): Period = temporalUnit match {
      case YEARS => Period.ofYears(n)
      case MONTHS => Period.ofMonths(n)
      case DAYS => Period.ofDays(n)
    }
  }

  implicit final class TemporalAmountLong(val n: Long) extends AnyVal with TemporalAmountLongConversions {
    override protected def temporalAmount(temporalUnit: TemporalUnit): Duration = temporalUnit match {
      case HOURS => Duration.ofHours(n)
      case MINUTES => Duration.ofMinutes(n)
      case SECONDS => Duration.ofSeconds(n)
      case MILLIS => Duration.ofMillis(n)
      case MICROS => Duration.ofNanos(n * 1000)
      case NANOS => Duration.ofNanos(n)
    }
  }

  sealed abstract class TemporalAmountOperators(val temporalAmount: TemporalAmount)

  implicit final class DurationOperators(val duration: Duration) extends TemporalAmountOperators(duration) {
    def +(other: Duration): Duration = duration.plus(other)

    def -(other: Duration): Duration = duration.minus(other)

    def +(other: Period): PeriodDuration = PeriodDuration.of(duration).plus(PeriodDuration.of(other))

    def -(other: Period): PeriodDuration = PeriodDuration.of(duration).minus(PeriodDuration.of(other))
  }

  implicit final class PeriodOperators(val period: Period) extends TemporalAmountOperators(period) {
    def +(other: Period): Period = period.plus(other)

    def -(other: Period): Period = period.minus(other)

    def +(other: Duration): PeriodDuration = PeriodDuration.of(period).plus(PeriodDuration.of(other))

    def -(other: Duration): PeriodDuration = PeriodDuration.of(period).minus(PeriodDuration.of(other))
  }

  implicit class TemporalOperators(val temporal: Temporal) {
    def +(temporalAmount: TemporalAmount): Temporal = temporal.plus(temporalAmount)

    def -(temporalAmount: TemporalAmount): Temporal = temporal.minus(temporalAmount)
  }

}
