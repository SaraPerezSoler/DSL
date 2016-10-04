package es.uam.sara.tfg.dsl.generator

import javaRule.BlendModifiers
import javaRule.Constructor
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Name
import javaRule.NameOperator
import javaRule.NameType
import javaRule.NoEmpty
import javaRule.Parameter
import javaRule.Return
import javaRule.Satisfy

class MethodsSatisfy {
	def CharSequence getPropertieMethod(Satisfy s,String cad, int i) {
		var cadena = "";
		var start="and" + cad + i + ".addPropertie (new "
		var end="));\n"
		if (s instanceof Name) {
			var n = s as Name
			if (n.type != NameType.NOTHING) {
				cadena += start + "MethNameType(elements, NameCheck.Type." + n.type + end
			}
			if (n.operator != NameOperator.NOTHING) {
				cadena += start + "MethNameOperation(elements,NameCheck.Operation." + n.operator +
						",\"" + s.name + "\", NameCheck." + s.language + end
			}
		} else if (s instanceof JavaDoc) {
			var jd = s as JavaDoc
			cadena += start + "MethJavaDoc (elements," + jd.author + "," + jd.parameter + "," +
					jd.^return + "," + jd.version + "," + jd.throws + "," + jd.see + end
		} else if (s instanceof Modifiers) {
			var m = s as Modifiers
			cadena += "ModifiersCheck mc=new ModifiersCheck();\n"
			for (BlendModifiers b : m.blend) {
				cadena +=
					"mc.addBlend(\"" + b.access + "\"," + b.static + "," + b.final + "," + b.abstract + "," +
						b.synchronized + ");\n"
			}
			cadena += start + "MethModifiers (elements, mc" + end
		} else if (s instanceof NoEmpty) {
			cadena += start + "MethoNoEmty (elements" + end
		} else if (s instanceof Constructor) {
			cadena += start + "Constructor (elements" + end
		} else if (s instanceof Parameter) {
			var p = s as Parameter
			if (p.typesParam.isEmpty) {
				cadena += start + "Parameters (elements," + p.numParam + end
			} else {
				cadena += "List<String> param= new ArrayList<String>();\n"
				for (tp : p.typesParam) {
					cadena += "param.add(\""+tp+"\");\n"
				}
				cadena += start + "Parameters (elements, param" + end
			}
		} else if (s instanceof Return) {
			var r = s as Return
			cadena += start + "Return (elements,\"" + r.returnType + "\"" + end
		}
		return cadena;
	}
}