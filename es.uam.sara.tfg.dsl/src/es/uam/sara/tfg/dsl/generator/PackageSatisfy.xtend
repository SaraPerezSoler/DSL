package es.uam.sara.tfg.dsl.generator

import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class PackageSatisfy{
	
	private static final String TYPE = "Package"
	private static final String PROPERTY="Properties<Package> p"

	def static CharSequence getPropertie(javaRule.Package s, String sufix){
		
		if (s instanceof NameOperation){
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix,PROPERTY);
		}else if (s instanceof NameType){
			return ComunSatisfy.nameType(s as NameType, TYPE, sufix,PROPERTY);
		}else if (s instanceof Empty){
			return ComunSatisfy.empty(s as Empty,TYPE, sufix,PROPERTY);
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, TYPE, sufix,PROPERTY);
		}
	}

}