package es.uam.sara.tfg.dsl.generator

import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.NoEmpty
import javaRule.Implements
import javaRule.IsExtended
import javaRule.IsInheritor

class ClassesSatisfy {
	private static final String END = ");\n"
	private static final String PREFIX = "Class"

	def static CharSequence getPropertie(javaRule.Class s, String sufix) {

		var start = "and" + sufix + ".addPropertie (new "
		if (s instanceof JavaDoc) {
			return start + ComunSatisfy.javaDoc(s as JavaDoc, PREFIX) + END;
		} else if (s instanceof Modifiers) {
			return  ComunSatisfy.modifiers(s as Modifiers, PREFIX,start,END);
		} else if (s instanceof Name) {
			return  ComunSatisfy.name(s as Name, PREFIX,start,END) ;
		} else if (s instanceof NoEmpty) {
			return start + ComunSatisfy.noEmpty(s as NoEmpty, PREFIX) + END;
		} else if (s instanceof Implements) {
			var imp = s as Implements;
			return start + "Implements(" + imp.minInterface + ", " + imp.maxInterface + ")" + END;
		} else if (s instanceof IsExtended) {
			return start + "isExtended(Visitors.getClasses())" + END;
		} else if (s instanceof IsInheritor) {
			return start + "IsInheritor()" + END;
		}

		return null;
	}

}
