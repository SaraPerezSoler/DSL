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
import javaRule.Filter;
import javaRule.Implements;
import javaRule.Initialize;
import javaRule.IsExtended;
import javaRule.IsGeneric;
import javaRule.IsInheritor;
import javaRule.JavaDoc;
import javaRule.JavaRulePackage;
import javaRule.Modifiers;
import javaRule.NameOperation;
import javaRule.NameType;
import javaRule.Or;
import javaRule.Return;
import javaRule.Rule;
import javaRule.RuleSet;
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
			case JavaRulePackage.FILTER:
				sequence_Filter(context, (Filter) semanticObject); 
				return; 
			case JavaRulePackage.IMPLEMENTS:
				sequence_Implements(context, (Implements) semanticObject); 
				return; 
			case JavaRulePackage.INITIALIZE:
				sequence_Initialize(context, (Initialize) semanticObject); 
				return; 
			case JavaRulePackage.IS_EXTENDED:
				sequence_IsExtended(context, (IsExtended) semanticObject); 
				return; 
			case JavaRulePackage.IS_GENERIC:
				sequence_IsGeneric(context, (IsGeneric) semanticObject); 
				return; 
			case JavaRulePackage.IS_INHERITOR:
				sequence_IsInheritor(context, (IsInheritor) semanticObject); 
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
			case JavaRulePackage.RETURN:
				sequence_Return(context, (Return) semanticObject); 
				return; 
			case JavaRulePackage.RULE:
				sequence_Rule(context, (Rule) semanticObject); 
				return; 
			case JavaRulePackage.RULE_SET:
				sequence_RuleSet(context, (RuleSet) semanticObject); 
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
	 *     ((op+=Satisfy op+=Satisfy*) | (op+=Satisfy op+=Satisfy*))
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns AttributeType
	 *     AttributeType returns AttributeType
	 *
	 * Constraint:
	 *     Type=EString
	 */
	protected void sequence_AttributeType(ISerializationContext context, AttributeType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.ATTRIBUTE_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.ATTRIBUTE_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeTypeAccess().getTypeEStringParserRuleCall_1_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     BlendModifiers returns BlendModifiers
	 *
	 * Constraint:
	 *     (
	 *         (access=AccessModifier static?='static'? final?='final'? abstract?='abstract'? synchronized?='synchronized'?) | 
	 *         (static?='static' final?='final'? abstract?='abstract'? synchronized?='synchronized'?) | 
	 *         (final?='final' abstract?='abstract'? synchronized?='synchronized'?) | 
	 *         (abstract?='abstract' synchronized?='synchronized'?) | 
	 *         synchronized?='synchronized'
	 *     )
	 */
	protected void sequence_BlendModifiers(ISerializationContext context, BlendModifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Constructor
	 *     Constructor returns Constructor
	 *
	 * Constraint:
	 *     {Constructor}
	 */
	protected void sequence_Constructor(ISerializationContext context, Constructor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Contains
	 *     Contains returns Contains
	 *
	 * Constraint:
	 *     which=Rule
	 */
	protected void sequence_Contains(ISerializationContext context, Contains semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.CONTAINS__WHICH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.CONTAINS__WHICH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0(), semanticObject.getWhich());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Empty
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
	 *     Filter returns Filter
	 *
	 * Constraint:
	 *     (no?='no'? filter=Or)
	 */
	protected void sequence_Filter(ISerializationContext context, Filter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Implements
	 *     Implements returns Implements
	 *
	 * Constraint:
	 *     ((minInterface=EInt maxInterface=EInt) | minInterface=EInt)?
	 */
	protected void sequence_Implements(ISerializationContext context, Implements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Initialize
	 *     Initialize returns Initialize
	 *
	 * Constraint:
	 *     {Initialize}
	 */
	protected void sequence_Initialize(ISerializationContext context, Initialize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns IsExtended
	 *     IsExtended returns IsExtended
	 *
	 * Constraint:
	 *     {IsExtended}
	 */
	protected void sequence_IsExtended(ISerializationContext context, IsExtended semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns IsGeneric
	 *     IsGeneric returns IsGeneric
	 *
	 * Constraint:
	 *     {IsGeneric}
	 */
	protected void sequence_IsGeneric(ISerializationContext context, IsGeneric semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns IsInheritor
	 *     IsInheritor returns IsInheritor
	 *
	 * Constraint:
	 *     {IsInheritor}
	 */
	protected void sequence_IsInheritor(ISerializationContext context, IsInheritor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns JavaDoc
	 *     JavaDoc returns JavaDoc
	 *
	 * Constraint:
	 *     (
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
	 *     Satisfy returns Modifiers
	 *     Modifiers returns Modifiers
	 *
	 * Constraint:
	 *     ((blend+=BlendModifiers blend+=BlendModifiers*) | (blend+=BlendModifiers blend+=BlendModifiers*))
	 */
	protected void sequence_Modifiers(ISerializationContext context, Modifiers semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns NameOperation
	 *     NameOperation returns NameOperation
	 *
	 * Constraint:
	 *     (operator=NameOperator name=EString Language=Language?)
	 */
	protected void sequence_NameOperation(ISerializationContext context, NameOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns NameType
	 *     NameType returns NameType
	 *
	 * Constraint:
	 *     type=NameCheck
	 */
	protected void sequence_NameType(ISerializationContext context, NameType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.NAME_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.NAME_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNameTypeAccess().getTypeNameCheckEnumRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Or returns Or
	 *
	 * Constraint:
	 *     (op+=And op+=And*)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (numParam=EInt (typesParam+=EString typesParam+=EString*)?)
	 */
	protected void sequence_Parameter(ISerializationContext context, javaRule.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns Return
	 *     Return returns Return
	 *
	 * Constraint:
	 *     returnType=EString
	 */
	protected void sequence_Return(ISerializationContext context, Return semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, JavaRulePackage.Literals.RETURN__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JavaRulePackage.Literals.RETURN__RETURN_TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getReturnAccess().getReturnTypeEStringParserRuleCall_2_0(), semanticObject.getReturnType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RuleSet returns RuleSet
	 *
	 * Constraint:
	 *     (ProjectName+=EString ProjectName+=EString* rules+=Rule rules+=Rule*)
	 */
	protected void sequence_RuleSet(ISerializationContext context, RuleSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Rule returns Rule
	 *
	 * Constraint:
	 *     (no?='no'? quantifier=Quantifier element=ElementJava filter=Filter? satisfy=Or?)
	 */
	protected void sequence_Rule(ISerializationContext context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Satisfy returns isImplemented
	 *     isImplemented returns isImplemented
	 *
	 * Constraint:
	 *     {isImplemented}
	 */
	protected void sequence_isImplemented(ISerializationContext context, isImplemented semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
