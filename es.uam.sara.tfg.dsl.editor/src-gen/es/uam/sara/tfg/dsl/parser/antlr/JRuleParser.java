/*
 * generated by Xtext 2.9.2
 */
package es.uam.sara.tfg.dsl.parser.antlr;

import com.google.inject.Inject;
import es.uam.sara.tfg.dsl.parser.antlr.internal.InternalJRuleParser;
import es.uam.sara.tfg.dsl.services.JRuleGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class JRuleParser extends AbstractAntlrParser {

	@Inject
	private JRuleGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalJRuleParser createParser(XtextTokenStream stream) {
		return new InternalJRuleParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "RuleSet";
	}

	public JRuleGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(JRuleGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}