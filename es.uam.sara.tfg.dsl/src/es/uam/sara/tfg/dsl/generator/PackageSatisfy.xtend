package es.uam.sara.tfg.dsl.generator

import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class PackageSatisfy{
	
	private static final String TYPE = "MPackage"

	def static CharSequence getPropertie(javaRule.Package s, String sufix){
		
		if (s instanceof NameOperation){
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix);
		}else if (s instanceof NameType){
			return ComunSatisfy.nameType(s as NameType, TYPE, sufix);
		}else if (s instanceof Empty){
			return ComunSatisfy.empty(s as Empty,TYPE, sufix);
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		}
	}

}