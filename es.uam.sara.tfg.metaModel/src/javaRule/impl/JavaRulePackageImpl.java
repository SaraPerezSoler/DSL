/**
 */
package javaRule.impl;

import javaRule.AccessModifier;
import javaRule.And;
import javaRule.Attribute;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Contains;
import javaRule.Element;
import javaRule.ElementString;
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
import javaRule.JavaRuleFactory;
import javaRule.JavaRulePackage;
import javaRule.Language;
import javaRule.Method;
import javaRule.Modifiers;
import javaRule.NameCheck;
import javaRule.NameOperation;
import javaRule.NameOperator;
import javaRule.NameType;
import javaRule.Or;
import javaRule.Parameter;
import javaRule.PrimaryOp;
import javaRule.Primitive;
import javaRule.Property;
import javaRule.PropertyLiteral;
import javaRule.Quantifier;
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
	private EClass sentenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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
	private EClass primaryOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

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
	private EClass classEClass = null;

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
	private EClass methodEClass = null;

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
	private EClass isImplementedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSuperInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSuperClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isSubClassEClass = null;

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
	private EClass extendsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangoNamesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tamanioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

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
	private EClass emptyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isGenericEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableSubtypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containsEClass = null;

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
	private EClass typePropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typePrimitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isPrimitiveFuntionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isCollectionTypeEClass = null;

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
	private EEnum elementEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum elementStringEEnum = null;

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
	private EEnum nameCheckEEnum = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEEnum = null;

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
	public EReference getRuleSet_Sentences() {
		return (EReference)ruleSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSentence() {
		return sentenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Element() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_From() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_In() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Satisfy() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSentence_Using() {
		return (EReference)sentenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSentence_Name() {
		return (EAttribute)sentenceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
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
	public EReference getRule_Filter() {
		return (EReference)ruleEClass.getEStructuralFeatures().get(2);
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
	public EClass getPrimaryOp() {
		return primaryOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyLiteral() {
		return propertyLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPropertyLiteral_Property() {
		return (EReference)propertyLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_No() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFile() {
		return fileEClass;
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
	public EClass getClass_() {
		return classEClass;
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
	public EClass getMethod() {
		return methodEClass;
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
	public EClass getisImplemented() {
		return isImplementedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getisImplemented_Valores() {
		return (EReference)isImplementedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSuperInterface() {
		return isSuperInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsSuperInterface_Valores() {
		return (EReference)isSuperInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSuperClass() {
		return isSuperClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsSuperClass_Valores() {
		return (EReference)isSuperClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsSubClass() {
		return isSubClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsSubClass_Of() {
		return (EReference)isSubClassEClass.getEStructuralFeatures().get(0);
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
	public EReference getImplements_Valores() {
		return (EReference)implementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtends() {
		return extendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtends_Valores() {
		return (EReference)extendsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangoNames() {
		return rangoNamesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangoNames_Min() {
		return (EAttribute)rangoNamesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangoNames_Max() {
		return (EAttribute)rangoNamesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRangoNames_Types() {
		return (EReference)rangoNamesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTamanio() {
		return tamanioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTamanio_Min() {
		return (EAttribute)tamanioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTamanio_Max() {
		return (EAttribute)tamanioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTamanio_Exact() {
		return (EAttribute)tamanioEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Min() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Max() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Exact() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Types() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(3);
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
	public EReference getReturn_Type() {
		return (EReference)returnEClass.getEStructuralFeatures().get(0);
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
	public EReference getAttributeType_Type() {
		return (EReference)attributeTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getEmpty() {
		return emptyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsGeneric() {
		return isGenericEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameOperation() {
		return nameOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameOperation_Operator() {
		return (EAttribute)nameOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameOperation_Language() {
		return (EAttribute)nameOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNameOperation_Name() {
		return (EReference)nameOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringProperty() {
		return stringPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringVariable() {
		return stringVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringVariable_Variable() {
		return (EReference)stringVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringVariable_Strings() {
		return (EAttribute)stringVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableSubtype() {
		return variableSubtypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableSubtype_Variable() {
		return (EReference)variableSubtypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSubtype_Subtype() {
		return (EAttribute)variableSubtypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringValue() {
		return stringValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringValue_Value() {
		return (EAttribute)stringValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameType() {
		return nameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameType_Type() {
		return (EAttribute)nameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContains() {
		return containsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContains_Rule() {
		return (EReference)containsEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getJavaDoc_Parameter() {
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
	public EAttribute getBlendModifiers_Default() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlendModifiers_Synchronized() {
		return (EAttribute)blendModifiersEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeProperty() {
		return typePropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeString() {
		return typeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeString_TypeStrng() {
		return (EReference)typeStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypePrimitive() {
		return typePrimitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypePrimitive_TypePrimitive() {
		return (EAttribute)typePrimitiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsPrimitiveFuntion() {
		return isPrimitiveFuntionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsCollectionType() {
		return isCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIsCollectionType_Of() {
		return (EReference)isCollectionTypeEClass.getEStructuralFeatures().get(0);
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
	public EEnum getElement() {
		return elementEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getElementString() {
		return elementStringEEnum;
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
	public EEnum getNameCheck() {
		return nameCheckEEnum;
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
	public EEnum getPrimitive() {
		return primitiveEEnum;
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
		createEReference(ruleSetEClass, RULE_SET__SENTENCES);

		sentenceEClass = createEClass(SENTENCE);
		createEAttribute(sentenceEClass, SENTENCE__ELEMENT);
		createEReference(sentenceEClass, SENTENCE__FROM);
		createEReference(sentenceEClass, SENTENCE__IN);
		createEReference(sentenceEClass, SENTENCE__SATISFY);
		createEReference(sentenceEClass, SENTENCE__USING);
		createEAttribute(sentenceEClass, SENTENCE__NAME);

		variableEClass = createEClass(VARIABLE);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__NO);
		createEAttribute(ruleEClass, RULE__QUANTIFIER);
		createEReference(ruleEClass, RULE__FILTER);

		orEClass = createEClass(OR);
		createEReference(orEClass, OR__OP);

		andEClass = createEClass(AND);
		createEReference(andEClass, AND__OP);

		primaryOpEClass = createEClass(PRIMARY_OP);

		propertyLiteralEClass = createEClass(PROPERTY_LITERAL);
		createEReference(propertyLiteralEClass, PROPERTY_LITERAL__PROPERTY);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NO);

		fileEClass = createEClass(FILE);

		packageEClass = createEClass(PACKAGE);

		interfaceEClass = createEClass(INTERFACE);

		classEClass = createEClass(CLASS);

		enumerationEClass = createEClass(ENUMERATION);

		methodEClass = createEClass(METHOD);

		attributeEClass = createEClass(ATTRIBUTE);

		isImplementedEClass = createEClass(IS_IMPLEMENTED);
		createEReference(isImplementedEClass, IS_IMPLEMENTED__VALORES);

		isSuperInterfaceEClass = createEClass(IS_SUPER_INTERFACE);
		createEReference(isSuperInterfaceEClass, IS_SUPER_INTERFACE__VALORES);

		isSuperClassEClass = createEClass(IS_SUPER_CLASS);
		createEReference(isSuperClassEClass, IS_SUPER_CLASS__VALORES);

		isSubClassEClass = createEClass(IS_SUB_CLASS);
		createEReference(isSubClassEClass, IS_SUB_CLASS__OF);

		implementsEClass = createEClass(IMPLEMENTS);
		createEReference(implementsEClass, IMPLEMENTS__VALORES);

		extendsEClass = createEClass(EXTENDS);
		createEReference(extendsEClass, EXTENDS__VALORES);

		rangoNamesEClass = createEClass(RANGO_NAMES);
		createEAttribute(rangoNamesEClass, RANGO_NAMES__MIN);
		createEAttribute(rangoNamesEClass, RANGO_NAMES__MAX);
		createEReference(rangoNamesEClass, RANGO_NAMES__TYPES);

		tamanioEClass = createEClass(TAMANIO);
		createEAttribute(tamanioEClass, TAMANIO__MIN);
		createEAttribute(tamanioEClass, TAMANIO__MAX);
		createEAttribute(tamanioEClass, TAMANIO__EXACT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__MIN);
		createEAttribute(parameterEClass, PARAMETER__MAX);
		createEAttribute(parameterEClass, PARAMETER__EXACT);
		createEReference(parameterEClass, PARAMETER__TYPES);

		constructorEClass = createEClass(CONSTRUCTOR);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__TYPE);

		attributeTypeEClass = createEClass(ATTRIBUTE_TYPE);
		createEReference(attributeTypeEClass, ATTRIBUTE_TYPE__TYPE);

		initializeEClass = createEClass(INITIALIZE);

		emptyEClass = createEClass(EMPTY);

		isGenericEClass = createEClass(IS_GENERIC);

		nameOperationEClass = createEClass(NAME_OPERATION);
		createEAttribute(nameOperationEClass, NAME_OPERATION__OPERATOR);
		createEAttribute(nameOperationEClass, NAME_OPERATION__LANGUAGE);
		createEReference(nameOperationEClass, NAME_OPERATION__NAME);

		stringPropertyEClass = createEClass(STRING_PROPERTY);

		stringVariableEClass = createEClass(STRING_VARIABLE);
		createEReference(stringVariableEClass, STRING_VARIABLE__VARIABLE);
		createEAttribute(stringVariableEClass, STRING_VARIABLE__STRINGS);

		variableSubtypeEClass = createEClass(VARIABLE_SUBTYPE);
		createEReference(variableSubtypeEClass, VARIABLE_SUBTYPE__VARIABLE);
		createEAttribute(variableSubtypeEClass, VARIABLE_SUBTYPE__SUBTYPE);

		stringValueEClass = createEClass(STRING_VALUE);
		createEAttribute(stringValueEClass, STRING_VALUE__VALUE);

		nameTypeEClass = createEClass(NAME_TYPE);
		createEAttribute(nameTypeEClass, NAME_TYPE__TYPE);

		containsEClass = createEClass(CONTAINS);
		createEReference(containsEClass, CONTAINS__RULE);

		javaDocEClass = createEClass(JAVA_DOC);
		createEAttribute(javaDocEClass, JAVA_DOC__AUTHOR);
		createEAttribute(javaDocEClass, JAVA_DOC__PARAMETER);
		createEAttribute(javaDocEClass, JAVA_DOC__RETURN);
		createEAttribute(javaDocEClass, JAVA_DOC__VERSION);
		createEAttribute(javaDocEClass, JAVA_DOC__THROWS);
		createEAttribute(javaDocEClass, JAVA_DOC__SEE);

		modifiersEClass = createEClass(MODIFIERS);
		createEReference(modifiersEClass, MODIFIERS__BLEND);

		blendModifiersEClass = createEClass(BLEND_MODIFIERS);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__ACCESS);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__STATIC);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__FINAL);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__ABSTRACT);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__DEFAULT);
		createEAttribute(blendModifiersEClass, BLEND_MODIFIERS__SYNCHRONIZED);

		typePropertyEClass = createEClass(TYPE_PROPERTY);

		typeStringEClass = createEClass(TYPE_STRING);
		createEReference(typeStringEClass, TYPE_STRING__TYPE_STRNG);

		typePrimitiveEClass = createEClass(TYPE_PRIMITIVE);
		createEAttribute(typePrimitiveEClass, TYPE_PRIMITIVE__TYPE_PRIMITIVE);

		isPrimitiveFuntionEClass = createEClass(IS_PRIMITIVE_FUNTION);

		isCollectionTypeEClass = createEClass(IS_COLLECTION_TYPE);
		createEReference(isCollectionTypeEClass, IS_COLLECTION_TYPE__OF);

		// Create enums
		quantifierEEnum = createEEnum(QUANTIFIER);
		elementEEnum = createEEnum(ELEMENT);
		elementStringEEnum = createEEnum(ELEMENT_STRING);
		languageEEnum = createEEnum(LANGUAGE);
		nameCheckEEnum = createEEnum(NAME_CHECK);
		nameOperatorEEnum = createEEnum(NAME_OPERATOR);
		accessModifierEEnum = createEEnum(ACCESS_MODIFIER);
		primitiveEEnum = createEEnum(PRIMITIVE);
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
		variableEClass.getESuperTypes().add(this.getSentence());
		ruleEClass.getESuperTypes().add(this.getSentence());
		orEClass.getESuperTypes().add(this.getPrimaryOp());
		propertyLiteralEClass.getESuperTypes().add(this.getPrimaryOp());
		fileEClass.getESuperTypes().add(this.getProperty());
		packageEClass.getESuperTypes().add(this.getProperty());
		interfaceEClass.getESuperTypes().add(this.getProperty());
		classEClass.getESuperTypes().add(this.getProperty());
		enumerationEClass.getESuperTypes().add(this.getProperty());
		methodEClass.getESuperTypes().add(this.getProperty());
		attributeEClass.getESuperTypes().add(this.getProperty());
		isImplementedEClass.getESuperTypes().add(this.getInterface());
		isSuperInterfaceEClass.getESuperTypes().add(this.getInterface());
		isSuperClassEClass.getESuperTypes().add(this.getClass_());
		isSubClassEClass.getESuperTypes().add(this.getClass_());
		implementsEClass.getESuperTypes().add(this.getClass_());
		implementsEClass.getESuperTypes().add(this.getEnumeration());
		extendsEClass.getESuperTypes().add(this.getInterface());
		tamanioEClass.getESuperTypes().add(this.getMethod());
		tamanioEClass.getESuperTypes().add(this.getClass_());
		tamanioEClass.getESuperTypes().add(this.getFile());
		tamanioEClass.getESuperTypes().add(this.getInterface());
		tamanioEClass.getESuperTypes().add(this.getEnumeration());
		parameterEClass.getESuperTypes().add(this.getMethod());
		constructorEClass.getESuperTypes().add(this.getMethod());
		returnEClass.getESuperTypes().add(this.getMethod());
		attributeTypeEClass.getESuperTypes().add(this.getAttribute());
		initializeEClass.getESuperTypes().add(this.getAttribute());
		emptyEClass.getESuperTypes().add(this.getPackage());
		emptyEClass.getESuperTypes().add(this.getMethod());
		emptyEClass.getESuperTypes().add(this.getClass_());
		emptyEClass.getESuperTypes().add(this.getInterface());
		emptyEClass.getESuperTypes().add(this.getEnumeration());
		emptyEClass.getESuperTypes().add(this.getFile());
		isGenericEClass.getESuperTypes().add(this.getClass_());
		isGenericEClass.getESuperTypes().add(this.getInterface());
		isGenericEClass.getESuperTypes().add(this.getMethod());
		isGenericEClass.getESuperTypes().add(this.getAttribute());
		nameOperationEClass.getESuperTypes().add(this.getAttribute());
		nameOperationEClass.getESuperTypes().add(this.getClass_());
		nameOperationEClass.getESuperTypes().add(this.getMethod());
		nameOperationEClass.getESuperTypes().add(this.getPackage());
		nameOperationEClass.getESuperTypes().add(this.getInterface());
		nameOperationEClass.getESuperTypes().add(this.getEnumeration());
		nameOperationEClass.getESuperTypes().add(this.getFile());
		stringVariableEClass.getESuperTypes().add(this.getStringProperty());
		stringValueEClass.getESuperTypes().add(this.getStringProperty());
		nameTypeEClass.getESuperTypes().add(this.getAttribute());
		nameTypeEClass.getESuperTypes().add(this.getClass_());
		nameTypeEClass.getESuperTypes().add(this.getMethod());
		nameTypeEClass.getESuperTypes().add(this.getPackage());
		nameTypeEClass.getESuperTypes().add(this.getInterface());
		nameTypeEClass.getESuperTypes().add(this.getEnumeration());
		nameTypeEClass.getESuperTypes().add(this.getFile());
		containsEClass.getESuperTypes().add(this.getClass_());
		containsEClass.getESuperTypes().add(this.getEnumeration());
		containsEClass.getESuperTypes().add(this.getFile());
		containsEClass.getESuperTypes().add(this.getInterface());
		containsEClass.getESuperTypes().add(this.getPackage());
		javaDocEClass.getESuperTypes().add(this.getAttribute());
		javaDocEClass.getESuperTypes().add(this.getClass_());
		javaDocEClass.getESuperTypes().add(this.getMethod());
		javaDocEClass.getESuperTypes().add(this.getInterface());
		javaDocEClass.getESuperTypes().add(this.getEnumeration());
		modifiersEClass.getESuperTypes().add(this.getAttribute());
		modifiersEClass.getESuperTypes().add(this.getClass_());
		modifiersEClass.getESuperTypes().add(this.getMethod());
		modifiersEClass.getESuperTypes().add(this.getEnumeration());
		modifiersEClass.getESuperTypes().add(this.getInterface());
		typeStringEClass.getESuperTypes().add(this.getTypeProperty());
		typePrimitiveEClass.getESuperTypes().add(this.getTypeProperty());
		isPrimitiveFuntionEClass.getESuperTypes().add(this.getTypeProperty());
		isCollectionTypeEClass.getESuperTypes().add(this.getTypeProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(ruleSetEClass, RuleSet.class, "RuleSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRuleSet_ProjectName(), ecorePackage.getEString(), "ProjectName", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRuleSet_Sentences(), this.getSentence(), null, "sentences", null, 0, -1, RuleSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sentenceEClass, Sentence.class, "Sentence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSentence_Element(), this.getElement(), "element", null, 1, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_From(), this.getVariable(), null, "from", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_In(), this.getVariable(), null, "in", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_Satisfy(), this.getOr(), null, "satisfy", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSentence_Using(), this.getVariableSubtype(), null, "using", null, 0, -1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSentence_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sentence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(ruleEClass, Rule.class, "Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_No(), ecorePackage.getEBoolean(), "no", "false", 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_Quantifier(), this.getQuantifier(), "quantifier", null, 1, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRule_Filter(), this.getOr(), null, "filter", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orEClass, Or.class, "Or", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOr_Op(), this.getAnd(), null, "op", null, 1, -1, Or.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(andEClass, And.class, "And", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnd_Op(), this.getPrimaryOp(), null, "op", null, 1, -1, And.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primaryOpEClass, PrimaryOp.class, "PrimaryOp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyLiteralEClass, PropertyLiteral.class, "PropertyLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyLiteral_Property(), this.getProperty(), null, "property", null, 1, 1, PropertyLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_No(), ecorePackage.getEBoolean(), "no", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(packageEClass, javaRule.Package.class, "Package", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interfaceEClass, Interface.class, "Interface", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classEClass, javaRule.Class.class, "Class", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodEClass, Method.class, "Method", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeEClass, Attribute.class, "Attribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isImplementedEClass, isImplemented.class, "isImplemented", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getisImplemented_Valores(), this.getRangoNames(), null, "valores", null, 1, 1, isImplemented.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSuperInterfaceEClass, IsSuperInterface.class, "IsSuperInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsSuperInterface_Valores(), this.getRangoNames(), null, "valores", null, 1, 1, IsSuperInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSuperClassEClass, IsSuperClass.class, "IsSuperClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsSuperClass_Valores(), this.getRangoNames(), null, "valores", null, 1, 1, IsSuperClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isSubClassEClass, IsSubClass.class, "IsSubClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsSubClass_Of(), this.getStringProperty(), null, "of", null, 0, 1, IsSubClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implementsEClass, Implements.class, "Implements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImplements_Valores(), this.getRangoNames(), null, "valores", null, 1, 1, Implements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendsEClass, Extends.class, "Extends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtends_Valores(), this.getRangoNames(), null, "valores", null, 1, 1, Extends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangoNamesEClass, RangoNames.class, "RangoNames", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangoNames_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, RangoNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangoNames_Max(), ecorePackage.getEInt(), "max", "2147483647", 0, 1, RangoNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRangoNames_Types(), this.getStringProperty(), null, "types", null, 0, -1, RangoNames.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tamanioEClass, Tamanio.class, "Tamanio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTamanio_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, Tamanio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTamanio_Max(), ecorePackage.getEInt(), "max", "2147483647", 0, 1, Tamanio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTamanio_Exact(), ecorePackage.getEInt(), "exact", "-2147483647", 0, 1, Tamanio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Min(), ecorePackage.getEInt(), "min", "1", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Max(), ecorePackage.getEInt(), "max", "2147483647", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Exact(), ecorePackage.getEInt(), "exact", "-2147483647", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Types(), this.getTypeProperty(), null, "types", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constructorEClass, Constructor.class, "Constructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Type(), this.getTypeProperty(), null, "type", null, 1, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeTypeEClass, AttributeType.class, "AttributeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeType_Type(), this.getTypeProperty(), null, "type", null, 1, 1, AttributeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(initializeEClass, Initialize.class, "Initialize", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(emptyEClass, Empty.class, "Empty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isGenericEClass, IsGeneric.class, "IsGeneric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameOperationEClass, NameOperation.class, "NameOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameOperation_Operator(), this.getNameOperator(), "operator", "EQUAL", 1, 1, NameOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNameOperation_Language(), this.getLanguage(), "Language", "EMPTY", 0, 1, NameOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNameOperation_Name(), this.getStringProperty(), null, "name", null, 1, 1, NameOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringPropertyEClass, StringProperty.class, "StringProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringVariableEClass, StringVariable.class, "StringVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringVariable_Variable(), this.getVariableSubtype(), null, "variable", null, 0, 1, StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringVariable_Strings(), this.getElementString(), "strings", null, 1, 1, StringVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableSubtypeEClass, VariableSubtype.class, "VariableSubtype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableSubtype_Variable(), this.getVariable(), null, "variable", null, 0, 1, VariableSubtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableSubtype_Subtype(), this.getElement(), "subtype", null, 0, 1, VariableSubtype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringValueEClass, StringValue.class, "StringValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringValue_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nameTypeEClass, NameType.class, "NameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameType_Type(), this.getNameCheck(), "type", "UPPER_CASE", 1, 1, NameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containsEClass, Contains.class, "Contains", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getContains_Rule(), this.getRule(), null, "rule", null, 1, 1, Contains.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaDocEClass, JavaDoc.class, "JavaDoc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaDoc_Author(), ecorePackage.getEBoolean(), "author", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Parameter(), ecorePackage.getEBoolean(), "parameter", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Return(), ecorePackage.getEBoolean(), "return", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Version(), ecorePackage.getEBoolean(), "version", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_Throws(), ecorePackage.getEBoolean(), "throws", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaDoc_See(), ecorePackage.getEBoolean(), "see", "false", 1, 1, JavaDoc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modifiersEClass, Modifiers.class, "Modifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModifiers_Blend(), this.getBlendModifiers(), null, "blend", null, 1, -1, Modifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blendModifiersEClass, BlendModifiers.class, "BlendModifiers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlendModifiers_Access(), this.getAccessModifier(), "access", "nothing", 0, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Final(), ecorePackage.getEBoolean(), "final", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Default(), ecorePackage.getEBoolean(), "default", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlendModifiers_Synchronized(), ecorePackage.getEBoolean(), "synchronized", "false", 1, 1, BlendModifiers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typePropertyEClass, TypeProperty.class, "TypeProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeStringEClass, TypeString.class, "TypeString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeString_TypeStrng(), this.getStringProperty(), null, "typeStrng", null, 0, 1, TypeString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typePrimitiveEClass, TypePrimitive.class, "TypePrimitive", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypePrimitive_TypePrimitive(), this.getPrimitive(), "typePrimitive", null, 0, 1, TypePrimitive.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(isPrimitiveFuntionEClass, IsPrimitiveFuntion.class, "IsPrimitiveFuntion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(isCollectionTypeEClass, IsCollectionType.class, "IsCollectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIsCollectionType_Of(), this.getTypeProperty(), null, "of", null, 0, 1, IsCollectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(quantifierEEnum, Quantifier.class, "Quantifier");
		addEEnumLiteral(quantifierEEnum, Quantifier.ONE);
		addEEnumLiteral(quantifierEEnum, Quantifier.EXISTS);
		addEEnumLiteral(quantifierEEnum, Quantifier.ALL);

		initEEnum(elementEEnum, Element.class, "Element");
		addEEnumLiteral(elementEEnum, Element.NULL);
		addEEnumLiteral(elementEEnum, Element.PACKAGE);
		addEEnumLiteral(elementEEnum, Element.CLASS);
		addEEnumLiteral(elementEEnum, Element.INTERFACE);
		addEEnumLiteral(elementEEnum, Element.ENUM);
		addEEnumLiteral(elementEEnum, Element.METHOD);
		addEEnumLiteral(elementEEnum, Element.ATTRIBUTE);
		addEEnumLiteral(elementEEnum, Element.FILE);

		initEEnum(elementStringEEnum, ElementString.class, "ElementString");
		addEEnumLiteral(elementStringEEnum, ElementString.NAME);
		addEEnumLiteral(elementStringEEnum, ElementString.TYPE);

		initEEnum(languageEEnum, Language.class, "Language");
		addEEnumLiteral(languageEEnum, Language.EMPTY);
		addEEnumLiteral(languageEEnum, Language.SPANISH);
		addEEnumLiteral(languageEEnum, Language.ENGLISH);

		initEEnum(nameCheckEEnum, NameCheck.class, "NameCheck");
		addEEnumLiteral(nameCheckEEnum, NameCheck.UPPER_CASE);
		addEEnumLiteral(nameCheckEEnum, NameCheck.LOWER_CASE);
		addEEnumLiteral(nameCheckEEnum, NameCheck.UPPER_CAMEL_CASE);
		addEEnumLiteral(nameCheckEEnum, NameCheck.LOWER_CAMEL_CASE);
		addEEnumLiteral(nameCheckEEnum, NameCheck.START_UPPER_CASE);

		initEEnum(nameOperatorEEnum, NameOperator.class, "NameOperator");
		addEEnumLiteral(nameOperatorEEnum, NameOperator.EQUAL);
		addEEnumLiteral(nameOperatorEEnum, NameOperator.START);
		addEEnumLiteral(nameOperatorEEnum, NameOperator.END);
		addEEnumLiteral(nameOperatorEEnum, NameOperator.CONTAIN);
		addEEnumLiteral(nameOperatorEEnum, NameOperator.LIKE);

		initEEnum(accessModifierEEnum, AccessModifier.class, "AccessModifier");
		addEEnumLiteral(accessModifierEEnum, AccessModifier.NOTHING);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PUBLIC);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PROTECTED);
		addEEnumLiteral(accessModifierEEnum, AccessModifier.PRIVATE);

		initEEnum(primitiveEEnum, Primitive.class, "Primitive");
		addEEnumLiteral(primitiveEEnum, Primitive.BYTE);
		addEEnumLiteral(primitiveEEnum, Primitive.SHORT);
		addEEnumLiteral(primitiveEEnum, Primitive.INT);
		addEEnumLiteral(primitiveEEnum, Primitive.LONG);
		addEEnumLiteral(primitiveEEnum, Primitive.FLOAT);
		addEEnumLiteral(primitiveEEnum, Primitive.DOUBLE);
		addEEnumLiteral(primitiveEEnum, Primitive.BOOLEAN);
		addEEnumLiteral(primitiveEEnum, Primitive.CHAR);
		addEEnumLiteral(primitiveEEnum, Primitive.STRING);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaRulePackageImpl
