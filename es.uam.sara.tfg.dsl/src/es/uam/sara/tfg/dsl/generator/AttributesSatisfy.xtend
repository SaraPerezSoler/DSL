package es.uam.sara.tfg.dsl.generator

import javaRule.AttributeType
import javaRule.Initialize
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.Satisfy

class AttributesSatisfy {

	private static final String END = ");\n"
	private static final String PREFIX = "Attr"

	def CharSequence getPropertieAttributes(Satisfy s, String sufix) {
		
		var start = "and" + sufix + ".addPropertie (new "

		if (s instanceof Name) {

			return start + ComunProperties.name(s as Name, PREFIX) + END

		} else if (s instanceof JavaDoc) {

			return start + ComunProperties.javaDoc(s as JavaDoc, PREFIX) + END

		} else if (s instanceof Modifiers) {

			return start + ComunProperties.modifiers(s as Modifiers, PREFIX) + END

		} else if (s instanceof Initialize) {
			
			return start + "Initialize(elements)" + END
			
		} else if (s instanceof AttributeType) {
			var at = s as AttributeType
			return start + "Type(elements, \"" + at.type + "\")" + END
		}
	}

}
