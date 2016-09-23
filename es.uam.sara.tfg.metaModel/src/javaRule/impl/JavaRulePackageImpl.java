/**
 */
package javaRule.impl;

import javaRule.AccessModifier;
import javaRule.And;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Conteins;
import javaRule.ElementJava;
import javaRule.Enumeration;
import javaRule.Filter;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.Interface;
import javaRule.IsExtended;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.JavaRuleFactory;
import javaRule.JavaRulePackage;
import javaRule.Language;
import javaRule.Method;
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
import javaRule.Satisfy;
import javaRule.isImplented;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaRulePackageImpl extends EPackageImpl implements JavaRulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass andEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isImplentedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isInheritorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implementsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isExtendedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parametreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constructorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initializeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noEmptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaDocEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conteinsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blendModifiersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum quantifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementJavaEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum languageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nameOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accessModifierEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see javaRule.JavaRulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaRulePackageImpl() {
		super(eNS_URI, JavaRuleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link JavaRulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaRulePackage init() {
		if (isInited) return (JavaRulePackage)EPackage.Registry.INSTANCE.getEPackage(JavaRulePackage.eNS_URI);

		// Obtain or create and register package
		JavaRulePackageImpl theJavaRulePackage = (JavaRulePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof JavaRulePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new JavaRulePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theJavaRulePackage.createPackageContents();

		// Initialize created meta-data
		theJavaRulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaRulePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaRulePackage.eNS_URI, theJavaRulePackage);
		return theJavaRulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleSet() {
		return ruleSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRuleSet_ProjectName() {
		return (EAttribute)ruleSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleSet_Rules() {
		return (EReference)ruleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_No() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Quantifier() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Element() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Filter() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRule_Satisfy() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOr() {
		return orEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOr_Op() {
		return (EReference)orEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnd() {
		return andEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAnd_Op() {
		return (EReference)andEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilter_Filter() {
		return (EReference)filterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilter_No() {
		return (EAttribute)filterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfy() {
		return satisfyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getisImplented() {
		return isImplentedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsInheritor() {
		return isInheritorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplements() {
		return implementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplements_MaxInterface() {
		return (EAttribute)implementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImplements_MinInterface() {
		return (EAttribute)implementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsExtended() {
		return isExtendedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethod() {
		return methodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParametre() {
		return parametreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametre_NumParam() {
		return (EAttribute)parametreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParametre_TypesParam() {
		return (EAttribute)parametreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstructor() {
		return constructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReturn_ReturnType() {
		return (EAttribute)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Type() {
		return (EAttribute)attributeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialize() {
		return initializeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoEmpty() {
		return noEmptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getName_() {
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Type() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Name() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Operator() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getName_Language() {
		return (EAttribute)nameEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJavaDoc() {
		return javaDocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_Author() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_Parametre() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_Return() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_Version() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_Throws() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJavaDoc_See() {
		return (EAttribute)javaDocEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConteins() {
		return conteinsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConteins_Which() {
		return (EReference)conteinsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifiers() {
		return modifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModifiers_Blend() {
		return (EReference)modifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlendModifiers() {
		return blendModifiersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Access() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Static() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Final() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Abstract() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Synchronized() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getQuantifier() {
		return quantifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementJava() {
		return elementJavaEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLanguage() {
		return languageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameType() {
		return nameTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNameOperator() {
		return nameOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccessModifier() {
		return accessModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRuleFactory getJavaRuleFactory() {
		return (JavaRuleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		ruleSetEClass = createEClass(RULE_SET);
		createEAttribute(ruleSetEClass, RULE_SET__PROJECT_NAME);
		createEReference(ruleSetEClass, RULE_SET__RULES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NO);
		createEAttribute(ruleEClass, RULE__QUANTIFIER);
		createEAttribute(ruleEClass, RULE__ELEMENT);
		createEReference(ruleEClass, RULE__FILTER);
		createEReference(ruleEClass, RULE__SATISFY);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OP);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OP);

		filterEClass = createEClass(FILTER);
		createEReference(filterEClass, FILTER__FILTER);
		createEAttribute(filterEClass, FILTER__NO);

		satisfyEClass = createEClass(SATISFY);

		packageEClass = createEClass(PACKAGE);

		interfaceEClass = createEClass(INTERFACE);

		isImplentedEClass = createEClass(IS_IMPLENTED);

		enumerationEClass = createEClass(ENUMERATION);

		classEClass = createEClass(CLASS);

		isInheritorEClass = createEClass(IS_INHERITOR);

		implementsEClass = createEClass(IMPLEMENTS);
		createEAttribute(implementsEClass, IMPLEMENTS__MAX_INTERFACE);
		createEAttribute(implementsEClass, IMPLEMENTS__MIN_INTERFACE);

		isExtendedEClass = createEClass(IS_EXTENDED);

		methodEClass = createEClass(METHOD);

		parametreEClass = createEClass(PARAMETRE);
		createEAttribute(parametreEClass, PARAMETRE__NUM_PARAM);
		createEAttribute(parametreEClass, PARAMETRE__TYPES_PARAM);

		constructorEClass = createEClass(CONSTRUCTOR);

		returnEClass = createEClass(RETURN);
		createEAttribute(returnEClass, RETURN__RETURN_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEAttribute(attributeTypeEClass, ATTRIBUTE_TYPE__TYPE);

		initializeEClass = createEClass(INITIALIZE);

		noEmptyEClass = createEClass(NO_EMPTY);

		nameEClass = createEClass(NAME);
		createEAttribute(nameEClass, NAME__TYPE);
		createEAttribute(nameEClass, NAME__NAME);
		createEAttribute(nameEClass, NAME__OPERATOR);
		createEAttribute(nameEClass, NAME__LANGUAGE);

		javaDocEClass = createEClass(JAVA_DOC);
		createEAttribute(javaDocEClass, JAVA_DOC__AUTHOR);
		createEAttribute(javaDocEClass, JAVA_DOC__PARAMETRE);
		createEAttribute(javaDocEClass, JAVA_DOC__RETURN);
		createEAttribute(javaDocEClass, JAVA_DOC__VERSION);
		createEAttribute(javaDocEClass, JAVA_DOC__THROWS);
		createEAttribute(javaDocEClass, JAVA_DOC__SEE);

		conteinsEClass = createEClass(CONTEINS);
		createEReference(conteinsEClass, CONTEINS__WHICH);

		modifiersEClass = createEClass(MODIFIERS);
		createEReference(modifiersEClass, MODIFIERS__BLEND);

		blendModifiersEClass = createEClass(BLEND_MODIFIERS);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__ACCESS);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__STATIC);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__FINAL);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__ABSTRACT);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__SYNCHRONIZED);

		// Create enums
		quantifierEEnum = createEEnum(QUANTIFIER);
		elementJavaEEnum = createEEnum(ELEMENT_JAVA);
		languageEEnum = createEEnum(LANGUAGE);
		nameTypeEEnum = createEEnum(NAME_TYPE);
		nameOperatorEEnum = createEEnum(NAME_OPERATOR);
		accessModifierEEnum = createEEnum(ACCESS_MODIFIER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		packageEClass.getESuperTypes().add(this.getSatisfy());
		interfaceEClass.getESuperTypes().add(this.getSatisfy());
		isImplentedEClass.getESuperTypes().add(this.getInterface());
		enumerationEClass.getESuperTypes().add(this.getSatisfy());
		classEClass.getESuperTypes().add(this.getSatisfy());
		isInheritorEClass.getESuperTypes().add(this.getClass_());
		implementsEClass.getESuperTypes().add(this.getClass_());
		isExtendedEClass.getESuperTypes().add(this.getClass_());
		methodEClass.getESuperTypes().add(this.getSatisfy());
		parametreEClass.getESuperTypes().add(this.getMethod());
		constructorEClass.getESuperTypes().add(this.getMethod());
		returnEClass.getESuperTypes().add(this.getMethod());
		attributeEClass.getESuperTypes().add(this.getSatisfy());
		attributeTypeEClass.getESuperTypes().add(this.getAttribute());
		initializeEClass.getESuperTypes().add(this.getAttribute());
		noEmptyEClass.getESuperTypes().add(this.getPackage());
		noEmptyEClass.getESuperTypes().add(this.getMethod());
		noEmptyEClass.getESuperTypes().add(this.getClass_());
		noEmptyEClass.getESuperTypes().add(this.getInterface());
		noEmptyEClass.getESuperTypes().add(this.getEnumeration());
		nameEClass.getESuperTypes().add(this.getAttribute());
		nameEClass.getESuperTypes().add(this.getClass_());
		nameEClass.getESuperTypes().add(this.getMethod());
		nameEClass.getESuperTypes().add(this.getPackage());
		nameEClass.getESuperTypes().add(this.getInterface());
		nameEClass.getESuperTypes().add(this.getEnumeration());
		javaDocEClass.getESuperTypes().add(this.getAttribute());
		javaDocEClass.getESuperTypes().add(this.getClass_());
		javaDocEClass.getESuperTypes().add(this.getMethod());
		javaDocEClass.getESuperTypes().add(this.getInterface());
		javaDocEClass.getESuperTypes().add(this.getEnumeration());
		conteinsEClass.getESuperTypes().add(this.getPackage());
		conteinsEClass.getESuperTypes().add(this.getInterface());
		conteinsEClass.getESuperTypes().add(this.getEnumeration());
		conteinsEClass.getESuperTypes().add(this.getClass_());
		modifiersEClass.getESuperTypes().add(this.getAttribute());
		modifiersEClass.getESuperTypes().add(this.getClass_());
		modifiersEClass.getESuperTypes().add(this.getMethod());
		modifiersEClass.getESuperTypes().add(this.getEnumeration());
		modifiersEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleSet_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, 1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleSet_Rules(), this.getRule(), null, "rules", null, 1, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_No(), ecorePackage.getEBoolean(), "no", "false", 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Quantifier(), this.getQuantifier(), "quantifier", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Element(), this.getElementJava(), "element", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Filter(), this.getFilter(), null, "filter", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Satisfy(), this.getOr(), null, "satisfy", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Op(), this.getAnd(), null, "op", null, 1, -1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Op(), this.getSatisfy(), null, "op", null, 1, -1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilter_Filter(), this.getOr(), null, "filter", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFilter_No(), ecorePackage.getEBoolean(), "no", null, 0, 1, Filter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(satisfyEClass, Satisfy.class, "Satisfy", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, javaRule.Package.class, "Package", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isImplentedEClass, isImplented.class, "isImplented", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, javaRule.Class.class, "Class", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isInheritorEClass, IsInheritor.class, "IsInheritor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImplements_MaxInterface(), ecorePackage.getEInt(), "maxInterface", null, 0, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImplements_MinInterface(), ecorePackage.getEInt(), "minInterface", null, 0, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isExtendedEClass, IsExtended.class, "IsExtended", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parametreEClass, Parametre.class, "Parametre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParametre_NumParam(), ecorePackage.getEBigInteger(), "numParam", null, 1, 1, Parametre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParametre_TypesParam(), ecorePackage.getEString(), "typesParam", null, 0, -1, Parametre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReturn_ReturnType(), ecorePackage.getEString(), "returnType", null, 1, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttributeType_Type(), ecorePackage.getEString(), "Type", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializeEClass, Initialize.class, "Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(noEmptyEClass, NoEmpty.class, "NoEmpty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameEClass, Name.class, "Name", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getName_Type(), this.getNameType(), "type", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getName_Name(), ecorePackage.getEString(), "name", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getName_Operator(), this.getNameOperator(), "operator", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getName_Language(), this.getLanguage(), "Language", null, 0, 1, Name.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaDocEClass, JavaDoc.class, "JavaDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaDoc_Author(), ecorePackage.getEBoolean(), "author", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Parametre(), ecorePackage.getEBoolean(), "parametre", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Return(), ecorePackage.getEBoolean(), "return", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Version(), ecorePackage.getEBoolean(), "version", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Throws(), ecorePackage.getEBoolean(), "throws", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_See(), ecorePackage.getEBoolean(), "see", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conteinsEClass, Conteins.class, "Conteins", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConteins_Which(), this.getRule(), null, "which", null, 1, 1, Conteins.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiersEClass, Modifiers.class, "Modifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiers_Blend(), this.getBlendModifiers(), null, "blend", null, 1, -1, Modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blendModifiersEClass, BlendModifiers.class, "BlendModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlendModifiers_Access(), this.getAccessModifier(), "access", null, 0, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Final(), ecorePackage.getEBoolean(), "final", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Synchronized(), ecorePackage.getEBoolean(), "synchronized", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.ONE);
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);
		addEEnumLiteral(quantifierEEnum, Quantifier.ALL);

		initEEnum(elementJavaEEnum, ElementJava.class, "ElementJava");
		addEEnumLiteral(elementJavaEEnum, ElementJava.PACKAGE);
		addEEnumLiteral(elementJavaEEnum, ElementJava.CLASS);
		addEEnumLiteral(elementJavaEEnum, ElementJava.INTERFACE);
		addEEnumLiteral(elementJavaEEnum, ElementJava.ENUM);
		addEEnumLiteral(elementJavaEEnum, ElementJava.METHOD);
		addEEnumLiteral(elementJavaEEnum, ElementJava.ATTRIBUTE);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.ENGLISH);
		addEEnumLiteral(languageEEnum, Language.ESPANIOL);

		initEEnum(nameTypeEEnum, NameType.class, "NameType");
		addEEnumLiteral(nameTypeEEnum, NameType.UPPER_CASE);
		addEEnumLiteral(nameTypeEEnum, NameType.LOWER_CASE);
		addEEnumLiteral(nameTypeEEnum, NameType.UPPER_CAMEL_CASE);
		addEEnumLiteral(nameTypeEEnum, NameType.LOWER_CAMEL_CASE);
		addEEnumLiteral(nameTypeEEnum, NameType.START_UPPER_CASE);

		initEEnum(nameOperatorEEnum, NameOperator.class, "NameOperator");
		addEEnumLiteral(nameOperatorEEnum, NameOperator.LIKE);
		addEEnumLiteral(nameOperatorEEnum, NameOperator.EQUAL);

		initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
		addEEnumLiteral(accessModifierEEnum, AccessModifier.DEFAULT);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PROTECTED);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaRulePackageImpl
