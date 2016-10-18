package es.uam.sara.tfg.dsl.generator

import javaRule.AttributeType
import javaRule.Initialize
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.Attribute

class AttributesSatisfy {

	private static final String END = ");\n"
	private static final String PREFIX = "Attr"

	def static CharSequence getPropertie(Attribute s, String sufix) {
		
		var start = "and" + sufix + ".addPropertie (new "

		if (s instanceof Name) {

			return  ComunSatisfy.name(s as Name, PREFIX,start,END)  

		} else if (s instanceof JavaDoc) {

			return start + ComunSatisfy.javaDoc(s as JavaDoc, PREFIX) + END

		} else if (s instanceof Modifiers) {

			return  ComunSatisfy.modifiers(s as Modifiers, PREFIX,start,END) 

		} else if (s instanceof Initialize) {
			
			return start + "Initialize(elements)" + END
			
		} else if (s instanceof AttributeType) {
			var at = s as AttributeType
			return start + "Type(elements, \"" + at.type + "\")" + END
		}
	}

}
