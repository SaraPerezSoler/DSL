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
    // InternalJRules.g:434:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )? (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )? ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_quantifier_1_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_filter_10_0 = null;

        EObject lv_satisfy_12_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:440:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )? (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )? ) )
            // InternalJRules.g:441:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )? (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:441:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )? (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )? )
            // InternalJRules.g:442:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) (otherlv_3= 'from' ( ( ruleEString ) ) )? (otherlv_5= 'in' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* )? (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )? (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )?
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

            // InternalJRules.g:560:3: (otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==22) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJRules.g:561:4: otherlv_9= 'which' ( (lv_filter_10_0= ruleOr ) )
                    {
                    otherlv_9=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getWhichKeyword_5_0());
                    			
                    // InternalJRules.g:565:4: ( (lv_filter_10_0= ruleOr ) )
                    // InternalJRules.g:566:5: (lv_filter_10_0= ruleOr )
                    {
                    // InternalJRules.g:566:5: (lv_filter_10_0= ruleOr )
                    // InternalJRules.g:567:6: lv_filter_10_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterOrParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_filter_10_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_10_0,
                    							"es.uam.sara.tfg.dsl.JRules.Or");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRules.g:585:3: (otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJRules.g:586:4: otherlv_11= 'satisfy' ( (lv_satisfy_12_0= ruleOr ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getSatisfyKeyword_6_0());
                    			
                    // InternalJRules.g:590:4: ( (lv_satisfy_12_0= ruleOr ) )
                    // InternalJRules.g:591:5: (lv_satisfy_12_0= ruleOr )
                    {
                    // InternalJRules.g:591:5: (lv_satisfy_12_0= ruleOr )
                    // InternalJRules.g:592:6: lv_satisfy_12_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_satisfy_12_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"satisfy",
                    							lv_satisfy_12_0,
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
    // InternalJRules.g:614:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:614:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:615:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:621:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:627:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:628:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:628:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:629:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:629:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:630:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:630:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:631:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalJRules.g:648:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalJRules.g:649:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,23,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:653:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:654:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:654:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:655:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop17;
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
    // InternalJRules.g:677:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:677:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:678:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:684:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:690:2: ( ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* ) )
            // InternalJRules.g:691:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            {
            // InternalJRules.g:691:2: ( ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )* )
            // InternalJRules.g:692:3: ( (lv_op_0_0= rulePrimaryOp ) ) (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            {
            // InternalJRules.g:692:3: ( (lv_op_0_0= rulePrimaryOp ) )
            // InternalJRules.g:693:4: (lv_op_0_0= rulePrimaryOp )
            {
            // InternalJRules.g:693:4: (lv_op_0_0= rulePrimaryOp )
            // InternalJRules.g:694:5: lv_op_0_0= rulePrimaryOp
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalJRules.g:711:3: (otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalJRules.g:712:4: otherlv_1= 'and' ( (lv_op_2_0= rulePrimaryOp ) )
            	    {
            	    otherlv_1=(Token)match(input,24,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRules.g:716:4: ( (lv_op_2_0= rulePrimaryOp ) )
            	    // InternalJRules.g:717:5: (lv_op_2_0= rulePrimaryOp )
            	    {
            	    // InternalJRules.g:717:5: (lv_op_2_0= rulePrimaryOp )
            	    // InternalJRules.g:718:6: lv_op_2_0= rulePrimaryOp
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpPrimaryOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop18;
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
    // InternalJRules.g:740:1: entryRulePrimaryOp returns [EObject current=null] : iv_rulePrimaryOp= rulePrimaryOp EOF ;
    public final EObject entryRulePrimaryOp() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryOp = null;


        try {
            // InternalJRules.g:740:50: (iv_rulePrimaryOp= rulePrimaryOp EOF )
            // InternalJRules.g:741:2: iv_rulePrimaryOp= rulePrimaryOp EOF
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
    // InternalJRules.g:747:1: rulePrimaryOp returns [EObject current=null] : ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) ;
    public final EObject rulePrimaryOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Or_1 = null;

        EObject this_PropertyLiteral_3 = null;



        	enterRule();

        try {
            // InternalJRules.g:753:2: ( ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral ) )
            // InternalJRules.g:754:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            {
            // InternalJRules.g:754:2: ( (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' ) | this_PropertyLiteral_3= rulePropertyLiteral )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            else if ( (LA19_0==21||(LA19_0>=27 && LA19_0<=28)||(LA19_0>=35 && LA19_0<=41)||LA19_0==47||(LA19_0>=50 && LA19_0<=51)||(LA19_0>=55 && LA19_0<=56)||(LA19_0>=63 && LA19_0<=64)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:755:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    {
                    // InternalJRules.g:755:3: (otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')' )
                    // InternalJRules.g:756:4: otherlv_0= '(' this_Or_1= ruleOr otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_15); 

                    				newLeafNode(otherlv_0, grammarAccess.getPrimaryOpAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryOpAccess().getOrParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_22);
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
                    // InternalJRules.g:774:3: this_PropertyLiteral_3= rulePropertyLiteral
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
    // InternalJRules.g:786:1: entryRulePropertyLiteral returns [EObject current=null] : iv_rulePropertyLiteral= rulePropertyLiteral EOF ;
    public final EObject entryRulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyLiteral = null;


        try {
            // InternalJRules.g:786:56: (iv_rulePropertyLiteral= rulePropertyLiteral EOF )
            // InternalJRules.g:787:2: iv_rulePropertyLiteral= rulePropertyLiteral EOF
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
    // InternalJRules.g:793:1: rulePropertyLiteral returns [EObject current=null] : ( (lv_property_0_0= ruleProperty ) ) ;
    public final EObject rulePropertyLiteral() throws RecognitionException {
        EObject current = null;

        EObject lv_property_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:799:2: ( ( (lv_property_0_0= ruleProperty ) ) )
            // InternalJRules.g:800:2: ( (lv_property_0_0= ruleProperty ) )
            {
            // InternalJRules.g:800:2: ( (lv_property_0_0= ruleProperty ) )
            // InternalJRules.g:801:3: (lv_property_0_0= ruleProperty )
            {
            // InternalJRules.g:801:3: (lv_property_0_0= ruleProperty )
            // InternalJRules.g:802:4: lv_property_0_0= ruleProperty
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
    // InternalJRules.g:822:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // InternalJRules.g:822:49: (iv_ruleProperty= ruleProperty EOF )
            // InternalJRules.g:823:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalJRules.g:829:1: ruleProperty returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) ;
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
            // InternalJRules.g:835:2: ( (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers ) )
            // InternalJRules.g:836:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            {
            // InternalJRules.g:836:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )
            int alt20=19;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:837:3: this_isImplemented_0= ruleisImplemented
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
                    // InternalJRules.g:846:3: this_IsSuperInterface_1= ruleIsSuperInterface
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
                    // InternalJRules.g:855:3: this_IsSuperClass_2= ruleIsSuperClass
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
                    // InternalJRules.g:864:3: this_IsSubClass_3= ruleIsSubClass
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
                    // InternalJRules.g:873:3: this_Implements_4= ruleImplements
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
                    // InternalJRules.g:882:3: this_Extends_5= ruleExtends
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
                    // InternalJRules.g:891:3: this_Tamanio_6= ruleTamanio
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
                    // InternalJRules.g:900:3: this_Parameter_7= ruleParameter
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
                    // InternalJRules.g:909:3: this_Constructor_8= ruleConstructor
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
                    // InternalJRules.g:918:3: this_Return_9= ruleReturn
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
                    // InternalJRules.g:927:3: this_AttributeType_10= ruleAttributeType
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
                    // InternalJRules.g:936:3: this_Initialize_11= ruleInitialize
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
                    // InternalJRules.g:945:3: this_Empty_12= ruleEmpty
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
                    // InternalJRules.g:954:3: this_IsGeneric_13= ruleIsGeneric
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
                    // InternalJRules.g:963:3: this_NameOperation_14= ruleNameOperation
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
                    // InternalJRules.g:972:3: this_NameType_15= ruleNameType
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
                    // InternalJRules.g:981:3: this_Contains_16= ruleContains
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
                    // InternalJRules.g:990:3: this_JavaDoc_17= ruleJavaDoc
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
                    // InternalJRules.g:999:3: this_Modifiers_18= ruleModifiers
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
    // InternalJRules.g:1011:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:1011:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:1012:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:1018:1: ruleisImplemented returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1024:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1025:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1025:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1026:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'implemented' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1026:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==27) ) {
                alt21=1;
            }
            else if ( (LA21_0==28) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1027:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsImplementedAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1032:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1037:3: ( (lv_no_2_0= 'not' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1038:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1038:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1039:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_24); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsImplementedAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsImplementedRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,30,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getIsImplementedAccess().getImplementedKeyword_2());
            		
            // InternalJRules.g:1055:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1056:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1056:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1057:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1078:1: entryRuleIsSuperInterface returns [EObject current=null] : iv_ruleIsSuperInterface= ruleIsSuperInterface EOF ;
    public final EObject entryRuleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperInterface = null;


        try {
            // InternalJRules.g:1078:57: (iv_ruleIsSuperInterface= ruleIsSuperInterface EOF )
            // InternalJRules.g:1079:2: iv_ruleIsSuperInterface= ruleIsSuperInterface EOF
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
    // InternalJRules.g:1085:1: ruleIsSuperInterface returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1091:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1092:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1092:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1093:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superinterface' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1093:3: (otherlv_0= 'is' | otherlv_1= 'are' )
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
                    // InternalJRules.g:1094:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperInterfaceAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1099:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_26); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperInterfaceAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1104:3: ( (lv_no_2_0= 'not' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1105:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1105:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1106:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_27); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperInterfaceAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperInterfaceRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,31,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperInterfaceAccess().getSuperinterfaceKeyword_2());
            		
            // InternalJRules.g:1122:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1123:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1123:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1124:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1145:1: entryRuleIsSuperClass returns [EObject current=null] : iv_ruleIsSuperClass= ruleIsSuperClass EOF ;
    public final EObject entryRuleIsSuperClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSuperClass = null;


        try {
            // InternalJRules.g:1145:53: (iv_ruleIsSuperClass= ruleIsSuperClass EOF )
            // InternalJRules.g:1146:2: iv_ruleIsSuperClass= ruleIsSuperClass EOF
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
    // InternalJRules.g:1152:1: ruleIsSuperClass returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) ;
    public final EObject ruleIsSuperClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;
        EObject lv_valores_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1158:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1159:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1159:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) ) )
            // InternalJRules.g:1160:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'superclass' ( (lv_valores_4_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1160:3: (otherlv_0= 'is' | otherlv_1= 'are' )
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
                    // InternalJRules.g:1161:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_28); 

                    				newLeafNode(otherlv_0, grammarAccess.getIsSuperClassAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1166:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSuperClassAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1171:3: ( (lv_no_2_0= 'not' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==29) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1172:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1172:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1173:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_29); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getIsSuperClassAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSuperClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,32,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getIsSuperClassAccess().getSuperclassKeyword_2());
            		
            // InternalJRules.g:1189:3: ( (lv_valores_4_0= ruleRangoNames ) )
            // InternalJRules.g:1190:4: (lv_valores_4_0= ruleRangoNames )
            {
            // InternalJRules.g:1190:4: (lv_valores_4_0= ruleRangoNames )
            // InternalJRules.g:1191:5: lv_valores_4_0= ruleRangoNames
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
    // InternalJRules.g:1212:1: entryRuleIsSubClass returns [EObject current=null] : iv_ruleIsSubClass= ruleIsSubClass EOF ;
    public final EObject entryRuleIsSubClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsSubClass = null;


        try {
            // InternalJRules.g:1212:51: (iv_ruleIsSubClass= ruleIsSubClass EOF )
            // InternalJRules.g:1213:2: iv_ruleIsSubClass= ruleIsSubClass EOF
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
    // InternalJRules.g:1219:1: ruleIsSubClass returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) ;
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
            // InternalJRules.g:1225:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? ) )
            // InternalJRules.g:1226:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            {
            // InternalJRules.g:1226:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )? )
            // InternalJRules.g:1227:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'subclass' (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            {
            // InternalJRules.g:1227:3: ()
            // InternalJRules.g:1228:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsSubClassAccess().getIsSubClassAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1234:3: (otherlv_1= 'is' | otherlv_2= 'are' )
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
                    // InternalJRules.g:1235:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_30); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsSubClassAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1240:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsSubClassAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1245:3: ( (lv_no_3_0= 'not' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJRules.g:1246:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1246:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1247:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_31); 

                    					newLeafNode(lv_no_3_0, grammarAccess.getIsSubClassAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIsSubClassRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_32); 

            			newLeafNode(otherlv_4, grammarAccess.getIsSubClassAccess().getSubclassKeyword_3());
            		
            // InternalJRules.g:1263:3: (otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==34) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalJRules.g:1264:4: otherlv_5= 'of' ( (lv_of_6_0= ruleStringProperty ) )
                    {
                    otherlv_5=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getIsSubClassAccess().getOfKeyword_4_0());
                    			
                    // InternalJRules.g:1268:4: ( (lv_of_6_0= ruleStringProperty ) )
                    // InternalJRules.g:1269:5: (lv_of_6_0= ruleStringProperty )
                    {
                    // InternalJRules.g:1269:5: (lv_of_6_0= ruleStringProperty )
                    // InternalJRules.g:1270:6: lv_of_6_0= ruleStringProperty
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
    // InternalJRules.g:1292:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:1292:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:1293:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:1299:1: ruleImplements returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1305:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1306:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1306:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1307:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'implements' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1307:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt30=5;
            switch ( input.LA(1) ) {
                case 35:
                    {
                    alt30=1;
                    }
                    break;
                case 36:
                    {
                    alt30=2;
                    }
                    break;
                case 37:
                    {
                    alt30=3;
                    }
                    break;
                case 38:
                    {
                    alt30=4;
                    }
                    break;
            }

            switch (alt30) {
                case 1 :
                    // InternalJRules.g:1308:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1308:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1309:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1309:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1310:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1310:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1311:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,35,FOLLOW_33); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getImplementsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_34); 

                    					newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1329:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1329:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1330:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1330:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1331:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,36,FOLLOW_34); 

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
                    // InternalJRules.g:1344:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1344:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1345:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1345:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1346:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1346:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1347:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,37,FOLLOW_33); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getImplementsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImplementsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_34); 

                    					newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1365:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1365:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1366:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1366:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1367:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,38,FOLLOW_34); 

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

            otherlv_6=(Token)match(input,39,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:1384:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1385:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1385:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1386:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1407:1: entryRuleExtends returns [EObject current=null] : iv_ruleExtends= ruleExtends EOF ;
    public final EObject entryRuleExtends() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtends = null;


        try {
            // InternalJRules.g:1407:48: (iv_ruleExtends= ruleExtends EOF )
            // InternalJRules.g:1408:2: iv_ruleExtends= ruleExtends EOF
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
    // InternalJRules.g:1414:1: ruleExtends returns [EObject current=null] : ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) ;
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
            // InternalJRules.g:1420:2: ( ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) ) )
            // InternalJRules.g:1421:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            {
            // InternalJRules.g:1421:2: ( ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) ) )
            // InternalJRules.g:1422:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )? otherlv_6= 'extends' ( (lv_valores_7_0= ruleRangoNames ) )
            {
            // InternalJRules.g:1422:3: ( ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' ) | ( (lv_no_2_0= 'don\\'t' ) ) | ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' ) | ( (lv_no_5_0= 'doesn\\'t' ) ) )?
            int alt31=5;
            switch ( input.LA(1) ) {
                case 35:
                    {
                    alt31=1;
                    }
                    break;
                case 36:
                    {
                    alt31=2;
                    }
                    break;
                case 37:
                    {
                    alt31=3;
                    }
                    break;
                case 38:
                    {
                    alt31=4;
                    }
                    break;
            }

            switch (alt31) {
                case 1 :
                    // InternalJRules.g:1423:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    {
                    // InternalJRules.g:1423:4: ( ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not' )
                    // InternalJRules.g:1424:5: ( (lv_no_0_0= 'do' ) ) otherlv_1= 'not'
                    {
                    // InternalJRules.g:1424:5: ( (lv_no_0_0= 'do' ) )
                    // InternalJRules.g:1425:6: (lv_no_0_0= 'do' )
                    {
                    // InternalJRules.g:1425:6: (lv_no_0_0= 'do' )
                    // InternalJRules.g:1426:7: lv_no_0_0= 'do'
                    {
                    lv_no_0_0=(Token)match(input,35,FOLLOW_33); 

                    							newLeafNode(lv_no_0_0, grammarAccess.getExtendsAccess().getNoDoKeyword_0_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "do");
                    						

                    }


                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_35); 

                    					newLeafNode(otherlv_1, grammarAccess.getExtendsAccess().getNotKeyword_0_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1444:4: ( (lv_no_2_0= 'don\\'t' ) )
                    {
                    // InternalJRules.g:1444:4: ( (lv_no_2_0= 'don\\'t' ) )
                    // InternalJRules.g:1445:5: (lv_no_2_0= 'don\\'t' )
                    {
                    // InternalJRules.g:1445:5: (lv_no_2_0= 'don\\'t' )
                    // InternalJRules.g:1446:6: lv_no_2_0= 'don\\'t'
                    {
                    lv_no_2_0=(Token)match(input,36,FOLLOW_35); 

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
                    // InternalJRules.g:1459:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    {
                    // InternalJRules.g:1459:4: ( ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not' )
                    // InternalJRules.g:1460:5: ( (lv_no_3_0= 'does' ) ) otherlv_4= 'not'
                    {
                    // InternalJRules.g:1460:5: ( (lv_no_3_0= 'does' ) )
                    // InternalJRules.g:1461:6: (lv_no_3_0= 'does' )
                    {
                    // InternalJRules.g:1461:6: (lv_no_3_0= 'does' )
                    // InternalJRules.g:1462:7: lv_no_3_0= 'does'
                    {
                    lv_no_3_0=(Token)match(input,37,FOLLOW_33); 

                    							newLeafNode(lv_no_3_0, grammarAccess.getExtendsAccess().getNoDoesKeyword_0_2_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getExtendsRule());
                    							}
                    							setWithLastConsumed(current, "no", true, "does");
                    						

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_35); 

                    					newLeafNode(otherlv_4, grammarAccess.getExtendsAccess().getNotKeyword_0_2_1());
                    				

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:1480:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    {
                    // InternalJRules.g:1480:4: ( (lv_no_5_0= 'doesn\\'t' ) )
                    // InternalJRules.g:1481:5: (lv_no_5_0= 'doesn\\'t' )
                    {
                    // InternalJRules.g:1481:5: (lv_no_5_0= 'doesn\\'t' )
                    // InternalJRules.g:1482:6: lv_no_5_0= 'doesn\\'t'
                    {
                    lv_no_5_0=(Token)match(input,38,FOLLOW_35); 

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

            otherlv_6=(Token)match(input,40,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getExtendsAccess().getExtendsKeyword_1());
            		
            // InternalJRules.g:1499:3: ( (lv_valores_7_0= ruleRangoNames ) )
            // InternalJRules.g:1500:4: (lv_valores_7_0= ruleRangoNames )
            {
            // InternalJRules.g:1500:4: (lv_valores_7_0= ruleRangoNames )
            // InternalJRules.g:1501:5: lv_valores_7_0= ruleRangoNames
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
    // InternalJRules.g:1522:1: entryRuleTamanio returns [EObject current=null] : iv_ruleTamanio= ruleTamanio EOF ;
    public final EObject entryRuleTamanio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTamanio = null;


        try {
            // InternalJRules.g:1522:48: (iv_ruleTamanio= ruleTamanio EOF )
            // InternalJRules.g:1523:2: iv_ruleTamanio= ruleTamanio EOF
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
    // InternalJRules.g:1529:1: ruleTamanio returns [EObject current=null] : (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) ;
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
            // InternalJRules.g:1535:2: ( (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) ) )
            // InternalJRules.g:1536:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            {
            // InternalJRules.g:1536:2: (otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) ) )
            // InternalJRules.g:1537:3: otherlv_0= 'size' ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getTamanioAccess().getSizeKeyword_0());
            		
            // InternalJRules.g:1541:3: ( ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) ) | (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=42 && LA34_0<=43)) ) {
                alt34=1;
            }
            else if ( (LA34_0==44) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalJRules.g:1542:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    {
                    // InternalJRules.g:1542:4: ( (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) ) )
                    // InternalJRules.g:1543:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_exact_3_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1543:5: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==42) ) {
                        alt32=1;
                    }
                    else if ( (LA32_0==43) ) {
                        alt32=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 32, 0, input);

                        throw nvae;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1544:6: otherlv_1= '='
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_37); 

                            						newLeafNode(otherlv_1, grammarAccess.getTamanioAccess().getEqualsSignKeyword_1_0_0_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1549:6: ( (lv_no_2_0= '<>' ) )
                            {
                            // InternalJRules.g:1549:6: ( (lv_no_2_0= '<>' ) )
                            // InternalJRules.g:1550:7: (lv_no_2_0= '<>' )
                            {
                            // InternalJRules.g:1550:7: (lv_no_2_0= '<>' )
                            // InternalJRules.g:1551:8: lv_no_2_0= '<>'
                            {
                            lv_no_2_0=(Token)match(input,43,FOLLOW_37); 

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

                    // InternalJRules.g:1564:5: ( (lv_exact_3_0= ruleEInt ) )
                    // InternalJRules.g:1565:6: (lv_exact_3_0= ruleEInt )
                    {
                    // InternalJRules.g:1565:6: (lv_exact_3_0= ruleEInt )
                    // InternalJRules.g:1566:7: lv_exact_3_0= ruleEInt
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
                    // InternalJRules.g:1585:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    {
                    // InternalJRules.g:1585:4: (otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']' )
                    // InternalJRules.g:1586:5: otherlv_4= '[' ( (lv_min_5_0= ruleEInt ) ) otherlv_6= '..' ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' ) otherlv_9= ']'
                    {
                    otherlv_4=(Token)match(input,44,FOLLOW_37); 

                    					newLeafNode(otherlv_4, grammarAccess.getTamanioAccess().getLeftSquareBracketKeyword_1_1_0());
                    				
                    // InternalJRules.g:1590:5: ( (lv_min_5_0= ruleEInt ) )
                    // InternalJRules.g:1591:6: (lv_min_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1591:6: (lv_min_5_0= ruleEInt )
                    // InternalJRules.g:1592:7: lv_min_5_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getTamanioAccess().getMinEIntParserRuleCall_1_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
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

                    otherlv_6=(Token)match(input,45,FOLLOW_39); 

                    					newLeafNode(otherlv_6, grammarAccess.getTamanioAccess().getFullStopFullStopKeyword_1_1_2());
                    				
                    // InternalJRules.g:1613:5: ( ( (lv_max_7_0= ruleEInt ) ) | otherlv_8= '*' )
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT||LA33_0==74) ) {
                        alt33=1;
                    }
                    else if ( (LA33_0==14) ) {
                        alt33=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 33, 0, input);

                        throw nvae;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1614:6: ( (lv_max_7_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1614:6: ( (lv_max_7_0= ruleEInt ) )
                            // InternalJRules.g:1615:7: (lv_max_7_0= ruleEInt )
                            {
                            // InternalJRules.g:1615:7: (lv_max_7_0= ruleEInt )
                            // InternalJRules.g:1616:8: lv_max_7_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getTamanioAccess().getMaxEIntParserRuleCall_1_1_3_0_0());
                            							
                            pushFollow(FOLLOW_40);
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
                            // InternalJRules.g:1634:6: otherlv_8= '*'
                            {
                            otherlv_8=(Token)match(input,14,FOLLOW_40); 

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
    // InternalJRules.g:1649:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:1649:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:1650:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:1656:1: ruleParameter returns [EObject current=null] : ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) ;
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
            // InternalJRules.g:1662:2: ( ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? ) )
            // InternalJRules.g:1663:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            {
            // InternalJRules.g:1663:2: ( () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )? )
            // InternalJRules.g:1664:3: () otherlv_1= 'parameters' ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )? (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            {
            // InternalJRules.g:1664:3: ()
            // InternalJRules.g:1665:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAccess().getParameterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getParametersKeyword_1());
            		
            // InternalJRules.g:1675:3: ( (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) ) | (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' ) )?
            int alt37=3;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==41) ) {
                alt37=1;
            }
            else if ( (LA37_0==44) ) {
                alt37=2;
            }
            switch (alt37) {
                case 1 :
                    // InternalJRules.g:1676:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    {
                    // InternalJRules.g:1676:4: (otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) ) )
                    // InternalJRules.g:1677:5: otherlv_2= 'size' ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_42); 

                    					newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getSizeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1681:5: ( (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) ) )
                    // InternalJRules.g:1682:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) ) ( (lv_exact_5_0= ruleEInt ) )
                    {
                    // InternalJRules.g:1682:6: (otherlv_3= '=' | ( (lv_no_4_0= '<>' ) ) )
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==42) ) {
                        alt35=1;
                    }
                    else if ( (LA35_0==43) ) {
                        alt35=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 0, input);

                        throw nvae;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1683:7: otherlv_3= '='
                            {
                            otherlv_3=(Token)match(input,42,FOLLOW_37); 

                            							newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getEqualsSignKeyword_2_0_1_0_0());
                            						

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:1688:7: ( (lv_no_4_0= '<>' ) )
                            {
                            // InternalJRules.g:1688:7: ( (lv_no_4_0= '<>' ) )
                            // InternalJRules.g:1689:8: (lv_no_4_0= '<>' )
                            {
                            // InternalJRules.g:1689:8: (lv_no_4_0= '<>' )
                            // InternalJRules.g:1690:9: lv_no_4_0= '<>'
                            {
                            lv_no_4_0=(Token)match(input,43,FOLLOW_37); 

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

                    // InternalJRules.g:1703:6: ( (lv_exact_5_0= ruleEInt ) )
                    // InternalJRules.g:1704:7: (lv_exact_5_0= ruleEInt )
                    {
                    // InternalJRules.g:1704:7: (lv_exact_5_0= ruleEInt )
                    // InternalJRules.g:1705:8: lv_exact_5_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getParameterAccess().getExactEIntParserRuleCall_2_0_1_1_0());
                    							
                    pushFollow(FOLLOW_43);
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
                    // InternalJRules.g:1725:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    {
                    // InternalJRules.g:1725:4: (otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']' )
                    // InternalJRules.g:1726:5: otherlv_6= '[' ( (lv_min_7_0= ruleEInt ) ) otherlv_8= '..' ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' ) otherlv_11= ']'
                    {
                    otherlv_6=(Token)match(input,44,FOLLOW_37); 

                    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_1_0());
                    				
                    // InternalJRules.g:1730:5: ( (lv_min_7_0= ruleEInt ) )
                    // InternalJRules.g:1731:6: (lv_min_7_0= ruleEInt )
                    {
                    // InternalJRules.g:1731:6: (lv_min_7_0= ruleEInt )
                    // InternalJRules.g:1732:7: lv_min_7_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getParameterAccess().getMinEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
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

                    otherlv_8=(Token)match(input,45,FOLLOW_39); 

                    					newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getFullStopFullStopKeyword_2_1_2());
                    				
                    // InternalJRules.g:1753:5: ( ( (lv_max_9_0= ruleEInt ) ) | otherlv_10= '*' )
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_INT||LA36_0==74) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==14) ) {
                        alt36=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 0, input);

                        throw nvae;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:1754:6: ( (lv_max_9_0= ruleEInt ) )
                            {
                            // InternalJRules.g:1754:6: ( (lv_max_9_0= ruleEInt ) )
                            // InternalJRules.g:1755:7: (lv_max_9_0= ruleEInt )
                            {
                            // InternalJRules.g:1755:7: (lv_max_9_0= ruleEInt )
                            // InternalJRules.g:1756:8: lv_max_9_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getParameterAccess().getMaxEIntParserRuleCall_2_1_3_0_0());
                            							
                            pushFollow(FOLLOW_40);
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
                            // InternalJRules.g:1774:6: otherlv_10= '*'
                            {
                            otherlv_10=(Token)match(input,14,FOLLOW_40); 

                            						newLeafNode(otherlv_10, grammarAccess.getParameterAccess().getAsteriskKeyword_2_1_3_1());
                            					

                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,46,FOLLOW_43); 

                    					newLeafNode(otherlv_11, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_1_4());
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1785:3: (otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==48) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJRules.g:1786:4: otherlv_12= 'types' otherlv_13= '=' otherlv_14= '[' ( (lv_types_15_0= ruleTypeProperty ) ) (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )* otherlv_18= ']'
                    {
                    otherlv_12=(Token)match(input,48,FOLLOW_44); 

                    				newLeafNode(otherlv_12, grammarAccess.getParameterAccess().getTypesKeyword_3_0());
                    			
                    otherlv_13=(Token)match(input,42,FOLLOW_45); 

                    				newLeafNode(otherlv_13, grammarAccess.getParameterAccess().getEqualsSignKeyword_3_1());
                    			
                    otherlv_14=(Token)match(input,44,FOLLOW_46); 

                    				newLeafNode(otherlv_14, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_3_2());
                    			
                    // InternalJRules.g:1798:4: ( (lv_types_15_0= ruleTypeProperty ) )
                    // InternalJRules.g:1799:5: (lv_types_15_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:1799:5: (lv_types_15_0= ruleTypeProperty )
                    // InternalJRules.g:1800:6: lv_types_15_0= ruleTypeProperty
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_47);
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

                    // InternalJRules.g:1817:4: (otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==13) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalJRules.g:1818:5: otherlv_16= ',' ( (lv_types_17_0= ruleTypeProperty ) )
                    	    {
                    	    otherlv_16=(Token)match(input,13,FOLLOW_46); 

                    	    					newLeafNode(otherlv_16, grammarAccess.getParameterAccess().getCommaKeyword_3_4_0());
                    	    				
                    	    // InternalJRules.g:1822:5: ( (lv_types_17_0= ruleTypeProperty ) )
                    	    // InternalJRules.g:1823:6: (lv_types_17_0= ruleTypeProperty )
                    	    {
                    	    // InternalJRules.g:1823:6: (lv_types_17_0= ruleTypeProperty )
                    	    // InternalJRules.g:1824:7: lv_types_17_0= ruleTypeProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesTypePropertyParserRuleCall_3_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_47);
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
                    	    break loop38;
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
    // InternalJRules.g:1851:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1851:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1852:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1858:1: ruleConstructor returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:1864:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' ) )
            // InternalJRules.g:1865:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            {
            // InternalJRules.g:1865:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor' )
            // InternalJRules.g:1866:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'constructor'
            {
            // InternalJRules.g:1866:3: ()
            // InternalJRules.g:1867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            // InternalJRules.g:1873:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==27) ) {
                alt40=1;
            }
            else if ( (LA40_0==28) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalJRules.g:1874:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_48); 

                    				newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1879:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_48); 

                    				newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:1884:3: ( (lv_no_3_0= 'not' ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRules.g:1885:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:1885:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:1886:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_49); 

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
    // InternalJRules.g:1906:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1906:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1907:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1913:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        EObject lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1919:2: ( (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:1920:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:1920:2: (otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) ) )
            // InternalJRules.g:1921:3: otherlv_0= 'return' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1929:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==42) ) {
                alt42=1;
            }
            else if ( (LA42_0==43) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalJRules.g:1930:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1935:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:1935:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:1936:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:1936:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:1937:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,43,FOLLOW_46); 

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

            // InternalJRules.g:1950:3: ( (lv_type_4_0= ruleTypeProperty ) )
            // InternalJRules.g:1951:4: (lv_type_4_0= ruleTypeProperty )
            {
            // InternalJRules.g:1951:4: (lv_type_4_0= ruleTypeProperty )
            // InternalJRules.g:1952:5: lv_type_4_0= ruleTypeProperty
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
    // InternalJRules.g:1973:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1973:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1974:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1980:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_no_2_0=null;
        EObject lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1986:2: ( (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) ) )
            // InternalJRules.g:1987:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            {
            // InternalJRules.g:1987:2: (otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) ) )
            // InternalJRules.g:1988:3: otherlv_0= 'type' (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) ) ( (lv_type_3_0= ruleTypeProperty ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1992:3: (otherlv_1= '=' | ( (lv_no_2_0= '<>' ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==42) ) {
                alt43=1;
            }
            else if ( (LA43_0==43) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalJRules.g:1993:4: otherlv_1= '='
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_46); 

                    				newLeafNode(otherlv_1, grammarAccess.getAttributeTypeAccess().getEqualsSignKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:1998:4: ( (lv_no_2_0= '<>' ) )
                    {
                    // InternalJRules.g:1998:4: ( (lv_no_2_0= '<>' ) )
                    // InternalJRules.g:1999:5: (lv_no_2_0= '<>' )
                    {
                    // InternalJRules.g:1999:5: (lv_no_2_0= '<>' )
                    // InternalJRules.g:2000:6: lv_no_2_0= '<>'
                    {
                    lv_no_2_0=(Token)match(input,43,FOLLOW_46); 

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

            // InternalJRules.g:2013:3: ( (lv_type_3_0= ruleTypeProperty ) )
            // InternalJRules.g:2014:4: (lv_type_3_0= ruleTypeProperty )
            {
            // InternalJRules.g:2014:4: (lv_type_3_0= ruleTypeProperty )
            // InternalJRules.g:2015:5: lv_type_3_0= ruleTypeProperty
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
    // InternalJRules.g:2036:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:2036:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:2037:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:2043:1: ruleInitialize returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2049:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' ) )
            // InternalJRules.g:2050:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            {
            // InternalJRules.g:2050:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize' )
            // InternalJRules.g:2051:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'initialize'
            {
            // InternalJRules.g:2051:3: ()
            // InternalJRules.g:2052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2058:3: (otherlv_1= 'is' | otherlv_2= 'are' )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            else if ( (LA44_0==28) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2059:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_51); 

                    				newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2064:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_51); 

                    				newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2069:3: ( (lv_no_3_0= 'not' ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2070:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2070:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2071:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_52); 

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
    // InternalJRules.g:2091:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:2091:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:2092:2: iv_ruleEmpty= ruleEmpty EOF
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
    // InternalJRules.g:2098:1: ruleEmpty returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2104:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' ) )
            // InternalJRules.g:2105:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            {
            // InternalJRules.g:2105:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty' )
            // InternalJRules.g:2106:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'empty'
            {
            // InternalJRules.g:2106:3: ()
            // InternalJRules.g:2107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2113:3: (otherlv_1= 'is' | otherlv_2= 'are' )
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
                    // InternalJRules.g:2114:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_53); 

                    				newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2119:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_53); 

                    				newLeafNode(otherlv_2, grammarAccess.getEmptyAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2124:3: ( (lv_no_3_0= 'not' ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalJRules.g:2125:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2125:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2126:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_54); 

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
    // InternalJRules.g:2146:1: entryRuleIsGeneric returns [EObject current=null] : iv_ruleIsGeneric= ruleIsGeneric EOF ;
    public final EObject entryRuleIsGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGeneric = null;


        try {
            // InternalJRules.g:2146:50: (iv_ruleIsGeneric= ruleIsGeneric EOF )
            // InternalJRules.g:2147:2: iv_ruleIsGeneric= ruleIsGeneric EOF
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
    // InternalJRules.g:2153:1: ruleIsGeneric returns [EObject current=null] : ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) ;
    public final EObject ruleIsGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2159:2: ( ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' ) )
            // InternalJRules.g:2160:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            {
            // InternalJRules.g:2160:2: ( () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic' )
            // InternalJRules.g:2161:3: () (otherlv_1= 'is' | otherlv_2= 'are' ) ( (lv_no_3_0= 'not' ) )? otherlv_4= 'generic'
            {
            // InternalJRules.g:2161:3: ()
            // InternalJRules.g:2162:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGenericAccess().getIsGenericAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2168:3: (otherlv_1= 'is' | otherlv_2= 'are' )
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
                    // InternalJRules.g:2169:4: otherlv_1= 'is'
                    {
                    otherlv_1=(Token)match(input,27,FOLLOW_55); 

                    				newLeafNode(otherlv_1, grammarAccess.getIsGenericAccess().getIsKeyword_1_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2174:4: otherlv_2= 'are'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_55); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsGenericAccess().getAreKeyword_1_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2179:3: ( (lv_no_3_0= 'not' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalJRules.g:2180:4: (lv_no_3_0= 'not' )
                    {
                    // InternalJRules.g:2180:4: (lv_no_3_0= 'not' )
                    // InternalJRules.g:2181:5: lv_no_3_0= 'not'
                    {
                    lv_no_3_0=(Token)match(input,29,FOLLOW_56); 

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
    // InternalJRules.g:2201:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:2201:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:2202:2: iv_ruleNameOperation= ruleNameOperation EOF
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
    // InternalJRules.g:2208:1: ruleNameOperation returns [EObject current=null] : (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) ;
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
            // InternalJRules.g:2214:2: ( (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:2215:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:2215:2: (otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )? )
            // InternalJRules.g:2216:3: otherlv_0= 'name' ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) ) ( (lv_name_6_0= ruleStringProperty ) ) (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_57); 

            			newLeafNode(otherlv_0, grammarAccess.getNameOperationAccess().getNameKeyword_0());
            		
            // InternalJRules.g:2220:3: ( ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) ) | (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==37||(LA52_0>=96 && LA52_0<=99)) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=42 && LA52_0<=43)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalJRules.g:2221:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    {
                    // InternalJRules.g:2221:4: ( ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) ) )
                    // InternalJRules.g:2222:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )? ( (lv_operator_3_0= ruleNameOperator ) )
                    {
                    // InternalJRules.g:2222:5: ( ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==37) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalJRules.g:2223:6: ( (lv_no_1_0= 'does' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2223:6: ( (lv_no_1_0= 'does' ) )
                            // InternalJRules.g:2224:7: (lv_no_1_0= 'does' )
                            {
                            // InternalJRules.g:2224:7: (lv_no_1_0= 'does' )
                            // InternalJRules.g:2225:8: lv_no_1_0= 'does'
                            {
                            lv_no_1_0=(Token)match(input,37,FOLLOW_33); 

                            								newLeafNode(lv_no_1_0, grammarAccess.getNameOperationAccess().getNoDoesKeyword_1_0_0_0_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getNameOperationRule());
                            								}
                            								setWithLastConsumed(current, "no", true, "does");
                            							

                            }


                            }

                            otherlv_2=(Token)match(input,29,FOLLOW_58); 

                            						newLeafNode(otherlv_2, grammarAccess.getNameOperationAccess().getNotKeyword_1_0_0_1());
                            					

                            }
                            break;

                    }

                    // InternalJRules.g:2242:5: ( (lv_operator_3_0= ruleNameOperator ) )
                    // InternalJRules.g:2243:6: (lv_operator_3_0= ruleNameOperator )
                    {
                    // InternalJRules.g:2243:6: (lv_operator_3_0= ruleNameOperator )
                    // InternalJRules.g:2244:7: lv_operator_3_0= ruleNameOperator
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
                    // InternalJRules.g:2263:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    {
                    // InternalJRules.g:2263:4: (otherlv_4= '=' | ( (lv_no_5_0= '<>' ) ) )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==42) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==43) ) {
                        alt51=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalJRules.g:2264:5: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,42,FOLLOW_6); 

                            					newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getEqualsSignKeyword_1_1_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2269:5: ( (lv_no_5_0= '<>' ) )
                            {
                            // InternalJRules.g:2269:5: ( (lv_no_5_0= '<>' ) )
                            // InternalJRules.g:2270:6: (lv_no_5_0= '<>' )
                            {
                            // InternalJRules.g:2270:6: (lv_no_5_0= '<>' )
                            // InternalJRules.g:2271:7: lv_no_5_0= '<>'
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

            // InternalJRules.g:2285:3: ( (lv_name_6_0= ruleStringProperty ) )
            // InternalJRules.g:2286:4: (lv_name_6_0= ruleStringProperty )
            {
            // InternalJRules.g:2286:4: (lv_name_6_0= ruleStringProperty )
            // InternalJRules.g:2287:5: lv_name_6_0= ruleStringProperty
            {

            					newCompositeNode(grammarAccess.getNameOperationAccess().getNameStringPropertyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_59);
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

            // InternalJRules.g:2304:3: (otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==13) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalJRules.g:2305:4: otherlv_7= ',' ( (lv_Language_8_0= ruleLanguage ) )
                    {
                    otherlv_7=(Token)match(input,13,FOLLOW_60); 

                    				newLeafNode(otherlv_7, grammarAccess.getNameOperationAccess().getCommaKeyword_3_0());
                    			
                    // InternalJRules.g:2309:4: ( (lv_Language_8_0= ruleLanguage ) )
                    // InternalJRules.g:2310:5: (lv_Language_8_0= ruleLanguage )
                    {
                    // InternalJRules.g:2310:5: (lv_Language_8_0= ruleLanguage )
                    // InternalJRules.g:2311:6: lv_Language_8_0= ruleLanguage
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
    // InternalJRules.g:2333:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:2333:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:2334:2: iv_ruleNameType= ruleNameType EOF
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
    // InternalJRules.g:2340:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_no_3_0=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2346:2: ( (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:2347:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:2347:2: (otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) ) )
            // InternalJRules.g:2348:3: otherlv_0= 'name' otherlv_1= 'type' (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) ) ( (lv_type_4_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:2356:3: (otherlv_2= '=' | ( (lv_no_3_0= '<>' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==42) ) {
                alt54=1;
            }
            else if ( (LA54_0==43) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalJRules.g:2357:4: otherlv_2= '='
                    {
                    otherlv_2=(Token)match(input,42,FOLLOW_61); 

                    				newLeafNode(otherlv_2, grammarAccess.getNameTypeAccess().getEqualsSignKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2362:4: ( (lv_no_3_0= '<>' ) )
                    {
                    // InternalJRules.g:2362:4: ( (lv_no_3_0= '<>' ) )
                    // InternalJRules.g:2363:5: (lv_no_3_0= '<>' )
                    {
                    // InternalJRules.g:2363:5: (lv_no_3_0= '<>' )
                    // InternalJRules.g:2364:6: lv_no_3_0= '<>'
                    {
                    lv_no_3_0=(Token)match(input,43,FOLLOW_61); 

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

            // InternalJRules.g:2377:3: ( (lv_type_4_0= ruleNameCheck ) )
            // InternalJRules.g:2378:4: (lv_type_4_0= ruleNameCheck )
            {
            // InternalJRules.g:2378:4: (lv_type_4_0= ruleNameCheck )
            // InternalJRules.g:2379:5: lv_type_4_0= ruleNameCheck
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
    // InternalJRules.g:2400:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:2400:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:2401:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:2407:1: ruleJavaDoc returns [EObject current=null] : ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) ;
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
            // InternalJRules.g:2413:2: ( ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? ) )
            // InternalJRules.g:2414:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            {
            // InternalJRules.g:2414:2: ( () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )? )
            // InternalJRules.g:2415:3: () ( (lv_no_1_0= 'no' ) )? otherlv_2= 'JavaDoc' ( (lv_author_3_0= '@author' ) )? ( (lv_parameter_4_0= '@parameter' ) )? ( (lv_return_5_0= '@return' ) )? ( (lv_version_6_0= '@version' ) )? ( (lv_throws_7_0= '@throws' ) )? ( (lv_see_8_0= '@see' ) )?
            {
            // InternalJRules.g:2415:3: ()
            // InternalJRules.g:2416:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2422:3: ( (lv_no_1_0= 'no' ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==21) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalJRules.g:2423:4: (lv_no_1_0= 'no' )
                    {
                    // InternalJRules.g:2423:4: (lv_no_1_0= 'no' )
                    // InternalJRules.g:2424:5: lv_no_1_0= 'no'
                    {
                    lv_no_1_0=(Token)match(input,21,FOLLOW_62); 

                    					newLeafNode(lv_no_1_0, grammarAccess.getJavaDocAccess().getNoNoKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,56,FOLLOW_63); 

            			newLeafNode(otherlv_2, grammarAccess.getJavaDocAccess().getJavaDocKeyword_2());
            		
            // InternalJRules.g:2440:3: ( (lv_author_3_0= '@author' ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==57) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalJRules.g:2441:4: (lv_author_3_0= '@author' )
                    {
                    // InternalJRules.g:2441:4: (lv_author_3_0= '@author' )
                    // InternalJRules.g:2442:5: lv_author_3_0= '@author'
                    {
                    lv_author_3_0=(Token)match(input,57,FOLLOW_64); 

                    					newLeafNode(lv_author_3_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2454:3: ( (lv_parameter_4_0= '@parameter' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalJRules.g:2455:4: (lv_parameter_4_0= '@parameter' )
                    {
                    // InternalJRules.g:2455:4: (lv_parameter_4_0= '@parameter' )
                    // InternalJRules.g:2456:5: lv_parameter_4_0= '@parameter'
                    {
                    lv_parameter_4_0=(Token)match(input,58,FOLLOW_65); 

                    					newLeafNode(lv_parameter_4_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2468:3: ( (lv_return_5_0= '@return' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==59) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalJRules.g:2469:4: (lv_return_5_0= '@return' )
                    {
                    // InternalJRules.g:2469:4: (lv_return_5_0= '@return' )
                    // InternalJRules.g:2470:5: lv_return_5_0= '@return'
                    {
                    lv_return_5_0=(Token)match(input,59,FOLLOW_66); 

                    					newLeafNode(lv_return_5_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2482:3: ( (lv_version_6_0= '@version' ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalJRules.g:2483:4: (lv_version_6_0= '@version' )
                    {
                    // InternalJRules.g:2483:4: (lv_version_6_0= '@version' )
                    // InternalJRules.g:2484:5: lv_version_6_0= '@version'
                    {
                    lv_version_6_0=(Token)match(input,60,FOLLOW_67); 

                    					newLeafNode(lv_version_6_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2496:3: ( (lv_throws_7_0= '@throws' ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==61) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalJRules.g:2497:4: (lv_throws_7_0= '@throws' )
                    {
                    // InternalJRules.g:2497:4: (lv_throws_7_0= '@throws' )
                    // InternalJRules.g:2498:5: lv_throws_7_0= '@throws'
                    {
                    lv_throws_7_0=(Token)match(input,61,FOLLOW_68); 

                    					newLeafNode(lv_throws_7_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:2510:3: ( (lv_see_8_0= '@see' ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==62) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalJRules.g:2511:4: (lv_see_8_0= '@see' )
                    {
                    // InternalJRules.g:2511:4: (lv_see_8_0= '@see' )
                    // InternalJRules.g:2512:5: lv_see_8_0= '@see'
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
    // InternalJRules.g:2528:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:2528:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:2529:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:2535:1: ruleContains returns [EObject current=null] : ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) ;
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
            // InternalJRules.g:2541:2: ( ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' ) )
            // InternalJRules.g:2542:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            {
            // InternalJRules.g:2542:2: ( () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}' )
            // InternalJRules.g:2543:3: () ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) ) otherlv_9= '{' ( (lv_rule_10_0= ruleRule ) ) otherlv_11= '}'
            {
            // InternalJRules.g:2543:3: ()
            // InternalJRules.g:2544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContainsAccess().getContainsAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2550:3: ( ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' ) | ( (lv_no_8_0= 'haven\\'t' ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=35 && LA63_0<=38)||LA63_0==63) ) {
                alt63=1;
            }
            else if ( (LA63_0==64) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalJRules.g:2551:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    {
                    // InternalJRules.g:2551:4: ( ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have' )
                    // InternalJRules.g:2552:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )? otherlv_7= 'have'
                    {
                    // InternalJRules.g:2552:5: ( ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' ) | ( (lv_no_3_0= 'don\\'t' ) ) | ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' ) | ( (lv_no_6_0= 'doesn\\'t' ) ) )?
                    int alt62=5;
                    switch ( input.LA(1) ) {
                        case 35:
                            {
                            alt62=1;
                            }
                            break;
                        case 36:
                            {
                            alt62=2;
                            }
                            break;
                        case 37:
                            {
                            alt62=3;
                            }
                            break;
                        case 38:
                            {
                            alt62=4;
                            }
                            break;
                    }

                    switch (alt62) {
                        case 1 :
                            // InternalJRules.g:2553:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            {
                            // InternalJRules.g:2553:6: ( ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not' )
                            // InternalJRules.g:2554:7: ( (lv_no_1_0= 'do' ) ) otherlv_2= 'not'
                            {
                            // InternalJRules.g:2554:7: ( (lv_no_1_0= 'do' ) )
                            // InternalJRules.g:2555:8: (lv_no_1_0= 'do' )
                            {
                            // InternalJRules.g:2555:8: (lv_no_1_0= 'do' )
                            // InternalJRules.g:2556:9: lv_no_1_0= 'do'
                            {
                            lv_no_1_0=(Token)match(input,35,FOLLOW_33); 

                            									newLeafNode(lv_no_1_0, grammarAccess.getContainsAccess().getNoDoKeyword_1_0_0_0_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "do");
                            								

                            }


                            }

                            otherlv_2=(Token)match(input,29,FOLLOW_69); 

                            							newLeafNode(otherlv_2, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_0_1());
                            						

                            }


                            }
                            break;
                        case 2 :
                            // InternalJRules.g:2574:6: ( (lv_no_3_0= 'don\\'t' ) )
                            {
                            // InternalJRules.g:2574:6: ( (lv_no_3_0= 'don\\'t' ) )
                            // InternalJRules.g:2575:7: (lv_no_3_0= 'don\\'t' )
                            {
                            // InternalJRules.g:2575:7: (lv_no_3_0= 'don\\'t' )
                            // InternalJRules.g:2576:8: lv_no_3_0= 'don\\'t'
                            {
                            lv_no_3_0=(Token)match(input,36,FOLLOW_69); 

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
                            // InternalJRules.g:2589:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            {
                            // InternalJRules.g:2589:6: ( ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not' )
                            // InternalJRules.g:2590:7: ( (lv_no_4_0= 'does' ) ) otherlv_5= 'not'
                            {
                            // InternalJRules.g:2590:7: ( (lv_no_4_0= 'does' ) )
                            // InternalJRules.g:2591:8: (lv_no_4_0= 'does' )
                            {
                            // InternalJRules.g:2591:8: (lv_no_4_0= 'does' )
                            // InternalJRules.g:2592:9: lv_no_4_0= 'does'
                            {
                            lv_no_4_0=(Token)match(input,37,FOLLOW_33); 

                            									newLeafNode(lv_no_4_0, grammarAccess.getContainsAccess().getNoDoesKeyword_1_0_0_2_0_0());
                            								

                            									if (current==null) {
                            										current = createModelElement(grammarAccess.getContainsRule());
                            									}
                            									setWithLastConsumed(current, "no", true, "does");
                            								

                            }


                            }

                            otherlv_5=(Token)match(input,29,FOLLOW_69); 

                            							newLeafNode(otherlv_5, grammarAccess.getContainsAccess().getNotKeyword_1_0_0_2_1());
                            						

                            }


                            }
                            break;
                        case 4 :
                            // InternalJRules.g:2610:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            {
                            // InternalJRules.g:2610:6: ( (lv_no_6_0= 'doesn\\'t' ) )
                            // InternalJRules.g:2611:7: (lv_no_6_0= 'doesn\\'t' )
                            {
                            // InternalJRules.g:2611:7: (lv_no_6_0= 'doesn\\'t' )
                            // InternalJRules.g:2612:8: lv_no_6_0= 'doesn\\'t'
                            {
                            lv_no_6_0=(Token)match(input,38,FOLLOW_69); 

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

                    otherlv_7=(Token)match(input,63,FOLLOW_70); 

                    					newLeafNode(otherlv_7, grammarAccess.getContainsAccess().getHaveKeyword_1_0_1());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2631:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    {
                    // InternalJRules.g:2631:4: ( (lv_no_8_0= 'haven\\'t' ) )
                    // InternalJRules.g:2632:5: (lv_no_8_0= 'haven\\'t' )
                    {
                    // InternalJRules.g:2632:5: (lv_no_8_0= 'haven\\'t' )
                    // InternalJRules.g:2633:6: lv_no_8_0= 'haven\\'t'
                    {
                    lv_no_8_0=(Token)match(input,64,FOLLOW_70); 

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
            		
            // InternalJRules.g:2650:3: ( (lv_rule_10_0= ruleRule ) )
            // InternalJRules.g:2651:4: (lv_rule_10_0= ruleRule )
            {
            // InternalJRules.g:2651:4: (lv_rule_10_0= ruleRule )
            // InternalJRules.g:2652:5: lv_rule_10_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getRuleRuleParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_71);
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
    // InternalJRules.g:2677:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:2677:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:2678:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:2684:1: ruleModifiers returns [EObject current=null] : ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) ;
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
            // InternalJRules.g:2690:2: ( ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' ) )
            // InternalJRules.g:2691:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            {
            // InternalJRules.g:2691:2: ( (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']' )
            // InternalJRules.g:2692:3: (otherlv_0= 'is' | otherlv_1= 'are' ) ( (lv_no_2_0= 'not' ) )? otherlv_3= 'modified' otherlv_4= 'with' otherlv_5= '[' ( (lv_blend_6_0= ruleBlendModifiers ) ) (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )* otherlv_9= ']'
            {
            // InternalJRules.g:2692:3: (otherlv_0= 'is' | otherlv_1= 'are' )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==27) ) {
                alt64=1;
            }
            else if ( (LA64_0==28) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalJRules.g:2693:4: otherlv_0= 'is'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_72); 

                    				newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getIsKeyword_0_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:2698:4: otherlv_1= 'are'
                    {
                    otherlv_1=(Token)match(input,28,FOLLOW_72); 

                    				newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getAreKeyword_0_1());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2703:3: ( (lv_no_2_0= 'not' ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==29) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalJRules.g:2704:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:2704:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:2705:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,29,FOLLOW_73); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getModifiersAccess().getNoNotKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModifiersRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,67,FOLLOW_74); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiersAccess().getModifiedKeyword_2());
            		
            otherlv_4=(Token)match(input,68,FOLLOW_45); 

            			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getWithKeyword_3());
            		
            otherlv_5=(Token)match(input,44,FOLLOW_75); 

            			newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalJRules.g:2729:3: ( (lv_blend_6_0= ruleBlendModifiers ) )
            // InternalJRules.g:2730:4: (lv_blend_6_0= ruleBlendModifiers )
            {
            // InternalJRules.g:2730:4: (lv_blend_6_0= ruleBlendModifiers )
            // InternalJRules.g:2731:5: lv_blend_6_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_76);
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

            // InternalJRules.g:2748:3: (otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==23) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalJRules.g:2749:4: otherlv_7= 'or' ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    {
            	    otherlv_7=(Token)match(input,23,FOLLOW_75); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModifiersAccess().getOrKeyword_6_0());
            	    			
            	    // InternalJRules.g:2753:4: ( (lv_blend_8_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:2754:5: (lv_blend_8_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:2754:5: (lv_blend_8_0= ruleBlendModifiers )
            	    // InternalJRules.g:2755:6: lv_blend_8_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_76);
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
            	    break loop66;
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
    // InternalJRules.g:2781:1: entryRuleRangoNames returns [EObject current=null] : iv_ruleRangoNames= ruleRangoNames EOF ;
    public final EObject entryRuleRangoNames() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRangoNames = null;


        try {
            // InternalJRules.g:2781:51: (iv_ruleRangoNames= ruleRangoNames EOF )
            // InternalJRules.g:2782:2: iv_ruleRangoNames= ruleRangoNames EOF
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
    // InternalJRules.g:2788:1: ruleRangoNames returns [EObject current=null] : ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) ;
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
            // InternalJRules.g:2794:2: ( ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? ) )
            // InternalJRules.g:2795:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            {
            // InternalJRules.g:2795:2: ( () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )? )
            // InternalJRules.g:2796:3: () (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )? (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            {
            // InternalJRules.g:2796:3: ()
            // InternalJRules.g:2797:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRangoNamesAccess().getRangoNamesAction_0(),
            					current);
            			

            }

            // InternalJRules.g:2803:3: (otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==44) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalJRules.g:2804:4: otherlv_1= '[' ( (lv_min_2_0= ruleEInt ) ) otherlv_3= '..' ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' ) otherlv_6= ']'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getRangoNamesAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalJRules.g:2808:4: ( (lv_min_2_0= ruleEInt ) )
                    // InternalJRules.g:2809:5: (lv_min_2_0= ruleEInt )
                    {
                    // InternalJRules.g:2809:5: (lv_min_2_0= ruleEInt )
                    // InternalJRules.g:2810:6: lv_min_2_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getMinEIntParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    otherlv_3=(Token)match(input,45,FOLLOW_39); 

                    				newLeafNode(otherlv_3, grammarAccess.getRangoNamesAccess().getFullStopFullStopKeyword_1_2());
                    			
                    // InternalJRules.g:2831:4: ( ( (lv_max_4_0= ruleEInt ) ) | otherlv_5= '*' )
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==RULE_INT||LA67_0==74) ) {
                        alt67=1;
                    }
                    else if ( (LA67_0==14) ) {
                        alt67=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }
                    switch (alt67) {
                        case 1 :
                            // InternalJRules.g:2832:5: ( (lv_max_4_0= ruleEInt ) )
                            {
                            // InternalJRules.g:2832:5: ( (lv_max_4_0= ruleEInt ) )
                            // InternalJRules.g:2833:6: (lv_max_4_0= ruleEInt )
                            {
                            // InternalJRules.g:2833:6: (lv_max_4_0= ruleEInt )
                            // InternalJRules.g:2834:7: lv_max_4_0= ruleEInt
                            {

                            							newCompositeNode(grammarAccess.getRangoNamesAccess().getMaxEIntParserRuleCall_1_3_0_0());
                            						
                            pushFollow(FOLLOW_40);
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
                            // InternalJRules.g:2852:5: otherlv_5= '*'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_40); 

                            					newLeafNode(otherlv_5, grammarAccess.getRangoNamesAccess().getAsteriskKeyword_1_3_1());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,46,FOLLOW_43); 

                    				newLeafNode(otherlv_6, grammarAccess.getRangoNamesAccess().getRightSquareBracketKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalJRules.g:2862:3: (otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==48) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalJRules.g:2863:4: otherlv_7= 'types' otherlv_8= '{' ( (lv_types_9_0= ruleStringProperty ) ) (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,48,FOLLOW_70); 

                    				newLeafNode(otherlv_7, grammarAccess.getRangoNamesAccess().getTypesKeyword_2_0());
                    			
                    otherlv_8=(Token)match(input,65,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getRangoNamesAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalJRules.g:2871:4: ( (lv_types_9_0= ruleStringProperty ) )
                    // InternalJRules.g:2872:5: (lv_types_9_0= ruleStringProperty )
                    {
                    // InternalJRules.g:2872:5: (lv_types_9_0= ruleStringProperty )
                    // InternalJRules.g:2873:6: lv_types_9_0= ruleStringProperty
                    {

                    						newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_77);
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

                    // InternalJRules.g:2890:4: (otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==13) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalJRules.g:2891:5: otherlv_10= ',' ( (lv_types_11_0= ruleStringProperty ) )
                    	    {
                    	    otherlv_10=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getRangoNamesAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalJRules.g:2895:5: ( (lv_types_11_0= ruleStringProperty ) )
                    	    // InternalJRules.g:2896:6: (lv_types_11_0= ruleStringProperty )
                    	    {
                    	    // InternalJRules.g:2896:6: (lv_types_11_0= ruleStringProperty )
                    	    // InternalJRules.g:2897:7: lv_types_11_0= ruleStringProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getRangoNamesAccess().getTypesStringPropertyParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_77);
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
                    	    break loop69;
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
    // InternalJRules.g:2924:1: entryRuleStringProperty returns [EObject current=null] : iv_ruleStringProperty= ruleStringProperty EOF ;
    public final EObject entryRuleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringProperty = null;


        try {
            // InternalJRules.g:2924:55: (iv_ruleStringProperty= ruleStringProperty EOF )
            // InternalJRules.g:2925:2: iv_ruleStringProperty= ruleStringProperty EOF
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
    // InternalJRules.g:2931:1: ruleStringProperty returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) ;
    public final EObject ruleStringProperty() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_StringVariable_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:2937:2: ( (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable ) )
            // InternalJRules.g:2938:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            {
            // InternalJRules.g:2938:2: (this_StringValue_0= ruleStringValue | this_StringVariable_1= ruleStringVariable )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_STRING) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==69) ) {
                    alt71=2;
                }
                else if ( (LA71_1==EOF||LA71_1==13||LA71_1==15||LA71_1==20||(LA71_1>=23 && LA71_1<=24)||LA71_1==26||LA71_1==46||LA71_1==66) ) {
                    alt71=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA71_0==RULE_ID) ) {
                int LA71_2 = input.LA(2);

                if ( (LA71_2==EOF||LA71_2==13||LA71_2==15||LA71_2==20||(LA71_2>=23 && LA71_2<=24)||LA71_2==26||LA71_2==46||LA71_2==66) ) {
                    alt71=1;
                }
                else if ( (LA71_2==69) ) {
                    alt71=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalJRules.g:2939:3: this_StringValue_0= ruleStringValue
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
                    // InternalJRules.g:2948:3: this_StringVariable_1= ruleStringVariable
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
    // InternalJRules.g:2960:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // InternalJRules.g:2960:52: (iv_ruleStringValue= ruleStringValue EOF )
            // InternalJRules.g:2961:2: iv_ruleStringValue= ruleStringValue EOF
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
    // InternalJRules.g:2967:1: ruleStringValue returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:2973:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalJRules.g:2974:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalJRules.g:2974:2: ( (lv_value_0_0= ruleEString ) )
            // InternalJRules.g:2975:3: (lv_value_0_0= ruleEString )
            {
            // InternalJRules.g:2975:3: (lv_value_0_0= ruleEString )
            // InternalJRules.g:2976:4: lv_value_0_0= ruleEString
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
    // InternalJRules.g:2996:1: entryRuleStringVariable returns [EObject current=null] : iv_ruleStringVariable= ruleStringVariable EOF ;
    public final EObject entryRuleStringVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringVariable = null;


        try {
            // InternalJRules.g:2996:55: (iv_ruleStringVariable= ruleStringVariable EOF )
            // InternalJRules.g:2997:2: iv_ruleStringVariable= ruleStringVariable EOF
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
    // InternalJRules.g:3003:1: ruleStringVariable returns [EObject current=null] : ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) ) ;
    public final EObject ruleStringVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_variable_0_0 = null;

        Enumerator lv_strings_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3009:2: ( ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) ) )
            // InternalJRules.g:3010:2: ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) )
            {
            // InternalJRules.g:3010:2: ( ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) ) )
            // InternalJRules.g:3011:3: ( (lv_variable_0_0= ruleVariableSubtype ) ) otherlv_1= '.' ( (lv_strings_2_0= ruleElementString ) )
            {
            // InternalJRules.g:3011:3: ( (lv_variable_0_0= ruleVariableSubtype ) )
            // InternalJRules.g:3012:4: (lv_variable_0_0= ruleVariableSubtype )
            {
            // InternalJRules.g:3012:4: (lv_variable_0_0= ruleVariableSubtype )
            // InternalJRules.g:3013:5: lv_variable_0_0= ruleVariableSubtype
            {

            					newCompositeNode(grammarAccess.getStringVariableAccess().getVariableVariableSubtypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_78);
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

            otherlv_1=(Token)match(input,69,FOLLOW_79); 

            			newLeafNode(otherlv_1, grammarAccess.getStringVariableAccess().getFullStopKeyword_1());
            		
            // InternalJRules.g:3034:3: ( (lv_strings_2_0= ruleElementString ) )
            // InternalJRules.g:3035:4: (lv_strings_2_0= ruleElementString )
            {
            // InternalJRules.g:3035:4: (lv_strings_2_0= ruleElementString )
            // InternalJRules.g:3036:5: lv_strings_2_0= ruleElementString
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
    // InternalJRules.g:3057:1: entryRuleVariableSubtype returns [EObject current=null] : iv_ruleVariableSubtype= ruleVariableSubtype EOF ;
    public final EObject entryRuleVariableSubtype() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableSubtype = null;


        try {
            // InternalJRules.g:3057:56: (iv_ruleVariableSubtype= ruleVariableSubtype EOF )
            // InternalJRules.g:3058:2: iv_ruleVariableSubtype= ruleVariableSubtype EOF
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
    // InternalJRules.g:3064:1: ruleVariableSubtype returns [EObject current=null] : ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? ) ;
    public final EObject ruleVariableSubtype() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_subtype_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3070:2: ( ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? ) )
            // InternalJRules.g:3071:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? )
            {
            // InternalJRules.g:3071:2: ( ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )? )
            // InternalJRules.g:3072:3: ( ( ruleEString ) ) (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            {
            // InternalJRules.g:3072:3: ( ( ruleEString ) )
            // InternalJRules.g:3073:4: ( ruleEString )
            {
            // InternalJRules.g:3073:4: ( ruleEString )
            // InternalJRules.g:3074:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableSubtypeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getVariableSubtypeAccess().getVariableVariableCrossReference_0_0());
            				
            pushFollow(FOLLOW_80);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:3088:3: (otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==69) ) {
                int LA72_1 = input.LA(2);

                if ( ((LA72_1>=80 && LA72_1<=86)) ) {
                    alt72=1;
                }
            }
            switch (alt72) {
                case 1 :
                    // InternalJRules.g:3089:4: otherlv_1= '.' ( (lv_subtype_2_0= ruleElement ) )
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableSubtypeAccess().getFullStopKeyword_1_0());
                    			
                    // InternalJRules.g:3093:4: ( (lv_subtype_2_0= ruleElement ) )
                    // InternalJRules.g:3094:5: (lv_subtype_2_0= ruleElement )
                    {
                    // InternalJRules.g:3094:5: (lv_subtype_2_0= ruleElement )
                    // InternalJRules.g:3095:6: lv_subtype_2_0= ruleElement
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
    // InternalJRules.g:3117:1: entryRuleTypeProperty returns [EObject current=null] : iv_ruleTypeProperty= ruleTypeProperty EOF ;
    public final EObject entryRuleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeProperty = null;


        try {
            // InternalJRules.g:3117:53: (iv_ruleTypeProperty= ruleTypeProperty EOF )
            // InternalJRules.g:3118:2: iv_ruleTypeProperty= ruleTypeProperty EOF
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
    // InternalJRules.g:3124:1: ruleTypeProperty returns [EObject current=null] : (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) ;
    public final EObject ruleTypeProperty() throws RecognitionException {
        EObject current = null;

        EObject this_TypeString_0 = null;

        EObject this_isPrimitiveFunction_1 = null;

        EObject this_IsCollectionType_2 = null;



        	enterRule();

        try {
            // InternalJRules.g:3130:2: ( (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType ) )
            // InternalJRules.g:3131:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            {
            // InternalJRules.g:3131:2: (this_TypeString_0= ruleTypeString | this_isPrimitiveFunction_1= ruleisPrimitiveFunction | this_IsCollectionType_2= ruleIsCollectionType )
            int alt73=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_ID:
            case 70:
                {
                alt73=1;
                }
                break;
            case 71:
                {
                alt73=2;
                }
                break;
            case 73:
                {
                alt73=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalJRules.g:3132:3: this_TypeString_0= ruleTypeString
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
                    // InternalJRules.g:3141:3: this_isPrimitiveFunction_1= ruleisPrimitiveFunction
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
                    // InternalJRules.g:3150:3: this_IsCollectionType_2= ruleIsCollectionType
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
    // InternalJRules.g:3162:1: entryRuleTypeString returns [EObject current=null] : iv_ruleTypeString= ruleTypeString EOF ;
    public final EObject entryRuleTypeString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeString = null;


        try {
            // InternalJRules.g:3162:51: (iv_ruleTypeString= ruleTypeString EOF )
            // InternalJRules.g:3163:2: iv_ruleTypeString= ruleTypeString EOF
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
    // InternalJRules.g:3169:1: ruleTypeString returns [EObject current=null] : ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) ;
    public final EObject ruleTypeString() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_typePrimitive_1_0 = null;

        EObject lv_typeStrng_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3175:2: ( ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) ) )
            // InternalJRules.g:3176:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            {
            // InternalJRules.g:3176:2: ( (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) ) | ( (lv_typeStrng_2_0= ruleStringProperty ) ) )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==70) ) {
                alt74=1;
            }
            else if ( ((LA74_0>=RULE_STRING && LA74_0<=RULE_ID)) ) {
                alt74=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }
            switch (alt74) {
                case 1 :
                    // InternalJRules.g:3177:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    {
                    // InternalJRules.g:3177:3: (otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) ) )
                    // InternalJRules.g:3178:4: otherlv_0= 'Primitive.' ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    {
                    otherlv_0=(Token)match(input,70,FOLLOW_81); 

                    				newLeafNode(otherlv_0, grammarAccess.getTypeStringAccess().getPrimitiveKeyword_0_0());
                    			
                    // InternalJRules.g:3182:4: ( (lv_typePrimitive_1_0= rulePrimitive ) )
                    // InternalJRules.g:3183:5: (lv_typePrimitive_1_0= rulePrimitive )
                    {
                    // InternalJRules.g:3183:5: (lv_typePrimitive_1_0= rulePrimitive )
                    // InternalJRules.g:3184:6: lv_typePrimitive_1_0= rulePrimitive
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
                    // InternalJRules.g:3203:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    {
                    // InternalJRules.g:3203:3: ( (lv_typeStrng_2_0= ruleStringProperty ) )
                    // InternalJRules.g:3204:4: (lv_typeStrng_2_0= ruleStringProperty )
                    {
                    // InternalJRules.g:3204:4: (lv_typeStrng_2_0= ruleStringProperty )
                    // InternalJRules.g:3205:5: lv_typeStrng_2_0= ruleStringProperty
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
    // InternalJRules.g:3226:1: entryRuleisPrimitiveFunction returns [EObject current=null] : iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF ;
    public final EObject entryRuleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisPrimitiveFunction = null;


        try {
            // InternalJRules.g:3226:60: (iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF )
            // InternalJRules.g:3227:2: iv_ruleisPrimitiveFunction= ruleisPrimitiveFunction EOF
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
    // InternalJRules.g:3233:1: ruleisPrimitiveFunction returns [EObject current=null] : ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) ;
    public final EObject ruleisPrimitiveFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:3239:2: ( ( () otherlv_1= 'isPrimitive' otherlv_2= '()' ) )
            // InternalJRules.g:3240:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            {
            // InternalJRules.g:3240:2: ( () otherlv_1= 'isPrimitive' otherlv_2= '()' )
            // InternalJRules.g:3241:3: () otherlv_1= 'isPrimitive' otherlv_2= '()'
            {
            // InternalJRules.g:3241:3: ()
            // InternalJRules.g:3242:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsPrimitiveFunctionAccess().getIsPrimitiveFuntionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_82); 

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
    // InternalJRules.g:3260:1: entryRuleIsCollectionType returns [EObject current=null] : iv_ruleIsCollectionType= ruleIsCollectionType EOF ;
    public final EObject entryRuleIsCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsCollectionType = null;


        try {
            // InternalJRules.g:3260:57: (iv_ruleIsCollectionType= ruleIsCollectionType EOF )
            // InternalJRules.g:3261:2: iv_ruleIsCollectionType= ruleIsCollectionType EOF
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
    // InternalJRules.g:3267:1: ruleIsCollectionType returns [EObject current=null] : ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) ;
    public final EObject ruleIsCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_of_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:3273:2: ( ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) ) )
            // InternalJRules.g:3274:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            {
            // InternalJRules.g:3274:2: ( () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) ) )
            // InternalJRules.g:3275:3: () otherlv_1= 'isCollection' (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            {
            // InternalJRules.g:3275:3: ()
            // InternalJRules.g:3276:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsCollectionTypeAccess().getIsCollectionTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_83); 

            			newLeafNode(otherlv_1, grammarAccess.getIsCollectionTypeAccess().getIsCollectionKeyword_1());
            		
            // InternalJRules.g:3286:3: (otherlv_2= '()' | (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' ) )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==72) ) {
                alt75=1;
            }
            else if ( (LA75_0==25) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalJRules.g:3287:4: otherlv_2= '()'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisRightParenthesisKeyword_2_0());
                    			

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3292:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    {
                    // InternalJRules.g:3292:4: (otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')' )
                    // InternalJRules.g:3293:5: otherlv_3= '(' ( (lv_of_4_0= ruleTypeProperty ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,25,FOLLOW_46); 

                    					newLeafNode(otherlv_3, grammarAccess.getIsCollectionTypeAccess().getLeftParenthesisKeyword_2_1_0());
                    				
                    // InternalJRules.g:3297:5: ( (lv_of_4_0= ruleTypeProperty ) )
                    // InternalJRules.g:3298:6: (lv_of_4_0= ruleTypeProperty )
                    {
                    // InternalJRules.g:3298:6: (lv_of_4_0= ruleTypeProperty )
                    // InternalJRules.g:3299:7: lv_of_4_0= ruleTypeProperty
                    {

                    							newCompositeNode(grammarAccess.getIsCollectionTypeAccess().getOfTypePropertyParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_22);
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
    // InternalJRules.g:3326:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:3326:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:3327:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:3333:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3339:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:3340:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:3340:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:3341:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:3341:3: (kw= '-' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==74) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalJRules.g:3342:4: kw= '-'
                    {
                    kw=(Token)match(input,74,FOLLOW_84); 

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
    // InternalJRules.g:3359:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:3359:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:3360:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:3366:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:3372:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) )
            // InternalJRules.g:3373:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:3373:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            int alt92=6;
            switch ( input.LA(1) ) {
            case 107:
            case 108:
            case 109:
                {
                alt92=1;
                }
                break;
            case 75:
                {
                alt92=2;
                }
                break;
            case 76:
                {
                alt92=3;
                }
                break;
            case 77:
                {
                alt92=4;
                }
                break;
            case 78:
                {
                alt92=5;
                }
                break;
            case 79:
                {
                alt92=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalJRules.g:3374:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3374:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3375:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3375:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:3376:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:3376:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:3377:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_21);
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

                    // InternalJRules.g:3394:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==24) ) {
                        int LA77_1 = input.LA(2);

                        if ( (LA77_1==75) ) {
                            alt77=1;
                        }
                    }
                    switch (alt77) {
                        case 1 :
                            // InternalJRules.g:3395:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,24,FOLLOW_85); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:3399:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:3400:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:3400:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:3401:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,75,FOLLOW_21); 

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

                    // InternalJRules.g:3414:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==24) ) {
                        int LA78_1 = input.LA(2);

                        if ( (LA78_1==76) ) {
                            alt78=1;
                        }
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalJRules.g:3415:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_86); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:3419:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:3420:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:3420:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:3421:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,76,FOLLOW_21); 

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

                    // InternalJRules.g:3434:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==24) ) {
                        int LA79_1 = input.LA(2);

                        if ( (LA79_1==77) ) {
                            alt79=1;
                        }
                    }
                    switch (alt79) {
                        case 1 :
                            // InternalJRules.g:3435:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_87); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:3439:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:3440:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:3440:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:3441:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,77,FOLLOW_21); 

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

                    // InternalJRules.g:3454:4: (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==24) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==78) ) {
                            alt80=1;
                        }
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalJRules.g:3455:5: otherlv_7= 'and' ( (lv_default_8_0= 'default' ) )
                            {
                            otherlv_7=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:3459:5: ( (lv_default_8_0= 'default' ) )
                            // InternalJRules.g:3460:6: (lv_default_8_0= 'default' )
                            {
                            // InternalJRules.g:3460:6: (lv_default_8_0= 'default' )
                            // InternalJRules.g:3461:7: lv_default_8_0= 'default'
                            {
                            lv_default_8_0=(Token)match(input,78,FOLLOW_21); 

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

                    // InternalJRules.g:3474:4: (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==24) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalJRules.g:3475:5: otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) )
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_9, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_5_0());
                            				
                            // InternalJRules.g:3479:5: ( (lv_synchronized_10_0= 'synchronized' ) )
                            // InternalJRules.g:3480:6: (lv_synchronized_10_0= 'synchronized' )
                            {
                            // InternalJRules.g:3480:6: (lv_synchronized_10_0= 'synchronized' )
                            // InternalJRules.g:3481:7: lv_synchronized_10_0= 'synchronized'
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
                    // InternalJRules.g:3496:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3496:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3497:4: ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3497:4: ( (lv_static_11_0= 'static' ) )
                    // InternalJRules.g:3498:5: (lv_static_11_0= 'static' )
                    {
                    // InternalJRules.g:3498:5: (lv_static_11_0= 'static' )
                    // InternalJRules.g:3499:6: lv_static_11_0= 'static'
                    {
                    lv_static_11_0=(Token)match(input,75,FOLLOW_21); 

                    						newLeafNode(lv_static_11_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:3511:4: (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )?
                    int alt82=2;
                    int LA82_0 = input.LA(1);

                    if ( (LA82_0==24) ) {
                        int LA82_1 = input.LA(2);

                        if ( (LA82_1==76) ) {
                            alt82=1;
                        }
                    }
                    switch (alt82) {
                        case 1 :
                            // InternalJRules.g:3512:5: otherlv_12= 'and' ( (lv_final_13_0= 'final' ) )
                            {
                            otherlv_12=(Token)match(input,24,FOLLOW_86); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:3516:5: ( (lv_final_13_0= 'final' ) )
                            // InternalJRules.g:3517:6: (lv_final_13_0= 'final' )
                            {
                            // InternalJRules.g:3517:6: (lv_final_13_0= 'final' )
                            // InternalJRules.g:3518:7: lv_final_13_0= 'final'
                            {
                            lv_final_13_0=(Token)match(input,76,FOLLOW_21); 

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

                    // InternalJRules.g:3531:4: (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==24) ) {
                        int LA83_1 = input.LA(2);

                        if ( (LA83_1==77) ) {
                            alt83=1;
                        }
                    }
                    switch (alt83) {
                        case 1 :
                            // InternalJRules.g:3532:5: otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) )
                            {
                            otherlv_14=(Token)match(input,24,FOLLOW_87); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:3536:5: ( (lv_abstract_15_0= 'abstract' ) )
                            // InternalJRules.g:3537:6: (lv_abstract_15_0= 'abstract' )
                            {
                            // InternalJRules.g:3537:6: (lv_abstract_15_0= 'abstract' )
                            // InternalJRules.g:3538:7: lv_abstract_15_0= 'abstract'
                            {
                            lv_abstract_15_0=(Token)match(input,77,FOLLOW_21); 

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

                    // InternalJRules.g:3551:4: (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==24) ) {
                        int LA84_1 = input.LA(2);

                        if ( (LA84_1==78) ) {
                            alt84=1;
                        }
                    }
                    switch (alt84) {
                        case 1 :
                            // InternalJRules.g:3552:5: otherlv_16= 'and' ( (lv_default_17_0= 'default' ) )
                            {
                            otherlv_16=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_16, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:3556:5: ( (lv_default_17_0= 'default' ) )
                            // InternalJRules.g:3557:6: (lv_default_17_0= 'default' )
                            {
                            // InternalJRules.g:3557:6: (lv_default_17_0= 'default' )
                            // InternalJRules.g:3558:7: lv_default_17_0= 'default'
                            {
                            lv_default_17_0=(Token)match(input,78,FOLLOW_21); 

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

                    // InternalJRules.g:3571:4: (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==24) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // InternalJRules.g:3572:5: otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) )
                            {
                            otherlv_18=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_18, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_4_0());
                            				
                            // InternalJRules.g:3576:5: ( (lv_synchronized_19_0= 'synchronized' ) )
                            // InternalJRules.g:3577:6: (lv_synchronized_19_0= 'synchronized' )
                            {
                            // InternalJRules.g:3577:6: (lv_synchronized_19_0= 'synchronized' )
                            // InternalJRules.g:3578:7: lv_synchronized_19_0= 'synchronized'
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
                    // InternalJRules.g:3593:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3593:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3594:4: ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3594:4: ( (lv_final_20_0= 'final' ) )
                    // InternalJRules.g:3595:5: (lv_final_20_0= 'final' )
                    {
                    // InternalJRules.g:3595:5: (lv_final_20_0= 'final' )
                    // InternalJRules.g:3596:6: lv_final_20_0= 'final'
                    {
                    lv_final_20_0=(Token)match(input,76,FOLLOW_21); 

                    						newLeafNode(lv_final_20_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:3608:4: (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==24) ) {
                        int LA86_1 = input.LA(2);

                        if ( (LA86_1==77) ) {
                            alt86=1;
                        }
                    }
                    switch (alt86) {
                        case 1 :
                            // InternalJRules.g:3609:5: otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) )
                            {
                            otherlv_21=(Token)match(input,24,FOLLOW_87); 

                            					newLeafNode(otherlv_21, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:3613:5: ( (lv_abstract_22_0= 'abstract' ) )
                            // InternalJRules.g:3614:6: (lv_abstract_22_0= 'abstract' )
                            {
                            // InternalJRules.g:3614:6: (lv_abstract_22_0= 'abstract' )
                            // InternalJRules.g:3615:7: lv_abstract_22_0= 'abstract'
                            {
                            lv_abstract_22_0=(Token)match(input,77,FOLLOW_21); 

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

                    // InternalJRules.g:3628:4: (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==24) ) {
                        int LA87_1 = input.LA(2);

                        if ( (LA87_1==78) ) {
                            alt87=1;
                        }
                    }
                    switch (alt87) {
                        case 1 :
                            // InternalJRules.g:3629:5: otherlv_23= 'and' ( (lv_default_24_0= 'default' ) )
                            {
                            otherlv_23=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_23, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:3633:5: ( (lv_default_24_0= 'default' ) )
                            // InternalJRules.g:3634:6: (lv_default_24_0= 'default' )
                            {
                            // InternalJRules.g:3634:6: (lv_default_24_0= 'default' )
                            // InternalJRules.g:3635:7: lv_default_24_0= 'default'
                            {
                            lv_default_24_0=(Token)match(input,78,FOLLOW_21); 

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

                    // InternalJRules.g:3648:4: (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==24) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // InternalJRules.g:3649:5: otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) )
                            {
                            otherlv_25=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_25, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_3_0());
                            				
                            // InternalJRules.g:3653:5: ( (lv_synchronized_26_0= 'synchronized' ) )
                            // InternalJRules.g:3654:6: (lv_synchronized_26_0= 'synchronized' )
                            {
                            // InternalJRules.g:3654:6: (lv_synchronized_26_0= 'synchronized' )
                            // InternalJRules.g:3655:7: lv_synchronized_26_0= 'synchronized'
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
                    // InternalJRules.g:3670:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3670:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3671:4: ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3671:4: ( (lv_abstract_27_0= 'abstract' ) )
                    // InternalJRules.g:3672:5: (lv_abstract_27_0= 'abstract' )
                    {
                    // InternalJRules.g:3672:5: (lv_abstract_27_0= 'abstract' )
                    // InternalJRules.g:3673:6: lv_abstract_27_0= 'abstract'
                    {
                    lv_abstract_27_0=(Token)match(input,77,FOLLOW_21); 

                    						newLeafNode(lv_abstract_27_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:3685:4: (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )?
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
                            // InternalJRules.g:3686:5: otherlv_28= 'and' ( (lv_default_29_0= 'default' ) )
                            {
                            otherlv_28=(Token)match(input,24,FOLLOW_88); 

                            					newLeafNode(otherlv_28, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:3690:5: ( (lv_default_29_0= 'default' ) )
                            // InternalJRules.g:3691:6: (lv_default_29_0= 'default' )
                            {
                            // InternalJRules.g:3691:6: (lv_default_29_0= 'default' )
                            // InternalJRules.g:3692:7: lv_default_29_0= 'default'
                            {
                            lv_default_29_0=(Token)match(input,78,FOLLOW_21); 

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

                    // InternalJRules.g:3705:4: (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    int alt90=2;
                    int LA90_0 = input.LA(1);

                    if ( (LA90_0==24) ) {
                        alt90=1;
                    }
                    switch (alt90) {
                        case 1 :
                            // InternalJRules.g:3706:5: otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) )
                            {
                            otherlv_30=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_30, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_2_0());
                            				
                            // InternalJRules.g:3710:5: ( (lv_synchronized_31_0= 'synchronized' ) )
                            // InternalJRules.g:3711:6: (lv_synchronized_31_0= 'synchronized' )
                            {
                            // InternalJRules.g:3711:6: (lv_synchronized_31_0= 'synchronized' )
                            // InternalJRules.g:3712:7: lv_synchronized_31_0= 'synchronized'
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
                    // InternalJRules.g:3727:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:3727:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:3728:4: ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:3728:4: ( (lv_default_32_0= 'default' ) )
                    // InternalJRules.g:3729:5: (lv_default_32_0= 'default' )
                    {
                    // InternalJRules.g:3729:5: (lv_default_32_0= 'default' )
                    // InternalJRules.g:3730:6: lv_default_32_0= 'default'
                    {
                    lv_default_32_0=(Token)match(input,78,FOLLOW_21); 

                    						newLeafNode(lv_default_32_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

                    }


                    }

                    // InternalJRules.g:3742:4: (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==24) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // InternalJRules.g:3743:5: otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) )
                            {
                            otherlv_33=(Token)match(input,24,FOLLOW_89); 

                            					newLeafNode(otherlv_33, grammarAccess.getBlendModifiersAccess().getAndKeyword_4_1_0());
                            				
                            // InternalJRules.g:3747:5: ( (lv_synchronized_34_0= 'synchronized' ) )
                            // InternalJRules.g:3748:6: (lv_synchronized_34_0= 'synchronized' )
                            {
                            // InternalJRules.g:3748:6: (lv_synchronized_34_0= 'synchronized' )
                            // InternalJRules.g:3749:7: lv_synchronized_34_0= 'synchronized'
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
                    // InternalJRules.g:3764:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:3764:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    // InternalJRules.g:3765:4: (lv_synchronized_35_0= 'synchronized' )
                    {
                    // InternalJRules.g:3765:4: (lv_synchronized_35_0= 'synchronized' )
                    // InternalJRules.g:3766:5: lv_synchronized_35_0= 'synchronized'
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
    // InternalJRules.g:3782:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:3782:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:3783:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:3789:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:3795:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:3796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:3796:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==RULE_STRING) ) {
                alt93=1;
            }
            else if ( (LA93_0==RULE_ID) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // InternalJRules.g:3797:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:3805:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:3816:1: ruleElement returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) ;
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
            // InternalJRules.g:3822:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) ) )
            // InternalJRules.g:3823:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            {
            // InternalJRules.g:3823:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) | (enumLiteral_6= 'File' ) )
            int alt94=7;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt94=1;
                }
                break;
            case 81:
                {
                alt94=2;
                }
                break;
            case 82:
                {
                alt94=3;
                }
                break;
            case 83:
                {
                alt94=4;
                }
                break;
            case 84:
                {
                alt94=5;
                }
                break;
            case 85:
                {
                alt94=6;
                }
                break;
            case 86:
                {
                alt94=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }

            switch (alt94) {
                case 1 :
                    // InternalJRules.g:3824:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:3824:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:3825:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3832:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:3832:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:3833:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3840:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:3840:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:3841:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3848:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:3848:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:3849:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3856:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:3856:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:3857:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3864:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:3864:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:3865:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getElementAccess().getAttributeEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3872:3: (enumLiteral_6= 'File' )
                    {
                    // InternalJRules.g:3872:3: (enumLiteral_6= 'File' )
                    // InternalJRules.g:3873:4: enumLiteral_6= 'File'
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
    // InternalJRules.g:3883:1: rulePrimitive returns [Enumerator current=null] : ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) ;
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
            // InternalJRules.g:3889:2: ( ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) ) )
            // InternalJRules.g:3890:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            {
            // InternalJRules.g:3890:2: ( (enumLiteral_0= 'boolean' ) | (enumLiteral_1= 'byte' ) | (enumLiteral_2= 'char' ) | (enumLiteral_3= 'double' ) | (enumLiteral_4= 'float' ) | (enumLiteral_5= 'int' ) | (enumLiteral_6= 'long' ) | (enumLiteral_7= 'short' ) | (enumLiteral_8= 'String' ) )
            int alt95=9;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt95=1;
                }
                break;
            case 88:
                {
                alt95=2;
                }
                break;
            case 89:
                {
                alt95=3;
                }
                break;
            case 90:
                {
                alt95=4;
                }
                break;
            case 91:
                {
                alt95=5;
                }
                break;
            case 92:
                {
                alt95=6;
                }
                break;
            case 93:
                {
                alt95=7;
                }
                break;
            case 94:
                {
                alt95=8;
                }
                break;
            case 95:
                {
                alt95=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalJRules.g:3891:3: (enumLiteral_0= 'boolean' )
                    {
                    // InternalJRules.g:3891:3: (enumLiteral_0= 'boolean' )
                    // InternalJRules.g:3892:4: enumLiteral_0= 'boolean'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPrimitiveAccess().getBOOLEANEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3899:3: (enumLiteral_1= 'byte' )
                    {
                    // InternalJRules.g:3899:3: (enumLiteral_1= 'byte' )
                    // InternalJRules.g:3900:4: enumLiteral_1= 'byte'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPrimitiveAccess().getBYTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3907:3: (enumLiteral_2= 'char' )
                    {
                    // InternalJRules.g:3907:3: (enumLiteral_2= 'char' )
                    // InternalJRules.g:3908:4: enumLiteral_2= 'char'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPrimitiveAccess().getCHAREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3915:3: (enumLiteral_3= 'double' )
                    {
                    // InternalJRules.g:3915:3: (enumLiteral_3= 'double' )
                    // InternalJRules.g:3916:4: enumLiteral_3= 'double'
                    {
                    enumLiteral_3=(Token)match(input,90,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getPrimitiveAccess().getDOUBLEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:3923:3: (enumLiteral_4= 'float' )
                    {
                    // InternalJRules.g:3923:3: (enumLiteral_4= 'float' )
                    // InternalJRules.g:3924:4: enumLiteral_4= 'float'
                    {
                    enumLiteral_4=(Token)match(input,91,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getPrimitiveAccess().getFLOATEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:3931:3: (enumLiteral_5= 'int' )
                    {
                    // InternalJRules.g:3931:3: (enumLiteral_5= 'int' )
                    // InternalJRules.g:3932:4: enumLiteral_5= 'int'
                    {
                    enumLiteral_5=(Token)match(input,92,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getPrimitiveAccess().getINTEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalJRules.g:3939:3: (enumLiteral_6= 'long' )
                    {
                    // InternalJRules.g:3939:3: (enumLiteral_6= 'long' )
                    // InternalJRules.g:3940:4: enumLiteral_6= 'long'
                    {
                    enumLiteral_6=(Token)match(input,93,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getPrimitiveAccess().getLONGEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalJRules.g:3947:3: (enumLiteral_7= 'short' )
                    {
                    // InternalJRules.g:3947:3: (enumLiteral_7= 'short' )
                    // InternalJRules.g:3948:4: enumLiteral_7= 'short'
                    {
                    enumLiteral_7=(Token)match(input,94,FOLLOW_2); 

                    				current = grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getPrimitiveAccess().getSHORTEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;
                case 9 :
                    // InternalJRules.g:3955:3: (enumLiteral_8= 'String' )
                    {
                    // InternalJRules.g:3955:3: (enumLiteral_8= 'String' )
                    // InternalJRules.g:3956:4: enumLiteral_8= 'String'
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
    // InternalJRules.g:3966:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:3972:2: ( ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) ) )
            // InternalJRules.g:3973:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            {
            // InternalJRules.g:3973:2: ( (enumLiteral_0= 'start ' ) | (enumLiteral_1= 'end' ) | (enumLiteral_2= 'contain' ) | (enumLiteral_3= 'like' ) )
            int alt96=4;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt96=1;
                }
                break;
            case 97:
                {
                alt96=2;
                }
                break;
            case 98:
                {
                alt96=3;
                }
                break;
            case 99:
                {
                alt96=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalJRules.g:3974:3: (enumLiteral_0= 'start ' )
                    {
                    // InternalJRules.g:3974:3: (enumLiteral_0= 'start ' )
                    // InternalJRules.g:3975:4: enumLiteral_0= 'start '
                    {
                    enumLiteral_0=(Token)match(input,96,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:3982:3: (enumLiteral_1= 'end' )
                    {
                    // InternalJRules.g:3982:3: (enumLiteral_1= 'end' )
                    // InternalJRules.g:3983:4: enumLiteral_1= 'end'
                    {
                    enumLiteral_1=(Token)match(input,97,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:3990:3: (enumLiteral_2= 'contain' )
                    {
                    // InternalJRules.g:3990:3: (enumLiteral_2= 'contain' )
                    // InternalJRules.g:3991:4: enumLiteral_2= 'contain'
                    {
                    enumLiteral_2=(Token)match(input,98,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:3998:3: (enumLiteral_3= 'like' )
                    {
                    // InternalJRules.g:3998:3: (enumLiteral_3= 'like' )
                    // InternalJRules.g:3999:4: enumLiteral_3= 'like'
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
    // InternalJRules.g:4009:1: ruleElementString returns [Enumerator current=null] : ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) ;
    public final Enumerator ruleElementString() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4015:2: ( ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) ) )
            // InternalJRules.g:4016:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            {
            // InternalJRules.g:4016:2: ( (enumLiteral_0= 'name' ) | (enumLiteral_1= 'type' ) )
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==55) ) {
                alt97=1;
            }
            else if ( (LA97_0==51) ) {
                alt97=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }
            switch (alt97) {
                case 1 :
                    // InternalJRules.g:4017:3: (enumLiteral_0= 'name' )
                    {
                    // InternalJRules.g:4017:3: (enumLiteral_0= 'name' )
                    // InternalJRules.g:4018:4: enumLiteral_0= 'name'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementStringAccess().getNameEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4025:3: (enumLiteral_1= 'type' )
                    {
                    // InternalJRules.g:4025:3: (enumLiteral_1= 'type' )
                    // InternalJRules.g:4026:4: enumLiteral_1= 'type'
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
    // InternalJRules.g:4036:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:4042:2: ( ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) ) )
            // InternalJRules.g:4043:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            {
            // InternalJRules.g:4043:2: ( (enumLiteral_0= 'Spanish' ) | (enumLiteral_1= 'English' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==100) ) {
                alt98=1;
            }
            else if ( (LA98_0==101) ) {
                alt98=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalJRules.g:4044:3: (enumLiteral_0= 'Spanish' )
                    {
                    // InternalJRules.g:4044:3: (enumLiteral_0= 'Spanish' )
                    // InternalJRules.g:4045:4: enumLiteral_0= 'Spanish'
                    {
                    enumLiteral_0=(Token)match(input,100,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4052:3: (enumLiteral_1= 'English' )
                    {
                    // InternalJRules.g:4052:3: (enumLiteral_1= 'English' )
                    // InternalJRules.g:4053:4: enumLiteral_1= 'English'
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
    // InternalJRules.g:4063:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:4069:2: ( ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) ) )
            // InternalJRules.g:4070:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            {
            // InternalJRules.g:4070:2: ( (enumLiteral_0= 'upper case' ) | (enumLiteral_1= 'lower case' ) | (enumLiteral_2= 'upper camel case' ) | (enumLiteral_3= 'lower camel case' ) | (enumLiteral_4= 'start upper case' ) )
            int alt99=5;
            switch ( input.LA(1) ) {
            case 102:
                {
                alt99=1;
                }
                break;
            case 103:
                {
                alt99=2;
                }
                break;
            case 104:
                {
                alt99=3;
                }
                break;
            case 105:
                {
                alt99=4;
                }
                break;
            case 106:
                {
                alt99=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalJRules.g:4071:3: (enumLiteral_0= 'upper case' )
                    {
                    // InternalJRules.g:4071:3: (enumLiteral_0= 'upper case' )
                    // InternalJRules.g:4072:4: enumLiteral_0= 'upper case'
                    {
                    enumLiteral_0=(Token)match(input,102,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4079:3: (enumLiteral_1= 'lower case' )
                    {
                    // InternalJRules.g:4079:3: (enumLiteral_1= 'lower case' )
                    // InternalJRules.g:4080:4: enumLiteral_1= 'lower case'
                    {
                    enumLiteral_1=(Token)match(input,103,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4087:3: (enumLiteral_2= 'upper camel case' )
                    {
                    // InternalJRules.g:4087:3: (enumLiteral_2= 'upper camel case' )
                    // InternalJRules.g:4088:4: enumLiteral_2= 'upper camel case'
                    {
                    enumLiteral_2=(Token)match(input,104,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:4095:3: (enumLiteral_3= 'lower camel case' )
                    {
                    // InternalJRules.g:4095:3: (enumLiteral_3= 'lower camel case' )
                    // InternalJRules.g:4096:4: enumLiteral_3= 'lower camel case'
                    {
                    enumLiteral_3=(Token)match(input,105,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:4103:3: (enumLiteral_4= 'start upper case' )
                    {
                    // InternalJRules.g:4103:3: (enumLiteral_4= 'start upper case' )
                    // InternalJRules.g:4104:4: enumLiteral_4= 'start upper case'
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
    // InternalJRules.g:4114:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4120:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalJRules.g:4121:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalJRules.g:4121:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt100=3;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt100=1;
                }
                break;
            case 108:
                {
                alt100=2;
                }
                break;
            case 109:
                {
                alt100=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalJRules.g:4122:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJRules.g:4122:3: (enumLiteral_0= 'public' )
                    // InternalJRules.g:4123:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,107,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4130:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalJRules.g:4130:3: (enumLiteral_1= 'protected' )
                    // InternalJRules.g:4131:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,108,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4138:3: (enumLiteral_2= 'private' )
                    {
                    // InternalJRules.g:4138:3: (enumLiteral_2= 'private' )
                    // InternalJRules.g:4139:4: enumLiteral_2= 'private'
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
    // InternalJRules.g:4149:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:4155:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:4156:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:4156:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt101=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt101=1;
                }
                break;
            case 111:
                {
                alt101=2;
                }
                break;
            case 112:
                {
                alt101=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // InternalJRules.g:4157:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:4157:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:4158:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,110,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:4165:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:4165:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:4166:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,111,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:4173:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:4173:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:4174:4: enumLiteral_2= 'all'
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


    protected DFA20 dfa20 = new DFA20(this);
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

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "836:2: (this_isImplemented_0= ruleisImplemented | this_IsSuperInterface_1= ruleIsSuperInterface | this_IsSuperClass_2= ruleIsSuperClass | this_IsSubClass_3= ruleIsSubClass | this_Implements_4= ruleImplements | this_Extends_5= ruleExtends | this_Tamanio_6= ruleTamanio | this_Parameter_7= ruleParameter | this_Constructor_8= ruleConstructor | this_Return_9= ruleReturn | this_AttributeType_10= ruleAttributeType | this_Initialize_11= ruleInitialize | this_Empty_12= ruleEmpty | this_IsGeneric_13= ruleIsGeneric | this_NameOperation_14= ruleNameOperation | this_NameType_15= ruleNameType | this_Contains_16= ruleContains | this_JavaDoc_17= ruleJavaDoc | this_Modifiers_18= ruleModifiers )";
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
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000560002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000540002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000502002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001100000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000220000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004010L,0x0000000000000400L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001120000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000060L,0x00000000000002C0L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000002000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000020000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0020000020000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0040000020000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000C2000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000002000000000L,0x0000000F00000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000003000000000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x000007C000000000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x7E00000000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x7C00000000000002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x7800000000000002L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x7000000000000002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x000038000000F800L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000002000L,0x0000000000000004L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0088000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x00000000FF800000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});

}