package es.uam.sara.tfg.dsl.generator

import javaRule.AttributeType
import javaRule.Initialize
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Attribute
import javaRule.NameOperation
import javaRule.NameType
import javaRule.IsGeneric
import javaRule.StringProperty

class AttributesSatisfy {

	private static final String TYPE = "MAttribute"

	def static CharSequence getPropertie(Attribute s, String sufix) {

		if (s instanceof NameOperation) {

			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix)

		} else if (s instanceof NameType) {

			return ComunSatisfy.nameType(s as NameType, TYPE, sufix)

		} else if (s instanceof JavaDoc) {

			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix)

		} else if (s instanceof Modifiers) {

			return ComunSatisfy.modifiers(s as Modifiers, TYPE, sufix)

		} else if (s instanceof Initialize) {
		
			return "Property<"+TYPE+"> p" + sufix + "= new Initialize("+s.no+");\n"	
		
		} else if (s instanceof AttributeType) {
			var a= s as AttributeType
			var cad=ComunSatisfy.getType(a.type, sufix);
			
			if (a.type instanceof StringProperty){
				var spa=a.type as StringProperty
				
				cad+=ComunSatisfy.propertyStringVariable(spa, sufix);
				cad+= "Property<"+TYPE+"> p" + sufix + "= new PropertyStringVariable<"+TYPE+",AttributeType>(" +a.no+",listV"+sufix+
				", listT"+sufix+", new AttributeType("+a.no+",type"+sufix+"));"
				return cad;
			}
			cad+="Property<"+TYPE+"> p" + sufix+"=new AttributeType("+a.no+",type"+sufix+");\n"
			return cad;
			
		} else if (s instanceof IsGeneric) {
			return ComunSatisfy.isGeneric(s as IsGeneric, TYPE, sufix)
		}
	}

}
