package es.uam.sara.tfg.dsl.generator

import javaRule.Name
import javaRule.NoEmpty
import javaRule.Satisfy

class PackageSatisfy{
	
	private static final String END = ");\n"
	private static final String PREFIX = "Pack"

	def static CharSequence getPropertie(Satisfy s, String sufix){
		var start = "and" + sufix + ".addPropertie (new ";
		
		if (s instanceof Name){
			return ComunSatisfy.name(s as Name, PREFIX, start, END);
		}else if (s instanceof NoEmpty){
			return start + ComunSatisfy.noEmpty(s as NoEmpty, PREFIX) + END;
		}
	}

}