package scala.time

import java.time.{Duration, LocalDateTime, Period}

import org.scalatest.{BeforeAndAfter, FunSpec}

class TemporalAmountOperatorsSpec extends FunSpec with BeforeAndAfter {
  var now = LocalDateTime.now

  describe("TemporalAmountOperators") {
    it("+") {
      assert(1.year + now == now.plusYears(1))
    }
  }

  describe("TemporalOperators") {
    it("+") {
      assert(now + 1.year == now.plusYears(1))
    }

    it("-") {
      assert(now - 1.year == now.minusYears(1))
    }
  }

  describe("DurationOperators") {
    it("+") {
      assert(1.s + 1.s == Duration.ofSeconds(2))
    }

    it("-") {
      assert(1.s - 1.s == Duration.ZERO)
    }
  }

  describe("PeriodOperators") {
    it("+") {
      assert(1.year + 1.year == Period.ofYears(2))
    }

    it("-") {
      assert(1.year - 1.year == Period.ZERO)
    }
  }
}
