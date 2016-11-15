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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "','", "';'", "'no'", "'which'", "'satisfy'", "'or'", "'('", "'and'", "')'", "'is'", "'implemented'", "'subclass'", "'implements'", "'['", "'..'", "'*'", "']'", "'interfaces'", "'extended'", "'numParameters='", "'types='", "'constructor'", "'return'", "'type='", "'initialize'", "'not'", "'empty'", "'name'", "'in'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'{'", "'}'", "'modifiers:'", "'generic'", "'-'", "'static'", "'final'", "'abstract'", "'default'", "'synchronized'", "'one'", "'exists'", "'all'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'='", "'end'", "'start'", "'contain'", "'English'", "'Spanish'", "'public'", "'protected'", "'private'"
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
    public static final int T__82=82;
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
    // InternalJRules.g:72:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )* ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_ProjectName_1_0 = null;

        AntlrDatatypeRuleToken lv_ProjectName_3_0 = null;

        EObject lv_rules_4_0 = null;

        EObject lv_rules_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:78:2: ( (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )* ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )* ) )
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )* ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )* )
            {
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )* ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )* )
            // InternalJRules.g:80:3: otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )* ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )*
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
            					add(
            						current,
            						"ProjectName",
            						lv_ProjectName_1_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:103:3: (otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJRules.g:104:4: otherlv_2= ',' ( (lv_ProjectName_3_0= ruleEString ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_3); 

            	    				newLeafNode(otherlv_2, grammarAccess.getRuleSetAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalJRules.g:108:4: ( (lv_ProjectName_3_0= ruleEString ) )
            	    // InternalJRules.g:109:5: (lv_ProjectName_3_0= ruleEString )
            	    {
            	    // InternalJRules.g:109:5: (lv_ProjectName_3_0= ruleEString )
            	    // InternalJRules.g:110:6: lv_ProjectName_3_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_ProjectName_3_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ProjectName",
            	    							lv_ProjectName_3_0,
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

            // InternalJRules.g:128:3: ( (lv_rules_4_0= ruleRule ) )
            // InternalJRules.g:129:4: (lv_rules_4_0= ruleRule )
            {
            // InternalJRules.g:129:4: (lv_rules_4_0= ruleRule )
            // InternalJRules.g:130:5: lv_rules_4_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_3_0());
            				
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

            otherlv_5=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_4());
            		
            // InternalJRules.g:151:3: ( ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=59 && LA2_0<=61)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJRules.g:152:4: ( (lv_rules_6_0= ruleRule ) ) otherlv_7= ';'
            	    {
            	    // InternalJRules.g:152:4: ( (lv_rules_6_0= ruleRule ) )
            	    // InternalJRules.g:153:5: (lv_rules_6_0= ruleRule )
            	    {
            	    // InternalJRules.g:153:5: (lv_rules_6_0= ruleRule )
            	    // InternalJRules.g:154:6: lv_rules_6_0= ruleRule
            	    {

            	    						newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_5);
            	    lv_rules_6_0=ruleRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    						}
            	    						add(
            	    							current,
            	    							"rules",
            	    							lv_rules_6_0,
            	    							"es.uam.sara.tfg.dsl.JRules.Rule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getRuleSetAccess().getSemicolonKeyword_5_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalJRules.g:180:1: entryRuleSatisfy returns [EObject current=null] : iv_ruleSatisfy= ruleSatisfy EOF ;
    public final EObject entryRuleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSatisfy = null;


        try {
            // InternalJRules.g:180:48: (iv_ruleSatisfy= ruleSatisfy EOF )
            // InternalJRules.g:181:2: iv_ruleSatisfy= ruleSatisfy EOF
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
    // InternalJRules.g:187:1: ruleSatisfy returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers | this_IsGeneric_15= ruleIsGeneric ) ;
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

        EObject this_Empty_9 = null;

        EObject this_NameOperation_10 = null;

        EObject this_NameType_11 = null;

        EObject this_JavaDoc_12 = null;

        EObject this_Contains_13 = null;

        EObject this_Modifiers_14 = null;

        EObject this_IsGeneric_15 = null;



        	enterRule();

        try {
            // InternalJRules.g:193:2: ( (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers | this_IsGeneric_15= ruleIsGeneric ) )
            // InternalJRules.g:194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers | this_IsGeneric_15= ruleIsGeneric )
            {
            // InternalJRules.g:194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers | this_IsGeneric_15= ruleIsGeneric )
            int alt3=16;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalJRules.g:195:3: this_isImplemented_0= ruleisImplemented
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
                    // InternalJRules.g:204:3: this_IsInheritor_1= ruleIsInheritor
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
                    // InternalJRules.g:213:3: this_Implements_2= ruleImplements
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
                    // InternalJRules.g:222:3: this_IsExtended_3= ruleIsExtended
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
                    // InternalJRules.g:231:3: this_Parameter_4= ruleParameter
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
                    // InternalJRules.g:240:3: this_Constructor_5= ruleConstructor
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
                    // InternalJRules.g:249:3: this_Return_6= ruleReturn
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
                    // InternalJRules.g:258:3: this_AttributeType_7= ruleAttributeType
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
                    // InternalJRules.g:267:3: this_Initialize_8= ruleInitialize
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
                    // InternalJRules.g:276:3: this_Empty_9= ruleEmpty
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getEmptyParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Empty_9=ruleEmpty();

                    state._fsp--;


                    			current = this_Empty_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJRules.g:285:3: this_NameOperation_10= ruleNameOperation
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNameOperationParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameOperation_10=ruleNameOperation();

                    state._fsp--;


                    			current = this_NameOperation_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJRules.g:294:3: this_NameType_11= ruleNameType
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNameTypeParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_NameType_11=ruleNameType();

                    state._fsp--;


                    			current = this_NameType_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJRules.g:303:3: this_JavaDoc_12= ruleJavaDoc
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getJavaDocParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_JavaDoc_12=ruleJavaDoc();

                    state._fsp--;


                    			current = this_JavaDoc_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalJRules.g:312:3: this_Contains_13= ruleContains
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getContainsParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Contains_13=ruleContains();

                    state._fsp--;


                    			current = this_Contains_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJRules.g:321:3: this_Modifiers_14= ruleModifiers
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getModifiersParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_Modifiers_14=ruleModifiers();

                    state._fsp--;


                    			current = this_Modifiers_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalJRules.g:330:3: this_IsGeneric_15= ruleIsGeneric
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsGenericParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsGeneric_15=ruleIsGeneric();

                    state._fsp--;


                    			current = this_IsGeneric_15;
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
    // InternalJRules.g:342:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:342:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:343:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:349:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:355:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:356:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:356:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:357:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:365:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:376:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:376:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:377:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:383:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) ;
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
            // InternalJRules.g:389:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) )
            // InternalJRules.g:390:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:390:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            // InternalJRules.g:391:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            {
            // InternalJRules.g:391:3: ( (lv_no_0_0= 'no' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:392:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:392:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:393:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,14,FOLLOW_4); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:405:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:406:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:406:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:407:5: lv_quantifier_1_0= ruleQuantifier
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

            // InternalJRules.g:424:3: ( (lv_element_2_0= ruleElementJava ) )
            // InternalJRules.g:425:4: (lv_element_2_0= ruleElementJava )
            {
            // InternalJRules.g:425:4: (lv_element_2_0= ruleElementJava )
            // InternalJRules.g:426:5: lv_element_2_0= ruleElementJava
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

            // InternalJRules.g:443:3: (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:444:4: otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWhichKeyword_3_0());
                    			
                    // InternalJRules.g:448:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalJRules.g:449:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalJRules.g:449:5: (lv_filter_4_0= ruleFilter )
                    // InternalJRules.g:450:6: lv_filter_4_0= ruleFilter
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

            // InternalJRules.g:468:3: (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:469:4: otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getSatisfyKeyword_4_0());
                    			
                    // InternalJRules.g:473:4: ( (lv_satisfy_6_0= ruleOr ) )
                    // InternalJRules.g:474:5: (lv_satisfy_6_0= ruleOr )
                    {
                    // InternalJRules.g:474:5: (lv_satisfy_6_0= ruleOr )
                    // InternalJRules.g:475:6: lv_satisfy_6_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_4_1_0());
                    					
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


    // $ANTLR start "entryRuleFilter"
    // InternalJRules.g:497:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalJRules.g:497:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalJRules.g:498:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalJRules.g:504:1: ruleFilter returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        EObject lv_filter_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:510:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) )
            // InternalJRules.g:511:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            {
            // InternalJRules.g:511:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            // InternalJRules.g:512:3: ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) )
            {
            // InternalJRules.g:512:3: ( (lv_no_0_0= 'no' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJRules.g:513:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:513:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:514:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,14,FOLLOW_9); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getFilterAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:526:3: ( (lv_filter_1_0= ruleOr ) )
            // InternalJRules.g:527:4: (lv_filter_1_0= ruleOr )
            {
            // InternalJRules.g:527:4: (lv_filter_1_0= ruleOr )
            // InternalJRules.g:528:5: lv_filter_1_0= ruleOr
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
    // InternalJRules.g:549:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:549:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:550:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:556:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:562:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:563:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:563:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:564:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:564:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:565:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:565:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:566:5: lv_op_0_0= ruleAnd
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

            // InternalJRules.g:583:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJRules.g:584:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:588:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:589:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:589:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:590:6: lv_op_2_0= ruleAnd
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
    // InternalJRules.g:612:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:612:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:613:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:619:1: ruleAnd returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_op_1_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_op_5_0 = null;

        EObject lv_op_7_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:625:2: ( ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) ) )
            // InternalJRules.g:626:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) )
            {
            // InternalJRules.g:626:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==21||LA12_0==24||LA12_0==31||(LA12_0>=34 && LA12_0<=35)||LA12_0==39||LA12_0==41||LA12_0==48||LA12_0==51) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:627:3: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' )
                    {
                    // InternalJRules.g:627:3: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' )
                    // InternalJRules.g:628:4: otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAndAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalJRules.g:632:4: ( (lv_op_1_0= ruleSatisfy ) )
                    // InternalJRules.g:633:5: (lv_op_1_0= ruleSatisfy )
                    {
                    // InternalJRules.g:633:5: (lv_op_1_0= ruleSatisfy )
                    // InternalJRules.g:634:6: lv_op_1_0= ruleSatisfy
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_op_1_0=ruleSatisfy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_1_0,
                    							"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:651:4: (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJRules.g:652:5: otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_0_2_0());
                    	    				
                    	    // InternalJRules.g:656:5: ( (lv_op_3_0= ruleSatisfy ) )
                    	    // InternalJRules.g:657:6: (lv_op_3_0= ruleSatisfy )
                    	    {
                    	    // InternalJRules.g:657:6: (lv_op_3_0= ruleSatisfy )
                    	    // InternalJRules.g:658:7: lv_op_3_0= ruleSatisfy
                    	    {

                    	    							newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_0_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_12);
                    	    lv_op_3_0=ruleSatisfy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAndRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"op",
                    	    								lv_op_3_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getAndAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:682:3: ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* )
                    {
                    // InternalJRules.g:682:3: ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* )
                    // InternalJRules.g:683:4: ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )*
                    {
                    // InternalJRules.g:683:4: ( (lv_op_5_0= ruleSatisfy ) )
                    // InternalJRules.g:684:5: (lv_op_5_0= ruleSatisfy )
                    {
                    // InternalJRules.g:684:5: (lv_op_5_0= ruleSatisfy )
                    // InternalJRules.g:685:6: lv_op_5_0= ruleSatisfy
                    {

                    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_op_5_0=ruleSatisfy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAndRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_5_0,
                    							"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRules.g:702:4: (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalJRules.g:703:5: otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	    				
                    	    // InternalJRules.g:707:5: ( (lv_op_7_0= ruleSatisfy ) )
                    	    // InternalJRules.g:708:6: (lv_op_7_0= ruleSatisfy )
                    	    {
                    	    // InternalJRules.g:708:6: (lv_op_7_0= ruleSatisfy )
                    	    // InternalJRules.g:709:7: lv_op_7_0= ruleSatisfy
                    	    {

                    	    							newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_op_7_0=ruleSatisfy();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAndRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"op",
                    	    								lv_op_7_0,
                    	    								"es.uam.sara.tfg.dsl.JRules.Satisfy");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


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
    // InternalJRules.g:732:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:732:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:733:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:739:1: ruleisImplemented returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'implemented' ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:745:2: ( ( () otherlv_1= 'is' otherlv_2= 'implemented' ) )
            // InternalJRules.g:746:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            {
            // InternalJRules.g:746:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            // InternalJRules.g:747:3: () otherlv_1= 'is' otherlv_2= 'implemented'
            {
            // InternalJRules.g:747:3: ()
            // InternalJRules.g:748:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsImplementedAccess().getIsImplementedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_2); 

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
    // InternalJRules.g:766:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRules.g:766:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRules.g:767:2: iv_ruleIsInheritor= ruleIsInheritor EOF
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
    // InternalJRules.g:773:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'subclass' ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:779:2: ( ( () otherlv_1= 'is' otherlv_2= 'subclass' ) )
            // InternalJRules.g:780:2: ( () otherlv_1= 'is' otherlv_2= 'subclass' )
            {
            // InternalJRules.g:780:2: ( () otherlv_1= 'is' otherlv_2= 'subclass' )
            // InternalJRules.g:781:3: () otherlv_1= 'is' otherlv_2= 'subclass'
            {
            // InternalJRules.g:781:3: ()
            // InternalJRules.g:782:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsInheritorAccess().getSubclassKeyword_2());
            		

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
    // InternalJRules.g:800:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:800:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:801:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:807:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements' ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )? otherlv_10= 'interfaces' ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_minInterface_3_0 = null;

        AntlrDatatypeRuleToken lv_maxInterface_5_0 = null;

        AntlrDatatypeRuleToken lv_minInterface_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:813:2: ( ( () otherlv_1= 'implements' ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )? otherlv_10= 'interfaces' ) )
            // InternalJRules.g:814:2: ( () otherlv_1= 'implements' ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )? otherlv_10= 'interfaces' )
            {
            // InternalJRules.g:814:2: ( () otherlv_1= 'implements' ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )? otherlv_10= 'interfaces' )
            // InternalJRules.g:815:3: () otherlv_1= 'implements' ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )? otherlv_10= 'interfaces'
            {
            // InternalJRules.g:815:3: ()
            // InternalJRules.g:816:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsAccess().getImplementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:826:3: ( (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) ) | ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' ) )?
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==25) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_INT||LA13_0==53) ) {
                alt13=2;
            }
            switch (alt13) {
                case 1 :
                    // InternalJRules.g:827:4: (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) )
                    {
                    // InternalJRules.g:827:4: (otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) ) )
                    // InternalJRules.g:828:5: otherlv_2= '[' ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) )
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getLeftSquareBracketKeyword_2_0_0());
                    				
                    // InternalJRules.g:832:5: ( ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) ) )
                    // InternalJRules.g:833:6: ( (lv_minInterface_3_0= ruleEInt ) ) otherlv_4= '..' ( (lv_maxInterface_5_0= ruleEInt ) )
                    {
                    // InternalJRules.g:833:6: ( (lv_minInterface_3_0= ruleEInt ) )
                    // InternalJRules.g:834:7: (lv_minInterface_3_0= ruleEInt )
                    {
                    // InternalJRules.g:834:7: (lv_minInterface_3_0= ruleEInt )
                    // InternalJRules.g:835:8: lv_minInterface_3_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_0_1_0_0());
                    							
                    pushFollow(FOLLOW_18);
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

                    otherlv_4=(Token)match(input,26,FOLLOW_17); 

                    						newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getFullStopFullStopKeyword_2_0_1_1());
                    					
                    // InternalJRules.g:856:6: ( (lv_maxInterface_5_0= ruleEInt ) )
                    // InternalJRules.g:857:7: (lv_maxInterface_5_0= ruleEInt )
                    {
                    // InternalJRules.g:857:7: (lv_maxInterface_5_0= ruleEInt )
                    // InternalJRules.g:858:8: lv_maxInterface_5_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_0_1_2_0());
                    							
                    pushFollow(FOLLOW_19);
                    lv_maxInterface_5_0=ruleEInt();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getImplementsRule());
                    								}
                    								set(
                    									current,
                    									"maxInterface",
                    									lv_maxInterface_5_0,
                    									"es.uam.sara.tfg.dsl.JRules.EInt");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:878:4: ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' )
                    {
                    // InternalJRules.g:878:4: ( ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']' )
                    // InternalJRules.g:879:5: ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' ) otherlv_9= ']'
                    {
                    // InternalJRules.g:879:5: ( ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*' )
                    // InternalJRules.g:880:6: ( (lv_minInterface_6_0= ruleEInt ) ) otherlv_7= '..' otherlv_8= '*'
                    {
                    // InternalJRules.g:880:6: ( (lv_minInterface_6_0= ruleEInt ) )
                    // InternalJRules.g:881:7: (lv_minInterface_6_0= ruleEInt )
                    {
                    // InternalJRules.g:881:7: (lv_minInterface_6_0= ruleEInt )
                    // InternalJRules.g:882:8: lv_minInterface_6_0= ruleEInt
                    {

                    								newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_1_0_0_0());
                    							
                    pushFollow(FOLLOW_18);
                    lv_minInterface_6_0=ruleEInt();

                    state._fsp--;


                    								if (current==null) {
                    									current = createModelElementForParent(grammarAccess.getImplementsRule());
                    								}
                    								set(
                    									current,
                    									"minInterface",
                    									lv_minInterface_6_0,
                    									"es.uam.sara.tfg.dsl.JRules.EInt");
                    								afterParserOrEnumRuleCall();
                    							

                    }


                    }

                    otherlv_7=(Token)match(input,26,FOLLOW_20); 

                    						newLeafNode(otherlv_7, grammarAccess.getImplementsAccess().getFullStopFullStopKeyword_2_1_0_1());
                    					
                    otherlv_8=(Token)match(input,27,FOLLOW_21); 

                    						newLeafNode(otherlv_8, grammarAccess.getImplementsAccess().getAsteriskKeyword_2_1_0_2());
                    					

                    }

                    otherlv_9=(Token)match(input,28,FOLLOW_19); 

                    					newLeafNode(otherlv_9, grammarAccess.getImplementsAccess().getRightSquareBracketKeyword_2_1_1());
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getImplementsAccess().getInterfacesKeyword_3());
            		

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
    // InternalJRules.g:922:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRules.g:922:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRules.g:923:2: iv_ruleIsExtended= ruleIsExtended EOF
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
    // InternalJRules.g:929:1: ruleIsExtended returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'extended' ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:935:2: ( ( () otherlv_1= 'is' otherlv_2= 'extended' ) )
            // InternalJRules.g:936:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            {
            // InternalJRules.g:936:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            // InternalJRules.g:937:3: () otherlv_1= 'is' otherlv_2= 'extended'
            {
            // InternalJRules.g:937:3: ()
            // InternalJRules.g:938:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsExtendedAccess().getIsExtendedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getIsExtendedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalJRules.g:956:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:956:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:957:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:963:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) ;
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
            // InternalJRules.g:969:2: ( (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) )
            // InternalJRules.g:970:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            {
            // InternalJRules.g:970:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            // InternalJRules.g:971:3: otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNumParametersKeyword_0());
            		
            // InternalJRules.g:975:3: ( (lv_numParam_1_0= ruleEInt ) )
            // InternalJRules.g:976:4: (lv_numParam_1_0= ruleEInt )
            {
            // InternalJRules.g:976:4: (lv_numParam_1_0= ruleEInt )
            // InternalJRules.g:977:5: lv_numParam_1_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNumParamEIntParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_13);
            lv_numParam_1_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"numParam",
            						lv_numParam_1_0,
            						"es.uam.sara.tfg.dsl.JRules.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:994:3: (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==32) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalJRules.g:995:4: otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAndKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,32,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,25,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_2());
                    			
                    // InternalJRules.g:1007:4: ( (lv_typesParam_5_0= ruleEString ) )
                    // InternalJRules.g:1008:5: (lv_typesParam_5_0= ruleEString )
                    {
                    // InternalJRules.g:1008:5: (lv_typesParam_5_0= ruleEString )
                    // InternalJRules.g:1009:6: lv_typesParam_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_25);
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

                    // InternalJRules.g:1026:4: (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==12) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalJRules.g:1027:5: otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalJRules.g:1031:5: ( (lv_typesParam_7_0= ruleEString ) )
                    	    // InternalJRules.g:1032:6: (lv_typesParam_7_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:1032:6: (lv_typesParam_7_0= ruleEString )
                    	    // InternalJRules.g:1033:7: lv_typesParam_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,28,FOLLOW_2); 

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
    // InternalJRules.g:1060:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1060:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1061:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1067:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1073:2: ( ( () otherlv_1= 'is' otherlv_2= 'constructor' ) )
            // InternalJRules.g:1074:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            {
            // InternalJRules.g:1074:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            // InternalJRules.g:1075:3: () otherlv_1= 'is' otherlv_2= 'constructor'
            {
            // InternalJRules.g:1075:3: ()
            // InternalJRules.g:1076:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_26); 

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
    // InternalJRules.g:1094:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1094:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1095:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1101:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1107:2: ( (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) )
            // InternalJRules.g:1108:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            {
            // InternalJRules.g:1108:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            // InternalJRules.g:1109:3: otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1117:3: ( (lv_returnType_2_0= ruleEString ) )
            // InternalJRules.g:1118:4: (lv_returnType_2_0= ruleEString )
            {
            // InternalJRules.g:1118:4: (lv_returnType_2_0= ruleEString )
            // InternalJRules.g:1119:5: lv_returnType_2_0= ruleEString
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
    // InternalJRules.g:1140:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1140:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1141:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1147:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1153:2: ( (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRules.g:1154:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRules.g:1154:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRules.g:1155:3: otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1159:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRules.g:1160:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRules.g:1160:4: (lv_Type_1_0= ruleEString )
            // InternalJRules.g:1161:5: lv_Type_1_0= ruleEString
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
    // InternalJRules.g:1182:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1182:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1183:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:1189:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1195:2: ( ( () otherlv_1= 'is' otherlv_2= 'initialize' ) )
            // InternalJRules.g:1196:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            {
            // InternalJRules.g:1196:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            // InternalJRules.g:1197:3: () otherlv_1= 'is' otherlv_2= 'initialize'
            {
            // InternalJRules.g:1197:3: ()
            // InternalJRules.g:1198:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_28); 

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


    // $ANTLR start "entryRuleEmpty"
    // InternalJRules.g:1216:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:1216:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:1217:2: iv_ruleEmpty= ruleEmpty EOF
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
    // InternalJRules.g:1223:1: ruleEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJRules.g:1229:2: ( ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // InternalJRules.g:1230:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // InternalJRules.g:1230:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            // InternalJRules.g:1231:3: () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // InternalJRules.g:1231:3: ()
            // InternalJRules.g:1232:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1());
            		
            // InternalJRules.g:1242:3: ( (lv_no_2_0= 'not' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalJRules.g:1243:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1243:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1244:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,37,FOLLOW_30); 

                    					newLeafNode(lv_no_2_0, grammarAccess.getEmptyAccess().getNoNotKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEmptyRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "not");
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEmptyAccess().getEmptyKeyword_3());
            		

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


    // $ANTLR start "entryRuleNameOperation"
    // InternalJRules.g:1264:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:1264:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:1265:2: iv_ruleNameOperation= ruleNameOperation EOF
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
    // InternalJRules.g:1271:1: ruleNameOperation returns [EObject current=null] : ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleNameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_Language_5_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1277:2: ( ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:1278:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:1278:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            // InternalJRules.g:1279:3: () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            {
            // InternalJRules.g:1279:3: ()
            // InternalJRules.g:1280:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameOperationAccess().getNameOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getNameOperationAccess().getNameKeyword_1());
            		
            // InternalJRules.g:1290:3: ( (lv_operator_2_0= ruleNameOperator ) )
            // InternalJRules.g:1291:4: (lv_operator_2_0= ruleNameOperator )
            {
            // InternalJRules.g:1291:4: (lv_operator_2_0= ruleNameOperator )
            // InternalJRules.g:1292:5: lv_operator_2_0= ruleNameOperator
            {

            					newCompositeNode(grammarAccess.getNameOperationAccess().getOperatorNameOperatorEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_operator_2_0=ruleNameOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameOperationRule());
            					}
            					set(
            						current,
            						"operator",
            						lv_operator_2_0,
            						"es.uam.sara.tfg.dsl.JRules.NameOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:1309:3: ( (lv_name_3_0= ruleEString ) )
            // InternalJRules.g:1310:4: (lv_name_3_0= ruleEString )
            {
            // InternalJRules.g:1310:4: (lv_name_3_0= ruleEString )
            // InternalJRules.g:1311:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNameOperationAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_32);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameOperationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"es.uam.sara.tfg.dsl.JRules.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRules.g:1328:3: (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==12) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:1329:4: otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getCommaKeyword_4_0());
                    			
                    // InternalJRules.g:1333:4: ( (lv_Language_5_0= ruleLanguage ) )
                    // InternalJRules.g:1334:5: (lv_Language_5_0= ruleLanguage )
                    {
                    // InternalJRules.g:1334:5: (lv_Language_5_0= ruleLanguage )
                    // InternalJRules.g:1335:6: lv_Language_5_0= ruleLanguage
                    {

                    						newCompositeNode(grammarAccess.getNameOperationAccess().getLanguageLanguageEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_Language_5_0=ruleLanguage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameOperationRule());
                    						}
                    						set(
                    							current,
                    							"Language",
                    							lv_Language_5_0,
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
    // InternalJRules.g:1357:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:1357:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:1358:2: iv_ruleNameType= ruleNameType EOF
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
    // InternalJRules.g:1364:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'in' ( (lv_type_2_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1370:2: ( (otherlv_0= 'name' otherlv_1= 'in' ( (lv_type_2_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:1371:2: (otherlv_0= 'name' otherlv_1= 'in' ( (lv_type_2_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:1371:2: (otherlv_0= 'name' otherlv_1= 'in' ( (lv_type_2_0= ruleNameCheck ) ) )
            // InternalJRules.g:1372:3: otherlv_0= 'name' otherlv_1= 'in' ( (lv_type_2_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getInKeyword_1());
            		
            // InternalJRules.g:1380:3: ( (lv_type_2_0= ruleNameCheck ) )
            // InternalJRules.g:1381:4: (lv_type_2_0= ruleNameCheck )
            {
            // InternalJRules.g:1381:4: (lv_type_2_0= ruleNameCheck )
            // InternalJRules.g:1382:5: lv_type_2_0= ruleNameCheck
            {

            					newCompositeNode(grammarAccess.getNameTypeAccess().getTypeNameCheckEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleNameCheck();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNameTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
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
    // InternalJRules.g:1403:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:1403:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:1404:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:1410:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
    public final EObject ruleJavaDoc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_author_2_0=null;
        Token lv_parameter_3_0=null;
        Token lv_return_4_0=null;
        Token lv_version_5_0=null;
        Token lv_throws_6_0=null;
        Token lv_see_7_0=null;


        	enterRule();

        try {
            // InternalJRules.g:1416:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRules.g:1417:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRules.g:1417:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRules.g:1418:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRules.g:1418:3: ()
            // InternalJRules.g:1419:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,41,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
            		
            // InternalJRules.g:1429:3: ( (lv_author_2_0= '@author' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:1430:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRules.g:1430:4: (lv_author_2_0= '@author' )
                    // InternalJRules.g:1431:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,42,FOLLOW_37); 

                    					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1443:3: ( (lv_parameter_3_0= '@parameter' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==43) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1444:4: (lv_parameter_3_0= '@parameter' )
                    {
                    // InternalJRules.g:1444:4: (lv_parameter_3_0= '@parameter' )
                    // InternalJRules.g:1445:5: lv_parameter_3_0= '@parameter'
                    {
                    lv_parameter_3_0=(Token)match(input,43,FOLLOW_38); 

                    					newLeafNode(lv_parameter_3_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1457:3: ( (lv_return_4_0= '@return' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==44) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1458:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRules.g:1458:4: (lv_return_4_0= '@return' )
                    // InternalJRules.g:1459:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,44,FOLLOW_39); 

                    					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1471:3: ( (lv_version_5_0= '@version' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1472:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRules.g:1472:4: (lv_version_5_0= '@version' )
                    // InternalJRules.g:1473:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,45,FOLLOW_40); 

                    					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1485:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1486:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRules.g:1486:4: (lv_throws_6_0= '@throws' )
                    // InternalJRules.g:1487:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,46,FOLLOW_41); 

                    					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1499:3: ( (lv_see_7_0= '@see' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==47) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1500:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRules.g:1500:4: (lv_see_7_0= '@see' )
                    // InternalJRules.g:1501:5: lv_see_7_0= '@see'
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
    // InternalJRules.g:1517:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:1517:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:1518:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:1524:1: ruleContains returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1530:2: ( (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) )
            // InternalJRules.g:1531:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            {
            // InternalJRules.g:1531:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            // InternalJRules.g:1532:3: otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_42); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJRules.g:1540:3: ( (lv_which_2_0= ruleRule ) )
            // InternalJRules.g:1541:4: (lv_which_2_0= ruleRule )
            {
            // InternalJRules.g:1541:4: (lv_which_2_0= ruleRule )
            // InternalJRules.g:1542:5: lv_which_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_43);
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
    // InternalJRules.g:1567:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:1567:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:1568:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:1574:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers:' otherlv_1= '[' ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) ) otherlv_12= ']' ) ;
    public final EObject ruleModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_blend_3_0 = null;

        EObject lv_blend_7_0 = null;

        EObject lv_blend_9_0 = null;

        EObject lv_blend_11_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1580:2: ( (otherlv_0= 'modifiers:' otherlv_1= '[' ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) ) otherlv_12= ']' ) )
            // InternalJRules.g:1581:2: (otherlv_0= 'modifiers:' otherlv_1= '[' ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) ) otherlv_12= ']' )
            {
            // InternalJRules.g:1581:2: (otherlv_0= 'modifiers:' otherlv_1= '[' ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) ) otherlv_12= ']' )
            // InternalJRules.g:1582:3: otherlv_0= 'modifiers:' otherlv_1= '[' ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) ) otherlv_12= ']'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_44); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalJRules.g:1590:3: ( (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* ) | ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==18) ) {
                alt26=1;
            }
            else if ( ((LA26_0>=54 && LA26_0<=58)||(LA26_0>=80 && LA26_0<=82)) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1591:4: (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* )
                    {
                    // InternalJRules.g:1591:4: (otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* )
                    // InternalJRules.g:1592:5: otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )*
                    {
                    otherlv_2=(Token)match(input,18,FOLLOW_44); 

                    					newLeafNode(otherlv_2, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_2_0_0());
                    				
                    // InternalJRules.g:1596:5: ( (lv_blend_3_0= ruleBlendModifiers ) )
                    // InternalJRules.g:1597:6: (lv_blend_3_0= ruleBlendModifiers )
                    {
                    // InternalJRules.g:1597:6: (lv_blend_3_0= ruleBlendModifiers )
                    // InternalJRules.g:1598:7: lv_blend_3_0= ruleBlendModifiers
                    {

                    							newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_45);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_46); 

                    					newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_2_0_2());
                    				
                    // InternalJRules.g:1619:5: (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalJRules.g:1620:6: otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')'
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_47); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getOrKeyword_2_0_3_0());
                    	    					
                    	    otherlv_6=(Token)match(input,18,FOLLOW_44); 

                    	    						newLeafNode(otherlv_6, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_2_0_3_1());
                    	    					
                    	    // InternalJRules.g:1628:6: ( (lv_blend_7_0= ruleBlendModifiers ) )
                    	    // InternalJRules.g:1629:7: (lv_blend_7_0= ruleBlendModifiers )
                    	    {
                    	    // InternalJRules.g:1629:7: (lv_blend_7_0= ruleBlendModifiers )
                    	    // InternalJRules.g:1630:8: lv_blend_7_0= ruleBlendModifiers
                    	    {

                    	    								newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_0_3_2_0());
                    	    							
                    	    pushFollow(FOLLOW_45);
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

                    	    otherlv_8=(Token)match(input,20,FOLLOW_46); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_2_0_3_3());
                    	    					

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1654:4: ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* )
                    {
                    // InternalJRules.g:1654:4: ( ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )* )
                    // InternalJRules.g:1655:5: ( (lv_blend_9_0= ruleBlendModifiers ) ) (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )*
                    {
                    // InternalJRules.g:1655:5: ( (lv_blend_9_0= ruleBlendModifiers ) )
                    // InternalJRules.g:1656:6: (lv_blend_9_0= ruleBlendModifiers )
                    {
                    // InternalJRules.g:1656:6: (lv_blend_9_0= ruleBlendModifiers )
                    // InternalJRules.g:1657:7: lv_blend_9_0= ruleBlendModifiers
                    {

                    							newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_1_0_0());
                    						
                    pushFollow(FOLLOW_46);
                    lv_blend_9_0=ruleBlendModifiers();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getModifiersRule());
                    							}
                    							add(
                    								current,
                    								"blend",
                    								lv_blend_9_0,
                    								"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalJRules.g:1674:5: (otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==17) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalJRules.g:1675:6: otherlv_10= 'or' ( (lv_blend_11_0= ruleBlendModifiers ) )
                    	    {
                    	    otherlv_10=(Token)match(input,17,FOLLOW_44); 

                    	    						newLeafNode(otherlv_10, grammarAccess.getModifiersAccess().getOrKeyword_2_1_1_0());
                    	    					
                    	    // InternalJRules.g:1679:6: ( (lv_blend_11_0= ruleBlendModifiers ) )
                    	    // InternalJRules.g:1680:7: (lv_blend_11_0= ruleBlendModifiers )
                    	    {
                    	    // InternalJRules.g:1680:7: (lv_blend_11_0= ruleBlendModifiers )
                    	    // InternalJRules.g:1681:8: lv_blend_11_0= ruleBlendModifiers
                    	    {

                    	    								newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_1_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_46);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getModifiersAccess().getRightSquareBracketKeyword_3());
            		

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


    // $ANTLR start "entryRuleIsGeneric"
    // InternalJRules.g:1709:1: entryRuleIsGeneric returns [EObject current=null] : iv_ruleIsGeneric= ruleIsGeneric EOF ;
    public final EObject entryRuleIsGeneric() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsGeneric = null;


        try {
            // InternalJRules.g:1709:50: (iv_ruleIsGeneric= ruleIsGeneric EOF )
            // InternalJRules.g:1710:2: iv_ruleIsGeneric= ruleIsGeneric EOF
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
    // InternalJRules.g:1716:1: ruleIsGeneric returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'generic' ) ;
    public final EObject ruleIsGeneric() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1722:2: ( ( () otherlv_1= 'is' otherlv_2= 'generic' ) )
            // InternalJRules.g:1723:2: ( () otherlv_1= 'is' otherlv_2= 'generic' )
            {
            // InternalJRules.g:1723:2: ( () otherlv_1= 'is' otherlv_2= 'generic' )
            // InternalJRules.g:1724:3: () otherlv_1= 'is' otherlv_2= 'generic'
            {
            // InternalJRules.g:1724:3: ()
            // InternalJRules.g:1725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsGenericAccess().getIsGenericAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getIsGenericAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getIsGenericAccess().getGenericKeyword_2());
            		

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


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:1743:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:1743:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:1744:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:1750:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1756:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1757:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1757:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1758:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1758:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==53) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1759:4: kw= '-'
                    {
                    kw=(Token)match(input,53,FOLLOW_49); 

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
    // InternalJRules.g:1776:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:1776:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:1777:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:1783:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:1789:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) ) )
            // InternalJRules.g:1790:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:1790:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? ) | ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? ) | ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? ) | ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_35_0= 'synchronized' ) ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 80:
            case 81:
            case 82:
                {
                alt43=1;
                }
                break;
            case 54:
                {
                alt43=2;
                }
                break;
            case 55:
                {
                alt43=3;
                }
                break;
            case 56:
                {
                alt43=4;
                }
                break;
            case 57:
                {
                alt43=5;
                }
                break;
            case 58:
                {
                alt43=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalJRules.g:1791:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1791:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1792:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )? (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1792:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:1793:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:1793:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:1794:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
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

                    // InternalJRules.g:1811:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==54) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJRules.g:1812:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_50); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:1816:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:1817:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:1817:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:1818:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,54,FOLLOW_13); 

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

                    // InternalJRules.g:1831:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==19) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==55) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1832:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:1836:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:1837:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:1837:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:1838:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,55,FOLLOW_13); 

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

                    // InternalJRules.g:1851:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==19) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==56) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRules.g:1852:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_52); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:1856:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:1857:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:1857:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:1858:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,56,FOLLOW_13); 

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

                    // InternalJRules.g:1871:4: (otherlv_7= 'and' ( (lv_default_8_0= 'default' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==19) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==57) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1872:5: otherlv_7= 'and' ( (lv_default_8_0= 'default' ) )
                            {
                            otherlv_7=(Token)match(input,19,FOLLOW_53); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:1876:5: ( (lv_default_8_0= 'default' ) )
                            // InternalJRules.g:1877:6: (lv_default_8_0= 'default' )
                            {
                            // InternalJRules.g:1877:6: (lv_default_8_0= 'default' )
                            // InternalJRules.g:1878:7: lv_default_8_0= 'default'
                            {
                            lv_default_8_0=(Token)match(input,57,FOLLOW_13); 

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

                    // InternalJRules.g:1891:4: (otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==19) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1892:5: otherlv_9= 'and' ( (lv_synchronized_10_0= 'synchronized' ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_54); 

                            					newLeafNode(otherlv_9, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_5_0());
                            				
                            // InternalJRules.g:1896:5: ( (lv_synchronized_10_0= 'synchronized' ) )
                            // InternalJRules.g:1897:6: (lv_synchronized_10_0= 'synchronized' )
                            {
                            // InternalJRules.g:1897:6: (lv_synchronized_10_0= 'synchronized' )
                            // InternalJRules.g:1898:7: lv_synchronized_10_0= 'synchronized'
                            {
                            lv_synchronized_10_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalJRules.g:1913:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1913:3: ( ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1914:4: ( (lv_static_11_0= 'static' ) ) (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )? (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )? (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )? (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1914:4: ( (lv_static_11_0= 'static' ) )
                    // InternalJRules.g:1915:5: (lv_static_11_0= 'static' )
                    {
                    // InternalJRules.g:1915:5: (lv_static_11_0= 'static' )
                    // InternalJRules.g:1916:6: lv_static_11_0= 'static'
                    {
                    lv_static_11_0=(Token)match(input,54,FOLLOW_13); 

                    						newLeafNode(lv_static_11_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:1928:4: (otherlv_12= 'and' ( (lv_final_13_0= 'final' ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==19) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==55) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1929:5: otherlv_12= 'and' ( (lv_final_13_0= 'final' ) )
                            {
                            otherlv_12=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:1933:5: ( (lv_final_13_0= 'final' ) )
                            // InternalJRules.g:1934:6: (lv_final_13_0= 'final' )
                            {
                            // InternalJRules.g:1934:6: (lv_final_13_0= 'final' )
                            // InternalJRules.g:1935:7: lv_final_13_0= 'final'
                            {
                            lv_final_13_0=(Token)match(input,55,FOLLOW_13); 

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

                    // InternalJRules.g:1948:4: (otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==19) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==56) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1949:5: otherlv_14= 'and' ( (lv_abstract_15_0= 'abstract' ) )
                            {
                            otherlv_14=(Token)match(input,19,FOLLOW_52); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:1953:5: ( (lv_abstract_15_0= 'abstract' ) )
                            // InternalJRules.g:1954:6: (lv_abstract_15_0= 'abstract' )
                            {
                            // InternalJRules.g:1954:6: (lv_abstract_15_0= 'abstract' )
                            // InternalJRules.g:1955:7: lv_abstract_15_0= 'abstract'
                            {
                            lv_abstract_15_0=(Token)match(input,56,FOLLOW_13); 

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

                    // InternalJRules.g:1968:4: (otherlv_16= 'and' ( (lv_default_17_0= 'default' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==19) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==57) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1969:5: otherlv_16= 'and' ( (lv_default_17_0= 'default' ) )
                            {
                            otherlv_16=(Token)match(input,19,FOLLOW_53); 

                            					newLeafNode(otherlv_16, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:1973:5: ( (lv_default_17_0= 'default' ) )
                            // InternalJRules.g:1974:6: (lv_default_17_0= 'default' )
                            {
                            // InternalJRules.g:1974:6: (lv_default_17_0= 'default' )
                            // InternalJRules.g:1975:7: lv_default_17_0= 'default'
                            {
                            lv_default_17_0=(Token)match(input,57,FOLLOW_13); 

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

                    // InternalJRules.g:1988:4: (otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==19) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:1989:5: otherlv_18= 'and' ( (lv_synchronized_19_0= 'synchronized' ) )
                            {
                            otherlv_18=(Token)match(input,19,FOLLOW_54); 

                            					newLeafNode(otherlv_18, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_4_0());
                            				
                            // InternalJRules.g:1993:5: ( (lv_synchronized_19_0= 'synchronized' ) )
                            // InternalJRules.g:1994:6: (lv_synchronized_19_0= 'synchronized' )
                            {
                            // InternalJRules.g:1994:6: (lv_synchronized_19_0= 'synchronized' )
                            // InternalJRules.g:1995:7: lv_synchronized_19_0= 'synchronized'
                            {
                            lv_synchronized_19_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalJRules.g:2010:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2010:3: ( ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2011:4: ( (lv_final_20_0= 'final' ) ) (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )? (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )? (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2011:4: ( (lv_final_20_0= 'final' ) )
                    // InternalJRules.g:2012:5: (lv_final_20_0= 'final' )
                    {
                    // InternalJRules.g:2012:5: (lv_final_20_0= 'final' )
                    // InternalJRules.g:2013:6: lv_final_20_0= 'final'
                    {
                    lv_final_20_0=(Token)match(input,55,FOLLOW_13); 

                    						newLeafNode(lv_final_20_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:2025:4: (otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==19) ) {
                        int LA37_1 = input.LA(2);

                        if ( (LA37_1==56) ) {
                            alt37=1;
                        }
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRules.g:2026:5: otherlv_21= 'and' ( (lv_abstract_22_0= 'abstract' ) )
                            {
                            otherlv_21=(Token)match(input,19,FOLLOW_52); 

                            					newLeafNode(otherlv_21, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:2030:5: ( (lv_abstract_22_0= 'abstract' ) )
                            // InternalJRules.g:2031:6: (lv_abstract_22_0= 'abstract' )
                            {
                            // InternalJRules.g:2031:6: (lv_abstract_22_0= 'abstract' )
                            // InternalJRules.g:2032:7: lv_abstract_22_0= 'abstract'
                            {
                            lv_abstract_22_0=(Token)match(input,56,FOLLOW_13); 

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

                    // InternalJRules.g:2045:4: (otherlv_23= 'and' ( (lv_default_24_0= 'default' ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==19) ) {
                        int LA38_1 = input.LA(2);

                        if ( (LA38_1==57) ) {
                            alt38=1;
                        }
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalJRules.g:2046:5: otherlv_23= 'and' ( (lv_default_24_0= 'default' ) )
                            {
                            otherlv_23=(Token)match(input,19,FOLLOW_53); 

                            					newLeafNode(otherlv_23, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:2050:5: ( (lv_default_24_0= 'default' ) )
                            // InternalJRules.g:2051:6: (lv_default_24_0= 'default' )
                            {
                            // InternalJRules.g:2051:6: (lv_default_24_0= 'default' )
                            // InternalJRules.g:2052:7: lv_default_24_0= 'default'
                            {
                            lv_default_24_0=(Token)match(input,57,FOLLOW_13); 

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

                    // InternalJRules.g:2065:4: (otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) ) )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==19) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalJRules.g:2066:5: otherlv_25= 'and' ( (lv_synchronized_26_0= 'synchronized' ) )
                            {
                            otherlv_25=(Token)match(input,19,FOLLOW_54); 

                            					newLeafNode(otherlv_25, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_3_0());
                            				
                            // InternalJRules.g:2070:5: ( (lv_synchronized_26_0= 'synchronized' ) )
                            // InternalJRules.g:2071:6: (lv_synchronized_26_0= 'synchronized' )
                            {
                            // InternalJRules.g:2071:6: (lv_synchronized_26_0= 'synchronized' )
                            // InternalJRules.g:2072:7: lv_synchronized_26_0= 'synchronized'
                            {
                            lv_synchronized_26_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalJRules.g:2087:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2087:3: ( ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2088:4: ( (lv_abstract_27_0= 'abstract' ) ) (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )? (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2088:4: ( (lv_abstract_27_0= 'abstract' ) )
                    // InternalJRules.g:2089:5: (lv_abstract_27_0= 'abstract' )
                    {
                    // InternalJRules.g:2089:5: (lv_abstract_27_0= 'abstract' )
                    // InternalJRules.g:2090:6: lv_abstract_27_0= 'abstract'
                    {
                    lv_abstract_27_0=(Token)match(input,56,FOLLOW_13); 

                    						newLeafNode(lv_abstract_27_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:2102:4: (otherlv_28= 'and' ( (lv_default_29_0= 'default' ) ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==19) ) {
                        int LA40_1 = input.LA(2);

                        if ( (LA40_1==57) ) {
                            alt40=1;
                        }
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalJRules.g:2103:5: otherlv_28= 'and' ( (lv_default_29_0= 'default' ) )
                            {
                            otherlv_28=(Token)match(input,19,FOLLOW_53); 

                            					newLeafNode(otherlv_28, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:2107:5: ( (lv_default_29_0= 'default' ) )
                            // InternalJRules.g:2108:6: (lv_default_29_0= 'default' )
                            {
                            // InternalJRules.g:2108:6: (lv_default_29_0= 'default' )
                            // InternalJRules.g:2109:7: lv_default_29_0= 'default'
                            {
                            lv_default_29_0=(Token)match(input,57,FOLLOW_13); 

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

                    // InternalJRules.g:2122:4: (otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) ) )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==19) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalJRules.g:2123:5: otherlv_30= 'and' ( (lv_synchronized_31_0= 'synchronized' ) )
                            {
                            otherlv_30=(Token)match(input,19,FOLLOW_54); 

                            					newLeafNode(otherlv_30, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_2_0());
                            				
                            // InternalJRules.g:2127:5: ( (lv_synchronized_31_0= 'synchronized' ) )
                            // InternalJRules.g:2128:6: (lv_synchronized_31_0= 'synchronized' )
                            {
                            // InternalJRules.g:2128:6: (lv_synchronized_31_0= 'synchronized' )
                            // InternalJRules.g:2129:7: lv_synchronized_31_0= 'synchronized'
                            {
                            lv_synchronized_31_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalJRules.g:2144:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2144:3: ( ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2145:4: ( (lv_default_32_0= 'default' ) ) (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2145:4: ( (lv_default_32_0= 'default' ) )
                    // InternalJRules.g:2146:5: (lv_default_32_0= 'default' )
                    {
                    // InternalJRules.g:2146:5: (lv_default_32_0= 'default' )
                    // InternalJRules.g:2147:6: lv_default_32_0= 'default'
                    {
                    lv_default_32_0=(Token)match(input,57,FOLLOW_13); 

                    						newLeafNode(lv_default_32_0, grammarAccess.getBlendModifiersAccess().getDefaultDefaultKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "default", true, "default");
                    					

                    }


                    }

                    // InternalJRules.g:2159:4: (otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==19) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalJRules.g:2160:5: otherlv_33= 'and' ( (lv_synchronized_34_0= 'synchronized' ) )
                            {
                            otherlv_33=(Token)match(input,19,FOLLOW_54); 

                            					newLeafNode(otherlv_33, grammarAccess.getBlendModifiersAccess().getAndKeyword_4_1_0());
                            				
                            // InternalJRules.g:2164:5: ( (lv_synchronized_34_0= 'synchronized' ) )
                            // InternalJRules.g:2165:6: (lv_synchronized_34_0= 'synchronized' )
                            {
                            // InternalJRules.g:2165:6: (lv_synchronized_34_0= 'synchronized' )
                            // InternalJRules.g:2166:7: lv_synchronized_34_0= 'synchronized'
                            {
                            lv_synchronized_34_0=(Token)match(input,58,FOLLOW_2); 

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
                    // InternalJRules.g:2181:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:2181:3: ( (lv_synchronized_35_0= 'synchronized' ) )
                    // InternalJRules.g:2182:4: (lv_synchronized_35_0= 'synchronized' )
                    {
                    // InternalJRules.g:2182:4: (lv_synchronized_35_0= 'synchronized' )
                    // InternalJRules.g:2183:5: lv_synchronized_35_0= 'synchronized'
                    {
                    lv_synchronized_35_0=(Token)match(input,58,FOLLOW_2); 

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


    // $ANTLR start "ruleQuantifier"
    // InternalJRules.g:2199:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:2205:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:2206:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:2206:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt44=1;
                }
                break;
            case 60:
                {
                alt44=2;
                }
                break;
            case 61:
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2207:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:2207:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:2208:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2215:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:2215:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:2216:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2223:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:2223:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:2224:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

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
    // InternalJRules.g:2234:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) ;
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
            // InternalJRules.g:2240:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) )
            // InternalJRules.g:2241:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            {
            // InternalJRules.g:2241:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            int alt45=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt45=1;
                }
                break;
            case 63:
                {
                alt45=2;
                }
                break;
            case 64:
                {
                alt45=3;
                }
                break;
            case 65:
                {
                alt45=4;
                }
                break;
            case 66:
                {
                alt45=5;
                }
                break;
            case 67:
                {
                alt45=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2242:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:2242:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:2243:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2250:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:2250:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:2251:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2258:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:2258:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:2259:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2266:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:2266:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:2267:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2274:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:2274:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:2275:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2282:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:2282:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:2283:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_2); 

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


    // $ANTLR start "ruleNameCheck"
    // InternalJRules.g:2293:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2299:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRules.g:2300:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRules.g:2300:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt46=5;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt46=1;
                }
                break;
            case 69:
                {
                alt46=2;
                }
                break;
            case 70:
                {
                alt46=3;
                }
                break;
            case 71:
                {
                alt46=4;
                }
                break;
            case 72:
                {
                alt46=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalJRules.g:2301:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRules.g:2301:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRules.g:2302:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2309:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRules.g:2309:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRules.g:2310:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2317:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRules.g:2317:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRules.g:2318:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2325:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRules.g:2325:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRules.g:2326:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2333:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRules.g:2333:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRules.g:2334:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

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


    // $ANTLR start "ruleNameOperator"
    // InternalJRules.g:2344:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2350:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) )
            // InternalJRules.g:2351:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            {
            // InternalJRules.g:2351:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= '=' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            int alt47=5;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt47=1;
                }
                break;
            case 74:
                {
                alt47=2;
                }
                break;
            case 75:
                {
                alt47=3;
                }
                break;
            case 76:
                {
                alt47=4;
                }
                break;
            case 77:
                {
                alt47=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalJRules.g:2352:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRules.g:2352:3: (enumLiteral_0= 'like' )
                    // InternalJRules.g:2353:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2360:3: (enumLiteral_1= '=' )
                    {
                    // InternalJRules.g:2360:3: (enumLiteral_1= '=' )
                    // InternalJRules.g:2361:4: enumLiteral_1= '='
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2368:3: (enumLiteral_2= 'end' )
                    {
                    // InternalJRules.g:2368:3: (enumLiteral_2= 'end' )
                    // InternalJRules.g:2369:4: enumLiteral_2= 'end'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2376:3: (enumLiteral_3= 'start' )
                    {
                    // InternalJRules.g:2376:3: (enumLiteral_3= 'start' )
                    // InternalJRules.g:2377:4: enumLiteral_3= 'start'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2384:3: (enumLiteral_4= 'contain' )
                    {
                    // InternalJRules.g:2384:3: (enumLiteral_4= 'contain' )
                    // InternalJRules.g:2385:4: enumLiteral_4= 'contain'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_4());
                    			

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
    // InternalJRules.g:2395:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2401:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRules.g:2402:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRules.g:2402:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==78) ) {
                alt48=1;
            }
            else if ( (LA48_0==79) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalJRules.g:2403:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRules.g:2403:3: (enumLiteral_0= 'English' )
                    // InternalJRules.g:2404:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2411:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRules.g:2411:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRules.g:2412:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_1());
                    			

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
    // InternalJRules.g:2422:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:2428:2: ( ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) ) )
            // InternalJRules.g:2429:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            {
            // InternalJRules.g:2429:2: ( (enumLiteral_0= 'public' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'private' ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt49=1;
                }
                break;
            case 81:
                {
                alt49=2;
                }
                break;
            case 82:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalJRules.g:2430:3: (enumLiteral_0= 'public' )
                    {
                    // InternalJRules.g:2430:3: (enumLiteral_0= 'public' )
                    // InternalJRules.g:2431:4: enumLiteral_0= 'public'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2438:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalJRules.g:2438:3: (enumLiteral_1= 'protected' )
                    // InternalJRules.g:2439:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2446:3: (enumLiteral_2= 'private' )
                    {
                    // InternalJRules.g:2446:3: (enumLiteral_2= 'private' )
                    // InternalJRules.g:2447:4: enumLiteral_2= 'private'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); 

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

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\23\uffff";
    static final String dfa_2s = "\1\25\1\26\4\uffff\1\50\14\uffff";
    static final String dfa_3s = "\1\63\1\64\4\uffff\1\115\14\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\5\1\7\1\10\1\uffff\1\15\1\16\1\17\1\20\1\6\1\12\1\11\1\2\1\1\1\4\1\14\1\13";
    static final String dfa_5s = "\23\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\6\uffff\1\3\2\uffff\1\4\1\5\3\uffff\1\6\1\uffff\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\17\1\16\6\uffff\1\20\2\uffff\1\13\2\uffff\1\15\2\14\15\uffff\1\12",
            "",
            "",
            "",
            "",
            "\1\21\40\uffff\5\22",
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

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers | this_IsGeneric_15= ruleIsGeneric )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x3800000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x3800000000005002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0009028C81244000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0020000022000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0020000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003E00L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000FC0000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000F80000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000E00000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x07C0000000040000L,0x0000000000070000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400000000000000L});

}