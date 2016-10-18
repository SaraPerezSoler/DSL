package es.uam.sara.tfg.dsl.generator

import javaRule.Interface
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.NoEmpty
import javaRule.isImplemented

class InterfaceSatisfy {
	private static final String END = ");\n"
	private static final String PREFIX = "Inter"

	def static CharSequence getPropertie(Interface s, String sufix) {
		var start = "and" + sufix + ".addPropertie (new ";
		if (s instanceof JavaDoc) {
			return start + ComunSatisfy.javaDoc(s as JavaDoc, PREFIX) + END;
		} else if (s instanceof Modifiers) {
			return  ComunSatisfy.modifiers(s as Modifiers, PREFIX, start, END);
		} else if (s instanceof Name) {
			return  ComunSatisfy.name(s as Name, PREFIX, start, END) ;
		} else if (s instanceof NoEmpty) {
			return start + ComunSatisfy.noEmpty(s as NoEmpty, PREFIX) + END;
		} else if (s instanceof isImplemented) {
			return start + "IsImplemented(elements, es.uam.sara.tfg.ast.Visitors.getTypes())" + END;
		}
	}
	
	
}
