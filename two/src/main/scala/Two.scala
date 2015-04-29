package Two
import One.One

class Two(x: Int) extends One(x) {
    def bar(): Int = { 42 }
}
