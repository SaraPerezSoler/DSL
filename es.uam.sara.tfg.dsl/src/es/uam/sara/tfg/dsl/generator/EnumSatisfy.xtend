package es.uam.sara.tfg.dsl.generator

import javaRule.Enumeration
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType
import javaRule.Tamanio
import javaRule.Implements

class EnumSatisfy {
	private static final String TYPE = "Enumeration"

	def static CharSequence getPropertie(Enumeration s, String sufix) {
		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, TYPE, sufix);
		} else if (s instanceof Modifiers) {
			return ComunSatisfy.modifiers(s as Modifiers, TYPE, sufix);
		} else if (s instanceof NameOperation) {
			return ComunSatisfy.nameOperation(s as NameOperation, TYPE, sufix);
		} else if (s instanceof NameType) {
			return ComunSatisfy.nameType(s as NameType, TYPE, sufix);
		} else if (s instanceof Empty) {
			return ComunSatisfy.empty(s as Empty, TYPE, sufix);
		} else if (s instanceof Contains) {
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		} else if (s instanceof Tamanio) {
		} else if (s instanceof Implements) {
		}
	}
}
