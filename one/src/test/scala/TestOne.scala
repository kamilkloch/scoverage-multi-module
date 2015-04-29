package One

import org.scalatest._

class TestOne extends FunSuite {

    test("testOneFooGreaterThanZero") {
	val one = new One(5)
	assert(one.foo == "Greater than zero")
    }
}