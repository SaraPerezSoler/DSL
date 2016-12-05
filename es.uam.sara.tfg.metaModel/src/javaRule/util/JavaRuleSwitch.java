/**
 */
package javaRule.util;

import javaRule.And;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Enumeration;
import javaRule.Extends;
import javaRule.File;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.Interface;
import javaRule.IsCollectionType;
import javaRule.IsGeneric;
import javaRule.IsPrimitiveFuntion;
import javaRule.IsSubClass;
import javaRule.IsSuperClass;
import javaRule.IsSuperInterface;
import javaRule.JavaDoc;
import javaRule.JavaRulePackage;
import javaRule.Method;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Or;
import javaRule.Parameter;
import javaRule.PrimaryOp;
import javaRule.Property;
import javaRule.PropertyLiteral;
import javaRule.RangoNames;
import javaRule.Return;
import javaRule.Rule;
import javaRule.RuleSet;
import javaRule.Sentence;
import javaRule.StringProperty;
import javaRule.StringValue;
import javaRule.StringVariable;
import javaRule.Tamanio;
import javaRule.TypePrimitive;
import javaRule.TypeProperty;
import javaRule.TypeString;
import javaRule.Variable;
import javaRule.VariableSubtype;
import javaRule.isImplemented;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see javaRule.JavaRulePackage
 * @generated
 */
