package scala.time

import java.time.{Duration, LocalDateTime, Period}

import org.scalatest.{BeforeAndAfter, FunSpec}

class TemporalAmountOperatorsSpec extends FunSpec with BeforeAndAfter {
  var now = LocalDateTime.now

  describe("TemporalAmountOperators") {
      it("+") {
        assert(1.year + now  == now.plusYears(1))
    }
  }
}
