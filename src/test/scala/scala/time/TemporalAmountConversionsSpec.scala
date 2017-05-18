package scala.time

import java.time.{Duration, Period}

import org.scalatest.FunSpec

class TemporalAmountConversionsSpec extends FunSpec {
  describe("TemporalAmountConversions") {
    it("convert year") {
      assert(1.year == Period.ofYears(1))
    }

    it("convert month") {
      assert(1.month == Period.ofMonths(1))
    }

    it("convert day") {
      assert(1.day == Period.ofDays(1))
    }

    it("convert hour") {
      assert(1.hour == Duration.ofHours(1))
    }

    it("convert minute") {
      assert(1.minute == Duration.ofMinutes(1))
    }

    it("convert s") {
      assert(1.s == Duration.ofSeconds(1))
    }

    it("convert ns") {
      assert(1.ns == Duration.ofNanos(1))
    }
  }
}
