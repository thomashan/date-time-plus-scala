package scala.time

import java.time.{Duration, Period}

import org.scalatest.FunSpec

class TemporalAmountConversionsSpec extends FunSpec {
  describe("TemporalAmountConversions") {
    describe("year") {
      it("convert year") {
        assert(1.year == Period.ofYears(1))
      }

      it("convert years") {
        assert(1.years == Period.ofYears(1))
      }
    }

    describe("month") {
      it("convert month") {
        assert(1.month == Period.ofMonths(1))
      }

      it("convert months") {
        assert(1.months == Period.ofMonths(1))
      }
    }

    describe("day") {
      it("convert day") {
        assert(1.day == Period.ofDays(1))
      }

      it("convert days") {
        assert(1.days == Period.ofDays(1))
      }
    }

    describe("hour") {
      it("convert hour") {
        assert(1.hour == Duration.ofHours(1))
      }

      it("convert hours") {
        assert(1.hour == Duration.ofHours(1))
      }

      it("convert hr") {
        assert(1.hr == Duration.ofHours(1))
      }

      it("convert hrs") {
        assert(1.hrs == Duration.ofHours(1))
      }

      it("convert h") {
        assert(1.hrs == Duration.ofHours(1))
      }
    }

    describe("minute") {
      it("convert minute") {
        assert(1.minute == Duration.ofMinutes(1))
      }

      it("convert minutes") {
        assert(1.minutes == Duration.ofMinutes(1))
      }

      it("convert mins") {
        assert(1.mins == Duration.ofMinutes(1))
      }

      it("convert m") {
        assert(1.m == Duration.ofMinutes(1))
      }
    }

    describe("second") {
      it("convert second") {
        assert(1.second == Duration.ofSeconds(1))
      }

      it("convert seconds") {
        assert(1.seconds == Duration.ofSeconds(1))
      }

      it("convert sec") {
        assert(1.sec == Duration.ofSeconds(1))
      }

      it("convert secs") {
        assert(1.secs == Duration.ofSeconds(1))
      }

      it("convert s") {
        assert(1.s == Duration.ofSeconds(1))
      }
    }

    describe("millisecond") {
      it("convert millisecond") {
        assert(1.millisecond == Duration.ofMillis(1))
      }

      it("convert milliseconds") {
        assert(1.milliseconds == Duration.ofMillis(1))
      }

      it("convert milli") {
        assert(1.milli == Duration.ofMillis(1))
      }

      it("convert millis") {
        assert(1.millis == Duration.ofMillis(1))
      }

      it("convert ms") {
        assert(1.ms == Duration.ofMillis(1))
      }
    }

    describe("microsecond") {
      it("convert microsecond") {
        assert(1.microsecond == Duration.ofNanos(1000))
      }

      it("convert microseconds") {
        assert(1.microseconds == Duration.ofNanos(1000))
      }

      it("convert micro") {
        assert(1.micro == Duration.ofNanos(1000))
      }

      it("convert micros") {
        assert(1.micros == Duration.ofNanos(1000))
      }

      it("convert us") {
        assert(1.us == Duration.ofNanos(1000))
      }
    }

    describe("nanosecond") {
      it("convert nanosecond") {
        assert(1.nanosecond == Duration.ofNanos(1))
      }

      it("convert nanoseconds") {
        assert(1.nanoseconds == Duration.ofNanos(1))
      }

      it("convert nano") {
        assert(1.nano == Duration.ofNanos(1))
      }

      it("convert nanos") {
        assert(1.nanos == Duration.ofNanos(1))
      }

      it("convert ns") {
        assert(1.ns == Duration.ofNanos(1))
      }
    }
  }
}
