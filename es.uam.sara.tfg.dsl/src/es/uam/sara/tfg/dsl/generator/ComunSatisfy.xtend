package es.uam.sara.tfg.dsl.generator

import javaRule.NameType
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.BlendModifiers
import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.IsGeneric

class ComunSatisfy {

	def static CharSequence nameOperation(NameOperation n, String type, String sufix, String property) {

		return property + sufix + "= new NameOperation<"+type+">(NameCheck.Operation." + n.operator + ",\"" +
			n.name + "\", NameCheck." + n.language + ");"
	}

	def static CharSequence nameType(NameType n, String prefix, String sufix, String property) {
		return property + sufix + "= new " + prefix + "NameType(NameCheck.Type." + n.type + ");"
	}

	def static CharSequence javaDoc(JavaDoc jd, String type, String sufix, String property) {

		return property + sufix + "= new JavaDoc <"+type+"> ("+jd.no + jd.author + "," + jd.parameter + "," + jd.^return +
			"," + jd.version + "," + jd.throws + "," + jd.see + ");";

	}

	def static CharSequence modifiers(Modifiers m, String type, String sufix, String property) {
		
		var cadena = property + sufix + "= new Modifiers<"+type+"> (" + m.no + ")\n"
			for (BlendModifiers b : m.blend) {
			cadena +=
			".addBlend(\"" + b.access + "\"," + b.static + "," + b.final + "," + b.abstract + "," +
					b.synchronized + ")\n"
		}
		cadena+=";\n"
		return cadena;
	}

	def static CharSequence empty(Empty ne, String type, String sufix, String property) {
		return property + sufix + "= new Empty<"+type+"> (" + ne.no + ");"
	}

	def static CharSequence contains(Contains c, String prefix, String sufix, String property) {
		var cadena = JRulesGenerator.genetateRule(c.rule, sufix);
		cadena +=
			property + sufix + "= new " + prefix + "Contain" +
				JRulesGenerator.getAnalize(c.which.element).toFirstUpper + "(r" + sufix + ");";
		return cadena;
	}

	def static CharSequence isGeneric(IsGeneric g, String prefix, String sufix, String property) {
		return property + sufix + "= new " + prefix + "IsGeneric();\n"
	}
}
