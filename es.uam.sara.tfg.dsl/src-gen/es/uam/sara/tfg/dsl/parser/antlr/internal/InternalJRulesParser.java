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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "';'", "'no'", "'which'", "'satisfy'", "'or'", "'('", "'and'", "')'", "'is'", "'implemented'", "'inheritor'", "'implements'", "'min='", "'max='", "'interfaces'", "'extended'", "'numParameters='", "'types='", "'['", "','", "']'", "'constructor'", "'return'", "'type='", "'initialize'", "'not'", "'empty'", "'name'", "'in'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'{'", "'}'", "'modifiers:'", "'-'", "'static'", "'final'", "'abstract'", "'synchronized'", "'one'", "'exists'", "'all'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'equal'", "'ends'", "'start'", "'contains'", "'English'", "'Spanish'", "'Default'", "'Public'", "'Protected'", "'Private'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    // InternalJRules.g:72:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) otherlv_3= ';' ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_ProjectName_1_0 = null;

        EObject lv_rules_2_0 = null;

        EObject lv_rules_4_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:78:2: ( (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) otherlv_3= ';' ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )* ) )
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) otherlv_3= ';' ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )* )
            {
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) otherlv_3= ';' ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )* )
            // InternalJRules.g:80:3: otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) otherlv_3= ';' ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getProjectNameKeyword_0());
            		
            // InternalJRules.g:84:3: ( (lv_ProjectName_1_0= ruleEString ) )
            // InternalJRules.g:85:4: (lv_ProjectName_1_0= ruleEString )
            {
            // InternalJRules.g:85:4: (lv_ProjectName_1_0= ruleEString )
            // InternalJRules.g:86:5: lv_ProjectName_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_ProjectName_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					set(
            						current,
            						"ProjectName",
            						lv_ProjectName_1_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:103:3: ( (lv_rules_2_0= ruleRule ) )
            // InternalJRules.g:104:4: (lv_rules_2_0= ruleRule )
            {
            // InternalJRules.g:104:4: (lv_rules_2_0= ruleRule )
            // InternalJRules.g:105:5: lv_rules_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_rules_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            					}
            					add(
            						current,
            						"rules",
            						lv_rules_2_0,
            						"es.uam.sara.tfg.dsl.JRules.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getSemicolonKeyword_3());
            		
            // InternalJRules.g:126:3: ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=57 && LA1_0<=59)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJRules.g:127:4: ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';'
            	    {
            	    // InternalJRules.g:127:4: ( (lv_rules_4_0= ruleRule ) )
            	    // InternalJRules.g:128:5: (lv_rules_4_0= ruleRule )
            	    {
            	    // InternalJRules.g:128:5: (lv_rules_4_0= ruleRule )
            	    // InternalJRules.g:129:6: lv_rules_4_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_4_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_4_0,
            	    							"es.uam.sara.tfg.dsl.JRules.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_4_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleSatisfy"
    // InternalJRules.g:155:1: entryRuleSatisfy returns [EObject current=null] : iv_ruleSatisfy= ruleSatisfy EOF ;
    public final EObject entryRuleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSatisfy = null;


        try {
            // InternalJRules.g:155:48: (iv_ruleSatisfy= ruleSatisfy EOF )
            // InternalJRules.g:156:2: iv_ruleSatisfy= ruleSatisfy EOF
            {
             newCompositeNode(grammarAccess.getSatisfyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSatisfy=ruleSatisfy();

            state._fsp--;

             current =iv_ruleSatisfy; 
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
    // $ANTLR end "entryRuleSatisfy"


    // $ANTLR start "ruleSatisfy"
    // InternalJRules.g:162:1: ruleSatisfy returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers ) ;
    public final EObject ruleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject this_isImplemented_0 = null;

        EObject this_IsInheritor_1 = null;

        EObject this_Implements_2 = null;

        EObject this_IsExtended_3 = null;

        EObject this_Parameter_4 = null;

        EObject this_Constructor_5 = null;

        EObject this_Return_6 = null;

        EObject this_AttributeType_7 = null;

        EObject this_Initialize_8 = null;

        EObject this_NoEmpty_9 = null;

        EObject this_Name_10 = null;

        EObject this_JavaDoc_11 = null;

        EObject this_Contains_12 = null;

        EObject this_Modifiers_13 = null;



        	enterRule();

        try {
            // InternalJRules.g:168:2: ( (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers ) )
            // InternalJRules.g:169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )
            {
            // InternalJRules.g:169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )
            int alt2=14;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalJRules.g:170:3: this_isImplemented_0= ruleisImplemented
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsImplementedParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_isImplemented_0=ruleisImplemented();

                    state._fsp--;


                    			current = this_isImplemented_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:179:3: this_IsInheritor_1= ruleIsInheritor
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsInheritorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsInheritor_1=ruleIsInheritor();

                    state._fsp--;


                    			current = this_IsInheritor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJRules.g:188:3: this_Implements_2= ruleImplements
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getImplementsParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Implements_2=ruleImplements();

                    state._fsp--;


                    			current = this_Implements_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJRules.g:197:3: this_IsExtended_3= ruleIsExtended
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsExtendedParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsExtended_3=ruleIsExtended();

                    state._fsp--;


                    			current = this_IsExtended_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJRules.g:206:3: this_Parameter_4= ruleParameter
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getParameterParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parameter_4=ruleParameter();

                    state._fsp--;


                    			current = this_Parameter_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJRules.g:215:3: this_Constructor_5= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getConstructorParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_5=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJRules.g:224:3: this_Return_6= ruleReturn
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getReturnParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Return_6=ruleReturn();

                    state._fsp--;


                    			current = this_Return_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJRules.g:233:3: this_AttributeType_7= ruleAttributeType
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getAttributeTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeType_7=ruleAttributeType();

                    state._fsp--;


                    			current = this_AttributeType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJRules.g:242:3: this_Initialize_8= ruleInitialize
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getInitializeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initialize_8=ruleInitialize();

                    state._fsp--;


                    			current = this_Initialize_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJRules.g:251:3: this_NoEmpty_9= ruleNoEmpty
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNoEmptyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoEmpty_9=ruleNoEmpty();

                    state._fsp--;


                    			current = this_NoEmpty_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJRules.g:260:3: this_Name_10= ruleName
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNameParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_10=ruleName();

                    state._fsp--;


                    			current = this_Name_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJRules.g:269:3: this_JavaDoc_11= ruleJavaDoc
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getJavaDocParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_JavaDoc_11=ruleJavaDoc();

                    state._fsp--;


                    			current = this_JavaDoc_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJRules.g:278:3: this_Contains_12= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getContainsParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_12=ruleContains();

                    state._fsp--;


                    			current = this_Contains_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJRules.g:287:3: this_Modifiers_13= ruleModifiers
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getModifiersParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modifiers_13=ruleModifiers();

                    state._fsp--;


                    			current = this_Modifiers_13;
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
    // $ANTLR end "ruleSatisfy"


    // $ANTLR start "entryRuleEString"
    // InternalJRules.g:299:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:299:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:300:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:306:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:312:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:313:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:313:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJRules.g:314:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:322:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRule"
    // InternalJRules.g:333:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:333:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:334:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:340:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_quantifier_1_0 = null;

        Enumerator lv_element_2_0 = null;

        EObject lv_filter_4_0 = null;

        EObject lv_satisfy_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:346:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) ) )
            // InternalJRules.g:347:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )
            {
            // InternalJRules.g:347:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )
            // InternalJRules.g:348:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) )
            {
            // InternalJRules.g:348:3: ( (lv_no_0_0= 'no' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:349:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:349:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:350:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:362:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:363:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:363:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:364:5: lv_quantifier_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQuantifierQuantifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalJRules.g:381:3: ( (lv_element_2_0= ruleElementJava ) )
            // InternalJRules.g:382:4: (lv_element_2_0= ruleElementJava )
            {
            // InternalJRules.g:382:4: (lv_element_2_0= ruleElementJava )
            // InternalJRules.g:383:5: lv_element_2_0= ruleElementJava
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getElementElementJavaEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_8);
            lv_element_2_0=ruleElementJava();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"es.uam.sara.tfg.dsl.JRules.ElementJava");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:400:3: (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:401:4: otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWhichKeyword_3_0());
                    			
                    // InternalJRules.g:405:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalJRules.g:406:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalJRules.g:406:5: (lv_filter_4_0= ruleFilter )
                    // InternalJRules.g:407:6: lv_filter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_filter_4_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_4_0,
                    							"es.uam.sara.tfg.dsl.JRules.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getSatisfyKeyword_4());
            		
            // InternalJRules.g:429:3: ( (lv_satisfy_6_0= ruleOr ) )
            // InternalJRules.g:430:4: (lv_satisfy_6_0= ruleOr )
            {
            // InternalJRules.g:430:4: (lv_satisfy_6_0= ruleOr )
            // InternalJRules.g:431:5: lv_satisfy_6_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_satisfy_6_0=ruleOr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"satisfy",
            						lv_satisfy_6_0,
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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilter"
    // InternalJRules.g:452:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalJRules.g:452:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalJRules.g:453:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalJRules.g:459:1: ruleFilter returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        EObject lv_filter_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:465:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) )
            // InternalJRules.g:466:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            {
            // InternalJRules.g:466:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            // InternalJRules.g:467:3: ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) )
            {
            // InternalJRules.g:467:3: ( (lv_no_0_0= 'no' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:468:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:468:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:469:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,13,FOLLOW_9); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getFilterAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:481:3: ( (lv_filter_1_0= ruleOr ) )
            // InternalJRules.g:482:4: (lv_filter_1_0= ruleOr )
            {
            // InternalJRules.g:482:4: (lv_filter_1_0= ruleOr )
            // InternalJRules.g:483:5: lv_filter_1_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getFilterAccess().getFilterOrParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_filter_1_0=ruleOr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterRule());
            					}
            					set(
            						current,
            						"filter",
            						lv_filter_1_0,
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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleOr"
    // InternalJRules.g:504:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:504:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:505:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:511:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:517:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:518:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:518:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:519:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:519:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:520:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:520:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:521:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalJRules.g:538:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJRules.g:539:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:543:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:544:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:544:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:545:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop7;
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
    // InternalJRules.g:567:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:567:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:568:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:574:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= ruleSatisfy ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_op_4_0 = null;

        EObject lv_op_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:580:2: ( ( ( (lv_op_0_0= ruleSatisfy ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' ) ) )
            // InternalJRules.g:581:2: ( ( (lv_op_0_0= ruleSatisfy ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' ) )
            {
            // InternalJRules.g:581:2: ( ( (lv_op_0_0= ruleSatisfy ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20||LA9_0==23||LA9_0==28||(LA9_0>=34 && LA9_0<=35)||LA9_0==39||LA9_0==41||LA9_0==48||LA9_0==51) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRules.g:582:3: ( (lv_op_0_0= ruleSatisfy ) )
                    {
                    // InternalJRules.g:582:3: ( (lv_op_0_0= ruleSatisfy ) )
                    // InternalJRules.g:583:4: (lv_op_0_0= ruleSatisfy )
                    {
                    // InternalJRules.g:583:4: (lv_op_0_0= ruleSatisfy )
                    // InternalJRules.g:584:5: lv_op_0_0= ruleSatisfy
                    {

                    					newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_op_0_0=ruleSatisfy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAndRule());
                    					}
                    					add(
                    						current,
                    						"op",
                    						lv_op_0_0,
                    						"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:602:3: (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' )
                    {
                    // InternalJRules.g:602:3: (otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')' )
                    // InternalJRules.g:603:4: otherlv_1= '(' ( (lv_op_2_0= ruleSatisfy ) ) otherlv_3= 'and' ( (lv_op_4_0= ruleSatisfy ) ) (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )* otherlv_7= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalJRules.g:607:4: ( (lv_op_2_0= ruleSatisfy ) )
                    // InternalJRules.g:608:5: (lv_op_2_0= ruleSatisfy )
                    {
                    // InternalJRules.g:608:5: (lv_op_2_0= ruleSatisfy )
                    // InternalJRules.g:609:6: lv_op_2_0= ruleSatisfy
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_op_2_0=ruleSatisfy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAndAccess().getAndKeyword_1_2());
                    			
                    // InternalJRules.g:630:4: ( (lv_op_4_0= ruleSatisfy ) )
                    // InternalJRules.g:631:5: (lv_op_4_0= ruleSatisfy )
                    {
                    // InternalJRules.g:631:5: (lv_op_4_0= ruleSatisfy )
                    // InternalJRules.g:632:6: lv_op_4_0= ruleSatisfy
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_op_4_0=ruleSatisfy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_4_0,
                    							"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:649:4: (otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalJRules.g:650:5: otherlv_5= 'and' ( (lv_op_6_0= ruleSatisfy ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAndAccess().getAndKeyword_1_4_0());
                    	    				
                    	    // InternalJRules.g:654:5: ( (lv_op_6_0= ruleSatisfy ) )
                    	    // InternalJRules.g:655:6: (lv_op_6_0= ruleSatisfy )
                    	    {
                    	    // InternalJRules.g:655:6: (lv_op_6_0= ruleSatisfy )
                    	    // InternalJRules.g:656:7: lv_op_6_0= ruleSatisfy
                    	    {

                    	    							newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_op_6_0=ruleSatisfy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAndRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"op",
                    	    								lv_op_6_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAndAccess().getRightParenthesisKeyword_1_5());
                    			

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleisImplemented"
    // InternalJRules.g:683:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:683:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:684:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:690:1: ruleisImplemented returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'implemented' ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:696:2: ( ( () otherlv_1= 'is' otherlv_2= 'implemented' ) )
            // InternalJRules.g:697:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            {
            // InternalJRules.g:697:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            // InternalJRules.g:698:3: () otherlv_1= 'is' otherlv_2= 'implemented'
            {
            // InternalJRules.g:698:3: ()
            // InternalJRules.g:699:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsImplementedAccess().getIsImplementedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsImplementedAccess().getImplementedKeyword_2());
            		

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


    // $ANTLR start "entryRuleIsInheritor"
    // InternalJRules.g:717:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRules.g:717:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRules.g:718:2: iv_ruleIsInheritor= ruleIsInheritor EOF
            {
             newCompositeNode(grammarAccess.getIsInheritorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsInheritor=ruleIsInheritor();

            state._fsp--;

             current =iv_ruleIsInheritor; 
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
    // $ANTLR end "entryRuleIsInheritor"


    // $ANTLR start "ruleIsInheritor"
    // InternalJRules.g:724:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:730:2: ( ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) )
            // InternalJRules.g:731:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            {
            // InternalJRules.g:731:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            // InternalJRules.g:732:3: () otherlv_1= 'is' otherlv_2= 'inheritor'
            {
            // InternalJRules.g:732:3: ()
            // InternalJRules.g:733:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsInheritorAccess().getInheritorKeyword_2());
            		

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
    // $ANTLR end "ruleIsInheritor"


    // $ANTLR start "entryRuleImplements"
    // InternalJRules.g:751:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:751:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:752:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:758:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_minInterface_3_0 = null;

        AntlrDatatypeRuleToken lv_maxInterface_6_0 = null;

        AntlrDatatypeRuleToken lv_maxInterface_8_0 = null;

        AntlrDatatypeRuleToken lv_minInterface_11_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:764:2: ( ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) )
            // InternalJRules.g:765:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            {
            // InternalJRules.g:765:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            // InternalJRules.g:766:3: () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces'
            {
            // InternalJRules.g:766:3: ()
            // InternalJRules.g:767:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsAccess().getImplementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:777:3: ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            else if ( (LA12_0==25) ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:778:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:778:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    // InternalJRules.g:779:5: otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_18); 

                    					newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getMinKeyword_2_0_0());
                    				
                    // InternalJRules.g:783:5: ( (lv_minInterface_3_0= ruleEInt ) )
                    // InternalJRules.g:784:6: (lv_minInterface_3_0= ruleEInt )
                    {
                    // InternalJRules.g:784:6: (lv_minInterface_3_0= ruleEInt )
                    // InternalJRules.g:785:7: lv_minInterface_3_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_minInterface_3_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImplementsRule());
                    							}
                    							set(
                    								current,
                    								"minInterface",
                    								lv_minInterface_3_0,
                    								"es.uam.sara.tfg.dsl.JRules.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:802:5: (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==18) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalJRules.g:803:6: otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_20); 

                            						newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getAndKeyword_2_0_2_0());
                            					
                            otherlv_5=(Token)match(input,25,FOLLOW_18); 

                            						newLeafNode(otherlv_5, grammarAccess.getImplementsAccess().getMaxKeyword_2_0_2_1());
                            					
                            // InternalJRules.g:811:6: ( (lv_maxInterface_6_0= ruleEInt ) )
                            // InternalJRules.g:812:7: (lv_maxInterface_6_0= ruleEInt )
                            {
                            // InternalJRules.g:812:7: (lv_maxInterface_6_0= ruleEInt )
                            // InternalJRules.g:813:8: lv_maxInterface_6_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_0_2_2_0());
                            							
                            pushFollow(FOLLOW_21);
                            lv_maxInterface_6_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getImplementsRule());
                            								}
                            								set(
                            									current,
                            									"maxInterface",
                            									lv_maxInterface_6_0,
                            									"es.uam.sara.tfg.dsl.JRules.EInt");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:833:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:833:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    // InternalJRules.g:834:5: otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_18); 

                    					newLeafNode(otherlv_7, grammarAccess.getImplementsAccess().getMaxKeyword_2_1_0());
                    				
                    // InternalJRules.g:838:5: ( (lv_maxInterface_8_0= ruleEInt ) )
                    // InternalJRules.g:839:6: (lv_maxInterface_8_0= ruleEInt )
                    {
                    // InternalJRules.g:839:6: (lv_maxInterface_8_0= ruleEInt )
                    // InternalJRules.g:840:7: lv_maxInterface_8_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_19);
                    lv_maxInterface_8_0=ruleEInt();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getImplementsRule());
                    							}
                    							set(
                    								current,
                    								"maxInterface",
                    								lv_maxInterface_8_0,
                    								"es.uam.sara.tfg.dsl.JRules.EInt");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:857:5: (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==18) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJRules.g:858:6: otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) )
                            {
                            otherlv_9=(Token)match(input,18,FOLLOW_22); 

                            						newLeafNode(otherlv_9, grammarAccess.getImplementsAccess().getAndKeyword_2_1_2_0());
                            					
                            otherlv_10=(Token)match(input,24,FOLLOW_18); 

                            						newLeafNode(otherlv_10, grammarAccess.getImplementsAccess().getMinKeyword_2_1_2_1());
                            					
                            // InternalJRules.g:866:6: ( (lv_minInterface_11_0= ruleEInt ) )
                            // InternalJRules.g:867:7: (lv_minInterface_11_0= ruleEInt )
                            {
                            // InternalJRules.g:867:7: (lv_minInterface_11_0= ruleEInt )
                            // InternalJRules.g:868:8: lv_minInterface_11_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_1_2_2_0());
                            							
                            pushFollow(FOLLOW_21);
                            lv_minInterface_11_0=ruleEInt();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getImplementsRule());
                            								}
                            								set(
                            									current,
                            									"minInterface",
                            									lv_minInterface_11_0,
                            									"es.uam.sara.tfg.dsl.JRules.EInt");
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

            otherlv_12=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getImplementsAccess().getInterfacesKeyword_3());
            		

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


    // $ANTLR start "entryRuleIsExtended"
    // InternalJRules.g:896:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRules.g:896:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRules.g:897:2: iv_ruleIsExtended= ruleIsExtended EOF
            {
             newCompositeNode(grammarAccess.getIsExtendedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIsExtended=ruleIsExtended();

            state._fsp--;

             current =iv_ruleIsExtended; 
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
    // $ANTLR end "entryRuleIsExtended"


    // $ANTLR start "ruleIsExtended"
    // InternalJRules.g:903:1: ruleIsExtended returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'extended' ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:909:2: ( ( () otherlv_1= 'is' otherlv_2= 'extended' ) )
            // InternalJRules.g:910:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            {
            // InternalJRules.g:910:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            // InternalJRules.g:911:3: () otherlv_1= 'is' otherlv_2= 'extended'
            {
            // InternalJRules.g:911:3: ()
            // InternalJRules.g:912:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsExtendedAccess().getIsExtendedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getIsExtendedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,27,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsExtendedAccess().getExtendedKeyword_2());
            		

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
    // $ANTLR end "ruleIsExtended"


    // $ANTLR start "entryRuleParameter"
    // InternalJRules.g:930:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:930:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:931:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:937:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_numParam_1_0 = null;

        AntlrDatatypeRuleToken lv_typesParam_5_0 = null;

        AntlrDatatypeRuleToken lv_typesParam_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:943:2: ( (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) )
            // InternalJRules.g:944:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            {
            // InternalJRules.g:944:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            // InternalJRules.g:945:3: otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNumParametersKeyword_0());
            		
            // InternalJRules.g:949:3: ( (lv_numParam_1_0= ruleEBigInteger ) )
            // InternalJRules.g:950:4: (lv_numParam_1_0= ruleEBigInteger )
            {
            // InternalJRules.g:950:4: (lv_numParam_1_0= ruleEBigInteger )
            // InternalJRules.g:951:5: lv_numParam_1_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNumParamEBigIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
            lv_numParam_1_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"numParam",
            						lv_numParam_1_0,
            						"es.uam.sara.tfg.dsl.JRules.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:968:3: (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==18) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==29) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalJRules.g:969:4: otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']'
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_25); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAndKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,29,FOLLOW_26); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_2());
                    			
                    // InternalJRules.g:981:4: ( (lv_typesParam_5_0= ruleEString ) )
                    // InternalJRules.g:982:5: (lv_typesParam_5_0= ruleEString )
                    {
                    // InternalJRules.g:982:5: (lv_typesParam_5_0= ruleEString )
                    // InternalJRules.g:983:6: lv_typesParam_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_typesParam_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterRule());
                    						}
                    						add(
                    							current,
                    							"typesParam",
                    							lv_typesParam_5_0,
                    							"es.uam.sara.tfg.dsl.JRules.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:1000:4: (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==31) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalJRules.g:1001:5: otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalJRules.g:1005:5: ( (lv_typesParam_7_0= ruleEString ) )
                    	    // InternalJRules.g:1006:6: (lv_typesParam_7_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:1006:6: (lv_typesParam_7_0= ruleEString )
                    	    // InternalJRules.g:1007:7: lv_typesParam_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_27);
                    	    lv_typesParam_7_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"typesParam",
                    	    								lv_typesParam_7_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_5());
                    			

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
    // InternalJRules.g:1034:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1034:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1035:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1041:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1047:2: ( ( () otherlv_1= 'is' otherlv_2= 'constructor' ) )
            // InternalJRules.g:1048:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            {
            // InternalJRules.g:1048:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            // InternalJRules.g:1049:3: () otherlv_1= 'is' otherlv_2= 'constructor'
            {
            // InternalJRules.g:1049:3: ()
            // InternalJRules.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getConstructorKeyword_2());
            		

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
    // InternalJRules.g:1068:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1068:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1069:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1075:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1081:2: ( (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) )
            // InternalJRules.g:1082:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            {
            // InternalJRules.g:1082:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            // InternalJRules.g:1083:3: otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1091:3: ( (lv_returnType_2_0= ruleEString ) )
            // InternalJRules.g:1092:4: (lv_returnType_2_0= ruleEString )
            {
            // InternalJRules.g:1092:4: (lv_returnType_2_0= ruleEString )
            // InternalJRules.g:1093:5: lv_returnType_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getReturnTypeEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnType_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_2_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
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
    // InternalJRules.g:1114:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1114:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1115:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1121:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1127:2: ( (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRules.g:1128:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRules.g:1128:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRules.g:1129:3: otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1133:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRules.g:1134:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRules.g:1134:4: (lv_Type_1_0= ruleEString )
            // InternalJRules.g:1135:5: lv_Type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_Type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeTypeRule());
            					}
            					set(
            						current,
            						"Type",
            						lv_Type_1_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
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
    // InternalJRules.g:1156:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1156:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1157:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:1163:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1169:2: ( ( () otherlv_1= 'is' otherlv_2= 'initialize' ) )
            // InternalJRules.g:1170:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            {
            // InternalJRules.g:1170:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            // InternalJRules.g:1171:3: () otherlv_1= 'is' otherlv_2= 'initialize'
            {
            // InternalJRules.g:1171:3: ()
            // InternalJRules.g:1172:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getInitializeKeyword_2());
            		

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


    // $ANTLR start "entryRuleNoEmpty"
    // InternalJRules.g:1190:1: entryRuleNoEmpty returns [EObject current=null] : iv_ruleNoEmpty= ruleNoEmpty EOF ;
    public final EObject entryRuleNoEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmpty = null;


        try {
            // InternalJRules.g:1190:48: (iv_ruleNoEmpty= ruleNoEmpty EOF )
            // InternalJRules.g:1191:2: iv_ruleNoEmpty= ruleNoEmpty EOF
            {
             newCompositeNode(grammarAccess.getNoEmptyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNoEmpty=ruleNoEmpty();

            state._fsp--;

             current =iv_ruleNoEmpty; 
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
    // $ANTLR end "entryRuleNoEmpty"


    // $ANTLR start "ruleNoEmpty"
    // InternalJRules.g:1197:1: ruleNoEmpty returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' ) ;
    public final EObject ruleNoEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJRules.g:1203:2: ( ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' ) )
            // InternalJRules.g:1204:2: ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' )
            {
            // InternalJRules.g:1204:2: ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' )
            // InternalJRules.g:1205:3: () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty'
            {
            // InternalJRules.g:1205:3: ()
            // InternalJRules.g:1206:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoEmptyAccess().getNoEmptyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getNoEmptyAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_32); 

            			newLeafNode(otherlv_2, grammarAccess.getNoEmptyAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNoEmptyAccess().getEmptyKeyword_3());
            		

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
    // $ANTLR end "ruleNoEmpty"


    // $ANTLR start "entryRuleName"
    // InternalJRules.g:1228:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalJRules.g:1228:45: (iv_ruleName= ruleName EOF )
            // InternalJRules.g:1229:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName; 
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
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // InternalJRules.g:1235:1: ruleName returns [EObject current=null] : ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_type_3_0 = null;

        Enumerator lv_operator_5_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_Language_9_0 = null;

        Enumerator lv_operator_10_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        Enumerator lv_Language_14_0 = null;

        Enumerator lv_type_17_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1241:2: ( ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) ) )
            // InternalJRules.g:1242:2: ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) )
            {
            // InternalJRules.g:1242:2: ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) )
            // InternalJRules.g:1243:3: () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) )
            {
            // InternalJRules.g:1243:3: ()
            // InternalJRules.g:1244:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getNameKeyword_1());
            		
            // InternalJRules.g:1254:3: ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=71 && LA19_0<=75)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1255:4: (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? )
                    {
                    // InternalJRules.g:1255:4: (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? )
                    // InternalJRules.g:1256:5: otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )?
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_34); 

                    					newLeafNode(otherlv_2, grammarAccess.getNameAccess().getTypeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1260:5: ( (lv_type_3_0= ruleNameType ) )
                    // InternalJRules.g:1261:6: (lv_type_3_0= ruleNameType )
                    {
                    // InternalJRules.g:1261:6: (lv_type_3_0= ruleNameType )
                    // InternalJRules.g:1262:7: lv_type_3_0= ruleNameType
                    {

                    							newCompositeNode(grammarAccess.getNameAccess().getTypeNameTypeEnumRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_24);
                    lv_type_3_0=ruleNameType();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameRule());
                    							}
                    							set(
                    								current,
                    								"type",
                    								lv_type_3_0,
                    								"es.uam.sara.tfg.dsl.JRules.NameType");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:1279:5: ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==18) ) {
                        int LA16_1 = input.LA(2);

                        if ( ((LA16_1>=71 && LA16_1<=75)) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalJRules.g:1280:6: (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )?
                            {
                            // InternalJRules.g:1280:6: (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) )
                            // InternalJRules.g:1281:7: otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,18,FOLLOW_33); 

                            							newLeafNode(otherlv_4, grammarAccess.getNameAccess().getAndKeyword_2_0_2_0_0());
                            						
                            // InternalJRules.g:1285:7: ( (lv_operator_5_0= ruleNameOperator ) )
                            // InternalJRules.g:1286:8: (lv_operator_5_0= ruleNameOperator )
                            {
                            // InternalJRules.g:1286:8: (lv_operator_5_0= ruleNameOperator )
                            // InternalJRules.g:1287:9: lv_operator_5_0= ruleNameOperator
                            {

                            									newCompositeNode(grammarAccess.getNameAccess().getOperatorNameOperatorEnumRuleCall_2_0_2_0_1_0());
                            								
                            pushFollow(FOLLOW_3);
                            lv_operator_5_0=ruleNameOperator();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getNameRule());
                            									}
                            									set(
                            										current,
                            										"operator",
                            										lv_operator_5_0,
                            										"es.uam.sara.tfg.dsl.JRules.NameOperator");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }

                            // InternalJRules.g:1304:7: ( (lv_name_6_0= ruleEString ) )
                            // InternalJRules.g:1305:8: (lv_name_6_0= ruleEString )
                            {
                            // InternalJRules.g:1305:8: (lv_name_6_0= ruleEString )
                            // InternalJRules.g:1306:9: lv_name_6_0= ruleEString
                            {

                            									newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_2_0_2_0_2_0());
                            								
                            pushFollow(FOLLOW_35);
                            lv_name_6_0=ruleEString();

                            state._fsp--;


                            									if (current==null) {
                            										current = createModelElementForParent(grammarAccess.getNameRule());
                            									}
                            									set(
                            										current,
                            										"name",
                            										lv_name_6_0,
                            										"es.uam.sara.tfg.dsl.JRules.EString");
                            									afterParserOrEnumRuleCall();
                            								

                            }


                            }


                            }

                            // InternalJRules.g:1324:6: (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==31) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // InternalJRules.g:1325:7: otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) )
                                    {
                                    otherlv_7=(Token)match(input,31,FOLLOW_36); 

                                    							newLeafNode(otherlv_7, grammarAccess.getNameAccess().getCommaKeyword_2_0_2_1_0());
                                    						
                                    otherlv_8=(Token)match(input,40,FOLLOW_37); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNameAccess().getInKeyword_2_0_2_1_1());
                                    						
                                    // InternalJRules.g:1333:7: ( (lv_Language_9_0= ruleLanguage ) )
                                    // InternalJRules.g:1334:8: (lv_Language_9_0= ruleLanguage )
                                    {
                                    // InternalJRules.g:1334:8: (lv_Language_9_0= ruleLanguage )
                                    // InternalJRules.g:1335:9: lv_Language_9_0= ruleLanguage
                                    {

                                    									newCompositeNode(grammarAccess.getNameAccess().getLanguageLanguageEnumRuleCall_2_0_2_1_2_0());
                                    								
                                    pushFollow(FOLLOW_2);
                                    lv_Language_9_0=ruleLanguage();

                                    state._fsp--;


                                    									if (current==null) {
                                    										current = createModelElementForParent(grammarAccess.getNameRule());
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
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1356:4: ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? )
                    {
                    // InternalJRules.g:1356:4: ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? )
                    // InternalJRules.g:1357:5: ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )?
                    {
                    // InternalJRules.g:1357:5: ( (lv_operator_10_0= ruleNameOperator ) )
                    // InternalJRules.g:1358:6: (lv_operator_10_0= ruleNameOperator )
                    {
                    // InternalJRules.g:1358:6: (lv_operator_10_0= ruleNameOperator )
                    // InternalJRules.g:1359:7: lv_operator_10_0= ruleNameOperator
                    {

                    							newCompositeNode(grammarAccess.getNameAccess().getOperatorNameOperatorEnumRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_3);
                    lv_operator_10_0=ruleNameOperator();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameRule());
                    							}
                    							set(
                    								current,
                    								"operator",
                    								lv_operator_10_0,
                    								"es.uam.sara.tfg.dsl.JRules.NameOperator");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:1376:5: ( (lv_name_11_0= ruleEString ) )
                    // InternalJRules.g:1377:6: (lv_name_11_0= ruleEString )
                    {
                    // InternalJRules.g:1377:6: (lv_name_11_0= ruleEString )
                    // InternalJRules.g:1378:7: lv_name_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_38);
                    lv_name_11_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getNameRule());
                    							}
                    							set(
                    								current,
                    								"name",
                    								lv_name_11_0,
                    								"es.uam.sara.tfg.dsl.JRules.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:1395:5: (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalJRules.g:1396:6: otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) )
                            {
                            otherlv_12=(Token)match(input,31,FOLLOW_36); 

                            						newLeafNode(otherlv_12, grammarAccess.getNameAccess().getCommaKeyword_2_1_2_0());
                            					
                            otherlv_13=(Token)match(input,40,FOLLOW_37); 

                            						newLeafNode(otherlv_13, grammarAccess.getNameAccess().getInKeyword_2_1_2_1());
                            					
                            // InternalJRules.g:1404:6: ( (lv_Language_14_0= ruleLanguage ) )
                            // InternalJRules.g:1405:7: (lv_Language_14_0= ruleLanguage )
                            {
                            // InternalJRules.g:1405:7: (lv_Language_14_0= ruleLanguage )
                            // InternalJRules.g:1406:8: lv_Language_14_0= ruleLanguage
                            {

                            								newCompositeNode(grammarAccess.getNameAccess().getLanguageLanguageEnumRuleCall_2_1_2_2_0());
                            							
                            pushFollow(FOLLOW_24);
                            lv_Language_14_0=ruleLanguage();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNameRule());
                            								}
                            								set(
                            									current,
                            									"Language",
                            									lv_Language_14_0,
                            									"es.uam.sara.tfg.dsl.JRules.Language");
                            								afterParserOrEnumRuleCall();
                            							

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1424:5: (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==18) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==35) ) {
                            int LA18_3 = input.LA(3);

                            if ( ((LA18_3>=66 && LA18_3<=70)) ) {
                                alt18=1;
                            }
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalJRules.g:1425:6: otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) )
                            {
                            otherlv_15=(Token)match(input,18,FOLLOW_29); 

                            						newLeafNode(otherlv_15, grammarAccess.getNameAccess().getAndKeyword_2_1_3_0());
                            					
                            otherlv_16=(Token)match(input,35,FOLLOW_34); 

                            						newLeafNode(otherlv_16, grammarAccess.getNameAccess().getTypeKeyword_2_1_3_1());
                            					
                            // InternalJRules.g:1433:6: ( (lv_type_17_0= ruleNameType ) )
                            // InternalJRules.g:1434:7: (lv_type_17_0= ruleNameType )
                            {
                            // InternalJRules.g:1434:7: (lv_type_17_0= ruleNameType )
                            // InternalJRules.g:1435:8: lv_type_17_0= ruleNameType
                            {

                            								newCompositeNode(grammarAccess.getNameAccess().getTypeNameTypeEnumRuleCall_2_1_3_2_0());
                            							
                            pushFollow(FOLLOW_2);
                            lv_type_17_0=ruleNameType();

                            state._fsp--;


                            								if (current==null) {
                            									current = createModelElementForParent(grammarAccess.getNameRule());
                            								}
                            								set(
                            									current,
                            									"type",
                            									lv_type_17_0,
                            									"es.uam.sara.tfg.dsl.JRules.NameType");
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleJavaDoc"
    // InternalJRules.g:1459:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:1459:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:1460:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:1466:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
    public final EObject ruleJavaDoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_author_2_0=null;
        Token lv_parametre_3_0=null;
        Token lv_return_4_0=null;
        Token lv_version_5_0=null;
        Token lv_throws_6_0=null;
        Token lv_see_7_0=null;


        	enterRule();

        try {
            // InternalJRules.g:1472:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRules.g:1473:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRules.g:1473:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRules.g:1474:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRules.g:1474:3: ()
            // InternalJRules.g:1475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_39); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
            		
            // InternalJRules.g:1485:3: ( (lv_author_2_0= '@author' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1486:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRules.g:1486:4: (lv_author_2_0= '@author' )
                    // InternalJRules.g:1487:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,42,FOLLOW_40); 

                    					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1499:3: ( (lv_parametre_3_0= '@parameter' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1500:4: (lv_parametre_3_0= '@parameter' )
                    {
                    // InternalJRules.g:1500:4: (lv_parametre_3_0= '@parameter' )
                    // InternalJRules.g:1501:5: lv_parametre_3_0= '@parameter'
                    {
                    lv_parametre_3_0=(Token)match(input,43,FOLLOW_41); 

                    					newLeafNode(lv_parametre_3_0, grammarAccess.getJavaDocAccess().getParametreParameterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parametre", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1513:3: ( (lv_return_4_0= '@return' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==44) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1514:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRules.g:1514:4: (lv_return_4_0= '@return' )
                    // InternalJRules.g:1515:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,44,FOLLOW_42); 

                    					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1527:3: ( (lv_version_5_0= '@version' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==45) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1528:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRules.g:1528:4: (lv_version_5_0= '@version' )
                    // InternalJRules.g:1529:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,45,FOLLOW_43); 

                    					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1541:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1542:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRules.g:1542:4: (lv_throws_6_0= '@throws' )
                    // InternalJRules.g:1543:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,46,FOLLOW_44); 

                    					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1555:3: ( (lv_see_7_0= '@see' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==47) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1556:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRules.g:1556:4: (lv_see_7_0= '@see' )
                    // InternalJRules.g:1557:5: lv_see_7_0= '@see'
                    {
                    lv_see_7_0=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_see_7_0, grammarAccess.getJavaDocAccess().getSeeSeeKeyword_7_0());
                    				

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
    // InternalJRules.g:1573:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:1573:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:1574:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:1580:1: ruleContains returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1586:2: ( (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) )
            // InternalJRules.g:1587:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            {
            // InternalJRules.g:1587:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            // InternalJRules.g:1588:3: otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJRules.g:1596:3: ( (lv_which_2_0= ruleRule ) )
            // InternalJRules.g:1597:4: (lv_which_2_0= ruleRule )
            {
            // InternalJRules.g:1597:4: (lv_which_2_0= ruleRule )
            // InternalJRules.g:1598:5: lv_which_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_46);
            lv_which_2_0=ruleRule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContainsRule());
            					}
            					set(
            						current,
            						"which",
            						lv_which_2_0,
            						"es.uam.sara.tfg.dsl.JRules.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,50,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getRightCurlyBracketKeyword_3());
            		

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
    // InternalJRules.g:1623:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:1623:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:1624:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:1630:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) ;
    public final EObject ruleModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_blend_3_0 = null;

        EObject lv_blend_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1636:2: ( (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) )
            // InternalJRules.g:1637:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            {
            // InternalJRules.g:1637:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            // InternalJRules.g:1638:3: otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,30,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_48); 

            			newLeafNode(otherlv_2, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJRules.g:1650:3: ( (lv_blend_3_0= ruleBlendModifiers ) )
            // InternalJRules.g:1651:4: (lv_blend_3_0= ruleBlendModifiers )
            {
            // InternalJRules.g:1651:4: (lv_blend_3_0= ruleBlendModifiers )
            // InternalJRules.g:1652:5: lv_blend_3_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_49);
            lv_blend_3_0=ruleBlendModifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiersRule());
            					}
            					add(
            						current,
            						"blend",
            						lv_blend_3_0,
            						"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_4());
            		
            // InternalJRules.g:1673:3: (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==16) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJRules.g:1674:4: otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_47); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getOrKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,17,FOLLOW_48); 

            	    				newLeafNode(otherlv_6, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_5_1());
            	    			
            	    // InternalJRules.g:1682:4: ( (lv_blend_7_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:1683:5: (lv_blend_7_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:1683:5: (lv_blend_7_0= ruleBlendModifiers )
            	    // InternalJRules.g:1684:6: lv_blend_7_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_2_0());
            	    					
            	    pushFollow(FOLLOW_49);
            	    lv_blend_7_0=ruleBlendModifiers();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModifiersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"blend",
            	    							lv_blend_7_0,
            	    							"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_50); 

            	    				newLeafNode(otherlv_8, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_5_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getModifiersAccess().getRightSquareBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:1714:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:1714:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:1715:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:1721:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1727:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1728:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1728:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1729:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1729:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==52) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1730:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_51); 

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


    // $ANTLR start "entryRuleEBigInteger"
    // InternalJRules.g:1747:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalJRules.g:1747:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalJRules.g:1748:2: iv_ruleEBigInteger= ruleEBigInteger EOF
            {
             newCompositeNode(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBigInteger=ruleEBigInteger();

            state._fsp--;

             current =iv_ruleEBigInteger.getText(); 
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
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // InternalJRules.g:1754:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1760:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1761:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1761:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1762:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1762:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==52) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJRules.g:1763:4: kw= '-'
                    {
                    kw=(Token)match(input,52,FOLLOW_51); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1());
            		

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
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "entryRuleBlendModifiers"
    // InternalJRules.g:1780:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:1780:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:1781:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:1787:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) ;
    public final EObject ruleBlendModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_static_2_0=null;
        Token otherlv_3=null;
        Token lv_final_4_0=null;
        Token otherlv_5=null;
        Token lv_abstract_6_0=null;
        Token otherlv_7=null;
        Token lv_synchronized_8_0=null;
        Token lv_static_9_0=null;
        Token otherlv_10=null;
        Token lv_final_11_0=null;
        Token otherlv_12=null;
        Token lv_abstract_13_0=null;
        Token otherlv_14=null;
        Token lv_synchronized_15_0=null;
        Token lv_final_16_0=null;
        Token otherlv_17=null;
        Token lv_abstract_18_0=null;
        Token otherlv_19=null;
        Token lv_synchronized_20_0=null;
        Token lv_abstract_21_0=null;
        Token otherlv_22=null;
        Token lv_synchronized_23_0=null;
        Token lv_synchronized_24_0=null;
        Enumerator lv_access_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1793:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) )
            // InternalJRules.g:1794:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:1794:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 78:
            case 79:
            case 80:
            case 81:
                {
                alt39=1;
                }
                break;
            case 53:
                {
                alt39=2;
                }
                break;
            case 54:
                {
                alt39=3;
                }
                break;
            case 55:
                {
                alt39=4;
                }
                break;
            case 56:
                {
                alt39=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalJRules.g:1795:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1795:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1796:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1796:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:1797:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:1797:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:1798:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_24);
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

                    // InternalJRules.g:1815:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==18) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==53) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1816:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_52); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:1820:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:1821:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:1821:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:1822:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,53,FOLLOW_24); 

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

                    // InternalJRules.g:1835:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==18) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==54) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRules.g:1836:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,18,FOLLOW_53); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:1840:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:1841:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:1841:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:1842:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,54,FOLLOW_24); 

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

                    // InternalJRules.g:1855:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==18) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==55) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1856:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,18,FOLLOW_54); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:1860:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:1861:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:1861:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:1862:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,55,FOLLOW_24); 

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

                    // InternalJRules.g:1875:4: (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==18) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1876:5: otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_55); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:1880:5: ( (lv_synchronized_8_0= 'synchronized' ) )
                            // InternalJRules.g:1881:6: (lv_synchronized_8_0= 'synchronized' )
                            {
                            // InternalJRules.g:1881:6: (lv_synchronized_8_0= 'synchronized' )
                            // InternalJRules.g:1882:7: lv_synchronized_8_0= 'synchronized'
                            {
                            lv_synchronized_8_0=(Token)match(input,56,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_8_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_0_4_1_0());
                            						

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
                    // InternalJRules.g:1897:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1897:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1898:4: ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1898:4: ( (lv_static_9_0= 'static' ) )
                    // InternalJRules.g:1899:5: (lv_static_9_0= 'static' )
                    {
                    // InternalJRules.g:1899:5: (lv_static_9_0= 'static' )
                    // InternalJRules.g:1900:6: lv_static_9_0= 'static'
                    {
                    lv_static_9_0=(Token)match(input,53,FOLLOW_24); 

                    						newLeafNode(lv_static_9_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:1912:4: (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==18) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==54) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1913:5: otherlv_10= 'and' ( (lv_final_11_0= 'final' ) )
                            {
                            otherlv_10=(Token)match(input,18,FOLLOW_53); 

                            					newLeafNode(otherlv_10, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:1917:5: ( (lv_final_11_0= 'final' ) )
                            // InternalJRules.g:1918:6: (lv_final_11_0= 'final' )
                            {
                            // InternalJRules.g:1918:6: (lv_final_11_0= 'final' )
                            // InternalJRules.g:1919:7: lv_final_11_0= 'final'
                            {
                            lv_final_11_0=(Token)match(input,54,FOLLOW_24); 

                            							newLeafNode(lv_final_11_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_1_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "final", true, "final");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1932:4: (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==18) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==55) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1933:5: otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) )
                            {
                            otherlv_12=(Token)match(input,18,FOLLOW_54); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:1937:5: ( (lv_abstract_13_0= 'abstract' ) )
                            // InternalJRules.g:1938:6: (lv_abstract_13_0= 'abstract' )
                            {
                            // InternalJRules.g:1938:6: (lv_abstract_13_0= 'abstract' )
                            // InternalJRules.g:1939:7: lv_abstract_13_0= 'abstract'
                            {
                            lv_abstract_13_0=(Token)match(input,55,FOLLOW_24); 

                            							newLeafNode(lv_abstract_13_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_1_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1952:4: (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==18) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1953:5: otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) )
                            {
                            otherlv_14=(Token)match(input,18,FOLLOW_55); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:1957:5: ( (lv_synchronized_15_0= 'synchronized' ) )
                            // InternalJRules.g:1958:6: (lv_synchronized_15_0= 'synchronized' )
                            {
                            // InternalJRules.g:1958:6: (lv_synchronized_15_0= 'synchronized' )
                            // InternalJRules.g:1959:7: lv_synchronized_15_0= 'synchronized'
                            {
                            lv_synchronized_15_0=(Token)match(input,56,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_15_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_1_3_1_0());
                            						

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
                    // InternalJRules.g:1974:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1974:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1975:4: ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1975:4: ( (lv_final_16_0= 'final' ) )
                    // InternalJRules.g:1976:5: (lv_final_16_0= 'final' )
                    {
                    // InternalJRules.g:1976:5: (lv_final_16_0= 'final' )
                    // InternalJRules.g:1977:6: lv_final_16_0= 'final'
                    {
                    lv_final_16_0=(Token)match(input,54,FOLLOW_24); 

                    						newLeafNode(lv_final_16_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:1989:4: (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==18) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==55) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:1990:5: otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) )
                            {
                            otherlv_17=(Token)match(input,18,FOLLOW_54); 

                            					newLeafNode(otherlv_17, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:1994:5: ( (lv_abstract_18_0= 'abstract' ) )
                            // InternalJRules.g:1995:6: (lv_abstract_18_0= 'abstract' )
                            {
                            // InternalJRules.g:1995:6: (lv_abstract_18_0= 'abstract' )
                            // InternalJRules.g:1996:7: lv_abstract_18_0= 'abstract'
                            {
                            lv_abstract_18_0=(Token)match(input,55,FOLLOW_24); 

                            							newLeafNode(lv_abstract_18_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_2_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getBlendModifiersRule());
                            							}
                            							setWithLastConsumed(current, "abstract", true, "abstract");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:2009:4: (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==18) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRules.g:2010:5: otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) )
                            {
                            otherlv_19=(Token)match(input,18,FOLLOW_55); 

                            					newLeafNode(otherlv_19, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:2014:5: ( (lv_synchronized_20_0= 'synchronized' ) )
                            // InternalJRules.g:2015:6: (lv_synchronized_20_0= 'synchronized' )
                            {
                            // InternalJRules.g:2015:6: (lv_synchronized_20_0= 'synchronized' )
                            // InternalJRules.g:2016:7: lv_synchronized_20_0= 'synchronized'
                            {
                            lv_synchronized_20_0=(Token)match(input,56,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_20_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_2_2_1_0());
                            						

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
                    // InternalJRules.g:2031:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2031:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2032:4: ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2032:4: ( (lv_abstract_21_0= 'abstract' ) )
                    // InternalJRules.g:2033:5: (lv_abstract_21_0= 'abstract' )
                    {
                    // InternalJRules.g:2033:5: (lv_abstract_21_0= 'abstract' )
                    // InternalJRules.g:2034:6: lv_abstract_21_0= 'abstract'
                    {
                    lv_abstract_21_0=(Token)match(input,55,FOLLOW_24); 

                    						newLeafNode(lv_abstract_21_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:2046:4: (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==18) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalJRules.g:2047:5: otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) )
                            {
                            otherlv_22=(Token)match(input,18,FOLLOW_55); 

                            					newLeafNode(otherlv_22, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:2051:5: ( (lv_synchronized_23_0= 'synchronized' ) )
                            // InternalJRules.g:2052:6: (lv_synchronized_23_0= 'synchronized' )
                            {
                            // InternalJRules.g:2052:6: (lv_synchronized_23_0= 'synchronized' )
                            // InternalJRules.g:2053:7: lv_synchronized_23_0= 'synchronized'
                            {
                            lv_synchronized_23_0=(Token)match(input,56,FOLLOW_2); 

                            							newLeafNode(lv_synchronized_23_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_3_1_1_0());
                            						

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
                    // InternalJRules.g:2068:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:2068:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    // InternalJRules.g:2069:4: (lv_synchronized_24_0= 'synchronized' )
                    {
                    // InternalJRules.g:2069:4: (lv_synchronized_24_0= 'synchronized' )
                    // InternalJRules.g:2070:5: lv_synchronized_24_0= 'synchronized'
                    {
                    lv_synchronized_24_0=(Token)match(input,56,FOLLOW_2); 

                    					newLeafNode(lv_synchronized_24_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_4_0());
                    				

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


    // $ANTLR start "ruleQuantifier"
    // InternalJRules.g:2086:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:2092:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:2093:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:2093:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt40=1;
                }
                break;
            case 58:
                {
                alt40=2;
                }
                break;
            case 59:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalJRules.g:2094:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:2094:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:2095:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2102:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:2102:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:2103:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2110:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:2110:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:2111:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

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


    // $ANTLR start "ruleElementJava"
    // InternalJRules.g:2121:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) ;
    public final Enumerator ruleElementJava() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;


        	enterRule();

        try {
            // InternalJRules.g:2127:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) )
            // InternalJRules.g:2128:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            {
            // InternalJRules.g:2128:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt41=1;
                }
                break;
            case 61:
                {
                alt41=2;
                }
                break;
            case 62:
                {
                alt41=3;
                }
                break;
            case 63:
                {
                alt41=4;
                }
                break;
            case 64:
                {
                alt41=5;
                }
                break;
            case 65:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalJRules.g:2129:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:2129:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:2130:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2137:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:2137:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:2138:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2145:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:2145:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:2146:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2153:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:2153:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:2154:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2161:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:2161:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:2162:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2169:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:2169:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:2170:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getElementJavaAccess().getAttributeEnumLiteralDeclaration_5());
                    			

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
    // $ANTLR end "ruleElementJava"


    // $ANTLR start "ruleNameType"
    // InternalJRules.g:2180:1: ruleNameType returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2186:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRules.g:2187:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRules.g:2187:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt42=1;
                }
                break;
            case 67:
                {
                alt42=2;
                }
                break;
            case 68:
                {
                alt42=3;
                }
                break;
            case 69:
                {
                alt42=4;
                }
                break;
            case 70:
                {
                alt42=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalJRules.g:2188:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRules.g:2188:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRules.g:2189:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2196:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRules.g:2196:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRules.g:2197:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2204:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRules.g:2204:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRules.g:2205:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2212:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRules.g:2212:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRules.g:2213:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2220:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRules.g:2220:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRules.g:2221:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getStartUpperCaseEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNameTypeAccess().getStartUpperCaseEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleNameType"


    // $ANTLR start "ruleNameOperator"
    // InternalJRules.g:2231:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'ends' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contains' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2237:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'ends' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contains' ) ) )
            // InternalJRules.g:2238:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'ends' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contains' ) )
            {
            // InternalJRules.g:2238:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'ends' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contains' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt43=1;
                }
                break;
            case 72:
                {
                alt43=2;
                }
                break;
            case 73:
                {
                alt43=3;
                }
                break;
            case 74:
                {
                alt43=4;
                }
                break;
            case 75:
                {
                alt43=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2239:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRules.g:2239:3: (enumLiteral_0= 'like' )
                    // InternalJRules.g:2240:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2247:3: (enumLiteral_1= 'equal' )
                    {
                    // InternalJRules.g:2247:3: (enumLiteral_1= 'equal' )
                    // InternalJRules.g:2248:4: enumLiteral_1= 'equal'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getEqualEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2255:3: (enumLiteral_2= 'ends' )
                    {
                    // InternalJRules.g:2255:3: (enumLiteral_2= 'ends' )
                    // InternalJRules.g:2256:4: enumLiteral_2= 'ends'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getEndsEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getEndsEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2263:3: (enumLiteral_3= 'start' )
                    {
                    // InternalJRules.g:2263:3: (enumLiteral_3= 'start' )
                    // InternalJRules.g:2264:4: enumLiteral_3= 'start'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getStartEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameOperatorAccess().getStartEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2271:3: (enumLiteral_4= 'contains' )
                    {
                    // InternalJRules.g:2271:3: (enumLiteral_4= 'contains' )
                    // InternalJRules.g:2272:4: enumLiteral_4= 'contains'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getContainsEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNameOperatorAccess().getContainsEnumLiteralDeclaration_4());
                    			

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


    // $ANTLR start "ruleLanguage"
    // InternalJRules.g:2282:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2288:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRules.g:2289:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRules.g:2289:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==76) ) {
                alt44=1;
            }
            else if ( (LA44_0==77) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2290:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRules.g:2290:3: (enumLiteral_0= 'English' )
                    // InternalJRules.g:2291:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2298:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRules.g:2298:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRules.g:2299:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getESPANIOLEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getESPANIOLEnumLiteralDeclaration_1());
                    			

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


    // $ANTLR start "ruleAccessModifier"
    // InternalJRules.g:2309:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:2315:2: ( ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) ) )
            // InternalJRules.g:2316:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) )
            {
            // InternalJRules.g:2316:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt45=1;
                }
                break;
            case 79:
                {
                alt45=2;
                }
                break;
            case 80:
                {
                alt45=3;
                }
                break;
            case 81:
                {
                alt45=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2317:3: (enumLiteral_0= 'Default' )
                    {
                    // InternalJRules.g:2317:3: (enumLiteral_0= 'Default' )
                    // InternalJRules.g:2318:4: enumLiteral_0= 'Default'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2325:3: (enumLiteral_1= 'Public' )
                    {
                    // InternalJRules.g:2325:3: (enumLiteral_1= 'Public' )
                    // InternalJRules.g:2326:4: enumLiteral_1= 'Public'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2333:3: (enumLiteral_2= 'Protected' )
                    {
                    // InternalJRules.g:2333:3: (enumLiteral_2= 'Protected' )
                    // InternalJRules.g:2334:4: enumLiteral_2= 'Protected'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2341:3: (enumLiteral_3= 'Private' )
                    {
                    // InternalJRules.g:2341:3: (enumLiteral_3= 'Private' )
                    // InternalJRules.g:2342:4: enumLiteral_3= 'Private'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_3());
                    			

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

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\24\1\25\16\uffff";
    static final String dfa_3s = "\1\63\1\45\16\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\5\1\7\1\10\1\13\1\14\1\15\1\16\1\6\1\12\1\11\1\2\1\1\1\4";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\4\uffff\1\3\5\uffff\1\4\1\5\3\uffff\1\6\1\uffff\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\16\1\15\4\uffff\1\17\5\uffff\1\12\2\uffff\1\14\1\13",
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
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0E00000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0E00000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0009028C10922000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0009028C10900000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L,0x0000000000000F80L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x000000000000007CL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000080040002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000F80000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x01E0000000000000L,0x000000000003C000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0100000000000000L});

}