package es.uam.sara.tfg.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import es.uam.sara.tfg.dsl.services.JRulesGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Projects'", "'Name:'", "','", "'*'", "':'", "'satisfy'", "'no'", "'in'", "'which'", "'or'", "'and'", "'('", "')'", "'is'", "'not'", "'isn\\'t'", "'are'", "'aren\\'t'", "'implemented'", "'superinterface'", "'superclass'", "'subclass'", "'of'", "'do'", "'don\\'t'", "'does'", "'doesn\\'t'", "'implements'", "'extends'", "'size'", "'='", "'<>'", "'['", "'..'", "']'", "'parameters'", "'types'", "'constructor'", "'return'", "'type'", "'initialize'", "'empty'", "'generic'", "'name'", "'NameType'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'haven\\'t'", "'modified'", "'with'", "'}'", "'{'", "'.'", "'-'", "'static'", "'final'", "'abstract'", "'default'", "'synchronized'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'File'", "'START'", "'END'", "'CONTAIN'", "'LIKE'", "'SPANISH'", "'ENGLISH'", "'UPPER_CASE'", "'LOWER_CASE'", "'UPPER_CAMEL_CASE'", "'LOWER_CAMEL_CASE'", "'START_UPPER_CASE'", "'public'", "'protected'", "'private'", "'one'", "'exists'", "'all'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalJRulesParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJRulesParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJRulesParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJRules.g"; }



     	private JRulesGrammarAccess grammarAccess;

        public InternalJRulesParser(TokenStream input, JRulesGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleSet";
       	}

       	@Override
       	protected JRulesGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleSet"
    // InternalJRules.g:65:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalJRules.g:65:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalJRules.g:66:2: iv_ruleRuleSet= ruleRuleSet EOF
            {
             newCompositeNode(grammarAccess.getRuleSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;

             current =iv_ruleRuleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRuleSet"


    // $ANTLR start "ruleRuleSet"
    // InternalJRules.g:72:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ProjectName_2_0 = null;

        AntlrDatatypeRuleToken lv_ProjectName_4_0 = null;

        EObject lv_sentences_6_0 = null;

        EObject lv_sentences_8_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:78:2: ( (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )* ) )
            // InternalJRules.g:79:2: (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )* )
            {
            // InternalJRules.g:79:2: (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )* )
            // InternalJRules.g:80:3: otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getProjectsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRuleSetAccess().getNameKeyword_1());
            		
            // InternalJRules.g:88:3: ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalJRules.g:89:4: ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* )
                    {
                    // InternalJRules.g:89:4: ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* )
                    // InternalJRules.g:90:5: ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )*
                    {
                    // InternalJRules.g:90:5: ( (lv_ProjectName_2_0= ruleEString ) )
                    // InternalJRules.g:91:6: (lv_ProjectName_2_0= ruleEString )
                    {
                    // InternalJRules.g:91:6: (lv_ProjectName_2_0= ruleEString )
                    // InternalJRules.g:92:7: lv_ProjectName_2_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_2_0_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_ProjectName_2_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    							}
                    							add(
                    								current,
                    								"ProjectName",
                    								lv_ProjectName_2_0,
                    								"es.uam.sara.tfg.dsl.JRules.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:109:5: (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==13) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalJRules.g:110:6: otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    	    						newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getCommaKeyword_2_0_1_0());
                    	    					
                    	    // InternalJRules.g:114:6: ( (lv_ProjectName_4_0= ruleEString ) )
                    	    // InternalJRules.g:115:7: (lv_ProjectName_4_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:115:7: (lv_ProjectName_4_0= ruleEString )
                    	    // InternalJRules.g:116:8: lv_ProjectName_4_0= ruleEString
                    	    {

                    	    								newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_2_0_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_5);
                    	    lv_ProjectName_4_0=ruleEString();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getRuleSetRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"ProjectName",
                    	    									lv_ProjectName_4_0,
                    	    									"es.uam.sara.tfg.dsl.JRules.EString");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:136:4: otherlv_5= '*'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getAsteriskKeyword_2_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:141:3: ( (lv_sentences_6_0= ruleSentence ) )
            // InternalJRules.g:142:4: (lv_sentences_6_0= ruleSentence )
            {
            // InternalJRules.g:142:4: (lv_sentences_6_0= ruleSentence )
            // InternalJRules.g:143:5: lv_sentences_6_0= ruleSentence
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getSentencesSentenceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_sentences_6_0=ruleSentence();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					add(
            						current,
            						"sentences",
            						lv_sentences_6_0,
            						"es.uam.sara.tfg.dsl.JRules.Sentence");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:160:3: (otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJRules.g:161:4: otherlv_7= ',' ( (lv_sentences_8_0= ruleSentence ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRuleSetAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalJRules.g:165:4: ( (lv_sentences_8_0= ruleSentence ) )
            	    // InternalJRules.g:166:5: (lv_sentences_8_0= ruleSentence )
            	    {
            	    // InternalJRules.g:166:5: (lv_sentences_8_0= ruleSentence )
            	    // InternalJRules.g:167:6: lv_sentences_8_0= ruleSentence
            	    {

            	    						newCompositeNode(grammarAccess.getRuleSetAccess().getSentencesSentenceParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_sentences_8_0=ruleSentence();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sentences",
            	    							lv_sentences_8_0,
            	    							"es.uam.sara.tfg.dsl.JRules.Sentence");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRuleSet"


    // $ANTLR start "entryRuleSentence"
    // InternalJRules.g:189:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalJRules.g:189:49: (iv_ruleSentence= ruleSentence EOF )
            // InternalJRules.g:190:2: iv_ruleSentence= ruleSentence EOF
            {
             newCompositeNode(grammarAccess.getSentenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSentence=ruleSentence();

            state._fsp--;

             current =iv_ruleSentence; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSentence"


    // $ANTLR start "ruleSentence"
    // InternalJRules.g:196:1: ruleSentence returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Rule_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:202:2: ( (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) )
            // InternalJRules.g:203:2: (this_Variable_0= ruleVariable | this_Rule_1= ruleRule )
            {
            // InternalJRules.g:203:2: (this_Variable_0= ruleVariable | this_Rule_1= ruleRule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            else if ( (LA4_0==17||(LA4_0>=97 && LA4_0<=99)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:204:3: this_Variable_0= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getSentenceAccess().getVariableParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:213:3: this_Rule_1= ruleRule
                    {

                    			newCompositeNode(grammarAccess.getSentenceAccess().getRuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    			current = this_Rule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSentence"


    // $ANTLR start "entryRuleVariable"
    // InternalJRules.g:225:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalJRules.g:225:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalJRules.g:226:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalJRules.g:232:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_satisfy_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:238:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) ) )
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) )
            {
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) )
            // InternalJRules.g:240:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) )
            {
            // InternalJRules.g:240:3: ( (lv_name_0_0= ruleEString ) )
            // InternalJRules.g:241:4: (lv_name_0_0= ruleEString )
            {
            // InternalJRules.g:241:4: (lv_name_0_0= ruleEString )
            // InternalJRules.g:242:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalJRules.g:263:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRules.g:264:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRules.g:264:4: (lv_element_2_0= ruleElement )
            // InternalJRules.g:265:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getElementElementEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_10);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"es.uam.sara.tfg.dsl.JRules.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getSatisfyKeyword_3());
            		
            // InternalJRules.g:286:3: ( (lv_satisfy_4_0= ruleOr ) )
            // InternalJRules.g:287:4: (lv_satisfy_4_0= ruleOr )
            {
            // InternalJRules.g:287:4: (lv_satisfy_4_0= ruleOr )
            // InternalJRules.g:288:5: lv_satisfy_4_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getSatisfyOrParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_satisfy_4_0=ruleOr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"satisfy",
            						lv_satisfy_4_0,
            						"es.uam.sara.tfg.dsl.JRules.Or");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRule"
    // InternalJRules.g:309:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:309:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:310:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalJRules.g:316:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_quantifier_1_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_filter_6_0 = null;

        EObject lv_satisfy_8_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:322:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? ) )
            // InternalJRules.g:323:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:323:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? )
            // InternalJRules.g:324:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )?
            {
            // InternalJRules.g:324:3: ( (lv_no_0_0= 'no' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:325:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:325:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:326:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,17,FOLLOW_5); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:338:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:339:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:339:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:340:5: lv_quantifier_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQuantifierQuantifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_quantifier_1_0=ruleQuantifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"quantifier",
            						lv_quantifier_1_0,
            						"es.uam.sara.tfg.dsl.JRules.Quantifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:357:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRules.g:358:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRules.g:358:4: (lv_element_2_0= ruleElement )
            // InternalJRules.g:359:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getElementElementEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"es.uam.sara.tfg.dsl.JRules.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:376:3: (otherlv_3= 'in' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:377:4: otherlv_3= 'in' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getInKeyword_3_0());
                    			
                    // InternalJRules.g:381:4: ( ( ruleEString ) )
                    // InternalJRules.g:382:5: ( ruleEString )
                    {
                    // InternalJRules.g:382:5: ( ruleEString )
                    // InternalJRules.g:383:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getInVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:398:3: (otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:399:4: otherlv_5= 'which' ( (lv_filter_6_0= ruleOr ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getWhichKeyword_4_0());
                    			
                    // InternalJRules.g:403:4: ( (lv_filter_6_0= ruleOr ) )
                    // InternalJRules.g:404:5: (lv_filter_6_0= ruleOr )
                    {
                    // InternalJRules.g:404:5: (lv_filter_6_0= ruleOr )
                    // InternalJRules.g:405:6: lv_filter_6_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterOrParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_filter_6_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_6_0,
                    							"es.uam.sara.tfg.dsl.JRules.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:423:3: (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJRules.g:424:4: otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) )
                    {
                    otherlv_7=(Token)match(input,16,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getSatisfyKeyword_5_0());
                    			
                    // InternalJRules.g:428:4: ( (lv_satisfy_8_0= ruleOr ) )
                    // InternalJRules.g:429:5: (lv_satisfy_8_0= ruleOr )
                    {
                    // InternalJRules.g:429:5: (lv_satisfy_8_0= ruleOr )
                    // InternalJRules.g:430:6: lv_satisfy_8_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_8_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"satisfy",
                    							lv_satisfy_8_0,
                    							"es.uam.sara.tfg.dsl.JRules.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleOr"
    // InternalJRules.g:452:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:452:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:453:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalJRules.g:459:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:465:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:466:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:466:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:467:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:467:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:468:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:468:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:469:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_op_0_0=ruleAnd();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOrRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"es.uam.sara.tfg.dsl.JRules.And");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:486:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJRules.g:487:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:491:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:492:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:492:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:493:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_op_2_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"es.uam.sara.tfg.dsl.JRules.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalJRules.g:515:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:515:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:516:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalJRules.g:522:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:528:2: ( ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) )
            // InternalJRules.g:529:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            {
            // InternalJRules.g:529:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            // InternalJRules.g:530:3: ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            {
            // InternalJRules.g:530:3: ( (lv_op_0_0= rulePrimaryOp ) )
            // InternalJRules.g:531:4: (lv_op_0_0= rulePrimaryOp )
            {
            // InternalJRules.g:531:4: (lv_op_0_0= rulePrimaryOp )
            // InternalJRules.g:532:5: lv_op_0_0= rulePrimaryOp
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_16);
            lv_op_0_0=rulePrimaryOp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"es.uam.sara.tfg.dsl.JRules.PrimaryOp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:549:3: (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalJRules.g:550:4: otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRules.g:554:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalJRules.g:555:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalJRules.g:555:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalJRules.g:556:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_op_2_0=rulePrimaryOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"es.uam.sara.tfg.dsl.JRules.PrimaryOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimaryOp"
    // InternalJRules.g:578:1: entryRulePrimaryOp returns [EObject current=null] : iv_rulePrimaryOp= rulePrimaryOp EOF ;
    public final EObject entryRulePrimaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryOp = null;


        try {
            // InternalJRules.g:578:50: (iv_rulePrimaryOp= rulePrimaryOp EOF )
            // InternalJRules.g:579:2: iv_rulePrimaryOp= rulePrimaryOp EOF
            {
             newCompositeNode(grammarAccess.getPrimaryOpRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryOp=rulePrimaryOp();

            state._fsp--;

             current =iv_rulePrimaryOp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryOp"


    // $ANTLR start "rulePrimaryOp"
    // InternalJRules.g:585:1: rulePrimaryOp returns [EObject current=null] : ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) ;
    public final EObject rulePrimaryOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;

        EObject this_PropertyLiteral_3 = null;



        	enterRule();

        try {
            // InternalJRules.g:591:2: ( ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) )
            // InternalJRules.g:592:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            {
            // InternalJRules.g:592:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            else if ( (LA11_0==17||LA11_0==24||(LA11_0>=26 && LA11_0<=28)||(LA11_0>=34 && LA11_0<=42)||LA11_0==46||(LA11_0>=49 && LA11_0<=50)||(LA11_0>=54 && LA11_0<=56)||(LA11_0>=63 && LA11_0<=64)) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalJRules.g:593:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    {
                    // InternalJRules.g:593:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    // InternalJRules.g:594:4: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryOpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryOpAccess().getOrParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_17);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    				current = this_Or_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryOpAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:612:3: this_PropertyLiteral_3= rulePropertyLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryOpAccess().getPropertyLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyLiteral_3=rulePropertyLiteral();

                    state._fsp--;


                    			current = this_PropertyLiteral_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryOp"


    // $ANTLR start "entryRulePropertyLiteral"
    // InternalJRules.g:624:1: entryRulePropertyLiteral returns [EObject current=null] : iv_rulePropertyLiteral= rulePropertyLiteral EOF ;
    public final EObject entryRulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyLiteral = null;


        try {
            // InternalJRules.g:624:56: (iv_rulePropertyLiteral= rulePropertyLiteral EOF )
            // InternalJRules.g:625:2: iv_rulePropertyLiteral= rulePropertyLiteral EOF
            {
             newCompositeNode(grammarAccess.getPropertyLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyLiteral=rulePropertyLiteral();

            state._fsp--;

             current =iv_rulePropertyLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyLiteral"


    // $ANTLR start "rulePropertyLiteral"
    // InternalJRules.g:631:1: rulePropertyLiteral returns [EObject current=null] : ( (lv_property_0_0= ruleProperty ) ) ;
    public final EObject rulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:637:2: ( ( (lv_property_0_0= ruleProperty ) ) )
            // InternalJRules.g:638:2: ( (lv_property_0_0= ruleProperty ) )
            {
            // InternalJRules.g:638:2: ( (lv_property_0_0= ruleProperty ) )
            // InternalJRules.g:639:3: (lv_property_0_0= ruleProperty )
            {
            // InternalJRules.g:639:3: (lv_property_0_0= ruleProperty )
            // InternalJRules.g:640:4: lv_property_0_0= ruleProperty
            {

            				newCompositeNode(grammarAccess.getPropertyLiteralAccess().getPropertyPropertyParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_property_0_0=ruleProperty();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getPropertyLiteralRule());
            				}
            				set(
            					current,
            					"property",
            					lv_property_0_0,
            					"es.uam.sara.tfg.dsl.JRules.Property");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyLiteral"


    // $ANTLR start "entryRuleProperty"
    // InternalJRules.g:660:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJRules.g:660:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJRules.g:661:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalJRules.g:667:1: ruleProperty returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_JavaDoc_16= ruleJavaDoc | this_Contains_17= ruleContains | this_Modifiers_18= ruleModifiers ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        EObject this_isImplemented_0 = null;

        EObject this_IsSuperInterface_1 = null;

        EObject this_IsSuperClass_2 = null;

        EObject this_IsSubClass_3 = null;

        EObject this_Implements_4 = null;

        EObject this_Extends_5 = null;

        EObject this_Tamanio_6 = null;

        EObject this_Parameter_7 = null;

        EObject this_Constructor_8 = null;

        EObject this_Return_9 = null;

        EObject this_AttributeType_10 = null;

        EObject this_Initialize_11 = null;

        EObject this_Empty_12 = null;

        EObject this_IsGeneric_13 = null;

        EObject this_NameOperation_14 = null;

        EObject this_NameType_15 = null;

        EObject this_JavaDoc_16 = null;

        EObject this_Contains_17 = null;

        EObject this_Modifiers_18 = null;



        	enterRule();

        try {
            // InternalJRules.g:673:2: ( (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_JavaDoc_16= ruleJavaDoc | this_Contains_17= ruleContains | this_Modifiers_18= ruleModifiers ) )
            // InternalJRules.g:674:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_JavaDoc_16= ruleJavaDoc | this_Contains_17= ruleContains | this_Modifiers_18= ruleModifiers )
            {
            // InternalJRules.g:674:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_JavaDoc_16= ruleJavaDoc | this_Contains_17= ruleContains | this_Modifiers_18= ruleModifiers )
            int alt12=19;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:675:3: this_isImplemented_0= ruleisImplemented
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIsImplementedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_isImplemented_0=ruleisImplemented();

                    state._fsp--;


                    			current = this_isImplemented_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:684:3: this_IsSuperInterface_1= ruleIsSuperInterface
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIsSuperInterfaceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsSuperInterface_1=ruleIsSuperInterface();

                    state._fsp--;


                    			current = this_IsSuperInterface_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJRules.g:693:3: this_IsSuperClass_2= ruleIsSuperClass
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIsSuperClassParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsSuperClass_2=ruleIsSuperClass();

                    state._fsp--;


                    			current = this_IsSuperClass_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJRules.g:702:3: this_IsSubClass_3= ruleIsSubClass
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIsSubClassParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsSubClass_3=ruleIsSubClass();

                    state._fsp--;


                    			current = this_IsSubClass_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJRules.g:711:3: this_Implements_4= ruleImplements
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getImplementsParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Implements_4=ruleImplements();

                    state._fsp--;


                    			current = this_Implements_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJRules.g:720:3: this_Extends_5= ruleExtends
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getExtendsParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Extends_5=ruleExtends();

                    state._fsp--;


                    			current = this_Extends_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJRules.g:729:3: this_Tamanio_6= ruleTamanio
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getTamanioParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Tamanio_6=ruleTamanio();

                    state._fsp--;


                    			current = this_Tamanio_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJRules.g:738:3: this_Parameter_7= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getParameterParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_7=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJRules.g:747:3: this_Constructor_8= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getConstructorParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_8=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJRules.g:756:3: this_Return_9= ruleReturn
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getReturnParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Return_9=ruleReturn();

                    state._fsp--;


                    			current = this_Return_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJRules.g:765:3: this_AttributeType_10= ruleAttributeType
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getAttributeTypeParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeType_10=ruleAttributeType();

                    state._fsp--;


                    			current = this_AttributeType_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJRules.g:774:3: this_Initialize_11= ruleInitialize
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getInitializeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initialize_11=ruleInitialize();

                    state._fsp--;


                    			current = this_Initialize_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJRules.g:783:3: this_Empty_12= ruleEmpty
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getEmptyParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Empty_12=ruleEmpty();

                    state._fsp--;


                    			current = this_Empty_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJRules.g:792:3: this_IsGeneric_13= ruleIsGeneric
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getIsGenericParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsGeneric_13=ruleIsGeneric();

                    state._fsp--;


                    			current = this_IsGeneric_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJRules.g:801:3: this_NameOperation_14= ruleNameOperation
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getNameOperationParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameOperation_14=ruleNameOperation();

                    state._fsp--;


                    			current = this_NameOperation_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalJRules.g:810:3: this_NameType_15= ruleNameType
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getNameTypeParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameType_15=ruleNameType();

                    state._fsp--;


                    			current = this_NameType_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalJRules.g:819:3: this_JavaDoc_16= ruleJavaDoc
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getJavaDocParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_JavaDoc_16=ruleJavaDoc();

                    state._fsp--;


                    			current = this_JavaDoc_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalJRules.g:828:3: this_Contains_17= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getContainsParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_17=ruleContains();

                    state._fsp--;


                    			current = this_Contains_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalJRules.g:837:3: this_Modifiers_18= ruleModifiers
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getModifiersParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modifiers_18=ruleModifiers();

                    state._fsp--;


                    			current = this_Modifiers_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleisImplemented"
    // InternalJRules.g:849:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:849:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:850:2: iv_ruleisImplemented= ruleisImplemented EOF
            {
             newCompositeNode(grammarAccess.getIsImplementedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisImplemented=ruleisImplemented();

            state._fsp--;

             current =iv_ruleisImplemented; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleisImplemented"


    // $ANTLR start "ruleisImplemented"
    // InternalJRules.g:856:1: ruleisImplemented returns [EObject current=null] : ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'implemented' ( (lv_valores_9_0= ruleRangoNames ) ) ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        Token lv_no_7_0=null;
        Token otherlv_8=null;
        EObject lv_valores_9_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:862:2: ( ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'implemented' ( (lv_valores_9_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:863:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'implemented' ( (lv_valores_9_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:863:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'implemented' ( (lv_valores_9_0= ruleRangoNames ) ) )
            // InternalJRules.g:864:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'implemented' ( (lv_valores_9_0= ruleRangoNames ) )
            {
            // InternalJRules.g:864:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==29) ) {
                    alt13=1;
                }
                else if ( (LA13_1==25) ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt13=3;
                }
                break;
            case 27:
                {
                int LA13_3 = input.LA(2);

                if ( (LA13_3==29) ) {
                    alt13=4;
                }
                else if ( (LA13_3==25) ) {
                    alt13=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalJRules.g:865:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_18); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsImplementedAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:870:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    {
                    // InternalJRules.g:870:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    // InternalJRules.g:871:5: ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not'
                    {
                    // InternalJRules.g:871:5: ( (lv_no_1_0= 'is' ) )
                    // InternalJRules.g:872:6: (lv_no_1_0= 'is' )
                    {
                    // InternalJRules.g:872:6: (lv_no_1_0= 'is' )
                    // InternalJRules.g:873:7: lv_no_1_0= 'is'
                    {
                    lv_no_1_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_1_0, grammarAccess.getIsImplementedAccess().getNoIsKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsImplementedRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getIsImplementedAccess().getNotKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:891:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:891:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    // InternalJRules.g:892:5: (lv_no_3_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:892:5: (lv_no_3_0= 'isn\\'t' )
                    // InternalJRules.g:893:6: lv_no_3_0= 'isn\\'t'
                    {
                    lv_no_3_0=(Token)match(input,26,FOLLOW_18); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getIsImplementedAccess().getNoIsnTKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsImplementedRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:906:4: otherlv_4= 'are'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getIsImplementedAccess().getAreKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:911:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    {
                    // InternalJRules.g:911:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    // InternalJRules.g:912:5: ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not'
                    {
                    // InternalJRules.g:912:5: ( (lv_no_5_0= 'are' ) )
                    // InternalJRules.g:913:6: (lv_no_5_0= 'are' )
                    {
                    // InternalJRules.g:913:6: (lv_no_5_0= 'are' )
                    // InternalJRules.g:914:7: lv_no_5_0= 'are'
                    {
                    lv_no_5_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_5_0, grammarAccess.getIsImplementedAccess().getNoAreKeyword_0_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsImplementedRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_18); 

                    					newLeafNode(otherlv_6, grammarAccess.getIsImplementedAccess().getNotKeyword_0_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:932:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:932:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    // InternalJRules.g:933:5: (lv_no_7_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:933:5: (lv_no_7_0= 'aren\\'t' )
                    // InternalJRules.g:934:6: lv_no_7_0= 'aren\\'t'
                    {
                    lv_no_7_0=(Token)match(input,28,FOLLOW_18); 

                    						newLeafNode(lv_no_7_0, grammarAccess.getIsImplementedAccess().getNoArenTKeyword_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsImplementedRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,29,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getIsImplementedAccess().getImplementedKeyword_1());
            		
            // InternalJRules.g:951:3: ( (lv_valores_9_0= ruleRangoNames ) )
            // InternalJRules.g:952:4: (lv_valores_9_0= ruleRangoNames )
            {
            // InternalJRules.g:952:4: (lv_valores_9_0= ruleRangoNames )
            // InternalJRules.g:953:5: lv_valores_9_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsImplementedAccess().getValoresRangoNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_9_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsImplementedRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_9_0,
            						"es.uam.sara.tfg.dsl.JRules.RangoNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleisImplemented"


    // $ANTLR start "entryRuleIsSuperInterface"
    // InternalJRules.g:974:1: entryRuleIsSuperInterface returns [EObject current=null] : iv_ruleIsSuperInterface= ruleIsSuperInterface EOF ;
    public final EObject entryRuleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperInterface = null;


        try {
            // InternalJRules.g:974:57: (iv_ruleIsSuperInterface= ruleIsSuperInterface EOF )
            // InternalJRules.g:975:2: iv_ruleIsSuperInterface= ruleIsSuperInterface EOF
            {
             newCompositeNode(grammarAccess.getIsSuperInterfaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsSuperInterface=ruleIsSuperInterface();

            state._fsp--;

             current =iv_ruleIsSuperInterface; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsSuperInterface"


    // $ANTLR start "ruleIsSuperInterface"
    // InternalJRules.g:981:1: ruleIsSuperInterface returns [EObject current=null] : ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superinterface' ( (lv_valores_9_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        Token lv_no_7_0=null;
        Token otherlv_8=null;
        EObject lv_valores_9_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:987:2: ( ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superinterface' ( (lv_valores_9_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:988:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superinterface' ( (lv_valores_9_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:988:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superinterface' ( (lv_valores_9_0= ruleRangoNames ) ) )
            // InternalJRules.g:989:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superinterface' ( (lv_valores_9_0= ruleRangoNames ) )
            {
            // InternalJRules.g:989:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) )
            int alt14=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==30) ) {
                    alt14=1;
                }
                else if ( (LA14_1==25) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                int LA14_3 = input.LA(2);

                if ( (LA14_3==30) ) {
                    alt14=4;
                }
                else if ( (LA14_3==25) ) {
                    alt14=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalJRules.g:990:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperInterfaceAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:995:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    {
                    // InternalJRules.g:995:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    // InternalJRules.g:996:5: ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not'
                    {
                    // InternalJRules.g:996:5: ( (lv_no_1_0= 'is' ) )
                    // InternalJRules.g:997:6: (lv_no_1_0= 'is' )
                    {
                    // InternalJRules.g:997:6: (lv_no_1_0= 'is' )
                    // InternalJRules.g:998:7: lv_no_1_0= 'is'
                    {
                    lv_no_1_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_1_0, grammarAccess.getIsSuperInterfaceAccess().getNoIsKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(otherlv_2, grammarAccess.getIsSuperInterfaceAccess().getNotKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1016:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:1016:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    // InternalJRules.g:1017:5: (lv_no_3_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:1017:5: (lv_no_3_0= 'isn\\'t' )
                    // InternalJRules.g:1018:6: lv_no_3_0= 'isn\\'t'
                    {
                    lv_no_3_0=(Token)match(input,26,FOLLOW_21); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getIsSuperInterfaceAccess().getNoIsnTKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1031:4: otherlv_4= 'are'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_4, grammarAccess.getIsSuperInterfaceAccess().getAreKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:1036:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    {
                    // InternalJRules.g:1036:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    // InternalJRules.g:1037:5: ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not'
                    {
                    // InternalJRules.g:1037:5: ( (lv_no_5_0= 'are' ) )
                    // InternalJRules.g:1038:6: (lv_no_5_0= 'are' )
                    {
                    // InternalJRules.g:1038:6: (lv_no_5_0= 'are' )
                    // InternalJRules.g:1039:7: lv_no_5_0= 'are'
                    {
                    lv_no_5_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_5_0, grammarAccess.getIsSuperInterfaceAccess().getNoAreKeyword_0_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_21); 

                    					newLeafNode(otherlv_6, grammarAccess.getIsSuperInterfaceAccess().getNotKeyword_0_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:1057:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:1057:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    // InternalJRules.g:1058:5: (lv_no_7_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:1058:5: (lv_no_7_0= 'aren\\'t' )
                    // InternalJRules.g:1059:6: lv_no_7_0= 'aren\\'t'
                    {
                    lv_no_7_0=(Token)match(input,28,FOLLOW_21); 

                    						newLeafNode(lv_no_7_0, grammarAccess.getIsSuperInterfaceAccess().getNoArenTKeyword_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,30,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getIsSuperInterfaceAccess().getSuperinterfaceKeyword_1());
            		
            // InternalJRules.g:1076:3: ( (lv_valores_9_0= ruleRangoNames ) )
            // InternalJRules.g:1077:4: (lv_valores_9_0= ruleRangoNames )
            {
            // InternalJRules.g:1077:4: (lv_valores_9_0= ruleRangoNames )
            // InternalJRules.g:1078:5: lv_valores_9_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsSuperInterfaceAccess().getValoresRangoNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_9_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsSuperInterfaceRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_9_0,
            						"es.uam.sara.tfg.dsl.JRules.RangoNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsSuperInterface"


    // $ANTLR start "entryRuleIsSuperClass"
    // InternalJRules.g:1099:1: entryRuleIsSuperClass returns [EObject current=null] : iv_ruleIsSuperClass= ruleIsSuperClass EOF ;
    public final EObject entryRuleIsSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperClass = null;


        try {
            // InternalJRules.g:1099:53: (iv_ruleIsSuperClass= ruleIsSuperClass EOF )
            // InternalJRules.g:1100:2: iv_ruleIsSuperClass= ruleIsSuperClass EOF
            {
             newCompositeNode(grammarAccess.getIsSuperClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsSuperClass=ruleIsSuperClass();

            state._fsp--;

             current =iv_ruleIsSuperClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsSuperClass"


    // $ANTLR start "ruleIsSuperClass"
    // InternalJRules.g:1106:1: ruleIsSuperClass returns [EObject current=null] : ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superclass' ( (lv_valores_9_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        Token lv_no_7_0=null;
        Token otherlv_8=null;
        EObject lv_valores_9_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1112:2: ( ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superclass' ( (lv_valores_9_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1113:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superclass' ( (lv_valores_9_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1113:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superclass' ( (lv_valores_9_0= ruleRangoNames ) ) )
            // InternalJRules.g:1114:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'superclass' ( (lv_valores_9_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1114:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) )
            int alt15=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==31) ) {
                    alt15=1;
                }
                else if ( (LA15_1==25) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt15=3;
                }
                break;
            case 27:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==31) ) {
                    alt15=4;
                }
                else if ( (LA15_3==25) ) {
                    alt15=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt15=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalJRules.g:1115:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_22); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperClassAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1120:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    {
                    // InternalJRules.g:1120:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    // InternalJRules.g:1121:5: ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not'
                    {
                    // InternalJRules.g:1121:5: ( (lv_no_1_0= 'is' ) )
                    // InternalJRules.g:1122:6: (lv_no_1_0= 'is' )
                    {
                    // InternalJRules.g:1122:6: (lv_no_1_0= 'is' )
                    // InternalJRules.g:1123:7: lv_no_1_0= 'is'
                    {
                    lv_no_1_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_1_0, grammarAccess.getIsSuperClassAccess().getNoIsKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSuperClassRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_22); 

                    					newLeafNode(otherlv_2, grammarAccess.getIsSuperClassAccess().getNotKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1141:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:1141:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    // InternalJRules.g:1142:5: (lv_no_3_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:1142:5: (lv_no_3_0= 'isn\\'t' )
                    // InternalJRules.g:1143:6: lv_no_3_0= 'isn\\'t'
                    {
                    lv_no_3_0=(Token)match(input,26,FOLLOW_22); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getIsSuperClassAccess().getNoIsnTKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSuperClassRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1156:4: otherlv_4= 'are'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getIsSuperClassAccess().getAreKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:1161:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    {
                    // InternalJRules.g:1161:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    // InternalJRules.g:1162:5: ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not'
                    {
                    // InternalJRules.g:1162:5: ( (lv_no_5_0= 'are' ) )
                    // InternalJRules.g:1163:6: (lv_no_5_0= 'are' )
                    {
                    // InternalJRules.g:1163:6: (lv_no_5_0= 'are' )
                    // InternalJRules.g:1164:7: lv_no_5_0= 'are'
                    {
                    lv_no_5_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_5_0, grammarAccess.getIsSuperClassAccess().getNoAreKeyword_0_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSuperClassRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_22); 

                    					newLeafNode(otherlv_6, grammarAccess.getIsSuperClassAccess().getNotKeyword_0_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:1182:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:1182:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    // InternalJRules.g:1183:5: (lv_no_7_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:1183:5: (lv_no_7_0= 'aren\\'t' )
                    // InternalJRules.g:1184:6: lv_no_7_0= 'aren\\'t'
                    {
                    lv_no_7_0=(Token)match(input,28,FOLLOW_22); 

                    						newLeafNode(lv_no_7_0, grammarAccess.getIsSuperClassAccess().getNoArenTKeyword_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSuperClassRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,31,FOLLOW_20); 

            			newLeafNode(otherlv_8, grammarAccess.getIsSuperClassAccess().getSuperclassKeyword_1());
            		
            // InternalJRules.g:1201:3: ( (lv_valores_9_0= ruleRangoNames ) )
            // InternalJRules.g:1202:4: (lv_valores_9_0= ruleRangoNames )
            {
            // InternalJRules.g:1202:4: (lv_valores_9_0= ruleRangoNames )
            // InternalJRules.g:1203:5: lv_valores_9_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsSuperClassAccess().getValoresRangoNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_9_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsSuperClassRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_9_0,
            						"es.uam.sara.tfg.dsl.JRules.RangoNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsSuperClass"


    // $ANTLR start "entryRuleIsSubClass"
    // InternalJRules.g:1224:1: entryRuleIsSubClass returns [EObject current=null] : iv_ruleIsSubClass= ruleIsSubClass EOF ;
    public final EObject entryRuleIsSubClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSubClass = null;


        try {
            // InternalJRules.g:1224:51: (iv_ruleIsSubClass= ruleIsSubClass EOF )
            // InternalJRules.g:1225:2: iv_ruleIsSubClass= ruleIsSubClass EOF
            {
             newCompositeNode(grammarAccess.getIsSubClassRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsSubClass=ruleIsSubClass();

            state._fsp--;

             current =iv_ruleIsSubClass; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsSubClass"


    // $ANTLR start "ruleIsSubClass"
    // InternalJRules.g:1231:1: ruleIsSubClass returns [EObject current=null] : ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'subclass' (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )? ) ;
    public final EObject ruleIsSubClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_of_11_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1237:2: ( ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'subclass' (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )? ) )
            // InternalJRules.g:1238:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'subclass' (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )? )
            {
            // InternalJRules.g:1238:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'subclass' (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )? )
            // InternalJRules.g:1239:3: () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'subclass' (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )?
            {
            // InternalJRules.g:1239:3: ()
            // InternalJRules.g:1240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsSubClassAccess().getIsSubClassAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1246:3: (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) )
            int alt16=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==25) ) {
                    alt16=2;
                }
                else if ( (LA16_1==32) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt16=3;
                }
                break;
            case 27:
                {
                int LA16_3 = input.LA(2);

                if ( (LA16_3==32) ) {
                    alt16=4;
                }
                else if ( (LA16_3==25) ) {
                    alt16=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt16=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalJRules.g:1247:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSubClassAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1252:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    {
                    // InternalJRules.g:1252:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    // InternalJRules.g:1253:5: ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not'
                    {
                    // InternalJRules.g:1253:5: ( (lv_no_2_0= 'is' ) )
                    // InternalJRules.g:1254:6: (lv_no_2_0= 'is' )
                    {
                    // InternalJRules.g:1254:6: (lv_no_2_0= 'is' )
                    // InternalJRules.g:1255:7: lv_no_2_0= 'is'
                    {
                    lv_no_2_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_2_0, grammarAccess.getIsSubClassAccess().getNoIsKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSubClassRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_23); 

                    					newLeafNode(otherlv_3, grammarAccess.getIsSubClassAccess().getNotKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1273:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:1273:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    // InternalJRules.g:1274:5: (lv_no_4_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:1274:5: (lv_no_4_0= 'isn\\'t' )
                    // InternalJRules.g:1275:6: lv_no_4_0= 'isn\\'t'
                    {
                    lv_no_4_0=(Token)match(input,26,FOLLOW_23); 

                    						newLeafNode(lv_no_4_0, grammarAccess.getIsSubClassAccess().getNoIsnTKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSubClassRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1288:4: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsSubClassAccess().getAreKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:1293:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    {
                    // InternalJRules.g:1293:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    // InternalJRules.g:1294:5: ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not'
                    {
                    // InternalJRules.g:1294:5: ( (lv_no_6_0= 'are' ) )
                    // InternalJRules.g:1295:6: (lv_no_6_0= 'are' )
                    {
                    // InternalJRules.g:1295:6: (lv_no_6_0= 'are' )
                    // InternalJRules.g:1296:7: lv_no_6_0= 'are'
                    {
                    lv_no_6_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_6_0, grammarAccess.getIsSubClassAccess().getNoAreKeyword_1_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsSubClassRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_23); 

                    					newLeafNode(otherlv_7, grammarAccess.getIsSubClassAccess().getNotKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:1314:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:1314:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    // InternalJRules.g:1315:5: (lv_no_8_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:1315:5: (lv_no_8_0= 'aren\\'t' )
                    // InternalJRules.g:1316:6: lv_no_8_0= 'aren\\'t'
                    {
                    lv_no_8_0=(Token)match(input,28,FOLLOW_23); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getIsSubClassAccess().getNoArenTKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsSubClassRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_9, grammarAccess.getIsSubClassAccess().getSubclassKeyword_2());
            		
            // InternalJRules.g:1333:3: (otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:1334:4: otherlv_10= 'of' ( (lv_of_11_0= ruleStringProperty ) )
                    {
                    otherlv_10=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getIsSubClassAccess().getOfKeyword_3_0());
                    			
                    // InternalJRules.g:1338:4: ( (lv_of_11_0= ruleStringProperty ) )
                    // InternalJRules.g:1339:5: (lv_of_11_0= ruleStringProperty )
                    {
                    // InternalJRules.g:1339:5: (lv_of_11_0= ruleStringProperty )
                    // InternalJRules.g:1340:6: lv_of_11_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getIsSubClassAccess().getOfStringPropertyParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_of_11_0=ruleStringProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsSubClassRule());
                    						}
                    						set(
                    							current,
                    							"of",
                    							lv_of_11_0,
                    							"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsSubClass"


    // $ANTLR start "entryRuleImplements"
    // InternalJRules.g:1362:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:1362:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:1363:2: iv_ruleImplements= ruleImplements EOF
            {
             newCompositeNode(grammarAccess.getImplementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImplements=ruleImplements();

            state._fsp--;

             current =iv_ruleImplements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplements"


    // $ANTLR start "ruleImplements"
    // InternalJRules.g:1369:1: ruleImplements returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        EObject lv_valores_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1375:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1376:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1376:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1377:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1377:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt18=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt18=1;
                    }
                    break;
                case 35:
                    {
                    alt18=2;
                    }
                    break;
                case 36:
                    {
                    alt18=3;
                    }
                    break;
                case 37:
                    {
                    alt18=4;
                    }
                    break;
            }

            switch (alt18) {
                case 1 :
                    // InternalJRules.g:1378:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1378:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1379:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1379:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1380:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1380:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1381:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,34,FOLLOW_19); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getImplementsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_25); 

                    					newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1399:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1399:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1400:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1400:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1401:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,35,FOLLOW_25); 

                    						newLeafNode(lv_no_2_0, grammarAccess.getImplementsAccess().getNoDonTKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImplementsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "don\'t");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1414:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1414:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1415:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1415:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1416:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1416:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1417:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,36,FOLLOW_19); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getImplementsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_25); 

                    					newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1435:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1435:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1436:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1436:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1437:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,37,FOLLOW_25); 

                    						newLeafNode(lv_no_5_0, grammarAccess.getImplementsAccess().getNoDoesnTKeyword_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImplementsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "doesn\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,38,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:1454:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1455:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1455:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1456:5: lv_valores_7_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getImplementsAccess().getValoresRangoNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_7_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImplementsRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_7_0,
            						"es.uam.sara.tfg.dsl.JRules.RangoNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleExtends"
    // InternalJRules.g:1477:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJRules.g:1477:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJRules.g:1478:2: iv_ruleExtends= ruleExtends EOF
            {
             newCompositeNode(grammarAccess.getExtendsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtends=ruleExtends();

            state._fsp--;

             current =iv_ruleExtends; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtends"


    // $ANTLR start "ruleExtends"
    // InternalJRules.g:1484:1: ruleExtends returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
    public final EObject ruleExtends() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        EObject lv_valores_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1490:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1491:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1491:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1492:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1492:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt19=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt19=1;
                    }
                    break;
                case 35:
                    {
                    alt19=2;
                    }
                    break;
                case 36:
                    {
                    alt19=3;
                    }
                    break;
                case 37:
                    {
                    alt19=4;
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1493:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1493:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1494:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1494:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1495:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1495:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1496:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,34,FOLLOW_19); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getExtendsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,25,FOLLOW_26); 

                    					newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1514:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1514:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1515:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1515:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1516:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,35,FOLLOW_26); 

                    						newLeafNode(lv_no_2_0, grammarAccess.getExtendsAccess().getNoDonTKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "don\'t");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1529:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1529:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1530:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1530:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1531:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1531:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1532:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,36,FOLLOW_19); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getExtendsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_26); 

                    					newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1550:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1550:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1551:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1551:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1552:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,37,FOLLOW_26); 

                    						newLeafNode(lv_no_5_0, grammarAccess.getExtendsAccess().getNoDoesnTKeyword_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getExtendsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "doesn\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,39,FOLLOW_20); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendsAccess().getExtendsKeyword_1());
            		
            // InternalJRules.g:1569:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1570:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1570:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1571:5: lv_valores_7_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getExtendsAccess().getValoresRangoNamesParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_7_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendsRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_7_0,
            						"es.uam.sara.tfg.dsl.JRules.RangoNames");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtends"


    // $ANTLR start "entryRuleTamanio"
    // InternalJRules.g:1592:1: entryRuleTamanio returns [EObject current=null] : iv_ruleTamanio= ruleTamanio EOF ;
    public final EObject entryRuleTamanio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTamanio = null;


        try {
            // InternalJRules.g:1592:48: (iv_ruleTamanio= ruleTamanio EOF )
            // InternalJRules.g:1593:2: iv_ruleTamanio= ruleTamanio EOF
            {
             newCompositeNode(grammarAccess.getTamanioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTamanio=ruleTamanio();

            state._fsp--;

             current =iv_ruleTamanio; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTamanio"


    // $ANTLR start "ruleTamanio"
    // InternalJRules.g:1599:1: ruleTamanio returns [EObject current=null] : (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) ;
    public final EObject ruleTamanio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_exact_3_0 = null;

        AntlrDatatypeRuleToken lv_min_5_0 = null;

        AntlrDatatypeRuleToken lv_max_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1605:2: ( (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) )
            // InternalJRules.g:1606:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            {
            // InternalJRules.g:1606:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            // InternalJRules.g:1607:3: otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getTamanioAccess().getSizeKeyword_0());
            		
            // InternalJRules.g:1611:3: ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                alt22=1;
            }
            else if ( (LA22_0==43) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1612:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    {
                    // InternalJRules.g:1612:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    // InternalJRules.g:1613:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1613:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==41) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==42) ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;
                    }
                    switch (alt20) {
                        case 1 :
                            // InternalJRules.g:1614:6: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,41,FOLLOW_28); 

                            						newLeafNode(otherlv_1, grammarAccess.getTamanioAccess().getEqualsSignKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1619:6: ( (lv_no_2_0= '<>' ) )
                            {
                            // InternalJRules.g:1619:6: ( (lv_no_2_0= '<>' ) )
                            // InternalJRules.g:1620:7: (lv_no_2_0= '<>' )
                            {
                            // InternalJRules.g:1620:7: (lv_no_2_0= '<>' )
                            // InternalJRules.g:1621:8: lv_no_2_0= '<>'
                            {
                            lv_no_2_0=(Token)match(input,42,FOLLOW_28); 

                            								newLeafNode(lv_no_2_0, grammarAccess.getTamanioAccess().getNoLessThanSignGreaterThanSignKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getTamanioRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "<>");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1634:5: ( (lv_exact_3_0= ruleEInt ) )
                    // InternalJRules.g:1635:6: (lv_exact_3_0= ruleEInt )
                    {
                    // InternalJRules.g:1635:6: (lv_exact_3_0= ruleEInt )
                    // InternalJRules.g:1636:7: lv_exact_3_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTamanioAccess().getExactEIntParserRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_exact_3_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTamanioRule());
                    							}
                    							set(
                    								current,
                    								"exact",
                    								lv_exact_3_0,
                    								"es.uam.sara.tfg.dsl.JRules.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1655:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    {
                    // InternalJRules.g:1655:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    // InternalJRules.g:1656:5: otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_28); 

                    					newLeafNode(otherlv_4, grammarAccess.getTamanioAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalJRules.g:1660:5: ( (lv_min_5_0= ruleEInt ) )
                    // InternalJRules.g:1661:6: (lv_min_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1661:6: (lv_min_5_0= ruleEInt )
                    // InternalJRules.g:1662:7: lv_min_5_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTamanioAccess().getMinEIntParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_min_5_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getTamanioRule());
                    							}
                    							set(
                    								current,
                    								"min",
                    								lv_min_5_0,
                    								"es.uam.sara.tfg.dsl.JRules.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,44,FOLLOW_30); 

                    					newLeafNode(otherlv_6, grammarAccess.getTamanioAccess().getFullStopFullStopKeyword_1_1_2());
                    				
                    // InternalJRules.g:1683:5: ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_INT||LA21_0==70) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==14) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalJRules.g:1684:6: ( (lv_max_7_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1684:6: ( (lv_max_7_0= ruleEInt ) )
                            // InternalJRules.g:1685:7: (lv_max_7_0= ruleEInt )
                            {
                            // InternalJRules.g:1685:7: (lv_max_7_0= ruleEInt )
                            // InternalJRules.g:1686:8: lv_max_7_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTamanioAccess().getMaxEIntParserRuleCall_1_1_3_0_0());
                            							
                            pushFollow(FOLLOW_31);
                            lv_max_7_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getTamanioRule());
                            								}
                            								set(
                            									current,
                            									"max",
                            									lv_max_7_0,
                            									"es.uam.sara.tfg.dsl.JRules.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1704:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_31); 

                            						newLeafNode(otherlv_8, grammarAccess.getTamanioAccess().getAsteriskKeyword_1_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getTamanioAccess().getRightSquareBracketKeyword_1_1_4());
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTamanio"


    // $ANTLR start "entryRuleParameter"
    // InternalJRules.g:1719:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:1719:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:1720:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalJRules.g:1726:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_exact_5_0 = null;

        AntlrDatatypeRuleToken lv_min_7_0 = null;

        AntlrDatatypeRuleToken lv_max_9_0 = null;

        EObject lv_types_15_0 = null;

        EObject lv_types_17_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1732:2: ( ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )? ) )
            // InternalJRules.g:1733:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )? )
            {
            // InternalJRules.g:1733:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )? )
            // InternalJRules.g:1734:3: () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )?
            {
            // InternalJRules.g:1734:3: ()
            // InternalJRules.g:1735:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParametersKeyword_1());
            		
            // InternalJRules.g:1745:3: ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            else if ( (LA25_0==43) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1746:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    {
                    // InternalJRules.g:1746:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    // InternalJRules.g:1747:5: otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_33); 

                    					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSizeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1751:5: ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    // InternalJRules.g:1752:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1752:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==41) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==42) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalJRules.g:1753:7: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,41,FOLLOW_28); 

                            							newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1758:7: ( (lv_no_4_0= '<>' ) )
                            {
                            // InternalJRules.g:1758:7: ( (lv_no_4_0= '<>' ) )
                            // InternalJRules.g:1759:8: (lv_no_4_0= '<>' )
                            {
                            // InternalJRules.g:1759:8: (lv_no_4_0= '<>' )
                            // InternalJRules.g:1760:9: lv_no_4_0= '<>'
                            {
                            lv_no_4_0=(Token)match(input,42,FOLLOW_28); 

                            									newLeafNode(lv_no_4_0, grammarAccess.getParameterAccess().getNoLessThanSignGreaterThanSignKeyword_2_0_1_0_1_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getParameterRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "<>");
                            								

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1773:6: ( (lv_exact_5_0= ruleEInt ) )
                    // InternalJRules.g:1774:7: (lv_exact_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1774:7: (lv_exact_5_0= ruleEInt )
                    // InternalJRules.g:1775:8: lv_exact_5_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getParameterAccess().getExactEIntParserRuleCall_2_0_1_1_0());
                    							
                    pushFollow(FOLLOW_34);
                    lv_exact_5_0=ruleEInt();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getParameterRule());
                    								}
                    								set(
                    									current,
                    									"exact",
                    									lv_exact_5_0,
                    									"es.uam.sara.tfg.dsl.JRules.EInt");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1795:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    {
                    // InternalJRules.g:1795:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    // InternalJRules.g:1796:5: otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_28); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalJRules.g:1800:5: ( (lv_min_7_0= ruleEInt ) )
                    // InternalJRules.g:1801:6: (lv_min_7_0= ruleEInt )
                    {
                    // InternalJRules.g:1801:6: (lv_min_7_0= ruleEInt )
                    // InternalJRules.g:1802:7: lv_min_7_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getMinEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    lv_min_7_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    							}
                    							set(
                    								current,
                    								"min",
                    								lv_min_7_0,
                    								"es.uam.sara.tfg.dsl.JRules.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_8=(Token)match(input,44,FOLLOW_30); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getFullStopFullStopKeyword_2_1_2());
                    				
                    // InternalJRules.g:1823:5: ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==RULE_INT||LA24_0==70) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==14) ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalJRules.g:1824:6: ( (lv_max_9_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1824:6: ( (lv_max_9_0= ruleEInt ) )
                            // InternalJRules.g:1825:7: (lv_max_9_0= ruleEInt )
                            {
                            // InternalJRules.g:1825:7: (lv_max_9_0= ruleEInt )
                            // InternalJRules.g:1826:8: lv_max_9_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getParameterAccess().getMaxEIntParserRuleCall_2_1_3_0_0());
                            							
                            pushFollow(FOLLOW_31);
                            lv_max_9_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getParameterRule());
                            								}
                            								set(
                            									current,
                            									"max",
                            									lv_max_9_0,
                            									"es.uam.sara.tfg.dsl.JRules.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1844:6: otherlv_10= '*'
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_31); 

                            						newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getAsteriskKeyword_2_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,45,FOLLOW_34); 

                    					newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1855:3: (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==47) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1856:4: otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleStringProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )* otherlv_18= ']'
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_35); 

                    				newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getTypesKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,41,FOLLOW_36); 

                    				newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_14=(Token)match(input,43,FOLLOW_6); 

                    				newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalJRules.g:1868:4: ( (lv_types_15_0= ruleStringProperty ) )
                    // InternalJRules.g:1869:5: (lv_types_15_0= ruleStringProperty )
                    {
                    // InternalJRules.g:1869:5: (lv_types_15_0= ruleStringProperty )
                    // InternalJRules.g:1870:6: lv_types_15_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesStringPropertyParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_types_15_0=ruleStringProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_15_0,
                    							"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:1887:4: (otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==13) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalJRules.g:1888:5: otherlv_16= ',' ( (lv_types_17_0= ruleStringProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalJRules.g:1892:5: ( (lv_types_17_0= ruleStringProperty ) )
                    	    // InternalJRules.g:1893:6: (lv_types_17_0= ruleStringProperty )
                    	    {
                    	    // InternalJRules.g:1893:6: (lv_types_17_0= ruleStringProperty )
                    	    // InternalJRules.g:1894:7: lv_types_17_0= ruleStringProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesStringPropertyParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_types_17_0=ruleStringProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_17_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,45,FOLLOW_2); 

                    				newLeafNode(otherlv_18, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_3_5());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConstructor"
    // InternalJRules.g:1921:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1921:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1922:2: iv_ruleConstructor= ruleConstructor EOF
            {
             newCompositeNode(grammarAccess.getConstructorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;

             current =iv_ruleConstructor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructor"


    // $ANTLR start "ruleConstructor"
    // InternalJRules.g:1928:1: ruleConstructor returns [EObject current=null] : ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalJRules.g:1934:2: ( ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'constructor' ) )
            // InternalJRules.g:1935:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'constructor' )
            {
            // InternalJRules.g:1935:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'constructor' )
            // InternalJRules.g:1936:3: () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'constructor'
            {
            // InternalJRules.g:1936:3: ()
            // InternalJRules.g:1937:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1943:3: (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) )
            int alt28=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==48) ) {
                    alt28=1;
                }
                else if ( (LA28_1==25) ) {
                    alt28=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt28=3;
                }
                break;
            case 27:
                {
                int LA28_3 = input.LA(2);

                if ( (LA28_3==25) ) {
                    alt28=5;
                }
                else if ( (LA28_3==48) ) {
                    alt28=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt28=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalJRules.g:1944:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1949:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    {
                    // InternalJRules.g:1949:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    // InternalJRules.g:1950:5: ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not'
                    {
                    // InternalJRules.g:1950:5: ( (lv_no_2_0= 'is' ) )
                    // InternalJRules.g:1951:6: (lv_no_2_0= 'is' )
                    {
                    // InternalJRules.g:1951:6: (lv_no_2_0= 'is' )
                    // InternalJRules.g:1952:7: lv_no_2_0= 'is'
                    {
                    lv_no_2_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_2_0, grammarAccess.getConstructorAccess().getNoIsKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConstructorRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_38); 

                    					newLeafNode(otherlv_3, grammarAccess.getConstructorAccess().getNotKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1970:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:1970:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    // InternalJRules.g:1971:5: (lv_no_4_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:1971:5: (lv_no_4_0= 'isn\\'t' )
                    // InternalJRules.g:1972:6: lv_no_4_0= 'isn\\'t'
                    {
                    lv_no_4_0=(Token)match(input,26,FOLLOW_38); 

                    						newLeafNode(lv_no_4_0, grammarAccess.getConstructorAccess().getNoIsnTKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstructorRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1985:4: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_38); 

                    				newLeafNode(otherlv_5, grammarAccess.getConstructorAccess().getAreKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:1990:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    {
                    // InternalJRules.g:1990:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    // InternalJRules.g:1991:5: ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not'
                    {
                    // InternalJRules.g:1991:5: ( (lv_no_6_0= 'are' ) )
                    // InternalJRules.g:1992:6: (lv_no_6_0= 'are' )
                    {
                    // InternalJRules.g:1992:6: (lv_no_6_0= 'are' )
                    // InternalJRules.g:1993:7: lv_no_6_0= 'are'
                    {
                    lv_no_6_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_6_0, grammarAccess.getConstructorAccess().getNoAreKeyword_1_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getConstructorRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_38); 

                    					newLeafNode(otherlv_7, grammarAccess.getConstructorAccess().getNotKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2011:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:2011:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    // InternalJRules.g:2012:5: (lv_no_8_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:2012:5: (lv_no_8_0= 'aren\\'t' )
                    // InternalJRules.g:2013:6: lv_no_8_0= 'aren\\'t'
                    {
                    lv_no_8_0=(Token)match(input,28,FOLLOW_38); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getConstructorAccess().getNoArenTKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getConstructorRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConstructorAccess().getConstructorKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleReturn"
    // InternalJRules.g:2034:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:2034:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:2035:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // InternalJRules.g:2041:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleStringProperty ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2047:2: ( (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleStringProperty ) ) ) )
            // InternalJRules.g:2048:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleStringProperty ) ) )
            {
            // InternalJRules.g:2048:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleStringProperty ) ) )
            // InternalJRules.g:2049:3: otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleStringProperty ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:2057:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            else if ( (LA29_0==42) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalJRules.g:2058:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2063:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:2063:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:2064:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:2064:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:2065:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,42,FOLLOW_6); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getReturnAccess().getNoLessThanSignGreaterThanSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReturnRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "<>");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:2078:3: ( (lv_type_4_0= ruleStringProperty ) )
            // InternalJRules.g:2079:4: (lv_type_4_0= ruleStringProperty )
            {
            // InternalJRules.g:2079:4: (lv_type_4_0= ruleStringProperty )
            // InternalJRules.g:2080:5: lv_type_4_0= ruleStringProperty
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getTypeStringPropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleStringProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"es.uam.sara.tfg.dsl.JRules.StringProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleAttributeType"
    // InternalJRules.g:2101:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:2101:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:2102:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // InternalJRules.g:2108:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleStringProperty ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2114:2: ( (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleStringProperty ) ) ) )
            // InternalJRules.g:2115:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleStringProperty ) ) )
            {
            // InternalJRules.g:2115:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleStringProperty ) ) )
            // InternalJRules.g:2116:3: otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleStringProperty ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:2120:3: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalJRules.g:2121:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2126:4: ( (lv_no_2_0= '<>' ) )
                    {
                    // InternalJRules.g:2126:4: ( (lv_no_2_0= '<>' ) )
                    // InternalJRules.g:2127:5: (lv_no_2_0= '<>' )
                    {
                    // InternalJRules.g:2127:5: (lv_no_2_0= '<>' )
                    // InternalJRules.g:2128:6: lv_no_2_0= '<>'
                    {
                    lv_no_2_0=(Token)match(input,42,FOLLOW_6); 

                    						newLeafNode(lv_no_2_0, grammarAccess.getAttributeTypeAccess().getNoLessThanSignGreaterThanSignKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAttributeTypeRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "<>");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:2141:3: ( (lv_type_3_0= ruleStringProperty ) )
            // InternalJRules.g:2142:4: (lv_type_3_0= ruleStringProperty )
            {
            // InternalJRules.g:2142:4: (lv_type_3_0= ruleStringProperty )
            // InternalJRules.g:2143:5: lv_type_3_0= ruleStringProperty
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeStringPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleStringProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"es.uam.sara.tfg.dsl.JRules.StringProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleInitialize"
    // InternalJRules.g:2164:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:2164:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:2165:2: iv_ruleInitialize= ruleInitialize EOF
            {
             newCompositeNode(grammarAccess.getInitializeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialize=ruleInitialize();

            state._fsp--;

             current =iv_ruleInitialize; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialize"


    // $ANTLR start "ruleInitialize"
    // InternalJRules.g:2171:1: ruleInitialize returns [EObject current=null] : ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalJRules.g:2177:2: ( ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'initialize' ) )
            // InternalJRules.g:2178:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'initialize' )
            {
            // InternalJRules.g:2178:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'initialize' )
            // InternalJRules.g:2179:3: () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'initialize'
            {
            // InternalJRules.g:2179:3: ()
            // InternalJRules.g:2180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2186:3: (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) )
            int alt31=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==51) ) {
                    alt31=1;
                }
                else if ( (LA31_1==25) ) {
                    alt31=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt31=3;
                }
                break;
            case 27:
                {
                int LA31_3 = input.LA(2);

                if ( (LA31_3==25) ) {
                    alt31=5;
                }
                else if ( (LA31_3==51) ) {
                    alt31=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt31=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalJRules.g:2187:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2192:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    {
                    // InternalJRules.g:2192:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    // InternalJRules.g:2193:5: ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not'
                    {
                    // InternalJRules.g:2193:5: ( (lv_no_2_0= 'is' ) )
                    // InternalJRules.g:2194:6: (lv_no_2_0= 'is' )
                    {
                    // InternalJRules.g:2194:6: (lv_no_2_0= 'is' )
                    // InternalJRules.g:2195:7: lv_no_2_0= 'is'
                    {
                    lv_no_2_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_2_0, grammarAccess.getInitializeAccess().getNoIsKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInitializeRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_40); 

                    					newLeafNode(otherlv_3, grammarAccess.getInitializeAccess().getNotKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2213:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:2213:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    // InternalJRules.g:2214:5: (lv_no_4_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:2214:5: (lv_no_4_0= 'isn\\'t' )
                    // InternalJRules.g:2215:6: lv_no_4_0= 'isn\\'t'
                    {
                    lv_no_4_0=(Token)match(input,26,FOLLOW_40); 

                    						newLeafNode(lv_no_4_0, grammarAccess.getInitializeAccess().getNoIsnTKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitializeRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2228:4: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_40); 

                    				newLeafNode(otherlv_5, grammarAccess.getInitializeAccess().getAreKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:2233:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    {
                    // InternalJRules.g:2233:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    // InternalJRules.g:2234:5: ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not'
                    {
                    // InternalJRules.g:2234:5: ( (lv_no_6_0= 'are' ) )
                    // InternalJRules.g:2235:6: (lv_no_6_0= 'are' )
                    {
                    // InternalJRules.g:2235:6: (lv_no_6_0= 'are' )
                    // InternalJRules.g:2236:7: lv_no_6_0= 'are'
                    {
                    lv_no_6_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_6_0, grammarAccess.getInitializeAccess().getNoAreKeyword_1_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getInitializeRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_40); 

                    					newLeafNode(otherlv_7, grammarAccess.getInitializeAccess().getNotKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2254:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:2254:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    // InternalJRules.g:2255:5: (lv_no_8_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:2255:5: (lv_no_8_0= 'aren\\'t' )
                    // InternalJRules.g:2256:6: lv_no_8_0= 'aren\\'t'
                    {
                    lv_no_8_0=(Token)match(input,28,FOLLOW_40); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getInitializeAccess().getNoArenTKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInitializeRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getInitializeAccess().getInitializeKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleEmpty"
    // InternalJRules.g:2277:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:2277:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:2278:2: iv_ruleEmpty= ruleEmpty EOF
            {
             newCompositeNode(grammarAccess.getEmptyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmpty=ruleEmpty();

            state._fsp--;

             current =iv_ruleEmpty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEmpty"


    // $ANTLR start "ruleEmpty"
    // InternalJRules.g:2284:1: ruleEmpty returns [EObject current=null] : ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalJRules.g:2290:2: ( ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'empty' ) )
            // InternalJRules.g:2291:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'empty' )
            {
            // InternalJRules.g:2291:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'empty' )
            // InternalJRules.g:2292:3: () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'empty'
            {
            // InternalJRules.g:2292:3: ()
            // InternalJRules.g:2293:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2299:3: (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==25) ) {
                    alt32=2;
                }
                else if ( (LA32_1==52) ) {
                    alt32=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt32=3;
                }
                break;
            case 27:
                {
                int LA32_3 = input.LA(2);

                if ( (LA32_3==25) ) {
                    alt32=5;
                }
                else if ( (LA32_3==52) ) {
                    alt32=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalJRules.g:2300:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_41); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2305:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    {
                    // InternalJRules.g:2305:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    // InternalJRules.g:2306:5: ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not'
                    {
                    // InternalJRules.g:2306:5: ( (lv_no_2_0= 'is' ) )
                    // InternalJRules.g:2307:6: (lv_no_2_0= 'is' )
                    {
                    // InternalJRules.g:2307:6: (lv_no_2_0= 'is' )
                    // InternalJRules.g:2308:7: lv_no_2_0= 'is'
                    {
                    lv_no_2_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_2_0, grammarAccess.getEmptyAccess().getNoIsKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEmptyRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_41); 

                    					newLeafNode(otherlv_3, grammarAccess.getEmptyAccess().getNotKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2326:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:2326:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    // InternalJRules.g:2327:5: (lv_no_4_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:2327:5: (lv_no_4_0= 'isn\\'t' )
                    // InternalJRules.g:2328:6: lv_no_4_0= 'isn\\'t'
                    {
                    lv_no_4_0=(Token)match(input,26,FOLLOW_41); 

                    						newLeafNode(lv_no_4_0, grammarAccess.getEmptyAccess().getNoIsnTKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmptyRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2341:4: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_41); 

                    				newLeafNode(otherlv_5, grammarAccess.getEmptyAccess().getAreKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:2346:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    {
                    // InternalJRules.g:2346:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    // InternalJRules.g:2347:5: ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not'
                    {
                    // InternalJRules.g:2347:5: ( (lv_no_6_0= 'are' ) )
                    // InternalJRules.g:2348:6: (lv_no_6_0= 'are' )
                    {
                    // InternalJRules.g:2348:6: (lv_no_6_0= 'are' )
                    // InternalJRules.g:2349:7: lv_no_6_0= 'are'
                    {
                    lv_no_6_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_6_0, grammarAccess.getEmptyAccess().getNoAreKeyword_1_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEmptyRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_41); 

                    					newLeafNode(otherlv_7, grammarAccess.getEmptyAccess().getNotKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2367:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:2367:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    // InternalJRules.g:2368:5: (lv_no_8_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:2368:5: (lv_no_8_0= 'aren\\'t' )
                    // InternalJRules.g:2369:6: lv_no_8_0= 'aren\\'t'
                    {
                    lv_no_8_0=(Token)match(input,28,FOLLOW_41); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getEmptyAccess().getNoArenTKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmptyRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEmptyAccess().getEmptyKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEmpty"


    // $ANTLR start "entryRuleIsGeneric"
    // InternalJRules.g:2390:1: entryRuleIsGeneric returns [EObject current=null] : iv_ruleIsGeneric= ruleIsGeneric EOF ;
    public final EObject entryRuleIsGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGeneric = null;


        try {
            // InternalJRules.g:2390:50: (iv_ruleIsGeneric= ruleIsGeneric EOF )
            // InternalJRules.g:2391:2: iv_ruleIsGeneric= ruleIsGeneric EOF
            {
             newCompositeNode(grammarAccess.getIsGenericRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsGeneric=ruleIsGeneric();

            state._fsp--;

             current =iv_ruleIsGeneric; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIsGeneric"


    // $ANTLR start "ruleIsGeneric"
    // InternalJRules.g:2397:1: ruleIsGeneric returns [EObject current=null] : ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'generic' ) ;
    public final EObject ruleIsGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalJRules.g:2403:2: ( ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'generic' ) )
            // InternalJRules.g:2404:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'generic' )
            {
            // InternalJRules.g:2404:2: ( () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'generic' )
            // InternalJRules.g:2405:3: () (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) ) otherlv_9= 'generic'
            {
            // InternalJRules.g:2405:3: ()
            // InternalJRules.g:2406:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGenericAccess().getIsGenericAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2412:3: (otherlv_1= 'is' | ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' ) | ( (lv_no_4_0= 'isn\\'t' ) ) | otherlv_5= 'are' | ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' ) | ( (lv_no_8_0= 'aren\\'t' ) ) )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==25) ) {
                    alt33=2;
                }
                else if ( (LA33_1==53) ) {
                    alt33=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt33=3;
                }
                break;
            case 27:
                {
                int LA33_3 = input.LA(2);

                if ( (LA33_3==53) ) {
                    alt33=4;
                }
                else if ( (LA33_3==25) ) {
                    alt33=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalJRules.g:2413:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_42); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsGenericAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2418:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    {
                    // InternalJRules.g:2418:4: ( ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not' )
                    // InternalJRules.g:2419:5: ( (lv_no_2_0= 'is' ) ) otherlv_3= 'not'
                    {
                    // InternalJRules.g:2419:5: ( (lv_no_2_0= 'is' ) )
                    // InternalJRules.g:2420:6: (lv_no_2_0= 'is' )
                    {
                    // InternalJRules.g:2420:6: (lv_no_2_0= 'is' )
                    // InternalJRules.g:2421:7: lv_no_2_0= 'is'
                    {
                    lv_no_2_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_2_0, grammarAccess.getIsGenericAccess().getNoIsKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsGenericRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_42); 

                    					newLeafNode(otherlv_3, grammarAccess.getIsGenericAccess().getNotKeyword_1_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2439:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:2439:4: ( (lv_no_4_0= 'isn\\'t' ) )
                    // InternalJRules.g:2440:5: (lv_no_4_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:2440:5: (lv_no_4_0= 'isn\\'t' )
                    // InternalJRules.g:2441:6: lv_no_4_0= 'isn\\'t'
                    {
                    lv_no_4_0=(Token)match(input,26,FOLLOW_42); 

                    						newLeafNode(lv_no_4_0, grammarAccess.getIsGenericAccess().getNoIsnTKeyword_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsGenericRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2454:4: otherlv_5= 'are'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_42); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsGenericAccess().getAreKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:2459:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    {
                    // InternalJRules.g:2459:4: ( ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not' )
                    // InternalJRules.g:2460:5: ( (lv_no_6_0= 'are' ) ) otherlv_7= 'not'
                    {
                    // InternalJRules.g:2460:5: ( (lv_no_6_0= 'are' ) )
                    // InternalJRules.g:2461:6: (lv_no_6_0= 'are' )
                    {
                    // InternalJRules.g:2461:6: (lv_no_6_0= 'are' )
                    // InternalJRules.g:2462:7: lv_no_6_0= 'are'
                    {
                    lv_no_6_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_6_0, grammarAccess.getIsGenericAccess().getNoAreKeyword_1_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getIsGenericRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_42); 

                    					newLeafNode(otherlv_7, grammarAccess.getIsGenericAccess().getNotKeyword_1_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2480:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:2480:4: ( (lv_no_8_0= 'aren\\'t' ) )
                    // InternalJRules.g:2481:5: (lv_no_8_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:2481:5: (lv_no_8_0= 'aren\\'t' )
                    // InternalJRules.g:2482:6: lv_no_8_0= 'aren\\'t'
                    {
                    lv_no_8_0=(Token)match(input,28,FOLLOW_42); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getIsGenericAccess().getNoArenTKeyword_1_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getIsGenericRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getIsGenericAccess().getGenericKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIsGeneric"


    // $ANTLR start "entryRuleNameOperation"
    // InternalJRules.g:2503:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:2503:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:2504:2: iv_ruleNameOperation= ruleNameOperation EOF
            {
             newCompositeNode(grammarAccess.getNameOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameOperation=ruleNameOperation();

            state._fsp--;

             current =iv_ruleNameOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameOperation"


    // $ANTLR start "ruleNameOperation"
    // InternalJRules.g:2510:1: ruleNameOperation returns [EObject current=null] : ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) ) | ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? ) ) ;
    public final EObject ruleNameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_8=null;
        Enumerator lv_operator_4_0 = null;

        EObject lv_name_7_0 = null;

        Enumerator lv_Language_9_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2516:2: ( ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) ) | ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? ) ) )
            // InternalJRules.g:2517:2: ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) ) | ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? ) )
            {
            // InternalJRules.g:2517:2: ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) ) | ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==54) ) {
                alt37=1;
            }
            else if ( ((LA37_0>=41 && LA37_0<=42)) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalJRules.g:2518:3: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) )
                    {
                    // InternalJRules.g:2518:3: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) ) )
                    // InternalJRules.g:2519:4: otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) )
                    {
                    otherlv_0=(Token)match(input,54,FOLLOW_43); 

                    				newLeafNode(otherlv_0, grammarAccess.getNameOperationAccess().getNameKeyword_0_0());
                    			
                    // InternalJRules.g:2523:4: ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) ) )
                    // InternalJRules.g:2524:5: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )? ( (lv_operator_4_0= ruleNameOperator ) )
                    {
                    // InternalJRules.g:2524:5: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'doesn\\'t' ) ) )?
                    int alt34=3;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==36) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==37) ) {
                        alt34=2;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:2525:6: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )
                            {
                            // InternalJRules.g:2525:6: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )
                            // InternalJRules.g:2526:7: ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2526:7: ( (lv_no_1_0= 'does' ) )
                            // InternalJRules.g:2527:8: (lv_no_1_0= 'does' )
                            {
                            // InternalJRules.g:2527:8: (lv_no_1_0= 'does' )
                            // InternalJRules.g:2528:9: lv_no_1_0= 'does'
                            {
                            lv_no_1_0=(Token)match(input,36,FOLLOW_19); 

                            									newLeafNode(lv_no_1_0, grammarAccess.getNameOperationAccess().getNoDoesKeyword_0_1_0_0_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getNameOperationRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "does");
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,25,FOLLOW_43); 

                            							newLeafNode(otherlv_2, grammarAccess.getNameOperationAccess().getNotKeyword_0_1_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2546:6: ( (lv_no_3_0= 'doesn\\'t' ) )
                            {
                            // InternalJRules.g:2546:6: ( (lv_no_3_0= 'doesn\\'t' ) )
                            // InternalJRules.g:2547:7: (lv_no_3_0= 'doesn\\'t' )
                            {
                            // InternalJRules.g:2547:7: (lv_no_3_0= 'doesn\\'t' )
                            // InternalJRules.g:2548:8: lv_no_3_0= 'doesn\\'t'
                            {
                            lv_no_3_0=(Token)match(input,37,FOLLOW_43); 

                            								newLeafNode(lv_no_3_0, grammarAccess.getNameOperationAccess().getNoDoesnTKeyword_0_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNameOperationRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "doesn\'t");
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:2561:5: ( (lv_operator_4_0= ruleNameOperator ) )
                    // InternalJRules.g:2562:6: (lv_operator_4_0= ruleNameOperator )
                    {
                    // InternalJRules.g:2562:6: (lv_operator_4_0= ruleNameOperator )
                    // InternalJRules.g:2563:7: lv_operator_4_0= ruleNameOperator
                    {

                    							newCompositeNode(grammarAccess.getNameOperationAccess().getOperatorNameOperatorEnumRuleCall_0_1_1_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_operator_4_0=ruleNameOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameOperationRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_4_0,
                    								"es.uam.sara.tfg.dsl.JRules.NameOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2583:3: ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? )
                    {
                    // InternalJRules.g:2583:3: ( (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )? )
                    // InternalJRules.g:2584:4: (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) ) ( (lv_name_7_0= ruleStringProperty ) ) (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )?
                    {
                    // InternalJRules.g:2584:4: (otherlv_5= '=' | ( (lv_no_6_0= '<>' ) ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==41) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==42) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:2585:5: otherlv_5= '='
                            {
                            otherlv_5=(Token)match(input,41,FOLLOW_6); 

                            					newLeafNode(otherlv_5, grammarAccess.getNameOperationAccess().getEqualsSignKeyword_1_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2590:5: ( (lv_no_6_0= '<>' ) )
                            {
                            // InternalJRules.g:2590:5: ( (lv_no_6_0= '<>' ) )
                            // InternalJRules.g:2591:6: (lv_no_6_0= '<>' )
                            {
                            // InternalJRules.g:2591:6: (lv_no_6_0= '<>' )
                            // InternalJRules.g:2592:7: lv_no_6_0= '<>'
                            {
                            lv_no_6_0=(Token)match(input,42,FOLLOW_6); 

                            							newLeafNode(lv_no_6_0, grammarAccess.getNameOperationAccess().getNoLessThanSignGreaterThanSignKeyword_1_0_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNameOperationRule());
                            							}
                            							setWithLastConsumed(current, "no", true, "<>");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:2605:4: ( (lv_name_7_0= ruleStringProperty ) )
                    // InternalJRules.g:2606:5: (lv_name_7_0= ruleStringProperty )
                    {
                    // InternalJRules.g:2606:5: (lv_name_7_0= ruleStringProperty )
                    // InternalJRules.g:2607:6: lv_name_7_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getNameOperationAccess().getNameStringPropertyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_name_7_0=ruleStringProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameOperationRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_7_0,
                    							"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:2624:4: (otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==13) ) {
                        int LA36_1 = input.LA(2);

                        if ( ((LA36_1>=87 && LA36_1<=88)) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:2625:5: otherlv_8= ',' ( (lv_Language_9_0= ruleLanguage ) )
                            {
                            otherlv_8=(Token)match(input,13,FOLLOW_44); 

                            					newLeafNode(otherlv_8, grammarAccess.getNameOperationAccess().getCommaKeyword_1_2_0());
                            				
                            // InternalJRules.g:2629:5: ( (lv_Language_9_0= ruleLanguage ) )
                            // InternalJRules.g:2630:6: (lv_Language_9_0= ruleLanguage )
                            {
                            // InternalJRules.g:2630:6: (lv_Language_9_0= ruleLanguage )
                            // InternalJRules.g:2631:7: lv_Language_9_0= ruleLanguage
                            {

                            							newCompositeNode(grammarAccess.getNameOperationAccess().getLanguageLanguageEnumRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_Language_9_0=ruleLanguage();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNameOperationRule());
                            							}
                            							set(
                            								current,
                            								"Language",
                            								lv_Language_9_0,
                            								"es.uam.sara.tfg.dsl.JRules.Language");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameOperation"


    // $ANTLR start "entryRuleNameType"
    // InternalJRules.g:2654:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:2654:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:2655:2: iv_ruleNameType= ruleNameType EOF
            {
             newCompositeNode(grammarAccess.getNameTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNameType=ruleNameType();

            state._fsp--;

             current =iv_ruleNameType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNameType"


    // $ANTLR start "ruleNameType"
    // InternalJRules.g:2661:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'NameType' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2667:2: ( (otherlv_0= 'NameType' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:2668:2: (otherlv_0= 'NameType' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:2668:2: (otherlv_0= 'NameType' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            // InternalJRules.g:2669:3: otherlv_0= 'NameType' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameTypeKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:2677:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            else if ( (LA38_0==42) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalJRules.g:2678:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameTypeAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2683:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:2683:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:2684:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:2684:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:2685:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,42,FOLLOW_45); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getNameTypeAccess().getNoLessThanSignGreaterThanSignKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getNameTypeRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "<>");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:2698:3: ( (lv_type_4_0= ruleNameCheck ) )
            // InternalJRules.g:2699:4: (lv_type_4_0= ruleNameCheck )
            {
            // InternalJRules.g:2699:4: (lv_type_4_0= ruleNameCheck )
            // InternalJRules.g:2700:5: lv_type_4_0= ruleNameCheck
            {

            					newCompositeNode(grammarAccess.getNameTypeAccess().getTypeNameCheckEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleNameCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"es.uam.sara.tfg.dsl.JRules.NameCheck");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameType"


    // $ANTLR start "entryRuleJavaDoc"
    // InternalJRules.g:2721:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:2721:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:2722:2: iv_ruleJavaDoc= ruleJavaDoc EOF
            {
             newCompositeNode(grammarAccess.getJavaDocRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJavaDoc=ruleJavaDoc();

            state._fsp--;

             current =iv_ruleJavaDoc; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaDoc"


    // $ANTLR start "ruleJavaDoc"
    // InternalJRules.g:2728:1: ruleJavaDoc returns [EObject current=null] : ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) ;
    public final EObject ruleJavaDoc() throws RecognitionException {
        EObject current = null;

        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_author_3_0=null;
        Token lv_parameter_4_0=null;
        Token lv_return_5_0=null;
        Token lv_version_6_0=null;
        Token lv_throws_7_0=null;
        Token lv_see_8_0=null;


        	enterRule();

        try {
            // InternalJRules.g:2734:2: ( ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) )
            // InternalJRules.g:2735:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            {
            // InternalJRules.g:2735:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            // InternalJRules.g:2736:3: () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )?
            {
            // InternalJRules.g:2736:3: ()
            // InternalJRules.g:2737:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2743:3: ( (lv_no_1_0= 'no' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==17) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJRules.g:2744:4: (lv_no_1_0= 'no' )
                    {
                    // InternalJRules.g:2744:4: (lv_no_1_0= 'no' )
                    // InternalJRules.g:2745:5: lv_no_1_0= 'no'
                    {
                    lv_no_1_0=(Token)match(input,17,FOLLOW_46); 

                    					newLeafNode(lv_no_1_0, grammarAccess.getJavaDocAccess().getNoNoKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,56,FOLLOW_47); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaDocAccess().getJavaDocKeyword_2());
            		
            // InternalJRules.g:2761:3: ( (lv_author_3_0= '@author' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==57) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalJRules.g:2762:4: (lv_author_3_0= '@author' )
                    {
                    // InternalJRules.g:2762:4: (lv_author_3_0= '@author' )
                    // InternalJRules.g:2763:5: lv_author_3_0= '@author'
                    {
                    lv_author_3_0=(Token)match(input,57,FOLLOW_48); 

                    					newLeafNode(lv_author_3_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2775:3: ( (lv_parameter_4_0= '@parameter' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==58) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRules.g:2776:4: (lv_parameter_4_0= '@parameter' )
                    {
                    // InternalJRules.g:2776:4: (lv_parameter_4_0= '@parameter' )
                    // InternalJRules.g:2777:5: lv_parameter_4_0= '@parameter'
                    {
                    lv_parameter_4_0=(Token)match(input,58,FOLLOW_49); 

                    					newLeafNode(lv_parameter_4_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2789:3: ( (lv_return_5_0= '@return' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==59) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalJRules.g:2790:4: (lv_return_5_0= '@return' )
                    {
                    // InternalJRules.g:2790:4: (lv_return_5_0= '@return' )
                    // InternalJRules.g:2791:5: lv_return_5_0= '@return'
                    {
                    lv_return_5_0=(Token)match(input,59,FOLLOW_50); 

                    					newLeafNode(lv_return_5_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2803:3: ( (lv_version_6_0= '@version' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==60) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2804:4: (lv_version_6_0= '@version' )
                    {
                    // InternalJRules.g:2804:4: (lv_version_6_0= '@version' )
                    // InternalJRules.g:2805:5: lv_version_6_0= '@version'
                    {
                    lv_version_6_0=(Token)match(input,60,FOLLOW_51); 

                    					newLeafNode(lv_version_6_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2817:3: ( (lv_throws_7_0= '@throws' ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==61) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2818:4: (lv_throws_7_0= '@throws' )
                    {
                    // InternalJRules.g:2818:4: (lv_throws_7_0= '@throws' )
                    // InternalJRules.g:2819:5: lv_throws_7_0= '@throws'
                    {
                    lv_throws_7_0=(Token)match(input,61,FOLLOW_52); 

                    					newLeafNode(lv_throws_7_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2831:3: ( (lv_see_8_0= '@see' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==62) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2832:4: (lv_see_8_0= '@see' )
                    {
                    // InternalJRules.g:2832:4: (lv_see_8_0= '@see' )
                    // InternalJRules.g:2833:5: lv_see_8_0= '@see'
                    {
                    lv_see_8_0=(Token)match(input,62,FOLLOW_2); 

                    					newLeafNode(lv_see_8_0, grammarAccess.getJavaDocAccess().getSeeSeeKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "see", true, "@see");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaDoc"


    // $ANTLR start "entryRuleContains"
    // InternalJRules.g:2849:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:2849:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:2850:2: iv_ruleContains= ruleContains EOF
            {
             newCompositeNode(grammarAccess.getContainsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;

             current =iv_ruleContains; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContains"


    // $ANTLR start "ruleContains"
    // InternalJRules.g:2856:1: ruleContains returns [EObject current=null] : ( ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) ) | ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) ) ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token lv_no_4_0=null;
        Token otherlv_5=null;
        Token lv_no_6_0=null;
        Token otherlv_7=null;
        Token lv_no_8_0=null;
        EObject lv_which_9_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2862:2: ( ( ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) ) | ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) ) ) )
            // InternalJRules.g:2863:2: ( ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) ) | ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) ) )
            {
            // InternalJRules.g:2863:2: ( ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) ) | ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=34 && LA47_0<=37)||LA47_0==63) ) {
                alt47=1;
            }
            else if ( (LA47_0==64) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalJRules.g:2864:3: ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) )
                    {
                    // InternalJRules.g:2864:3: ( () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) )
                    // InternalJRules.g:2865:4: () ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    {
                    // InternalJRules.g:2865:4: ()
                    // InternalJRules.g:2866:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getContainsAccess().getContainsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalJRules.g:2872:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    // InternalJRules.g:2873:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have'
                    {
                    // InternalJRules.g:2873:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )?
                    int alt46=5;
                    switch ( input.LA(1) ) {
                        case 34:
                            {
                            alt46=1;
                            }
                            break;
                        case 35:
                            {
                            alt46=2;
                            }
                            break;
                        case 36:
                            {
                            alt46=3;
                            }
                            break;
                        case 37:
                            {
                            alt46=4;
                            }
                            break;
                    }

                    switch (alt46) {
                        case 1 :
                            // InternalJRules.g:2874:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            {
                            // InternalJRules.g:2874:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            // InternalJRules.g:2875:7: ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2875:7: ( (lv_no_1_0= 'do' ) )
                            // InternalJRules.g:2876:8: (lv_no_1_0= 'do' )
                            {
                            // InternalJRules.g:2876:8: (lv_no_1_0= 'do' )
                            // InternalJRules.g:2877:9: lv_no_1_0= 'do'
                            {
                            lv_no_1_0=(Token)match(input,34,FOLLOW_19); 

                            									newLeafNode(lv_no_1_0, grammarAccess.getContainsAccess().getNoDoKeyword_0_1_0_0_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "do");
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,25,FOLLOW_53); 

                            							newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getNotKeyword_0_1_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2895:6: ( (lv_no_3_0= 'don\\'t' ) )
                            {
                            // InternalJRules.g:2895:6: ( (lv_no_3_0= 'don\\'t' ) )
                            // InternalJRules.g:2896:7: (lv_no_3_0= 'don\\'t' )
                            {
                            // InternalJRules.g:2896:7: (lv_no_3_0= 'don\\'t' )
                            // InternalJRules.g:2897:8: lv_no_3_0= 'don\\'t'
                            {
                            lv_no_3_0=(Token)match(input,35,FOLLOW_53); 

                            								newLeafNode(lv_no_3_0, grammarAccess.getContainsAccess().getNoDonTKeyword_0_1_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getContainsRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "don\'t");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalJRules.g:2910:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            {
                            // InternalJRules.g:2910:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            // InternalJRules.g:2911:7: ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not'
                            {
                            // InternalJRules.g:2911:7: ( (lv_no_4_0= 'does' ) )
                            // InternalJRules.g:2912:8: (lv_no_4_0= 'does' )
                            {
                            // InternalJRules.g:2912:8: (lv_no_4_0= 'does' )
                            // InternalJRules.g:2913:9: lv_no_4_0= 'does'
                            {
                            lv_no_4_0=(Token)match(input,36,FOLLOW_19); 

                            									newLeafNode(lv_no_4_0, grammarAccess.getContainsAccess().getNoDoesKeyword_0_1_0_2_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "does");
                            								

                            }


                            }

                            otherlv_5=(Token)match(input,25,FOLLOW_53); 

                            							newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getNotKeyword_0_1_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalJRules.g:2931:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            {
                            // InternalJRules.g:2931:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            // InternalJRules.g:2932:7: (lv_no_6_0= 'doesn\\'t' )
                            {
                            // InternalJRules.g:2932:7: (lv_no_6_0= 'doesn\\'t' )
                            // InternalJRules.g:2933:8: lv_no_6_0= 'doesn\\'t'
                            {
                            lv_no_6_0=(Token)match(input,37,FOLLOW_53); 

                            								newLeafNode(lv_no_6_0, grammarAccess.getContainsAccess().getNoDoesnTKeyword_0_1_0_3_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getContainsRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "doesn\'t");
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,63,FOLLOW_2); 

                    					newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getHaveKeyword_0_1_1());
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2953:3: ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) )
                    {
                    // InternalJRules.g:2953:3: ( ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) ) )
                    // InternalJRules.g:2954:4: ( (lv_no_8_0= 'haven\\'t' ) ) ( (lv_which_9_0= ruleRule ) )
                    {
                    // InternalJRules.g:2954:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    // InternalJRules.g:2955:5: (lv_no_8_0= 'haven\\'t' )
                    {
                    // InternalJRules.g:2955:5: (lv_no_8_0= 'haven\\'t' )
                    // InternalJRules.g:2956:6: lv_no_8_0= 'haven\\'t'
                    {
                    lv_no_8_0=(Token)match(input,64,FOLLOW_5); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getContainsAccess().getNoHavenTKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "haven\'t");
                    					

                    }


                    }

                    // InternalJRules.g:2968:4: ( (lv_which_9_0= ruleRule ) )
                    // InternalJRules.g:2969:5: (lv_which_9_0= ruleRule )
                    {
                    // InternalJRules.g:2969:5: (lv_which_9_0= ruleRule )
                    // InternalJRules.g:2970:6: lv_which_9_0= ruleRule
                    {

                    						newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_which_9_0=ruleRule();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContainsRule());
                    						}
                    						set(
                    							current,
                    							"which",
                    							lv_which_9_0,
                    							"es.uam.sara.tfg.dsl.JRules.Rule");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleModifiers"
    // InternalJRules.g:2992:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:2992:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:2993:2: iv_ruleModifiers= ruleModifiers EOF
            {
             newCompositeNode(grammarAccess.getModifiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModifiers=ruleModifiers();

            state._fsp--;

             current =iv_ruleModifiers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModifiers"


    // $ANTLR start "ruleModifiers"
    // InternalJRules.g:2999:1: ruleModifiers returns [EObject current=null] : ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'modified' otherlv_9= 'with' otherlv_10= '[' ( (lv_blend_11_0= ruleBlendModifiers ) ) (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )* otherlv_14= ']' otherlv_15= '}' ) ;
    public final EObject ruleModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_6=null;
        Token lv_no_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_blend_11_0 = null;

        EObject lv_blend_13_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3005:2: ( ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'modified' otherlv_9= 'with' otherlv_10= '[' ( (lv_blend_11_0= ruleBlendModifiers ) ) (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )* otherlv_14= ']' otherlv_15= '}' ) )
            // InternalJRules.g:3006:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'modified' otherlv_9= 'with' otherlv_10= '[' ( (lv_blend_11_0= ruleBlendModifiers ) ) (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )* otherlv_14= ']' otherlv_15= '}' )
            {
            // InternalJRules.g:3006:2: ( (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'modified' otherlv_9= 'with' otherlv_10= '[' ( (lv_blend_11_0= ruleBlendModifiers ) ) (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )* otherlv_14= ']' otherlv_15= '}' )
            // InternalJRules.g:3007:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) ) otherlv_8= 'modified' otherlv_9= 'with' otherlv_10= '[' ( (lv_blend_11_0= ruleBlendModifiers ) ) (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )* otherlv_14= ']' otherlv_15= '}'
            {
            // InternalJRules.g:3007:3: (otherlv_0= 'is' | ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'isn\\'t' ) ) | otherlv_4= 'are' | ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' ) | ( (lv_no_7_0= 'aren\\'t' ) ) )
            int alt48=6;
            switch ( input.LA(1) ) {
            case 24:
                {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==25) ) {
                    alt48=2;
                }
                else if ( (LA48_1==65) ) {
                    alt48=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
                }
                break;
            case 26:
                {
                alt48=3;
                }
                break;
            case 27:
                {
                int LA48_3 = input.LA(2);

                if ( (LA48_3==65) ) {
                    alt48=4;
                }
                else if ( (LA48_3==25) ) {
                    alt48=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 3, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                alt48=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalJRules.g:3008:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_54); 

                    				newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3013:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    {
                    // InternalJRules.g:3013:4: ( ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not' )
                    // InternalJRules.g:3014:5: ( (lv_no_1_0= 'is' ) ) otherlv_2= 'not'
                    {
                    // InternalJRules.g:3014:5: ( (lv_no_1_0= 'is' ) )
                    // InternalJRules.g:3015:6: (lv_no_1_0= 'is' )
                    {
                    // InternalJRules.g:3015:6: (lv_no_1_0= 'is' )
                    // InternalJRules.g:3016:7: lv_no_1_0= 'is'
                    {
                    lv_no_1_0=(Token)match(input,24,FOLLOW_19); 

                    							newLeafNode(lv_no_1_0, grammarAccess.getModifiersAccess().getNoIsKeyword_0_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifiersRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "is");
                    						

                    }


                    }

                    otherlv_2=(Token)match(input,25,FOLLOW_54); 

                    					newLeafNode(otherlv_2, grammarAccess.getModifiersAccess().getNotKeyword_0_1_1());
                    				

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3034:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    {
                    // InternalJRules.g:3034:4: ( (lv_no_3_0= 'isn\\'t' ) )
                    // InternalJRules.g:3035:5: (lv_no_3_0= 'isn\\'t' )
                    {
                    // InternalJRules.g:3035:5: (lv_no_3_0= 'isn\\'t' )
                    // InternalJRules.g:3036:6: lv_no_3_0= 'isn\\'t'
                    {
                    lv_no_3_0=(Token)match(input,26,FOLLOW_54); 

                    						newLeafNode(lv_no_3_0, grammarAccess.getModifiersAccess().getNoIsnTKeyword_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModifiersRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "isn\'t");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3049:4: otherlv_4= 'are'
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_54); 

                    				newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getAreKeyword_0_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalJRules.g:3054:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    {
                    // InternalJRules.g:3054:4: ( ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not' )
                    // InternalJRules.g:3055:5: ( (lv_no_5_0= 'are' ) ) otherlv_6= 'not'
                    {
                    // InternalJRules.g:3055:5: ( (lv_no_5_0= 'are' ) )
                    // InternalJRules.g:3056:6: (lv_no_5_0= 'are' )
                    {
                    // InternalJRules.g:3056:6: (lv_no_5_0= 'are' )
                    // InternalJRules.g:3057:7: lv_no_5_0= 'are'
                    {
                    lv_no_5_0=(Token)match(input,27,FOLLOW_19); 

                    							newLeafNode(lv_no_5_0, grammarAccess.getModifiersAccess().getNoAreKeyword_0_4_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getModifiersRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "are");
                    						

                    }


                    }

                    otherlv_6=(Token)match(input,25,FOLLOW_54); 

                    					newLeafNode(otherlv_6, grammarAccess.getModifiersAccess().getNotKeyword_0_4_1());
                    				

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3075:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    {
                    // InternalJRules.g:3075:4: ( (lv_no_7_0= 'aren\\'t' ) )
                    // InternalJRules.g:3076:5: (lv_no_7_0= 'aren\\'t' )
                    {
                    // InternalJRules.g:3076:5: (lv_no_7_0= 'aren\\'t' )
                    // InternalJRules.g:3077:6: lv_no_7_0= 'aren\\'t'
                    {
                    lv_no_7_0=(Token)match(input,28,FOLLOW_54); 

                    						newLeafNode(lv_no_7_0, grammarAccess.getModifiersAccess().getNoArenTKeyword_0_5_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getModifiersRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "aren\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,65,FOLLOW_55); 

            			newLeafNode(otherlv_8, grammarAccess.getModifiersAccess().getModifiedKeyword_1());
            		
            otherlv_9=(Token)match(input,66,FOLLOW_36); 

            			newLeafNode(otherlv_9, grammarAccess.getModifiersAccess().getWithKeyword_2());
            		
            otherlv_10=(Token)match(input,43,FOLLOW_56); 

            			newLeafNode(otherlv_10, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_3());
            		
            // InternalJRules.g:3102:3: ( (lv_blend_11_0= ruleBlendModifiers ) )
            // InternalJRules.g:3103:4: (lv_blend_11_0= ruleBlendModifiers )
            {
            // InternalJRules.g:3103:4: (lv_blend_11_0= ruleBlendModifiers )
            // InternalJRules.g:3104:5: lv_blend_11_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_57);
            lv_blend_11_0=ruleBlendModifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiersRule());
            					}
            					add(
            						current,
            						"blend",
            						lv_blend_11_0,
            						"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:3121:3: (otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalJRules.g:3122:4: otherlv_12= 'or' ( (lv_blend_13_0= ruleBlendModifiers ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_56); 

            	    				newLeafNode(otherlv_12, grammarAccess.getModifiersAccess().getOrKeyword_5_0());
            	    			
            	    // InternalJRules.g:3126:4: ( (lv_blend_13_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:3127:5: (lv_blend_13_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:3127:5: (lv_blend_13_0= ruleBlendModifiers )
            	    // InternalJRules.g:3128:6: lv_blend_13_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_57);
            	    lv_blend_13_0=ruleBlendModifiers();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModifiersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"blend",
            	    							lv_blend_13_0,
            	    							"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_14=(Token)match(input,45,FOLLOW_58); 

            			newLeafNode(otherlv_14, grammarAccess.getModifiersAccess().getRightSquareBracketKeyword_6());
            		
            otherlv_15=(Token)match(input,67,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getModifiersAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModifiers"


    // $ANTLR start "entryRuleRangoNames"
    // InternalJRules.g:3158:1: entryRuleRangoNames returns [EObject current=null] : iv_ruleRangoNames= ruleRangoNames EOF ;
    public final EObject entryRuleRangoNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangoNames = null;


        try {
            // InternalJRules.g:3158:51: (iv_ruleRangoNames= ruleRangoNames EOF )
            // InternalJRules.g:3159:2: iv_ruleRangoNames= ruleRangoNames EOF
            {
             newCompositeNode(grammarAccess.getRangoNamesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRangoNames=ruleRangoNames();

            state._fsp--;

             current =iv_ruleRangoNames; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRangoNames"


    // $ANTLR start "ruleRangoNames"
    // InternalJRules.g:3165:1: ruleRangoNames returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) ;
    public final EObject ruleRangoNames() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_min_2_0 = null;

        AntlrDatatypeRuleToken lv_max_4_0 = null;

        EObject lv_types_9_0 = null;

        EObject lv_types_11_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3171:2: ( ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) )
            // InternalJRules.g:3172:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            {
            // InternalJRules.g:3172:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            // InternalJRules.g:3173:3: () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            {
            // InternalJRules.g:3173:3: ()
            // InternalJRules.g:3174:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangoNamesAccess().getRangoNamesAction_0(),
            					current);
            			

            }

            // InternalJRules.g:3180:3: (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJRules.g:3181:4: otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getRangoNamesAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalJRules.g:3185:4: ( (lv_min_2_0= ruleEInt ) )
                    // InternalJRules.g:3186:5: (lv_min_2_0= ruleEInt )
                    {
                    // InternalJRules.g:3186:5: (lv_min_2_0= ruleEInt )
                    // InternalJRules.g:3187:6: lv_min_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getMinEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_min_2_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangoNamesRule());
                    						}
                    						set(
                    							current,
                    							"min",
                    							lv_min_2_0,
                    							"es.uam.sara.tfg.dsl.JRules.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,44,FOLLOW_30); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangoNamesAccess().getFullStopFullStopKeyword_1_2());
                    			
                    // InternalJRules.g:3208:4: ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_INT||LA50_0==70) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==14) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalJRules.g:3209:5: ( (lv_max_4_0= ruleEInt ) )
                            {
                            // InternalJRules.g:3209:5: ( (lv_max_4_0= ruleEInt ) )
                            // InternalJRules.g:3210:6: (lv_max_4_0= ruleEInt )
                            {
                            // InternalJRules.g:3210:6: (lv_max_4_0= ruleEInt )
                            // InternalJRules.g:3211:7: lv_max_4_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getRangoNamesAccess().getMaxEIntParserRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_31);
                            lv_max_4_0=ruleEInt();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getRangoNamesRule());
                            							}
                            							set(
                            								current,
                            								"max",
                            								lv_max_4_0,
                            								"es.uam.sara.tfg.dsl.JRules.EInt");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:3229:5: otherlv_5= '*'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_31); 

                            					newLeafNode(otherlv_5, grammarAccess.getRangoNamesAccess().getAsteriskKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_34); 

                    				newLeafNode(otherlv_6, grammarAccess.getRangoNamesAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalJRules.g:3239:3: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==47) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJRules.g:3240:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_59); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangoNamesAccess().getTypesKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,68,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRangoNamesAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalJRules.g:3248:4: ( (lv_types_9_0= ruleStringProperty ) )
                    // InternalJRules.g:3249:5: (lv_types_9_0= ruleStringProperty )
                    {
                    // InternalJRules.g:3249:5: (lv_types_9_0= ruleStringProperty )
                    // InternalJRules.g:3250:6: lv_types_9_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_60);
                    lv_types_9_0=ruleStringProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRangoNamesRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_9_0,
                    							"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:3267:4: (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==13) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalJRules.g:3268:5: otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRangoNamesAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalJRules.g:3272:5: ( (lv_types_11_0= ruleStringProperty ) )
                    	    // InternalJRules.g:3273:6: (lv_types_11_0= ruleStringProperty )
                    	    {
                    	    // InternalJRules.g:3273:6: (lv_types_11_0= ruleStringProperty )
                    	    // InternalJRules.g:3274:7: lv_types_11_0= ruleStringProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_60);
                    	    lv_types_11_0=ruleStringProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRangoNamesRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_11_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,67,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getRangoNamesAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRangoNames"


    // $ANTLR start "entryRuleStringProperty"
    // InternalJRules.g:3301:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalJRules.g:3301:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalJRules.g:3302:2: iv_ruleStringProperty= ruleStringProperty EOF
            {
             newCompositeNode(grammarAccess.getStringPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringProperty=ruleStringProperty();

            state._fsp--;

             current =iv_ruleStringProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringProperty"


    // $ANTLR start "ruleStringProperty"
    // InternalJRules.g:3308:1: ruleStringProperty returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_StringVariable_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:3314:2: ( (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) )
            // InternalJRules.g:3315:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            {
            // InternalJRules.g:3315:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_STRING) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==69) ) {
                    alt54=2;
                }
                else if ( (LA54_1==EOF||LA54_1==13||LA54_1==16||(LA54_1>=20 && LA54_1<=21)||LA54_1==23||LA54_1==45||LA54_1==67) ) {
                    alt54=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA54_0==RULE_ID) ) {
                int LA54_2 = input.LA(2);

                if ( (LA54_2==EOF||LA54_2==13||LA54_2==16||(LA54_2>=20 && LA54_2<=21)||LA54_2==23||LA54_2==45||LA54_2==67) ) {
                    alt54=1;
                }
                else if ( (LA54_2==69) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalJRules.g:3316:3: this_StringValue_0= ruleStringValue
                    {

                    			newCompositeNode(grammarAccess.getStringPropertyAccess().getStringValueParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;


                    			current = this_StringValue_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3325:3: this_StringVariable_1= ruleStringVariable
                    {

                    			newCompositeNode(grammarAccess.getStringPropertyAccess().getStringVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringVariable_1=ruleStringVariable();

                    state._fsp--;


                    			current = this_StringVariable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringProperty"


    // $ANTLR start "entryRuleStringValue"
    // InternalJRules.g:3337:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJRules.g:3337:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJRules.g:3338:2: iv_ruleStringValue= ruleStringValue EOF
            {
             newCompositeNode(grammarAccess.getStringValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;

             current =iv_ruleStringValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // InternalJRules.g:3344:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3350:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalJRules.g:3351:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalJRules.g:3351:2: ( (lv_value_0_0= ruleEString ) )
            // InternalJRules.g:3352:3: (lv_value_0_0= ruleEString )
            {
            // InternalJRules.g:3352:3: (lv_value_0_0= ruleEString )
            // InternalJRules.g:3353:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getStringValueAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getStringValueRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"es.uam.sara.tfg.dsl.JRules.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleStringVariable"
    // InternalJRules.g:3373:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalJRules.g:3373:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalJRules.g:3374:2: iv_ruleStringVariable= ruleStringVariable EOF
            {
             newCompositeNode(grammarAccess.getStringVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringVariable=ruleStringVariable();

            state._fsp--;

             current =iv_ruleStringVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringVariable"


    // $ANTLR start "ruleStringVariable"
    // InternalJRules.g:3380:1: ruleStringVariable returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_subtype_2_0 = null;

        Enumerator lv_strings_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3386:2: ( ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) ) )
            // InternalJRules.g:3387:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) )
            {
            // InternalJRules.g:3387:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) )
            // InternalJRules.g:3388:3: ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) )
            {
            // InternalJRules.g:3388:3: ( ( ruleEString ) )
            // InternalJRules.g:3389:4: ( ruleEString )
            {
            // InternalJRules.g:3389:4: ( ruleEString )
            // InternalJRules.g:3390:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStringVariableAccess().getVariableVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_61);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:3404:3: (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==69) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=76 && LA55_1<=82)) ) {
                    alt55=1;
                }
            }
            switch (alt55) {
                case 1 :
                    // InternalJRules.g:3405:4: otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_9); 

                    				newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJRules.g:3409:4: ( (lv_subtype_2_0= ruleElement ) )
                    // InternalJRules.g:3410:5: (lv_subtype_2_0= ruleElement )
                    {
                    // InternalJRules.g:3410:5: (lv_subtype_2_0= ruleElement )
                    // InternalJRules.g:3411:6: lv_subtype_2_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getStringVariableAccess().getSubtypeElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_61);
                    lv_subtype_2_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringVariableRule());
                    						}
                    						set(
                    							current,
                    							"subtype",
                    							lv_subtype_2_0,
                    							"es.uam.sara.tfg.dsl.JRules.Element");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,69,FOLLOW_62); 

            			newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getFullStopKeyword_2());
            		
            // InternalJRules.g:3433:3: ( (lv_strings_4_0= ruleElementString ) )
            // InternalJRules.g:3434:4: (lv_strings_4_0= ruleElementString )
            {
            // InternalJRules.g:3434:4: (lv_strings_4_0= ruleElementString )
            // InternalJRules.g:3435:5: lv_strings_4_0= ruleElementString
            {

            					newCompositeNode(grammarAccess.getStringVariableAccess().getStringsElementStringEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_strings_4_0=ruleElementString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringVariableRule());
            					}
            					set(
            						current,
            						"strings",
            						lv_strings_4_0,
            						"es.uam.sara.tfg.dsl.JRules.ElementString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringVariable"


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:3456:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:3456:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:3457:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalJRules.g:3463:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3469:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:3470:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:3470:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:3471:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:3471:3: (kw= '-' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJRules.g:3472:4: kw= '-'
                    {
                    kw=(Token)match(input,70,FOLLOW_63); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBlendModifiers"
    // InternalJRules.g:3489:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:3489:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:3490:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
            {
             newCompositeNode(grammarAccess.getBlendModifiersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlendModifiers=ruleBlendModifiers();

            state._fsp--;

             current =iv_ruleBlendModifiers; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlendModifiers"


    // $ANTLR start "ruleBlendModifiers"
    // InternalJRules.g:3496:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) ;
    public final EObject ruleBlendModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_static_2_0=null;
        Token otherlv_3=null;
        Token lv_final_4_0=null;
        Token otherlv_5=null;
        Token lv_abstract_6_0=null;
        Token otherlv_7=null;
        Token lv_default_8_0=null;
        Token otherlv_9=null;
        Token lv_synchronized_10_0=null;
        Token lv_static_11_0=null;
        Token otherlv_12=null;
        Token lv_final_13_0=null;
        Token otherlv_14=null;
        Token lv_abstract_15_0=null;
        Token otherlv_16=null;
        Token lv_default_17_0=null;
        Token otherlv_18=null;
        Token lv_synchronized_19_0=null;
        Token lv_final_20_0=null;
        Token otherlv_21=null;
        Token lv_abstract_22_0=null;
        Token otherlv_23=null;
        Token lv_default_24_0=null;
        Token otherlv_25=null;
        Token lv_synchronized_26_0=null;
        Token lv_abstract_27_0=null;
        Token otherlv_28=null;
        Token lv_default_29_0=null;
        Token otherlv_30=null;
        Token lv_synchronized_31_0=null;
        Token lv_default_32_0=null;
        Token otherlv_33=null;
        Token lv_synchronized_34_0=null;
        Token lv_synchronized_35_0=null;
        Enumerator lv_access_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3502:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) )
            // InternalJRules.g:3503:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:3503:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            int alt72=6;
            switch ( input.LA(1) ) {
            case 94:
            case 95:
            case 96:
                {
                alt72=1;
                }
                break;
            case 71:
                {
                alt72=2;
                }
                break;
            case 72:
                {
                alt72=3;
                }
                break;
            case 73:
                {
                alt72=4;
                }
                break;
            case 74:
                {
                alt72=5;
                }
                break;
            case 75:
                {
                alt72=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalJRules.g:3504:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3504:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3505:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3505:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:3506:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:3506:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:3507:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_access_0_0=ruleAccessModifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlendModifiersRule());
                    						}
                    						set(
                    							current,
                    							"access",
                    							lv_access_0_0,
                    							"es.uam.sara.tfg.dsl.JRules.AccessModifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:3524:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==21) ) {
                        int LA57_1 = input.LA(2);

                        if ( (LA57_1==71) ) {
                            alt57=1;
                        }
                    }
                    switch (alt57) {
                        case 1 :
                            // InternalJRules.g:3525:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,21,FOLLOW_64); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:3529:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:3530:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:3530:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:3531:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,71,FOLLOW_16); 

                            							newLeafNode(lv_static_2_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "static", true, "static");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3544:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==21) ) {
                        int LA58_1 = input.LA(2);

                        if ( (LA58_1==72) ) {
                            alt58=1;
                        }
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalJRules.g:3545:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,21,FOLLOW_65); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:3549:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:3550:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:3550:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:3551:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,72,FOLLOW_16); 

                            							newLeafNode(lv_final_4_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_0_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "final", true, "final");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3564:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt59=2;
                    int LA59_0 = input.LA(1);

                    if ( (LA59_0==21) ) {
                        int LA59_1 = input.LA(2);

                        if ( (LA59_1==73) ) {
                            alt59=1;
                        }
                    }
                    switch (alt59) {
                        case 1 :
                            // InternalJRules.g:3565:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,21,FOLLOW_66); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:3569:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:3570:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:3570:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:3571:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,73,FOLLOW_16); 

                            							newLeafNode(lv_abstract_6_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_0_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3584:4: (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==21) ) {
                        int LA60_1 = input.LA(2);

                        if ( (LA60_1==74) ) {
                            alt60=1;
                        }
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalJRules.g:3585:5: otherlv_7= 'and' ( (lv_default_8_0= 'default' ) )
                            {
                            otherlv_7=(Token)match(input,21,FOLLOW_67); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:3589:5: ( (lv_default_8_0= 'default' ) )
                            // InternalJRules.g:3590:6: (lv_default_8_0= 'default' )
                            {
                            // InternalJRules.g:3590:6: (lv_default_8_0= 'default' )
                            // InternalJRules.g:3591:7: lv_default_8_0= 'default'
                            {
                            lv_default_8_0=(Token)match(input,74,FOLLOW_16); 

                            							newLeafNode(lv_default_8_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_0_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "default", true, "default");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3604:4: (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==21) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalJRules.g:3605:5: otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) )
                            {
                            otherlv_9=(Token)match(input,21,FOLLOW_68); 

                            					newLeafNode(otherlv_9, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_5_0());
                            				
                            // InternalJRules.g:3609:5: ( (lv_synchronized_10_0= 'synchronized' ) )
                            // InternalJRules.g:3610:6: (lv_synchronized_10_0= 'synchronized' )
                            {
                            // InternalJRules.g:3610:6: (lv_synchronized_10_0= 'synchronized' )
                            // InternalJRules.g:3611:7: lv_synchronized_10_0= 'synchronized'
                            {
                            lv_synchronized_10_0=(Token)match(input,75,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_10_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_0_5_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "synchronized", true, "synchronized");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3626:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3626:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3627:4: ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3627:4: ( (lv_static_11_0= 'static' ) )
                    // InternalJRules.g:3628:5: (lv_static_11_0= 'static' )
                    {
                    // InternalJRules.g:3628:5: (lv_static_11_0= 'static' )
                    // InternalJRules.g:3629:6: lv_static_11_0= 'static'
                    {
                    lv_static_11_0=(Token)match(input,71,FOLLOW_16); 

                    						newLeafNode(lv_static_11_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:3641:4: (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==21) ) {
                        int LA62_1 = input.LA(2);

                        if ( (LA62_1==72) ) {
                            alt62=1;
                        }
                    }
                    switch (alt62) {
                        case 1 :
                            // InternalJRules.g:3642:5: otherlv_12= 'and' ( (lv_final_13_0= 'final' ) )
                            {
                            otherlv_12=(Token)match(input,21,FOLLOW_65); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:3646:5: ( (lv_final_13_0= 'final' ) )
                            // InternalJRules.g:3647:6: (lv_final_13_0= 'final' )
                            {
                            // InternalJRules.g:3647:6: (lv_final_13_0= 'final' )
                            // InternalJRules.g:3648:7: lv_final_13_0= 'final'
                            {
                            lv_final_13_0=(Token)match(input,72,FOLLOW_16); 

                            							newLeafNode(lv_final_13_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "final", true, "final");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3661:4: (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==21) ) {
                        int LA63_1 = input.LA(2);

                        if ( (LA63_1==73) ) {
                            alt63=1;
                        }
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalJRules.g:3662:5: otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) )
                            {
                            otherlv_14=(Token)match(input,21,FOLLOW_66); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:3666:5: ( (lv_abstract_15_0= 'abstract' ) )
                            // InternalJRules.g:3667:6: (lv_abstract_15_0= 'abstract' )
                            {
                            // InternalJRules.g:3667:6: (lv_abstract_15_0= 'abstract' )
                            // InternalJRules.g:3668:7: lv_abstract_15_0= 'abstract'
                            {
                            lv_abstract_15_0=(Token)match(input,73,FOLLOW_16); 

                            							newLeafNode(lv_abstract_15_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3681:4: (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==21) ) {
                        int LA64_1 = input.LA(2);

                        if ( (LA64_1==74) ) {
                            alt64=1;
                        }
                    }
                    switch (alt64) {
                        case 1 :
                            // InternalJRules.g:3682:5: otherlv_16= 'and' ( (lv_default_17_0= 'default' ) )
                            {
                            otherlv_16=(Token)match(input,21,FOLLOW_67); 

                            					newLeafNode(otherlv_16, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:3686:5: ( (lv_default_17_0= 'default' ) )
                            // InternalJRules.g:3687:6: (lv_default_17_0= 'default' )
                            {
                            // InternalJRules.g:3687:6: (lv_default_17_0= 'default' )
                            // InternalJRules.g:3688:7: lv_default_17_0= 'default'
                            {
                            lv_default_17_0=(Token)match(input,74,FOLLOW_16); 

                            							newLeafNode(lv_default_17_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_1_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "default", true, "default");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3701:4: (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==21) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalJRules.g:3702:5: otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) )
                            {
                            otherlv_18=(Token)match(input,21,FOLLOW_68); 

                            					newLeafNode(otherlv_18, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_4_0());
                            				
                            // InternalJRules.g:3706:5: ( (lv_synchronized_19_0= 'synchronized' ) )
                            // InternalJRules.g:3707:6: (lv_synchronized_19_0= 'synchronized' )
                            {
                            // InternalJRules.g:3707:6: (lv_synchronized_19_0= 'synchronized' )
                            // InternalJRules.g:3708:7: lv_synchronized_19_0= 'synchronized'
                            {
                            lv_synchronized_19_0=(Token)match(input,75,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_19_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_1_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "synchronized", true, "synchronized");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3723:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3723:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3724:4: ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3724:4: ( (lv_final_20_0= 'final' ) )
                    // InternalJRules.g:3725:5: (lv_final_20_0= 'final' )
                    {
                    // InternalJRules.g:3725:5: (lv_final_20_0= 'final' )
                    // InternalJRules.g:3726:6: lv_final_20_0= 'final'
                    {
                    lv_final_20_0=(Token)match(input,72,FOLLOW_16); 

                    						newLeafNode(lv_final_20_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:3738:4: (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==21) ) {
                        int LA66_1 = input.LA(2);

                        if ( (LA66_1==73) ) {
                            alt66=1;
                        }
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalJRules.g:3739:5: otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) )
                            {
                            otherlv_21=(Token)match(input,21,FOLLOW_66); 

                            					newLeafNode(otherlv_21, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:3743:5: ( (lv_abstract_22_0= 'abstract' ) )
                            // InternalJRules.g:3744:6: (lv_abstract_22_0= 'abstract' )
                            {
                            // InternalJRules.g:3744:6: (lv_abstract_22_0= 'abstract' )
                            // InternalJRules.g:3745:7: lv_abstract_22_0= 'abstract'
                            {
                            lv_abstract_22_0=(Token)match(input,73,FOLLOW_16); 

                            							newLeafNode(lv_abstract_22_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3758:4: (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==21) ) {
                        int LA67_1 = input.LA(2);

                        if ( (LA67_1==74) ) {
                            alt67=1;
                        }
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalJRules.g:3759:5: otherlv_23= 'and' ( (lv_default_24_0= 'default' ) )
                            {
                            otherlv_23=(Token)match(input,21,FOLLOW_67); 

                            					newLeafNode(otherlv_23, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:3763:5: ( (lv_default_24_0= 'default' ) )
                            // InternalJRules.g:3764:6: (lv_default_24_0= 'default' )
                            {
                            // InternalJRules.g:3764:6: (lv_default_24_0= 'default' )
                            // InternalJRules.g:3765:7: lv_default_24_0= 'default'
                            {
                            lv_default_24_0=(Token)match(input,74,FOLLOW_16); 

                            							newLeafNode(lv_default_24_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_2_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "default", true, "default");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3778:4: (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==21) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // InternalJRules.g:3779:5: otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) )
                            {
                            otherlv_25=(Token)match(input,21,FOLLOW_68); 

                            					newLeafNode(otherlv_25, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_3_0());
                            				
                            // InternalJRules.g:3783:5: ( (lv_synchronized_26_0= 'synchronized' ) )
                            // InternalJRules.g:3784:6: (lv_synchronized_26_0= 'synchronized' )
                            {
                            // InternalJRules.g:3784:6: (lv_synchronized_26_0= 'synchronized' )
                            // InternalJRules.g:3785:7: lv_synchronized_26_0= 'synchronized'
                            {
                            lv_synchronized_26_0=(Token)match(input,75,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_26_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_2_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "synchronized", true, "synchronized");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3800:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3800:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3801:4: ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3801:4: ( (lv_abstract_27_0= 'abstract' ) )
                    // InternalJRules.g:3802:5: (lv_abstract_27_0= 'abstract' )
                    {
                    // InternalJRules.g:3802:5: (lv_abstract_27_0= 'abstract' )
                    // InternalJRules.g:3803:6: lv_abstract_27_0= 'abstract'
                    {
                    lv_abstract_27_0=(Token)match(input,73,FOLLOW_16); 

                    						newLeafNode(lv_abstract_27_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:3815:4: (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==21) ) {
                        int LA69_1 = input.LA(2);

                        if ( (LA69_1==74) ) {
                            alt69=1;
                        }
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalJRules.g:3816:5: otherlv_28= 'and' ( (lv_default_29_0= 'default' ) )
                            {
                            otherlv_28=(Token)match(input,21,FOLLOW_67); 

                            					newLeafNode(otherlv_28, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:3820:5: ( (lv_default_29_0= 'default' ) )
                            // InternalJRules.g:3821:6: (lv_default_29_0= 'default' )
                            {
                            // InternalJRules.g:3821:6: (lv_default_29_0= 'default' )
                            // InternalJRules.g:3822:7: lv_default_29_0= 'default'
                            {
                            lv_default_29_0=(Token)match(input,74,FOLLOW_16); 

                            							newLeafNode(lv_default_29_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "default", true, "default");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:3835:4: (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==21) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalJRules.g:3836:5: otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) )
                            {
                            otherlv_30=(Token)match(input,21,FOLLOW_68); 

                            					newLeafNode(otherlv_30, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_2_0());
                            				
                            // InternalJRules.g:3840:5: ( (lv_synchronized_31_0= 'synchronized' ) )
                            // InternalJRules.g:3841:6: (lv_synchronized_31_0= 'synchronized' )
                            {
                            // InternalJRules.g:3841:6: (lv_synchronized_31_0= 'synchronized' )
                            // InternalJRules.g:3842:7: lv_synchronized_31_0= 'synchronized'
                            {
                            lv_synchronized_31_0=(Token)match(input,75,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_31_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "synchronized", true, "synchronized");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3857:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3857:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3858:4: ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3858:4: ( (lv_default_32_0= 'default' ) )
                    // InternalJRules.g:3859:5: (lv_default_32_0= 'default' )
                    {
                    // InternalJRules.g:3859:5: (lv_default_32_0= 'default' )
                    // InternalJRules.g:3860:6: lv_default_32_0= 'default'
                    {
                    lv_default_32_0=(Token)match(input,74,FOLLOW_16); 

                    						newLeafNode(lv_default_32_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

                    }


                    }

                    // InternalJRules.g:3872:4: (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==21) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalJRules.g:3873:5: otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) )
                            {
                            otherlv_33=(Token)match(input,21,FOLLOW_68); 

                            					newLeafNode(otherlv_33, grammarAccess.getBlendModifiersAccess().getAndKeyword_4_1_0());
                            				
                            // InternalJRules.g:3877:5: ( (lv_synchronized_34_0= 'synchronized' ) )
                            // InternalJRules.g:3878:6: (lv_synchronized_34_0= 'synchronized' )
                            {
                            // InternalJRules.g:3878:6: (lv_synchronized_34_0= 'synchronized' )
                            // InternalJRules.g:3879:7: lv_synchronized_34_0= 'synchronized'
                            {
                            lv_synchronized_34_0=(Token)match(input,75,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_34_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_4_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "synchronized", true, "synchronized");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3894:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:3894:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    // InternalJRules.g:3895:4: (lv_synchronized_35_0= 'synchronized' )
                    {
                    // InternalJRules.g:3895:4: (lv_synchronized_35_0= 'synchronized' )
                    // InternalJRules.g:3896:5: lv_synchronized_35_0= 'synchronized'
                    {
                    lv_synchronized_35_0=(Token)match(input,75,FOLLOW_2); 

                    					newLeafNode(lv_synchronized_35_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBlendModifiersRule());
                    					}
                    					setWithLastConsumed(current, "synchronized", true, "synchronized");
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlendModifiers"


    // $ANTLR start "entryRuleEString"
    // InternalJRules.g:3912:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:3912:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:3913:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalJRules.g:3919:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3925:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:3926:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:3926:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_STRING) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_ID) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalJRules.g:3927:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3935:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleElement"
    // InternalJRules.g:3946:1: ruleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) ;
    public final Enumerator ruleElement() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalJRules.g:3952:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) )
            // InternalJRules.g:3953:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            {
            // InternalJRules.g:3953:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            int alt74=7;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt74=1;
                }
                break;
            case 77:
                {
                alt74=2;
                }
                break;
            case 78:
                {
                alt74=3;
                }
                break;
            case 79:
                {
                alt74=4;
                }
                break;
            case 80:
                {
                alt74=5;
                }
                break;
            case 81:
                {
                alt74=6;
                }
                break;
            case 82:
                {
                alt74=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalJRules.g:3954:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:3954:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:3955:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3962:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:3962:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:3963:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3970:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:3970:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:3971:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3978:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:3978:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:3979:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3986:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:3986:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:3987:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3994:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:3994:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:3995:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:4002:3: (enumLiteral_6= 'File' )
                    {
                    // InternalJRules.g:4002:3: (enumLiteral_6= 'File' )
                    // InternalJRules.g:4003:4: enumLiteral_6= 'File'
                    {
                    enumLiteral_6=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getFileEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getElementAccess().getFileEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElement"


    // $ANTLR start "ruleNameOperator"
    // InternalJRules.g:4013:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) | (enumLiteral_2= 'CONTAIN' ) | (enumLiteral_3= 'LIKE' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:4019:2: ( ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) | (enumLiteral_2= 'CONTAIN' ) | (enumLiteral_3= 'LIKE' ) ) )
            // InternalJRules.g:4020:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) | (enumLiteral_2= 'CONTAIN' ) | (enumLiteral_3= 'LIKE' ) )
            {
            // InternalJRules.g:4020:2: ( (enumLiteral_0= 'START' ) | (enumLiteral_1= 'END' ) | (enumLiteral_2= 'CONTAIN' ) | (enumLiteral_3= 'LIKE' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt75=1;
                }
                break;
            case 84:
                {
                alt75=2;
                }
                break;
            case 85:
                {
                alt75=3;
                }
                break;
            case 86:
                {
                alt75=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalJRules.g:4021:3: (enumLiteral_0= 'START' )
                    {
                    // InternalJRules.g:4021:3: (enumLiteral_0= 'START' )
                    // InternalJRules.g:4022:4: enumLiteral_0= 'START'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4029:3: (enumLiteral_1= 'END' )
                    {
                    // InternalJRules.g:4029:3: (enumLiteral_1= 'END' )
                    // InternalJRules.g:4030:4: enumLiteral_1= 'END'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4037:3: (enumLiteral_2= 'CONTAIN' )
                    {
                    // InternalJRules.g:4037:3: (enumLiteral_2= 'CONTAIN' )
                    // InternalJRules.g:4038:4: enumLiteral_2= 'CONTAIN'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:4045:3: (enumLiteral_3= 'LIKE' )
                    {
                    // InternalJRules.g:4045:3: (enumLiteral_3= 'LIKE' )
                    // InternalJRules.g:4046:4: enumLiteral_3= 'LIKE'
                    {
                    enumLiteral_3=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameOperator"


    // $ANTLR start "ruleElementString"
    // InternalJRules.g:4056:1: ruleElementString returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) ;
    public final Enumerator ruleElementString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4062:2: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) )
            // InternalJRules.g:4063:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            {
            // InternalJRules.g:4063:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==54) ) {
                alt76=1;
            }
            else if ( (LA76_0==50) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalJRules.g:4064:3: (enumLiteral_0= 'name' )
                    {
                    // InternalJRules.g:4064:3: (enumLiteral_0= 'name' )
                    // InternalJRules.g:4065:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4072:3: (enumLiteral_1= 'type' )
                    {
                    // InternalJRules.g:4072:3: (enumLiteral_1= 'type' )
                    // InternalJRules.g:4073:4: enumLiteral_1= 'type'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getElementStringAccess().getTypeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementStringAccess().getTypeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleElementString"


    // $ANTLR start "ruleLanguage"
    // InternalJRules.g:4083:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'SPANISH' ) | (enumLiteral_1= 'ENGLISH' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4089:2: ( ( (enumLiteral_0= 'SPANISH' ) | (enumLiteral_1= 'ENGLISH' ) ) )
            // InternalJRules.g:4090:2: ( (enumLiteral_0= 'SPANISH' ) | (enumLiteral_1= 'ENGLISH' ) )
            {
            // InternalJRules.g:4090:2: ( (enumLiteral_0= 'SPANISH' ) | (enumLiteral_1= 'ENGLISH' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==87) ) {
                alt77=1;
            }
            else if ( (LA77_0==88) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalJRules.g:4091:3: (enumLiteral_0= 'SPANISH' )
                    {
                    // InternalJRules.g:4091:3: (enumLiteral_0= 'SPANISH' )
                    // InternalJRules.g:4092:4: enumLiteral_0= 'SPANISH'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4099:3: (enumLiteral_1= 'ENGLISH' )
                    {
                    // InternalJRules.g:4099:3: (enumLiteral_1= 'ENGLISH' )
                    // InternalJRules.g:4100:4: enumLiteral_1= 'ENGLISH'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "ruleNameCheck"
    // InternalJRules.g:4110:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'UPPER_CASE' ) | (enumLiteral_1= 'LOWER_CASE' ) | (enumLiteral_2= 'UPPER_CAMEL_CASE' ) | (enumLiteral_3= 'LOWER_CAMEL_CASE' ) | (enumLiteral_4= 'START_UPPER_CASE' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:4116:2: ( ( (enumLiteral_0= 'UPPER_CASE' ) | (enumLiteral_1= 'LOWER_CASE' ) | (enumLiteral_2= 'UPPER_CAMEL_CASE' ) | (enumLiteral_3= 'LOWER_CAMEL_CASE' ) | (enumLiteral_4= 'START_UPPER_CASE' ) ) )
            // InternalJRules.g:4117:2: ( (enumLiteral_0= 'UPPER_CASE' ) | (enumLiteral_1= 'LOWER_CASE' ) | (enumLiteral_2= 'UPPER_CAMEL_CASE' ) | (enumLiteral_3= 'LOWER_CAMEL_CASE' ) | (enumLiteral_4= 'START_UPPER_CASE' ) )
            {
            // InternalJRules.g:4117:2: ( (enumLiteral_0= 'UPPER_CASE' ) | (enumLiteral_1= 'LOWER_CASE' ) | (enumLiteral_2= 'UPPER_CAMEL_CASE' ) | (enumLiteral_3= 'LOWER_CAMEL_CASE' ) | (enumLiteral_4= 'START_UPPER_CASE' ) )
            int alt78=5;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt78=1;
                }
                break;
            case 90:
                {
                alt78=2;
                }
                break;
            case 91:
                {
                alt78=3;
                }
                break;
            case 92:
                {
                alt78=4;
                }
                break;
            case 93:
                {
                alt78=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalJRules.g:4118:3: (enumLiteral_0= 'UPPER_CASE' )
                    {
                    // InternalJRules.g:4118:3: (enumLiteral_0= 'UPPER_CASE' )
                    // InternalJRules.g:4119:4: enumLiteral_0= 'UPPER_CASE'
                    {
                    enumLiteral_0=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4126:3: (enumLiteral_1= 'LOWER_CASE' )
                    {
                    // InternalJRules.g:4126:3: (enumLiteral_1= 'LOWER_CASE' )
                    // InternalJRules.g:4127:4: enumLiteral_1= 'LOWER_CASE'
                    {
                    enumLiteral_1=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4134:3: (enumLiteral_2= 'UPPER_CAMEL_CASE' )
                    {
                    // InternalJRules.g:4134:3: (enumLiteral_2= 'UPPER_CAMEL_CASE' )
                    // InternalJRules.g:4135:4: enumLiteral_2= 'UPPER_CAMEL_CASE'
                    {
                    enumLiteral_2=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:4142:3: (enumLiteral_3= 'LOWER_CAMEL_CASE' )
                    {
                    // InternalJRules.g:4142:3: (enumLiteral_3= 'LOWER_CAMEL_CASE' )
                    // InternalJRules.g:4143:4: enumLiteral_3= 'LOWER_CAMEL_CASE'
                    {
                    enumLiteral_3=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:4150:3: (enumLiteral_4= 'START_UPPER_CASE' )
                    {
                    // InternalJRules.g:4150:3: (enumLiteral_4= 'START_UPPER_CASE' )
                    // InternalJRules.g:4151:4: enumLiteral_4= 'START_UPPER_CASE'
                    {
                    enumLiteral_4=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getSTART_UPPER_CASEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNameCheckAccess().getSTART_UPPER_CASEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNameCheck"


    // $ANTLR start "ruleAccessModifier"
    // InternalJRules.g:4161:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4167:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalJRules.g:4168:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalJRules.g:4168:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt79=1;
                }
                break;
            case 95:
                {
                alt79=2;
                }
                break;
            case 96:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalJRules.g:4169:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJRules.g:4169:3: (enumLiteral_0= 'public' )
                    // InternalJRules.g:4170:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4177:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalJRules.g:4177:3: (enumLiteral_1= 'protected' )
                    // InternalJRules.g:4178:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4185:3: (enumLiteral_2= 'private' )
                    {
                    // InternalJRules.g:4185:3: (enumLiteral_2= 'private' )
                    // InternalJRules.g:4186:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAccessModifier"


    // $ANTLR start "ruleQuantifier"
    // InternalJRules.g:4196:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4202:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:4203:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:4203:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt80=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt80=1;
                }
                break;
            case 98:
                {
                alt80=2;
                }
                break;
            case 99:
                {
                alt80=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalJRules.g:4204:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:4204:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:4205:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4212:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:4212:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:4213:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4220:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:4220:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:4221:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQuantifier"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\1\21\1\31\1\35\1\31\1\35\1\31\1\46\1\31\1\46\14\uffff\1\35\7\uffff\1\35\2\46";
    static final String dfa_3s = "\1\100\4\101\1\31\1\77\1\31\1\77\14\uffff\1\101\7\uffff\1\101\2\77";
    static final String dfa_4s = "\11\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\17\1\20\1\21\1\22\1\14\1\4\1\uffff\1\3\1\16\1\11\1\23\1\2\1\15\1\1\3\uffff";
    static final String dfa_5s = "\40\uffff}>";
    static final String[] dfa_6s = {
            "\1\21\6\uffff\1\1\1\uffff\1\2\1\3\1\4\5\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\2\17\3\uffff\1\14\2\uffff\1\15\1\16\3\uffff\1\17\1\20\1\21\6\uffff\2\22",
            "\1\25\3\uffff\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "\1\35\3\uffff\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "\1\36",
            "\1\11\1\12\27\uffff\1\22",
            "\1\37",
            "\1\11\1\12\27\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\1\32\1\26\1\24\17\uffff\1\30\2\uffff\1\23\1\33\1\27\13\uffff\1\31",
            "\1\11\1\12\27\uffff\1\22",
            "\1\11\1\12\27\uffff\1\22"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "674:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_JavaDoc_16= ruleJavaDoc | this_Contains_17= ruleContains | this_Modifiers_18= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000022060L,0x0000000E00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000000L,0x000000000007F000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x81C647FC1D420000L,0x0000000000000001L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000D0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004010L,0x0000000000000040L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000890000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000003000000000L,0x0000000000780000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x000000003E000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7E00000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x7C00000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000F80L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000008L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});

}