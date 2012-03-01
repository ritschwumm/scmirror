package scmirror

import org.specs2.mutable._

import scutil.Implicits._

class PropertiesTest extends Specification {
	// TODO add case classes
	
	"CaseObject properties" should {
		"inherit accessors from parents" in { 
			val clazz		= Class forName "scmirror.test.InheritingParamCaseObject$"
			val constructor	= Reflector constructor	clazz
			val accessors	= Reflector accessors	clazz
			constructor mustEqual Some(List())
			accessors mustEqual List("id")
		}
		
		"inherit accessors from parents" in { 
			val clazz		= Class forName "scmirror.test.InheritingFieldCaseObject$"
			val constructor	= Reflector constructor	clazz
			val accessors	= Reflector accessors	clazz
			constructor mustEqual Some(List())
			accessors mustEqual List("id")
		}
		
		"be allowed to have weird names" in {
			val clazz		= Class forName "scmirror.test.WeirdNameCaseClass"
			val constructor	= Reflector constructor	clazz
			val accessors	= Reflector accessors	clazz
			// println("### constructor=" + constructor)
			// println("### accessors=" + accessors)
			constructor	mustEqual Some(List("*"))
			accessors	mustEqual List("*")
		}
	}
}
