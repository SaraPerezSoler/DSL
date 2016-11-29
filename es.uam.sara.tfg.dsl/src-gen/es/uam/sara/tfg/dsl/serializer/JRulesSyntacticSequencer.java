/*
 * generated by Xtext 2.10.0
 */
package es.uam.sara.tfg.dsl.serializer;

import com.google.inject.Inject;
import es.uam.sara.tfg.dsl.services.JRulesGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class JRulesSyntacticSequencer extends AbstractSyntacticSequencer {

	protected JRulesGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Constructor_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_Empty_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_Initialize_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_IsGeneric_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_IsSubClass_AreKeyword_1_1_or_IsKeyword_1_0;
	protected AbstractElementAlias match_IsSuperClass_AreKeyword_0_1_or_IsKeyword_0_0;
	protected AbstractElementAlias match_IsSuperInterface_AreKeyword_0_1_or_IsKeyword_0_0;
	protected AbstractElementAlias match_Modifiers_AreKeyword_0_1_or_IsKeyword_0_0;
	protected AbstractElementAlias match_isImplemented_AreKeyword_0_1_or_IsKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (JRulesGrammarAccess) access;
		match_Constructor_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConstructorAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getConstructorAccess().getIsKeyword_1_0()));
		match_Empty_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEmptyAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getEmptyAccess().getIsKeyword_1_0()));
		match_Initialize_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getInitializeAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getInitializeAccess().getIsKeyword_1_0()));
		match_IsGeneric_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsGenericAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getIsGenericAccess().getIsKeyword_1_0()));
		match_IsSubClass_AreKeyword_1_1_or_IsKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsSubClassAccess().getAreKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getIsSubClassAccess().getIsKeyword_1_0()));
		match_IsSuperClass_AreKeyword_0_1_or_IsKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsSuperClassAccess().getAreKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getIsSuperClassAccess().getIsKeyword_0_0()));
		match_IsSuperInterface_AreKeyword_0_1_or_IsKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsSuperInterfaceAccess().getAreKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getIsSuperInterfaceAccess().getIsKeyword_0_0()));
		match_Modifiers_AreKeyword_0_1_or_IsKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getModifiersAccess().getAreKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getModifiersAccess().getIsKeyword_0_0()));
		match_isImplemented_AreKeyword_0_1_or_IsKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsImplementedAccess().getAreKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getIsImplementedAccess().getIsKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Constructor_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_Constructor_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Empty_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_Empty_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Initialize_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_Initialize_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IsGeneric_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_IsGeneric_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IsSubClass_AreKeyword_1_1_or_IsKeyword_1_0.equals(syntax))
				emit_IsSubClass_AreKeyword_1_1_or_IsKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IsSuperClass_AreKeyword_0_1_or_IsKeyword_0_0.equals(syntax))
				emit_IsSuperClass_AreKeyword_0_1_or_IsKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IsSuperInterface_AreKeyword_0_1_or_IsKeyword_0_0.equals(syntax))
				emit_IsSuperInterface_AreKeyword_0_1_or_IsKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Modifiers_AreKeyword_0_1_or_IsKeyword_0_0.equals(syntax))
				emit_Modifiers_AreKeyword_0_1_or_IsKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_isImplemented_AreKeyword_0_1_or_IsKeyword_0_0.equals(syntax))
				emit_isImplemented_AreKeyword_0_1_or_IsKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'constructor' (rule start)
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_Constructor_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'empty' (rule start)
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_Empty_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'initialize' (rule start)
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_Initialize_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'generic' (rule start)
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_IsGeneric_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'subclass' 'of' of=StringProperty
	 *     (rule start) (ambiguity) 'subclass' (rule start)
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_IsSubClass_AreKeyword_1_1_or_IsKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'superclass' valores=RangoNames
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_IsSuperClass_AreKeyword_0_1_or_IsKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'superinterface' valores=RangoNames
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_IsSuperInterface_AreKeyword_0_1_or_IsKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'modified' 'with' '[' blend+=BlendModifiers
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_Modifiers_AreKeyword_0_1_or_IsKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'is' | 'are'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'implemented' valores=RangoNames
	 *     (rule start) (ambiguity) no?='not'
	 */
	protected void emit_isImplemented_AreKeyword_0_1_or_IsKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
