package es.uam.sara.tfg.dsl.generator

import javaRule.NameType
import javaRule.JavaDoc
import javaRule.Modifiers
import javaRule.BlendModifiers
import javaRule.Empty
import javaRule.Contains
import javaRule.NameOperation
import javaRule.IsGeneric
import javaRule.StringValue
import javaRule.StringVariable
import javaRule.Element
import javaRule.TypeProperty
import javaRule.TypePrimitive
import javaRule.IsCollectionType
import javaRule.IsPrimitiveFuntion
import javaRule.Tamanio
import javaRule.StringProperty

class ComunSatisfy {

	def static CharSequence nameOperation(NameOperation n, String type, String sufix) {
		
			var cad=propertyStringVariable(n.name, sufix)
			cad+= "Property<"+type+"> p" + sufix + "= new PropertyStringVariable<"+type+",NameOperation<"+type+">>(" +n.no+",listV"+sufix+
				", listT"+sufix+", new NameOperation<"+type+">("+n.no+",NameOperation.Operation." + n.operator + ", NameOperation." + n.language + "));"
			return cad;
	}
	
	

	def static CharSequence nameType(NameType n, String type, String sufix) {
		return "Property<"+type+"> p" + sufix + "= new NameType<"+type+">(NameType.Type." + n.type + ");\n"
	}

	def static CharSequence javaDoc(JavaDoc jd, String type, String sufix) {

		return "Property<"+type+"> p" + sufix + "= new JavaDoc <"+type+"> ("+jd.no + jd.author + "," + jd.parameter + "," + jd.^return +
			"," + jd.version + "," + jd.throws + "," + jd.see + ");\n";

	}

	def static CharSequence modifiers(Modifiers m, String type, String sufix) {
		
		var cadena = "Property<"+type+"> p" + sufix + "= new Modifiers<"+type+"> (" + m.no + ")\n"
			for (BlendModifiers b : m.blend) {
			cadena +=
			".addBlend(BlendModifiers.Acceso." + b.access.toString.toUpperCase + "," + b.static + "," + b.final + "," + b.abstract + "," +b.^default+ "," +
					b.synchronized + ")\n"
		}
		cadena+=";\n"
		return cadena;
	}

	def static CharSequence empty(Empty ne, String type, String sufix) {
		return "Property<"+type+"> p" + sufix + "= new Empty<"+type+"> (" + ne.no + ");\n"
	}

	def static CharSequence contains(Contains c, String type, String sufix) {
		var cadena = JRulesGenerator.genetateRule(c.rule, sufix);
		cadena +=
			"Property<"+type+"> p" + sufix + "= new Contain" +JRulesGenerator.getType(c.rule.element)+"<"+type+">" + "(r" + sufix + ");\n";
		return cadena;
	}

	def static CharSequence isGeneric(IsGeneric g, String type, String sufix) {
		return "Property<"+type+"> p" + sufix + "= new IsGeneric<"+type+">("+g.no+");\n"
	}
	
	def static CharSequence size(Tamanio t, String type, String sufix) {
		var min=t.min
		var max=t.max
		if (t.exact!=-2147483647){
			min=t.exact
			max=t.exact
		}
		return "Property<"+type+"> p" + sufix + "= new Size<"+type+">("+min+","+max+");\n"
	}
	
	def static propertyStringVariable(StringProperty property, String string) {
			return declaraVariable(string)+añadeVariable(property, string)
	}
	def static String declaraVariable(String sufix){
		var cad="List<String> listV"+sufix+"= new ArrayList<String>();\n"
		+"List<StringType> listT"+sufix+"= new ArrayList<StringType>();\n"
			return cad;
	}
	def static String añadeVariable(StringProperty stp, String sufix){
			var cad=""
			if (stp instanceof StringVariable) {
				var stv= stp as StringVariable
				var varName = ""
				if (stv.variable.subtype == Element.NULL) {
					varName = stv.variable.variable.name
				} else {
					varName = stv.variable.variable.name + JRulesGenerator.getType(stv.variable.subtype)
				}
				cad = "listV" + sufix + ".add(\"" + varName +"\");\n"
				cad += " listT" + sufix + ".add(StringType." + stv.strings.toString.toUpperCase + ");\n"
		}
			return cad;
	}

	
	def static String getType(TypeProperty tp, String sufix){
		var cad="";
		if (tp==null){
			cad="TypeString type"+sufix+"=null;\n"
		}
		if (tp instanceof StringProperty){
				if (tp instanceof StringVariable){
					cad="TypeString type"+sufix+"= new TypeString();\n"				
				}else{
					cad="TypeString type"+sufix+"= new TypeString(\""+(tp as StringValue).value+"\");\n"
				}
			}else if (tp instanceof TypePrimitive){
				var tpr=tp as TypePrimitive
				cad="TypePrimitive type"+sufix+"= new TypePrimitive(TypePrimitive.Primitive."+tpr.typePrimitive+");\n"
			}else if (tp instanceof IsCollectionType){
				var ict=tp as IsCollectionType
				if (ict.of!=null){
					cad=getType(ict.of, sufix+"1")
					cad+="TypeIsCollection type"+sufix+"= new TypeIsCollection(type"+sufix+"1, Main.actual);\n"
				}else{
					cad+="TypeIsCollection type"+sufix+"= new TypeIsCollection(Main.actual);\n"
				}
				
			}else if (tp instanceof IsPrimitiveFuntion){
				cad="TypeIsPrimitive type"+sufix+"= new TypeIsPrimitive();\n"
			}
			return cad
	}
	
}
