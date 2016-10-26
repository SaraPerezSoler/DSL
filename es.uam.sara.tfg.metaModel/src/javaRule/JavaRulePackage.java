/**
 */
package javaRule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see javaRule.JavaRuleFactory
 * @model kind="package"
 * @generated
 */
public interface JavaRulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "javaRule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "javaRule";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "javaRule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaRulePackage eINSTANCE = javaRule.impl.JavaRulePackageImpl.init();

	/**
	 * The meta object id for the '{@link javaRule.impl.RuleSetImpl <em>Rule Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.RuleSetImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getRuleSet()
	 * @generated
	 */
	int RULE_SET = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__RULES = 1;

	/**
	 * The number of structural features of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Rule Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.RuleImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NO = 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__QUANTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FILTER = 3;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SATISFY = 4;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.OrImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getOr()
	 * @generated
	 */
	int OR = 2;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OP = 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AndImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OP = 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.FilterImpl <em>Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.FilterImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getFilter()
	 * @generated
	 */
	int FILTER = 4;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__FILTER = 0;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER__NO = 1;

	/**
	 * The number of structural features of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.SatisfyImpl <em>Satisfy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.SatisfyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getSatisfy()
	 * @generated
	 */
	int SATISFY = 5;

	/**
	 * The number of structural features of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Satisfy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATISFY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.PackageImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 6;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.InterfaceImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 7;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.isImplementedImpl <em>is Implemented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.isImplementedImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getisImplemented()
	 * @generated
	 */
	int IS_IMPLEMENTED = 8;

	/**
	 * The number of structural features of the '<em>is Implemented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>is Implemented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.EnumerationImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 9;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ClassImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 10;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsInheritorImpl <em>Is Inheritor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsInheritorImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsInheritor()
	 * @generated
	 */
	int IS_INHERITOR = 11;

	/**
	 * The number of structural features of the '<em>Is Inheritor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INHERITOR_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Inheritor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_INHERITOR_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ImplementsImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 12;

	/**
	 * The feature id for the '<em><b>Min Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__MIN_INTERFACE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__MAX_INTERFACE = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsExtendedImpl <em>Is Extended</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsExtendedImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsExtended()
	 * @generated
	 */
	int IS_EXTENDED = 13;

	/**
	 * The number of structural features of the '<em>Is Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXTENDED_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Extended</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_EXTENDED_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.MethodImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 14;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ParameterImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 15;

	/**
	 * The feature id for the '<em><b>Num Param</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NUM_PARAM = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types Param</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPES_PARAM = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ConstructorImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 16;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ReturnImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 17;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURN_TYPE = METHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = METHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AttributeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 18;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = SATISFY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = SATISFY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AttributeTypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.InitializeImpl <em>Initialize</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.InitializeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getInitialize()
	 * @generated
	 */
	int INITIALIZE = 20;

	/**
	 * The number of structural features of the '<em>Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Initialize</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.NoEmptyImpl <em>No Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.NoEmptyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getNoEmpty()
	 * @generated
	 */
	int NO_EMPTY = 21;

	/**
	 * The number of structural features of the '<em>No Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_EMPTY_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>No Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NO_EMPTY_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.NameOperationImpl <em>Name Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.NameOperationImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getNameOperation()
	 * @generated
	 */
	int NAME_OPERATION = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__NAME = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__OPERATOR = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__LANGUAGE = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Name Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Name Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.NameTypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__TYPE = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.JavaDocImpl <em>Java Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.JavaDocImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getJavaDoc()
	 * @generated
	 */
	int JAVA_DOC = 24;

	/**
	 * The feature id for the '<em><b>Author</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__AUTHOR = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__PARAMETER = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__RETURN = ATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__VERSION = ATTRIBUTE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Throws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__THROWS = ATTRIBUTE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>See</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__SEE = ATTRIBUTE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Java Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Java Doc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ContainsImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 25;

	/**
	 * The feature id for the '<em><b>Which</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__WHICH = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ModifiersImpl <em>Modifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ModifiersImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getModifiers()
	 * @generated
	 */
	int MODIFIERS = 26;

	/**
	 * The feature id for the '<em><b>Blend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERS__BLEND = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERS_FEATURE_COUNT = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERS_OPERATION_COUNT = ATTRIBUTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.BlendModifiersImpl <em>Blend Modifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.BlendModifiersImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getBlendModifiers()
	 * @generated
	 */
	int BLEND_MODIFIERS = 27;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__ACCESS = 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__STATIC = 1;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__FINAL = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__SYNCHRONIZED = 4;

	/**
	 * The number of structural features of the '<em>Blend Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Blend Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Quantifier
	 * @see javaRule.impl.JavaRulePackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 28;

	/**
	 * The meta object id for the '{@link javaRule.ElementJava <em>Element Java</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.ElementJava
	 * @see javaRule.impl.JavaRulePackageImpl#getElementJava()
	 * @generated
	 */
	int ELEMENT_JAVA = 29;

	/**
	 * The meta object id for the '{@link javaRule.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Language
	 * @see javaRule.impl.JavaRulePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 30;

	/**
	 * The meta object id for the '{@link javaRule.NameCheck <em>Name Check</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.NameCheck
	 * @see javaRule.impl.JavaRulePackageImpl#getNameCheck()
	 * @generated
	 */
	int NAME_CHECK = 31;

	/**
	 * The meta object id for the '{@link javaRule.NameOperator <em>Name Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.NameOperator
	 * @see javaRule.impl.JavaRulePackageImpl#getNameOperator()
	 * @generated
	 */
	int NAME_OPERATOR = 32;

	/**
	 * The meta object id for the '{@link javaRule.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.AccessModifier
	 * @see javaRule.impl.JavaRulePackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 33;


	/**
	 * Returns the meta object for class '{@link javaRule.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Set</em>'.
	 * @see javaRule.RuleSet
	 * @generated
	 */
	EClass getRuleSet();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.RuleSet#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see javaRule.RuleSet#getProjectName()
	 * @see #getRuleSet()
	 * @generated
	 */
	EAttribute getRuleSet_ProjectName();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.RuleSet#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see javaRule.RuleSet#getRules()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_Rules();

	/**
	 * Returns the meta object for class '{@link javaRule.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see javaRule.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Rule#isNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see javaRule.Rule#isNo()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_No();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Rule#getQuantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantifier</em>'.
	 * @see javaRule.Rule#getQuantifier()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Quantifier();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Rule#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see javaRule.Rule#getElement()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Element();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Rule#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see javaRule.Rule#getFilter()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Filter();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Rule#getSatisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satisfy</em>'.
	 * @see javaRule.Rule#getSatisfy()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Satisfy();

	/**
	 * Returns the meta object for class '{@link javaRule.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see javaRule.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.Or#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see javaRule.Or#getOp()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Op();

	/**
	 * Returns the meta object for class '{@link javaRule.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see javaRule.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.And#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see javaRule.And#getOp()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Op();

	/**
	 * Returns the meta object for class '{@link javaRule.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter</em>'.
	 * @see javaRule.Filter
	 * @generated
	 */
	EClass getFilter();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Filter#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see javaRule.Filter#getFilter()
	 * @see #getFilter()
	 * @generated
	 */
	EReference getFilter_Filter();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Filter#isNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see javaRule.Filter#isNo()
	 * @see #getFilter()
	 * @generated
	 */
	EAttribute getFilter_No();

	/**
	 * Returns the meta object for class '{@link javaRule.Satisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Satisfy</em>'.
	 * @see javaRule.Satisfy
	 * @generated
	 */
	EClass getSatisfy();

	/**
	 * Returns the meta object for class '{@link javaRule.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see javaRule.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for class '{@link javaRule.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see javaRule.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link javaRule.isImplemented <em>is Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>is Implemented</em>'.
	 * @see javaRule.isImplemented
	 * @generated
	 */
	EClass getisImplemented();

	/**
	 * Returns the meta object for class '{@link javaRule.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see javaRule.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for class '{@link javaRule.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see javaRule.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for class '{@link javaRule.IsInheritor <em>Is Inheritor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Inheritor</em>'.
	 * @see javaRule.IsInheritor
	 * @generated
	 */
	EClass getIsInheritor();

	/**
	 * Returns the meta object for class '{@link javaRule.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implements</em>'.
	 * @see javaRule.Implements
	 * @generated
	 */
	EClass getImplements();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Implements#getMinInterface <em>Min Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Interface</em>'.
	 * @see javaRule.Implements#getMinInterface()
	 * @see #getImplements()
	 * @generated
	 */
	EAttribute getImplements_MinInterface();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Implements#getMaxInterface <em>Max Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Interface</em>'.
	 * @see javaRule.Implements#getMaxInterface()
	 * @see #getImplements()
	 * @generated
	 */
	EAttribute getImplements_MaxInterface();

	/**
	 * Returns the meta object for class '{@link javaRule.IsExtended <em>Is Extended</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Extended</em>'.
	 * @see javaRule.IsExtended
	 * @generated
	 */
	EClass getIsExtended();

	/**
	 * Returns the meta object for class '{@link javaRule.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see javaRule.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for class '{@link javaRule.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see javaRule.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Parameter#getNumParam <em>Num Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Param</em>'.
	 * @see javaRule.Parameter#getNumParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_NumParam();

	/**
	 * Returns the meta object for the attribute list '{@link javaRule.Parameter#getTypesParam <em>Types Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types Param</em>'.
	 * @see javaRule.Parameter#getTypesParam()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_TypesParam();

	/**
	 * Returns the meta object for class '{@link javaRule.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see javaRule.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for class '{@link javaRule.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see javaRule.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Return#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see javaRule.Return#getReturnType()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_ReturnType();

	/**
	 * Returns the meta object for class '{@link javaRule.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see javaRule.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link javaRule.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Type</em>'.
	 * @see javaRule.AttributeType
	 * @generated
	 */
	EClass getAttributeType();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.AttributeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see javaRule.AttributeType#getType()
	 * @see #getAttributeType()
	 * @generated
	 */
	EAttribute getAttributeType_Type();

	/**
	 * Returns the meta object for class '{@link javaRule.Initialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Initialize</em>'.
	 * @see javaRule.Initialize
	 * @generated
	 */
	EClass getInitialize();

	/**
	 * Returns the meta object for class '{@link javaRule.NoEmpty <em>No Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>No Empty</em>'.
	 * @see javaRule.NoEmpty
	 * @generated
	 */
	EClass getNoEmpty();

	/**
	 * Returns the meta object for class '{@link javaRule.NameOperation <em>Name Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Operation</em>'.
	 * @see javaRule.NameOperation
	 * @generated
	 */
	EClass getNameOperation();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.NameOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see javaRule.NameOperation#getName()
	 * @see #getNameOperation()
	 * @generated
	 */
	EAttribute getNameOperation_Name();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.NameOperation#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see javaRule.NameOperation#getOperator()
	 * @see #getNameOperation()
	 * @generated
	 */
	EAttribute getNameOperation_Operator();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.NameOperation#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see javaRule.NameOperation#getLanguage()
	 * @see #getNameOperation()
	 * @generated
	 */
	EAttribute getNameOperation_Language();

	/**
	 * Returns the meta object for class '{@link javaRule.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Name Type</em>'.
	 * @see javaRule.NameType
	 * @generated
	 */
	EClass getNameType();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.NameType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see javaRule.NameType#getType()
	 * @see #getNameType()
	 * @generated
	 */
	EAttribute getNameType_Type();

	/**
	 * Returns the meta object for class '{@link javaRule.JavaDoc <em>Java Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Doc</em>'.
	 * @see javaRule.JavaDoc
	 * @generated
	 */
	EClass getJavaDoc();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Author</em>'.
	 * @see javaRule.JavaDoc#isAuthor()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_Author();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter</em>'.
	 * @see javaRule.JavaDoc#isParameter()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isReturn <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return</em>'.
	 * @see javaRule.JavaDoc#isReturn()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_Return();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see javaRule.JavaDoc#isVersion()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_Version();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isThrows <em>Throws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throws</em>'.
	 * @see javaRule.JavaDoc#isThrows()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_Throws();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.JavaDoc#isSee <em>See</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>See</em>'.
	 * @see javaRule.JavaDoc#isSee()
	 * @see #getJavaDoc()
	 * @generated
	 */
	EAttribute getJavaDoc_See();

	/**
	 * Returns the meta object for class '{@link javaRule.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see javaRule.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Contains#getWhich <em>Which</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Which</em>'.
	 * @see javaRule.Contains#getWhich()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Which();

	/**
	 * Returns the meta object for class '{@link javaRule.Modifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modifiers</em>'.
	 * @see javaRule.Modifiers
	 * @generated
	 */
	EClass getModifiers();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.Modifiers#getBlend <em>Blend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blend</em>'.
	 * @see javaRule.Modifiers#getBlend()
	 * @see #getModifiers()
	 * @generated
	 */
	EReference getModifiers_Blend();

	/**
	 * Returns the meta object for class '{@link javaRule.BlendModifiers <em>Blend Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blend Modifiers</em>'.
	 * @see javaRule.BlendModifiers
	 * @generated
	 */
	EClass getBlendModifiers();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#getAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see javaRule.BlendModifiers#getAccess()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Access();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see javaRule.BlendModifiers#isStatic()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Static();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see javaRule.BlendModifiers#isFinal()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Final();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see javaRule.BlendModifiers#isAbstract()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#isSynchronized <em>Synchronized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Synchronized</em>'.
	 * @see javaRule.BlendModifiers#isSynchronized()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Synchronized();

	/**
	 * Returns the meta object for enum '{@link javaRule.Quantifier <em>Quantifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Quantifier</em>'.
	 * @see javaRule.Quantifier
	 * @generated
	 */
	EEnum getQuantifier();

	/**
	 * Returns the meta object for enum '{@link javaRule.ElementJava <em>Element Java</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Java</em>'.
	 * @see javaRule.ElementJava
	 * @generated
	 */
	EEnum getElementJava();

	/**
	 * Returns the meta object for enum '{@link javaRule.Language <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Language</em>'.
	 * @see javaRule.Language
	 * @generated
	 */
	EEnum getLanguage();

	/**
	 * Returns the meta object for enum '{@link javaRule.NameCheck <em>Name Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Check</em>'.
	 * @see javaRule.NameCheck
	 * @generated
	 */
	EEnum getNameCheck();

	/**
	 * Returns the meta object for enum '{@link javaRule.NameOperator <em>Name Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Name Operator</em>'.
	 * @see javaRule.NameOperator
	 * @generated
	 */
	EEnum getNameOperator();

	/**
	 * Returns the meta object for enum '{@link javaRule.AccessModifier <em>Access Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Access Modifier</em>'.
	 * @see javaRule.AccessModifier
	 * @generated
	 */
	EEnum getAccessModifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaRuleFactory getJavaRuleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link javaRule.impl.RuleSetImpl <em>Rule Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.RuleSetImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getRuleSet()
		 * @generated
		 */
		EClass RULE_SET = eINSTANCE.getRuleSet();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET__PROJECT_NAME = eINSTANCE.getRuleSet_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__RULES = eINSTANCE.getRuleSet_Rules();

		/**
		 * The meta object literal for the '{@link javaRule.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.RuleImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NO = eINSTANCE.getRule_No();

		/**
		 * The meta object literal for the '<em><b>Quantifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__QUANTIFIER = eINSTANCE.getRule_Quantifier();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ELEMENT = eINSTANCE.getRule_Element();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FILTER = eINSTANCE.getRule_Filter();

		/**
		 * The meta object literal for the '<em><b>Satisfy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__SATISFY = eINSTANCE.getRule_Satisfy();

		/**
		 * The meta object literal for the '{@link javaRule.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.OrImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__OP = eINSTANCE.getOr_Op();

		/**
		 * The meta object literal for the '{@link javaRule.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.AndImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OP = eINSTANCE.getAnd_Op();

		/**
		 * The meta object literal for the '{@link javaRule.impl.FilterImpl <em>Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.FilterImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getFilter()
		 * @generated
		 */
		EClass FILTER = eINSTANCE.getFilter();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER__FILTER = eINSTANCE.getFilter_Filter();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILTER__NO = eINSTANCE.getFilter_No();

		/**
		 * The meta object literal for the '{@link javaRule.impl.SatisfyImpl <em>Satisfy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.SatisfyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getSatisfy()
		 * @generated
		 */
		EClass SATISFY = eINSTANCE.getSatisfy();

		/**
		 * The meta object literal for the '{@link javaRule.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.PackageImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '{@link javaRule.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.InterfaceImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link javaRule.impl.isImplementedImpl <em>is Implemented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.isImplementedImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getisImplemented()
		 * @generated
		 */
		EClass IS_IMPLEMENTED = eINSTANCE.getisImplemented();

		/**
		 * The meta object literal for the '{@link javaRule.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.EnumerationImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ClassImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsInheritorImpl <em>Is Inheritor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsInheritorImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsInheritor()
		 * @generated
		 */
		EClass IS_INHERITOR = eINSTANCE.getIsInheritor();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ImplementsImpl <em>Implements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ImplementsImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getImplements()
		 * @generated
		 */
		EClass IMPLEMENTS = eINSTANCE.getImplements();

		/**
		 * The meta object literal for the '<em><b>Min Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTS__MIN_INTERFACE = eINSTANCE.getImplements_MinInterface();

		/**
		 * The meta object literal for the '<em><b>Max Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPLEMENTS__MAX_INTERFACE = eINSTANCE.getImplements_MaxInterface();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsExtendedImpl <em>Is Extended</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsExtendedImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsExtended()
		 * @generated
		 */
		EClass IS_EXTENDED = eINSTANCE.getIsExtended();

		/**
		 * The meta object literal for the '{@link javaRule.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.MethodImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ParameterImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Num Param</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NUM_PARAM = eINSTANCE.getParameter_NumParam();

		/**
		 * The meta object literal for the '<em><b>Types Param</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPES_PARAM = eINSTANCE.getParameter_TypesParam();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ConstructorImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ReturnImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__RETURN_TYPE = eINSTANCE.getReturn_ReturnType();

		/**
		 * The meta object literal for the '{@link javaRule.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.AttributeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link javaRule.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.AttributeTypeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getAttributeType()
		 * @generated
		 */
		EClass ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_TYPE__TYPE = eINSTANCE.getAttributeType_Type();

		/**
		 * The meta object literal for the '{@link javaRule.impl.InitializeImpl <em>Initialize</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.InitializeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getInitialize()
		 * @generated
		 */
		EClass INITIALIZE = eINSTANCE.getInitialize();

		/**
		 * The meta object literal for the '{@link javaRule.impl.NoEmptyImpl <em>No Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.NoEmptyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getNoEmpty()
		 * @generated
		 */
		EClass NO_EMPTY = eINSTANCE.getNoEmpty();

		/**
		 * The meta object literal for the '{@link javaRule.impl.NameOperationImpl <em>Name Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.NameOperationImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getNameOperation()
		 * @generated
		 */
		EClass NAME_OPERATION = eINSTANCE.getNameOperation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_OPERATION__NAME = eINSTANCE.getNameOperation_Name();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_OPERATION__OPERATOR = eINSTANCE.getNameOperation_Operator();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_OPERATION__LANGUAGE = eINSTANCE.getNameOperation_Language();

		/**
		 * The meta object literal for the '{@link javaRule.impl.NameTypeImpl <em>Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.NameTypeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getNameType()
		 * @generated
		 */
		EClass NAME_TYPE = eINSTANCE.getNameType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAME_TYPE__TYPE = eINSTANCE.getNameType_Type();

		/**
		 * The meta object literal for the '{@link javaRule.impl.JavaDocImpl <em>Java Doc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.JavaDocImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getJavaDoc()
		 * @generated
		 */
		EClass JAVA_DOC = eINSTANCE.getJavaDoc();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__AUTHOR = eINSTANCE.getJavaDoc_Author();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__PARAMETER = eINSTANCE.getJavaDoc_Parameter();

		/**
		 * The meta object literal for the '<em><b>Return</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__RETURN = eINSTANCE.getJavaDoc_Return();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__VERSION = eINSTANCE.getJavaDoc_Version();

		/**
		 * The meta object literal for the '<em><b>Throws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__THROWS = eINSTANCE.getJavaDoc_Throws();

		/**
		 * The meta object literal for the '<em><b>See</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JAVA_DOC__SEE = eINSTANCE.getJavaDoc_See();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ContainsImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Which</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__WHICH = eINSTANCE.getContains_Which();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ModifiersImpl <em>Modifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ModifiersImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getModifiers()
		 * @generated
		 */
		EClass MODIFIERS = eINSTANCE.getModifiers();

		/**
		 * The meta object literal for the '<em><b>Blend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFIERS__BLEND = eINSTANCE.getModifiers_Blend();

		/**
		 * The meta object literal for the '{@link javaRule.impl.BlendModifiersImpl <em>Blend Modifiers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.BlendModifiersImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getBlendModifiers()
		 * @generated
		 */
		EClass BLEND_MODIFIERS = eINSTANCE.getBlendModifiers();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__ACCESS = eINSTANCE.getBlendModifiers_Access();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__STATIC = eINSTANCE.getBlendModifiers_Static();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__FINAL = eINSTANCE.getBlendModifiers_Final();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__ABSTRACT = eINSTANCE.getBlendModifiers_Abstract();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__SYNCHRONIZED = eINSTANCE.getBlendModifiers_Synchronized();

		/**
		 * The meta object literal for the '{@link javaRule.Quantifier <em>Quantifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.Quantifier
		 * @see javaRule.impl.JavaRulePackageImpl#getQuantifier()
		 * @generated
		 */
		EEnum QUANTIFIER = eINSTANCE.getQuantifier();

		/**
		 * The meta object literal for the '{@link javaRule.ElementJava <em>Element Java</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.ElementJava
		 * @see javaRule.impl.JavaRulePackageImpl#getElementJava()
		 * @generated
		 */
		EEnum ELEMENT_JAVA = eINSTANCE.getElementJava();

		/**
		 * The meta object literal for the '{@link javaRule.Language <em>Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.Language
		 * @see javaRule.impl.JavaRulePackageImpl#getLanguage()
		 * @generated
		 */
		EEnum LANGUAGE = eINSTANCE.getLanguage();

		/**
		 * The meta object literal for the '{@link javaRule.NameCheck <em>Name Check</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.NameCheck
		 * @see javaRule.impl.JavaRulePackageImpl#getNameCheck()
		 * @generated
		 */
		EEnum NAME_CHECK = eINSTANCE.getNameCheck();

		/**
		 * The meta object literal for the '{@link javaRule.NameOperator <em>Name Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.NameOperator
		 * @see javaRule.impl.JavaRulePackageImpl#getNameOperator()
		 * @generated
		 */
		EEnum NAME_OPERATOR = eINSTANCE.getNameOperator();

		/**
		 * The meta object literal for the '{@link javaRule.AccessModifier <em>Access Modifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.AccessModifier
		 * @see javaRule.impl.JavaRulePackageImpl#getAccessModifier()
		 * @generated
		 */
		EEnum ACCESS_MODIFIER = eINSTANCE.getAccessModifier();

	}

} //JavaRulePackage
