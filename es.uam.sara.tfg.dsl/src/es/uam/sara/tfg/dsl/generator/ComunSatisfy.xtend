package es.uam.sara.tfg.dsl.generator

import javaRule.NameType
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.BlendModifiers
import javaRule.NoEmpty
import javaRule.Contains
import javaRule.NameOperation

class ComunSatisfy {

	def static CharSequence nameOperation(NameOperation n, String prefix, String sufix, String property) {

		return property + sufix + "= new "+prefix+"NameOperation(NameCheck.Operation." + n.operator + ",\"" + n.name +
			"\", NameCheck." + n.language + ");"
	}

	def static CharSequence nameType(NameType n, String prefix, String sufix, String property) {
		return property + sufix + "= new "+prefix+"NameType(NameCheck.Type." + n.type + ");"
	}

	def static CharSequence javaDoc(JavaDoc jd, String prefix, String sufix, String property) {

		return property + sufix + "= new "+prefix+"JavaDoc (" + jd.author + "," + jd.parameter + "," + jd.^return + "," +
			jd.version + "," + jd.throws + "," + jd.see + ");";

	}

	def static CharSequence modifiers(Modifiers m, String prefix, String sufix, String property) {
		
		var cadena = "ModifiersCheck mc" + sufix + "=new ModifiersCheck();\n"
		for (BlendModifiers b : m.blend) {
			cadena +=
				"mc" + sufix + ".addBlend(\"" + b.access + "\"," + b.static + "," + b.final + "," + b.abstract + "," +
					b.synchronized + ");\n"
		}
		cadena += property + sufix + "= new "+prefix+"Modifiers (mc" + sufix + ");" 
		return cadena;
	}

	def static CharSequence noEmpty(NoEmpty ne, String prefix, String sufix, String property) {
		return property + sufix + "= new "+prefix+"NoEmpty ();"
	}

	def static CharSequence contains(Contains c, String prefix, String sufix, String property) {
		var cadena = JRulesGenerator.genetateRule(c.which, sufix);
		cadena +=property + sufix + "= new "+prefix+"Contain" + JRulesGenerator.getAnalize(c.which.element).toFirstUpper + "(r" + sufix + ");";
		return cadena;
	}
}
