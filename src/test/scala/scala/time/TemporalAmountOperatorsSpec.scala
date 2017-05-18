package scala.time

import java.time.LocalDateTime

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
}
