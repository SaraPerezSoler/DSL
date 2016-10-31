package es.uam.sara.tfg.dsl.generator

import javaRule.Empty
import javaRule.Satisfy
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class PackageSatisfy{
	
	private static final String PREFIX = "Pack"
	private static final String PROPERTY="Properties<String> p"

	def static CharSequence getPropertie(Satisfy s, String sufix){
		
		if (s instanceof NameOperation){
			return ComunSatisfy.nameOperation(s as NameOperation, PREFIX, sufix,PROPERTY);
		}else if (s instanceof NameType){
			return ComunSatisfy.nameType(s as NameType, PREFIX, sufix,PROPERTY);
		}else if (s instanceof Empty){
			return ComunSatisfy.empty(s as Empty, PREFIX, sufix,PROPERTY);
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, PREFIX, sufix,PROPERTY);
		}
	}

}