package es.uam.sara.tfg.dsl.generator

import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType
import javaRule.File
import javaRule.Tamanio

class FileSatisfy{
	
	private static final String TYPE = "File"

	def static CharSequence getPropertie(File s, String sufix){
		
		if (s instanceof NameOperation){
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix);
		}else if (s instanceof NameType){
			return ComunSatisfy.nameType(s as NameType, TYPE, sufix);
		}else if (s instanceof Empty){
			return ComunSatisfy.empty(s as Empty,TYPE, sufix);
		}else if (s instanceof Contains){
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		}else if(s instanceof Tamanio){
			return ComunSatisfy.size(s as Tamanio, TYPE, sufix)
		}
	}

}