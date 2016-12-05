/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.serializer;

import com.google.inject.Inject;
import es.uam.sara.tfg.dsl.services.JRulesGrammarAccess;
import java.util.Set;
import javaRule.And;
import javaRule.AttributeType;
import javaRule.BlendModifiers;
import javaRule.Constructor;
import javaRule.Contains;
import javaRule.Empty;
import javaRule.Extends;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.IsCollectionType;
import javaRule.IsGeneric;
import javaRule.IsPrimitiveFuntion;
import javaRule.IsSubClass;
import javaRule.IsSuperClass;
import javaRule.IsSuperInterface;
import javaRule.JavaDoc;
import javaRule.JavaRulePackage;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Or;
import javaRule.PropertyLiteral;
import javaRule.RangoNames;
import javaRule.Return;
import javaRule.Rule;
import javaRule.RuleSet;
import javaRule.StringValue;
import javaRule.StringVariable;
import javaRule.Tamanio;
import javaRule.TypePrimitive;
import javaRule.TypeString;
import javaRule.Variable;
import javaRule.VariableSubtype;
import javaRule.isImplemented;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class JRulesSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JRulesGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == JavaRulePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case JavaRulePackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case JavaRulePackage.ATTRIBUTE_TYPE:
				sequence_AttributeType(context, (AttributeType) semanticObject); 
				return; 
			case JavaRulePackage.BLEND_MODIFIERS:
				sequence_BlendModifiers(context, (BlendModifiers) semanticObject); 
				return; 
			case JavaRulePackage.CONSTRUCTOR:
				sequence_Constructor(context, (Constructor) semanticObject); 
				return; 
			case JavaRulePackage.CONTAINS:
				sequence_Contains(context, (Contains) semanticObject); 
				return; 
			case JavaRulePackage.EMPTY:
				sequence_Empty(context, (Empty) semanticObject); 
				return; 
			case JavaRulePackage.EXTENDS:
				sequence_Extends(context, (Extends) semanticObject); 
				return; 
			case JavaRulePackage.IMPLEMENTS:
				sequence_Implements(context, (Implements) semanticObject); 
				return; 
			case JavaRulePackage.INITIALIZE:
				sequence_Initialize(context, (Initialize) semanticObject); 
				return; 
			case JavaRulePackage.IS_COLLECTION_TYPE:
				sequence_IsCollectionType(context, (IsCollectionType) semanticObject); 
				return; 
			case JavaRulePackage.IS_GENERIC:
				sequence_IsGeneric(context, (IsGeneric) semanticObject); 
				return; 
			case JavaRulePackage.IS_PRIMITIVE_FUNTION:
				sequence_isPrimitiveFunction(context, (IsPrimitiveFuntion) semanticObject); 
				return; 
			case JavaRulePackage.IS_SUB_CLASS:
				sequence_IsSubClass(context, (IsSubClass) semanticObject); 
				return; 
			case JavaRulePackage.IS_SUPER_CLASS:
				sequence_IsSuperClass(context, (IsSuperClass) semanticObject); 
				return; 
			case JavaRulePackage.IS_SUPER_INTERFACE:
				sequence_IsSuperInterface(context, (IsSuperInterface) semanticObject); 
				return; 
			case JavaRulePackage.JAVA_DOC:
				sequence_JavaDoc(context, (JavaDoc) semanticObject); 
				return; 
			case JavaRulePackage.MODIFIERS:
				sequence_Modifiers(context, (Modifiers) semanticObject); 
				return; 
			case JavaRulePackage.NAME_OPERATION:
				sequence_NameOperation(context, (NameOperation) semanticObject); 
				return; 
			case JavaRulePackage.NAME_TYPE:
				sequence_NameType(context, (NameType) semanticObject); 
				return; 
			case JavaRulePackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case JavaRulePackage.PARAMETER:
				sequence_Parameter(context, (javaRule.Parameter) semanticObject); 
				return; 
			case JavaRulePackage.PROPERTY_LITERAL:
				sequence_PropertyLiteral(context, (PropertyLiteral) semanticObject); 
				return; 
			case JavaRulePackage.RANGO_NAMES:
				sequence_RangoNames(context, (RangoNames) semanticObject); 
				return; 
			case JavaRulePackage.RETURN:
				sequence_Return(context, (Return) semanticObject); 
				return; 
			case JavaRulePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case JavaRulePackage.RULE_SET:
				sequence_RuleSet(context, (RuleSet) semanticObject); 
				return; 
			case JavaRulePackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case JavaRulePackage.STRING_VARIABLE:
				sequence_StringVariable(context, (StringVariable) semanticObject); 
				return; 
			case JavaRulePackage.TAMANIO:
				sequence_Tamanio(context, (Tamanio) semanticObject); 
				return; 
			case JavaRulePackage.TYPE_PRIMITIVE:
				sequence_TypePrimitive(context, (TypePrimitive) semanticObject); 
				return; 
			case JavaRulePackage.TYPE_STRING:
				sequence_TypeString(context, (TypeString) semanticObject); 
				return; 
			case JavaRulePackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case JavaRulePackage.VARIABLE_SUBTYPE:
				sequence_VariableSubtype(context, (VariableSubtype) semanticObject); 
				return; 
			case JavaRulePackage.IS_IMPLEMENTED:
				sequence_isImplemented(context, (isImplemented) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     And returns And
	 *
	 * Constraint:
	 *     (op+=PrimaryOp op+=PrimaryOp*)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns AttributeType
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     (no?='<>'? type=TypeProperty)
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     BlendModifiers returns BlendModifiers
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             access=AccessModifier 
	 *             static?='static'? 
	 *             final?='final'? 
	 *             abstract?='abstract'? 
	 *             default?='default'? 
	 *             synchronized?='synchronized'?
	 *         ) | 
	 *         (static?='static' final?='final'? abstract?='abstract'? default?='default'? synchronized?='synchronized'?) | 
	 *         (final?='final' abstract?='abstract'? default?='default'? synchronized?='synchronized'?) | 
	 *         (abstract?='abstract' default?='default'? synchronized?='synchronized'?) | 
	 *         (default?='default' synchronized?='synchronized'?) | 
	 *         synchronized?='synchronized'
	 *     )
	 */
	protected void sequence_BlendModifiers(ISerializationContext context, BlendModifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Constructor
	 *     Constructor returns Constructor
	 *
	 * Constraint:
	 *     no?='not'?
	 */
	protected void sequence_Constructor(ISerializationContext context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Contains
	 *     Contains returns Contains
	 *
	 * Constraint:
	 *     ((no?='do' | no?='don't' | no?='does' | no?='doesn't' | no?='haven't')? rule=Rule)
	 */
	protected void sequence_Contains(ISerializationContext context, Contains semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Empty
	 *     Empty returns Empty
	 *
	 * Constraint:
	 *     no?='not'?
	 */
	protected void sequence_Empty(ISerializationContext context, Empty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Extends
	 *     Extends returns Extends
	 *
	 * Constraint:
	 *     ((no?='do' | no?='don't' | no?='does' | no?='doesn't')? valores=RangoNames)
	 */
	protected void sequence_Extends(ISerializationContext context, Extends semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Implements
	 *     Implements returns Implements
	 *
	 * Constraint:
	 *     ((no?='do' | no?='don't' | no?='does' | no?='doesn't')? valores=RangoNames)
	 */
	protected void sequence_Implements(ISerializationContext context, Implements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Initialize
	 *     Initialize returns Initialize
	 *
	 * Constraint:
	 *     no?='not'?
	 */
	protected void sequence_Initialize(ISerializationContext context, Initialize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeProperty returns IsCollectionType
	 *     IsCollectionType returns IsCollectionType
	 *
	 * Constraint:
	 *     of=TypeProperty?
	 */
	protected void sequence_IsCollectionType(ISerializationContext context, IsCollectionType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns IsGeneric
	 *     IsGeneric returns IsGeneric
	 *
	 * Constraint:
	 *     no?='not'?
	 */
	protected void sequence_IsGeneric(ISerializationContext context, IsGeneric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns IsSubClass
	 *     IsSubClass returns IsSubClass
	 *
	 * Constraint:
	 *     (no?='not'? of=StringProperty?)
	 */
	protected void sequence_IsSubClass(ISerializationContext context, IsSubClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns IsSuperClass
	 *     IsSuperClass returns IsSuperClass
	 *
	 * Constraint:
	 *     (no?='not'? valores=RangoNames)
	 */
	protected void sequence_IsSuperClass(ISerializationContext context, IsSuperClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns IsSuperInterface
	 *     IsSuperInterface returns IsSuperInterface
	 *
	 * Constraint:
	 *     (no?='not'? valores=RangoNames)
	 */
	protected void sequence_IsSuperInterface(ISerializationContext context, IsSuperInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns JavaDoc
	 *     JavaDoc returns JavaDoc
	 *
	 * Constraint:
	 *     (
	 *         no?='no'? 
	 *         author?='@author'? 
	 *         parameter?='@parameter'? 
	 *         return?='@return'? 
	 *         version?='@version'? 
	 *         throws?='@throws'? 
	 *         see?='@see'?
	 *     )
	 */
	protected void sequence_JavaDoc(ISerializationContext context, JavaDoc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Modifiers
	 *     Modifiers returns Modifiers
	 *
	 * Constraint:
	 *     (no?='not'? blend+=BlendModifiers blend+=BlendModifiers*)
	 */
	protected void sequence_Modifiers(ISerializationContext context, Modifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NameOperation
	 *     NameOperation returns NameOperation
	 *
	 * Constraint:
	 *     (((no?='does'? operator=NameOperator) | no?='<>')? name=StringProperty Language=Language?)
	 */
	protected void sequence_NameOperation(ISerializationContext context, NameOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns NameType
	 *     NameType returns NameType
	 *
	 * Constraint:
	 *     (no?='<>'? type=NameCheck)
	 */
	protected void sequence_NameType(ISerializationContext context, NameType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Or returns Or
	 *     PrimaryOp returns Or
	 *
	 * Constraint:
	 *     (op+=And op+=And*)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (((no?='<>'? exact=EInt) | (min=EInt max=EInt?))? (types+=TypeProperty types+=TypeProperty*)?)
	 */
	protected void sequence_Parameter(ISerializationContext context, javaRule.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimaryOp returns PropertyLiteral
	 *     PropertyLiteral returns PropertyLiteral
	 *
	 * Constraint:
	 *     property=Property
	 */
	protected void sequence_PropertyLiteral(ISerializationContext context, PropertyLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.PROPERTY_LITERAL__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.PROPERTY_LITERAL__PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyLiteralAccess().getPropertyPropertyParserRuleCall_0(), semanticObject.getProperty());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RangoNames returns RangoNames
	 *
	 * Constraint:
	 *     ((min=EInt max=EInt?)? (types+=StringProperty types+=StringProperty*)?)
	 */
	protected void sequence_RangoNames(ISerializationContext context, RangoNames semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Return
	 *     Return returns Return
	 *
	 * Constraint:
	 *     (no?='<>'? type=TypeProperty)
	 */
	protected void sequence_Return(ISerializationContext context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RuleSet returns RuleSet
	 *
	 * Constraint:
	 *     ((ProjectName+=EString ProjectName+=EString*)? sentences+=Sentence sentences+=Sentence*)
	 */
	protected void sequence_RuleSet(ISerializationContext context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentence returns Rule
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (
	 *         no?='no'? 
	 *         quantifier=Quantifier 
	 *         element=Element 
	 *         from=[Variable|EString]? 
	 *         (in+=[Variable|EString] in+=[Variable|EString]*)? 
	 *         (using+=VariableSubtype using+=VariableSubtype*)? 
	 *         filter=Or? 
	 *         satisfy=Or?
	 *     )
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StringProperty returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=EString
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     StringProperty returns StringVariable
	 *     StringVariable returns StringVariable
	 *
	 * Constraint:
	 *     (variable=VariableSubtype strings=ElementString)
	 */
	protected void sequence_StringVariable(ISerializationContext context, StringVariable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.STRING_VARIABLE__VARIABLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.STRING_VARIABLE__VARIABLE));
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.STRING_VARIABLE__STRINGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.STRING_VARIABLE__STRINGS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringVariableAccess().getVariableVariableSubtypeParserRuleCall_0_0(), semanticObject.getVariable());
		feeder.accept(grammarAccess.getStringVariableAccess().getStringsElementStringEnumRuleCall_2_0(), semanticObject.getStrings());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Tamanio
	 *     Tamanio returns Tamanio
	 *
	 * Constraint:
	 *     ((no?='<>'? exact=EInt) | (min=EInt max=EInt?))
	 */
	protected void sequence_Tamanio(ISerializationContext context, Tamanio semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeProperty returns TypePrimitive
	 *     TypePrimitive returns TypePrimitive
	 *
	 * Constraint:
	 *     typePrimitive=Primitive
	 */
	protected void sequence_TypePrimitive(ISerializationContext context, TypePrimitive semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.TYPE_PRIMITIVE__TYPE_PRIMITIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.TYPE_PRIMITIVE__TYPE_PRIMITIVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypePrimitiveAccess().getTypePrimitivePrimitiveEnumRuleCall_1_0(), semanticObject.getTypePrimitive());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeProperty returns TypeString
	 *     TypeString returns TypeString
	 *
	 * Constraint:
	 *     typeStrng=StringProperty
	 */
	protected void sequence_TypeString(ISerializationContext context, TypeString semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.TYPE_STRING__TYPE_STRNG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.TYPE_STRING__TYPE_STRNG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeStringAccess().getTypeStrngStringPropertyParserRuleCall_0(), semanticObject.getTypeStrng());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     VariableSubtype returns VariableSubtype
	 *
	 * Constraint:
	 *     (variable=[Variable|EString] subtype=Element?)
	 */
	protected void sequence_VariableSubtype(ISerializationContext context, VariableSubtype semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Sentence returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         element=Element 
	 *         from=[Variable|EString]? 
	 *         (in+=[Variable|EString] in+=[Variable|EString]*)? 
	 *         (using+=VariableSubtype using+=VariableSubtype*)? 
	 *         satisfy=Or?
	 *     )
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns isImplemented
	 *     isImplemented returns isImplemented
	 *
	 * Constraint:
	 *     (no?='not'? valores=RangoNames)
	 */
	protected void sequence_isImplemented(ISerializationContext context, isImplemented semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeProperty returns IsPrimitiveFuntion
	 *     isPrimitiveFunction returns IsPrimitiveFuntion
	 *
	 * Constraint:
	 *     {IsPrimitiveFuntion}
	 */
	protected void sequence_isPrimitiveFunction(ISerializationContext context, IsPrimitiveFuntion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