public class JavaRuleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaRulePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRuleSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaRulePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaRulePackage.RULE_SET: {
				RuleSet ruleSet = (RuleSet)theEObject;
				T result = caseRuleSet(ruleSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.SENTENCE: {
				Sentence sentence = (Sentence)theEObject;
				T result = caseSentence(sentence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseSentence(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseSentence(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.OR: {
				Or or = (Or)theEObject;
				T result = caseOr(or);
				if (result == null) result = casePrimaryOp(or);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.AND: {
				And and = (And)theEObject;
				T result = caseAnd(and);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.PRIMARY_OP: {
				PrimaryOp primaryOp = (PrimaryOp)theEObject;
				T result = casePrimaryOp(primaryOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.PROPERTY_LITERAL: {
				PropertyLiteral propertyLiteral = (PropertyLiteral)theEObject;
				T result = casePropertyLiteral(propertyLiteral);
				if (result == null) result = casePrimaryOp(propertyLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.FILE: {
				File file = (File)theEObject;
				T result = caseFile(file);
				if (result == null) result = caseProperty(file);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.PACKAGE: {
				javaRule.Package package_ = (javaRule.Package)theEObject;
				T result = casePackage(package_);
				if (result == null) result = caseProperty(package_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = caseProperty(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.CLASS: {
				javaRule.Class class_ = (javaRule.Class)theEObject;
				T result = caseClass(class_);
				if (result == null) result = caseProperty(class_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.ENUMERATION: {
				Enumeration enumeration = (Enumeration)theEObject;
				T result = caseEnumeration(enumeration);
				if (result == null) result = caseProperty(enumeration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.METHOD: {
				Method method = (Method)theEObject;
				T result = caseMethod(method);
				if (result == null) result = caseProperty(method);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.ATTRIBUTE: {
				Attribute attribute = (Attribute)theEObject;
				T result = caseAttribute(attribute);
				if (result == null) result = caseProperty(attribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_IMPLEMENTED: {
				isImplemented isImplemented = (isImplemented)theEObject;
				T result = caseisImplemented(isImplemented);
				if (result == null) result = caseInterface(isImplemented);
				if (result == null) result = caseProperty(isImplemented);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_SUPER_INTERFACE: {
				IsSuperInterface isSuperInterface = (IsSuperInterface)theEObject;
				T result = caseIsSuperInterface(isSuperInterface);
				if (result == null) result = caseInterface(isSuperInterface);
				if (result == null) result = caseProperty(isSuperInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_SUPER_CLASS: {
				IsSuperClass isSuperClass = (IsSuperClass)theEObject;
				T result = caseIsSuperClass(isSuperClass);
				if (result == null) result = caseClass(isSuperClass);
				if (result == null) result = caseProperty(isSuperClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_SUB_CLASS: {
				IsSubClass isSubClass = (IsSubClass)theEObject;
				T result = caseIsSubClass(isSubClass);
				if (result == null) result = caseClass(isSubClass);
				if (result == null) result = caseProperty(isSubClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IMPLEMENTS: {
				Implements implements_ = (Implements)theEObject;
				T result = caseImplements(implements_);
				if (result == null) result = caseClass(implements_);
				if (result == null) result = caseEnumeration(implements_);
				if (result == null) result = caseProperty(implements_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.EXTENDS: {
				Extends extends_ = (Extends)theEObject;
				T result = caseExtends(extends_);
				if (result == null) result = caseInterface(extends_);
				if (result == null) result = caseProperty(extends_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.RANGO_NAMES: {
				RangoNames rangoNames = (RangoNames)theEObject;
				T result = caseRangoNames(rangoNames);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.TAMANIO: {
				Tamanio tamanio = (Tamanio)theEObject;
				T result = caseTamanio(tamanio);
				if (result == null) result = caseMethod(tamanio);
				if (result == null) result = caseClass(tamanio);
				if (result == null) result = caseFile(tamanio);
				if (result == null) result = caseInterface(tamanio);
				if (result == null) result = caseEnumeration(tamanio);
				if (result == null) result = caseProperty(tamanio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseMethod(parameter);
				if (result == null) result = caseProperty(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.CONSTRUCTOR: {
				Constructor constructor = (Constructor)theEObject;
				T result = caseConstructor(constructor);
				if (result == null) result = caseMethod(constructor);
				if (result == null) result = caseProperty(constructor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseMethod(return_);
				if (result == null) result = caseProperty(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.ATTRIBUTE_TYPE: {
				AttributeType attributeType = (AttributeType)theEObject;
				T result = caseAttributeType(attributeType);
				if (result == null) result = caseAttribute(attributeType);
				if (result == null) result = caseProperty(attributeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.INITIALIZE: {
				Initialize initialize = (Initialize)theEObject;
				T result = caseInitialize(initialize);
				if (result == null) result = caseAttribute(initialize);
				if (result == null) result = caseProperty(initialize);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.EMPTY: {
				Empty empty = (Empty)theEObject;
				T result = caseEmpty(empty);
				if (result == null) result = casePackage(empty);
				if (result == null) result = caseMethod(empty);
				if (result == null) result = caseClass(empty);
				if (result == null) result = caseInterface(empty);
				if (result == null) result = caseEnumeration(empty);
				if (result == null) result = caseFile(empty);
				if (result == null) result = caseProperty(empty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_GENERIC: {
				IsGeneric isGeneric = (IsGeneric)theEObject;
				T result = caseIsGeneric(isGeneric);
				if (result == null) result = caseClass(isGeneric);
				if (result == null) result = caseInterface(isGeneric);
				if (result == null) result = caseMethod(isGeneric);
				if (result == null) result = caseAttribute(isGeneric);
				if (result == null) result = caseProperty(isGeneric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.NAME_OPERATION: {
				NameOperation nameOperation = (NameOperation)theEObject;
				T result = caseNameOperation(nameOperation);
				if (result == null) result = caseAttribute(nameOperation);
				if (result == null) result = caseClass(nameOperation);
				if (result == null) result = caseMethod(nameOperation);
				if (result == null) result = casePackage(nameOperation);
				if (result == null) result = caseInterface(nameOperation);
				if (result == null) result = caseEnumeration(nameOperation);
				if (result == null) result = caseFile(nameOperation);
				if (result == null) result = caseProperty(nameOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.STRING_PROPERTY: {
				StringProperty stringProperty = (StringProperty)theEObject;
				T result = caseStringProperty(stringProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.STRING_VARIABLE: {
				StringVariable stringVariable = (StringVariable)theEObject;
				T result = caseStringVariable(stringVariable);
				if (result == null) result = caseStringProperty(stringVariable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.VARIABLE_SUBTYPE: {
				VariableSubtype variableSubtype = (VariableSubtype)theEObject;
				T result = caseVariableSubtype(variableSubtype);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseStringProperty(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.NAME_TYPE: {
				NameType nameType = (NameType)theEObject;
				T result = caseNameType(nameType);
				if (result == null) result = caseAttribute(nameType);
				if (result == null) result = caseClass(nameType);
				if (result == null) result = caseMethod(nameType);
				if (result == null) result = casePackage(nameType);
				if (result == null) result = caseInterface(nameType);
				if (result == null) result = caseEnumeration(nameType);
				if (result == null) result = caseFile(nameType);
				if (result == null) result = caseProperty(nameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.CONTAINS: {
				Contains contains = (Contains)theEObject;
				T result = caseContains(contains);
				if (result == null) result = caseClass(contains);
				if (result == null) result = caseEnumeration(contains);
				if (result == null) result = caseFile(contains);
				if (result == null) result = caseInterface(contains);
				if (result == null) result = casePackage(contains);
				if (result == null) result = caseProperty(contains);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.JAVA_DOC: {
				JavaDoc javaDoc = (JavaDoc)theEObject;
				T result = caseJavaDoc(javaDoc);
				if (result == null) result = caseAttribute(javaDoc);
				if (result == null) result = caseClass(javaDoc);
				if (result == null) result = caseMethod(javaDoc);
				if (result == null) result = caseInterface(javaDoc);
				if (result == null) result = caseEnumeration(javaDoc);
				if (result == null) result = caseProperty(javaDoc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.MODIFIERS: {
				Modifiers modifiers = (Modifiers)theEObject;
				T result = caseModifiers(modifiers);
				if (result == null) result = caseAttribute(modifiers);
				if (result == null) result = caseClass(modifiers);
				if (result == null) result = caseMethod(modifiers);
				if (result == null) result = caseEnumeration(modifiers);
				if (result == null) result = caseInterface(modifiers);
				if (result == null) result = caseProperty(modifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.BLEND_MODIFIERS: {
				BlendModifiers blendModifiers = (BlendModifiers)theEObject;
				T result = caseBlendModifiers(blendModifiers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.TYPE_PROPERTY: {
				TypeProperty typeProperty = (TypeProperty)theEObject;
				T result = caseTypeProperty(typeProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.TYPE_STRING: {
				TypeString typeString = (TypeString)theEObject;
				T result = caseTypeString(typeString);
				if (result == null) result = caseTypeProperty(typeString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.TYPE_PRIMITIVE: {
				TypePrimitive typePrimitive = (TypePrimitive)theEObject;
				T result = caseTypePrimitive(typePrimitive);
				if (result == null) result = caseTypeProperty(typePrimitive);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_PRIMITIVE_FUNTION: {
				IsPrimitiveFuntion isPrimitiveFuntion = (IsPrimitiveFuntion)theEObject;
				T result = caseIsPrimitiveFuntion(isPrimitiveFuntion);
				if (result == null) result = caseTypeProperty(isPrimitiveFuntion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaRulePackage.IS_COLLECTION_TYPE: {
				IsCollectionType isCollectionType = (IsCollectionType)theEObject;
				T result = caseIsCollectionType(isCollectionType);
				if (result == null) result = caseTypeProperty(isCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRuleSet(RuleSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sentence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSentence(Sentence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Or</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOr(Or object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>And</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>And</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnd(And object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primary Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primary Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimaryOp(PrimaryOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyLiteral(PropertyLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFile(File object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(javaRule.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(javaRule.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumeration(Enumeration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethod(Method object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttribute(Attribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>is Implemented</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>is Implemented</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseisImplemented(isImplemented object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Super Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Super Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSuperInterface(IsSuperInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Super Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Super Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSuperClass(IsSuperClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Sub Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Sub Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsSubClass(IsSubClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Implements</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImplements(Implements object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extends</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtends(Extends object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rango Names</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rango Names</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRangoNames(RangoNames object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tamanio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tamanio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTamanio(Tamanio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstructor(Constructor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeType(AttributeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Initialize</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Initialize</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialize(Initialize object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Empty</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmpty(Empty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Generic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Generic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsGeneric(IsGeneric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameOperation(NameOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringProperty(StringProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringVariable(StringVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Subtype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Subtype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSubtype(VariableSubtype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringValue(StringValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNameType(NameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContains(Contains object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Java Doc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Doc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJavaDoc(JavaDoc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModifiers(Modifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blend Modifiers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blend Modifiers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlendModifiers(BlendModifiers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeProperty(TypeProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeString(TypeString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Primitive</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Primitive</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypePrimitive(TypePrimitive object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Primitive Funtion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Primitive Funtion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsPrimitiveFuntion(IsPrimitiveFuntion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Is Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Is Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIsCollectionType(IsCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JavaRuleSwitch
