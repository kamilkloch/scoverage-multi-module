package Two

import One.One
import org.scalatest._

class TestTwo extends FunSuite {

    test("testTwoFooOther") {
		val two = new Two(-2)
		assert(two.bar == 43)
    }

}