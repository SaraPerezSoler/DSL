package es.uam.sara.tfg.dsl.generator

import javaRule.Name
import javaRule.NameOperator
import javaRule.NameType
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.BlendModifiers

class ComunProperties {
	
	private static int iMod=1; 
	def static CharSequence name(Name n, String prefix){
		var cadena="";
		if (n.type != NameType.NOTHING) {
				cadena += prefix +"NameType(elements, NameCheck.Type." + n.type +")" 
			}
			if (n.operator != NameOperator.NOTHING) {
				cadena += prefix + "NameOperation(elements,NameCheck.Operation." + n.operator +
						",\"" + n.name + "\", NameCheck." + n.language + ")"
			}
			return cadena;
	}
	
	def static CharSequence javaDoc(JavaDoc jd, String prefix){
		
		var cadena = prefix + "JavaDoc (elements," + jd.author + "," + jd.parameter + "," +
					jd.^return + "," + jd.version + "," + jd.throws + "," + jd.see +")";
		return cadena;
	}
	
	
	def static CharSequence modifiers (Modifiers m, String prefix){
		var cadena = "ModifiersCheck mc"+ iMod +"=new ModifiersCheck();\n"
			for (BlendModifiers b : m.blend) {
				cadena +=
					"mc"+ iMod +".addBlend(\"" + b.access + "\"," + b.static + "," + b.final + "," + b.abstract + "," +
						b.synchronized + ");\n"
			}
			cadena += prefix + "Modifiers (elements, mc"+ iMod +")"
			iMod++;
			return cadena;
	}
}