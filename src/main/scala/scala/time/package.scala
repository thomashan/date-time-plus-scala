package scala

import java.time.temporal.ChronoUnit._
import java.time.temporal.{Temporal, TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

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
      case NANOS => Duration.ofNanos(n)
    }
  }

  abstract class TemporalAmountOperators(private val temporalAmount: TemporalAmount) {
    def +(temporal: Temporal) = temporalAmount.addTo(temporal)
  }

  implicit final class DurationOperators(private val duration: Duration) extends TemporalAmountOperators(duration) {
    def +(other: Duration) = duration.plus(other)

    def -(other: Duration) = duration.minus(other)
  }

  implicit final class PeriodOperators(private val period: Period) extends TemporalAmountOperators(period) {
    def +(other: Period) = period.plus(other)

    def -(other: Period) = period.minus(other)
  }

  implicit class TemporalOperators(private val temporal: Temporal) {
    def +(temporalAmount: TemporalAmount) = temporal.plus(temporalAmount)

    def -(temporalAmount: TemporalAmount) = temporal.minus(temporalAmount)
  }

}
