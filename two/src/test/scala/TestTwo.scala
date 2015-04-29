package Two

import One.One
import org.scalatest._

class TestTwo extends FunSuite {

    test("testOneFooOther") {
	val one = new One(-2)
	assert(one.foo == "Other")
    }

    test("testTwoFooOther") {
	val two = new Two(-2)
	assert(two.foo == "Other")
    }

}