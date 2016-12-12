package es.uam.sara.tfg.dsl.generator

import javaRule.Constructor
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.Parameter
import javaRule.Return
import javaRule.Method
import javaRule.NameOperation
import javaRule.NameType
import javaRule.IsGeneric
import javaRule.Tamanio
import javaRule.TypeProperty
import javaRule.StringProperty

class MethodsSatisfy {

	private static final String TYPE = "MMethod"

	def static CharSequence getPropertie(Method s, String sufix) {

		if (s instanceof NameOperation) {

			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix)

		} else if (s instanceof NameType) {

			return ComunSatisfy.nameType(s as NameType, TYPE, sufix)

		} else if (s instanceof JavaDoc) {

			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix);

		} else if (s instanceof Modifiers) {

			return ComunSatisfy.modifiers(s as Modifiers, TYPE, sufix);

		} else if (s instanceof Empty) {

			return ComunSatisfy.empty(s as Empty, TYPE, sufix);

		} else if (s instanceof Constructor) {
			return "Property<" + TYPE + "> p" + sufix + "= new Constructor (" + s.no + ");\n"
			
		} else if (s instanceof Parameter) {
			
			var p = s as Parameter
			var min = p.min
			var max = p.max
			if (p.exact != -2147483647) {
				min = p.exact
				max = p.exact
			}
			var i = 1;
			var cad = "List <Type> types"+sufix+"=new ArrayList<Type>();\n"
			for (TypeProperty tp:p.types){
				cad+=ComunSatisfy.getType(tp, sufix+i)
				cad+="types"+sufix+".add(type"+sufix+i+");\n"
				i++;
			}
			cad+=ComunSatisfy.declaraVariable(sufix);
			for (TypeProperty tp: p.types){
				if (tp instanceof StringProperty){
					cad+=ComunSatisfy.añadeVariable((tp as StringProperty), sufix)
				}
			}
			
			cad+= "Property<"+TYPE+"> p" + sufix + "= new PropertyStringVariable<"+TYPE+",Parameters>(" +p.no+",listV"+sufix+
				", listT"+sufix+", new Parameters(" + s.no + ","+min+","+max+", types"+sufix+"));\n"
				
			return cad;

		} else if (s instanceof Return) {
			var r = s as Return;
			var cad = ComunSatisfy.getType(r.type, sufix)
			if (r.type instanceof StringProperty){
				var spa=r.type as StringProperty
				cad+=ComunSatisfy.propertyStringVariable(spa, sufix);
				cad+= "Property<"+TYPE+"> p" + sufix + "= new PropertyStringVariable<"+TYPE+",Return>(" +r.no+",listV"+sufix+
				", listT"+sufix+", new Return(" + r.no + ",type" + sufix + "));\n"
				return cad;
			}
			cad+="Property<"+TYPE+"> p" + sufix+"=new Return(" + r.no + ",type" + sufix + ");\n"
			return cad

		} else if (s instanceof Tamanio) {
			return ComunSatisfy.size(s as Tamanio, TYPE, sufix)
		} else if (s instanceof IsGeneric) {
			return ComunSatisfy.isGeneric(s as IsGeneric, TYPE, sufix);
		}
	}
}
