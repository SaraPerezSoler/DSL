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
import javaRule.TypeProperty;
import javaRule.TypeString;
import javaRule.Variable;
import javaRule.isImplemented;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see javaRule.JavaRulePackage
 * @generated
 */
public class JavaRuleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaRulePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaRuleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaRulePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRuleSwitch<Adapter> modelSwitch =
		new JavaRuleSwitch<Adapter>() {
			@Override
			public Adapter caseRuleSet(RuleSet object) {
				return createRuleSetAdapter();
			}
			@Override
			public Adapter caseSentence(Sentence object) {
				return createSentenceAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseOr(Or object) {
				return createOrAdapter();
			}
			@Override
			public Adapter caseAnd(And object) {
				return createAndAdapter();
			}
			@Override
			public Adapter casePrimaryOp(PrimaryOp object) {
				return createPrimaryOpAdapter();
			}
			@Override
			public Adapter casePropertyLiteral(PropertyLiteral object) {
				return createPropertyLiteralAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseFile(File object) {
				return createFileAdapter();
			}
			@Override
			public Adapter casePackage(javaRule.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseClass(javaRule.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter caseEnumeration(Enumeration object) {
				return createEnumerationAdapter();
			}
			@Override
			public Adapter caseMethod(Method object) {
				return createMethodAdapter();
			}
			@Override
			public Adapter caseAttribute(Attribute object) {
				return createAttributeAdapter();
			}
			@Override
			public Adapter caseisImplemented(isImplemented object) {
				return createisImplementedAdapter();
			}
			@Override
			public Adapter caseIsSuperInterface(IsSuperInterface object) {
				return createIsSuperInterfaceAdapter();
			}
			@Override
			public Adapter caseIsSuperClass(IsSuperClass object) {
				return createIsSuperClassAdapter();
			}
			@Override
			public Adapter caseIsSubClass(IsSubClass object) {
				return createIsSubClassAdapter();
			}
			@Override
			public Adapter caseImplements(Implements object) {
				return createImplementsAdapter();
			}
			@Override
			public Adapter caseExtends(Extends object) {
				return createExtendsAdapter();
			}
			@Override
			public Adapter caseRangoNames(RangoNames object) {
				return createRangoNamesAdapter();
			}
			@Override
			public Adapter caseTamanio(Tamanio object) {
				return createTamanioAdapter();
			}
			@Override
			public Adapter caseParameter(Parameter object) {
				return createParameterAdapter();
			}
			@Override
			public Adapter caseConstructor(Constructor object) {
				return createConstructorAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseInitialize(Initialize object) {
				return createInitializeAdapter();
			}
			@Override
			public Adapter caseEmpty(Empty object) {
				return createEmptyAdapter();
			}
			@Override
			public Adapter caseIsGeneric(IsGeneric object) {
				return createIsGenericAdapter();
			}
			@Override
			public Adapter caseNameOperation(NameOperation object) {
				return createNameOperationAdapter();
			}
			@Override
			public Adapter caseStringProperty(StringProperty object) {
				return createStringPropertyAdapter();
			}
			@Override
			public Adapter caseStringVariable(StringVariable object) {
				return createStringVariableAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object) {
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseNameType(NameType object) {
				return createNameTypeAdapter();
			}
			@Override
			public Adapter caseContains(Contains object) {
				return createContainsAdapter();
			}
			@Override
			public Adapter caseJavaDoc(JavaDoc object) {
				return createJavaDocAdapter();
			}
			@Override
			public Adapter caseModifiers(Modifiers object) {
				return createModifiersAdapter();
			}
			@Override
			public Adapter caseBlendModifiers(BlendModifiers object) {
				return createBlendModifiersAdapter();
			}
			@Override
			public Adapter caseTypeProperty(TypeProperty object) {
				return createTypePropertyAdapter();
			}
			@Override
			public Adapter caseTypeString(TypeString object) {
				return createTypeStringAdapter();
			}
			@Override
			public Adapter caseIsPrimitiveFuntion(IsPrimitiveFuntion object) {
				return createIsPrimitiveFuntionAdapter();
			}
			@Override
			public Adapter caseIsCollectionType(IsCollectionType object) {
				return createIsCollectionTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link javaRule.RuleSet <em>Rule Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.RuleSet
	 * @generated
	 */
	public Adapter createRuleSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Sentence <em>Sentence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Sentence
	 * @generated
	 */
	public Adapter createSentenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Or
	 * @generated
	 */
	public Adapter createOrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.And
	 * @generated
	 */
	public Adapter createAndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.PrimaryOp <em>Primary Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.PrimaryOp
	 * @generated
	 */
	public Adapter createPrimaryOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.PropertyLiteral <em>Property Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.PropertyLiteral
	 * @generated
	 */
	public Adapter createPropertyLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.File
	 * @generated
	 */
	public Adapter createFileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Enumeration
	 * @generated
	 */
	public Adapter createEnumerationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Method
	 * @generated
	 */
	public Adapter createMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.isImplemented <em>is Implemented</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.isImplemented
	 * @generated
	 */
	public Adapter createisImplementedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsSuperInterface <em>Is Super Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsSuperInterface
	 * @generated
	 */
	public Adapter createIsSuperInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsSuperClass <em>Is Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsSuperClass
	 * @generated
	 */
	public Adapter createIsSuperClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsSubClass <em>Is Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsSubClass
	 * @generated
	 */
	public Adapter createIsSubClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Implements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Implements
	 * @generated
	 */
	public Adapter createImplementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Extends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Extends
	 * @generated
	 */
	public Adapter createExtendsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.RangoNames <em>Rango Names</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.RangoNames
	 * @generated
	 */
	public Adapter createRangoNamesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Tamanio <em>Tamanio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Tamanio
	 * @generated
	 */
	public Adapter createTamanioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Initialize <em>Initialize</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Initialize
	 * @generated
	 */
	public Adapter createInitializeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Empty <em>Empty</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Empty
	 * @generated
	 */
	public Adapter createEmptyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsGeneric <em>Is Generic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsGeneric
	 * @generated
	 */
	public Adapter createIsGenericAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.NameOperation <em>Name Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.NameOperation
	 * @generated
	 */
	public Adapter createNameOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.StringProperty <em>String Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.StringProperty
	 * @generated
	 */
	public Adapter createStringPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.StringVariable <em>String Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.StringVariable
	 * @generated
	 */
	public Adapter createStringVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.NameType <em>Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.NameType
	 * @generated
	 */
	public Adapter createNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Contains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Contains
	 * @generated
	 */
	public Adapter createContainsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.JavaDoc <em>Java Doc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.JavaDoc
	 * @generated
	 */
	public Adapter createJavaDocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.Modifiers <em>Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.Modifiers
	 * @generated
	 */
	public Adapter createModifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.BlendModifiers <em>Blend Modifiers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.BlendModifiers
	 * @generated
	 */
	public Adapter createBlendModifiersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.TypeProperty <em>Type Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.TypeProperty
	 * @generated
	 */
	public Adapter createTypePropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.TypeString <em>Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.TypeString
	 * @generated
	 */
	public Adapter createTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsPrimitiveFuntion <em>Is Primitive Funtion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsPrimitiveFuntion
	 * @generated
	 */
	public Adapter createIsPrimitiveFuntionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link javaRule.IsCollectionType <em>Is Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see javaRule.IsCollectionType
	 * @generated
	 */
	public Adapter createIsCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaRuleAdapterFactory
