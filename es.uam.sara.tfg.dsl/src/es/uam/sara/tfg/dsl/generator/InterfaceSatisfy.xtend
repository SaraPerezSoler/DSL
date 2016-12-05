package es.uam.sara.tfg.dsl.generator

import javaRule.Interface
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.isImplemented
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType
import javaRule.IsGeneric
import javaRule.IsSuperInterface
import javaRule.Extends
import javaRule.Tamanio

class InterfaceSatisfy {
	private static final String TYPE = "Interface"


	def static CharSequence getPropertie(Interface s, String sufix) {

		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix);
		} else if (s instanceof Modifiers) {
			return  ComunSatisfy.modifiers(s as Modifiers, TYPE, sufix);
		} else if (s instanceof NameOperation) {
			return  ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix);
		} else if (s instanceof NameType) {
			return  ComunSatisfy.nameType(s as NameType, TYPE, sufix);
		}else if (s instanceof Empty) {
			return ComunSatisfy.empty(s as Empty, TYPE, sufix);
		} else if (s instanceof isImplemented) {
			return "Properties<"+TYPE+"> p" + sufix + "= new IsImplemented(es.uam.sara.tfg.ast.Visitors.getTypes());";
		}else if(s instanceof IsSuperInterface){
			
		}else if(s instanceof Extends){
			
		}else if(s instanceof IsGeneric){
			
		}else if(s instanceof Tamanio){
		
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		}
	}
	
	
}
