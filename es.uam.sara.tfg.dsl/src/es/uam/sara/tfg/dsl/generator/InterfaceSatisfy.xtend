package es.uam.sara.tfg.dsl.generator

import javaRule.Interface
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.NoEmpty
import javaRule.isImplemented
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class InterfaceSatisfy {
	private static final String PREFIX = "Inter"
		private static final String PROPERTY="Properties<TypeDeclaration> p"

	def static CharSequence getPropertie(Interface s, String sufix) {

		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, PREFIX, sufix,PROPERTY);
		} else if (s instanceof Modifiers) {
			return  ComunSatisfy.modifiers(s as Modifiers, PREFIX, sufix,PROPERTY);
		} else if (s instanceof NameOperation) {
			return  ComunSatisfy.nameOperation(s as NameOperation, PREFIX, sufix,PROPERTY);
		} else if (s instanceof NameType) {
			return  ComunSatisfy.nameType(s as NameType, PREFIX, sufix,PROPERTY);
		}else if (s instanceof NoEmpty) {
			return ComunSatisfy.noEmpty(s as NoEmpty, PREFIX, sufix,PROPERTY);
		} else if (s instanceof isImplemented) {
			return PROPERTY + sufix + "= new IsImplemented(es.uam.sara.tfg.ast.Visitors.getTypes());";
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, PREFIX, sufix,PROPERTY);
		}
	}
	
	
}
