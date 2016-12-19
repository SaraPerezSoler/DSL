package es.uam.sara.tfg.dsl.generator

import javaRule.Enumeration
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType
import javaRule.Tamanio
import javaRule.Implements
import javaRule.StringProperty

class EnumSatisfy {
	private static final String TYPE = "MEnumeration"

	def static CharSequence getPropertie(Enumeration s, String sufix) {
		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix);
		} else if (s instanceof Modifiers) {
			return ComunSatisfy.modifiers(s as Modifiers, TYPE, sufix);
		} else if (s instanceof NameOperation) {
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix);
		} else if (s instanceof NameType) {
			return ComunSatisfy.nameType(s as NameType, TYPE, sufix);
		} else if (s instanceof Empty) {
			return ComunSatisfy.empty(s as Empty, TYPE, sufix);
		} else if (s instanceof Contains) {
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		} else if (s instanceof Tamanio) {
			return ComunSatisfy.size(s as Tamanio, TYPE, sufix)
		} else if (s instanceof Implements) {
			
			var p = s as Implements
			var min = p.valores.min
			var max = p.valores.max
			var i = 1;
			var cad = "List <TypeString> types"+sufix+"=new ArrayList<TypeString>();\n"
			for (StringProperty tp:p.valores.types){
				cad+=ComunSatisfy.getType(tp, sufix+i)
				cad+="types"+sufix+".add(type"+sufix+i+");\n"
				i++;
			}
			cad+=ComunSatisfy.declaraVariable(sufix);
			for (StringProperty tp: p.valores.types){
				cad+=ComunSatisfy.añadeVariable(tp , sufix)
				
			}
			
			cad+= "Property<"+TYPE+"> p" + sufix + "= new PropertyStringVariable<"+TYPE+",Implements<"+TYPE+">>(" +p.no+",listV"+sufix+
				", listT"+sufix+", new Implements<"+TYPE+">(" + s.no + ","+min+","+max+", types"+sufix+"));\n"
				return cad;
		}
	}
}
