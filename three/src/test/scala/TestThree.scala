package Three

import Two.Two
import org.scalatest._

class TestThree extends FunSuite {

    test("testTwoFooOther") {
	val two = new Two(-2)
	assert(two.foo == "Other")
    }
}