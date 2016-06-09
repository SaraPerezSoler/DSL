/**
 */
package javaRule.impl;

import javaRule.AccessModifier;
import javaRule.Action;
import javaRule.And;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Conteins;
import javaRule.Element;
import javaRule.ElementJava;
import javaRule.HaveConstant;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.IsExtended;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.JavaRuleFactory;
import javaRule.JavaRulePackage;
import javaRule.Modifiers;
import javaRule.Name;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.NoEmpty;
import javaRule.Or;
import javaRule.Parametre;
import javaRule.Quantifier;
import javaRule.Return;
import javaRule.Rule;
import javaRule.RuleSet;
import javaRule.Testing;
import javaRule.Variable;

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
			case JavaRulePackage.TESTING: return createTesting();
			case JavaRulePackage.AND: return createAnd();
			case JavaRulePackage.OR: return createOr();
			case JavaRulePackage.ELEMENT: return createElement();
			case JavaRulePackage.IS_INHERITOR: return createIsInheritor();
			case JavaRulePackage.IMPLEMENTS: return createImplements();
			case JavaRulePackage.IS_EXTENDED: return createIsExtended();
			case JavaRulePackage.HAVE_CONSTANT: return createHaveConstant();
			case JavaRulePackage.VARIABLE: return createVariable();
			case JavaRulePackage.PARAMETRE: return createParametre();
			case JavaRulePackage.CONSTRUCTOR: return createConstructor();
			case JavaRulePackage.RETURN: return createReturn();
			case JavaRulePackage.ATTRIBUTE_TYPE: return createAttributeType();
			case JavaRulePackage.INITIALIZE: return createInitialize();
			case JavaRulePackage.NO_EMPTY: return createNoEmpty();
			case JavaRulePackage.NAME: return createName();
			case JavaRulePackage.JAVA_DOC: return createJavaDoc();
			case JavaRulePackage.CONTEINS: return createConteins();
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
			case JavaRulePackage.ACTION:
				return createActionFromString(eDataType, initialValue);
			case JavaRulePackage.QUANTIFIER:
				return createQuantifierFromString(eDataType, initialValue);
			case JavaRulePackage.ELEMENT_JAVA:
				return createElementJavaFromString(eDataType, initialValue);
			case JavaRulePackage.NAME_TYPE:
				return createNameTypeFromString(eDataType, initialValue);
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
			case JavaRulePackage.ACTION:
				return convertActionToString(eDataType, instanceValue);
			case JavaRulePackage.QUANTIFIER:
				return convertQuantifierToString(eDataType, instanceValue);
			case JavaRulePackage.ELEMENT_JAVA:
				return convertElementJavaToString(eDataType, instanceValue);
			case JavaRulePackage.NAME_TYPE:
				return convertNameTypeToString(eDataType, instanceValue);
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
	public Testing createTesting() {
		TestingImpl testing = new TestingImpl();
		return testing;
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
	public Or createOr() {
		OrImpl or = new OrImpl();
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
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
	public HaveConstant createHaveConstant() {
		HaveConstantImpl haveConstant = new HaveConstantImpl();
		return haveConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parametre createParametre() {
		ParametreImpl parametre = new ParametreImpl();
		return parametre;
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
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
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
	public Conteins createConteins() {
		ConteinsImpl conteins = new ConteinsImpl();
		return conteins;
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
	public Action createActionFromString(EDataType eDataType, String initialValue) {
		Action result = Action.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public NameType createNameTypeFromString(EDataType eDataType, String initialValue) {
		NameType result = NameType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNameTypeToString(EDataType eDataType, Object instanceValue) {
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
