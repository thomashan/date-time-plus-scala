package scala.time

import java.time.{Duration, Period}

import org.scalatest.FunSpec

class TemporalAmountConversionsSpec extends FunSpec {
  describe("TemporalAmountConversions") {
    describe("year") {
      it("convert year") {
        assert(1.year == Period.ofYears(1))
      }
    }

    describe("month") {
      it("convert month") {
        assert(1.month == Period.ofMonths(1))
      }
    }

    describe("day") {
      it("convert day") {
        assert(1.day == Period.ofDays(1))
      }
    }

    describe("hr") {
      it("convert hr") {
        assert(1.hr == Duration.ofHours(1))
      }
    }

    describe("min") {
      it("convert min") {
        assert(1.min == Duration.ofMinutes(1))
      }
    }

    describe("s") {
      it("convert s") {
        assert(1.s == Duration.ofSeconds(1))
      }
    }

    describe("ns") {
      it("convert ns") {
        assert(1.ns == Duration.ofNanos(1))
      }
    }
  }
}
