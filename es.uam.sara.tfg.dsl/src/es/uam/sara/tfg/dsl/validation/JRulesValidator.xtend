/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.validation

import org.eclipse.xtext.validation.Check
import javaRule.Rule
import javaRule.ElementJava
import javaRule.Or
import javaRule.And
import javaRule.Satisfy
import javaRule.Interface
import javaRule.Enumeration
import javaRule.Method
import javaRule.JavaRulePackage
import javaRule.Name
import javaRule.NameOperator
import javaRule.JavaDoc
import javaRule.BlendModifiers
import javaRule.AccessModifier
import javaRule.Contains
import javaRule.Attribute
import javaRule.Language
import javaRule.RuleSet
import javaRule.Implements
import javaRule.Parameter

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class JRulesValidator extends AbstractJRulesValidator {

	public static val INVALID_SATISFY = 'invalidSatisfy'

//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					JRulesPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}

	@Check
	def checkSatisfyExists (Rule r){
	
		if ((r.eContainer instanceof RuleSet) && (r.satisfy==null)){
			error("\"Satisfy\" is required",
				JavaRulePackage.Literals.RULE__QUANTIFIER, "invalidRule")
		}
		if ((r.satisfy==null) && (r.filter!=null)){
			error("\"Satisfy\" is required after clause \"which\"", 
				JavaRulePackage.Literals.RULE__FILTER, "invalidRule")
		}
	}
	@Check
	def checkFilterValido(Rule r) {
		if (comprobarPropiedades(r.filter.filter, r.element)==false) {
			error("The filter is not valid for " + r.element.literal.toLowerCase,
				JavaRulePackage.Literals.RULE__ELEMENT, INVALID_SATISFY);
		}
	}

	@Check
	def checkSatisfyType(Rule r){
		if (comprobarPropiedades(r.satisfy, r.element)==false) {
			error(
				"The property is not valid for " + r.element.literal.toLowerCase,
				JavaRulePackage.Literals.RULE__ELEMENT,
				INVALID_SATISFY
			)
		}
	}
	def comprobarPropiedades(Or or, ElementJava e) {
		for (And a : or.op) {
			for (Satisfy s : a.op) {
				if (comprobarSatisfy(e, s)==false) {
					return false;
				}
			}
		}
		return true;
	}
	def comprobarSatisfy(ElementJava e, Satisfy s){
		if ((e==ElementJava.PACKAGE) &&(s instanceof javaRule.Package)){
			return true;
		}else if ((e==ElementJava.INTERFACE) && (s instanceof Interface)){
			return true;
		}else if ((e==ElementJava.CLASS) && (s instanceof javaRule.Class)){
			return true;
		}else if ((e==ElementJava.ENUM) && (s instanceof Enumeration)){
			return true;
		}else if ((e==ElementJava.METHOD) && (s instanceof Method)){
			return true;
		}else if ((e==ElementJava.ATTRIBUTE) && (s instanceof Attribute)){
			return true;
		}else{
			return false;
		}
		
	}
	@Check
	def checkNameLanguage(Name n) {
		if (n.operator == NameOperator.LIKE && n.language == Language.EMPTY) {
			error(
				"Language must be define for Like operator",
				JavaRulePackage.Literals.NAME__OPERATOR,
				"invalidLanguage"
			)
		}
		if (n.operator != NameOperator.LIKE && n.language != Language.EMPTY) {
			error(
				"Language is only for Like operator",
				JavaRulePackage.Literals.NAME__LANGUAGE,
				"invalidLanguage"
			)
		}
	}

	@Check
	def checkJavaDoc(JavaDoc jd) {
		var rule=getRule(jd);
		if (rule.element != ElementJava.METHOD && jd.parameter) {
				warning("The tag @parameter is used for methods", JavaRulePackage.Literals.JAVA_DOC__PARAMETER,
					'inadvisableJavaDoc')
		}
		if (rule.element != ElementJava.METHOD && jd.^return) {
			warning("The tag @return is used for methods", JavaRulePackage.Literals.JAVA_DOC__RETURN,
				'inadvisableJavaDoc')
		}
		if (rule.element != ElementJava.METHOD && jd.throws) {
			warning("The tag @throws is used for methods", JavaRulePackage.Literals.JAVA_DOC__THROWS,
				'inadvisableJavaDoc')
		}
	}

	def getRule(JavaDoc jd){
		var aux1 = jd.eContainer.eContainer.eContainer;
		var aux2 = jd.eContainer.eContainer.eContainer.eContainer;
		if (aux1 instanceof Rule) {
			var rule=aux1 as Rule
			return rule;
		}else if(aux2 instanceof Rule){
			var rule=aux2 as Rule
			return rule;
		}
	}
	
	def getRule(BlendModifiers b){
		var aux1 = b.eContainer.eContainer.eContainer.eContainer;
		var aux2 = b.eContainer.eContainer.eContainer.eContainer.eContainer;
		if (aux1 instanceof Rule) {
			var rule=aux1 as Rule
			//println("Dentro de Satisfy "+ rule.quantifier+" "+rule.element)
			return rule;
		}else if(aux2 instanceof Rule){
			var rule=aux2 as Rule
			//println("Dentro de filter "+ rule.quantifier+" "+rule.element)
			return rule;
		}
	}
	@Check
	def checkModifiers(BlendModifiers b) {
		
		var r=getRule(b);
		if (accessPrivateProtecte(b)) {
			if (r.element == ElementJava.CLASS || r.element == ElementJava.INTERFACE || r.element == ElementJava.ENUM) {
				warning("The private and protected modifiers are for classes, interfaces and enumeration internal",
					JavaRulePackage.Literals.BLEND_MODIFIERS__ACCESS,'inadvisableModifier')
			}
		}
		if (b.abstract) {
			if (r.element == ElementJava.INTERFACE) {
				warning("The interfaces are implicitly abstract, its not necessary add the modifier",
					JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT,'inadvisableModifier')
			}else if (r.element != ElementJava.CLASS && r.element != ElementJava.METHOD){
				error("Abstract is for methods and class", 
					JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT, 'invalidModifier')
			}else if (b.final) {
				error("Methods and Class can't be abstract and final simultaneously",
					JavaRulePackage.Literals.BLEND_MODIFIERS__ABSTRACT, 'invalidModifier')
			}
		}
		
		if (b.final){
			if (r.element==ElementJava.INTERFACE || r.element==ElementJava.ENUM){
				error("Final is for methods, class and attributes", 
					JavaRulePackage.Literals.BLEND_MODIFIERS__FINAL, 'invalidModifier')
			}
		}
		
		if (b.static) {
			if (r.element == ElementJava.CLASS || r.element == ElementJava.INTERFACE || r.element == ElementJava.ENUM) {
				warning("Static is for classes, interfaces and enumeration internal",
					JavaRulePackage.Literals.BLEND_MODIFIERS__ACCESS, 'inadvisableModifier')
			}
		}
		if (b.synchronized && r.element!=ElementJava.METHOD){
			error("Synchronized is for methods", 
					JavaRulePackage.Literals.BLEND_MODIFIERS__SYNCHRONIZED, 'invalidModifier')
		}

	}
	
	def accessPrivateProtecte(BlendModifiers b) {
		if (b.access == AccessModifier.PRIVATE || b.access == AccessModifier.PROTECTED) {
			return true;
		}
		return false;
	}
	
	@Check
	def checkContains (Contains c){
		var r=getRule(c);
		if (r.element==ElementJava.PACKAGE){
			if (c.which.element==ElementJava.METHOD || c.which.element==ElementJava.ATTRIBUTE 
				|| c.which.element==ElementJava.PACKAGE){
					error("Package contains Class, Interfaces or Enumerations", 
						JavaRulePackage.Literals.CONTAINS__WHICH, "invalidContains")
				}
		}
	} 
	def getRule(Contains c){
		var aux1 = c.eContainer.eContainer.eContainer;
		var aux2 = c.eContainer.eContainer.eContainer.eContainer;
		if (aux1 instanceof Rule) {
			var rule=aux1 as Rule
			//println("Dentro de Satisfy "+ rule.quantifier+" "+rule.element)
			return rule;
		}else if(aux2 instanceof Rule){
			var rule=aux2 as Rule
			//println("Dentro de filter "+ rule.quantifier+" "+rule.element)
			return rule;
		}
	}

	@Check
	def checkImplements (Implements i){
		if (i.minInterface<0){
			error("The minimum of interfaces must be greater than 0",
				JavaRulePackage.Literals.IMPLEMENTS__MIN_INTERFACE, 'invalidMin')
		}
		if (i.maxInterface<0){
			error("The maximum of interfaces must be greater than 0",
				JavaRulePackage.Literals.IMPLEMENTS__MAX_INTERFACE, 'invalidMin')
		}
	
		if (i.minInterface>i.maxInterface){
			error("The minimum of interfaces can't be greater than the maximum",
				JavaRulePackage.Literals.IMPLEMENTS__MIN_INTERFACE, 'invalidMin')
		}
	}
	
	@Check
	def checkParameters(Parameter p){
		if (p.typesParam.length!=0){
			if (p.typesParam.length!= p.numParam){
				error("The number of parameters should be equal to the number of types",
				JavaRulePackage.Literals.PARAMETER__NUM_PARAM, 'invalidMin')
			}
		}
	}
	
	

}
