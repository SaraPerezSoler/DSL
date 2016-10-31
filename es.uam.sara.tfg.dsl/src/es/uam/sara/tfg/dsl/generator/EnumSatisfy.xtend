package es.uam.sara.tfg.dsl.generator

import javaRule.Enumeration
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class EnumSatisfy {
	private static final String PREFIX = "Enum"
	private static final String PROPERTY="Properties<EnumDeclaration> p"
	
	def static CharSequence getPropertie(Enumeration s, String sufix){
		if (s instanceof JavaDoc){
			return ComunSatisfy.javaDoc(s as JavaDoc, PREFIX, sufix,PROPERTY);
		}else if (s instanceof Modifiers){
			return  ComunSatisfy.modifiers(s as Modifiers, PREFIX,sufix,PROPERTY);
		}else if (s instanceof NameOperation){
			return  ComunSatisfy.nameOperation(s as NameOperation, PREFIX,sufix,PROPERTY);
		}else if (s instanceof NameType){
			return  ComunSatisfy.nameType(s as NameType, PREFIX,sufix,PROPERTY);
		}else if (s instanceof Empty){
			return ComunSatisfy.empty(s as Empty, PREFIX, sufix,PROPERTY);
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, PREFIX, sufix,PROPERTY);
		}
	}
}
