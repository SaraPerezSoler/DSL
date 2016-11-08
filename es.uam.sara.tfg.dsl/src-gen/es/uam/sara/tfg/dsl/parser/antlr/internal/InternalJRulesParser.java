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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "','", "';'", "'no'", "'which'", "'satisfy'", "'or'", "'('", "'and'", "')'", "'is'", "'implemented'", "'inheritor'", "'implements'", "'min='", "'max='", "'interfaces'", "'extended'", "'numParameters='", "'types='", "'['", "']'", "'constructor'", "'return'", "'type='", "'initialize'", "'not'", "'empty'", "'name'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'{'", "'}'", "'modifiers:'", "'-'", "'static'", "'final'", "'abstract'", "'synchronized'", "'one'", "'exists'", "'all'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'equal'", "'end'", "'start'", "'contain'", "'English'", "'Spanish'", "'default'", "'public'", "'protected'", "'private'"
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

                if ( (LA2_0==14||(LA2_0>=56 && LA2_0<=58)) ) {
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
    // InternalJRules.g:187:1: ruleSatisfy returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers ) ;
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



        	enterRule();

        try {
            // InternalJRules.g:193:2: ( (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers ) )
            // InternalJRules.g:194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )
            {
            // InternalJRules.g:194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )
            int alt3=15;
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
    // InternalJRules.g:333:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:333:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:334:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:340:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:346:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:347:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalJRules.g:348:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:356:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:367:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:367:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:368:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:374:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) ;
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
            // InternalJRules.g:380:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) )
            // InternalJRules.g:381:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:381:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            // InternalJRules.g:382:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            {
            // InternalJRules.g:382:3: ( (lv_no_0_0= 'no' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:383:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:383:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:384:5: lv_no_0_0= 'no'
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

            // InternalJRules.g:396:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:397:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:397:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:398:5: lv_quantifier_1_0= ruleQuantifier
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

            // InternalJRules.g:415:3: ( (lv_element_2_0= ruleElementJava ) )
            // InternalJRules.g:416:4: (lv_element_2_0= ruleElementJava )
            {
            // InternalJRules.g:416:4: (lv_element_2_0= ruleElementJava )
            // InternalJRules.g:417:5: lv_element_2_0= ruleElementJava
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

            // InternalJRules.g:434:3: (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:435:4: otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWhichKeyword_3_0());
                    			
                    // InternalJRules.g:439:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalJRules.g:440:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalJRules.g:440:5: (lv_filter_4_0= ruleFilter )
                    // InternalJRules.g:441:6: lv_filter_4_0= ruleFilter
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

            // InternalJRules.g:459:3: (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:460:4: otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) )
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getSatisfyKeyword_4_0());
                    			
                    // InternalJRules.g:464:4: ( (lv_satisfy_6_0= ruleOr ) )
                    // InternalJRules.g:465:5: (lv_satisfy_6_0= ruleOr )
                    {
                    // InternalJRules.g:465:5: (lv_satisfy_6_0= ruleOr )
                    // InternalJRules.g:466:6: lv_satisfy_6_0= ruleOr
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
    // InternalJRules.g:488:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalJRules.g:488:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalJRules.g:489:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalJRules.g:495:1: ruleFilter returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        EObject lv_filter_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:501:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) )
            // InternalJRules.g:502:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            {
            // InternalJRules.g:502:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            // InternalJRules.g:503:3: ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) )
            {
            // InternalJRules.g:503:3: ( (lv_no_0_0= 'no' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==14) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalJRules.g:504:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:504:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:505:5: lv_no_0_0= 'no'
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

            // InternalJRules.g:517:3: ( (lv_filter_1_0= ruleOr ) )
            // InternalJRules.g:518:4: (lv_filter_1_0= ruleOr )
            {
            // InternalJRules.g:518:4: (lv_filter_1_0= ruleOr )
            // InternalJRules.g:519:5: lv_filter_1_0= ruleOr
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
    // InternalJRules.g:540:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:540:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:541:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:547:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:553:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:554:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:554:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:555:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:555:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:556:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:556:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:557:5: lv_op_0_0= ruleAnd
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

            // InternalJRules.g:574:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalJRules.g:575:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:579:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:580:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:580:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:581:6: lv_op_2_0= ruleAnd
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
    // InternalJRules.g:603:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:603:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:604:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:610:1: ruleAnd returns [EObject current=null] : ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) ) ;
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
            // InternalJRules.g:616:2: ( ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) ) )
            // InternalJRules.g:617:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) )
            {
            // InternalJRules.g:617:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' ) | ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            else if ( (LA12_0==21||LA12_0==24||LA12_0==29||(LA12_0>=34 && LA12_0<=35)||(LA12_0>=39 && LA12_0<=40)||LA12_0==47||LA12_0==50) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:618:3: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' )
                    {
                    // InternalJRules.g:618:3: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')' )
                    // InternalJRules.g:619:4: otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )* otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getAndAccess().getLeftParenthesisKeyword_0_0());
                    			
                    // InternalJRules.g:623:4: ( (lv_op_1_0= ruleSatisfy ) )
                    // InternalJRules.g:624:5: (lv_op_1_0= ruleSatisfy )
                    {
                    // InternalJRules.g:624:5: (lv_op_1_0= ruleSatisfy )
                    // InternalJRules.g:625:6: lv_op_1_0= ruleSatisfy
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

                    // InternalJRules.g:642:4: (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==19) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalJRules.g:643:5: otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) )
                    	    {
                    	    otherlv_2=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAndKeyword_0_2_0());
                    	    				
                    	    // InternalJRules.g:647:5: ( (lv_op_3_0= ruleSatisfy ) )
                    	    // InternalJRules.g:648:6: (lv_op_3_0= ruleSatisfy )
                    	    {
                    	    // InternalJRules.g:648:6: (lv_op_3_0= ruleSatisfy )
                    	    // InternalJRules.g:649:7: lv_op_3_0= ruleSatisfy
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
                    // InternalJRules.g:673:3: ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* )
                    {
                    // InternalJRules.g:673:3: ( ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )* )
                    // InternalJRules.g:674:4: ( (lv_op_5_0= ruleSatisfy ) ) (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )*
                    {
                    // InternalJRules.g:674:4: ( (lv_op_5_0= ruleSatisfy ) )
                    // InternalJRules.g:675:5: (lv_op_5_0= ruleSatisfy )
                    {
                    // InternalJRules.g:675:5: (lv_op_5_0= ruleSatisfy )
                    // InternalJRules.g:676:6: lv_op_5_0= ruleSatisfy
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

                    // InternalJRules.g:693:4: (otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalJRules.g:694:5: otherlv_6= 'and' ( (lv_op_7_0= ruleSatisfy ) )
                    	    {
                    	    otherlv_6=(Token)match(input,19,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getAndAccess().getAndKeyword_1_1_0());
                    	    				
                    	    // InternalJRules.g:698:5: ( (lv_op_7_0= ruleSatisfy ) )
                    	    // InternalJRules.g:699:6: (lv_op_7_0= ruleSatisfy )
                    	    {
                    	    // InternalJRules.g:699:6: (lv_op_7_0= ruleSatisfy )
                    	    // InternalJRules.g:700:7: lv_op_7_0= ruleSatisfy
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
    // InternalJRules.g:723:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:723:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:724:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:730:1: ruleisImplemented returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'implemented' ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:736:2: ( ( () otherlv_1= 'is' otherlv_2= 'implemented' ) )
            // InternalJRules.g:737:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            {
            // InternalJRules.g:737:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            // InternalJRules.g:738:3: () otherlv_1= 'is' otherlv_2= 'implemented'
            {
            // InternalJRules.g:738:3: ()
            // InternalJRules.g:739:4: 
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
    // InternalJRules.g:757:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRules.g:757:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRules.g:758:2: iv_ruleIsInheritor= ruleIsInheritor EOF
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
    // InternalJRules.g:764:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:770:2: ( ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) )
            // InternalJRules.g:771:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            {
            // InternalJRules.g:771:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            // InternalJRules.g:772:3: () otherlv_1= 'is' otherlv_2= 'inheritor'
            {
            // InternalJRules.g:772:3: ()
            // InternalJRules.g:773:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_2); 

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
    // InternalJRules.g:791:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:791:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:792:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:798:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) ;
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
            // InternalJRules.g:804:2: ( ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) )
            // InternalJRules.g:805:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            {
            // InternalJRules.g:805:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            // InternalJRules.g:806:3: () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces'
            {
            // InternalJRules.g:806:3: ()
            // InternalJRules.g:807:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsAccess().getImplementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:817:3: ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )?
            int alt15=3;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            switch (alt15) {
                case 1 :
                    // InternalJRules.g:818:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:818:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    // InternalJRules.g:819:5: otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_17); 

                    					newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getMinKeyword_2_0_0());
                    				
                    // InternalJRules.g:823:5: ( (lv_minInterface_3_0= ruleEInt ) )
                    // InternalJRules.g:824:6: (lv_minInterface_3_0= ruleEInt )
                    {
                    // InternalJRules.g:824:6: (lv_minInterface_3_0= ruleEInt )
                    // InternalJRules.g:825:7: lv_minInterface_3_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_0_1_0());
                    						
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

                    // InternalJRules.g:842:5: (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==19) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalJRules.g:843:6: otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) )
                            {
                            otherlv_4=(Token)match(input,19,FOLLOW_19); 

                            						newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getAndKeyword_2_0_2_0());
                            					
                            otherlv_5=(Token)match(input,26,FOLLOW_17); 

                            						newLeafNode(otherlv_5, grammarAccess.getImplementsAccess().getMaxKeyword_2_0_2_1());
                            					
                            // InternalJRules.g:851:6: ( (lv_maxInterface_6_0= ruleEInt ) )
                            // InternalJRules.g:852:7: (lv_maxInterface_6_0= ruleEInt )
                            {
                            // InternalJRules.g:852:7: (lv_maxInterface_6_0= ruleEInt )
                            // InternalJRules.g:853:8: lv_maxInterface_6_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_0_2_2_0());
                            							
                            pushFollow(FOLLOW_20);
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
                    // InternalJRules.g:873:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:873:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    // InternalJRules.g:874:5: otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_17); 

                    					newLeafNode(otherlv_7, grammarAccess.getImplementsAccess().getMaxKeyword_2_1_0());
                    				
                    // InternalJRules.g:878:5: ( (lv_maxInterface_8_0= ruleEInt ) )
                    // InternalJRules.g:879:6: (lv_maxInterface_8_0= ruleEInt )
                    {
                    // InternalJRules.g:879:6: (lv_maxInterface_8_0= ruleEInt )
                    // InternalJRules.g:880:7: lv_maxInterface_8_0= ruleEInt
                    {

                    							newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_18);
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

                    // InternalJRules.g:897:5: (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==19) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJRules.g:898:6: otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) )
                            {
                            otherlv_9=(Token)match(input,19,FOLLOW_21); 

                            						newLeafNode(otherlv_9, grammarAccess.getImplementsAccess().getAndKeyword_2_1_2_0());
                            					
                            otherlv_10=(Token)match(input,25,FOLLOW_17); 

                            						newLeafNode(otherlv_10, grammarAccess.getImplementsAccess().getMinKeyword_2_1_2_1());
                            					
                            // InternalJRules.g:906:6: ( (lv_minInterface_11_0= ruleEInt ) )
                            // InternalJRules.g:907:7: (lv_minInterface_11_0= ruleEInt )
                            {
                            // InternalJRules.g:907:7: (lv_minInterface_11_0= ruleEInt )
                            // InternalJRules.g:908:8: lv_minInterface_11_0= ruleEInt
                            {

                            								newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_1_2_2_0());
                            							
                            pushFollow(FOLLOW_20);
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

            otherlv_12=(Token)match(input,27,FOLLOW_2); 

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
    // InternalJRules.g:936:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRules.g:936:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRules.g:937:2: iv_ruleIsExtended= ruleIsExtended EOF
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
    // InternalJRules.g:943:1: ruleIsExtended returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'extended' ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:949:2: ( ( () otherlv_1= 'is' otherlv_2= 'extended' ) )
            // InternalJRules.g:950:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            {
            // InternalJRules.g:950:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            // InternalJRules.g:951:3: () otherlv_1= 'is' otherlv_2= 'extended'
            {
            // InternalJRules.g:951:3: ()
            // InternalJRules.g:952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsExtendedAccess().getIsExtendedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getIsExtendedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_2); 

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
    // InternalJRules.g:970:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:970:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:971:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:977:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) ;
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
            // InternalJRules.g:983:2: ( (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) )
            // InternalJRules.g:984:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            {
            // InternalJRules.g:984:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            // InternalJRules.g:985:3: otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNumParametersKeyword_0());
            		
            // InternalJRules.g:989:3: ( (lv_numParam_1_0= ruleEInt ) )
            // InternalJRules.g:990:4: (lv_numParam_1_0= ruleEInt )
            {
            // InternalJRules.g:990:4: (lv_numParam_1_0= ruleEInt )
            // InternalJRules.g:991:5: lv_numParam_1_0= ruleEInt
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

            // InternalJRules.g:1008:3: (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==30) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:1009:4: otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAndKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,30,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_2());
                    			
                    // InternalJRules.g:1021:4: ( (lv_typesParam_5_0= ruleEString ) )
                    // InternalJRules.g:1022:5: (lv_typesParam_5_0= ruleEString )
                    {
                    // InternalJRules.g:1022:5: (lv_typesParam_5_0= ruleEString )
                    // InternalJRules.g:1023:6: lv_typesParam_5_0= ruleEString
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

                    // InternalJRules.g:1040:4: (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==12) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalJRules.g:1041:5: otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,12,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalJRules.g:1045:5: ( (lv_typesParam_7_0= ruleEString ) )
                    	    // InternalJRules.g:1046:6: (lv_typesParam_7_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:1046:6: (lv_typesParam_7_0= ruleEString )
                    	    // InternalJRules.g:1047:7: lv_typesParam_7_0= ruleEString
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
                    	    break loop16;
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
    // InternalJRules.g:1074:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1074:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1075:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:1081:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1087:2: ( ( () otherlv_1= 'is' otherlv_2= 'constructor' ) )
            // InternalJRules.g:1088:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            {
            // InternalJRules.g:1088:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            // InternalJRules.g:1089:3: () otherlv_1= 'is' otherlv_2= 'constructor'
            {
            // InternalJRules.g:1089:3: ()
            // InternalJRules.g:1090:4: 
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
    // InternalJRules.g:1108:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1108:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1109:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:1115:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1121:2: ( (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) )
            // InternalJRules.g:1122:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            {
            // InternalJRules.g:1122:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            // InternalJRules.g:1123:3: otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1131:3: ( (lv_returnType_2_0= ruleEString ) )
            // InternalJRules.g:1132:4: (lv_returnType_2_0= ruleEString )
            {
            // InternalJRules.g:1132:4: (lv_returnType_2_0= ruleEString )
            // InternalJRules.g:1133:5: lv_returnType_2_0= ruleEString
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
    // InternalJRules.g:1154:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1154:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1155:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1161:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1167:2: ( (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRules.g:1168:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRules.g:1168:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRules.g:1169:3: otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1173:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRules.g:1174:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRules.g:1174:4: (lv_Type_1_0= ruleEString )
            // InternalJRules.g:1175:5: lv_Type_1_0= ruleEString
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
    // InternalJRules.g:1196:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1196:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1197:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:1203:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1209:2: ( ( () otherlv_1= 'is' otherlv_2= 'initialize' ) )
            // InternalJRules.g:1210:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            {
            // InternalJRules.g:1210:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            // InternalJRules.g:1211:3: () otherlv_1= 'is' otherlv_2= 'initialize'
            {
            // InternalJRules.g:1211:3: ()
            // InternalJRules.g:1212:4: 
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
    // InternalJRules.g:1230:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:1230:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:1231:2: iv_ruleEmpty= ruleEmpty EOF
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
    // InternalJRules.g:1237:1: ruleEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJRules.g:1243:2: ( ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // InternalJRules.g:1244:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // InternalJRules.g:1244:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            // InternalJRules.g:1245:3: () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // InternalJRules.g:1245:3: ()
            // InternalJRules.g:1246:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEmptyAccess().getEmptyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1());
            		
            // InternalJRules.g:1256:3: ( (lv_no_2_0= 'not' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==37) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:1257:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1257:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1258:5: lv_no_2_0= 'not'
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
    // InternalJRules.g:1278:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:1278:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:1279:2: iv_ruleNameOperation= ruleNameOperation EOF
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
    // InternalJRules.g:1285:1: ruleNameOperation returns [EObject current=null] : ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleNameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_Language_5_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1291:2: ( ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:1292:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:1292:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            // InternalJRules.g:1293:3: () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            {
            // InternalJRules.g:1293:3: ()
            // InternalJRules.g:1294:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameOperationAccess().getNameOperationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_31); 

            			newLeafNode(otherlv_1, grammarAccess.getNameOperationAccess().getNameKeyword_1());
            		
            // InternalJRules.g:1304:3: ( (lv_operator_2_0= ruleNameOperator ) )
            // InternalJRules.g:1305:4: (lv_operator_2_0= ruleNameOperator )
            {
            // InternalJRules.g:1305:4: (lv_operator_2_0= ruleNameOperator )
            // InternalJRules.g:1306:5: lv_operator_2_0= ruleNameOperator
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

            // InternalJRules.g:1323:3: ( (lv_name_3_0= ruleEString ) )
            // InternalJRules.g:1324:4: (lv_name_3_0= ruleEString )
            {
            // InternalJRules.g:1324:4: (lv_name_3_0= ruleEString )
            // InternalJRules.g:1325:5: lv_name_3_0= ruleEString
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

            // InternalJRules.g:1342:3: (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==12) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1343:4: otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) )
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_33); 

                    				newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getCommaKeyword_4_0());
                    			
                    // InternalJRules.g:1347:4: ( (lv_Language_5_0= ruleLanguage ) )
                    // InternalJRules.g:1348:5: (lv_Language_5_0= ruleLanguage )
                    {
                    // InternalJRules.g:1348:5: (lv_Language_5_0= ruleLanguage )
                    // InternalJRules.g:1349:6: lv_Language_5_0= ruleLanguage
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
    // InternalJRules.g:1371:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:1371:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:1372:2: iv_ruleNameType= ruleNameType EOF
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
    // InternalJRules.g:1378:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1384:2: ( (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:1385:2: (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:1385:2: (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) )
            // InternalJRules.g:1386:3: otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_27); 

            			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:1394:3: ( (lv_type_2_0= ruleNameCheck ) )
            // InternalJRules.g:1395:4: (lv_type_2_0= ruleNameCheck )
            {
            // InternalJRules.g:1395:4: (lv_type_2_0= ruleNameCheck )
            // InternalJRules.g:1396:5: lv_type_2_0= ruleNameCheck
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
    // InternalJRules.g:1417:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:1417:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:1418:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:1424:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
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
            // InternalJRules.g:1430:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRules.g:1431:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRules.g:1431:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRules.g:1432:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRules.g:1432:3: ()
            // InternalJRules.g:1433:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
            		
            // InternalJRules.g:1443:3: ( (lv_author_2_0= '@author' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1444:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRules.g:1444:4: (lv_author_2_0= '@author' )
                    // InternalJRules.g:1445:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,41,FOLLOW_36); 

                    					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1457:3: ( (lv_parameter_3_0= '@parameter' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1458:4: (lv_parameter_3_0= '@parameter' )
                    {
                    // InternalJRules.g:1458:4: (lv_parameter_3_0= '@parameter' )
                    // InternalJRules.g:1459:5: lv_parameter_3_0= '@parameter'
                    {
                    lv_parameter_3_0=(Token)match(input,42,FOLLOW_37); 

                    					newLeafNode(lv_parameter_3_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parameter", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1471:3: ( (lv_return_4_0= '@return' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1472:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRules.g:1472:4: (lv_return_4_0= '@return' )
                    // InternalJRules.g:1473:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,43,FOLLOW_38); 

                    					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1485:3: ( (lv_version_5_0= '@version' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1486:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRules.g:1486:4: (lv_version_5_0= '@version' )
                    // InternalJRules.g:1487:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,44,FOLLOW_39); 

                    					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1499:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==45) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1500:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRules.g:1500:4: (lv_throws_6_0= '@throws' )
                    // InternalJRules.g:1501:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,45,FOLLOW_40); 

                    					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1513:3: ( (lv_see_7_0= '@see' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1514:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRules.g:1514:4: (lv_see_7_0= '@see' )
                    // InternalJRules.g:1515:5: lv_see_7_0= '@see'
                    {
                    lv_see_7_0=(Token)match(input,46,FOLLOW_2); 

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
    // InternalJRules.g:1531:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:1531:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:1532:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:1538:1: ruleContains returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1544:2: ( (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) )
            // InternalJRules.g:1545:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            {
            // InternalJRules.g:1545:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            // InternalJRules.g:1546:3: otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJRules.g:1554:3: ( (lv_which_2_0= ruleRule ) )
            // InternalJRules.g:1555:4: (lv_which_2_0= ruleRule )
            {
            // InternalJRules.g:1555:4: (lv_which_2_0= ruleRule )
            // InternalJRules.g:1556:5: lv_which_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_42);
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

            otherlv_3=(Token)match(input,49,FOLLOW_2); 

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
    // InternalJRules.g:1581:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:1581:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:1582:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:1588:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) ;
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
            // InternalJRules.g:1594:2: ( (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) )
            // InternalJRules.g:1595:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            {
            // InternalJRules.g:1595:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            // InternalJRules.g:1596:3: otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_44); 

            			newLeafNode(otherlv_2, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_2());
            		
            // InternalJRules.g:1608:3: ( (lv_blend_3_0= ruleBlendModifiers ) )
            // InternalJRules.g:1609:4: (lv_blend_3_0= ruleBlendModifiers )
            {
            // InternalJRules.g:1609:4: (lv_blend_3_0= ruleBlendModifiers )
            // InternalJRules.g:1610:5: lv_blend_3_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_3_0());
            				
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

            			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_4());
            		
            // InternalJRules.g:1631:3: (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalJRules.g:1632:4: otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')'
            	    {
            	    otherlv_5=(Token)match(input,17,FOLLOW_43); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getOrKeyword_5_0());
            	    			
            	    otherlv_6=(Token)match(input,18,FOLLOW_44); 

            	    				newLeafNode(otherlv_6, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_5_1());
            	    			
            	    // InternalJRules.g:1640:4: ( (lv_blend_7_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:1641:5: (lv_blend_7_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:1641:5: (lv_blend_7_0= ruleBlendModifiers )
            	    // InternalJRules.g:1642:6: lv_blend_7_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_2_0());
            	    					
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
    // InternalJRules.g:1672:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:1672:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:1673:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:1679:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1685:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1686:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1686:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1687:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1687:3: (kw= '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==51) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalJRules.g:1688:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_47); 

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
    // InternalJRules.g:1705:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:1705:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:1706:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:1712:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:1718:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) )
            // InternalJRules.g:1719:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:1719:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt38=1;
                }
                break;
            case 52:
                {
                alt38=2;
                }
                break;
            case 53:
                {
                alt38=3;
                }
                break;
            case 54:
                {
                alt38=4;
                }
                break;
            case 55:
                {
                alt38=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalJRules.g:1720:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1720:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1721:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1721:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:1722:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:1722:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:1723:6: lv_access_0_0= ruleAccessModifier
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

                    // InternalJRules.g:1740:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==19) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==52) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJRules.g:1741:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,19,FOLLOW_48); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:1745:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:1746:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:1746:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:1747:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,52,FOLLOW_13); 

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

                    // InternalJRules.g:1760:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==19) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==53) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1761:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,19,FOLLOW_49); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:1765:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:1766:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:1766:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:1767:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,53,FOLLOW_13); 

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

                    // InternalJRules.g:1780:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==19) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==54) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRules.g:1781:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_50); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:1785:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:1786:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:1786:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:1787:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,54,FOLLOW_13); 

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

                    // InternalJRules.g:1800:4: (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==19) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1801:5: otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) )
                            {
                            otherlv_7=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:1805:5: ( (lv_synchronized_8_0= 'synchronized' ) )
                            // InternalJRules.g:1806:6: (lv_synchronized_8_0= 'synchronized' )
                            {
                            // InternalJRules.g:1806:6: (lv_synchronized_8_0= 'synchronized' )
                            // InternalJRules.g:1807:7: lv_synchronized_8_0= 'synchronized'
                            {
                            lv_synchronized_8_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalJRules.g:1822:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1822:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1823:4: ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1823:4: ( (lv_static_9_0= 'static' ) )
                    // InternalJRules.g:1824:5: (lv_static_9_0= 'static' )
                    {
                    // InternalJRules.g:1824:5: (lv_static_9_0= 'static' )
                    // InternalJRules.g:1825:6: lv_static_9_0= 'static'
                    {
                    lv_static_9_0=(Token)match(input,52,FOLLOW_13); 

                    						newLeafNode(lv_static_9_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:1837:4: (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==19) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==53) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1838:5: otherlv_10= 'and' ( (lv_final_11_0= 'final' ) )
                            {
                            otherlv_10=(Token)match(input,19,FOLLOW_49); 

                            					newLeafNode(otherlv_10, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:1842:5: ( (lv_final_11_0= 'final' ) )
                            // InternalJRules.g:1843:6: (lv_final_11_0= 'final' )
                            {
                            // InternalJRules.g:1843:6: (lv_final_11_0= 'final' )
                            // InternalJRules.g:1844:7: lv_final_11_0= 'final'
                            {
                            lv_final_11_0=(Token)match(input,53,FOLLOW_13); 

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

                    // InternalJRules.g:1857:4: (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==19) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==54) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1858:5: otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) )
                            {
                            otherlv_12=(Token)match(input,19,FOLLOW_50); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:1862:5: ( (lv_abstract_13_0= 'abstract' ) )
                            // InternalJRules.g:1863:6: (lv_abstract_13_0= 'abstract' )
                            {
                            // InternalJRules.g:1863:6: (lv_abstract_13_0= 'abstract' )
                            // InternalJRules.g:1864:7: lv_abstract_13_0= 'abstract'
                            {
                            lv_abstract_13_0=(Token)match(input,54,FOLLOW_13); 

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

                    // InternalJRules.g:1877:4: (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==19) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1878:5: otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) )
                            {
                            otherlv_14=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:1882:5: ( (lv_synchronized_15_0= 'synchronized' ) )
                            // InternalJRules.g:1883:6: (lv_synchronized_15_0= 'synchronized' )
                            {
                            // InternalJRules.g:1883:6: (lv_synchronized_15_0= 'synchronized' )
                            // InternalJRules.g:1884:7: lv_synchronized_15_0= 'synchronized'
                            {
                            lv_synchronized_15_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalJRules.g:1899:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1899:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1900:4: ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1900:4: ( (lv_final_16_0= 'final' ) )
                    // InternalJRules.g:1901:5: (lv_final_16_0= 'final' )
                    {
                    // InternalJRules.g:1901:5: (lv_final_16_0= 'final' )
                    // InternalJRules.g:1902:6: lv_final_16_0= 'final'
                    {
                    lv_final_16_0=(Token)match(input,53,FOLLOW_13); 

                    						newLeafNode(lv_final_16_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:1914:4: (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==19) ) {
                        int LA35_1 = input.LA(2);

                        if ( (LA35_1==54) ) {
                            alt35=1;
                        }
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1915:5: otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) )
                            {
                            otherlv_17=(Token)match(input,19,FOLLOW_50); 

                            					newLeafNode(otherlv_17, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:1919:5: ( (lv_abstract_18_0= 'abstract' ) )
                            // InternalJRules.g:1920:6: (lv_abstract_18_0= 'abstract' )
                            {
                            // InternalJRules.g:1920:6: (lv_abstract_18_0= 'abstract' )
                            // InternalJRules.g:1921:7: lv_abstract_18_0= 'abstract'
                            {
                            lv_abstract_18_0=(Token)match(input,54,FOLLOW_13); 

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

                    // InternalJRules.g:1934:4: (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==19) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:1935:5: otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) )
                            {
                            otherlv_19=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_19, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:1939:5: ( (lv_synchronized_20_0= 'synchronized' ) )
                            // InternalJRules.g:1940:6: (lv_synchronized_20_0= 'synchronized' )
                            {
                            // InternalJRules.g:1940:6: (lv_synchronized_20_0= 'synchronized' )
                            // InternalJRules.g:1941:7: lv_synchronized_20_0= 'synchronized'
                            {
                            lv_synchronized_20_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalJRules.g:1956:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1956:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1957:4: ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1957:4: ( (lv_abstract_21_0= 'abstract' ) )
                    // InternalJRules.g:1958:5: (lv_abstract_21_0= 'abstract' )
                    {
                    // InternalJRules.g:1958:5: (lv_abstract_21_0= 'abstract' )
                    // InternalJRules.g:1959:6: lv_abstract_21_0= 'abstract'
                    {
                    lv_abstract_21_0=(Token)match(input,54,FOLLOW_13); 

                    						newLeafNode(lv_abstract_21_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:1971:4: (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==19) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRules.g:1972:5: otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) )
                            {
                            otherlv_22=(Token)match(input,19,FOLLOW_51); 

                            					newLeafNode(otherlv_22, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:1976:5: ( (lv_synchronized_23_0= 'synchronized' ) )
                            // InternalJRules.g:1977:6: (lv_synchronized_23_0= 'synchronized' )
                            {
                            // InternalJRules.g:1977:6: (lv_synchronized_23_0= 'synchronized' )
                            // InternalJRules.g:1978:7: lv_synchronized_23_0= 'synchronized'
                            {
                            lv_synchronized_23_0=(Token)match(input,55,FOLLOW_2); 

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
                    // InternalJRules.g:1993:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:1993:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    // InternalJRules.g:1994:4: (lv_synchronized_24_0= 'synchronized' )
                    {
                    // InternalJRules.g:1994:4: (lv_synchronized_24_0= 'synchronized' )
                    // InternalJRules.g:1995:5: lv_synchronized_24_0= 'synchronized'
                    {
                    lv_synchronized_24_0=(Token)match(input,55,FOLLOW_2); 

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
    // InternalJRules.g:2011:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:2017:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:2018:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:2018:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt39=1;
                }
                break;
            case 57:
                {
                alt39=2;
                }
                break;
            case 58:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalJRules.g:2019:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:2019:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:2020:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2027:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:2027:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:2028:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2035:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:2035:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:2036:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

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
    // InternalJRules.g:2046:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) ;
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
            // InternalJRules.g:2052:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) )
            // InternalJRules.g:2053:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            {
            // InternalJRules.g:2053:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt40=1;
                }
                break;
            case 60:
                {
                alt40=2;
                }
                break;
            case 61:
                {
                alt40=3;
                }
                break;
            case 62:
                {
                alt40=4;
                }
                break;
            case 63:
                {
                alt40=5;
                }
                break;
            case 64:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalJRules.g:2054:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:2054:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:2055:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2062:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:2062:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:2063:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2070:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:2070:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:2071:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2078:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:2078:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:2079:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2086:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:2086:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:2087:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2094:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:2094:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:2095:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); 

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
    // InternalJRules.g:2105:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2111:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRules.g:2112:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRules.g:2112:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt41=1;
                }
                break;
            case 66:
                {
                alt41=2;
                }
                break;
            case 67:
                {
                alt41=3;
                }
                break;
            case 68:
                {
                alt41=4;
                }
                break;
            case 69:
                {
                alt41=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalJRules.g:2113:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRules.g:2113:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRules.g:2114:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2121:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRules.g:2121:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRules.g:2122:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2129:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRules.g:2129:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRules.g:2130:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2137:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRules.g:2137:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRules.g:2138:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2145:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRules.g:2145:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRules.g:2146:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); 

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
    // InternalJRules.g:2156:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2162:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) )
            // InternalJRules.g:2163:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            {
            // InternalJRules.g:2163:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt42=1;
                }
                break;
            case 71:
                {
                alt42=2;
                }
                break;
            case 72:
                {
                alt42=3;
                }
                break;
            case 73:
                {
                alt42=4;
                }
                break;
            case 74:
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
                    // InternalJRules.g:2164:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRules.g:2164:3: (enumLiteral_0= 'like' )
                    // InternalJRules.g:2165:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2172:3: (enumLiteral_1= 'equal' )
                    {
                    // InternalJRules.g:2172:3: (enumLiteral_1= 'equal' )
                    // InternalJRules.g:2173:4: enumLiteral_1= 'equal'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2180:3: (enumLiteral_2= 'end' )
                    {
                    // InternalJRules.g:2180:3: (enumLiteral_2= 'end' )
                    // InternalJRules.g:2181:4: enumLiteral_2= 'end'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2188:3: (enumLiteral_3= 'start' )
                    {
                    // InternalJRules.g:2188:3: (enumLiteral_3= 'start' )
                    // InternalJRules.g:2189:4: enumLiteral_3= 'start'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2196:3: (enumLiteral_4= 'contain' )
                    {
                    // InternalJRules.g:2196:3: (enumLiteral_4= 'contain' )
                    // InternalJRules.g:2197:4: enumLiteral_4= 'contain'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); 

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
    // InternalJRules.g:2207:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2213:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRules.g:2214:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRules.g:2214:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==75) ) {
                alt43=1;
            }
            else if ( (LA43_0==76) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2215:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRules.g:2215:3: (enumLiteral_0= 'English' )
                    // InternalJRules.g:2216:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2223:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRules.g:2223:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRules.g:2224:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

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
    // InternalJRules.g:2234:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:2240:2: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) )
            // InternalJRules.g:2241:2: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            {
            // InternalJRules.g:2241:2: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt44=1;
                }
                break;
            case 78:
                {
                alt44=2;
                }
                break;
            case 79:
                {
                alt44=3;
                }
                break;
            case 80:
                {
                alt44=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2242:3: (enumLiteral_0= 'default' )
                    {
                    // InternalJRules.g:2242:3: (enumLiteral_0= 'default' )
                    // InternalJRules.g:2243:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2250:3: (enumLiteral_1= 'public' )
                    {
                    // InternalJRules.g:2250:3: (enumLiteral_1= 'public' )
                    // InternalJRules.g:2251:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2258:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalJRules.g:2258:3: (enumLiteral_2= 'protected' )
                    // InternalJRules.g:2259:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2266:3: (enumLiteral_3= 'private' )
                    {
                    // InternalJRules.g:2266:3: (enumLiteral_3= 'private' )
                    // InternalJRules.g:2267:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\25\1\26\4\uffff\1\43\13\uffff";
    static final String dfa_3s = "\1\62\1\46\4\uffff\1\112\13\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\5\1\7\1\10\1\uffff\1\15\1\16\1\17\1\6\1\12\1\2\1\11\1\1\1\4\1\13\1\14";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\4\uffff\1\3\4\uffff\1\4\1\5\3\uffff\1\6\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\16\1\14\4\uffff\1\17\4\uffff\1\12\2\uffff\1\15\2\13",
            "",
            "",
            "",
            "",
            "\1\21\42\uffff\5\20",
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
            return "194:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0700000000005000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0700000000005002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004818C21244000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00007E0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00F0000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000100020000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0080000000000000L});

}