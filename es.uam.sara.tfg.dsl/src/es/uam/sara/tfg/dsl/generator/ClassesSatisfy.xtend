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
import javaRule.StringProperty

class ClassesSatisfy {

	private static final String TYPE = "MClass"

	def static CharSequence getPropertie(javaRule.Class s, String sufix) {

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
		} else if (s instanceof Implements) {

			var p = s as Implements
			var min = p.valores.min
			var max = p.valores.max
			var i = 1;
			var cad = "List <TypeString> types" + sufix + "=new ArrayList<TypeString>();\n"
			for (StringProperty tp : p.valores.types) {
				cad += ComunSatisfy.getType(tp, sufix + i)
				cad += "types" + sufix + ".add(type" + sufix + i + ");\n"
				i++;
			}
			cad += ComunSatisfy.declaraVariable(sufix);
			for (StringProperty tp : p.valores.types) {
				cad+=ComunSatisfy.añadeVariable(tp , sufix)

			}

			cad +=
				"Property<" + TYPE + "> p" + sufix + "= new PropertyStringVariable<" + TYPE + ",Implements>(" + p.no +
					",listV" + sufix + ", listT" + sufix + ", new Implements(" + s.no + "," + min + "," + max +
					", types" + sufix + "));\n"
			return cad;
		} else if (s instanceof IsSubClass) {
			var p = s as IsSubClass
			var cad = ComunSatisfy.getType(p.of, sufix)
			cad += ComunSatisfy.propertyStringVariable(p.of, sufix)
			cad +=
				"Property<" + TYPE + "> p" + sufix + "= new PropertyStringVariable<" + TYPE + ",IsSubClass>(" + p.no +
					",listV" + sufix + ", listT" + sufix + ", new IsSubClass(" + s.no + ",type" + sufix + "));\n"

			return cad
		} else if (s instanceof IsSuperClass) {

			var p = s as IsSuperClass
			var min = p.valores.min
			var max = p.valores.max
			var i = 1;
			var cad = "List <TypeString> types" + sufix + "=new ArrayList<TypeString>();\n"
			for (StringProperty tp : p.valores.types) {
				cad += ComunSatisfy.getType(tp, sufix + i)
				cad += "types" + sufix + ".add(type" + sufix + i + ");\n"
				i++;
			}
			cad += ComunSatisfy.declaraVariable(sufix);
			for (StringProperty tp : p.valores.types) {
					cad+=ComunSatisfy.añadeVariable(tp, sufix)
			}

			cad +=
				"Property<" + TYPE + "> p" + sufix + "= new PropertyStringVariable<" + TYPE + ",IsSuperClass>(" +
					p.no + ",listV" + sufix + ", listT" + sufix + ", new IsSuperClass(" + s.no +
					",visitors.getClasses()," + min + "," + max + ", types" + sufix + "));\n"

			return cad;
		} else if (s instanceof Tamanio) {
			return ComunSatisfy.size(s as Tamanio, TYPE, sufix)
		} else if (s instanceof Contains) {
			return ComunSatisfy.contains(s as Contains, TYPE, sufix);
		} else if (s instanceof IsGeneric) {
			return ComunSatisfy.isGeneric(s as IsGeneric, TYPE, sufix);
		}

		return null;
	}

}
