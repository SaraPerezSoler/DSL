package es.uam.sara.tfg.dsl.generator

import javaRule.Constructor
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.NoEmpty
import javaRule.Parameter
import javaRule.Return
import javaRule.Method
import javaRule.NameOperation
import javaRule.NameType

class MethodsSatisfy {

	private static final String PREFIX = "Meth"
	private static final String PROPERTY = "Properties<MethodDeclaration> p"

	def static CharSequence getPropertie(Method s, String sufix) {

		if (s instanceof NameOperation) {

			return ComunSatisfy.nameOperation(s as NameOperation, PREFIX,  sufix,PROPERTY)

		} else if (s instanceof NameType) {

			return ComunSatisfy.nameType(s as NameType, PREFIX,  sufix,PROPERTY)

		} else if (s instanceof JavaDoc) {

			return ComunSatisfy.javaDoc(s as JavaDoc, PREFIX,  sufix,PROPERTY);

		} else if (s instanceof Modifiers) {

			return ComunSatisfy.modifiers(s as Modifiers, PREFIX,  sufix,PROPERTY);

		} else if (s instanceof NoEmpty) {

			return ComunSatisfy.noEmpty(s as NoEmpty, PREFIX,  sufix,PROPERTY);

		} else if (s instanceof Constructor) {

			return PROPERTY + sufix + "= new Constructor ();";

		} else if (s instanceof Parameter) {

			var p = s as Parameter
			if (p.typesParam.isEmpty) {

				return PROPERTY + sufix + "= new Parameters (" + p.numParam + ");"

			} else {

				var cadena = "List<String> param" + sufix + "= new ArrayList<String>();\n"
				for (tp : p.typesParam) {
					cadena += "param" + sufix + ".add(\"" + tp + "\");\n"
				}
				cadena += PROPERTY + sufix + "= new Parameters (param" + sufix + ");"
				return cadena;
			}

		} else if (s instanceof Return) {
			var r = s as Return
			return PROPERTY + sufix + "= new Return (\"" + r.returnType + "\");"
		}
	}
}
