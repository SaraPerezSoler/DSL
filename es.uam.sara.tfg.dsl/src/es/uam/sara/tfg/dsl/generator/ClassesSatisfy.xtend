package es.uam.sara.tfg.dsl.generator

import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.NoEmpty
import javaRule.Implements
import javaRule.IsExtended
import javaRule.IsInheritor
import javaRule.Contains
import javaRule.NameOperation
import javaRule.NameType

class ClassesSatisfy {

	private static final String PREFIX = "Class"
	private static final String PROPERTY = "Properties<TypeDeclaration> p"

	def static CharSequence getPropertie(javaRule.Class s, String sufix) {

		if (s instanceof JavaDoc) {
			return ComunSatisfy.javaDoc(s as JavaDoc, PREFIX, sufix,PROPERTY);
		} else if (s instanceof Modifiers) {
			return ComunSatisfy.modifiers(s as Modifiers, PREFIX,  sufix,PROPERTY);
		} else if (s instanceof NameOperation) {
			return ComunSatisfy.nameOperation(s as NameOperation, PREFIX,  sufix,PROPERTY);
		} else if (s instanceof NameType) {
			return ComunSatisfy.nameType(s as NameType, PREFIX,  sufix,PROPERTY);
		} else if (s instanceof NoEmpty) {
			return ComunSatisfy.noEmpty(s as NoEmpty, PREFIX,  sufix,PROPERTY);
		} else if (s instanceof Implements) {
			var imp = s as Implements;
			return PROPERTY + sufix + "= new Implements(" + imp.minInterface + ", " + imp.maxInterface + ");";
		} else if (s instanceof IsExtended) {
			return PROPERTY + sufix + "= new isExtended(Visitors.getClasses());";
		} else if (s instanceof IsInheritor) {
			return PROPERTY + sufix + "= new IsInheritor();";
		} else if (s instanceof Contains) {
			return ComunSatisfy.contains(s as Contains, PREFIX,  sufix,PROPERTY);
		}

		return null;
	}

}
