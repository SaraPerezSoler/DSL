package es.uam.sara.tfg.dsl.generator

import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.Implements
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType
import javaRule.IsGeneric
import javaRule.IsSubClass
import javaRule.IsSuperClass
import javaRule.Tamanio

class ClassesSatisfy {

	private static final String TYPE = "Class"

	def static CharSequence getPropertie(javaRule.Class s, String sufix) {

		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix);
		} else if (s instanceof Modifiers) {
			return ComunSatisfy.modifiers(s as Modifiers, TYPE,  sufix);
		} else if (s instanceof NameOperation) {
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE,  sufix);
		} else if (s instanceof NameType) {
			return ComunSatisfy.nameType(s as NameType, TYPE,  sufix);
		} else if (s instanceof Empty) {
			return ComunSatisfy.empty(s as Empty, TYPE,  sufix);
		} else if (s instanceof Implements) {

			
		} else if (s instanceof IsSubClass) {
	
		} else if (s instanceof IsSuperClass) {

		} else if(s instanceof Tamanio){
			return ComunSatisfy.size(s as Tamanio, TYPE, sufix)
		}else if (s instanceof Contains) {
			return ComunSatisfy.contains(s as Contains, TYPE,  sufix);
		}else if (s instanceof IsGeneric){
			return ComunSatisfy.isGeneric(s as IsGeneric, TYPE, sufix);
		}

		return null;
	}

}
