package scala.time

import java.time.temporal.ChronoUnit._
import java.time.temporal.{TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

trait TemporalAmountConversions[T <: TemporalAmount] extends Any {
  protected def temporalAmount(temporalUnit: TemporalUnit): T
}

trait TemporalAmountIntConversions extends Any with TemporalAmountConversions[Period] {
  def year: Period = temporalAmount(YEARS)

  def years: Period = year


  def month: Period = temporalAmount(MONTHS)

  def months: Period = month


  def day: Period = temporalAmount(DAYS)

  def days: Period = temporalAmount(DAYS)
}

trait TemporalAmountLongConversions extends Any with TemporalAmountConversions[Duration] {
  def hour: Duration = temporalAmount(HOURS)

  def hours: Duration = hour

  def hr: Duration = hour

  def hrs: Duration = hour

  def h: Duration = hour


  def minute: Duration = temporalAmount(MINUTES)

  def minutes: Duration = minute

  def mins: Duration = minute

  def m: Duration = minute


  def second: Duration = temporalAmount(SECONDS)

  def seconds: Duration = second

  def sec: Duration = second

  def secs: Duration = second

  def s: Duration = second


  def millisecond: Duration = temporalAmount(MILLIS)

  def milliseconds: Duration = millisecond

  def milli: Duration = millisecond

  def millis: Duration = millisecond

  def ms: Duration = millisecond


  def microsecond: Duration = temporalAmount(MICROS)

  def microseconds: Duration = microsecond

  def micro: Duration = microsecond

  def micros: Duration = microsecond

  def us: Duration = microsecond


  def nanosecond: Duration = temporalAmount(NANOS)

  def nanoseconds: Duration = nanosecond

  def nano: Duration = nanosecond

  def nanos: Duration = nanosecond

  def ns: Duration = nanosecond
}

object TemporalAmountConversions {

  trait Classifier[C] {
    type R

    def convert(d: TemporalAmount): R
  }

}
