package scmirror

import org.specs2.mutable._

import scutil.Implicits._

class TestScope {
	val test = {
		case class Foo(a:Int)
		case class Bar(a:Int)
		Pair(Foo(1),Bar(1)) 
	}
}

/*
class MethodScoped extends Specification {
	"MethodScoped" should {
		"have accessable properties" in {
			Reflector constructor (new TestScope().test._1.getClass) mustEqual Some(List("a"))
		}
	}
}
*/