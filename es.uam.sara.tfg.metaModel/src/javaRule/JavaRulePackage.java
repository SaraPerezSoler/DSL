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
	 * The feature id for the '<em><b>Project Name</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Sentences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_SET__SENTENCES = 1;

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
	 * The meta object id for the '{@link javaRule.impl.SentenceImpl <em>Sentence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.SentenceImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getSentence()
	 * @generated
	 */
	int SENTENCE = 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__FROM = 1;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__IN = 2;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__SATISFY = 3;

	/**
	 * The feature id for the '<em><b>Using</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE__USING = 4;

	/**
	 * The number of structural features of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Sentence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENTENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.VariableImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 2;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ELEMENT = SENTENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM = SENTENCE__FROM;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__IN = SENTENCE__IN;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SATISFY = SENTENCE__SATISFY;

	/**
	 * The feature id for the '<em><b>Using</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__USING = SENTENCE__USING;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = SENTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.RuleImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ELEMENT = SENTENCE__ELEMENT;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FROM = SENTENCE__FROM;

	/**
	 * The feature id for the '<em><b>In</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__IN = SENTENCE__IN;

	/**
	 * The feature id for the '<em><b>Satisfy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__SATISFY = SENTENCE__SATISFY;

	/**
	 * The feature id for the '<em><b>Using</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__USING = SENTENCE__USING;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NO = SENTENCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__QUANTIFIER = SENTENCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__FILTER = SENTENCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = SENTENCE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = SENTENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.PrimaryOpImpl <em>Primary Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.PrimaryOpImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getPrimaryOp()
	 * @generated
	 */
	int PRIMARY_OP = 6;

	/**
	 * The number of structural features of the '<em>Primary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Primary Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_OP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.OrImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getOr()
	 * @generated
	 */
	int OR = 4;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OP = PRIMARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = PRIMARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = PRIMARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AndImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 5;

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
	 * The meta object id for the '{@link javaRule.impl.PropertyLiteralImpl <em>Property Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.PropertyLiteralImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getPropertyLiteral()
	 * @generated
	 */
	int PROPERTY_LITERAL = 7;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LITERAL__PROPERTY = PRIMARY_OP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LITERAL_FEATURE_COUNT = PRIMARY_OP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_LITERAL_OPERATION_COUNT = PRIMARY_OP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.PropertyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 8;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__NO = 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.FileImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 9;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.PackageImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 10;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.InterfaceImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 11;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ClassImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 12;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.EnumerationImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 13;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AttributeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 15;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NO = PROPERTY__NO;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.isImplementedImpl <em>is Implemented</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.isImplementedImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getisImplemented()
	 * @generated
	 */
	int IS_IMPLEMENTED = 16;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED__NO = INTERFACE__NO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED__VALORES = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>is Implemented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>is Implemented</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_IMPLEMENTED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsSuperInterfaceImpl <em>Is Super Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsSuperInterfaceImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsSuperInterface()
	 * @generated
	 */
	int IS_SUPER_INTERFACE = 17;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_INTERFACE__NO = INTERFACE__NO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_INTERFACE__VALORES = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Super Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_INTERFACE_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Super Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_INTERFACE_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsSuperClassImpl <em>Is Super Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsSuperClassImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsSuperClass()
	 * @generated
	 */
	int IS_SUPER_CLASS = 18;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_CLASS__NO = CLASS__NO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_CLASS__VALORES = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Super Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUPER_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsSubClassImpl <em>Is Sub Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsSubClassImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsSubClass()
	 * @generated
	 */
	int IS_SUB_CLASS = 19;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLASS__NO = CLASS__NO;

	/**
	 * The feature id for the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLASS__OF = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLASS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_SUB_CLASS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ImplementsImpl <em>Implements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ImplementsImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getImplements()
	 * @generated
	 */
	int IMPLEMENTS = 20;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__NO = CLASS__NO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS__VALORES = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Implements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLEMENTS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ExtendsImpl <em>Extends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ExtendsImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getExtends()
	 * @generated
	 */
	int EXTENDS = 21;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__NO = INTERFACE__NO;

	/**
	 * The feature id for the '<em><b>Valores</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS__VALORES = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Extends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTENDS_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.RangoNamesImpl <em>Rango Names</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.RangoNamesImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getRangoNames()
	 * @generated
	 */
	int RANGO_NAMES = 22;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGO_NAMES__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGO_NAMES__MAX = 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGO_NAMES__TYPES = 2;

	/**
	 * The number of structural features of the '<em>Rango Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGO_NAMES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Rango Names</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGO_NAMES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.TamanioImpl <em>Tamanio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.TamanioImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getTamanio()
	 * @generated
	 */
	int TAMANIO = 23;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO__NO = METHOD__NO;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO__MIN = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO__MAX = METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO__EXACT = METHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Tamanio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO_FEATURE_COUNT = METHOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Tamanio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAMANIO_OPERATION_COUNT = METHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ParameterImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 24;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NO = METHOD__NO;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MIN = METHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__MAX = METHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__EXACT = METHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPES = METHOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = METHOD_FEATURE_COUNT + 4;

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
	int CONSTRUCTOR = 25;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NO = METHOD__NO;

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
	int RETURN = 26;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__NO = METHOD__NO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__TYPE = METHOD_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link javaRule.impl.AttributeTypeImpl <em>Attribute Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.AttributeTypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 27;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_TYPE__NO = ATTRIBUTE__NO;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
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
	int INITIALIZE = 28;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INITIALIZE__NO = ATTRIBUTE__NO;

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
	 * The meta object id for the '{@link javaRule.impl.EmptyImpl <em>Empty</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.EmptyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getEmpty()
	 * @generated
	 */
	int EMPTY = 29;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY__NO = PACKAGE__NO;

	/**
	 * The number of structural features of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_FEATURE_COUNT = PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Empty</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_OPERATION_COUNT = PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsGenericImpl <em>Is Generic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsGenericImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsGeneric()
	 * @generated
	 */
	int IS_GENERIC = 30;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERIC__NO = CLASS__NO;

	/**
	 * The number of structural features of the '<em>Is Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERIC_FEATURE_COUNT = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Generic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_GENERIC_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.NameOperationImpl <em>Name Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.NameOperationImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getNameOperation()
	 * @generated
	 */
	int NAME_OPERATION = 31;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__NO = ATTRIBUTE__NO;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__OPERATOR = ATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__LANGUAGE = ATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_OPERATION__NAME = ATTRIBUTE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link javaRule.impl.StringPropertyImpl <em>String Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.StringPropertyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getStringProperty()
	 * @generated
	 */
	int STRING_PROPERTY = 32;

	/**
	 * The number of structural features of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>String Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.StringVariableImpl <em>String Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.StringVariableImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getStringVariable()
	 * @generated
	 */
	int STRING_VARIABLE = 33;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__VARIABLE = STRING_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE__STRINGS = STRING_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>String Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VARIABLE_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.VariableSubtypeImpl <em>Variable Subtype</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.VariableSubtypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getVariableSubtype()
	 * @generated
	 */
	int VARIABLE_SUBTYPE = 34;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SUBTYPE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Subtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SUBTYPE__SUBTYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SUBTYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Subtype</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SUBTYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.StringValueImpl <em>String Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.StringValueImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getStringValue()
	 * @generated
	 */
	int STRING_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE__VALUE = STRING_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_FEATURE_COUNT = STRING_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_VALUE_OPERATION_COUNT = STRING_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.NameTypeImpl <em>Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.NameTypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getNameType()
	 * @generated
	 */
	int NAME_TYPE = 36;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAME_TYPE__NO = ATTRIBUTE__NO;

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
	 * The meta object id for the '{@link javaRule.impl.ContainsImpl <em>Contains</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ContainsImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getContains()
	 * @generated
	 */
	int CONTAINS = 37;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__NO = CLASS__NO;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS__RULE = CLASS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_FEATURE_COUNT = CLASS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Contains</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_OPERATION_COUNT = CLASS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.JavaDocImpl <em>Java Doc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.JavaDocImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getJavaDoc()
	 * @generated
	 */
	int JAVA_DOC = 38;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_DOC__NO = ATTRIBUTE__NO;

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
	 * The meta object id for the '{@link javaRule.impl.ModifiersImpl <em>Modifiers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.ModifiersImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getModifiers()
	 * @generated
	 */
	int MODIFIERS = 39;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFIERS__NO = ATTRIBUTE__NO;

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
	int BLEND_MODIFIERS = 40;

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
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__DEFAULT = 4;

	/**
	 * The feature id for the '<em><b>Synchronized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS__SYNCHRONIZED = 5;

	/**
	 * The number of structural features of the '<em>Blend Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Blend Modifiers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLEND_MODIFIERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.TypePropertyImpl <em>Type Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.TypePropertyImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getTypeProperty()
	 * @generated
	 */
	int TYPE_PROPERTY = 41;

	/**
	 * The number of structural features of the '<em>Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PROPERTY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.TypeStringImpl <em>Type String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.TypeStringImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getTypeString()
	 * @generated
	 */
	int TYPE_STRING = 42;

	/**
	 * The feature id for the '<em><b>Type Strng</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING__TYPE_STRNG = TYPE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING__TYPE_PRIMITIVE = TYPE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING_FEATURE_COUNT = TYPE_PROPERTY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_STRING_OPERATION_COUNT = TYPE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsPrimitiveFuntionImpl <em>Is Primitive Funtion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsPrimitiveFuntionImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsPrimitiveFuntion()
	 * @generated
	 */
	int IS_PRIMITIVE_FUNTION = 43;

	/**
	 * The number of structural features of the '<em>Is Primitive Funtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PRIMITIVE_FUNTION_FEATURE_COUNT = TYPE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Is Primitive Funtion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_PRIMITIVE_FUNTION_OPERATION_COUNT = TYPE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.impl.IsCollectionTypeImpl <em>Is Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.impl.IsCollectionTypeImpl
	 * @see javaRule.impl.JavaRulePackageImpl#getIsCollectionType()
	 * @generated
	 */
	int IS_COLLECTION_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_COLLECTION_TYPE__OF = TYPE_PROPERTY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Is Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_COLLECTION_TYPE_FEATURE_COUNT = TYPE_PROPERTY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Is Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IS_COLLECTION_TYPE_OPERATION_COUNT = TYPE_PROPERTY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link javaRule.Quantifier <em>Quantifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Quantifier
	 * @see javaRule.impl.JavaRulePackageImpl#getQuantifier()
	 * @generated
	 */
	int QUANTIFIER = 45;

	/**
	 * The meta object id for the '{@link javaRule.Element <em>Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Element
	 * @see javaRule.impl.JavaRulePackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 46;

	/**
	 * The meta object id for the '{@link javaRule.ElementString <em>Element String</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.ElementString
	 * @see javaRule.impl.JavaRulePackageImpl#getElementString()
	 * @generated
	 */
	int ELEMENT_STRING = 47;

	/**
	 * The meta object id for the '{@link javaRule.Language <em>Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Language
	 * @see javaRule.impl.JavaRulePackageImpl#getLanguage()
	 * @generated
	 */
	int LANGUAGE = 48;

	/**
	 * The meta object id for the '{@link javaRule.NameCheck <em>Name Check</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.NameCheck
	 * @see javaRule.impl.JavaRulePackageImpl#getNameCheck()
	 * @generated
	 */
	int NAME_CHECK = 49;

	/**
	 * The meta object id for the '{@link javaRule.NameOperator <em>Name Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.NameOperator
	 * @see javaRule.impl.JavaRulePackageImpl#getNameOperator()
	 * @generated
	 */
	int NAME_OPERATOR = 50;

	/**
	 * The meta object id for the '{@link javaRule.AccessModifier <em>Access Modifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.AccessModifier
	 * @see javaRule.impl.JavaRulePackageImpl#getAccessModifier()
	 * @generated
	 */
	int ACCESS_MODIFIER = 51;

	/**
	 * The meta object id for the '{@link javaRule.Primitive <em>Primitive</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javaRule.Primitive
	 * @see javaRule.impl.JavaRulePackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 52;


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
	 * Returns the meta object for the attribute list '{@link javaRule.RuleSet#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Project Name</em>'.
	 * @see javaRule.RuleSet#getProjectName()
	 * @see #getRuleSet()
	 * @generated
	 */
	EAttribute getRuleSet_ProjectName();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.RuleSet#getSentences <em>Sentences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sentences</em>'.
	 * @see javaRule.RuleSet#getSentences()
	 * @see #getRuleSet()
	 * @generated
	 */
	EReference getRuleSet_Sentences();

	/**
	 * Returns the meta object for class '{@link javaRule.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sentence</em>'.
	 * @see javaRule.Sentence
	 * @generated
	 */
	EClass getSentence();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Sentence#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see javaRule.Sentence#getElement()
	 * @see #getSentence()
	 * @generated
	 */
	EAttribute getSentence_Element();

	/**
	 * Returns the meta object for the reference '{@link javaRule.Sentence#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see javaRule.Sentence#getFrom()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_From();

	/**
	 * Returns the meta object for the reference list '{@link javaRule.Sentence#getIn <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>In</em>'.
	 * @see javaRule.Sentence#getIn()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_In();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Sentence#getSatisfy <em>Satisfy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Satisfy</em>'.
	 * @see javaRule.Sentence#getSatisfy()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Satisfy();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.Sentence#getUsing <em>Using</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Using</em>'.
	 * @see javaRule.Sentence#getUsing()
	 * @see #getSentence()
	 * @generated
	 */
	EReference getSentence_Using();

	/**
	 * Returns the meta object for class '{@link javaRule.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see javaRule.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see javaRule.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

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
	 * Returns the meta object for class '{@link javaRule.PrimaryOp <em>Primary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Op</em>'.
	 * @see javaRule.PrimaryOp
	 * @generated
	 */
	EClass getPrimaryOp();

	/**
	 * Returns the meta object for class '{@link javaRule.PropertyLiteral <em>Property Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Literal</em>'.
	 * @see javaRule.PropertyLiteral
	 * @generated
	 */
	EClass getPropertyLiteral();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.PropertyLiteral#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property</em>'.
	 * @see javaRule.PropertyLiteral#getProperty()
	 * @see #getPropertyLiteral()
	 * @generated
	 */
	EReference getPropertyLiteral_Property();

	/**
	 * Returns the meta object for class '{@link javaRule.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see javaRule.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Property#isNo <em>No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see javaRule.Property#isNo()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_No();

	/**
	 * Returns the meta object for class '{@link javaRule.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see javaRule.File
	 * @generated
	 */
	EClass getFile();

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
	 * Returns the meta object for class '{@link javaRule.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see javaRule.Class
	 * @generated
	 */
	EClass getClass_();

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
	 * Returns the meta object for class '{@link javaRule.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see javaRule.Method
	 * @generated
	 */
	EClass getMethod();

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
	 * Returns the meta object for class '{@link javaRule.isImplemented <em>is Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>is Implemented</em>'.
	 * @see javaRule.isImplemented
	 * @generated
	 */
	EClass getisImplemented();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.isImplemented#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valores</em>'.
	 * @see javaRule.isImplemented#getValores()
	 * @see #getisImplemented()
	 * @generated
	 */
	EReference getisImplemented_Valores();

	/**
	 * Returns the meta object for class '{@link javaRule.IsSuperInterface <em>Is Super Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Super Interface</em>'.
	 * @see javaRule.IsSuperInterface
	 * @generated
	 */
	EClass getIsSuperInterface();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.IsSuperInterface#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valores</em>'.
	 * @see javaRule.IsSuperInterface#getValores()
	 * @see #getIsSuperInterface()
	 * @generated
	 */
	EReference getIsSuperInterface_Valores();

	/**
	 * Returns the meta object for class '{@link javaRule.IsSuperClass <em>Is Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Super Class</em>'.
	 * @see javaRule.IsSuperClass
	 * @generated
	 */
	EClass getIsSuperClass();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.IsSuperClass#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valores</em>'.
	 * @see javaRule.IsSuperClass#getValores()
	 * @see #getIsSuperClass()
	 * @generated
	 */
	EReference getIsSuperClass_Valores();

	/**
	 * Returns the meta object for class '{@link javaRule.IsSubClass <em>Is Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Sub Class</em>'.
	 * @see javaRule.IsSubClass
	 * @generated
	 */
	EClass getIsSubClass();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.IsSubClass#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Of</em>'.
	 * @see javaRule.IsSubClass#getOf()
	 * @see #getIsSubClass()
	 * @generated
	 */
	EReference getIsSubClass_Of();

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
	 * Returns the meta object for the containment reference '{@link javaRule.Implements#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valores</em>'.
	 * @see javaRule.Implements#getValores()
	 * @see #getImplements()
	 * @generated
	 */
	EReference getImplements_Valores();

	/**
	 * Returns the meta object for class '{@link javaRule.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extends</em>'.
	 * @see javaRule.Extends
	 * @generated
	 */
	EClass getExtends();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Extends#getValores <em>Valores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valores</em>'.
	 * @see javaRule.Extends#getValores()
	 * @see #getExtends()
	 * @generated
	 */
	EReference getExtends_Valores();

	/**
	 * Returns the meta object for class '{@link javaRule.RangoNames <em>Rango Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rango Names</em>'.
	 * @see javaRule.RangoNames
	 * @generated
	 */
	EClass getRangoNames();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.RangoNames#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see javaRule.RangoNames#getMin()
	 * @see #getRangoNames()
	 * @generated
	 */
	EAttribute getRangoNames_Min();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.RangoNames#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see javaRule.RangoNames#getMax()
	 * @see #getRangoNames()
	 * @generated
	 */
	EAttribute getRangoNames_Max();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.RangoNames#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see javaRule.RangoNames#getTypes()
	 * @see #getRangoNames()
	 * @generated
	 */
	EReference getRangoNames_Types();

	/**
	 * Returns the meta object for class '{@link javaRule.Tamanio <em>Tamanio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tamanio</em>'.
	 * @see javaRule.Tamanio
	 * @generated
	 */
	EClass getTamanio();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Tamanio#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see javaRule.Tamanio#getMin()
	 * @see #getTamanio()
	 * @generated
	 */
	EAttribute getTamanio_Min();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Tamanio#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see javaRule.Tamanio#getMax()
	 * @see #getTamanio()
	 * @generated
	 */
	EAttribute getTamanio_Max();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Tamanio#getExact <em>Exact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact</em>'.
	 * @see javaRule.Tamanio#getExact()
	 * @see #getTamanio()
	 * @generated
	 */
	EAttribute getTamanio_Exact();

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
	 * Returns the meta object for the attribute '{@link javaRule.Parameter#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see javaRule.Parameter#getMin()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Min();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Parameter#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see javaRule.Parameter#getMax()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Max();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.Parameter#getExact <em>Exact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exact</em>'.
	 * @see javaRule.Parameter#getExact()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Exact();

	/**
	 * Returns the meta object for the containment reference list '{@link javaRule.Parameter#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see javaRule.Parameter#getTypes()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Types();

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
	 * Returns the meta object for the containment reference '{@link javaRule.Return#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see javaRule.Return#getType()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Type();

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
	 * Returns the meta object for the containment reference '{@link javaRule.AttributeType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see javaRule.AttributeType#getType()
	 * @see #getAttributeType()
	 * @generated
	 */
	EReference getAttributeType_Type();

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
	 * Returns the meta object for class '{@link javaRule.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty</em>'.
	 * @see javaRule.Empty
	 * @generated
	 */
	EClass getEmpty();

	/**
	 * Returns the meta object for class '{@link javaRule.IsGeneric <em>Is Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Generic</em>'.
	 * @see javaRule.IsGeneric
	 * @generated
	 */
	EClass getIsGeneric();

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
	 * Returns the meta object for the containment reference '{@link javaRule.NameOperation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see javaRule.NameOperation#getName()
	 * @see #getNameOperation()
	 * @generated
	 */
	EReference getNameOperation_Name();

	/**
	 * Returns the meta object for class '{@link javaRule.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Property</em>'.
	 * @see javaRule.StringProperty
	 * @generated
	 */
	EClass getStringProperty();

	/**
	 * Returns the meta object for class '{@link javaRule.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Variable</em>'.
	 * @see javaRule.StringVariable
	 * @generated
	 */
	EClass getStringVariable();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.StringVariable#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see javaRule.StringVariable#getVariable()
	 * @see #getStringVariable()
	 * @generated
	 */
	EReference getStringVariable_Variable();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.StringVariable#getStrings <em>Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strings</em>'.
	 * @see javaRule.StringVariable#getStrings()
	 * @see #getStringVariable()
	 * @generated
	 */
	EAttribute getStringVariable_Strings();

	/**
	 * Returns the meta object for class '{@link javaRule.VariableSubtype <em>Variable Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Subtype</em>'.
	 * @see javaRule.VariableSubtype
	 * @generated
	 */
	EClass getVariableSubtype();

	/**
	 * Returns the meta object for the reference '{@link javaRule.VariableSubtype#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see javaRule.VariableSubtype#getVariable()
	 * @see #getVariableSubtype()
	 * @generated
	 */
	EReference getVariableSubtype_Variable();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.VariableSubtype#getSubtype <em>Subtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtype</em>'.
	 * @see javaRule.VariableSubtype#getSubtype()
	 * @see #getVariableSubtype()
	 * @generated
	 */
	EAttribute getVariableSubtype_Subtype();

	/**
	 * Returns the meta object for class '{@link javaRule.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Value</em>'.
	 * @see javaRule.StringValue
	 * @generated
	 */
	EClass getStringValue();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.StringValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see javaRule.StringValue#getValue()
	 * @see #getStringValue()
	 * @generated
	 */
	EAttribute getStringValue_Value();

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
	 * Returns the meta object for class '{@link javaRule.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains</em>'.
	 * @see javaRule.Contains
	 * @generated
	 */
	EClass getContains();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.Contains#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rule</em>'.
	 * @see javaRule.Contains#getRule()
	 * @see #getContains()
	 * @generated
	 */
	EReference getContains_Rule();

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
	 * Returns the meta object for the attribute '{@link javaRule.BlendModifiers#isDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see javaRule.BlendModifiers#isDefault()
	 * @see #getBlendModifiers()
	 * @generated
	 */
	EAttribute getBlendModifiers_Default();

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
	 * Returns the meta object for class '{@link javaRule.TypeProperty <em>Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Property</em>'.
	 * @see javaRule.TypeProperty
	 * @generated
	 */
	EClass getTypeProperty();

	/**
	 * Returns the meta object for class '{@link javaRule.TypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type String</em>'.
	 * @see javaRule.TypeString
	 * @generated
	 */
	EClass getTypeString();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.TypeString#getTypeStrng <em>Type Strng</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type Strng</em>'.
	 * @see javaRule.TypeString#getTypeStrng()
	 * @see #getTypeString()
	 * @generated
	 */
	EReference getTypeString_TypeStrng();

	/**
	 * Returns the meta object for the attribute '{@link javaRule.TypeString#getTypePrimitive <em>Type Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Primitive</em>'.
	 * @see javaRule.TypeString#getTypePrimitive()
	 * @see #getTypeString()
	 * @generated
	 */
	EAttribute getTypeString_TypePrimitive();

	/**
	 * Returns the meta object for class '{@link javaRule.IsPrimitiveFuntion <em>Is Primitive Funtion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Primitive Funtion</em>'.
	 * @see javaRule.IsPrimitiveFuntion
	 * @generated
	 */
	EClass getIsPrimitiveFuntion();

	/**
	 * Returns the meta object for class '{@link javaRule.IsCollectionType <em>Is Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Is Collection Type</em>'.
	 * @see javaRule.IsCollectionType
	 * @generated
	 */
	EClass getIsCollectionType();

	/**
	 * Returns the meta object for the containment reference '{@link javaRule.IsCollectionType#getOf <em>Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Of</em>'.
	 * @see javaRule.IsCollectionType#getOf()
	 * @see #getIsCollectionType()
	 * @generated
	 */
	EReference getIsCollectionType_Of();

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
	 * Returns the meta object for enum '{@link javaRule.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element</em>'.
	 * @see javaRule.Element
	 * @generated
	 */
	EEnum getElement();

	/**
	 * Returns the meta object for enum '{@link javaRule.ElementString <em>Element String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element String</em>'.
	 * @see javaRule.ElementString
	 * @generated
	 */
	EEnum getElementString();

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
	 * Returns the meta object for enum '{@link javaRule.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive</em>'.
	 * @see javaRule.Primitive
	 * @generated
	 */
	EEnum getPrimitive();

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
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE_SET__PROJECT_NAME = eINSTANCE.getRuleSet_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Sentences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_SET__SENTENCES = eINSTANCE.getRuleSet_Sentences();

		/**
		 * The meta object literal for the '{@link javaRule.impl.SentenceImpl <em>Sentence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.SentenceImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getSentence()
		 * @generated
		 */
		EClass SENTENCE = eINSTANCE.getSentence();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENTENCE__ELEMENT = eINSTANCE.getSentence_Element();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__FROM = eINSTANCE.getSentence_From();

		/**
		 * The meta object literal for the '<em><b>In</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__IN = eINSTANCE.getSentence_In();

		/**
		 * The meta object literal for the '<em><b>Satisfy</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__SATISFY = eINSTANCE.getSentence_Satisfy();

		/**
		 * The meta object literal for the '<em><b>Using</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENTENCE__USING = eINSTANCE.getSentence_Using();

		/**
		 * The meta object literal for the '{@link javaRule.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.VariableImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

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
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__FILTER = eINSTANCE.getRule_Filter();

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
		 * The meta object literal for the '{@link javaRule.impl.PrimaryOpImpl <em>Primary Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.PrimaryOpImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getPrimaryOp()
		 * @generated
		 */
		EClass PRIMARY_OP = eINSTANCE.getPrimaryOp();

		/**
		 * The meta object literal for the '{@link javaRule.impl.PropertyLiteralImpl <em>Property Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.PropertyLiteralImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getPropertyLiteral()
		 * @generated
		 */
		EClass PROPERTY_LITERAL = eINSTANCE.getPropertyLiteral();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_LITERAL__PROPERTY = eINSTANCE.getPropertyLiteral_Property();

		/**
		 * The meta object literal for the '{@link javaRule.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.PropertyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__NO = eINSTANCE.getProperty_No();

		/**
		 * The meta object literal for the '{@link javaRule.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.FileImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

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
		 * The meta object literal for the '{@link javaRule.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ClassImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

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
		 * The meta object literal for the '{@link javaRule.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.MethodImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

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
		 * The meta object literal for the '{@link javaRule.impl.isImplementedImpl <em>is Implemented</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.isImplementedImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getisImplemented()
		 * @generated
		 */
		EClass IS_IMPLEMENTED = eINSTANCE.getisImplemented();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_IMPLEMENTED__VALORES = eINSTANCE.getisImplemented_Valores();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsSuperInterfaceImpl <em>Is Super Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsSuperInterfaceImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsSuperInterface()
		 * @generated
		 */
		EClass IS_SUPER_INTERFACE = eINSTANCE.getIsSuperInterface();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SUPER_INTERFACE__VALORES = eINSTANCE.getIsSuperInterface_Valores();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsSuperClassImpl <em>Is Super Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsSuperClassImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsSuperClass()
		 * @generated
		 */
		EClass IS_SUPER_CLASS = eINSTANCE.getIsSuperClass();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SUPER_CLASS__VALORES = eINSTANCE.getIsSuperClass_Valores();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsSubClassImpl <em>Is Sub Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsSubClassImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsSubClass()
		 * @generated
		 */
		EClass IS_SUB_CLASS = eINSTANCE.getIsSubClass();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_SUB_CLASS__OF = eINSTANCE.getIsSubClass_Of();

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
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLEMENTS__VALORES = eINSTANCE.getImplements_Valores();

		/**
		 * The meta object literal for the '{@link javaRule.impl.ExtendsImpl <em>Extends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ExtendsImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getExtends()
		 * @generated
		 */
		EClass EXTENDS = eINSTANCE.getExtends();

		/**
		 * The meta object literal for the '<em><b>Valores</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTENDS__VALORES = eINSTANCE.getExtends_Valores();

		/**
		 * The meta object literal for the '{@link javaRule.impl.RangoNamesImpl <em>Rango Names</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.RangoNamesImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getRangoNames()
		 * @generated
		 */
		EClass RANGO_NAMES = eINSTANCE.getRangoNames();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGO_NAMES__MIN = eINSTANCE.getRangoNames_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGO_NAMES__MAX = eINSTANCE.getRangoNames_Max();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RANGO_NAMES__TYPES = eINSTANCE.getRangoNames_Types();

		/**
		 * The meta object literal for the '{@link javaRule.impl.TamanioImpl <em>Tamanio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.TamanioImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getTamanio()
		 * @generated
		 */
		EClass TAMANIO = eINSTANCE.getTamanio();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAMANIO__MIN = eINSTANCE.getTamanio_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAMANIO__MAX = eINSTANCE.getTamanio_Max();

		/**
		 * The meta object literal for the '<em><b>Exact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAMANIO__EXACT = eINSTANCE.getTamanio_Exact();

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
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MIN = eINSTANCE.getParameter_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__MAX = eINSTANCE.getParameter_Max();

		/**
		 * The meta object literal for the '<em><b>Exact</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__EXACT = eINSTANCE.getParameter_Exact();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPES = eINSTANCE.getParameter_Types();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__TYPE = eINSTANCE.getReturn_Type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_TYPE__TYPE = eINSTANCE.getAttributeType_Type();

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
		 * The meta object literal for the '{@link javaRule.impl.EmptyImpl <em>Empty</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.EmptyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getEmpty()
		 * @generated
		 */
		EClass EMPTY = eINSTANCE.getEmpty();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsGenericImpl <em>Is Generic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsGenericImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsGeneric()
		 * @generated
		 */
		EClass IS_GENERIC = eINSTANCE.getIsGeneric();

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
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAME_OPERATION__NAME = eINSTANCE.getNameOperation_Name();

		/**
		 * The meta object literal for the '{@link javaRule.impl.StringPropertyImpl <em>String Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.StringPropertyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getStringProperty()
		 * @generated
		 */
		EClass STRING_PROPERTY = eINSTANCE.getStringProperty();

		/**
		 * The meta object literal for the '{@link javaRule.impl.StringVariableImpl <em>String Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.StringVariableImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getStringVariable()
		 * @generated
		 */
		EClass STRING_VARIABLE = eINSTANCE.getStringVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_VARIABLE__VARIABLE = eINSTANCE.getStringVariable_Variable();

		/**
		 * The meta object literal for the '<em><b>Strings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VARIABLE__STRINGS = eINSTANCE.getStringVariable_Strings();

		/**
		 * The meta object literal for the '{@link javaRule.impl.VariableSubtypeImpl <em>Variable Subtype</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.VariableSubtypeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getVariableSubtype()
		 * @generated
		 */
		EClass VARIABLE_SUBTYPE = eINSTANCE.getVariableSubtype();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_SUBTYPE__VARIABLE = eINSTANCE.getVariableSubtype_Variable();

		/**
		 * The meta object literal for the '<em><b>Subtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_SUBTYPE__SUBTYPE = eINSTANCE.getVariableSubtype_Subtype();

		/**
		 * The meta object literal for the '{@link javaRule.impl.StringValueImpl <em>String Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.StringValueImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getStringValue()
		 * @generated
		 */
		EClass STRING_VALUE = eINSTANCE.getStringValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_VALUE__VALUE = eINSTANCE.getStringValue_Value();

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
		 * The meta object literal for the '{@link javaRule.impl.ContainsImpl <em>Contains</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.ContainsImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getContains()
		 * @generated
		 */
		EClass CONTAINS = eINSTANCE.getContains();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS__RULE = eINSTANCE.getContains_Rule();

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
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__DEFAULT = eINSTANCE.getBlendModifiers_Default();

		/**
		 * The meta object literal for the '<em><b>Synchronized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLEND_MODIFIERS__SYNCHRONIZED = eINSTANCE.getBlendModifiers_Synchronized();

		/**
		 * The meta object literal for the '{@link javaRule.impl.TypePropertyImpl <em>Type Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.TypePropertyImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getTypeProperty()
		 * @generated
		 */
		EClass TYPE_PROPERTY = eINSTANCE.getTypeProperty();

		/**
		 * The meta object literal for the '{@link javaRule.impl.TypeStringImpl <em>Type String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.TypeStringImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getTypeString()
		 * @generated
		 */
		EClass TYPE_STRING = eINSTANCE.getTypeString();

		/**
		 * The meta object literal for the '<em><b>Type Strng</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_STRING__TYPE_STRNG = eINSTANCE.getTypeString_TypeStrng();

		/**
		 * The meta object literal for the '<em><b>Type Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_STRING__TYPE_PRIMITIVE = eINSTANCE.getTypeString_TypePrimitive();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsPrimitiveFuntionImpl <em>Is Primitive Funtion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsPrimitiveFuntionImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsPrimitiveFuntion()
		 * @generated
		 */
		EClass IS_PRIMITIVE_FUNTION = eINSTANCE.getIsPrimitiveFuntion();

		/**
		 * The meta object literal for the '{@link javaRule.impl.IsCollectionTypeImpl <em>Is Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.impl.IsCollectionTypeImpl
		 * @see javaRule.impl.JavaRulePackageImpl#getIsCollectionType()
		 * @generated
		 */
		EClass IS_COLLECTION_TYPE = eINSTANCE.getIsCollectionType();

		/**
		 * The meta object literal for the '<em><b>Of</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IS_COLLECTION_TYPE__OF = eINSTANCE.getIsCollectionType_Of();

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
		 * The meta object literal for the '{@link javaRule.Element <em>Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.Element
		 * @see javaRule.impl.JavaRulePackageImpl#getElement()
		 * @generated
		 */
		EEnum ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link javaRule.ElementString <em>Element String</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.ElementString
		 * @see javaRule.impl.JavaRulePackageImpl#getElementString()
		 * @generated
		 */
		EEnum ELEMENT_STRING = eINSTANCE.getElementString();

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

		/**
		 * The meta object literal for the '{@link javaRule.Primitive <em>Primitive</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javaRule.Primitive
		 * @see javaRule.impl.JavaRulePackageImpl#getPrimitive()
		 * @generated
		 */
		EEnum PRIMITIVE = eINSTANCE.getPrimitive();

	}

} //JavaRulePackage
