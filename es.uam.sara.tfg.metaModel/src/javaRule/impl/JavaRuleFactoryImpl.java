/**
 */
package javaRule.impl;

import javaRule.AccessModifier;
import javaRule.And;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Contains;
import javaRule.ElementJava;
import javaRule.Filter;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.IsExtended;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.JavaRuleFactory;
import javaRule.JavaRulePackage;
import javaRule.Language;
import javaRule.Modifiers;
import javaRule.NameCheck;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Or;
import javaRule.Parameter;
import javaRule.Quantifier;
import javaRule.Return;
import javaRule.Rule;
import javaRule.RuleSet;
import javaRule.isImplemented;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaRuleFactoryImpl extends EFactoryImpl implements JavaRuleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaRuleFactory init() {
		try {
			JavaRuleFactory theJavaRuleFactory = (JavaRuleFactory)EPackage.Registry.INSTANCE.getEFactory(JavaRulePackage.eNS_URI);
			if (theJavaRuleFactory != null) {
				return theJavaRuleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaRuleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRuleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaRulePackage.RULE_SET: return createRuleSet();
			case JavaRulePackage.RULE: return createRule();
			case JavaRulePackage.OR: return createOr();
			case JavaRulePackage.AND: return createAnd();
			case JavaRulePackage.FILTER: return createFilter();
			case JavaRulePackage.IS_IMPLEMENTED: return createisImplemented();
			case JavaRulePackage.IS_INHERITOR: return createIsInheritor();
			case JavaRulePackage.IMPLEMENTS: return createImplements();
			case JavaRulePackage.IS_EXTENDED: return createIsExtended();
			case JavaRulePackage.PARAMETER: return createParameter();
			case JavaRulePackage.CONSTRUCTOR: return createConstructor();
			case JavaRulePackage.RETURN: return createReturn();
			case JavaRulePackage.ATTRIBUTE_TYPE: return createAttributeType();
			case JavaRulePackage.INITIALIZE: return createInitialize();
			case JavaRulePackage.NO_EMPTY: return createNoEmpty();
			case JavaRulePackage.NAME_OPERATION: return createNameOperation();
			case JavaRulePackage.NAME_TYPE: return createNameType();
			case JavaRulePackage.JAVA_DOC: return createJavaDoc();
			case JavaRulePackage.CONTAINS: return createContains();
			case JavaRulePackage.MODIFIERS: return createModifiers();
			case JavaRulePackage.BLEND_MODIFIERS: return createBlendModifiers();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JavaRulePackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case JavaRulePackage.ELEMENT_JAVA:
				return createElementJavaFromString(eDataType, initialValue);
			case JavaRulePackage.LANGUAGE:
				return createLanguageFromString(eDataType, initialValue);
			case JavaRulePackage.NAME_CHECK:
				return createNameCheckFromString(eDataType, initialValue);
			case JavaRulePackage.NAME_OPERATOR:
				return createNameOperatorFromString(eDataType, initialValue);
			case JavaRulePackage.ACCESS_MODIFIER:
				return createAccessModifierFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JavaRulePackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case JavaRulePackage.ELEMENT_JAVA:
				return convertElementJavaToString(eDataType, instanceValue);
			case JavaRulePackage.LANGUAGE:
				return convertLanguageToString(eDataType, instanceValue);
			case JavaRulePackage.NAME_CHECK:
				return convertNameCheckToString(eDataType, instanceValue);
			case JavaRulePackage.NAME_OPERATOR:
				return convertNameOperatorToString(eDataType, instanceValue);
			case JavaRulePackage.ACCESS_MODIFIER:
				return convertAccessModifierToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleSet createRuleSet() {
		RuleSetImpl ruleSet = new RuleSetImpl();
		return ruleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public And createAnd() {
		AndImpl and = new AndImpl();
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Filter createFilter() {
		FilterImpl filter = new FilterImpl();
		return filter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public isImplemented createisImplemented() {
		isImplementedImpl isImplemented = new isImplementedImpl();
		return isImplemented;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsInheritor createIsInheritor() {
		IsInheritorImpl isInheritor = new IsInheritorImpl();
		return isInheritor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Implements createImplements() {
		ImplementsImpl implements_ = new ImplementsImpl();
		return implements_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsExtended createIsExtended() {
		IsExtendedImpl isExtended = new IsExtendedImpl();
		return isExtended;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constructor createConstructor() {
		ConstructorImpl constructor = new ConstructorImpl();
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Initialize createInitialize() {
		InitializeImpl initialize = new InitializeImpl();
		return initialize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoEmpty createNoEmpty() {
		NoEmptyImpl noEmpty = new NoEmptyImpl();
		return noEmpty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameOperation createNameOperation() {
		NameOperationImpl nameOperation = new NameOperationImpl();
		return nameOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameType createNameType() {
		NameTypeImpl nameType = new NameTypeImpl();
		return nameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaDoc createJavaDoc() {
		JavaDocImpl javaDoc = new JavaDocImpl();
		return javaDoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contains createContains() {
		ContainsImpl contains = new ContainsImpl();
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modifiers createModifiers() {
		ModifiersImpl modifiers = new ModifiersImpl();
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlendModifiers createBlendModifiers() {
		BlendModifiersImpl blendModifiers = new BlendModifiersImpl();
		return blendModifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quantifier createQuantifierFromString(EDataType eDataType, String initialValue) {
		Quantifier result = Quantifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertQuantifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementJava createElementJavaFromString(EDataType eDataType, String initialValue) {
		ElementJava result = ElementJava.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertElementJavaToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Language createLanguageFromString(EDataType eDataType, String initialValue) {
		Language result = Language.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameCheck createNameCheckFromString(EDataType eDataType, String initialValue) {
		NameCheck result = NameCheck.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameCheckToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NameOperator createNameOperatorFromString(EDataType eDataType, String initialValue) {
		NameOperator result = NameOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessModifier createAccessModifierFromString(EDataType eDataType, String initialValue) {
		AccessModifier result = AccessModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccessModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRulePackage getJavaRulePackage() {
		return (JavaRulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaRulePackage getPackage() {
		return JavaRulePackage.eINSTANCE;
	}

} //JavaRuleFactoryImpl
