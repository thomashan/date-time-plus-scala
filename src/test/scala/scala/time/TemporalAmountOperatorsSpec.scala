package scala.time

import java.time.{Duration, LocalDateTime, Period}

import org.scalatest.{BeforeAndAfter, FunSpec}
import org.threeten.extra.PeriodDuration

class TemporalAmountOperatorsSpec extends FunSpec with BeforeAndAfter {
  val now = LocalDateTime.now

  describe("Temporal with PeriodDuration") {
    val periodDuration = 1.s + 1.year

    it("Temporal + PeriodDuration") {
      assert(now + periodDuration == now.plus(periodDuration))
    }

    it("Temporal - PeriodDuration") {
      assert(now - periodDuration == now.minus(periodDuration))
    }
  }

  describe("Temporal with Duration") {
    it("Temporal + Duration") {
      assert(now + 1.s == now.plusSeconds(1))
    }

    it("Temporal - Duration") {
      assert(now - 1.s == now.minusSeconds(1))
    }
  }

  describe("Temporal with Period") {
    it("Temporal + Period") {
      assert(now + 1.year == now.plusYears(1))
    }

    it("Temporal - Period") {
      assert(now - 1.year == now.minusYears(1))
    }
  }

  describe("Duration with Duration") {
    it("Duration + Duration") {
      assert(1.s + 1.s == Duration.ofSeconds(2))
    }

    it("Duration - Duration") {
      assert(1.s - 1.s == Duration.ZERO)
    }
  }

  describe("Period with Period") {
    it("Period + Period") {
      assert(1.year + 1.year == Period.ofYears(2))
    }

    it("Period - Period") {
      assert(1.year - 1.year == Period.ZERO)
    }
  }

  describe("Period with Duration") {
    it("Period + Duration") {
      assert(1.year + 1.s == PeriodDuration.of(Period.ofYears(1)).plus(PeriodDuration.of(Duration.ofSeconds(1))))
    }

    it("Period - Duration") {
      assert(1.year - 1.s == PeriodDuration.of(Period.ofYears(1)).minus(PeriodDuration.of(Duration.ofSeconds(1))))
    }
  }

  describe("Duration with Period") {
    it("Period + Period") {
      assert(1.s + 1.year == PeriodDuration.of(Duration.ofSeconds(1)).plus(PeriodDuration.of(Period.ofYears(1))))
    }

    it("Period -Period ") {
      assert(1.s - 1.year == PeriodDuration.of(Duration.ofSeconds(1)).minus(PeriodDuration.of(Period.ofYears(1))))
    }
  }
}
