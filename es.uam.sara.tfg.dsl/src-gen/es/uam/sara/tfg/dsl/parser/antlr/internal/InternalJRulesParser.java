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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Projects'", "'Name:'", "','", "'*'", "';'", "':'", "'from'", "'in'", "'using'", "'satisfy'", "'no'", "'which'", "'or'", "'and'", "'('", "')'", "'is'", "'are'", "'not'", "'implemented'", "'superinterface'", "'superclass'", "'subclass'", "'of'", "'do'", "'don\\'t'", "'does'", "'doesn\\'t'", "'implements'", "'extends'", "'size'", "'='", "'<>'", "'['", "'..'", "']'", "'parameters'", "'types'", "'constructor'", "'return'", "'type'", "'initialize'", "'empty'", "'generic'", "'name'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'haven\\'t'", "'{'", "'}'", "'modified'", "'with'", "'.'", "'Primitive.'", "'isPrimitive'", "'()'", "'isCollection'", "'-'", "'static'", "'final'", "'abstract'", "'default'", "'synchronized'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'File'", "'boolean'", "'byte'", "'char'", "'double'", "'float'", "'int'", "'long'", "'short'", "'String'", "'start '", "'end'", "'contain'", "'like'", "'Spanish'", "'English'", "'upper case'", "'lower case'", "'upper camel case'", "'lower camel case'", "'start upper case'", "'public'", "'protected'", "'private'", "'one'", "'exists'", "'all'"
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
    public static final int T__112=112;
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

                if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)||LA3_0==21||(LA3_0>=110 && LA3_0<=112)) ) {
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
            else if ( (LA4_0==21||(LA4_0>=110 && LA4_0<=112)) ) {
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
    // InternalJRules.g:232:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )? ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_using_10_0 = null;

        EObject lv_using_12_0 = null;

        EObject lv_satisfy_14_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:238:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )? ) )
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:239:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )? )
            // InternalJRules.g:240:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )?
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

            // InternalJRules.g:282:3: (otherlv_3= 'from' ( ( ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:283:4: otherlv_3= 'from' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getFromKeyword_3_0());
                    			
                    // InternalJRules.g:287:4: ( ( ruleEString ) )
                    // InternalJRules.g:288:5: ( ruleEString )
                    {
                    // InternalJRules.g:288:5: ( ruleEString )
                    // InternalJRules.g:289:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getFromVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:304:3: (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:305:4: otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getInKeyword_4_0());
                    			
                    // InternalJRules.g:309:4: ( ( ruleEString ) )
                    // InternalJRules.g:310:5: ( ruleEString )
                    {
                    // InternalJRules.g:310:5: ( ruleEString )
                    // InternalJRules.g:311:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getInVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:325:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==13) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalJRules.g:326:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalJRules.g:330:5: ( ( ruleEString ) )
                    	    // InternalJRules.g:331:6: ( ruleEString )
                    	    {
                    	    // InternalJRules.g:331:6: ( ruleEString )
                    	    // InternalJRules.g:332:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getVariableRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getVariableAccess().getInVariableCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJRules.g:348:3: (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRules.g:349:4: otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )*
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getVariableAccess().getUsingKeyword_5_0());
                    			
                    // InternalJRules.g:353:4: ( (lv_using_10_0= ruleVariableSubtype ) )
                    // InternalJRules.g:354:5: (lv_using_10_0= ruleVariableSubtype )
                    {
                    // InternalJRules.g:354:5: (lv_using_10_0= ruleVariableSubtype )
                    // InternalJRules.g:355:6: lv_using_10_0= ruleVariableSubtype
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getUsingVariableSubtypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_using_10_0=ruleVariableSubtype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						add(
                    							current,
                    							"using",
                    							lv_using_10_0,
                    							"es.uam.sara.tfg.dsl.JRules.VariableSubtype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:372:4: (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==13) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJRules.g:373:5: otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getVariableAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalJRules.g:377:5: ( (lv_using_12_0= ruleVariableSubtype ) )
                    	    // InternalJRules.g:378:6: (lv_using_12_0= ruleVariableSubtype )
                    	    {
                    	    // InternalJRules.g:378:6: (lv_using_12_0= ruleVariableSubtype )
                    	    // InternalJRules.g:379:7: lv_using_12_0= ruleVariableSubtype
                    	    {

                    	    							newCompositeNode(grammarAccess.getVariableAccess().getUsingVariableSubtypeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_using_12_0=ruleVariableSubtype();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVariableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"using",
                    	    								lv_using_12_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.VariableSubtype");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJRules.g:398:3: (otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJRules.g:399:4: otherlv_13= 'satisfy' ( (lv_satisfy_14_0= ruleOr ) )
                    {
                    otherlv_13=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getVariableAccess().getSatisfyKeyword_6_0());
                    			
                    // InternalJRules.g:403:4: ( (lv_satisfy_14_0= ruleOr ) )
                    // InternalJRules.g:404:5: (lv_satisfy_14_0= ruleOr )
                    {
                    // InternalJRules.g:404:5: (lv_satisfy_14_0= ruleOr )
                    // InternalJRules.g:405:6: lv_satisfy_14_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getSatisfyOrParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_14_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"satisfy",
                    							lv_satisfy_14_0,
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
    // InternalJRules.g:427:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:427:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:428:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:434:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )? (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Enumerator lv_quantifier_1_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_using_10_0 = null;

        EObject lv_using_12_0 = null;

        EObject lv_filter_14_0 = null;

        EObject lv_satisfy_16_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:440:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )? (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )? ) )
            // InternalJRules.g:441:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )? (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:441:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )? (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )? )
            // InternalJRules.g:442:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )? (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )? (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )?
            {
            // InternalJRules.g:442:3: ( (lv_no_0_0= 'no' ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalJRules.g:443:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:443:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:444:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,21,FOLLOW_5); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:456:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:457:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:457:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:458:5: lv_quantifier_1_0= ruleQuantifier
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

            // InternalJRules.g:475:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRules.g:476:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRules.g:476:4: (lv_element_2_0= ruleElement )
            // InternalJRules.g:477:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getElementElementEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_16);
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

            // InternalJRules.g:494:3: (otherlv_3= 'from' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:495:4: otherlv_3= 'from' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getFromKeyword_3_0());
                    			
                    // InternalJRules.g:499:4: ( ( ruleEString ) )
                    // InternalJRules.g:500:5: ( ruleEString )
                    {
                    // InternalJRules.g:500:5: ( ruleEString )
                    // InternalJRules.g:501:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getFromVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:516:3: (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalJRules.g:517:4: otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getInKeyword_4_0());
                    			
                    // InternalJRules.g:521:4: ( ( ruleEString ) )
                    // InternalJRules.g:522:5: ( ruleEString )
                    {
                    // InternalJRules.g:522:5: ( ruleEString )
                    // InternalJRules.g:523:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRuleAccess().getInVariableCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:537:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==13) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalJRules.g:538:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getCommaKeyword_4_2_0());
                    	    				
                    	    // InternalJRules.g:542:5: ( ( ruleEString ) )
                    	    // InternalJRules.g:543:6: ( ruleEString )
                    	    {
                    	    // InternalJRules.g:543:6: ( ruleEString )
                    	    // InternalJRules.g:544:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getInVariableCrossReference_4_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_18);
                    	    ruleEString();

                    	    state._fsp--;


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
                    break;

            }

            // InternalJRules.g:560:3: (otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJRules.g:561:4: otherlv_9= 'using' ( (lv_using_10_0= ruleVariableSubtype ) ) (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )*
                    {
                    otherlv_9=(Token)match(input,19,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getUsingKeyword_5_0());
                    			
                    // InternalJRules.g:565:4: ( (lv_using_10_0= ruleVariableSubtype ) )
                    // InternalJRules.g:566:5: (lv_using_10_0= ruleVariableSubtype )
                    {
                    // InternalJRules.g:566:5: (lv_using_10_0= ruleVariableSubtype )
                    // InternalJRules.g:567:6: lv_using_10_0= ruleVariableSubtype
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getUsingVariableSubtypeParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_using_10_0=ruleVariableSubtype();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"using",
                    							lv_using_10_0,
                    							"es.uam.sara.tfg.dsl.JRules.VariableSubtype");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:584:4: (otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==13) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalJRules.g:585:5: otherlv_11= ',' ( (lv_using_12_0= ruleVariableSubtype ) )
                    	    {
                    	    otherlv_11=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalJRules.g:589:5: ( (lv_using_12_0= ruleVariableSubtype ) )
                    	    // InternalJRules.g:590:6: (lv_using_12_0= ruleVariableSubtype )
                    	    {
                    	    // InternalJRules.g:590:6: (lv_using_12_0= ruleVariableSubtype )
                    	    // InternalJRules.g:591:7: lv_using_12_0= ruleVariableSubtype
                    	    {

                    	    							newCompositeNode(grammarAccess.getRuleAccess().getUsingVariableSubtypeParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_using_12_0=ruleVariableSubtype();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRuleRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"using",
                    	    								lv_using_12_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.VariableSubtype");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalJRules.g:610:3: (otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:611:4: otherlv_13= 'which' ( (lv_filter_14_0= ruleOr ) )
                    {
                    otherlv_13=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getRuleAccess().getWhichKeyword_6_0());
                    			
                    // InternalJRules.g:615:4: ( (lv_filter_14_0= ruleOr ) )
                    // InternalJRules.g:616:5: (lv_filter_14_0= ruleOr )
                    {
                    // InternalJRules.g:616:5: (lv_filter_14_0= ruleOr )
                    // InternalJRules.g:617:6: lv_filter_14_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterOrParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_filter_14_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_14_0,
                    							"es.uam.sara.tfg.dsl.JRules.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:635:3: (otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:636:4: otherlv_15= 'satisfy' ( (lv_satisfy_16_0= ruleOr ) )
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_15, grammarAccess.getRuleAccess().getSatisfyKeyword_7_0());
                    			
                    // InternalJRules.g:640:4: ( (lv_satisfy_16_0= ruleOr ) )
                    // InternalJRules.g:641:5: (lv_satisfy_16_0= ruleOr )
                    {
                    // InternalJRules.g:641:5: (lv_satisfy_16_0= ruleOr )
                    // InternalJRules.g:642:6: lv_satisfy_16_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_16_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"satisfy",
                    							lv_satisfy_16_0,
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
    // InternalJRules.g:664:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:664:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:665:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:671:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:677:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:678:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:678:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:679:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:679:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:680:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:680:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:681:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalJRules.g:698:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalJRules.g:699:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:703:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:704:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:704:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:705:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop19;
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
    // InternalJRules.g:727:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:727:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:728:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:734:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:740:2: ( ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) )
            // InternalJRules.g:741:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            {
            // InternalJRules.g:741:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            // InternalJRules.g:742:3: ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            {
            // InternalJRules.g:742:3: ( (lv_op_0_0= rulePrimaryOp ) )
            // InternalJRules.g:743:4: (lv_op_0_0= rulePrimaryOp )
            {
            // InternalJRules.g:743:4: (lv_op_0_0= rulePrimaryOp )
            // InternalJRules.g:744:5: lv_op_0_0= rulePrimaryOp
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalJRules.g:761:3: (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==24) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalJRules.g:762:4: otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRules.g:766:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalJRules.g:767:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalJRules.g:767:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalJRules.g:768:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
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
            	    break loop20;
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
    // InternalJRules.g:790:1: entryRulePrimaryOp returns [EObject current=null] : iv_rulePrimaryOp= rulePrimaryOp EOF ;
    public final EObject entryRulePrimaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryOp = null;


        try {
            // InternalJRules.g:790:50: (iv_rulePrimaryOp= rulePrimaryOp EOF )
            // InternalJRules.g:791:2: iv_rulePrimaryOp= rulePrimaryOp EOF
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
    // InternalJRules.g:797:1: rulePrimaryOp returns [EObject current=null] : ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) ;
    public final EObject rulePrimaryOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;

        EObject this_PropertyLiteral_3 = null;



        	enterRule();

        try {
            // InternalJRules.g:803:2: ( ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) )
            // InternalJRules.g:804:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            {
            // InternalJRules.g:804:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==25) ) {
                alt21=1;
            }
            else if ( (LA21_0==21||(LA21_0>=27 && LA21_0<=28)||(LA21_0>=35 && LA21_0<=41)||LA21_0==47||(LA21_0>=50 && LA21_0<=51)||(LA21_0>=55 && LA21_0<=56)||(LA21_0>=63 && LA21_0<=64)) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:805:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    {
                    // InternalJRules.g:805:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    // InternalJRules.g:806:4: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryOpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryOpAccess().getOrParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_23);
                    this_Or_1=ruleOr();

                    state._fsp--;


                    				current = this_Or_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryOpAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:824:3: this_PropertyLiteral_3= rulePropertyLiteral
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
    // InternalJRules.g:836:1: entryRulePropertyLiteral returns [EObject current=null] : iv_rulePropertyLiteral= rulePropertyLiteral EOF ;
    public final EObject entryRulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyLiteral = null;


        try {
            // InternalJRules.g:836:56: (iv_rulePropertyLiteral= rulePropertyLiteral EOF )
            // InternalJRules.g:837:2: iv_rulePropertyLiteral= rulePropertyLiteral EOF
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
    // InternalJRules.g:843:1: rulePropertyLiteral returns [EObject current=null] : ( (lv_property_0_0= ruleProperty ) ) ;
    public final EObject rulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:849:2: ( ( (lv_property_0_0= ruleProperty ) ) )
            // InternalJRules.g:850:2: ( (lv_property_0_0= ruleProperty ) )
            {
            // InternalJRules.g:850:2: ( (lv_property_0_0= ruleProperty ) )
            // InternalJRules.g:851:3: (lv_property_0_0= ruleProperty )
            {
            // InternalJRules.g:851:3: (lv_property_0_0= ruleProperty )
            // InternalJRules.g:852:4: lv_property_0_0= ruleProperty
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
    // InternalJRules.g:872:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJRules.g:872:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJRules.g:873:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalJRules.g:879:1: ruleProperty returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) ;
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
            // InternalJRules.g:885:2: ( (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) )
            // InternalJRules.g:886:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            {
            // InternalJRules.g:886:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            int alt22=19;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:887:3: this_isImplemented_0= ruleisImplemented
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
                    // InternalJRules.g:896:3: this_IsSuperInterface_1= ruleIsSuperInterface
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
                    // InternalJRules.g:905:3: this_IsSuperClass_2= ruleIsSuperClass
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
                    // InternalJRules.g:914:3: this_IsSubClass_3= ruleIsSubClass
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
                    // InternalJRules.g:923:3: this_Implements_4= ruleImplements
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
                    // InternalJRules.g:932:3: this_Extends_5= ruleExtends
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
                    // InternalJRules.g:941:3: this_Tamanio_6= ruleTamanio
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
                    // InternalJRules.g:950:3: this_Parameter_7= ruleParameter
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
                    // InternalJRules.g:959:3: this_Constructor_8= ruleConstructor
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
                    // InternalJRules.g:968:3: this_Return_9= ruleReturn
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
                    // InternalJRules.g:977:3: this_AttributeType_10= ruleAttributeType
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
                    // InternalJRules.g:986:3: this_Initialize_11= ruleInitialize
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
                    // InternalJRules.g:995:3: this_Empty_12= ruleEmpty
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
                    // InternalJRules.g:1004:3: this_IsGeneric_13= ruleIsGeneric
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
                    // InternalJRules.g:1013:3: this_NameOperation_14= ruleNameOperation
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
                    // InternalJRules.g:1022:3: this_NameType_15= ruleNameType
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
                    // InternalJRules.g:1031:3: this_Contains_16= ruleContains
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
                    // InternalJRules.g:1040:3: this_JavaDoc_17= ruleJavaDoc
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
                    // InternalJRules.g:1049:3: this_Modifiers_18= ruleModifiers
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
    // InternalJRules.g:1061:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:1061:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:1062:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:1068:1: ruleisImplemented returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1074:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1075:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1075:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1076:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1076:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            else if ( (LA23_0==28) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1077:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_24); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsImplementedAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1082:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_24); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1087:3: ( (lv_no_2_0= 'not' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1088:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1088:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1089:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_25); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsImplementedAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsImplementedRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getIsImplementedAccess().getImplementedKeyword_2());
            		
            // InternalJRules.g:1105:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1106:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1106:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1107:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1128:1: entryRuleIsSuperInterface returns [EObject current=null] : iv_ruleIsSuperInterface= ruleIsSuperInterface EOF ;
    public final EObject entryRuleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperInterface = null;


        try {
            // InternalJRules.g:1128:57: (iv_ruleIsSuperInterface= ruleIsSuperInterface EOF )
            // InternalJRules.g:1129:2: iv_ruleIsSuperInterface= ruleIsSuperInterface EOF
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
    // InternalJRules.g:1135:1: ruleIsSuperInterface returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1141:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1142:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1142:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1143:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1143:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==27) ) {
                alt25=1;
            }
            else if ( (LA25_0==28) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1144:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperInterfaceAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1149:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_27); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperInterfaceAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1154:3: ( (lv_no_2_0= 'not' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1155:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1155:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1156:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_28); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperInterfaceAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperInterfaceAccess().getSuperinterfaceKeyword_2());
            		
            // InternalJRules.g:1172:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1173:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1173:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1174:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1195:1: entryRuleIsSuperClass returns [EObject current=null] : iv_ruleIsSuperClass= ruleIsSuperClass EOF ;
    public final EObject entryRuleIsSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperClass = null;


        try {
            // InternalJRules.g:1195:53: (iv_ruleIsSuperClass= ruleIsSuperClass EOF )
            // InternalJRules.g:1196:2: iv_ruleIsSuperClass= ruleIsSuperClass EOF
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
    // InternalJRules.g:1202:1: ruleIsSuperClass returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1208:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1209:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1209:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1210:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1210:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            else if ( (LA27_0==28) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1211:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_29); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperClassAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1216:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_29); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperClassAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1221:3: ( (lv_no_2_0= 'not' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJRules.g:1222:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1222:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1223:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_30); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperClassAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperClassAccess().getSuperclassKeyword_2());
            		
            // InternalJRules.g:1239:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1240:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1240:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1241:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1262:1: entryRuleIsSubClass returns [EObject current=null] : iv_ruleIsSubClass= ruleIsSubClass EOF ;
    public final EObject entryRuleIsSubClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSubClass = null;


        try {
            // InternalJRules.g:1262:51: (iv_ruleIsSubClass= ruleIsSubClass EOF )
            // InternalJRules.g:1263:2: iv_ruleIsSubClass= ruleIsSubClass EOF
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
    // InternalJRules.g:1269:1: ruleIsSubClass returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) ;
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
            // InternalJRules.g:1275:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) )
            // InternalJRules.g:1276:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            {
            // InternalJRules.g:1276:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            // InternalJRules.g:1277:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            {
            // InternalJRules.g:1277:3: ()
            // InternalJRules.g:1278:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsSubClassAccess().getIsSubClassAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1284:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==27) ) {
                alt29=1;
            }
            else if ( (LA29_0==28) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalJRules.g:1285:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_31); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSubClassAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1290:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_31); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsSubClassAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1295:3: ( (lv_no_3_0= 'not' ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==29) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalJRules.g:1296:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1296:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1297:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_32); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getIsSubClassAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSubClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_33); 

            			newLeafNode(otherlv_4, grammarAccess.getIsSubClassAccess().getSubclassKeyword_3());
            		
            // InternalJRules.g:1313:3: (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==34) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalJRules.g:1314:4: otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsSubClassAccess().getOfKeyword_4_0());
                    			
                    // InternalJRules.g:1318:4: ( (lv_of_6_0= ruleStringProperty ) )
                    // InternalJRules.g:1319:5: (lv_of_6_0= ruleStringProperty )
                    {
                    // InternalJRules.g:1319:5: (lv_of_6_0= ruleStringProperty )
                    // InternalJRules.g:1320:6: lv_of_6_0= ruleStringProperty
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
    // InternalJRules.g:1342:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:1342:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:1343:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:1349:1: ruleImplements returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1355:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1356:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1356:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1357:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1357:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt32=5;
            switch ( input.LA(1) ) {
                case 35:
                    {
                    alt32=1;
                    }
                    break;
                case 36:
                    {
                    alt32=2;
                    }
                    break;
                case 37:
                    {
                    alt32=3;
                    }
                    break;
                case 38:
                    {
                    alt32=4;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // InternalJRules.g:1358:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1358:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1359:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1359:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1360:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1360:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1361:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,35,FOLLOW_34); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getImplementsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1379:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1379:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1380:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1380:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1381:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,36,FOLLOW_35); 

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
                    // InternalJRules.g:1394:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1394:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1395:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1395:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1396:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1396:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1397:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,37,FOLLOW_34); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getImplementsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1415:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1415:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1416:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1416:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1417:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,38,FOLLOW_35); 

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

            otherlv_6=(Token)match(input,39,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:1434:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1435:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1435:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1436:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1457:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJRules.g:1457:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJRules.g:1458:2: iv_ruleExtends= ruleExtends EOF
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
    // InternalJRules.g:1464:1: ruleExtends returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1470:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1471:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1471:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1472:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1472:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt33=5;
            switch ( input.LA(1) ) {
                case 35:
                    {
                    alt33=1;
                    }
                    break;
                case 36:
                    {
                    alt33=2;
                    }
                    break;
                case 37:
                    {
                    alt33=3;
                    }
                    break;
                case 38:
                    {
                    alt33=4;
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalJRules.g:1473:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1473:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1474:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1474:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1475:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1475:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1476:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,35,FOLLOW_34); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getExtendsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_36); 

                    					newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1494:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1494:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1495:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1495:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1496:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,36,FOLLOW_36); 

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
                    // InternalJRules.g:1509:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1509:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1510:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1510:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1511:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1511:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1512:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,37,FOLLOW_34); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getExtendsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_36); 

                    					newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1530:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1530:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1531:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1531:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1532:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,38,FOLLOW_36); 

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

            otherlv_6=(Token)match(input,40,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendsAccess().getExtendsKeyword_1());
            		
            // InternalJRules.g:1549:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1550:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1550:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1551:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1572:1: entryRuleTamanio returns [EObject current=null] : iv_ruleTamanio= ruleTamanio EOF ;
    public final EObject entryRuleTamanio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTamanio = null;


        try {
            // InternalJRules.g:1572:48: (iv_ruleTamanio= ruleTamanio EOF )
            // InternalJRules.g:1573:2: iv_ruleTamanio= ruleTamanio EOF
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
    // InternalJRules.g:1579:1: ruleTamanio returns [EObject current=null] : (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) ;
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
            // InternalJRules.g:1585:2: ( (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) )
            // InternalJRules.g:1586:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            {
            // InternalJRules.g:1586:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            // InternalJRules.g:1587:3: otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getTamanioAccess().getSizeKeyword_0());
            		
            // InternalJRules.g:1591:3: ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=42 && LA36_0<=43)) ) {
                alt36=1;
            }
            else if ( (LA36_0==44) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalJRules.g:1592:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    {
                    // InternalJRules.g:1592:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    // InternalJRules.g:1593:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1593:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==42) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==43) ) {
                        alt34=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 0, input);

                        throw nvae;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1594:6: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_38); 

                            						newLeafNode(otherlv_1, grammarAccess.getTamanioAccess().getEqualsSignKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1599:6: ( (lv_no_2_0= '<>' ) )
                            {
                            // InternalJRules.g:1599:6: ( (lv_no_2_0= '<>' ) )
                            // InternalJRules.g:1600:7: (lv_no_2_0= '<>' )
                            {
                            // InternalJRules.g:1600:7: (lv_no_2_0= '<>' )
                            // InternalJRules.g:1601:8: lv_no_2_0= '<>'
                            {
                            lv_no_2_0=(Token)match(input,43,FOLLOW_38); 

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

                    // InternalJRules.g:1614:5: ( (lv_exact_3_0= ruleEInt ) )
                    // InternalJRules.g:1615:6: (lv_exact_3_0= ruleEInt )
                    {
                    // InternalJRules.g:1615:6: (lv_exact_3_0= ruleEInt )
                    // InternalJRules.g:1616:7: lv_exact_3_0= ruleEInt
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
                    // InternalJRules.g:1635:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    {
                    // InternalJRules.g:1635:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    // InternalJRules.g:1636:5: otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_38); 

                    					newLeafNode(otherlv_4, grammarAccess.getTamanioAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalJRules.g:1640:5: ( (lv_min_5_0= ruleEInt ) )
                    // InternalJRules.g:1641:6: (lv_min_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1641:6: (lv_min_5_0= ruleEInt )
                    // InternalJRules.g:1642:7: lv_min_5_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTamanioAccess().getMinEIntParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_39);
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

                    otherlv_6=(Token)match(input,45,FOLLOW_40); 

                    					newLeafNode(otherlv_6, grammarAccess.getTamanioAccess().getFullStopFullStopKeyword_1_1_2());
                    				
                    // InternalJRules.g:1663:5: ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_INT||LA35_0==74) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==14) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1664:6: ( (lv_max_7_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1664:6: ( (lv_max_7_0= ruleEInt ) )
                            // InternalJRules.g:1665:7: (lv_max_7_0= ruleEInt )
                            {
                            // InternalJRules.g:1665:7: (lv_max_7_0= ruleEInt )
                            // InternalJRules.g:1666:8: lv_max_7_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTamanioAccess().getMaxEIntParserRuleCall_1_1_3_0_0());
                            							
                            pushFollow(FOLLOW_41);
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
                            // InternalJRules.g:1684:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_41); 

                            						newLeafNode(otherlv_8, grammarAccess.getTamanioAccess().getAsteriskKeyword_1_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,46,FOLLOW_2); 

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
    // InternalJRules.g:1699:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:1699:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:1700:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:1706:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) ;
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
            // InternalJRules.g:1712:2: ( ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) )
            // InternalJRules.g:1713:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            {
            // InternalJRules.g:1713:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            // InternalJRules.g:1714:3: () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            {
            // InternalJRules.g:1714:3: ()
            // InternalJRules.g:1715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParametersKeyword_1());
            		
            // InternalJRules.g:1725:3: ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )?
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            else if ( (LA39_0==44) ) {
                alt39=2;
            }
            switch (alt39) {
                case 1 :
                    // InternalJRules.g:1726:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    {
                    // InternalJRules.g:1726:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    // InternalJRules.g:1727:5: otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_43); 

                    					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSizeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1731:5: ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    // InternalJRules.g:1732:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1732:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==42) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==43) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRules.g:1733:7: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,42,FOLLOW_38); 

                            							newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1738:7: ( (lv_no_4_0= '<>' ) )
                            {
                            // InternalJRules.g:1738:7: ( (lv_no_4_0= '<>' ) )
                            // InternalJRules.g:1739:8: (lv_no_4_0= '<>' )
                            {
                            // InternalJRules.g:1739:8: (lv_no_4_0= '<>' )
                            // InternalJRules.g:1740:9: lv_no_4_0= '<>'
                            {
                            lv_no_4_0=(Token)match(input,43,FOLLOW_38); 

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

                    // InternalJRules.g:1753:6: ( (lv_exact_5_0= ruleEInt ) )
                    // InternalJRules.g:1754:7: (lv_exact_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1754:7: (lv_exact_5_0= ruleEInt )
                    // InternalJRules.g:1755:8: lv_exact_5_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getParameterAccess().getExactEIntParserRuleCall_2_0_1_1_0());
                    							
                    pushFollow(FOLLOW_44);
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
                    // InternalJRules.g:1775:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    {
                    // InternalJRules.g:1775:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    // InternalJRules.g:1776:5: otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_38); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalJRules.g:1780:5: ( (lv_min_7_0= ruleEInt ) )
                    // InternalJRules.g:1781:6: (lv_min_7_0= ruleEInt )
                    {
                    // InternalJRules.g:1781:6: (lv_min_7_0= ruleEInt )
                    // InternalJRules.g:1782:7: lv_min_7_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getMinEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_39);
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

                    otherlv_8=(Token)match(input,45,FOLLOW_40); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getFullStopFullStopKeyword_2_1_2());
                    				
                    // InternalJRules.g:1803:5: ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_INT||LA38_0==74) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==14) ) {
                        alt38=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalJRules.g:1804:6: ( (lv_max_9_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1804:6: ( (lv_max_9_0= ruleEInt ) )
                            // InternalJRules.g:1805:7: (lv_max_9_0= ruleEInt )
                            {
                            // InternalJRules.g:1805:7: (lv_max_9_0= ruleEInt )
                            // InternalJRules.g:1806:8: lv_max_9_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getParameterAccess().getMaxEIntParserRuleCall_2_1_3_0_0());
                            							
                            pushFollow(FOLLOW_41);
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
                            // InternalJRules.g:1824:6: otherlv_10= '*'
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_41); 

                            						newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getAsteriskKeyword_2_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,46,FOLLOW_44); 

                    					newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1835:3: (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==48) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRules.g:1836:4: otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']'
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_45); 

                    				newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getTypesKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,42,FOLLOW_46); 

                    				newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_14=(Token)match(input,44,FOLLOW_47); 

                    				newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalJRules.g:1848:4: ( (lv_types_15_0= ruleTypeProperty ) )
                    // InternalJRules.g:1849:5: (lv_types_15_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:1849:5: (lv_types_15_0= ruleTypeProperty )
                    // InternalJRules.g:1850:6: lv_types_15_0= ruleTypeProperty
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_48);
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

                    // InternalJRules.g:1867:4: (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==13) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalJRules.g:1868:5: otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_47); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalJRules.g:1872:5: ( (lv_types_17_0= ruleTypeProperty ) )
                    	    // InternalJRules.g:1873:6: (lv_types_17_0= ruleTypeProperty )
                    	    {
                    	    // InternalJRules.g:1873:6: (lv_types_17_0= ruleTypeProperty )
                    	    // InternalJRules.g:1874:7: lv_types_17_0= ruleTypeProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_48);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,46,FOLLOW_2); 

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
    // InternalJRules.g:1901:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1901:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1902:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1908:1: ruleConstructor returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:1914:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) )
            // InternalJRules.g:1915:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            {
            // InternalJRules.g:1915:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            // InternalJRules.g:1916:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor'
            {
            // InternalJRules.g:1916:3: ()
            // InternalJRules.g:1917:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1923:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==27) ) {
                alt42=1;
            }
            else if ( (LA42_0==28) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalJRules.g:1924:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_49); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1929:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_49); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1934:3: ( (lv_no_3_0= 'not' ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalJRules.g:1935:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1935:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1936:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_50); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getConstructorAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getConstructorRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,49,FOLLOW_2); 

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
    // InternalJRules.g:1956:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1956:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1957:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1963:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1969:2: ( (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:1970:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:1970:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            // InternalJRules.g:1971:3: otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1979:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==42) ) {
                alt44=1;
            }
            else if ( (LA44_0==43) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:1980:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1985:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:1985:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:1986:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:1986:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:1987:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,43,FOLLOW_47); 

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

            // InternalJRules.g:2000:3: ( (lv_type_4_0= ruleTypeProperty ) )
            // InternalJRules.g:2001:4: (lv_type_4_0= ruleTypeProperty )
            {
            // InternalJRules.g:2001:4: (lv_type_4_0= ruleTypeProperty )
            // InternalJRules.g:2002:5: lv_type_4_0= ruleTypeProperty
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
    // InternalJRules.g:2023:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:2023:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:2024:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:2030:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2036:2: ( (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:2037:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:2037:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            // InternalJRules.g:2038:3: otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:2042:3: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==42) ) {
                alt45=1;
            }
            else if ( (LA45_0==43) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2043:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_47); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2048:4: ( (lv_no_2_0= '<>' ) )
                    {
                    // InternalJRules.g:2048:4: ( (lv_no_2_0= '<>' ) )
                    // InternalJRules.g:2049:5: (lv_no_2_0= '<>' )
                    {
                    // InternalJRules.g:2049:5: (lv_no_2_0= '<>' )
                    // InternalJRules.g:2050:6: lv_no_2_0= '<>'
                    {
                    lv_no_2_0=(Token)match(input,43,FOLLOW_47); 

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

            // InternalJRules.g:2063:3: ( (lv_type_3_0= ruleTypeProperty ) )
            // InternalJRules.g:2064:4: (lv_type_3_0= ruleTypeProperty )
            {
            // InternalJRules.g:2064:4: (lv_type_3_0= ruleTypeProperty )
            // InternalJRules.g:2065:5: lv_type_3_0= ruleTypeProperty
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
    // InternalJRules.g:2086:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:2086:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:2087:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:2093:1: ruleInitialize returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2099:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) )
            // InternalJRules.g:2100:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            {
            // InternalJRules.g:2100:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            // InternalJRules.g:2101:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize'
            {
            // InternalJRules.g:2101:3: ()
            // InternalJRules.g:2102:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2108:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==27) ) {
                alt46=1;
            }
            else if ( (LA46_0==28) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalJRules.g:2109:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_52); 

                    				newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2114:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_52); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2119:3: ( (lv_no_3_0= 'not' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJRules.g:2120:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2120:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2121:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_53); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getInitializeAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitializeRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,52,FOLLOW_2); 

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
    // InternalJRules.g:2141:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:2141:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:2142:2: iv_ruleEmpty= ruleEmpty EOF
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
    // InternalJRules.g:2148:1: ruleEmpty returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2154:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) )
            // InternalJRules.g:2155:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            {
            // InternalJRules.g:2155:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            // InternalJRules.g:2156:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty'
            {
            // InternalJRules.g:2156:3: ()
            // InternalJRules.g:2157:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2163:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==27) ) {
                alt48=1;
            }
            else if ( (LA48_0==28) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalJRules.g:2164:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_54); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2169:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_54); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmptyAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2174:3: ( (lv_no_3_0= 'not' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJRules.g:2175:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2175:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2176:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_55); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getEmptyAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEmptyRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,53,FOLLOW_2); 

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
    // InternalJRules.g:2196:1: entryRuleIsGeneric returns [EObject current=null] : iv_ruleIsGeneric= ruleIsGeneric EOF ;
    public final EObject entryRuleIsGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGeneric = null;


        try {
            // InternalJRules.g:2196:50: (iv_ruleIsGeneric= ruleIsGeneric EOF )
            // InternalJRules.g:2197:2: iv_ruleIsGeneric= ruleIsGeneric EOF
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
    // InternalJRules.g:2203:1: ruleIsGeneric returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) ;
    public final EObject ruleIsGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2209:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) )
            // InternalJRules.g:2210:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            {
            // InternalJRules.g:2210:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            // InternalJRules.g:2211:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic'
            {
            // InternalJRules.g:2211:3: ()
            // InternalJRules.g:2212:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGenericAccess().getIsGenericAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2218:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==27) ) {
                alt50=1;
            }
            else if ( (LA50_0==28) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalJRules.g:2219:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_56); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsGenericAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2224:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_56); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsGenericAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2229:3: ( (lv_no_3_0= 'not' ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==29) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalJRules.g:2230:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2230:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2231:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_57); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getIsGenericAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsGenericRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,54,FOLLOW_2); 

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
    // InternalJRules.g:2251:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:2251:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:2252:2: iv_ruleNameOperation= ruleNameOperation EOF
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
    // InternalJRules.g:2258:1: ruleNameOperation returns [EObject current=null] : (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) ;
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
            // InternalJRules.g:2264:2: ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:2265:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:2265:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            // InternalJRules.g:2266:3: otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_58); 

            			newLeafNode(otherlv_0, grammarAccess.getNameOperationAccess().getNameKeyword_0());
            		
            // InternalJRules.g:2270:3: ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==37||(LA54_0>=96 && LA54_0<=99)) ) {
                alt54=1;
            }
            else if ( ((LA54_0>=42 && LA54_0<=43)) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalJRules.g:2271:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    {
                    // InternalJRules.g:2271:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    // InternalJRules.g:2272:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) )
                    {
                    // InternalJRules.g:2272:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==37) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // InternalJRules.g:2273:6: ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2273:6: ( (lv_no_1_0= 'does' ) )
                            // InternalJRules.g:2274:7: (lv_no_1_0= 'does' )
                            {
                            // InternalJRules.g:2274:7: (lv_no_1_0= 'does' )
                            // InternalJRules.g:2275:8: lv_no_1_0= 'does'
                            {
                            lv_no_1_0=(Token)match(input,37,FOLLOW_34); 

                            								newLeafNode(lv_no_1_0, grammarAccess.getNameOperationAccess().getNoDoesKeyword_1_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNameOperationRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "does");
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,29,FOLLOW_59); 

                            						newLeafNode(otherlv_2, grammarAccess.getNameOperationAccess().getNotKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalJRules.g:2292:5: ( (lv_operator_3_0= ruleNameOperator ) )
                    // InternalJRules.g:2293:6: (lv_operator_3_0= ruleNameOperator )
                    {
                    // InternalJRules.g:2293:6: (lv_operator_3_0= ruleNameOperator )
                    // InternalJRules.g:2294:7: lv_operator_3_0= ruleNameOperator
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
                    // InternalJRules.g:2313:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    {
                    // InternalJRules.g:2313:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==42) ) {
                        alt53=1;
                    }
                    else if ( (LA53_0==43) ) {
                        alt53=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalJRules.g:2314:5: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,42,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getEqualsSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2319:5: ( (lv_no_5_0= '<>' ) )
                            {
                            // InternalJRules.g:2319:5: ( (lv_no_5_0= '<>' ) )
                            // InternalJRules.g:2320:6: (lv_no_5_0= '<>' )
                            {
                            // InternalJRules.g:2320:6: (lv_no_5_0= '<>' )
                            // InternalJRules.g:2321:7: lv_no_5_0= '<>'
                            {
                            lv_no_5_0=(Token)match(input,43,FOLLOW_6); 

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

            // InternalJRules.g:2335:3: ( (lv_name_6_0= ruleStringProperty ) )
            // InternalJRules.g:2336:4: (lv_name_6_0= ruleStringProperty )
            {
            // InternalJRules.g:2336:4: (lv_name_6_0= ruleStringProperty )
            // InternalJRules.g:2337:5: lv_name_6_0= ruleStringProperty
            {

            					newCompositeNode(grammarAccess.getNameOperationAccess().getNameStringPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_60);
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

            // InternalJRules.g:2354:3: (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==13) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJRules.g:2355:4: otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_61); 

                    				newLeafNode(otherlv_7, grammarAccess.getNameOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalJRules.g:2359:4: ( (lv_Language_8_0= ruleLanguage ) )
                    // InternalJRules.g:2360:5: (lv_Language_8_0= ruleLanguage )
                    {
                    // InternalJRules.g:2360:5: (lv_Language_8_0= ruleLanguage )
                    // InternalJRules.g:2361:6: lv_Language_8_0= ruleLanguage
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
    // InternalJRules.g:2383:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:2383:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:2384:2: iv_ruleNameType= ruleNameType EOF
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
    // InternalJRules.g:2390:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2396:2: ( (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:2397:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:2397:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            // InternalJRules.g:2398:3: otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_51); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:2406:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==42) ) {
                alt56=1;
            }
            else if ( (LA56_0==43) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalJRules.g:2407:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_62); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameTypeAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2412:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:2412:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:2413:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:2413:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:2414:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,43,FOLLOW_62); 

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

            // InternalJRules.g:2427:3: ( (lv_type_4_0= ruleNameCheck ) )
            // InternalJRules.g:2428:4: (lv_type_4_0= ruleNameCheck )
            {
            // InternalJRules.g:2428:4: (lv_type_4_0= ruleNameCheck )
            // InternalJRules.g:2429:5: lv_type_4_0= ruleNameCheck
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
    // InternalJRules.g:2450:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:2450:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:2451:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:2457:1: ruleJavaDoc returns [EObject current=null] : ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) ;
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
            // InternalJRules.g:2463:2: ( ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) )
            // InternalJRules.g:2464:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            {
            // InternalJRules.g:2464:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            // InternalJRules.g:2465:3: () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )?
            {
            // InternalJRules.g:2465:3: ()
            // InternalJRules.g:2466:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2472:3: ( (lv_no_1_0= 'no' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==21) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJRules.g:2473:4: (lv_no_1_0= 'no' )
                    {
                    // InternalJRules.g:2473:4: (lv_no_1_0= 'no' )
                    // InternalJRules.g:2474:5: lv_no_1_0= 'no'
                    {
                    lv_no_1_0=(Token)match(input,21,FOLLOW_63); 

                    					newLeafNode(lv_no_1_0, grammarAccess.getJavaDocAccess().getNoNoKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,56,FOLLOW_64); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaDocAccess().getJavaDocKeyword_2());
            		
            // InternalJRules.g:2490:3: ( (lv_author_3_0= '@author' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==57) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJRules.g:2491:4: (lv_author_3_0= '@author' )
                    {
                    // InternalJRules.g:2491:4: (lv_author_3_0= '@author' )
                    // InternalJRules.g:2492:5: lv_author_3_0= '@author'
                    {
                    lv_author_3_0=(Token)match(input,57,FOLLOW_65); 

                    					newLeafNode(lv_author_3_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2504:3: ( (lv_parameter_4_0= '@parameter' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJRules.g:2505:4: (lv_parameter_4_0= '@parameter' )
                    {
                    // InternalJRules.g:2505:4: (lv_parameter_4_0= '@parameter' )
                    // InternalJRules.g:2506:5: lv_parameter_4_0= '@parameter'
                    {
                    lv_parameter_4_0=(Token)match(input,58,FOLLOW_66); 

                    					newLeafNode(lv_parameter_4_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2518:3: ( (lv_return_5_0= '@return' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==59) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJRules.g:2519:4: (lv_return_5_0= '@return' )
                    {
                    // InternalJRules.g:2519:4: (lv_return_5_0= '@return' )
                    // InternalJRules.g:2520:5: lv_return_5_0= '@return'
                    {
                    lv_return_5_0=(Token)match(input,59,FOLLOW_67); 

                    					newLeafNode(lv_return_5_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2532:3: ( (lv_version_6_0= '@version' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==60) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJRules.g:2533:4: (lv_version_6_0= '@version' )
                    {
                    // InternalJRules.g:2533:4: (lv_version_6_0= '@version' )
                    // InternalJRules.g:2534:5: lv_version_6_0= '@version'
                    {
                    lv_version_6_0=(Token)match(input,60,FOLLOW_68); 

                    					newLeafNode(lv_version_6_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2546:3: ( (lv_throws_7_0= '@throws' ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==61) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalJRules.g:2547:4: (lv_throws_7_0= '@throws' )
                    {
                    // InternalJRules.g:2547:4: (lv_throws_7_0= '@throws' )
                    // InternalJRules.g:2548:5: lv_throws_7_0= '@throws'
                    {
                    lv_throws_7_0=(Token)match(input,61,FOLLOW_69); 

                    					newLeafNode(lv_throws_7_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2560:3: ( (lv_see_8_0= '@see' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==62) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalJRules.g:2561:4: (lv_see_8_0= '@see' )
                    {
                    // InternalJRules.g:2561:4: (lv_see_8_0= '@see' )
                    // InternalJRules.g:2562:5: lv_see_8_0= '@see'
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
    // InternalJRules.g:2578:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:2578:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:2579:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:2585:1: ruleContains returns [EObject current=null] : ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) ;
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
            // InternalJRules.g:2591:2: ( ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) )
            // InternalJRules.g:2592:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            {
            // InternalJRules.g:2592:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            // InternalJRules.g:2593:3: () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}'
            {
            // InternalJRules.g:2593:3: ()
            // InternalJRules.g:2594:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainsAccess().getContainsAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2600:3: ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=35 && LA65_0<=38)||LA65_0==63) ) {
                alt65=1;
            }
            else if ( (LA65_0==64) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalJRules.g:2601:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    {
                    // InternalJRules.g:2601:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    // InternalJRules.g:2602:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have'
                    {
                    // InternalJRules.g:2602:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )?
                    int alt64=5;
                    switch ( input.LA(1) ) {
                        case 35:
                            {
                            alt64=1;
                            }
                            break;
                        case 36:
                            {
                            alt64=2;
                            }
                            break;
                        case 37:
                            {
                            alt64=3;
                            }
                            break;
                        case 38:
                            {
                            alt64=4;
                            }
                            break;
                    }

                    switch (alt64) {
                        case 1 :
                            // InternalJRules.g:2603:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            {
                            // InternalJRules.g:2603:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            // InternalJRules.g:2604:7: ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2604:7: ( (lv_no_1_0= 'do' ) )
                            // InternalJRules.g:2605:8: (lv_no_1_0= 'do' )
                            {
                            // InternalJRules.g:2605:8: (lv_no_1_0= 'do' )
                            // InternalJRules.g:2606:9: lv_no_1_0= 'do'
                            {
                            lv_no_1_0=(Token)match(input,35,FOLLOW_34); 

                            									newLeafNode(lv_no_1_0, grammarAccess.getContainsAccess().getNoDoKeyword_1_0_0_0_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "do");
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,29,FOLLOW_70); 

                            							newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2624:6: ( (lv_no_3_0= 'don\\'t' ) )
                            {
                            // InternalJRules.g:2624:6: ( (lv_no_3_0= 'don\\'t' ) )
                            // InternalJRules.g:2625:7: (lv_no_3_0= 'don\\'t' )
                            {
                            // InternalJRules.g:2625:7: (lv_no_3_0= 'don\\'t' )
                            // InternalJRules.g:2626:8: lv_no_3_0= 'don\\'t'
                            {
                            lv_no_3_0=(Token)match(input,36,FOLLOW_70); 

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
                            // InternalJRules.g:2639:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            {
                            // InternalJRules.g:2639:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            // InternalJRules.g:2640:7: ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not'
                            {
                            // InternalJRules.g:2640:7: ( (lv_no_4_0= 'does' ) )
                            // InternalJRules.g:2641:8: (lv_no_4_0= 'does' )
                            {
                            // InternalJRules.g:2641:8: (lv_no_4_0= 'does' )
                            // InternalJRules.g:2642:9: lv_no_4_0= 'does'
                            {
                            lv_no_4_0=(Token)match(input,37,FOLLOW_34); 

                            									newLeafNode(lv_no_4_0, grammarAccess.getContainsAccess().getNoDoesKeyword_1_0_0_2_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "does");
                            								

                            }


                            }

                            otherlv_5=(Token)match(input,29,FOLLOW_70); 

                            							newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalJRules.g:2660:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            {
                            // InternalJRules.g:2660:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            // InternalJRules.g:2661:7: (lv_no_6_0= 'doesn\\'t' )
                            {
                            // InternalJRules.g:2661:7: (lv_no_6_0= 'doesn\\'t' )
                            // InternalJRules.g:2662:8: lv_no_6_0= 'doesn\\'t'
                            {
                            lv_no_6_0=(Token)match(input,38,FOLLOW_70); 

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

                    otherlv_7=(Token)match(input,63,FOLLOW_71); 

                    					newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getHaveKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2681:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    {
                    // InternalJRules.g:2681:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    // InternalJRules.g:2682:5: (lv_no_8_0= 'haven\\'t' )
                    {
                    // InternalJRules.g:2682:5: (lv_no_8_0= 'haven\\'t' )
                    // InternalJRules.g:2683:6: lv_no_8_0= 'haven\\'t'
                    {
                    lv_no_8_0=(Token)match(input,64,FOLLOW_71); 

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

            otherlv_9=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalJRules.g:2700:3: ( (lv_rule_10_0= ruleRule ) )
            // InternalJRules.g:2701:4: (lv_rule_10_0= ruleRule )
            {
            // InternalJRules.g:2701:4: (lv_rule_10_0= ruleRule )
            // InternalJRules.g:2702:5: lv_rule_10_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_72);
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

            otherlv_11=(Token)match(input,66,FOLLOW_2); 

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
    // InternalJRules.g:2727:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:2727:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:2728:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:2734:1: ruleModifiers returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) ;
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
            // InternalJRules.g:2740:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) )
            // InternalJRules.g:2741:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            {
            // InternalJRules.g:2741:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            // InternalJRules.g:2742:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']'
            {
            // InternalJRules.g:2742:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==27) ) {
                alt66=1;
            }
            else if ( (LA66_0==28) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalJRules.g:2743:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_73); 

                    				newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2748:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_73); 

                    				newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2753:3: ( (lv_no_2_0= 'not' ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==29) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalJRules.g:2754:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:2754:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:2755:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_74); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getModifiersAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModifiersRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,67,FOLLOW_75); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiersAccess().getModifiedKeyword_2());
            		
            otherlv_4=(Token)match(input,68,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getWithKeyword_3());
            		
            otherlv_5=(Token)match(input,44,FOLLOW_76); 

            			newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalJRules.g:2779:3: ( (lv_blend_6_0= ruleBlendModifiers ) )
            // InternalJRules.g:2780:4: (lv_blend_6_0= ruleBlendModifiers )
            {
            // InternalJRules.g:2780:4: (lv_blend_6_0= ruleBlendModifiers )
            // InternalJRules.g:2781:5: lv_blend_6_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_77);
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

            // InternalJRules.g:2798:3: (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==23) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalJRules.g:2799:4: otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_76); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModifiersAccess().getOrKeyword_6_0());
            	    			
            	    // InternalJRules.g:2803:4: ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:2804:5: (lv_blend_8_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:2804:5: (lv_blend_8_0= ruleBlendModifiers )
            	    // InternalJRules.g:2805:6: lv_blend_8_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_77);
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
            	    break loop68;
                }
            } while (true);

            otherlv_9=(Token)match(input,46,FOLLOW_2); 

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
    // InternalJRules.g:2831:1: entryRuleRangoNames returns [EObject current=null] : iv_ruleRangoNames= ruleRangoNames EOF ;
    public final EObject entryRuleRangoNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangoNames = null;


        try {
            // InternalJRules.g:2831:51: (iv_ruleRangoNames= ruleRangoNames EOF )
            // InternalJRules.g:2832:2: iv_ruleRangoNames= ruleRangoNames EOF
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
    // InternalJRules.g:2838:1: ruleRangoNames returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) ;
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
            // InternalJRules.g:2844:2: ( ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) )
            // InternalJRules.g:2845:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            {
            // InternalJRules.g:2845:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            // InternalJRules.g:2846:3: () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            {
            // InternalJRules.g:2846:3: ()
            // InternalJRules.g:2847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangoNamesAccess().getRangoNamesAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2853:3: (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==44) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJRules.g:2854:4: otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_38); 

                    				newLeafNode(otherlv_1, grammarAccess.getRangoNamesAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalJRules.g:2858:4: ( (lv_min_2_0= ruleEInt ) )
                    // InternalJRules.g:2859:5: (lv_min_2_0= ruleEInt )
                    {
                    // InternalJRules.g:2859:5: (lv_min_2_0= ruleEInt )
                    // InternalJRules.g:2860:6: lv_min_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getMinEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_39);
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

                    otherlv_3=(Token)match(input,45,FOLLOW_40); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangoNamesAccess().getFullStopFullStopKeyword_1_2());
                    			
                    // InternalJRules.g:2881:4: ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' )
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==RULE_INT||LA69_0==74) ) {
                        alt69=1;
                    }
                    else if ( (LA69_0==14) ) {
                        alt69=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 69, 0, input);

                        throw nvae;
                    }
                    switch (alt69) {
                        case 1 :
                            // InternalJRules.g:2882:5: ( (lv_max_4_0= ruleEInt ) )
                            {
                            // InternalJRules.g:2882:5: ( (lv_max_4_0= ruleEInt ) )
                            // InternalJRules.g:2883:6: (lv_max_4_0= ruleEInt )
                            {
                            // InternalJRules.g:2883:6: (lv_max_4_0= ruleEInt )
                            // InternalJRules.g:2884:7: lv_max_4_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getRangoNamesAccess().getMaxEIntParserRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_41);
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
                            // InternalJRules.g:2902:5: otherlv_5= '*'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_41); 

                            					newLeafNode(otherlv_5, grammarAccess.getRangoNamesAccess().getAsteriskKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,46,FOLLOW_44); 

                    				newLeafNode(otherlv_6, grammarAccess.getRangoNamesAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2912:3: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==48) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalJRules.g:2913:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_71); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangoNamesAccess().getTypesKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,65,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRangoNamesAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalJRules.g:2921:4: ( (lv_types_9_0= ruleStringProperty ) )
                    // InternalJRules.g:2922:5: (lv_types_9_0= ruleStringProperty )
                    {
                    // InternalJRules.g:2922:5: (lv_types_9_0= ruleStringProperty )
                    // InternalJRules.g:2923:6: lv_types_9_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_78);
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

                    // InternalJRules.g:2940:4: (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )*
                    loop71:
                    do {
                        int alt71=2;
                        int LA71_0 = input.LA(1);

                        if ( (LA71_0==13) ) {
                            alt71=1;
                        }


                        switch (alt71) {
                    	case 1 :
                    	    // InternalJRules.g:2941:5: otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRangoNamesAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalJRules.g:2945:5: ( (lv_types_11_0= ruleStringProperty ) )
                    	    // InternalJRules.g:2946:6: (lv_types_11_0= ruleStringProperty )
                    	    {
                    	    // InternalJRules.g:2946:6: (lv_types_11_0= ruleStringProperty )
                    	    // InternalJRules.g:2947:7: lv_types_11_0= ruleStringProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_78);
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
                    	    break loop71;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,66,FOLLOW_2); 

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
    // InternalJRules.g:2974:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalJRules.g:2974:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalJRules.g:2975:2: iv_ruleStringProperty= ruleStringProperty EOF
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
    // InternalJRules.g:2981:1: ruleStringProperty returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_StringVariable_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:2987:2: ( (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) )
            // InternalJRules.g:2988:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            {
            // InternalJRules.g:2988:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_STRING) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==EOF||LA73_1==13||LA73_1==15||LA73_1==20||(LA73_1>=23 && LA73_1<=24)||LA73_1==26||LA73_1==46||LA73_1==66) ) {
                    alt73=1;
                }
                else if ( (LA73_1==69) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA73_0==RULE_ID) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==EOF||LA73_2==13||LA73_2==15||LA73_2==20||(LA73_2>=23 && LA73_2<=24)||LA73_2==26||LA73_2==46||LA73_2==66) ) {
                    alt73=1;
                }
                else if ( (LA73_2==69) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalJRules.g:2989:3: this_StringValue_0= ruleStringValue
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
                    // InternalJRules.g:2998:3: this_StringVariable_1= ruleStringVariable
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
    // InternalJRules.g:3010:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJRules.g:3010:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJRules.g:3011:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJRules.g:3017:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3023:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalJRules.g:3024:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalJRules.g:3024:2: ( (lv_value_0_0= ruleEString ) )
            // InternalJRules.g:3025:3: (lv_value_0_0= ruleEString )
            {
            // InternalJRules.g:3025:3: (lv_value_0_0= ruleEString )
            // InternalJRules.g:3026:4: lv_value_0_0= ruleEString
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
    // InternalJRules.g:3046:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalJRules.g:3046:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalJRules.g:3047:2: iv_ruleStringVariable= ruleStringVariable EOF
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
    // InternalJRules.g:3053:1: ruleStringVariable returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        Enumerator lv_strings_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3059:2: ( ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) ) )
            // InternalJRules.g:3060:2: ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) )
            {
            // InternalJRules.g:3060:2: ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) )
            // InternalJRules.g:3061:3: ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) )
            {
            // InternalJRules.g:3061:3: ( (lv_variable_0_0= ruleVariableSubtype ) )
            // InternalJRules.g:3062:4: (lv_variable_0_0= ruleVariableSubtype )
            {
            // InternalJRules.g:3062:4: (lv_variable_0_0= ruleVariableSubtype )
            // InternalJRules.g:3063:5: lv_variable_0_0= ruleVariableSubtype
            {

            					newCompositeNode(grammarAccess.getStringVariableAccess().getVariableVariableSubtypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_79);
            lv_variable_0_0=ruleVariableSubtype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringVariableRule());
            					}
            					set(
            						current,
            						"variable",
            						lv_variable_0_0,
            						"es.uam.sara.tfg.dsl.JRules.VariableSubtype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,69,FOLLOW_80); 

            			newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getFullStopKeyword_1());
            		
            // InternalJRules.g:3084:3: ( (lv_strings_2_0= ruleElementString ) )
            // InternalJRules.g:3085:4: (lv_strings_2_0= ruleElementString )
            {
            // InternalJRules.g:3085:4: (lv_strings_2_0= ruleElementString )
            // InternalJRules.g:3086:5: lv_strings_2_0= ruleElementString
            {

            					newCompositeNode(grammarAccess.getStringVariableAccess().getStringsElementStringEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_strings_2_0=ruleElementString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringVariableRule());
            					}
            					set(
            						current,
            						"strings",
            						lv_strings_2_0,
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


    // $ANTLR start "entryRuleVariableSubtype"
    // InternalJRules.g:3107:1: entryRuleVariableSubtype returns [EObject current=null] : iv_ruleVariableSubtype= ruleVariableSubtype EOF ;
    public final EObject entryRuleVariableSubtype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSubtype = null;


        try {
            // InternalJRules.g:3107:56: (iv_ruleVariableSubtype= ruleVariableSubtype EOF )
            // InternalJRules.g:3108:2: iv_ruleVariableSubtype= ruleVariableSubtype EOF
            {
             newCompositeNode(grammarAccess.getVariableSubtypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableSubtype=ruleVariableSubtype();

            state._fsp--;

             current =iv_ruleVariableSubtype; 
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
    // $ANTLR end "entryRuleVariableSubtype"


    // $ANTLR start "ruleVariableSubtype"
    // InternalJRules.g:3114:1: ruleVariableSubtype returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? ) ;
    public final EObject ruleVariableSubtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_subtype_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3120:2: ( ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? ) )
            // InternalJRules.g:3121:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? )
            {
            // InternalJRules.g:3121:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? )
            // InternalJRules.g:3122:3: ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            {
            // InternalJRules.g:3122:3: ( ( ruleEString ) )
            // InternalJRules.g:3123:4: ( ruleEString )
            {
            // InternalJRules.g:3123:4: ( ruleEString )
            // InternalJRules.g:3124:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableSubtypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableSubtypeAccess().getVariableVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_81);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:3138:3: (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==69) ) {
                int LA74_1 = input.LA(2);

                if ( ((LA74_1>=80 && LA74_1<=86)) ) {
                    alt74=1;
                }
            }
            switch (alt74) {
                case 1 :
                    // InternalJRules.g:3139:4: otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableSubtypeAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJRules.g:3143:4: ( (lv_subtype_2_0= ruleElement ) )
                    // InternalJRules.g:3144:5: (lv_subtype_2_0= ruleElement )
                    {
                    // InternalJRules.g:3144:5: (lv_subtype_2_0= ruleElement )
                    // InternalJRules.g:3145:6: lv_subtype_2_0= ruleElement
                    {

                    						newCompositeNode(grammarAccess.getVariableSubtypeAccess().getSubtypeElementEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_subtype_2_0=ruleElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableSubtypeRule());
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
    // $ANTLR end "ruleVariableSubtype"


    // $ANTLR start "entryRuleTypeProperty"
    // InternalJRules.g:3167:1: entryRuleTypeProperty returns [EObject current=null] : iv_ruleTypeProperty= ruleTypeProperty EOF ;
    public final EObject entryRuleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeProperty = null;


        try {
            // InternalJRules.g:3167:53: (iv_ruleTypeProperty= ruleTypeProperty EOF )
            // InternalJRules.g:3168:2: iv_ruleTypeProperty= ruleTypeProperty EOF
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
    // InternalJRules.g:3174:1: ruleTypeProperty returns [EObject current=null] : (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) ;
    public final EObject ruleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject this_TypeString_0 = null;

        EObject this_isPrimitiveFunction_1 = null;

        EObject this_IsCollectionType_2 = null;



        	enterRule();

        try {
            // InternalJRules.g:3180:2: ( (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) )
            // InternalJRules.g:3181:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            {
            // InternalJRules.g:3181:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 70:
                {
                alt75=1;
                }
                break;
            case 71:
                {
                alt75=2;
                }
                break;
            case 73:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalJRules.g:3182:3: this_TypeString_0= ruleTypeString
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
                    // InternalJRules.g:3191:3: this_isPrimitiveFunction_1= ruleisPrimitiveFunction
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
                    // InternalJRules.g:3200:3: this_IsCollectionType_2= ruleIsCollectionType
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
    // InternalJRules.g:3212:1: entryRuleTypeString returns [EObject current=null] : iv_ruleTypeString= ruleTypeString EOF ;
    public final EObject entryRuleTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeString = null;


        try {
            // InternalJRules.g:3212:51: (iv_ruleTypeString= ruleTypeString EOF )
            // InternalJRules.g:3213:2: iv_ruleTypeString= ruleTypeString EOF
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
    // InternalJRules.g:3219:1: ruleTypeString returns [EObject current=null] : ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) ;
    public final EObject ruleTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_typePrimitive_1_0 = null;

        EObject lv_typeStrng_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3225:2: ( ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) )
            // InternalJRules.g:3226:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            {
            // InternalJRules.g:3226:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==70) ) {
                alt76=1;
            }
            else if ( ((LA76_0>=RULE_STRING && LA76_0<=RULE_ID)) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalJRules.g:3227:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    {
                    // InternalJRules.g:3227:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    // InternalJRules.g:3228:4: otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_82); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeStringAccess().getPrimitiveKeyword_0_0());
                    			
                    // InternalJRules.g:3232:4: ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    // InternalJRules.g:3233:5: (lv_typePrimitive_1_0= rulePrimitive )
                    {
                    // InternalJRules.g:3233:5: (lv_typePrimitive_1_0= rulePrimitive )
                    // InternalJRules.g:3234:6: lv_typePrimitive_1_0= rulePrimitive
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
                    // InternalJRules.g:3253:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    {
                    // InternalJRules.g:3253:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    // InternalJRules.g:3254:4: (lv_typeStrng_2_0= ruleStringProperty )
                    {
                    // InternalJRules.g:3254:4: (lv_typeStrng_2_0= ruleStringProperty )
                    // InternalJRules.g:3255:5: lv_typeStrng_2_0= ruleStringProperty
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
    // InternalJRules.g:3276:1: entryRuleisPrimitiveFunction returns [EObject current=null] : iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF ;
    public final EObject entryRuleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisPrimitiveFunction = null;


        try {
            // InternalJRules.g:3276:60: (iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF )
            // InternalJRules.g:3277:2: iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF
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
    // InternalJRules.g:3283:1: ruleisPrimitiveFunction returns [EObject current=null] : ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) ;
    public final EObject ruleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:3289:2: ( ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) )
            // InternalJRules.g:3290:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            {
            // InternalJRules.g:3290:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            // InternalJRules.g:3291:3: () otherlv_1= 'isPrimitive' otherlv_2= '()'
            {
            // InternalJRules.g:3291:3: ()
            // InternalJRules.g:3292:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsPrimitiveFunctionAccess().getIsPrimitiveFuntionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getIsPrimitiveFunctionAccess().getIsPrimitiveKeyword_1());
            		
            otherlv_2=(Token)match(input,72,FOLLOW_2); 

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
    // InternalJRules.g:3310:1: entryRuleIsCollectionType returns [EObject current=null] : iv_ruleIsCollectionType= ruleIsCollectionType EOF ;
    public final EObject entryRuleIsCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsCollectionType = null;


        try {
            // InternalJRules.g:3310:57: (iv_ruleIsCollectionType= ruleIsCollectionType EOF )
            // InternalJRules.g:3311:2: iv_ruleIsCollectionType= ruleIsCollectionType EOF
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
    // InternalJRules.g:3317:1: ruleIsCollectionType returns [EObject current=null] : ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) ;
    public final EObject ruleIsCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_of_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3323:2: ( ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) )
            // InternalJRules.g:3324:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            {
            // InternalJRules.g:3324:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            // InternalJRules.g:3325:3: () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            {
            // InternalJRules.g:3325:3: ()
            // InternalJRules.g:3326:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsCollectionTypeAccess().getIsCollectionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_84); 

            			newLeafNode(otherlv_1, grammarAccess.getIsCollectionTypeAccess().getIsCollectionKeyword_1());
            		
            // InternalJRules.g:3336:3: (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==72) ) {
                alt77=1;
            }
            else if ( (LA77_0==25) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalJRules.g:3337:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisRightParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3342:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    {
                    // InternalJRules.g:3342:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    // InternalJRules.g:3343:5: otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_47); 

                    					newLeafNode(otherlv_3, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalJRules.g:3347:5: ( (lv_of_4_0= ruleTypeProperty ) )
                    // InternalJRules.g:3348:6: (lv_of_4_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:3348:6: (lv_of_4_0= ruleTypeProperty )
                    // InternalJRules.g:3349:7: lv_of_4_0= ruleTypeProperty
                    {

                    							newCompositeNode(grammarAccess.getIsCollectionTypeAccess().getOfTypePropertyParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_23);
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

                    otherlv_5=(Token)match(input,26,FOLLOW_2); 

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
    // InternalJRules.g:3376:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:3376:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:3377:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:3383:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3389:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:3390:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:3390:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:3391:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:3391:3: (kw= '-' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==74) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalJRules.g:3392:4: kw= '-'
                    {
                    kw=(Token)match(input,74,FOLLOW_85); 

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
    // InternalJRules.g:3409:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:3409:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:3410:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:3416:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:3422:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) )
            // InternalJRules.g:3423:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:3423:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            int alt94=6;
            switch ( input.LA(1) ) {
            case 107:
            case 108:
            case 109:
                {
                alt94=1;
                }
                break;
            case 75:
                {
                alt94=2;
                }
                break;
            case 76:
                {
                alt94=3;
                }
                break;
            case 77:
                {
                alt94=4;
                }
                break;
            case 78:
                {
                alt94=5;
                }
                break;
            case 79:
                {
                alt94=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalJRules.g:3424:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3424:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3425:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3425:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:3426:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:3426:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:3427:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalJRules.g:3444:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==24) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==75) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalJRules.g:3445:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_86); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:3449:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:3450:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:3450:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:3451:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,75,FOLLOW_22); 

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

                    // InternalJRules.g:3464:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==24) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==76) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalJRules.g:3465:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_87); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:3469:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:3470:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:3470:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:3471:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,76,FOLLOW_22); 

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

                    // InternalJRules.g:3484:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==24) ) {
                        int LA81_1 = input.LA(2);

                        if ( (LA81_1==77) ) {
                            alt81=1;
                        }
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalJRules.g:3485:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:3489:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:3490:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:3490:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:3491:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,77,FOLLOW_22); 

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

                    // InternalJRules.g:3504:4: (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==24) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==78) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalJRules.g:3505:5: otherlv_7= 'and' ( (lv_default_8_0= 'default' ) )
                            {
                            otherlv_7=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:3509:5: ( (lv_default_8_0= 'default' ) )
                            // InternalJRules.g:3510:6: (lv_default_8_0= 'default' )
                            {
                            // InternalJRules.g:3510:6: (lv_default_8_0= 'default' )
                            // InternalJRules.g:3511:7: lv_default_8_0= 'default'
                            {
                            lv_default_8_0=(Token)match(input,78,FOLLOW_22); 

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

                    // InternalJRules.g:3524:4: (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==24) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalJRules.g:3525:5: otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) )
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_90); 

                            					newLeafNode(otherlv_9, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_5_0());
                            				
                            // InternalJRules.g:3529:5: ( (lv_synchronized_10_0= 'synchronized' ) )
                            // InternalJRules.g:3530:6: (lv_synchronized_10_0= 'synchronized' )
                            {
                            // InternalJRules.g:3530:6: (lv_synchronized_10_0= 'synchronized' )
                            // InternalJRules.g:3531:7: lv_synchronized_10_0= 'synchronized'
                            {
                            lv_synchronized_10_0=(Token)match(input,79,FOLLOW_2); 

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
                    // InternalJRules.g:3546:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3546:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3547:4: ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3547:4: ( (lv_static_11_0= 'static' ) )
                    // InternalJRules.g:3548:5: (lv_static_11_0= 'static' )
                    {
                    // InternalJRules.g:3548:5: (lv_static_11_0= 'static' )
                    // InternalJRules.g:3549:6: lv_static_11_0= 'static'
                    {
                    lv_static_11_0=(Token)match(input,75,FOLLOW_22); 

                    						newLeafNode(lv_static_11_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:3561:4: (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==24) ) {
                        int LA84_1 = input.LA(2);

                        if ( (LA84_1==76) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalJRules.g:3562:5: otherlv_12= 'and' ( (lv_final_13_0= 'final' ) )
                            {
                            otherlv_12=(Token)match(input,24,FOLLOW_87); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:3566:5: ( (lv_final_13_0= 'final' ) )
                            // InternalJRules.g:3567:6: (lv_final_13_0= 'final' )
                            {
                            // InternalJRules.g:3567:6: (lv_final_13_0= 'final' )
                            // InternalJRules.g:3568:7: lv_final_13_0= 'final'
                            {
                            lv_final_13_0=(Token)match(input,76,FOLLOW_22); 

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

                    // InternalJRules.g:3581:4: (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==24) ) {
                        int LA85_1 = input.LA(2);

                        if ( (LA85_1==77) ) {
                            alt85=1;
                        }
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalJRules.g:3582:5: otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) )
                            {
                            otherlv_14=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:3586:5: ( (lv_abstract_15_0= 'abstract' ) )
                            // InternalJRules.g:3587:6: (lv_abstract_15_0= 'abstract' )
                            {
                            // InternalJRules.g:3587:6: (lv_abstract_15_0= 'abstract' )
                            // InternalJRules.g:3588:7: lv_abstract_15_0= 'abstract'
                            {
                            lv_abstract_15_0=(Token)match(input,77,FOLLOW_22); 

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

                    // InternalJRules.g:3601:4: (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==24) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==78) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalJRules.g:3602:5: otherlv_16= 'and' ( (lv_default_17_0= 'default' ) )
                            {
                            otherlv_16=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_16, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:3606:5: ( (lv_default_17_0= 'default' ) )
                            // InternalJRules.g:3607:6: (lv_default_17_0= 'default' )
                            {
                            // InternalJRules.g:3607:6: (lv_default_17_0= 'default' )
                            // InternalJRules.g:3608:7: lv_default_17_0= 'default'
                            {
                            lv_default_17_0=(Token)match(input,78,FOLLOW_22); 

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

                    // InternalJRules.g:3621:4: (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==24) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalJRules.g:3622:5: otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) )
                            {
                            otherlv_18=(Token)match(input,24,FOLLOW_90); 

                            					newLeafNode(otherlv_18, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_4_0());
                            				
                            // InternalJRules.g:3626:5: ( (lv_synchronized_19_0= 'synchronized' ) )
                            // InternalJRules.g:3627:6: (lv_synchronized_19_0= 'synchronized' )
                            {
                            // InternalJRules.g:3627:6: (lv_synchronized_19_0= 'synchronized' )
                            // InternalJRules.g:3628:7: lv_synchronized_19_0= 'synchronized'
                            {
                            lv_synchronized_19_0=(Token)match(input,79,FOLLOW_2); 

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
                    // InternalJRules.g:3643:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3643:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3644:4: ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3644:4: ( (lv_final_20_0= 'final' ) )
                    // InternalJRules.g:3645:5: (lv_final_20_0= 'final' )
                    {
                    // InternalJRules.g:3645:5: (lv_final_20_0= 'final' )
                    // InternalJRules.g:3646:6: lv_final_20_0= 'final'
                    {
                    lv_final_20_0=(Token)match(input,76,FOLLOW_22); 

                    						newLeafNode(lv_final_20_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:3658:4: (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==24) ) {
                        int LA88_1 = input.LA(2);

                        if ( (LA88_1==77) ) {
                            alt88=1;
                        }
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalJRules.g:3659:5: otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) )
                            {
                            otherlv_21=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_21, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:3663:5: ( (lv_abstract_22_0= 'abstract' ) )
                            // InternalJRules.g:3664:6: (lv_abstract_22_0= 'abstract' )
                            {
                            // InternalJRules.g:3664:6: (lv_abstract_22_0= 'abstract' )
                            // InternalJRules.g:3665:7: lv_abstract_22_0= 'abstract'
                            {
                            lv_abstract_22_0=(Token)match(input,77,FOLLOW_22); 

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

                    // InternalJRules.g:3678:4: (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==24) ) {
                        int LA89_1 = input.LA(2);

                        if ( (LA89_1==78) ) {
                            alt89=1;
                        }
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalJRules.g:3679:5: otherlv_23= 'and' ( (lv_default_24_0= 'default' ) )
                            {
                            otherlv_23=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_23, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:3683:5: ( (lv_default_24_0= 'default' ) )
                            // InternalJRules.g:3684:6: (lv_default_24_0= 'default' )
                            {
                            // InternalJRules.g:3684:6: (lv_default_24_0= 'default' )
                            // InternalJRules.g:3685:7: lv_default_24_0= 'default'
                            {
                            lv_default_24_0=(Token)match(input,78,FOLLOW_22); 

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

                    // InternalJRules.g:3698:4: (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==24) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalJRules.g:3699:5: otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) )
                            {
                            otherlv_25=(Token)match(input,24,FOLLOW_90); 

                            					newLeafNode(otherlv_25, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_3_0());
                            				
                            // InternalJRules.g:3703:5: ( (lv_synchronized_26_0= 'synchronized' ) )
                            // InternalJRules.g:3704:6: (lv_synchronized_26_0= 'synchronized' )
                            {
                            // InternalJRules.g:3704:6: (lv_synchronized_26_0= 'synchronized' )
                            // InternalJRules.g:3705:7: lv_synchronized_26_0= 'synchronized'
                            {
                            lv_synchronized_26_0=(Token)match(input,79,FOLLOW_2); 

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
                    // InternalJRules.g:3720:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3720:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3721:4: ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3721:4: ( (lv_abstract_27_0= 'abstract' ) )
                    // InternalJRules.g:3722:5: (lv_abstract_27_0= 'abstract' )
                    {
                    // InternalJRules.g:3722:5: (lv_abstract_27_0= 'abstract' )
                    // InternalJRules.g:3723:6: lv_abstract_27_0= 'abstract'
                    {
                    lv_abstract_27_0=(Token)match(input,77,FOLLOW_22); 

                    						newLeafNode(lv_abstract_27_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:3735:4: (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==24) ) {
                        int LA91_1 = input.LA(2);

                        if ( (LA91_1==78) ) {
                            alt91=1;
                        }
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalJRules.g:3736:5: otherlv_28= 'and' ( (lv_default_29_0= 'default' ) )
                            {
                            otherlv_28=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_28, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:3740:5: ( (lv_default_29_0= 'default' ) )
                            // InternalJRules.g:3741:6: (lv_default_29_0= 'default' )
                            {
                            // InternalJRules.g:3741:6: (lv_default_29_0= 'default' )
                            // InternalJRules.g:3742:7: lv_default_29_0= 'default'
                            {
                            lv_default_29_0=(Token)match(input,78,FOLLOW_22); 

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

                    // InternalJRules.g:3755:4: (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    int alt92=2;
                    int LA92_0 = input.LA(1);

                    if ( (LA92_0==24) ) {
                        alt92=1;
                    }
                    switch (alt92) {
                        case 1 :
                            // InternalJRules.g:3756:5: otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) )
                            {
                            otherlv_30=(Token)match(input,24,FOLLOW_90); 

                            					newLeafNode(otherlv_30, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_2_0());
                            				
                            // InternalJRules.g:3760:5: ( (lv_synchronized_31_0= 'synchronized' ) )
                            // InternalJRules.g:3761:6: (lv_synchronized_31_0= 'synchronized' )
                            {
                            // InternalJRules.g:3761:6: (lv_synchronized_31_0= 'synchronized' )
                            // InternalJRules.g:3762:7: lv_synchronized_31_0= 'synchronized'
                            {
                            lv_synchronized_31_0=(Token)match(input,79,FOLLOW_2); 

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
                    // InternalJRules.g:3777:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3777:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3778:4: ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3778:4: ( (lv_default_32_0= 'default' ) )
                    // InternalJRules.g:3779:5: (lv_default_32_0= 'default' )
                    {
                    // InternalJRules.g:3779:5: (lv_default_32_0= 'default' )
                    // InternalJRules.g:3780:6: lv_default_32_0= 'default'
                    {
                    lv_default_32_0=(Token)match(input,78,FOLLOW_22); 

                    						newLeafNode(lv_default_32_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

                    }


                    }

                    // InternalJRules.g:3792:4: (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    int alt93=2;
                    int LA93_0 = input.LA(1);

                    if ( (LA93_0==24) ) {
                        alt93=1;
                    }
                    switch (alt93) {
                        case 1 :
                            // InternalJRules.g:3793:5: otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) )
                            {
                            otherlv_33=(Token)match(input,24,FOLLOW_90); 

                            					newLeafNode(otherlv_33, grammarAccess.getBlendModifiersAccess().getAndKeyword_4_1_0());
                            				
                            // InternalJRules.g:3797:5: ( (lv_synchronized_34_0= 'synchronized' ) )
                            // InternalJRules.g:3798:6: (lv_synchronized_34_0= 'synchronized' )
                            {
                            // InternalJRules.g:3798:6: (lv_synchronized_34_0= 'synchronized' )
                            // InternalJRules.g:3799:7: lv_synchronized_34_0= 'synchronized'
                            {
                            lv_synchronized_34_0=(Token)match(input,79,FOLLOW_2); 

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
                    // InternalJRules.g:3814:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:3814:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    // InternalJRules.g:3815:4: (lv_synchronized_35_0= 'synchronized' )
                    {
                    // InternalJRules.g:3815:4: (lv_synchronized_35_0= 'synchronized' )
                    // InternalJRules.g:3816:5: lv_synchronized_35_0= 'synchronized'
                    {
                    lv_synchronized_35_0=(Token)match(input,79,FOLLOW_2); 

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
    // InternalJRules.g:3832:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:3832:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:3833:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:3839:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3845:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:3846:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:3846:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==RULE_STRING) ) {
                alt95=1;
            }
            else if ( (LA95_0==RULE_ID) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // InternalJRules.g:3847:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3855:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:3866:1: ruleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) ;
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
            // InternalJRules.g:3872:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) )
            // InternalJRules.g:3873:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            {
            // InternalJRules.g:3873:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            int alt96=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt96=1;
                }
                break;
            case 81:
                {
                alt96=2;
                }
                break;
            case 82:
                {
                alt96=3;
                }
                break;
            case 83:
                {
                alt96=4;
                }
                break;
            case 84:
                {
                alt96=5;
                }
                break;
            case 85:
                {
                alt96=6;
                }
                break;
            case 86:
                {
                alt96=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalJRules.g:3874:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:3874:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:3875:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3882:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:3882:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:3883:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3890:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:3890:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:3891:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3898:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:3898:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:3899:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3906:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:3906:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:3907:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3914:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:3914:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:3915:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3922:3: (enumLiteral_6= 'File' )
                    {
                    // InternalJRules.g:3922:3: (enumLiteral_6= 'File' )
                    // InternalJRules.g:3923:4: enumLiteral_6= 'File'
                    {
                    enumLiteral_6=(Token)match(input,86,FOLLOW_2); 

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
    // InternalJRules.g:3933:1: rulePrimitive returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) ;
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
            // InternalJRules.g:3939:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) )
            // InternalJRules.g:3940:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            {
            // InternalJRules.g:3940:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            int alt97=9;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt97=1;
                }
                break;
            case 88:
                {
                alt97=2;
                }
                break;
            case 89:
                {
                alt97=3;
                }
                break;
            case 90:
                {
                alt97=4;
                }
                break;
            case 91:
                {
                alt97=5;
                }
                break;
            case 92:
                {
                alt97=6;
                }
                break;
            case 93:
                {
                alt97=7;
                }
                break;
            case 94:
                {
                alt97=8;
                }
                break;
            case 95:
                {
                alt97=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalJRules.g:3941:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalJRules.g:3941:3: (enumLiteral_0= 'boolean' )
                    // InternalJRules.g:3942:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3949:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalJRules.g:3949:3: (enumLiteral_1= 'byte' )
                    // InternalJRules.g:3950:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3957:3: (enumLiteral_2= 'char' )
                    {
                    // InternalJRules.g:3957:3: (enumLiteral_2= 'char' )
                    // InternalJRules.g:3958:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3965:3: (enumLiteral_3= 'double' )
                    {
                    // InternalJRules.g:3965:3: (enumLiteral_3= 'double' )
                    // InternalJRules.g:3966:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3973:3: (enumLiteral_4= 'float' )
                    {
                    // InternalJRules.g:3973:3: (enumLiteral_4= 'float' )
                    // InternalJRules.g:3974:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3981:3: (enumLiteral_5= 'int' )
                    {
                    // InternalJRules.g:3981:3: (enumLiteral_5= 'int' )
                    // InternalJRules.g:3982:4: enumLiteral_5= 'int'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3989:3: (enumLiteral_6= 'long' )
                    {
                    // InternalJRules.g:3989:3: (enumLiteral_6= 'long' )
                    // InternalJRules.g:3990:4: enumLiteral_6= 'long'
                    {
                    enumLiteral_6=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJRules.g:3997:3: (enumLiteral_7= 'short' )
                    {
                    // InternalJRules.g:3997:3: (enumLiteral_7= 'short' )
                    // InternalJRules.g:3998:4: enumLiteral_7= 'short'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJRules.g:4005:3: (enumLiteral_8= 'String' )
                    {
                    // InternalJRules.g:4005:3: (enumLiteral_8= 'String' )
                    // InternalJRules.g:4006:4: enumLiteral_8= 'String'
                    {
                    enumLiteral_8=(Token)match(input,95,FOLLOW_2); 

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
    // InternalJRules.g:4016:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:4022:2: ( ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) )
            // InternalJRules.g:4023:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            {
            // InternalJRules.g:4023:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            int alt98=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt98=1;
                }
                break;
            case 97:
                {
                alt98=2;
                }
                break;
            case 98:
                {
                alt98=3;
                }
                break;
            case 99:
                {
                alt98=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }

            switch (alt98) {
                case 1 :
                    // InternalJRules.g:4024:3: (enumLiteral_0= 'start ' )
                    {
                    // InternalJRules.g:4024:3: (enumLiteral_0= 'start ' )
                    // InternalJRules.g:4025:4: enumLiteral_0= 'start '
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4032:3: (enumLiteral_1= 'end' )
                    {
                    // InternalJRules.g:4032:3: (enumLiteral_1= 'end' )
                    // InternalJRules.g:4033:4: enumLiteral_1= 'end'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4040:3: (enumLiteral_2= 'contain' )
                    {
                    // InternalJRules.g:4040:3: (enumLiteral_2= 'contain' )
                    // InternalJRules.g:4041:4: enumLiteral_2= 'contain'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:4048:3: (enumLiteral_3= 'like' )
                    {
                    // InternalJRules.g:4048:3: (enumLiteral_3= 'like' )
                    // InternalJRules.g:4049:4: enumLiteral_3= 'like'
                    {
                    enumLiteral_3=(Token)match(input,99,FOLLOW_2); 

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
    // InternalJRules.g:4059:1: ruleElementString returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) ;
    public final Enumerator ruleElementString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4065:2: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) )
            // InternalJRules.g:4066:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            {
            // InternalJRules.g:4066:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==55) ) {
                alt99=1;
            }
            else if ( (LA99_0==51) ) {
                alt99=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }
            switch (alt99) {
                case 1 :
                    // InternalJRules.g:4067:3: (enumLiteral_0= 'name' )
                    {
                    // InternalJRules.g:4067:3: (enumLiteral_0= 'name' )
                    // InternalJRules.g:4068:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4075:3: (enumLiteral_1= 'type' )
                    {
                    // InternalJRules.g:4075:3: (enumLiteral_1= 'type' )
                    // InternalJRules.g:4076:4: enumLiteral_1= 'type'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

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
    // InternalJRules.g:4086:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4092:2: ( ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) )
            // InternalJRules.g:4093:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            {
            // InternalJRules.g:4093:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==100) ) {
                alt100=1;
            }
            else if ( (LA100_0==101) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalJRules.g:4094:3: (enumLiteral_0= 'Spanish' )
                    {
                    // InternalJRules.g:4094:3: (enumLiteral_0= 'Spanish' )
                    // InternalJRules.g:4095:4: enumLiteral_0= 'Spanish'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4102:3: (enumLiteral_1= 'English' )
                    {
                    // InternalJRules.g:4102:3: (enumLiteral_1= 'English' )
                    // InternalJRules.g:4103:4: enumLiteral_1= 'English'
                    {
                    enumLiteral_1=(Token)match(input,101,FOLLOW_2); 

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
    // InternalJRules.g:4113:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:4119:2: ( ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) )
            // InternalJRules.g:4120:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            {
            // InternalJRules.g:4120:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            int alt101=5;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt101=1;
                }
                break;
            case 103:
                {
                alt101=2;
                }
                break;
            case 104:
                {
                alt101=3;
                }
                break;
            case 105:
                {
                alt101=4;
                }
                break;
            case 106:
                {
                alt101=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalJRules.g:4121:3: (enumLiteral_0= 'upper case' )
                    {
                    // InternalJRules.g:4121:3: (enumLiteral_0= 'upper case' )
                    // InternalJRules.g:4122:4: enumLiteral_0= 'upper case'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4129:3: (enumLiteral_1= 'lower case' )
                    {
                    // InternalJRules.g:4129:3: (enumLiteral_1= 'lower case' )
                    // InternalJRules.g:4130:4: enumLiteral_1= 'lower case'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4137:3: (enumLiteral_2= 'upper camel case' )
                    {
                    // InternalJRules.g:4137:3: (enumLiteral_2= 'upper camel case' )
                    // InternalJRules.g:4138:4: enumLiteral_2= 'upper camel case'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:4145:3: (enumLiteral_3= 'lower camel case' )
                    {
                    // InternalJRules.g:4145:3: (enumLiteral_3= 'lower camel case' )
                    // InternalJRules.g:4146:4: enumLiteral_3= 'lower camel case'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:4153:3: (enumLiteral_4= 'start upper case' )
                    {
                    // InternalJRules.g:4153:3: (enumLiteral_4= 'start upper case' )
                    // InternalJRules.g:4154:4: enumLiteral_4= 'start upper case'
                    {
                    enumLiteral_4=(Token)match(input,106,FOLLOW_2); 

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
    // InternalJRules.g:4164:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4170:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalJRules.g:4171:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalJRules.g:4171:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt102=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt102=1;
                }
                break;
            case 108:
                {
                alt102=2;
                }
                break;
            case 109:
                {
                alt102=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }

            switch (alt102) {
                case 1 :
                    // InternalJRules.g:4172:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJRules.g:4172:3: (enumLiteral_0= 'public' )
                    // InternalJRules.g:4173:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4180:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalJRules.g:4180:3: (enumLiteral_1= 'protected' )
                    // InternalJRules.g:4181:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4188:3: (enumLiteral_2= 'private' )
                    {
                    // InternalJRules.g:4188:3: (enumLiteral_2= 'private' )
                    // InternalJRules.g:4189:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,109,FOLLOW_2); 

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
    // InternalJRules.g:4199:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4205:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:4206:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:4206:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt103=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt103=1;
                }
                break;
            case 111:
                {
                alt103=2;
                }
                break;
            case 112:
                {
                alt103=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // InternalJRules.g:4207:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:4207:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:4208:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4215:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:4215:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:4216:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4223:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:4223:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:4224:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,112,FOLLOW_2); 

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


    protected DFA22 dfa22 = new DFA22(this);
    static final String dfa_1s = "\36\uffff";
    static final String dfa_2s = "\1\25\3\35\1\47\1\35\1\47\6\uffff\1\45\2\uffff\1\36\11\uffff\2\47\2\uffff";
    static final String dfa_3s = "\1\100\2\103\1\35\1\77\1\35\1\77\6\uffff\1\143\2\uffff\1\103\11\uffff\2\77\2\uffff";
    static final String dfa_4s = "\7\uffff\1\5\1\6\1\7\1\10\1\12\1\13\1\uffff\1\21\1\22\1\uffff\1\1\1\4\1\23\1\2\1\16\1\11\1\15\1\14\1\3\2\uffff\1\17\1\20";
    static final String dfa_5s = "\36\uffff}>";
    static final String[] dfa_6s = {
            "\1\17\5\uffff\1\1\1\2\6\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\5\uffff\1\12\2\uffff\1\13\1\14\3\uffff\1\15\1\17\6\uffff\2\16",
            "\1\20\1\21\1\24\1\31\1\22\17\uffff\1\26\2\uffff\1\30\1\27\1\25\14\uffff\1\23",
            "\1\20\1\21\1\24\1\31\1\22\17\uffff\1\26\2\uffff\1\30\1\27\1\25\14\uffff\1\23",
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
            "\1\34\4\uffff\2\34\7\uffff\1\35\54\uffff\4\34",
            "",
            "",
            "\1\21\1\24\1\31\1\22\17\uffff\1\26\2\uffff\1\30\1\27\1\25\14\uffff\1\23",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "886:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000202060L,0x0001C00000000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000202062L,0x0001C00000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000001E0002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000182002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000102002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x818C83F81A200000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000005E0002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000005C0002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000582002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000502002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000004010L,0x0000000000000400L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0001120000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000060L,0x00000000000002C0L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000020000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000020000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x00000C2000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000002000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000000L,0x000007C000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x7E00000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x7C00000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x000038000000F800L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000004L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x00000000FF800000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});

}