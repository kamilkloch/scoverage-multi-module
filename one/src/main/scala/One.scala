package One

class One(x: Int) {

    def foo(): String = x match {
	case a: Int if a > 0 => "Greater than zero"
	case _ => "Other"
    }
}