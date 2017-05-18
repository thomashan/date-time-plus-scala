package scala.time

import java.time.temporal.ChronoUnit.{DAYS, HOURS, MINUTES, MONTHS, NANOS, SECONDS, YEARS}
import java.time.temporal.{TemporalAmount, TemporalUnit}
import java.time.{Duration, Period}

import scala.time.TemporalAmountConversions.Classifier

trait TemporalAmountConversions[T <: TemporalAmount] extends Any {
  protected def temporalAmount(temporalUnit: TemporalUnit): T
}

trait TemporalAmountIntConversions extends Any with TemporalAmountConversions[Period] {
  def year = temporalAmount(YEARS)

  def month = temporalAmount(MONTHS)

  def day = temporalAmount(DAYS)

  def year[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(year)

  def month[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(month)

  def day[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(day)
}

trait TemporalAmountLongConversions extends Any with TemporalAmountConversions[Duration] {
  def hour = temporalAmount(HOURS)

  def minute = temporalAmount(MINUTES)

  def s = temporalAmount(SECONDS)

  def ns = temporalAmount(NANOS)

  def hour[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(hour)

  def minute[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(minute)

  def s[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(s)

  def ns[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(ns)
}

object TemporalAmountConversions {

  trait Classifier[C] {
    type R

    def convert(d: TemporalAmount): R
  }

}
