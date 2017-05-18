package scala.time

import java.time.temporal.ChronoUnit.{DAYS, HOURS, MINUTES, MONTHS, NANOS, SECONDS, YEARS}
import java.time.temporal.{TemporalAmount, TemporalUnit}

import scala.time.TemporalAmountConversions.Classifier

trait TemporalAmountConversions extends Any {
  protected def temporalAmount(temporalUnit: TemporalUnit): TemporalAmount
}

trait TemporalAmountIntConversions extends Any with TemporalAmountConversions {
  protected def temporalAmount(temporalUnit: TemporalUnit): TemporalAmount

  def year = temporalAmount(YEARS)

  def month = temporalAmount(MONTHS)

  def day = temporalAmount(DAYS)

  def hr = temporalAmount(HOURS)

  def min = temporalAmount(MINUTES)

  def s = temporalAmount(SECONDS)

  def ns = temporalAmount(NANOS)

  def year[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(year)

  def month[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(month)

  def day[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(day)

  def hr[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(hr)

  def min[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(min)

  def s[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(s)

  def ns[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(ns)
}

trait TemporalAmountLongConversions extends Any with TemporalAmountConversions {
  protected def temporalAmount(temporalUnit: TemporalUnit): TemporalAmount

  def hr = temporalAmount(HOURS)

  def min = temporalAmount(MINUTES)

  def s = temporalAmount(SECONDS)

  def ns = temporalAmount(NANOS)

  def hr[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(hr)

  def min[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(min)

  def s[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(s)

  def ns[C](c: C)(implicit ev: Classifier[C]): ev.R = ev.convert(ns)
}

object TemporalAmountConversions {

  trait Classifier[C] {
    type R

    def convert(d: TemporalAmount): R
  }

}
