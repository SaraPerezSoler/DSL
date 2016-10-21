package es.uam.sara.tfg.dsl.generator

import javaRule.Constructor
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.NoEmpty
import javaRule.Parameter
import javaRule.Return
import javaRule.Method

class MethodsSatisfy {

	private static final String END = ");\n"
	private static final String PREFIX = "Meth"

	def static CharSequence getPropertie(Method s, String sufix) {

		var start = "and" + sufix + ".addPropertie (new "

		if (s instanceof Name) {

			return  ComunSatisfy.name(s as Name, PREFIX,start,END)

		} else if (s instanceof JavaDoc) {

			return start + ComunSatisfy.javaDoc(s as JavaDoc, PREFIX) + END;

		} else if (s instanceof Modifiers) {

			return   ComunSatisfy.modifiers(s as Modifiers, PREFIX, start, END) ;

		} else if (s instanceof NoEmpty) {

			return start + ComunSatisfy.noEmpty(s as NoEmpty, PREFIX) + END;

		} else if (s instanceof Constructor) {

			return start + "Constructor ()" + END;

		} else if (s instanceof Parameter) {

			var p = s as Parameter
			if (p.typesParam.isEmpty) {

				return start + "Parameters (" + p.numParam + ")" + END

			} else {

				var cadena = "List<String> param= new ArrayList<String>();\n"
				for (tp : p.typesParam) {
					cadena += "param.add(\"" + tp + "\");\n"
				}
				cadena += start + "Parameters (param)" + END
				return cadena;
			}

		} else if (s instanceof Return) {
			var r = s as Return
			return start + "Return (\"" + r.returnType + "\")" + END
		}
	}
}
