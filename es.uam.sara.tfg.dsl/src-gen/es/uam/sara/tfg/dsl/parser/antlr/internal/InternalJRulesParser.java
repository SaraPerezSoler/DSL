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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Projects'", "'Name:'", "','", "'*'", "';'", "':'", "'in'", "'from'", "'satisfy'", "'no'", "'which'", "'or'", "'and'", "'('", "')'", "'is'", "'are'", "'not'", "'implemented'", "'superinterface'", "'superclass'", "'subclass'", "'of'", "'do'", "'don\\'t'", "'does'", "'doesn\\'t'", "'implements'", "'extends'", "'size'", "'='", "'<>'", "'['", "'..'", "']'", "'parameters'", "'types'", "'constructor'", "'return'", "'type'", "'initialize'", "'empty'", "'generic'", "'name'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'haven\\'t'", "'{'", "'}'", "'modified'", "'with'", "'.'", "'Primitive.'", "'isPrimitive'", "'()'", "'isCollection'", "'-'", "'static'", "'final'", "'abstract'", "'default'", "'synchronized'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'File'", "'boolean'", "'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", "'String'", "'start '", "'end'", "'contain'", "'like'", "'Spanish'", "'English'", "'upper case'", "'lower case'", "'upper camel case'", "'lower camel case'", "'start upper case'", "'public'", "'protected'", "'private'", "'one'", "'exists'", "'all'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
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
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // InternalJRules.g:72:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) ( (lv_sentences_7_0= ruleSentence ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ProjectName_2_0 = null;

        AntlrDatatypeRuleToken lv_ProjectName_4_0 = null;

        EObject lv_sentences_6_0 = null;

        EObject lv_sentences_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:78:2: ( (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) ( (lv_sentences_7_0= ruleSentence ) )* ) )
            // InternalJRules.g:79:2: (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) ( (lv_sentences_7_0= ruleSentence ) )* )
            {
            // InternalJRules.g:79:2: (otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) ( (lv_sentences_7_0= ruleSentence ) )* )
            // InternalJRules.g:80:3: otherlv_0= 'Projects' otherlv_1= 'Name:' ( ( ( (lv_ProjectName_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_ProjectName_4_0= ruleEString ) ) )* ) | otherlv_5= '*' ) ( (lv_sentences_6_0= ruleSentence ) ) ( (lv_sentences_7_0= ruleSentence ) )*
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

            // InternalJRules.g:160:3: ( (lv_sentences_7_0= ruleSentence ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==20||(LA3_0>=109 && LA3_0<=111)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalJRules.g:161:4: (lv_sentences_7_0= ruleSentence )
            	    {
            	    // InternalJRules.g:161:4: (lv_sentences_7_0= ruleSentence )
            	    // InternalJRules.g:162:5: lv_sentences_7_0= ruleSentence
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getSentencesSentenceParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_sentences_7_0=ruleSentence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sentences",
            	    						lv_sentences_7_0,
            	    						"es.uam.sara.tfg.dsl.JRules.Sentence");
            	    					afterParserOrEnumRuleCall();
            	    				

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
    // InternalJRules.g:183:1: entryRuleSentence returns [EObject current=null] : iv_ruleSentence= ruleSentence EOF ;
    public final EObject entryRuleSentence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSentence = null;


        try {
            // InternalJRules.g:183:49: (iv_ruleSentence= ruleSentence EOF )
            // InternalJRules.g:184:2: iv_ruleSentence= ruleSentence EOF
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
    // InternalJRules.g:190:1: ruleSentence returns [EObject current=null] : ( (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) otherlv_2= ';' ) ;
    public final EObject ruleSentence() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Variable_0 = null;

        EObject this_Rule_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:196:2: ( ( (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) otherlv_2= ';' ) )
            // InternalJRules.g:197:2: ( (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) otherlv_2= ';' )
            {
            // InternalJRules.g:197:2: ( (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) otherlv_2= ';' )
            // InternalJRules.g:198:3: (this_Variable_0= ruleVariable | this_Rule_1= ruleRule ) otherlv_2= ';'
            {
            // InternalJRules.g:198:3: (this_Variable_0= ruleVariable | this_Rule_1= ruleRule )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            else if ( (LA4_0==20||(LA4_0>=109 && LA4_0<=111)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:199:4: this_Variable_0= ruleVariable
                    {

                    				newCompositeNode(grammarAccess.getSentenceAccess().getVariableParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_8);
                    this_Variable_0=ruleVariable();

                    state._fsp--;


                    				current = this_Variable_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:208:4: this_Rule_1= ruleRule
                    {

                    				newCompositeNode(grammarAccess.getSentenceAccess().getRuleParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_8);
                    this_Rule_1=ruleRule();

                    state._fsp--;


                    				current = this_Rule_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSentenceAccess().getSemicolonKeyword_1());
            		

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
    // InternalJRules.g:232:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_satisfy_8_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:238:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? ) )
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )? )
            // InternalJRules.g:240:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )?
            {
            // InternalJRules.g:240:3: ( (lv_name_0_0= ruleEString ) )
            // InternalJRules.g:241:4: (lv_name_0_0= ruleEString )
            {
            // InternalJRules.g:241:4: (lv_name_0_0= ruleEString )
            // InternalJRules.g:242:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
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

            otherlv_1=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getColonKeyword_1());
            		
            // InternalJRules.g:263:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRules.g:264:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRules.g:264:4: (lv_element_2_0= ruleElement )
            // InternalJRules.g:265:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getElementElementEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalJRules.g:282:3: (otherlv_3= 'in' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:283:4: otherlv_3= 'in' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getInKeyword_3_0());
                    			
                    // InternalJRules.g:287:4: ( ( ruleEString ) )
                    // InternalJRules.g:288:5: ( ruleEString )
                    {
                    // InternalJRules.g:288:5: ( ruleEString )
                    // InternalJRules.g:289:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getInVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:304:3: (otherlv_5= 'from' ( ( ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:305:4: otherlv_5= 'from' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getFromKeyword_4_0());
                    			
                    // InternalJRules.g:309:4: ( ( ruleEString ) )
                    // InternalJRules.g:310:5: ( ruleEString )
                    {
                    // InternalJRules.g:310:5: ( ruleEString )
                    // InternalJRules.g:311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getFromVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:326:3: (otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:327:4: otherlv_7= 'satisfy' ( (lv_satisfy_8_0= ruleOr ) )
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getSatisfyKeyword_5_0());
                    			
                    // InternalJRules.g:331:4: ( (lv_satisfy_8_0= ruleOr ) )
                    // InternalJRules.g:332:5: (lv_satisfy_8_0= ruleOr )
                    {
                    // InternalJRules.g:332:5: (lv_satisfy_8_0= ruleOr )
                    // InternalJRules.g:333:6: lv_satisfy_8_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getSatisfyOrParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_8_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleRule"
    // InternalJRules.g:355:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:355:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:356:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:362:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )? (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_quantifier_1_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_filter_8_0 = null;

        EObject lv_satisfy_10_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:368:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )? (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )? ) )
            // InternalJRules.g:369:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )? (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:369:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )? (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )? )
            // InternalJRules.g:370:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'in' ( ( ruleEString ) ) )? (otherlv_5= 'from' ( ( ruleEString ) ) )? (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )? (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )?
            {
            // InternalJRules.g:370:3: ( (lv_no_0_0= 'no' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJRules.g:371:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:371:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:372:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,20,FOLLOW_5); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:384:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:385:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:385:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:386:5: lv_quantifier_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQuantifierQuantifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalJRules.g:403:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRules.g:404:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRules.g:404:4: (lv_element_2_0= ruleElement )
            // InternalJRules.g:405:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getElementElementEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_15);
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

            // InternalJRules.g:422:3: (otherlv_3= 'in' ( ( ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRules.g:423:4: otherlv_3= 'in' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getInKeyword_3_0());
                    			
                    // InternalJRules.g:427:4: ( ( ruleEString ) )
                    // InternalJRules.g:428:5: ( ruleEString )
                    {
                    // InternalJRules.g:428:5: ( ruleEString )
                    // InternalJRules.g:429:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getInVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:444:3: (otherlv_5= 'from' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJRules.g:445:4: otherlv_5= 'from' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getFromKeyword_4_0());
                    			
                    // InternalJRules.g:449:4: ( ( ruleEString ) )
                    // InternalJRules.g:450:5: ( ruleEString )
                    {
                    // InternalJRules.g:450:5: ( ruleEString )
                    // InternalJRules.g:451:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getFromVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:466:3: (otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJRules.g:467:4: otherlv_7= 'which' ( (lv_filter_8_0= ruleOr ) )
                    {
                    otherlv_7=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getWhichKeyword_5_0());
                    			
                    // InternalJRules.g:471:4: ( (lv_filter_8_0= ruleOr ) )
                    // InternalJRules.g:472:5: (lv_filter_8_0= ruleOr )
                    {
                    // InternalJRules.g:472:5: (lv_filter_8_0= ruleOr )
                    // InternalJRules.g:473:6: lv_filter_8_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterOrParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_filter_8_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_8_0,
                    							"es.uam.sara.tfg.dsl.JRules.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:491:3: (otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:492:4: otherlv_9= 'satisfy' ( (lv_satisfy_10_0= ruleOr ) )
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getSatisfyKeyword_6_0());
                    			
                    // InternalJRules.g:496:4: ( (lv_satisfy_10_0= ruleOr ) )
                    // InternalJRules.g:497:5: (lv_satisfy_10_0= ruleOr )
                    {
                    // InternalJRules.g:497:5: (lv_satisfy_10_0= ruleOr )
                    // InternalJRules.g:498:6: lv_satisfy_10_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_10_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"satisfy",
                    							lv_satisfy_10_0,
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
    // InternalJRules.g:520:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:520:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:521:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:527:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:533:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:534:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:534:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:535:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:535:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:536:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:536:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:537:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalJRules.g:554:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJRules.g:555:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:559:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:560:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:560:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:561:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop13;
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
    // InternalJRules.g:583:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:583:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:584:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:590:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:596:2: ( ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) )
            // InternalJRules.g:597:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            {
            // InternalJRules.g:597:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            // InternalJRules.g:598:3: ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            {
            // InternalJRules.g:598:3: ( (lv_op_0_0= rulePrimaryOp ) )
            // InternalJRules.g:599:4: (lv_op_0_0= rulePrimaryOp )
            {
            // InternalJRules.g:599:4: (lv_op_0_0= rulePrimaryOp )
            // InternalJRules.g:600:5: lv_op_0_0= rulePrimaryOp
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_19);
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

            // InternalJRules.g:617:3: (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalJRules.g:618:4: otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_14); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRules.g:622:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalJRules.g:623:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalJRules.g:623:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalJRules.g:624:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
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
            	    break loop14;
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
    // InternalJRules.g:646:1: entryRulePrimaryOp returns [EObject current=null] : iv_rulePrimaryOp= rulePrimaryOp EOF ;
    public final EObject entryRulePrimaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryOp = null;


        try {
            // InternalJRules.g:646:50: (iv_rulePrimaryOp= rulePrimaryOp EOF )
            // InternalJRules.g:647:2: iv_rulePrimaryOp= rulePrimaryOp EOF
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
    // InternalJRules.g:653:1: rulePrimaryOp returns [EObject current=null] : ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) ;
    public final EObject rulePrimaryOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;

        EObject this_PropertyLiteral_3 = null;



        	enterRule();

        try {
            // InternalJRules.g:659:2: ( ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) )
            // InternalJRules.g:660:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            {
            // InternalJRules.g:660:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            else if ( (LA15_0==20||(LA15_0>=26 && LA15_0<=27)||(LA15_0>=34 && LA15_0<=40)||LA15_0==46||(LA15_0>=49 && LA15_0<=50)||(LA15_0>=54 && LA15_0<=55)||(LA15_0>=62 && LA15_0<=63)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalJRules.g:661:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    {
                    // InternalJRules.g:661:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    // InternalJRules.g:662:4: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,24,FOLLOW_14); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryOpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryOpAccess().getOrParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_20);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    				current = this_Or_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,25,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryOpAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:680:3: this_PropertyLiteral_3= rulePropertyLiteral
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
    // InternalJRules.g:692:1: entryRulePropertyLiteral returns [EObject current=null] : iv_rulePropertyLiteral= rulePropertyLiteral EOF ;
    public final EObject entryRulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyLiteral = null;


        try {
            // InternalJRules.g:692:56: (iv_rulePropertyLiteral= rulePropertyLiteral EOF )
            // InternalJRules.g:693:2: iv_rulePropertyLiteral= rulePropertyLiteral EOF
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
    // InternalJRules.g:699:1: rulePropertyLiteral returns [EObject current=null] : ( (lv_property_0_0= ruleProperty ) ) ;
    public final EObject rulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:705:2: ( ( (lv_property_0_0= ruleProperty ) ) )
            // InternalJRules.g:706:2: ( (lv_property_0_0= ruleProperty ) )
            {
            // InternalJRules.g:706:2: ( (lv_property_0_0= ruleProperty ) )
            // InternalJRules.g:707:3: (lv_property_0_0= ruleProperty )
            {
            // InternalJRules.g:707:3: (lv_property_0_0= ruleProperty )
            // InternalJRules.g:708:4: lv_property_0_0= ruleProperty
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
    // InternalJRules.g:728:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJRules.g:728:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJRules.g:729:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalJRules.g:735:1: ruleProperty returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) ;
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

        EObject this_Contains_16 = null;

        EObject this_JavaDoc_17 = null;

        EObject this_Modifiers_18 = null;



        	enterRule();

        try {
            // InternalJRules.g:741:2: ( (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) )
            // InternalJRules.g:742:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            {
            // InternalJRules.g:742:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            int alt16=19;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalJRules.g:743:3: this_isImplemented_0= ruleisImplemented
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
                    // InternalJRules.g:752:3: this_IsSuperInterface_1= ruleIsSuperInterface
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
                    // InternalJRules.g:761:3: this_IsSuperClass_2= ruleIsSuperClass
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
                    // InternalJRules.g:770:3: this_IsSubClass_3= ruleIsSubClass
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
                    // InternalJRules.g:779:3: this_Implements_4= ruleImplements
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
                    // InternalJRules.g:788:3: this_Extends_5= ruleExtends
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
                    // InternalJRules.g:797:3: this_Tamanio_6= ruleTamanio
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
                    // InternalJRules.g:806:3: this_Parameter_7= ruleParameter
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
                    // InternalJRules.g:815:3: this_Constructor_8= ruleConstructor
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
                    // InternalJRules.g:824:3: this_Return_9= ruleReturn
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
                    // InternalJRules.g:833:3: this_AttributeType_10= ruleAttributeType
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
                    // InternalJRules.g:842:3: this_Initialize_11= ruleInitialize
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
                    // InternalJRules.g:851:3: this_Empty_12= ruleEmpty
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
                    // InternalJRules.g:860:3: this_IsGeneric_13= ruleIsGeneric
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
                    // InternalJRules.g:869:3: this_NameOperation_14= ruleNameOperation
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
                    // InternalJRules.g:878:3: this_NameType_15= ruleNameType
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
                    // InternalJRules.g:887:3: this_Contains_16= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getContainsParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_16=ruleContains();

                    state._fsp--;


                    			current = this_Contains_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalJRules.g:896:3: this_JavaDoc_17= ruleJavaDoc
                    {

                    			newCompositeNode(grammarAccess.getPropertyAccess().getJavaDocParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_JavaDoc_17=ruleJavaDoc();

                    state._fsp--;


                    			current = this_JavaDoc_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalJRules.g:905:3: this_Modifiers_18= ruleModifiers
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
    // InternalJRules.g:917:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:917:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:918:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:924:1: ruleisImplemented returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:930:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:931:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:931:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:932:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:932:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            else if ( (LA17_0==27) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:933:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsImplementedAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:938:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_21); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:943:3: ( (lv_no_2_0= 'not' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:944:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:944:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:945:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,28,FOLLOW_22); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsImplementedAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsImplementedRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,29,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIsImplementedAccess().getImplementedKeyword_2());
            		
            // InternalJRules.g:961:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:962:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:962:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:963:5: lv_valores_4_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsImplementedAccess().getValoresRangoNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_4_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsImplementedRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_4_0,
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
    // InternalJRules.g:984:1: entryRuleIsSuperInterface returns [EObject current=null] : iv_ruleIsSuperInterface= ruleIsSuperInterface EOF ;
    public final EObject entryRuleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperInterface = null;


        try {
            // InternalJRules.g:984:57: (iv_ruleIsSuperInterface= ruleIsSuperInterface EOF )
            // InternalJRules.g:985:2: iv_ruleIsSuperInterface= ruleIsSuperInterface EOF
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
    // InternalJRules.g:991:1: ruleIsSuperInterface returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:997:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:998:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:998:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:999:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:999:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( (LA19_0==27) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1000:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperInterfaceAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1005:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperInterfaceAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1010:3: ( (lv_no_2_0= 'not' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1011:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1011:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1012:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,28,FOLLOW_25); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperInterfaceAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperInterfaceAccess().getSuperinterfaceKeyword_2());
            		
            // InternalJRules.g:1028:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1029:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1029:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1030:5: lv_valores_4_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsSuperInterfaceAccess().getValoresRangoNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_4_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsSuperInterfaceRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_4_0,
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
    // InternalJRules.g:1051:1: entryRuleIsSuperClass returns [EObject current=null] : iv_ruleIsSuperClass= ruleIsSuperClass EOF ;
    public final EObject entryRuleIsSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperClass = null;


        try {
            // InternalJRules.g:1051:53: (iv_ruleIsSuperClass= ruleIsSuperClass EOF )
            // InternalJRules.g:1052:2: iv_ruleIsSuperClass= ruleIsSuperClass EOF
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
    // InternalJRules.g:1058:1: ruleIsSuperClass returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1064:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1065:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1065:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1066:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1066:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            else if ( (LA21_0==27) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1067:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperClassAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1072:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperClassAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1077:3: ( (lv_no_2_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1078:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1078:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1079:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,28,FOLLOW_27); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperClassAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_23); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperClassAccess().getSuperclassKeyword_2());
            		
            // InternalJRules.g:1095:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1096:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1096:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1097:5: lv_valores_4_0= ruleRangoNames
            {

            					newCompositeNode(grammarAccess.getIsSuperClassAccess().getValoresRangoNamesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_valores_4_0=ruleRangoNames();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIsSuperClassRule());
            					}
            					set(
            						current,
            						"valores",
            						lv_valores_4_0,
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
    // InternalJRules.g:1118:1: entryRuleIsSubClass returns [EObject current=null] : iv_ruleIsSubClass= ruleIsSubClass EOF ;
    public final EObject entryRuleIsSubClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSubClass = null;


        try {
            // InternalJRules.g:1118:51: (iv_ruleIsSubClass= ruleIsSubClass EOF )
            // InternalJRules.g:1119:2: iv_ruleIsSubClass= ruleIsSubClass EOF
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
    // InternalJRules.g:1125:1: ruleIsSubClass returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) ;
    public final EObject ruleIsSubClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_of_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1131:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) )
            // InternalJRules.g:1132:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            {
            // InternalJRules.g:1132:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            // InternalJRules.g:1133:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            {
            // InternalJRules.g:1133:3: ()
            // InternalJRules.g:1134:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsSubClassAccess().getIsSubClassAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1140:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==26) ) {
                alt23=1;
            }
            else if ( (LA23_0==27) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1141:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSubClassAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1146:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsSubClassAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1151:3: ( (lv_no_3_0= 'not' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1152:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1152:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1153:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,28,FOLLOW_29); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getIsSubClassAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSubClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_4, grammarAccess.getIsSubClassAccess().getSubclassKeyword_3());
            		
            // InternalJRules.g:1169:3: (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1170:4: otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsSubClassAccess().getOfKeyword_4_0());
                    			
                    // InternalJRules.g:1174:4: ( (lv_of_6_0= ruleStringProperty ) )
                    // InternalJRules.g:1175:5: (lv_of_6_0= ruleStringProperty )
                    {
                    // InternalJRules.g:1175:5: (lv_of_6_0= ruleStringProperty )
                    // InternalJRules.g:1176:6: lv_of_6_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getIsSubClassAccess().getOfStringPropertyParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_of_6_0=ruleStringProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsSubClassRule());
                    						}
                    						set(
                    							current,
                    							"of",
                    							lv_of_6_0,
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
    // InternalJRules.g:1198:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:1198:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:1199:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:1205:1: ruleImplements returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1211:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1212:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1212:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1213:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1213:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt26=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt26=1;
                    }
                    break;
                case 35:
                    {
                    alt26=2;
                    }
                    break;
                case 36:
                    {
                    alt26=3;
                    }
                    break;
                case 37:
                    {
                    alt26=4;
                    }
                    break;
            }

            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1214:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1214:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1215:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1215:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1216:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1216:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1217:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,34,FOLLOW_31); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getImplementsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_32); 

                    					newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1235:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1235:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1236:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1236:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1237:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,35,FOLLOW_32); 

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
                    // InternalJRules.g:1250:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1250:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1251:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1251:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1252:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1252:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1253:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,36,FOLLOW_31); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getImplementsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_32); 

                    					newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1271:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1271:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1272:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1272:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1273:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,37,FOLLOW_32); 

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

            otherlv_6=(Token)match(input,38,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:1290:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1291:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1291:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1292:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1313:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJRules.g:1313:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJRules.g:1314:2: iv_ruleExtends= ruleExtends EOF
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
    // InternalJRules.g:1320:1: ruleExtends returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1326:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1327:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1327:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1328:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1328:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt27=5;
            switch ( input.LA(1) ) {
                case 34:
                    {
                    alt27=1;
                    }
                    break;
                case 35:
                    {
                    alt27=2;
                    }
                    break;
                case 36:
                    {
                    alt27=3;
                    }
                    break;
                case 37:
                    {
                    alt27=4;
                    }
                    break;
            }

            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1329:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1329:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1330:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1330:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1331:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1331:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1332:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,34,FOLLOW_31); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getExtendsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_33); 

                    					newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1350:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1350:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1351:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1351:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1352:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,35,FOLLOW_33); 

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
                    // InternalJRules.g:1365:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1365:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1366:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1366:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1367:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1367:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1368:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,36,FOLLOW_31); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getExtendsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_33); 

                    					newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1386:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1386:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1387:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1387:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1388:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,37,FOLLOW_33); 

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

            otherlv_6=(Token)match(input,39,FOLLOW_23); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendsAccess().getExtendsKeyword_1());
            		
            // InternalJRules.g:1405:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1406:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1406:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1407:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1428:1: entryRuleTamanio returns [EObject current=null] : iv_ruleTamanio= ruleTamanio EOF ;
    public final EObject entryRuleTamanio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTamanio = null;


        try {
            // InternalJRules.g:1428:48: (iv_ruleTamanio= ruleTamanio EOF )
            // InternalJRules.g:1429:2: iv_ruleTamanio= ruleTamanio EOF
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
    // InternalJRules.g:1435:1: ruleTamanio returns [EObject current=null] : (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) ;
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
            // InternalJRules.g:1441:2: ( (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) )
            // InternalJRules.g:1442:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            {
            // InternalJRules.g:1442:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            // InternalJRules.g:1443:3: otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getTamanioAccess().getSizeKeyword_0());
            		
            // InternalJRules.g:1447:3: ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=41 && LA30_0<=42)) ) {
                alt30=1;
            }
            else if ( (LA30_0==43) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalJRules.g:1448:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    {
                    // InternalJRules.g:1448:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    // InternalJRules.g:1449:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1449:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==41) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==42) ) {
                        alt28=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 0, input);

                        throw nvae;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJRules.g:1450:6: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,41,FOLLOW_35); 

                            						newLeafNode(otherlv_1, grammarAccess.getTamanioAccess().getEqualsSignKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1455:6: ( (lv_no_2_0= '<>' ) )
                            {
                            // InternalJRules.g:1455:6: ( (lv_no_2_0= '<>' ) )
                            // InternalJRules.g:1456:7: (lv_no_2_0= '<>' )
                            {
                            // InternalJRules.g:1456:7: (lv_no_2_0= '<>' )
                            // InternalJRules.g:1457:8: lv_no_2_0= '<>'
                            {
                            lv_no_2_0=(Token)match(input,42,FOLLOW_35); 

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

                    // InternalJRules.g:1470:5: ( (lv_exact_3_0= ruleEInt ) )
                    // InternalJRules.g:1471:6: (lv_exact_3_0= ruleEInt )
                    {
                    // InternalJRules.g:1471:6: (lv_exact_3_0= ruleEInt )
                    // InternalJRules.g:1472:7: lv_exact_3_0= ruleEInt
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
                    // InternalJRules.g:1491:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    {
                    // InternalJRules.g:1491:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    // InternalJRules.g:1492:5: otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,43,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getTamanioAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalJRules.g:1496:5: ( (lv_min_5_0= ruleEInt ) )
                    // InternalJRules.g:1497:6: (lv_min_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1497:6: (lv_min_5_0= ruleEInt )
                    // InternalJRules.g:1498:7: lv_min_5_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTamanioAccess().getMinEIntParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_36);
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

                    otherlv_6=(Token)match(input,44,FOLLOW_37); 

                    					newLeafNode(otherlv_6, grammarAccess.getTamanioAccess().getFullStopFullStopKeyword_1_1_2());
                    				
                    // InternalJRules.g:1519:5: ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' )
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_INT||LA29_0==73) ) {
                        alt29=1;
                    }
                    else if ( (LA29_0==14) ) {
                        alt29=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 29, 0, input);

                        throw nvae;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1520:6: ( (lv_max_7_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1520:6: ( (lv_max_7_0= ruleEInt ) )
                            // InternalJRules.g:1521:7: (lv_max_7_0= ruleEInt )
                            {
                            // InternalJRules.g:1521:7: (lv_max_7_0= ruleEInt )
                            // InternalJRules.g:1522:8: lv_max_7_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTamanioAccess().getMaxEIntParserRuleCall_1_1_3_0_0());
                            							
                            pushFollow(FOLLOW_38);
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
                            // InternalJRules.g:1540:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_38); 

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
    // InternalJRules.g:1555:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:1555:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:1556:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:1562:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) ;
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
            // InternalJRules.g:1568:2: ( ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) )
            // InternalJRules.g:1569:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            {
            // InternalJRules.g:1569:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            // InternalJRules.g:1570:3: () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            {
            // InternalJRules.g:1570:3: ()
            // InternalJRules.g:1571:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParametersKeyword_1());
            		
            // InternalJRules.g:1581:3: ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )?
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==40) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            switch (alt33) {
                case 1 :
                    // InternalJRules.g:1582:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    {
                    // InternalJRules.g:1582:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    // InternalJRules.g:1583:5: otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40); 

                    					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSizeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1587:5: ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    // InternalJRules.g:1588:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1588:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) )
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==41) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==42) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 0, input);

                        throw nvae;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1589:7: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,41,FOLLOW_35); 

                            							newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1594:7: ( (lv_no_4_0= '<>' ) )
                            {
                            // InternalJRules.g:1594:7: ( (lv_no_4_0= '<>' ) )
                            // InternalJRules.g:1595:8: (lv_no_4_0= '<>' )
                            {
                            // InternalJRules.g:1595:8: (lv_no_4_0= '<>' )
                            // InternalJRules.g:1596:9: lv_no_4_0= '<>'
                            {
                            lv_no_4_0=(Token)match(input,42,FOLLOW_35); 

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

                    // InternalJRules.g:1609:6: ( (lv_exact_5_0= ruleEInt ) )
                    // InternalJRules.g:1610:7: (lv_exact_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1610:7: (lv_exact_5_0= ruleEInt )
                    // InternalJRules.g:1611:8: lv_exact_5_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getParameterAccess().getExactEIntParserRuleCall_2_0_1_1_0());
                    							
                    pushFollow(FOLLOW_41);
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
                    // InternalJRules.g:1631:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    {
                    // InternalJRules.g:1631:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    // InternalJRules.g:1632:5: otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,43,FOLLOW_35); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalJRules.g:1636:5: ( (lv_min_7_0= ruleEInt ) )
                    // InternalJRules.g:1637:6: (lv_min_7_0= ruleEInt )
                    {
                    // InternalJRules.g:1637:6: (lv_min_7_0= ruleEInt )
                    // InternalJRules.g:1638:7: lv_min_7_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getMinEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_36);
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

                    otherlv_8=(Token)match(input,44,FOLLOW_37); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getFullStopFullStopKeyword_2_1_2());
                    				
                    // InternalJRules.g:1659:5: ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==RULE_INT||LA32_0==73) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==14) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1660:6: ( (lv_max_9_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1660:6: ( (lv_max_9_0= ruleEInt ) )
                            // InternalJRules.g:1661:7: (lv_max_9_0= ruleEInt )
                            {
                            // InternalJRules.g:1661:7: (lv_max_9_0= ruleEInt )
                            // InternalJRules.g:1662:8: lv_max_9_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getParameterAccess().getMaxEIntParserRuleCall_2_1_3_0_0());
                            							
                            pushFollow(FOLLOW_38);
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
                            // InternalJRules.g:1680:6: otherlv_10= '*'
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_38); 

                            						newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getAsteriskKeyword_2_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,45,FOLLOW_41); 

                    					newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1691:3: (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==47) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalJRules.g:1692:4: otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']'
                    {
                    otherlv_12=(Token)match(input,47,FOLLOW_42); 

                    				newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getTypesKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,41,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_14=(Token)match(input,43,FOLLOW_44); 

                    				newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalJRules.g:1704:4: ( (lv_types_15_0= ruleTypeProperty ) )
                    // InternalJRules.g:1705:5: (lv_types_15_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:1705:5: (lv_types_15_0= ruleTypeProperty )
                    // InternalJRules.g:1706:6: lv_types_15_0= ruleTypeProperty
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_types_15_0=ruleTypeProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						add(
                    							current,
                    							"types",
                    							lv_types_15_0,
                    							"es.uam.sara.tfg.dsl.JRules.TypeProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:1723:4: (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==13) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalJRules.g:1724:5: otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_44); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalJRules.g:1728:5: ( (lv_types_17_0= ruleTypeProperty ) )
                    	    // InternalJRules.g:1729:6: (lv_types_17_0= ruleTypeProperty )
                    	    {
                    	    // InternalJRules.g:1729:6: (lv_types_17_0= ruleTypeProperty )
                    	    // InternalJRules.g:1730:7: lv_types_17_0= ruleTypeProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_45);
                    	    lv_types_17_0=ruleTypeProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"types",
                    	    								lv_types_17_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.TypeProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop34;
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
    // InternalJRules.g:1757:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1757:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1758:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1764:1: ruleConstructor returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:1770:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) )
            // InternalJRules.g:1771:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            {
            // InternalJRules.g:1771:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            // InternalJRules.g:1772:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor'
            {
            // InternalJRules.g:1772:3: ()
            // InternalJRules.g:1773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1779:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            else if ( (LA36_0==27) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalJRules.g:1780:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_46); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1785:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1790:3: ( (lv_no_3_0= 'not' ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==28) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalJRules.g:1791:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1791:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1792:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,28,FOLLOW_47); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getConstructorAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstructorRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,48,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getConstructorAccess().getConstructorKeyword_3());
            		

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
    // InternalJRules.g:1812:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1812:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1813:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1819:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1825:2: ( (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:1826:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:1826:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            // InternalJRules.g:1827:3: otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1835:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
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
                    // InternalJRules.g:1836:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1841:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:1841:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:1842:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:1842:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:1843:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,42,FOLLOW_44); 

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

            // InternalJRules.g:1856:3: ( (lv_type_4_0= ruleTypeProperty ) )
            // InternalJRules.g:1857:4: (lv_type_4_0= ruleTypeProperty )
            {
            // InternalJRules.g:1857:4: (lv_type_4_0= ruleTypeProperty )
            // InternalJRules.g:1858:5: lv_type_4_0= ruleTypeProperty
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getTypeTypePropertyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleTypeProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"es.uam.sara.tfg.dsl.JRules.TypeProperty");
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
    // InternalJRules.g:1879:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1879:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1880:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1886:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1892:2: ( (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:1893:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:1893:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            // InternalJRules.g:1894:3: otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1898:3: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            else if ( (LA39_0==42) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalJRules.g:1899:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1904:4: ( (lv_no_2_0= '<>' ) )
                    {
                    // InternalJRules.g:1904:4: ( (lv_no_2_0= '<>' ) )
                    // InternalJRules.g:1905:5: (lv_no_2_0= '<>' )
                    {
                    // InternalJRules.g:1905:5: (lv_no_2_0= '<>' )
                    // InternalJRules.g:1906:6: lv_no_2_0= '<>'
                    {
                    lv_no_2_0=(Token)match(input,42,FOLLOW_44); 

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

            // InternalJRules.g:1919:3: ( (lv_type_3_0= ruleTypeProperty ) )
            // InternalJRules.g:1920:4: (lv_type_3_0= ruleTypeProperty )
            {
            // InternalJRules.g:1920:4: (lv_type_3_0= ruleTypeProperty )
            // InternalJRules.g:1921:5: lv_type_3_0= ruleTypeProperty
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeTypePropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_3_0=ruleTypeProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"es.uam.sara.tfg.dsl.JRules.TypeProperty");
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
    // InternalJRules.g:1942:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1942:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1943:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:1949:1: ruleInitialize returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:1955:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) )
            // InternalJRules.g:1956:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            {
            // InternalJRules.g:1956:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            // InternalJRules.g:1957:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize'
            {
            // InternalJRules.g:1957:3: ()
            // InternalJRules.g:1958:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1964:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            else if ( (LA40_0==27) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalJRules.g:1965:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_49); 

                    				newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1970:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1975:3: ( (lv_no_3_0= 'not' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==28) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRules.g:1976:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1976:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1977:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,28,FOLLOW_50); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getInitializeAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitializeRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,51,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInitializeAccess().getInitializeKeyword_3());
            		

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
    // InternalJRules.g:1997:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:1997:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:1998:2: iv_ruleEmpty= ruleEmpty EOF
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
    // InternalJRules.g:2004:1: ruleEmpty returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2010:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) )
            // InternalJRules.g:2011:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            {
            // InternalJRules.g:2011:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            // InternalJRules.g:2012:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty'
            {
            // InternalJRules.g:2012:3: ()
            // InternalJRules.g:2013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2019:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==26) ) {
                alt42=1;
            }
            else if ( (LA42_0==27) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalJRules.g:2020:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_51); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2025:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmptyAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2030:3: ( (lv_no_3_0= 'not' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==28) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2031:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2031:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2032:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,28,FOLLOW_52); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getEmptyAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEmptyRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEmptyAccess().getEmptyKeyword_3());
            		

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
    // InternalJRules.g:2052:1: entryRuleIsGeneric returns [EObject current=null] : iv_ruleIsGeneric= ruleIsGeneric EOF ;
    public final EObject entryRuleIsGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGeneric = null;


        try {
            // InternalJRules.g:2052:50: (iv_ruleIsGeneric= ruleIsGeneric EOF )
            // InternalJRules.g:2053:2: iv_ruleIsGeneric= ruleIsGeneric EOF
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
    // InternalJRules.g:2059:1: ruleIsGeneric returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) ;
    public final EObject ruleIsGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2065:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) )
            // InternalJRules.g:2066:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            {
            // InternalJRules.g:2066:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            // InternalJRules.g:2067:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic'
            {
            // InternalJRules.g:2067:3: ()
            // InternalJRules.g:2068:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGenericAccess().getIsGenericAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2074:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            else if ( (LA44_0==27) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2075:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,26,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsGenericAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2080:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_53); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsGenericAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2085:3: ( (lv_no_3_0= 'not' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==28) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2086:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2086:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2087:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,28,FOLLOW_54); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getIsGenericAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsGenericRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getIsGenericAccess().getGenericKeyword_3());
            		

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
    // InternalJRules.g:2107:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:2107:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:2108:2: iv_ruleNameOperation= ruleNameOperation EOF
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
    // InternalJRules.g:2114:1: ruleNameOperation returns [EObject current=null] : (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleNameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_no_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_no_5_0=null;
        Token otherlv_7=null;
        Enumerator lv_operator_3_0 = null;

        EObject lv_name_6_0 = null;

        Enumerator lv_Language_8_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2120:2: ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:2121:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:2121:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            // InternalJRules.g:2122:3: otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_55); 

            			newLeafNode(otherlv_0, grammarAccess.getNameOperationAccess().getNameKeyword_0());
            		
            // InternalJRules.g:2126:3: ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36||(LA48_0>=95 && LA48_0<=98)) ) {
                alt48=1;
            }
            else if ( ((LA48_0>=41 && LA48_0<=42)) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalJRules.g:2127:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    {
                    // InternalJRules.g:2127:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    // InternalJRules.g:2128:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) )
                    {
                    // InternalJRules.g:2128:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==36) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // InternalJRules.g:2129:6: ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2129:6: ( (lv_no_1_0= 'does' ) )
                            // InternalJRules.g:2130:7: (lv_no_1_0= 'does' )
                            {
                            // InternalJRules.g:2130:7: (lv_no_1_0= 'does' )
                            // InternalJRules.g:2131:8: lv_no_1_0= 'does'
                            {
                            lv_no_1_0=(Token)match(input,36,FOLLOW_31); 

                            								newLeafNode(lv_no_1_0, grammarAccess.getNameOperationAccess().getNoDoesKeyword_1_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNameOperationRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "does");
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,28,FOLLOW_56); 

                            						newLeafNode(otherlv_2, grammarAccess.getNameOperationAccess().getNotKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalJRules.g:2148:5: ( (lv_operator_3_0= ruleNameOperator ) )
                    // InternalJRules.g:2149:6: (lv_operator_3_0= ruleNameOperator )
                    {
                    // InternalJRules.g:2149:6: (lv_operator_3_0= ruleNameOperator )
                    // InternalJRules.g:2150:7: lv_operator_3_0= ruleNameOperator
                    {

                    							newCompositeNode(grammarAccess.getNameOperationAccess().getOperatorNameOperatorEnumRuleCall_1_0_1_0());
                    						
                    pushFollow(FOLLOW_6);
                    lv_operator_3_0=ruleNameOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameOperationRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_3_0,
                    								"es.uam.sara.tfg.dsl.JRules.NameOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2169:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    {
                    // InternalJRules.g:2169:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==41) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==42) ) {
                        alt47=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalJRules.g:2170:5: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,41,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getEqualsSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2175:5: ( (lv_no_5_0= '<>' ) )
                            {
                            // InternalJRules.g:2175:5: ( (lv_no_5_0= '<>' ) )
                            // InternalJRules.g:2176:6: (lv_no_5_0= '<>' )
                            {
                            // InternalJRules.g:2176:6: (lv_no_5_0= '<>' )
                            // InternalJRules.g:2177:7: lv_no_5_0= '<>'
                            {
                            lv_no_5_0=(Token)match(input,42,FOLLOW_6); 

                            							newLeafNode(lv_no_5_0, grammarAccess.getNameOperationAccess().getNoLessThanSignGreaterThanSignKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getNameOperationRule());
                            							}
                            							setWithLastConsumed(current, "no", true, "<>");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalJRules.g:2191:3: ( (lv_name_6_0= ruleStringProperty ) )
            // InternalJRules.g:2192:4: (lv_name_6_0= ruleStringProperty )
            {
            // InternalJRules.g:2192:4: (lv_name_6_0= ruleStringProperty )
            // InternalJRules.g:2193:5: lv_name_6_0= ruleStringProperty
            {

            					newCompositeNode(grammarAccess.getNameOperationAccess().getNameStringPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_57);
            lv_name_6_0=ruleStringProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"es.uam.sara.tfg.dsl.JRules.StringProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:2210:3: (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==13) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJRules.g:2211:4: otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_58); 

                    				newLeafNode(otherlv_7, grammarAccess.getNameOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalJRules.g:2215:4: ( (lv_Language_8_0= ruleLanguage ) )
                    // InternalJRules.g:2216:5: (lv_Language_8_0= ruleLanguage )
                    {
                    // InternalJRules.g:2216:5: (lv_Language_8_0= ruleLanguage )
                    // InternalJRules.g:2217:6: lv_Language_8_0= ruleLanguage
                    {

                    						newCompositeNode(grammarAccess.getNameOperationAccess().getLanguageLanguageEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Language_8_0=ruleLanguage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameOperationRule());
                    						}
                    						set(
                    							current,
                    							"Language",
                    							lv_Language_8_0,
                    							"es.uam.sara.tfg.dsl.JRules.Language");
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
    // $ANTLR end "ruleNameOperation"


    // $ANTLR start "entryRuleNameType"
    // InternalJRules.g:2239:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:2239:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:2240:2: iv_ruleNameType= ruleNameType EOF
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
    // InternalJRules.g:2246:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2252:2: ( (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:2253:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:2253:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            // InternalJRules.g:2254:3: otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,54,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:2262:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            else if ( (LA50_0==42) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalJRules.g:2263:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_59); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameTypeAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2268:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:2268:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:2269:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:2269:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:2270:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,42,FOLLOW_59); 

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

            // InternalJRules.g:2283:3: ( (lv_type_4_0= ruleNameCheck ) )
            // InternalJRules.g:2284:4: (lv_type_4_0= ruleNameCheck )
            {
            // InternalJRules.g:2284:4: (lv_type_4_0= ruleNameCheck )
            // InternalJRules.g:2285:5: lv_type_4_0= ruleNameCheck
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
    // InternalJRules.g:2306:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:2306:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:2307:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:2313:1: ruleJavaDoc returns [EObject current=null] : ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) ;
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
            // InternalJRules.g:2319:2: ( ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) )
            // InternalJRules.g:2320:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            {
            // InternalJRules.g:2320:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            // InternalJRules.g:2321:3: () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )?
            {
            // InternalJRules.g:2321:3: ()
            // InternalJRules.g:2322:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2328:3: ( (lv_no_1_0= 'no' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJRules.g:2329:4: (lv_no_1_0= 'no' )
                    {
                    // InternalJRules.g:2329:4: (lv_no_1_0= 'no' )
                    // InternalJRules.g:2330:5: lv_no_1_0= 'no'
                    {
                    lv_no_1_0=(Token)match(input,20,FOLLOW_60); 

                    					newLeafNode(lv_no_1_0, grammarAccess.getJavaDocAccess().getNoNoKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,55,FOLLOW_61); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaDocAccess().getJavaDocKeyword_2());
            		
            // InternalJRules.g:2346:3: ( (lv_author_3_0= '@author' ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==56) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalJRules.g:2347:4: (lv_author_3_0= '@author' )
                    {
                    // InternalJRules.g:2347:4: (lv_author_3_0= '@author' )
                    // InternalJRules.g:2348:5: lv_author_3_0= '@author'
                    {
                    lv_author_3_0=(Token)match(input,56,FOLLOW_62); 

                    					newLeafNode(lv_author_3_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2360:3: ( (lv_parameter_4_0= '@parameter' ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==57) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJRules.g:2361:4: (lv_parameter_4_0= '@parameter' )
                    {
                    // InternalJRules.g:2361:4: (lv_parameter_4_0= '@parameter' )
                    // InternalJRules.g:2362:5: lv_parameter_4_0= '@parameter'
                    {
                    lv_parameter_4_0=(Token)match(input,57,FOLLOW_63); 

                    					newLeafNode(lv_parameter_4_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2374:3: ( (lv_return_5_0= '@return' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalJRules.g:2375:4: (lv_return_5_0= '@return' )
                    {
                    // InternalJRules.g:2375:4: (lv_return_5_0= '@return' )
                    // InternalJRules.g:2376:5: lv_return_5_0= '@return'
                    {
                    lv_return_5_0=(Token)match(input,58,FOLLOW_64); 

                    					newLeafNode(lv_return_5_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2388:3: ( (lv_version_6_0= '@version' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==59) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJRules.g:2389:4: (lv_version_6_0= '@version' )
                    {
                    // InternalJRules.g:2389:4: (lv_version_6_0= '@version' )
                    // InternalJRules.g:2390:5: lv_version_6_0= '@version'
                    {
                    lv_version_6_0=(Token)match(input,59,FOLLOW_65); 

                    					newLeafNode(lv_version_6_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2402:3: ( (lv_throws_7_0= '@throws' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==60) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJRules.g:2403:4: (lv_throws_7_0= '@throws' )
                    {
                    // InternalJRules.g:2403:4: (lv_throws_7_0= '@throws' )
                    // InternalJRules.g:2404:5: lv_throws_7_0= '@throws'
                    {
                    lv_throws_7_0=(Token)match(input,60,FOLLOW_66); 

                    					newLeafNode(lv_throws_7_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2416:3: ( (lv_see_8_0= '@see' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==61) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJRules.g:2417:4: (lv_see_8_0= '@see' )
                    {
                    // InternalJRules.g:2417:4: (lv_see_8_0= '@see' )
                    // InternalJRules.g:2418:5: lv_see_8_0= '@see'
                    {
                    lv_see_8_0=(Token)match(input,61,FOLLOW_2); 

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
    // InternalJRules.g:2434:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:2434:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:2435:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:2441:1: ruleContains returns [EObject current=null] : ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) ;
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
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_rule_10_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2447:2: ( ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) )
            // InternalJRules.g:2448:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            {
            // InternalJRules.g:2448:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            // InternalJRules.g:2449:3: () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}'
            {
            // InternalJRules.g:2449:3: ()
            // InternalJRules.g:2450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainsAccess().getContainsAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2456:3: ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=34 && LA59_0<=37)||LA59_0==62) ) {
                alt59=1;
            }
            else if ( (LA59_0==63) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalJRules.g:2457:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    {
                    // InternalJRules.g:2457:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    // InternalJRules.g:2458:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have'
                    {
                    // InternalJRules.g:2458:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )?
                    int alt58=5;
                    switch ( input.LA(1) ) {
                        case 34:
                            {
                            alt58=1;
                            }
                            break;
                        case 35:
                            {
                            alt58=2;
                            }
                            break;
                        case 36:
                            {
                            alt58=3;
                            }
                            break;
                        case 37:
                            {
                            alt58=4;
                            }
                            break;
                    }

                    switch (alt58) {
                        case 1 :
                            // InternalJRules.g:2459:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            {
                            // InternalJRules.g:2459:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            // InternalJRules.g:2460:7: ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2460:7: ( (lv_no_1_0= 'do' ) )
                            // InternalJRules.g:2461:8: (lv_no_1_0= 'do' )
                            {
                            // InternalJRules.g:2461:8: (lv_no_1_0= 'do' )
                            // InternalJRules.g:2462:9: lv_no_1_0= 'do'
                            {
                            lv_no_1_0=(Token)match(input,34,FOLLOW_31); 

                            									newLeafNode(lv_no_1_0, grammarAccess.getContainsAccess().getNoDoKeyword_1_0_0_0_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "do");
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,28,FOLLOW_67); 

                            							newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2480:6: ( (lv_no_3_0= 'don\\'t' ) )
                            {
                            // InternalJRules.g:2480:6: ( (lv_no_3_0= 'don\\'t' ) )
                            // InternalJRules.g:2481:7: (lv_no_3_0= 'don\\'t' )
                            {
                            // InternalJRules.g:2481:7: (lv_no_3_0= 'don\\'t' )
                            // InternalJRules.g:2482:8: lv_no_3_0= 'don\\'t'
                            {
                            lv_no_3_0=(Token)match(input,35,FOLLOW_67); 

                            								newLeafNode(lv_no_3_0, grammarAccess.getContainsAccess().getNoDonTKeyword_1_0_0_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getContainsRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "don\'t");
                            							

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalJRules.g:2495:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            {
                            // InternalJRules.g:2495:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            // InternalJRules.g:2496:7: ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not'
                            {
                            // InternalJRules.g:2496:7: ( (lv_no_4_0= 'does' ) )
                            // InternalJRules.g:2497:8: (lv_no_4_0= 'does' )
                            {
                            // InternalJRules.g:2497:8: (lv_no_4_0= 'does' )
                            // InternalJRules.g:2498:9: lv_no_4_0= 'does'
                            {
                            lv_no_4_0=(Token)match(input,36,FOLLOW_31); 

                            									newLeafNode(lv_no_4_0, grammarAccess.getContainsAccess().getNoDoesKeyword_1_0_0_2_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "does");
                            								

                            }


                            }

                            otherlv_5=(Token)match(input,28,FOLLOW_67); 

                            							newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalJRules.g:2516:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            {
                            // InternalJRules.g:2516:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            // InternalJRules.g:2517:7: (lv_no_6_0= 'doesn\\'t' )
                            {
                            // InternalJRules.g:2517:7: (lv_no_6_0= 'doesn\\'t' )
                            // InternalJRules.g:2518:8: lv_no_6_0= 'doesn\\'t'
                            {
                            lv_no_6_0=(Token)match(input,37,FOLLOW_67); 

                            								newLeafNode(lv_no_6_0, grammarAccess.getContainsAccess().getNoDoesnTKeyword_1_0_0_3_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getContainsRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "doesn\'t");
                            							

                            }


                            }


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,62,FOLLOW_68); 

                    					newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getHaveKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2537:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    {
                    // InternalJRules.g:2537:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    // InternalJRules.g:2538:5: (lv_no_8_0= 'haven\\'t' )
                    {
                    // InternalJRules.g:2538:5: (lv_no_8_0= 'haven\\'t' )
                    // InternalJRules.g:2539:6: lv_no_8_0= 'haven\\'t'
                    {
                    lv_no_8_0=(Token)match(input,63,FOLLOW_68); 

                    						newLeafNode(lv_no_8_0, grammarAccess.getContainsAccess().getNoHavenTKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContainsRule());
                    						}
                    						setWithLastConsumed(current, "no", true, "haven\'t");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJRules.g:2556:3: ( (lv_rule_10_0= ruleRule ) )
            // InternalJRules.g:2557:4: (lv_rule_10_0= ruleRule )
            {
            // InternalJRules.g:2557:4: (lv_rule_10_0= ruleRule )
            // InternalJRules.g:2558:5: lv_rule_10_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_69);
            lv_rule_10_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"rule",
            						lv_rule_10_0,
            						"es.uam.sara.tfg.dsl.JRules.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,65,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getContainsAccess().getRightCurlyBracketKeyword_4());
            		

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
    // InternalJRules.g:2583:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:2583:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:2584:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:2590:1: ruleModifiers returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) ;
    public final EObject ruleModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_blend_6_0 = null;

        EObject lv_blend_8_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2596:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) )
            // InternalJRules.g:2597:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            {
            // InternalJRules.g:2597:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            // InternalJRules.g:2598:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']'
            {
            // InternalJRules.g:2598:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==26) ) {
                alt60=1;
            }
            else if ( (LA60_0==27) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalJRules.g:2599:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_70); 

                    				newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2604:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_70); 

                    				newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2609:3: ( (lv_no_2_0= 'not' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==28) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJRules.g:2610:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:2610:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:2611:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,28,FOLLOW_71); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getModifiersAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModifiersRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,66,FOLLOW_72); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiersAccess().getModifiedKeyword_2());
            		
            otherlv_4=(Token)match(input,67,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getWithKeyword_3());
            		
            otherlv_5=(Token)match(input,43,FOLLOW_73); 

            			newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalJRules.g:2635:3: ( (lv_blend_6_0= ruleBlendModifiers ) )
            // InternalJRules.g:2636:4: (lv_blend_6_0= ruleBlendModifiers )
            {
            // InternalJRules.g:2636:4: (lv_blend_6_0= ruleBlendModifiers )
            // InternalJRules.g:2637:5: lv_blend_6_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_74);
            lv_blend_6_0=ruleBlendModifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiersRule());
            					}
            					add(
            						current,
            						"blend",
            						lv_blend_6_0,
            						"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:2654:3: (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==22) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalJRules.g:2655:4: otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    {
            	    otherlv_7=(Token)match(input,22,FOLLOW_73); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModifiersAccess().getOrKeyword_6_0());
            	    			
            	    // InternalJRules.g:2659:4: ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:2660:5: (lv_blend_8_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:2660:5: (lv_blend_8_0= ruleBlendModifiers )
            	    // InternalJRules.g:2661:6: lv_blend_8_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_74);
            	    lv_blend_8_0=ruleBlendModifiers();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModifiersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"blend",
            	    							lv_blend_8_0,
            	    							"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_9=(Token)match(input,45,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModifiersAccess().getRightSquareBracketKeyword_7());
            		

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
    // InternalJRules.g:2687:1: entryRuleRangoNames returns [EObject current=null] : iv_ruleRangoNames= ruleRangoNames EOF ;
    public final EObject entryRuleRangoNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangoNames = null;


        try {
            // InternalJRules.g:2687:51: (iv_ruleRangoNames= ruleRangoNames EOF )
            // InternalJRules.g:2688:2: iv_ruleRangoNames= ruleRangoNames EOF
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
    // InternalJRules.g:2694:1: ruleRangoNames returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) ;
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
            // InternalJRules.g:2700:2: ( ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) )
            // InternalJRules.g:2701:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            {
            // InternalJRules.g:2701:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            // InternalJRules.g:2702:3: () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            {
            // InternalJRules.g:2702:3: ()
            // InternalJRules.g:2703:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangoNamesAccess().getRangoNamesAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2709:3: (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==43) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalJRules.g:2710:4: otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,43,FOLLOW_35); 

                    				newLeafNode(otherlv_1, grammarAccess.getRangoNamesAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalJRules.g:2714:4: ( (lv_min_2_0= ruleEInt ) )
                    // InternalJRules.g:2715:5: (lv_min_2_0= ruleEInt )
                    {
                    // InternalJRules.g:2715:5: (lv_min_2_0= ruleEInt )
                    // InternalJRules.g:2716:6: lv_min_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getMinEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_36);
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

                    otherlv_3=(Token)match(input,44,FOLLOW_37); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangoNamesAccess().getFullStopFullStopKeyword_1_2());
                    			
                    // InternalJRules.g:2737:4: ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' )
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==RULE_INT||LA63_0==73) ) {
                        alt63=1;
                    }
                    else if ( (LA63_0==14) ) {
                        alt63=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 63, 0, input);

                        throw nvae;
                    }
                    switch (alt63) {
                        case 1 :
                            // InternalJRules.g:2738:5: ( (lv_max_4_0= ruleEInt ) )
                            {
                            // InternalJRules.g:2738:5: ( (lv_max_4_0= ruleEInt ) )
                            // InternalJRules.g:2739:6: (lv_max_4_0= ruleEInt )
                            {
                            // InternalJRules.g:2739:6: (lv_max_4_0= ruleEInt )
                            // InternalJRules.g:2740:7: lv_max_4_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getRangoNamesAccess().getMaxEIntParserRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_38);
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
                            // InternalJRules.g:2758:5: otherlv_5= '*'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_38); 

                            					newLeafNode(otherlv_5, grammarAccess.getRangoNamesAccess().getAsteriskKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,45,FOLLOW_41); 

                    				newLeafNode(otherlv_6, grammarAccess.getRangoNamesAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2768:3: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==47) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalJRules.g:2769:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,47,FOLLOW_68); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangoNamesAccess().getTypesKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,64,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRangoNamesAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalJRules.g:2777:4: ( (lv_types_9_0= ruleStringProperty ) )
                    // InternalJRules.g:2778:5: (lv_types_9_0= ruleStringProperty )
                    {
                    // InternalJRules.g:2778:5: (lv_types_9_0= ruleStringProperty )
                    // InternalJRules.g:2779:6: lv_types_9_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_75);
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

                    // InternalJRules.g:2796:4: (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==13) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalJRules.g:2797:5: otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRangoNamesAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalJRules.g:2801:5: ( (lv_types_11_0= ruleStringProperty ) )
                    	    // InternalJRules.g:2802:6: (lv_types_11_0= ruleStringProperty )
                    	    {
                    	    // InternalJRules.g:2802:6: (lv_types_11_0= ruleStringProperty )
                    	    // InternalJRules.g:2803:7: lv_types_11_0= ruleStringProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_75);
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
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,65,FOLLOW_2); 

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
    // InternalJRules.g:2830:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalJRules.g:2830:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalJRules.g:2831:2: iv_ruleStringProperty= ruleStringProperty EOF
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
    // InternalJRules.g:2837:1: ruleStringProperty returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_StringVariable_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:2843:2: ( (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) )
            // InternalJRules.g:2844:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            {
            // InternalJRules.g:2844:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_STRING) ) {
                int LA67_1 = input.LA(2);

                if ( (LA67_1==68) ) {
                    alt67=2;
                }
                else if ( (LA67_1==EOF||LA67_1==13||LA67_1==15||LA67_1==19||(LA67_1>=22 && LA67_1<=23)||LA67_1==25||LA67_1==45||LA67_1==65) ) {
                    alt67=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA67_0==RULE_ID) ) {
                int LA67_2 = input.LA(2);

                if ( (LA67_2==EOF||LA67_2==13||LA67_2==15||LA67_2==19||(LA67_2>=22 && LA67_2<=23)||LA67_2==25||LA67_2==45||LA67_2==65) ) {
                    alt67=1;
                }
                else if ( (LA67_2==68) ) {
                    alt67=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 67, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalJRules.g:2845:3: this_StringValue_0= ruleStringValue
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
                    // InternalJRules.g:2854:3: this_StringVariable_1= ruleStringVariable
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
    // InternalJRules.g:2866:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJRules.g:2866:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJRules.g:2867:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJRules.g:2873:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2879:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalJRules.g:2880:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalJRules.g:2880:2: ( (lv_value_0_0= ruleEString ) )
            // InternalJRules.g:2881:3: (lv_value_0_0= ruleEString )
            {
            // InternalJRules.g:2881:3: (lv_value_0_0= ruleEString )
            // InternalJRules.g:2882:4: lv_value_0_0= ruleEString
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
    // InternalJRules.g:2902:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalJRules.g:2902:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalJRules.g:2903:2: iv_ruleStringVariable= ruleStringVariable EOF
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
    // InternalJRules.g:2909:1: ruleStringVariable returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_subtype_2_0 = null;

        Enumerator lv_strings_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2915:2: ( ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) ) )
            // InternalJRules.g:2916:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) )
            {
            // InternalJRules.g:2916:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) ) )
            // InternalJRules.g:2917:3: ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? otherlv_3= '.' ( (lv_strings_4_0= ruleElementString ) )
            {
            // InternalJRules.g:2917:3: ( ( ruleEString ) )
            // InternalJRules.g:2918:4: ( ruleEString )
            {
            // InternalJRules.g:2918:4: ( ruleEString )
            // InternalJRules.g:2919:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringVariableRule());
            					}
            				

            					newCompositeNode(grammarAccess.getStringVariableAccess().getVariableVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_76);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:2933:3: (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==68) ) {
                int LA68_1 = input.LA(2);

                if ( ((LA68_1>=79 && LA68_1<=85)) ) {
                    alt68=1;
                }
            }
            switch (alt68) {
                case 1 :
                    // InternalJRules.g:2934:4: otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) )
                    {
                    otherlv_1=(Token)match(input,68,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJRules.g:2938:4: ( (lv_subtype_2_0= ruleElement ) )
                    // InternalJRules.g:2939:5: (lv_subtype_2_0= ruleElement )
                    {
                    // InternalJRules.g:2939:5: (lv_subtype_2_0= ruleElement )
                    // InternalJRules.g:2940:6: lv_subtype_2_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getStringVariableAccess().getSubtypeElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_76);
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

            otherlv_3=(Token)match(input,68,FOLLOW_77); 

            			newLeafNode(otherlv_3, grammarAccess.getStringVariableAccess().getFullStopKeyword_2());
            		
            // InternalJRules.g:2962:3: ( (lv_strings_4_0= ruleElementString ) )
            // InternalJRules.g:2963:4: (lv_strings_4_0= ruleElementString )
            {
            // InternalJRules.g:2963:4: (lv_strings_4_0= ruleElementString )
            // InternalJRules.g:2964:5: lv_strings_4_0= ruleElementString
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


    // $ANTLR start "entryRuleTypeProperty"
    // InternalJRules.g:2985:1: entryRuleTypeProperty returns [EObject current=null] : iv_ruleTypeProperty= ruleTypeProperty EOF ;
    public final EObject entryRuleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeProperty = null;


        try {
            // InternalJRules.g:2985:53: (iv_ruleTypeProperty= ruleTypeProperty EOF )
            // InternalJRules.g:2986:2: iv_ruleTypeProperty= ruleTypeProperty EOF
            {
             newCompositeNode(grammarAccess.getTypePropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeProperty=ruleTypeProperty();

            state._fsp--;

             current =iv_ruleTypeProperty; 
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
    // $ANTLR end "entryRuleTypeProperty"


    // $ANTLR start "ruleTypeProperty"
    // InternalJRules.g:2992:1: ruleTypeProperty returns [EObject current=null] : (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) ;
    public final EObject ruleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject this_TypeString_0 = null;

        EObject this_isPrimitiveFunction_1 = null;

        EObject this_IsCollectionType_2 = null;



        	enterRule();

        try {
            // InternalJRules.g:2998:2: ( (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) )
            // InternalJRules.g:2999:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            {
            // InternalJRules.g:2999:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            int alt69=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 69:
                {
                alt69=1;
                }
                break;
            case 70:
                {
                alt69=2;
                }
                break;
            case 72:
                {
                alt69=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // InternalJRules.g:3000:3: this_TypeString_0= ruleTypeString
                    {

                    			newCompositeNode(grammarAccess.getTypePropertyAccess().getTypeStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TypeString_0=ruleTypeString();

                    state._fsp--;


                    			current = this_TypeString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3009:3: this_isPrimitiveFunction_1= ruleisPrimitiveFunction
                    {

                    			newCompositeNode(grammarAccess.getTypePropertyAccess().getIsPrimitiveFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_isPrimitiveFunction_1=ruleisPrimitiveFunction();

                    state._fsp--;


                    			current = this_isPrimitiveFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJRules.g:3018:3: this_IsCollectionType_2= ruleIsCollectionType
                    {

                    			newCompositeNode(grammarAccess.getTypePropertyAccess().getIsCollectionTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsCollectionType_2=ruleIsCollectionType();

                    state._fsp--;


                    			current = this_IsCollectionType_2;
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
    // $ANTLR end "ruleTypeProperty"


    // $ANTLR start "entryRuleTypeString"
    // InternalJRules.g:3030:1: entryRuleTypeString returns [EObject current=null] : iv_ruleTypeString= ruleTypeString EOF ;
    public final EObject entryRuleTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeString = null;


        try {
            // InternalJRules.g:3030:51: (iv_ruleTypeString= ruleTypeString EOF )
            // InternalJRules.g:3031:2: iv_ruleTypeString= ruleTypeString EOF
            {
             newCompositeNode(grammarAccess.getTypeStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeString=ruleTypeString();

            state._fsp--;

             current =iv_ruleTypeString; 
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
    // $ANTLR end "entryRuleTypeString"


    // $ANTLR start "ruleTypeString"
    // InternalJRules.g:3037:1: ruleTypeString returns [EObject current=null] : ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) ;
    public final EObject ruleTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_typePrimitive_1_0 = null;

        EObject lv_typeStrng_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3043:2: ( ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) )
            // InternalJRules.g:3044:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            {
            // InternalJRules.g:3044:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==69) ) {
                alt70=1;
            }
            else if ( ((LA70_0>=RULE_STRING && LA70_0<=RULE_ID)) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalJRules.g:3045:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    {
                    // InternalJRules.g:3045:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    // InternalJRules.g:3046:4: otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    {
                    otherlv_0=(Token)match(input,69,FOLLOW_78); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeStringAccess().getPrimitiveKeyword_0_0());
                    			
                    // InternalJRules.g:3050:4: ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    // InternalJRules.g:3051:5: (lv_typePrimitive_1_0= rulePrimitive )
                    {
                    // InternalJRules.g:3051:5: (lv_typePrimitive_1_0= rulePrimitive )
                    // InternalJRules.g:3052:6: lv_typePrimitive_1_0= rulePrimitive
                    {

                    						newCompositeNode(grammarAccess.getTypeStringAccess().getTypePrimitivePrimitiveEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_typePrimitive_1_0=rulePrimitive();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeStringRule());
                    						}
                    						set(
                    							current,
                    							"typePrimitive",
                    							lv_typePrimitive_1_0,
                    							"es.uam.sara.tfg.dsl.JRules.Primitive");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3071:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    {
                    // InternalJRules.g:3071:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    // InternalJRules.g:3072:4: (lv_typeStrng_2_0= ruleStringProperty )
                    {
                    // InternalJRules.g:3072:4: (lv_typeStrng_2_0= ruleStringProperty )
                    // InternalJRules.g:3073:5: lv_typeStrng_2_0= ruleStringProperty
                    {

                    					newCompositeNode(grammarAccess.getTypeStringAccess().getTypeStrngStringPropertyParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_typeStrng_2_0=ruleStringProperty();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTypeStringRule());
                    					}
                    					set(
                    						current,
                    						"typeStrng",
                    						lv_typeStrng_2_0,
                    						"es.uam.sara.tfg.dsl.JRules.StringProperty");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleTypeString"


    // $ANTLR start "entryRuleisPrimitiveFunction"
    // InternalJRules.g:3094:1: entryRuleisPrimitiveFunction returns [EObject current=null] : iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF ;
    public final EObject entryRuleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisPrimitiveFunction = null;


        try {
            // InternalJRules.g:3094:60: (iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF )
            // InternalJRules.g:3095:2: iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF
            {
             newCompositeNode(grammarAccess.getIsPrimitiveFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleisPrimitiveFunction=ruleisPrimitiveFunction();

            state._fsp--;

             current =iv_ruleisPrimitiveFunction; 
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
    // $ANTLR end "entryRuleisPrimitiveFunction"


    // $ANTLR start "ruleisPrimitiveFunction"
    // InternalJRules.g:3101:1: ruleisPrimitiveFunction returns [EObject current=null] : ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) ;
    public final EObject ruleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:3107:2: ( ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) )
            // InternalJRules.g:3108:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            {
            // InternalJRules.g:3108:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            // InternalJRules.g:3109:3: () otherlv_1= 'isPrimitive' otherlv_2= '()'
            {
            // InternalJRules.g:3109:3: ()
            // InternalJRules.g:3110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsPrimitiveFunctionAccess().getIsPrimitiveFuntionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getIsPrimitiveFunctionAccess().getIsPrimitiveKeyword_1());
            		
            otherlv_2=(Token)match(input,71,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsPrimitiveFunctionAccess().getLeftParenthesisRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleisPrimitiveFunction"


    // $ANTLR start "entryRuleIsCollectionType"
    // InternalJRules.g:3128:1: entryRuleIsCollectionType returns [EObject current=null] : iv_ruleIsCollectionType= ruleIsCollectionType EOF ;
    public final EObject entryRuleIsCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsCollectionType = null;


        try {
            // InternalJRules.g:3128:57: (iv_ruleIsCollectionType= ruleIsCollectionType EOF )
            // InternalJRules.g:3129:2: iv_ruleIsCollectionType= ruleIsCollectionType EOF
            {
             newCompositeNode(grammarAccess.getIsCollectionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsCollectionType=ruleIsCollectionType();

            state._fsp--;

             current =iv_ruleIsCollectionType; 
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
    // $ANTLR end "entryRuleIsCollectionType"


    // $ANTLR start "ruleIsCollectionType"
    // InternalJRules.g:3135:1: ruleIsCollectionType returns [EObject current=null] : ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) ;
    public final EObject ruleIsCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_of_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3141:2: ( ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) )
            // InternalJRules.g:3142:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            {
            // InternalJRules.g:3142:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            // InternalJRules.g:3143:3: () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            {
            // InternalJRules.g:3143:3: ()
            // InternalJRules.g:3144:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsCollectionTypeAccess().getIsCollectionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,72,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getIsCollectionTypeAccess().getIsCollectionKeyword_1());
            		
            // InternalJRules.g:3154:3: (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==71) ) {
                alt71=1;
            }
            else if ( (LA71_0==24) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalJRules.g:3155:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,71,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisRightParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3160:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    {
                    // InternalJRules.g:3160:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    // InternalJRules.g:3161:5: otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_44); 

                    					newLeafNode(otherlv_3, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalJRules.g:3165:5: ( (lv_of_4_0= ruleTypeProperty ) )
                    // InternalJRules.g:3166:6: (lv_of_4_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:3166:6: (lv_of_4_0= ruleTypeProperty )
                    // InternalJRules.g:3167:7: lv_of_4_0= ruleTypeProperty
                    {

                    							newCompositeNode(grammarAccess.getIsCollectionTypeAccess().getOfTypePropertyParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_20);
                    lv_of_4_0=ruleTypeProperty();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIsCollectionTypeRule());
                    							}
                    							set(
                    								current,
                    								"of",
                    								lv_of_4_0,
                    								"es.uam.sara.tfg.dsl.JRules.TypeProperty");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(otherlv_5, grammarAccess.getIsCollectionTypeAccess().getRightParenthesisKeyword_2_1_2());
                    				

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
    // $ANTLR end "ruleIsCollectionType"


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:3194:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:3194:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:3195:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:3201:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3207:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:3208:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:3208:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:3209:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:3209:3: (kw= '-' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==73) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJRules.g:3210:4: kw= '-'
                    {
                    kw=(Token)match(input,73,FOLLOW_81); 

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
    // InternalJRules.g:3227:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:3227:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:3228:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:3234:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:3240:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) )
            // InternalJRules.g:3241:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:3241:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            int alt88=6;
            switch ( input.LA(1) ) {
            case 106:
            case 107:
            case 108:
                {
                alt88=1;
                }
                break;
            case 74:
                {
                alt88=2;
                }
                break;
            case 75:
                {
                alt88=3;
                }
                break;
            case 76:
                {
                alt88=4;
                }
                break;
            case 77:
                {
                alt88=5;
                }
                break;
            case 78:
                {
                alt88=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalJRules.g:3242:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3242:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3243:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3243:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:3244:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:3244:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:3245:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_19);
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

                    // InternalJRules.g:3262:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==23) ) {
                        int LA73_1 = input.LA(2);

                        if ( (LA73_1==74) ) {
                            alt73=1;
                        }
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalJRules.g:3263:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,23,FOLLOW_82); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:3267:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:3268:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:3268:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:3269:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,74,FOLLOW_19); 

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

                    // InternalJRules.g:3282:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==23) ) {
                        int LA74_1 = input.LA(2);

                        if ( (LA74_1==75) ) {
                            alt74=1;
                        }
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalJRules.g:3283:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_83); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:3287:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:3288:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:3288:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:3289:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,75,FOLLOW_19); 

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

                    // InternalJRules.g:3302:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==23) ) {
                        int LA75_1 = input.LA(2);

                        if ( (LA75_1==76) ) {
                            alt75=1;
                        }
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalJRules.g:3303:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_84); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:3307:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:3308:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:3308:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:3309:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,76,FOLLOW_19); 

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

                    // InternalJRules.g:3322:4: (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==23) ) {
                        int LA76_1 = input.LA(2);

                        if ( (LA76_1==77) ) {
                            alt76=1;
                        }
                    }
                    switch (alt76) {
                        case 1 :
                            // InternalJRules.g:3323:5: otherlv_7= 'and' ( (lv_default_8_0= 'default' ) )
                            {
                            otherlv_7=(Token)match(input,23,FOLLOW_85); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:3327:5: ( (lv_default_8_0= 'default' ) )
                            // InternalJRules.g:3328:6: (lv_default_8_0= 'default' )
                            {
                            // InternalJRules.g:3328:6: (lv_default_8_0= 'default' )
                            // InternalJRules.g:3329:7: lv_default_8_0= 'default'
                            {
                            lv_default_8_0=(Token)match(input,77,FOLLOW_19); 

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

                    // InternalJRules.g:3342:4: (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==23) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalJRules.g:3343:5: otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) )
                            {
                            otherlv_9=(Token)match(input,23,FOLLOW_86); 

                            					newLeafNode(otherlv_9, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_5_0());
                            				
                            // InternalJRules.g:3347:5: ( (lv_synchronized_10_0= 'synchronized' ) )
                            // InternalJRules.g:3348:6: (lv_synchronized_10_0= 'synchronized' )
                            {
                            // InternalJRules.g:3348:6: (lv_synchronized_10_0= 'synchronized' )
                            // InternalJRules.g:3349:7: lv_synchronized_10_0= 'synchronized'
                            {
                            lv_synchronized_10_0=(Token)match(input,78,FOLLOW_2); 

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
                    // InternalJRules.g:3364:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3364:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3365:4: ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3365:4: ( (lv_static_11_0= 'static' ) )
                    // InternalJRules.g:3366:5: (lv_static_11_0= 'static' )
                    {
                    // InternalJRules.g:3366:5: (lv_static_11_0= 'static' )
                    // InternalJRules.g:3367:6: lv_static_11_0= 'static'
                    {
                    lv_static_11_0=(Token)match(input,74,FOLLOW_19); 

                    						newLeafNode(lv_static_11_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:3379:4: (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==23) ) {
                        int LA78_1 = input.LA(2);

                        if ( (LA78_1==75) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalJRules.g:3380:5: otherlv_12= 'and' ( (lv_final_13_0= 'final' ) )
                            {
                            otherlv_12=(Token)match(input,23,FOLLOW_83); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:3384:5: ( (lv_final_13_0= 'final' ) )
                            // InternalJRules.g:3385:6: (lv_final_13_0= 'final' )
                            {
                            // InternalJRules.g:3385:6: (lv_final_13_0= 'final' )
                            // InternalJRules.g:3386:7: lv_final_13_0= 'final'
                            {
                            lv_final_13_0=(Token)match(input,75,FOLLOW_19); 

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

                    // InternalJRules.g:3399:4: (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==23) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==76) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalJRules.g:3400:5: otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) )
                            {
                            otherlv_14=(Token)match(input,23,FOLLOW_84); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:3404:5: ( (lv_abstract_15_0= 'abstract' ) )
                            // InternalJRules.g:3405:6: (lv_abstract_15_0= 'abstract' )
                            {
                            // InternalJRules.g:3405:6: (lv_abstract_15_0= 'abstract' )
                            // InternalJRules.g:3406:7: lv_abstract_15_0= 'abstract'
                            {
                            lv_abstract_15_0=(Token)match(input,76,FOLLOW_19); 

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

                    // InternalJRules.g:3419:4: (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==23) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==77) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalJRules.g:3420:5: otherlv_16= 'and' ( (lv_default_17_0= 'default' ) )
                            {
                            otherlv_16=(Token)match(input,23,FOLLOW_85); 

                            					newLeafNode(otherlv_16, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:3424:5: ( (lv_default_17_0= 'default' ) )
                            // InternalJRules.g:3425:6: (lv_default_17_0= 'default' )
                            {
                            // InternalJRules.g:3425:6: (lv_default_17_0= 'default' )
                            // InternalJRules.g:3426:7: lv_default_17_0= 'default'
                            {
                            lv_default_17_0=(Token)match(input,77,FOLLOW_19); 

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

                    // InternalJRules.g:3439:4: (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==23) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalJRules.g:3440:5: otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) )
                            {
                            otherlv_18=(Token)match(input,23,FOLLOW_86); 

                            					newLeafNode(otherlv_18, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_4_0());
                            				
                            // InternalJRules.g:3444:5: ( (lv_synchronized_19_0= 'synchronized' ) )
                            // InternalJRules.g:3445:6: (lv_synchronized_19_0= 'synchronized' )
                            {
                            // InternalJRules.g:3445:6: (lv_synchronized_19_0= 'synchronized' )
                            // InternalJRules.g:3446:7: lv_synchronized_19_0= 'synchronized'
                            {
                            lv_synchronized_19_0=(Token)match(input,78,FOLLOW_2); 

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
                    // InternalJRules.g:3461:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3461:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3462:4: ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3462:4: ( (lv_final_20_0= 'final' ) )
                    // InternalJRules.g:3463:5: (lv_final_20_0= 'final' )
                    {
                    // InternalJRules.g:3463:5: (lv_final_20_0= 'final' )
                    // InternalJRules.g:3464:6: lv_final_20_0= 'final'
                    {
                    lv_final_20_0=(Token)match(input,75,FOLLOW_19); 

                    						newLeafNode(lv_final_20_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:3476:4: (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==23) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==76) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalJRules.g:3477:5: otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) )
                            {
                            otherlv_21=(Token)match(input,23,FOLLOW_84); 

                            					newLeafNode(otherlv_21, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:3481:5: ( (lv_abstract_22_0= 'abstract' ) )
                            // InternalJRules.g:3482:6: (lv_abstract_22_0= 'abstract' )
                            {
                            // InternalJRules.g:3482:6: (lv_abstract_22_0= 'abstract' )
                            // InternalJRules.g:3483:7: lv_abstract_22_0= 'abstract'
                            {
                            lv_abstract_22_0=(Token)match(input,76,FOLLOW_19); 

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

                    // InternalJRules.g:3496:4: (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==23) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==77) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalJRules.g:3497:5: otherlv_23= 'and' ( (lv_default_24_0= 'default' ) )
                            {
                            otherlv_23=(Token)match(input,23,FOLLOW_85); 

                            					newLeafNode(otherlv_23, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:3501:5: ( (lv_default_24_0= 'default' ) )
                            // InternalJRules.g:3502:6: (lv_default_24_0= 'default' )
                            {
                            // InternalJRules.g:3502:6: (lv_default_24_0= 'default' )
                            // InternalJRules.g:3503:7: lv_default_24_0= 'default'
                            {
                            lv_default_24_0=(Token)match(input,77,FOLLOW_19); 

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

                    // InternalJRules.g:3516:4: (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==23) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalJRules.g:3517:5: otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) )
                            {
                            otherlv_25=(Token)match(input,23,FOLLOW_86); 

                            					newLeafNode(otherlv_25, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_3_0());
                            				
                            // InternalJRules.g:3521:5: ( (lv_synchronized_26_0= 'synchronized' ) )
                            // InternalJRules.g:3522:6: (lv_synchronized_26_0= 'synchronized' )
                            {
                            // InternalJRules.g:3522:6: (lv_synchronized_26_0= 'synchronized' )
                            // InternalJRules.g:3523:7: lv_synchronized_26_0= 'synchronized'
                            {
                            lv_synchronized_26_0=(Token)match(input,78,FOLLOW_2); 

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
                    // InternalJRules.g:3538:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3538:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3539:4: ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3539:4: ( (lv_abstract_27_0= 'abstract' ) )
                    // InternalJRules.g:3540:5: (lv_abstract_27_0= 'abstract' )
                    {
                    // InternalJRules.g:3540:5: (lv_abstract_27_0= 'abstract' )
                    // InternalJRules.g:3541:6: lv_abstract_27_0= 'abstract'
                    {
                    lv_abstract_27_0=(Token)match(input,76,FOLLOW_19); 

                    						newLeafNode(lv_abstract_27_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:3553:4: (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==23) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==77) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalJRules.g:3554:5: otherlv_28= 'and' ( (lv_default_29_0= 'default' ) )
                            {
                            otherlv_28=(Token)match(input,23,FOLLOW_85); 

                            					newLeafNode(otherlv_28, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:3558:5: ( (lv_default_29_0= 'default' ) )
                            // InternalJRules.g:3559:6: (lv_default_29_0= 'default' )
                            {
                            // InternalJRules.g:3559:6: (lv_default_29_0= 'default' )
                            // InternalJRules.g:3560:7: lv_default_29_0= 'default'
                            {
                            lv_default_29_0=(Token)match(input,77,FOLLOW_19); 

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

                    // InternalJRules.g:3573:4: (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==23) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalJRules.g:3574:5: otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) )
                            {
                            otherlv_30=(Token)match(input,23,FOLLOW_86); 

                            					newLeafNode(otherlv_30, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_2_0());
                            				
                            // InternalJRules.g:3578:5: ( (lv_synchronized_31_0= 'synchronized' ) )
                            // InternalJRules.g:3579:6: (lv_synchronized_31_0= 'synchronized' )
                            {
                            // InternalJRules.g:3579:6: (lv_synchronized_31_0= 'synchronized' )
                            // InternalJRules.g:3580:7: lv_synchronized_31_0= 'synchronized'
                            {
                            lv_synchronized_31_0=(Token)match(input,78,FOLLOW_2); 

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
                    // InternalJRules.g:3595:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3595:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3596:4: ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3596:4: ( (lv_default_32_0= 'default' ) )
                    // InternalJRules.g:3597:5: (lv_default_32_0= 'default' )
                    {
                    // InternalJRules.g:3597:5: (lv_default_32_0= 'default' )
                    // InternalJRules.g:3598:6: lv_default_32_0= 'default'
                    {
                    lv_default_32_0=(Token)match(input,77,FOLLOW_19); 

                    						newLeafNode(lv_default_32_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

                    }


                    }

                    // InternalJRules.g:3610:4: (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==23) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalJRules.g:3611:5: otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) )
                            {
                            otherlv_33=(Token)match(input,23,FOLLOW_86); 

                            					newLeafNode(otherlv_33, grammarAccess.getBlendModifiersAccess().getAndKeyword_4_1_0());
                            				
                            // InternalJRules.g:3615:5: ( (lv_synchronized_34_0= 'synchronized' ) )
                            // InternalJRules.g:3616:6: (lv_synchronized_34_0= 'synchronized' )
                            {
                            // InternalJRules.g:3616:6: (lv_synchronized_34_0= 'synchronized' )
                            // InternalJRules.g:3617:7: lv_synchronized_34_0= 'synchronized'
                            {
                            lv_synchronized_34_0=(Token)match(input,78,FOLLOW_2); 

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
                    // InternalJRules.g:3632:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:3632:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    // InternalJRules.g:3633:4: (lv_synchronized_35_0= 'synchronized' )
                    {
                    // InternalJRules.g:3633:4: (lv_synchronized_35_0= 'synchronized' )
                    // InternalJRules.g:3634:5: lv_synchronized_35_0= 'synchronized'
                    {
                    lv_synchronized_35_0=(Token)match(input,78,FOLLOW_2); 

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
    // InternalJRules.g:3650:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:3650:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:3651:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:3657:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3663:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:3664:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:3664:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_STRING) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_ID) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalJRules.g:3665:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3673:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:3684:1: ruleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) ;
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
            // InternalJRules.g:3690:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) )
            // InternalJRules.g:3691:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            {
            // InternalJRules.g:3691:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            int alt90=7;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt90=1;
                }
                break;
            case 80:
                {
                alt90=2;
                }
                break;
            case 81:
                {
                alt90=3;
                }
                break;
            case 82:
                {
                alt90=4;
                }
                break;
            case 83:
                {
                alt90=5;
                }
                break;
            case 84:
                {
                alt90=6;
                }
                break;
            case 85:
                {
                alt90=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // InternalJRules.g:3692:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:3692:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:3693:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3700:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:3700:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:3701:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3708:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:3708:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:3709:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3716:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:3716:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:3717:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3724:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:3724:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:3725:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3732:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:3732:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:3733:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3740:3: (enumLiteral_6= 'File' )
                    {
                    // InternalJRules.g:3740:3: (enumLiteral_6= 'File' )
                    // InternalJRules.g:3741:4: enumLiteral_6= 'File'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); 

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


    // $ANTLR start "rulePrimitive"
    // InternalJRules.g:3751:1: rulePrimitive returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) ;
    public final Enumerator rulePrimitive() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalJRules.g:3757:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) )
            // InternalJRules.g:3758:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            {
            // InternalJRules.g:3758:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            int alt91=9;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt91=1;
                }
                break;
            case 87:
                {
                alt91=2;
                }
                break;
            case 88:
                {
                alt91=3;
                }
                break;
            case 89:
                {
                alt91=4;
                }
                break;
            case 90:
                {
                alt91=5;
                }
                break;
            case 91:
                {
                alt91=6;
                }
                break;
            case 92:
                {
                alt91=7;
                }
                break;
            case 93:
                {
                alt91=8;
                }
                break;
            case 94:
                {
                alt91=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalJRules.g:3759:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalJRules.g:3759:3: (enumLiteral_0= 'boolean' )
                    // InternalJRules.g:3760:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3767:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalJRules.g:3767:3: (enumLiteral_1= 'byte' )
                    // InternalJRules.g:3768:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3775:3: (enumLiteral_2= 'char' )
                    {
                    // InternalJRules.g:3775:3: (enumLiteral_2= 'char' )
                    // InternalJRules.g:3776:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3783:3: (enumLiteral_3= 'double' )
                    {
                    // InternalJRules.g:3783:3: (enumLiteral_3= 'double' )
                    // InternalJRules.g:3784:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3791:3: (enumLiteral_4= 'float' )
                    {
                    // InternalJRules.g:3791:3: (enumLiteral_4= 'float' )
                    // InternalJRules.g:3792:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3799:3: (enumLiteral_5= 'int' )
                    {
                    // InternalJRules.g:3799:3: (enumLiteral_5= 'int' )
                    // InternalJRules.g:3800:4: enumLiteral_5= 'int'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3807:3: (enumLiteral_6= 'long' )
                    {
                    // InternalJRules.g:3807:3: (enumLiteral_6= 'long' )
                    // InternalJRules.g:3808:4: enumLiteral_6= 'long'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJRules.g:3815:3: (enumLiteral_7= 'short' )
                    {
                    // InternalJRules.g:3815:3: (enumLiteral_7= 'short' )
                    // InternalJRules.g:3816:4: enumLiteral_7= 'short'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJRules.g:3823:3: (enumLiteral_8= 'String' )
                    {
                    // InternalJRules.g:3823:3: (enumLiteral_8= 'String' )
                    // InternalJRules.g:3824:4: enumLiteral_8= 'String'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getSTRINGEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_8, grammarAccess.getPrimitiveAccess().getSTRINGEnumLiteralDeclaration_8());
                    			

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "ruleNameOperator"
    // InternalJRules.g:3834:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:3840:2: ( ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) )
            // InternalJRules.g:3841:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            {
            // InternalJRules.g:3841:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            int alt92=4;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt92=1;
                }
                break;
            case 96:
                {
                alt92=2;
                }
                break;
            case 97:
                {
                alt92=3;
                }
                break;
            case 98:
                {
                alt92=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalJRules.g:3842:3: (enumLiteral_0= 'start ' )
                    {
                    // InternalJRules.g:3842:3: (enumLiteral_0= 'start ' )
                    // InternalJRules.g:3843:4: enumLiteral_0= 'start '
                    {
                    enumLiteral_0=(Token)match(input,95,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3850:3: (enumLiteral_1= 'end' )
                    {
                    // InternalJRules.g:3850:3: (enumLiteral_1= 'end' )
                    // InternalJRules.g:3851:4: enumLiteral_1= 'end'
                    {
                    enumLiteral_1=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3858:3: (enumLiteral_2= 'contain' )
                    {
                    // InternalJRules.g:3858:3: (enumLiteral_2= 'contain' )
                    // InternalJRules.g:3859:4: enumLiteral_2= 'contain'
                    {
                    enumLiteral_2=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3866:3: (enumLiteral_3= 'like' )
                    {
                    // InternalJRules.g:3866:3: (enumLiteral_3= 'like' )
                    // InternalJRules.g:3867:4: enumLiteral_3= 'like'
                    {
                    enumLiteral_3=(Token)match(input,98,FOLLOW_2); 

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
    // InternalJRules.g:3877:1: ruleElementString returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) ;
    public final Enumerator ruleElementString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3883:2: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) )
            // InternalJRules.g:3884:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            {
            // InternalJRules.g:3884:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==54) ) {
                alt93=1;
            }
            else if ( (LA93_0==50) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalJRules.g:3885:3: (enumLiteral_0= 'name' )
                    {
                    // InternalJRules.g:3885:3: (enumLiteral_0= 'name' )
                    // InternalJRules.g:3886:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3893:3: (enumLiteral_1= 'type' )
                    {
                    // InternalJRules.g:3893:3: (enumLiteral_1= 'type' )
                    // InternalJRules.g:3894:4: enumLiteral_1= 'type'
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
    // InternalJRules.g:3904:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3910:2: ( ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) )
            // InternalJRules.g:3911:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            {
            // InternalJRules.g:3911:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==99) ) {
                alt94=1;
            }
            else if ( (LA94_0==100) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalJRules.g:3912:3: (enumLiteral_0= 'Spanish' )
                    {
                    // InternalJRules.g:3912:3: (enumLiteral_0= 'Spanish' )
                    // InternalJRules.g:3913:4: enumLiteral_0= 'Spanish'
                    {
                    enumLiteral_0=(Token)match(input,99,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3920:3: (enumLiteral_1= 'English' )
                    {
                    // InternalJRules.g:3920:3: (enumLiteral_1= 'English' )
                    // InternalJRules.g:3921:4: enumLiteral_1= 'English'
                    {
                    enumLiteral_1=(Token)match(input,100,FOLLOW_2); 

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
    // InternalJRules.g:3931:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:3937:2: ( ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) )
            // InternalJRules.g:3938:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            {
            // InternalJRules.g:3938:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            int alt95=5;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt95=1;
                }
                break;
            case 102:
                {
                alt95=2;
                }
                break;
            case 103:
                {
                alt95=3;
                }
                break;
            case 104:
                {
                alt95=4;
                }
                break;
            case 105:
                {
                alt95=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalJRules.g:3939:3: (enumLiteral_0= 'upper case' )
                    {
                    // InternalJRules.g:3939:3: (enumLiteral_0= 'upper case' )
                    // InternalJRules.g:3940:4: enumLiteral_0= 'upper case'
                    {
                    enumLiteral_0=(Token)match(input,101,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3947:3: (enumLiteral_1= 'lower case' )
                    {
                    // InternalJRules.g:3947:3: (enumLiteral_1= 'lower case' )
                    // InternalJRules.g:3948:4: enumLiteral_1= 'lower case'
                    {
                    enumLiteral_1=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3955:3: (enumLiteral_2= 'upper camel case' )
                    {
                    // InternalJRules.g:3955:3: (enumLiteral_2= 'upper camel case' )
                    // InternalJRules.g:3956:4: enumLiteral_2= 'upper camel case'
                    {
                    enumLiteral_2=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3963:3: (enumLiteral_3= 'lower camel case' )
                    {
                    // InternalJRules.g:3963:3: (enumLiteral_3= 'lower camel case' )
                    // InternalJRules.g:3964:4: enumLiteral_3= 'lower camel case'
                    {
                    enumLiteral_3=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3971:3: (enumLiteral_4= 'start upper case' )
                    {
                    // InternalJRules.g:3971:3: (enumLiteral_4= 'start upper case' )
                    // InternalJRules.g:3972:4: enumLiteral_4= 'start upper case'
                    {
                    enumLiteral_4=(Token)match(input,105,FOLLOW_2); 

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
    // InternalJRules.g:3982:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:3988:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalJRules.g:3989:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalJRules.g:3989:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 106:
                {
                alt96=1;
                }
                break;
            case 107:
                {
                alt96=2;
                }
                break;
            case 108:
                {
                alt96=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalJRules.g:3990:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJRules.g:3990:3: (enumLiteral_0= 'public' )
                    // InternalJRules.g:3991:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,106,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3998:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalJRules.g:3998:3: (enumLiteral_1= 'protected' )
                    // InternalJRules.g:3999:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4006:3: (enumLiteral_2= 'private' )
                    {
                    // InternalJRules.g:4006:3: (enumLiteral_2= 'private' )
                    // InternalJRules.g:4007:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,108,FOLLOW_2); 

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
    // InternalJRules.g:4017:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4023:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:4024:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:4024:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt97=3;
            switch ( input.LA(1) ) {
            case 109:
                {
                alt97=1;
                }
                break;
            case 110:
                {
                alt97=2;
                }
                break;
            case 111:
                {
                alt97=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalJRules.g:4025:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:4025:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:4026:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,109,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4033:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:4033:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:4034:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4041:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:4041:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:4042:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,111,FOLLOW_2); 

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


    protected DFA16 dfa16 = new DFA16(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\24\3\34\1\46\1\34\1\46\6\uffff\1\44\2\uffff\1\35\11\uffff\2\46\2\uffff";
    static final String dfa_3s = "\1\77\2\102\1\34\1\76\1\34\1\76\6\uffff\1\142\2\uffff\1\102\11\uffff\2\76\2\uffff";
    static final String dfa_4s = "\7\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\uffff\1\21\1\22\1\uffff\1\23\1\2\1\16\1\11\1\15\1\14\1\3\1\1\1\4\2\uffff\1\20\1\17";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\17\5\uffff\1\1\1\2\6\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff\1\12\2\uffff\1\13\1\14\3\uffff\1\15\1\17\6\uffff\2\16",
            "\1\20\1\30\1\22\1\27\1\31\17\uffff\1\24\2\uffff\1\26\1\25\1\23\14\uffff\1\21",
            "\1\20\1\30\1\22\1\27\1\31\17\uffff\1\24\2\uffff\1\26\1\25\1\23\14\uffff\1\21",
            "\1\32",
            "\1\7\1\10\26\uffff\1\16",
            "\1\33",
            "\1\7\1\10\26\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\4\uffff\2\35\7\uffff\1\34\54\uffff\4\35",
            "",
            "",
            "\1\30\1\22\1\27\1\31\17\uffff\1\24\2\uffff\1\26\1\25\1\23\14\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\7\1\10\26\uffff\1\16",
            "\1\7\1\10\26\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "742:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000102060L,0x0000E00000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000102062L,0x0000E00000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x00000000003F8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xC0C641FC0D100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000002E0002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000002C0002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000280002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000880000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000200L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000004010L,0x0000000000000200L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000890000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000060L,0x0000000000000160L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000200000002000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001000010000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0008000010000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000010000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000010000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000061000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000001000000000L,0x0000000780000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000001800000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x000003E000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x3F00000000000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x3E00000000000002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x3800000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x00001C0000007C00L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000200000400000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000002L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x000000007FC00000L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});

}