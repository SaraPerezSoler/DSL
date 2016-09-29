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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "'no'", "'which'", "'satisfy'", "'or'", "'and'", "'is'", "'implemented'", "'inheritor'", "'implements'", "'min='", "'max='", "'interfaces'", "'extended'", "'numParameters='", "'types='", "'{'", "','", "'}'", "'constructor'", "'return'", "'type='", "'initialize'", "'not'", "'empty'", "'name'", "'in'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'('", "')'", "'modifiers:'", "'-'", "'static'", "'final'", "'abstract'", "'synchronized'", "'one'", "'exists'", "'all'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'equal'", "'English'", "'Spanish'", "'Default'", "'Public'", "'Protected'", "'Private'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
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
    // InternalJRules.g:72:1: ruleRuleSet returns [EObject current=null] : (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_ProjectName_1_0 = null;

        EObject lv_rules_2_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:78:2: ( (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* ) )
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* )
            {
            // InternalJRules.g:79:2: (otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* )
            // InternalJRules.g:80:3: otherlv_0= 'ProjectName:' ( (lv_ProjectName_1_0= ruleEString ) ) ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )*
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

            // InternalJRules.g:122:3: ( (lv_rules_3_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12||(LA1_0>=54 && LA1_0<=56)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalJRules.g:123:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalJRules.g:123:4: (lv_rules_3_0= ruleRule )
            	    // InternalJRules.g:124:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_rules_3_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRuleSetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_3_0,
            	    						"es.uam.sara.tfg.dsl.JRules.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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
    // InternalJRules.g:145:1: entryRuleSatisfy returns [EObject current=null] : iv_ruleSatisfy= ruleSatisfy EOF ;
    public final EObject entryRuleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSatisfy = null;


        try {
            // InternalJRules.g:145:48: (iv_ruleSatisfy= ruleSatisfy EOF )
            // InternalJRules.g:146:2: iv_ruleSatisfy= ruleSatisfy EOF
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
    // InternalJRules.g:152:1: ruleSatisfy returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers ) ;
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
            // InternalJRules.g:158:2: ( (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers ) )
            // InternalJRules.g:159:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )
            {
            // InternalJRules.g:159:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )
            int alt2=14;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalJRules.g:160:3: this_isImplemented_0= ruleisImplemented
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
                    // InternalJRules.g:169:3: this_IsInheritor_1= ruleIsInheritor
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
                    // InternalJRules.g:178:3: this_Implements_2= ruleImplements
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
                    // InternalJRules.g:187:3: this_IsExtended_3= ruleIsExtended
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
                    // InternalJRules.g:196:3: this_Parameter_4= ruleParameter
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
                    // InternalJRules.g:205:3: this_Constructor_5= ruleConstructor
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
                    // InternalJRules.g:214:3: this_Return_6= ruleReturn
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
                    // InternalJRules.g:223:3: this_AttributeType_7= ruleAttributeType
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
                    // InternalJRules.g:232:3: this_Initialize_8= ruleInitialize
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
                    // InternalJRules.g:241:3: this_NoEmpty_9= ruleNoEmpty
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
                    // InternalJRules.g:250:3: this_Name_10= ruleName
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
                    // InternalJRules.g:259:3: this_JavaDoc_11= ruleJavaDoc
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
                    // InternalJRules.g:268:3: this_Contains_12= ruleContains
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
                    // InternalJRules.g:277:3: this_Modifiers_13= ruleModifiers
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
    // InternalJRules.g:289:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:289:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:290:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRules.g:296:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:302:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:303:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:303:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalJRules.g:304:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRules.g:312:3: this_ID_1= RULE_ID
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
    // InternalJRules.g:323:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:323:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:324:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRules.g:330:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) ) ;
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
            // InternalJRules.g:336:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) ) )
            // InternalJRules.g:337:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )
            {
            // InternalJRules.g:337:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )
            // InternalJRules.g:338:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) )
            {
            // InternalJRules.g:338:3: ( (lv_no_0_0= 'no' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:339:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:339:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:340:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,12,FOLLOW_4); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getRuleRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:352:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:353:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:353:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:354:5: lv_quantifier_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getQuantifierQuantifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalJRules.g:371:3: ( (lv_element_2_0= ruleElementJava ) )
            // InternalJRules.g:372:4: (lv_element_2_0= ruleElementJava )
            {
            // InternalJRules.g:372:4: (lv_element_2_0= ruleElementJava )
            // InternalJRules.g:373:5: lv_element_2_0= ruleElementJava
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getElementElementJavaEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
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

            // InternalJRules.g:390:3: (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:391:4: otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWhichKeyword_3_0());
                    			
                    // InternalJRules.g:395:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalJRules.g:396:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalJRules.g:396:5: (lv_filter_4_0= ruleFilter )
                    // InternalJRules.g:397:6: lv_filter_4_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
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

            otherlv_5=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getSatisfyKeyword_4());
            		
            // InternalJRules.g:419:3: ( (lv_satisfy_6_0= ruleOr ) )
            // InternalJRules.g:420:4: (lv_satisfy_6_0= ruleOr )
            {
            // InternalJRules.g:420:4: (lv_satisfy_6_0= ruleOr )
            // InternalJRules.g:421:5: lv_satisfy_6_0= ruleOr
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
    // InternalJRules.g:442:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalJRules.g:442:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalJRules.g:443:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalJRules.g:449:1: ruleFilter returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        EObject lv_filter_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:455:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) )
            // InternalJRules.g:456:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            {
            // InternalJRules.g:456:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            // InternalJRules.g:457:3: ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) )
            {
            // InternalJRules.g:457:3: ( (lv_no_0_0= 'no' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:458:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:458:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:459:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,12,FOLLOW_8); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getFilterAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:471:3: ( (lv_filter_1_0= ruleOr ) )
            // InternalJRules.g:472:4: (lv_filter_1_0= ruleOr )
            {
            // InternalJRules.g:472:4: (lv_filter_1_0= ruleOr )
            // InternalJRules.g:473:5: lv_filter_1_0= ruleOr
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
    // InternalJRules.g:494:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:494:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:495:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRules.g:501:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:507:2: ( ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* ) )
            // InternalJRules.g:508:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            {
            // InternalJRules.g:508:2: ( ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )* )
            // InternalJRules.g:509:3: ( (lv_op_0_0= ruleAnd ) ) (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            {
            // InternalJRules.g:509:3: ( (lv_op_0_0= ruleAnd ) )
            // InternalJRules.g:510:4: (lv_op_0_0= ruleAnd )
            {
            // InternalJRules.g:510:4: (lv_op_0_0= ruleAnd )
            // InternalJRules.g:511:5: lv_op_0_0= ruleAnd
            {

            					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalJRules.g:528:3: (otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJRules.g:529:4: otherlv_1= 'or' ( (lv_op_2_0= ruleAnd ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getOrKeyword_1_0());
            	    			
            	    // InternalJRules.g:533:4: ( (lv_op_2_0= ruleAnd ) )
            	    // InternalJRules.g:534:5: (lv_op_2_0= ruleAnd )
            	    {
            	    // InternalJRules.g:534:5: (lv_op_2_0= ruleAnd )
            	    // InternalJRules.g:535:6: lv_op_2_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalJRules.g:557:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRules.g:557:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRules.g:558:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRules.g:564:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:570:2: ( ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* ) )
            // InternalJRules.g:571:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* )
            {
            // InternalJRules.g:571:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* )
            // InternalJRules.g:572:3: ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )*
            {
            // InternalJRules.g:572:3: ( (lv_op_0_0= ruleSatisfy ) )
            // InternalJRules.g:573:4: (lv_op_0_0= ruleSatisfy )
            {
            // InternalJRules.g:573:4: (lv_op_0_0= ruleSatisfy )
            // InternalJRules.g:574:5: lv_op_0_0= ruleSatisfy
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalJRules.g:591:3: (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalJRules.g:592:4: otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_8); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRules.g:596:4: ( (lv_op_2_0= ruleSatisfy ) )
            	    // InternalJRules.g:597:5: (lv_op_2_0= ruleSatisfy )
            	    {
            	    // InternalJRules.g:597:5: (lv_op_2_0= ruleSatisfy )
            	    // InternalJRules.g:598:6: lv_op_2_0= ruleSatisfy
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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


            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "entryRuleisImplemented"
    // InternalJRules.g:620:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:620:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:621:2: iv_ruleisImplemented= ruleisImplemented EOF
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
    // InternalJRules.g:627:1: ruleisImplemented returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'implemented' ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:633:2: ( ( () otherlv_1= 'is' otherlv_2= 'implemented' ) )
            // InternalJRules.g:634:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            {
            // InternalJRules.g:634:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            // InternalJRules.g:635:3: () otherlv_1= 'is' otherlv_2= 'implemented'
            {
            // InternalJRules.g:635:3: ()
            // InternalJRules.g:636:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsImplementedAccess().getIsImplementedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,18,FOLLOW_2); 

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
    // InternalJRules.g:654:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRules.g:654:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRules.g:655:2: iv_ruleIsInheritor= ruleIsInheritor EOF
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
    // InternalJRules.g:661:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:667:2: ( ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) )
            // InternalJRules.g:668:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            {
            // InternalJRules.g:668:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            // InternalJRules.g:669:3: () otherlv_1= 'is' otherlv_2= 'inheritor'
            {
            // InternalJRules.g:669:3: ()
            // InternalJRules.g:670:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_2); 

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
    // InternalJRules.g:688:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:688:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:689:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRules.g:695:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements' (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )? (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? otherlv_7= 'interfaces' ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_minInterface_3_0 = null;

        AntlrDatatypeRuleToken lv_maxInterface_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:701:2: ( ( () otherlv_1= 'implements' (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )? (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? otherlv_7= 'interfaces' ) )
            // InternalJRules.g:702:2: ( () otherlv_1= 'implements' (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )? (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? otherlv_7= 'interfaces' )
            {
            // InternalJRules.g:702:2: ( () otherlv_1= 'implements' (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )? (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? otherlv_7= 'interfaces' )
            // InternalJRules.g:703:3: () otherlv_1= 'implements' (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )? (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? otherlv_7= 'interfaces'
            {
            // InternalJRules.g:703:3: ()
            // InternalJRules.g:704:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsAccess().getImplementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
            		
            // InternalJRules.g:714:3: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRules.g:715:4: otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getMinKeyword_2_0());
                    			
                    // InternalJRules.g:719:4: ( (lv_minInterface_3_0= ruleEInt ) )
                    // InternalJRules.g:720:5: (lv_minInterface_3_0= ruleEInt )
                    {
                    // InternalJRules.g:720:5: (lv_minInterface_3_0= ruleEInt )
                    // InternalJRules.g:721:6: lv_minInterface_3_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
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


                    }
                    break;

            }

            // InternalJRules.g:739:3: (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJRules.g:740:4: otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getAndKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,22,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getImplementsAccess().getMaxKeyword_3_1());
                    			
                    // InternalJRules.g:748:4: ( (lv_maxInterface_6_0= ruleEInt ) )
                    // InternalJRules.g:749:5: (lv_maxInterface_6_0= ruleEInt )
                    {
                    // InternalJRules.g:749:5: (lv_maxInterface_6_0= ruleEInt )
                    // InternalJRules.g:750:6: lv_maxInterface_6_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_18);
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

            otherlv_7=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getImplementsAccess().getInterfacesKeyword_4());
            		

            }


            }


            	leaveRule();

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
    // InternalJRules.g:776:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRules.g:776:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRules.g:777:2: iv_ruleIsExtended= ruleIsExtended EOF
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
    // InternalJRules.g:783:1: ruleIsExtended returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'extended' ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:789:2: ( ( () otherlv_1= 'is' otherlv_2= 'extended' ) )
            // InternalJRules.g:790:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            {
            // InternalJRules.g:790:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            // InternalJRules.g:791:3: () otherlv_1= 'is' otherlv_2= 'extended'
            {
            // InternalJRules.g:791:3: ()
            // InternalJRules.g:792:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsExtendedAccess().getIsExtendedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getIsExtendedAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_2); 

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
    // InternalJRules.g:810:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:810:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:811:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalJRules.g:817:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )? ) ;
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
            // InternalJRules.g:823:2: ( (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )? ) )
            // InternalJRules.g:824:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )? )
            {
            // InternalJRules.g:824:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )? )
            // InternalJRules.g:825:3: otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEBigInteger ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNumParametersKeyword_0());
            		
            // InternalJRules.g:829:3: ( (lv_numParam_1_0= ruleEBigInteger ) )
            // InternalJRules.g:830:4: (lv_numParam_1_0= ruleEBigInteger )
            {
            // InternalJRules.g:830:4: (lv_numParam_1_0= ruleEBigInteger )
            // InternalJRules.g:831:5: lv_numParam_1_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNumParamEBigIntegerParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalJRules.g:848:3: (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==26) ) {
                    alt12=1;
                }
            }
            switch (alt12) {
                case 1 :
                    // InternalJRules.g:849:4: otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '{' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= '}'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_20); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAndKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypesKeyword_2_1());
                    			
                    otherlv_4=(Token)match(input,27,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftCurlyBracketKeyword_2_2());
                    			
                    // InternalJRules.g:861:4: ( (lv_typesParam_5_0= ruleEString ) )
                    // InternalJRules.g:862:5: (lv_typesParam_5_0= ruleEString )
                    {
                    // InternalJRules.g:862:5: (lv_typesParam_5_0= ruleEString )
                    // InternalJRules.g:863:6: lv_typesParam_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_3_0());
                    					
                    pushFollow(FOLLOW_22);
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

                    // InternalJRules.g:880:4: (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==28) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalJRules.g:881:5: otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,28,FOLLOW_3); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_4_0());
                    	    				
                    	    // InternalJRules.g:885:5: ( (lv_typesParam_7_0= ruleEString ) )
                    	    // InternalJRules.g:886:6: (lv_typesParam_7_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:886:6: (lv_typesParam_7_0= ruleEString )
                    	    // InternalJRules.g:887:7: lv_typesParam_7_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
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
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,29,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightCurlyBracketKeyword_2_5());
                    			

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
    // InternalJRules.g:914:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:914:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:915:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRules.g:921:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:927:2: ( ( () otherlv_1= 'is' otherlv_2= 'constructor' ) )
            // InternalJRules.g:928:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            {
            // InternalJRules.g:928:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            // InternalJRules.g:929:3: () otherlv_1= 'is' otherlv_2= 'constructor'
            {
            // InternalJRules.g:929:3: ()
            // InternalJRules.g:930:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_23); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,30,FOLLOW_2); 

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
    // InternalJRules.g:948:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:948:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:949:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRules.g:955:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:961:2: ( (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) )
            // InternalJRules.g:962:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            {
            // InternalJRules.g:962:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            // InternalJRules.g:963:3: otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
            		
            // InternalJRules.g:971:3: ( (lv_returnType_2_0= ruleEString ) )
            // InternalJRules.g:972:4: (lv_returnType_2_0= ruleEString )
            {
            // InternalJRules.g:972:4: (lv_returnType_2_0= ruleEString )
            // InternalJRules.g:973:5: lv_returnType_2_0= ruleEString
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
    // InternalJRules.g:994:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:994:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:995:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRules.g:1001:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1007:2: ( (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRules.g:1008:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRules.g:1008:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRules.g:1009:3: otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
            		
            // InternalJRules.g:1013:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRules.g:1014:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRules.g:1014:4: (lv_Type_1_0= ruleEString )
            // InternalJRules.g:1015:5: lv_Type_1_0= ruleEString
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
    // InternalJRules.g:1036:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1036:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1037:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRules.g:1043:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1049:2: ( ( () otherlv_1= 'is' otherlv_2= 'initialize' ) )
            // InternalJRules.g:1050:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            {
            // InternalJRules.g:1050:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            // InternalJRules.g:1051:3: () otherlv_1= 'is' otherlv_2= 'initialize'
            {
            // InternalJRules.g:1051:3: ()
            // InternalJRules.g:1052:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,33,FOLLOW_2); 

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
    // InternalJRules.g:1070:1: entryRuleNoEmpty returns [EObject current=null] : iv_ruleNoEmpty= ruleNoEmpty EOF ;
    public final EObject entryRuleNoEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmpty = null;


        try {
            // InternalJRules.g:1070:48: (iv_ruleNoEmpty= ruleNoEmpty EOF )
            // InternalJRules.g:1071:2: iv_ruleNoEmpty= ruleNoEmpty EOF
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
    // InternalJRules.g:1077:1: ruleNoEmpty returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' ) ;
    public final EObject ruleNoEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJRules.g:1083:2: ( ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' ) )
            // InternalJRules.g:1084:2: ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' )
            {
            // InternalJRules.g:1084:2: ( () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty' )
            // InternalJRules.g:1085:3: () otherlv_1= 'is' otherlv_2= 'not' otherlv_3= 'empty'
            {
            // InternalJRules.g:1085:3: ()
            // InternalJRules.g:1086:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoEmptyAccess().getNoEmptyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getNoEmptyAccess().getIsKeyword_1());
            		
            otherlv_2=(Token)match(input,34,FOLLOW_27); 

            			newLeafNode(otherlv_2, grammarAccess.getNoEmptyAccess().getNotKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_2); 

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
    // InternalJRules.g:1108:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalJRules.g:1108:45: (iv_ruleName= ruleName EOF )
            // InternalJRules.g:1109:2: iv_ruleName= ruleName EOF
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
    // InternalJRules.g:1115:1: ruleName returns [EObject current=null] : ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) ) ;
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
            // InternalJRules.g:1121:2: ( ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) ) )
            // InternalJRules.g:1122:2: ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) )
            {
            // InternalJRules.g:1122:2: ( () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) ) )
            // InternalJRules.g:1123:3: () otherlv_1= 'name' ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) )
            {
            // InternalJRules.g:1123:3: ()
            // InternalJRules.g:1124:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNameAccess().getNameAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getNameAccess().getNameKeyword_1());
            		
            // InternalJRules.g:1134:3: ( (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? ) | ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==32) ) {
                alt17=1;
            }
            else if ( ((LA17_0>=68 && LA17_0<=69)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalJRules.g:1135:4: (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? )
                    {
                    // InternalJRules.g:1135:4: (otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )? )
                    // InternalJRules.g:1136:5: otherlv_2= 'type=' ( (lv_type_3_0= ruleNameType ) ) ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )?
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_29); 

                    					newLeafNode(otherlv_2, grammarAccess.getNameAccess().getTypeKeyword_2_0_0());
                    				
                    // InternalJRules.g:1140:5: ( (lv_type_3_0= ruleNameType ) )
                    // InternalJRules.g:1141:6: (lv_type_3_0= ruleNameType )
                    {
                    // InternalJRules.g:1141:6: (lv_type_3_0= ruleNameType )
                    // InternalJRules.g:1142:7: lv_type_3_0= ruleNameType
                    {

                    							newCompositeNode(grammarAccess.getNameAccess().getTypeNameTypeEnumRuleCall_2_0_1_0());
                    						
                    pushFollow(FOLLOW_11);
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

                    // InternalJRules.g:1159:5: ( (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )? )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==16) ) {
                        int LA14_1 = input.LA(2);

                        if ( ((LA14_1>=68 && LA14_1<=69)) ) {
                            alt14=1;
                        }
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJRules.g:1160:6: (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) ) (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )?
                            {
                            // InternalJRules.g:1160:6: (otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) ) )
                            // InternalJRules.g:1161:7: otherlv_4= 'and' ( (lv_operator_5_0= ruleNameOperator ) ) ( (lv_name_6_0= ruleEString ) )
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_28); 

                            							newLeafNode(otherlv_4, grammarAccess.getNameAccess().getAndKeyword_2_0_2_0_0());
                            						
                            // InternalJRules.g:1165:7: ( (lv_operator_5_0= ruleNameOperator ) )
                            // InternalJRules.g:1166:8: (lv_operator_5_0= ruleNameOperator )
                            {
                            // InternalJRules.g:1166:8: (lv_operator_5_0= ruleNameOperator )
                            // InternalJRules.g:1167:9: lv_operator_5_0= ruleNameOperator
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

                            // InternalJRules.g:1184:7: ( (lv_name_6_0= ruleEString ) )
                            // InternalJRules.g:1185:8: (lv_name_6_0= ruleEString )
                            {
                            // InternalJRules.g:1185:8: (lv_name_6_0= ruleEString )
                            // InternalJRules.g:1186:9: lv_name_6_0= ruleEString
                            {

                            									newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_2_0_2_0_2_0());
                            								
                            pushFollow(FOLLOW_30);
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

                            // InternalJRules.g:1204:6: (otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) ) )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==28) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // InternalJRules.g:1205:7: otherlv_7= ',' otherlv_8= 'in' ( (lv_Language_9_0= ruleLanguage ) )
                                    {
                                    otherlv_7=(Token)match(input,28,FOLLOW_31); 

                                    							newLeafNode(otherlv_7, grammarAccess.getNameAccess().getCommaKeyword_2_0_2_1_0());
                                    						
                                    otherlv_8=(Token)match(input,37,FOLLOW_32); 

                                    							newLeafNode(otherlv_8, grammarAccess.getNameAccess().getInKeyword_2_0_2_1_1());
                                    						
                                    // InternalJRules.g:1213:7: ( (lv_Language_9_0= ruleLanguage ) )
                                    // InternalJRules.g:1214:8: (lv_Language_9_0= ruleLanguage )
                                    {
                                    // InternalJRules.g:1214:8: (lv_Language_9_0= ruleLanguage )
                                    // InternalJRules.g:1215:9: lv_Language_9_0= ruleLanguage
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
                    // InternalJRules.g:1236:4: ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? )
                    {
                    // InternalJRules.g:1236:4: ( ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )? )
                    // InternalJRules.g:1237:5: ( (lv_operator_10_0= ruleNameOperator ) ) ( (lv_name_11_0= ruleEString ) ) (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )? (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )?
                    {
                    // InternalJRules.g:1237:5: ( (lv_operator_10_0= ruleNameOperator ) )
                    // InternalJRules.g:1238:6: (lv_operator_10_0= ruleNameOperator )
                    {
                    // InternalJRules.g:1238:6: (lv_operator_10_0= ruleNameOperator )
                    // InternalJRules.g:1239:7: lv_operator_10_0= ruleNameOperator
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

                    // InternalJRules.g:1256:5: ( (lv_name_11_0= ruleEString ) )
                    // InternalJRules.g:1257:6: (lv_name_11_0= ruleEString )
                    {
                    // InternalJRules.g:1257:6: (lv_name_11_0= ruleEString )
                    // InternalJRules.g:1258:7: lv_name_11_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_33);
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

                    // InternalJRules.g:1275:5: (otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalJRules.g:1276:6: otherlv_12= ',' otherlv_13= 'in' ( (lv_Language_14_0= ruleLanguage ) )
                            {
                            otherlv_12=(Token)match(input,28,FOLLOW_31); 

                            						newLeafNode(otherlv_12, grammarAccess.getNameAccess().getCommaKeyword_2_1_2_0());
                            					
                            otherlv_13=(Token)match(input,37,FOLLOW_32); 

                            						newLeafNode(otherlv_13, grammarAccess.getNameAccess().getInKeyword_2_1_2_1());
                            					
                            // InternalJRules.g:1284:6: ( (lv_Language_14_0= ruleLanguage ) )
                            // InternalJRules.g:1285:7: (lv_Language_14_0= ruleLanguage )
                            {
                            // InternalJRules.g:1285:7: (lv_Language_14_0= ruleLanguage )
                            // InternalJRules.g:1286:8: lv_Language_14_0= ruleLanguage
                            {

                            								newCompositeNode(grammarAccess.getNameAccess().getLanguageLanguageEnumRuleCall_2_1_2_2_0());
                            							
                            pushFollow(FOLLOW_11);
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

                    // InternalJRules.g:1304:5: (otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==16) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==32) ) {
                            int LA16_3 = input.LA(3);

                            if ( ((LA16_3>=63 && LA16_3<=67)) ) {
                                alt16=1;
                            }
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalJRules.g:1305:6: otherlv_15= 'and' otherlv_16= 'type=' ( (lv_type_17_0= ruleNameType ) )
                            {
                            otherlv_15=(Token)match(input,16,FOLLOW_24); 

                            						newLeafNode(otherlv_15, grammarAccess.getNameAccess().getAndKeyword_2_1_3_0());
                            					
                            otherlv_16=(Token)match(input,32,FOLLOW_29); 

                            						newLeafNode(otherlv_16, grammarAccess.getNameAccess().getTypeKeyword_2_1_3_1());
                            					
                            // InternalJRules.g:1313:6: ( (lv_type_17_0= ruleNameType ) )
                            // InternalJRules.g:1314:7: (lv_type_17_0= ruleNameType )
                            {
                            // InternalJRules.g:1314:7: (lv_type_17_0= ruleNameType )
                            // InternalJRules.g:1315:8: lv_type_17_0= ruleNameType
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
    // InternalJRules.g:1339:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:1339:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:1340:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRules.g:1346:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
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
            // InternalJRules.g:1352:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRules.g:1353:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRules.g:1353:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRules.g:1354:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRules.g:1354:3: ()
            // InternalJRules.g:1355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
            		
            // InternalJRules.g:1365:3: ( (lv_author_2_0= '@author' ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:1366:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRules.g:1366:4: (lv_author_2_0= '@author' )
                    // InternalJRules.g:1367:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,39,FOLLOW_35); 

                    					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1379:3: ( (lv_parametre_3_0= '@parameter' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1380:4: (lv_parametre_3_0= '@parameter' )
                    {
                    // InternalJRules.g:1380:4: (lv_parametre_3_0= '@parameter' )
                    // InternalJRules.g:1381:5: lv_parametre_3_0= '@parameter'
                    {
                    lv_parametre_3_0=(Token)match(input,40,FOLLOW_36); 

                    					newLeafNode(lv_parametre_3_0, grammarAccess.getJavaDocAccess().getParametreParameterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parametre", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1393:3: ( (lv_return_4_0= '@return' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1394:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRules.g:1394:4: (lv_return_4_0= '@return' )
                    // InternalJRules.g:1395:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,41,FOLLOW_37); 

                    					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1407:3: ( (lv_version_5_0= '@version' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1408:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRules.g:1408:4: (lv_version_5_0= '@version' )
                    // InternalJRules.g:1409:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,42,FOLLOW_38); 

                    					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1421:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1422:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRules.g:1422:4: (lv_throws_6_0= '@throws' )
                    // InternalJRules.g:1423:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,43,FOLLOW_39); 

                    					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRules.g:1435:3: ( (lv_see_7_0= '@see' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==44) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1436:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRules.g:1436:4: (lv_see_7_0= '@see' )
                    // InternalJRules.g:1437:5: lv_see_7_0= '@see'
                    {
                    lv_see_7_0=(Token)match(input,44,FOLLOW_2); 

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
    // InternalJRules.g:1453:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:1453:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:1454:2: iv_ruleContains= ruleContains EOF
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
    // InternalJRules.g:1460:1: ruleContains returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '(' ( (lv_which_2_0= ruleRule ) ) otherlv_3= ')' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1466:2: ( (otherlv_0= 'have' otherlv_1= '(' ( (lv_which_2_0= ruleRule ) ) otherlv_3= ')' ) )
            // InternalJRules.g:1467:2: (otherlv_0= 'have' otherlv_1= '(' ( (lv_which_2_0= ruleRule ) ) otherlv_3= ')' )
            {
            // InternalJRules.g:1467:2: (otherlv_0= 'have' otherlv_1= '(' ( (lv_which_2_0= ruleRule ) ) otherlv_3= ')' )
            // InternalJRules.g:1468:3: otherlv_0= 'have' otherlv_1= '(' ( (lv_which_2_0= ruleRule ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJRules.g:1476:3: ( (lv_which_2_0= ruleRule ) )
            // InternalJRules.g:1477:4: (lv_which_2_0= ruleRule )
            {
            // InternalJRules.g:1477:4: (lv_which_2_0= ruleRule )
            // InternalJRules.g:1478:5: lv_which_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
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

            otherlv_3=(Token)match(input,47,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

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
    // InternalJRules.g:1503:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:1503:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:1504:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRules.g:1510:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers:' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* ) ;
    public final EObject ruleModifiers() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_blend_2_0 = null;

        EObject lv_blend_6_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1516:2: ( (otherlv_0= 'modifiers:' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* ) )
            // InternalJRules.g:1517:2: (otherlv_0= 'modifiers:' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* )
            {
            // InternalJRules.g:1517:2: (otherlv_0= 'modifiers:' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* )
            // InternalJRules.g:1518:3: otherlv_0= 'modifiers:' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )*
            {
            otherlv_0=(Token)match(input,48,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,46,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJRules.g:1526:3: ( (lv_blend_2_0= ruleBlendModifiers ) )
            // InternalJRules.g:1527:4: (lv_blend_2_0= ruleBlendModifiers )
            {
            // InternalJRules.g:1527:4: (lv_blend_2_0= ruleBlendModifiers )
            // InternalJRules.g:1528:5: lv_blend_2_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_blend_2_0=ruleBlendModifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiersRule());
            					}
            					add(
            						current,
            						"blend",
            						lv_blend_2_0,
            						"es.uam.sara.tfg.dsl.JRules.BlendModifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,47,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_3());
            		
            // InternalJRules.g:1549:3: (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==15) ) {
                    int LA24_2 = input.LA(2);

                    if ( (LA24_2==46) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalJRules.g:1550:4: otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')'
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_40); 

            	    				newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getOrKeyword_4_0());
            	    			
            	    otherlv_5=(Token)match(input,46,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_4_1());
            	    			
            	    // InternalJRules.g:1558:4: ( (lv_blend_6_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:1559:5: (lv_blend_6_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:1559:5: (lv_blend_6_0= ruleBlendModifiers )
            	    // InternalJRules.g:1560:6: lv_blend_6_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_41);
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

            	    otherlv_7=(Token)match(input,47,FOLLOW_10); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_4_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // $ANTLR end "ruleModifiers"


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:1586:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:1586:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:1587:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalJRules.g:1593:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1599:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1600:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1600:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1601:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1601:3: (kw= '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==49) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1602:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_43); 

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
    // InternalJRules.g:1619:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalJRules.g:1619:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalJRules.g:1620:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalJRules.g:1626:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1632:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1633:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1633:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1634:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1634:3: (kw= '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1635:4: kw= '-'
                    {
                    kw=(Token)match(input,49,FOLLOW_43); 

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
    // InternalJRules.g:1652:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:1652:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:1653:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRules.g:1659:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:1665:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) )
            // InternalJRules.g:1666:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:1666:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            int alt37=5;
            switch ( input.LA(1) ) {
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt37=1;
                }
                break;
            case 50:
                {
                alt37=2;
                }
                break;
            case 51:
                {
                alt37=3;
                }
                break;
            case 52:
                {
                alt37=4;
                }
                break;
            case 53:
                {
                alt37=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalJRules.g:1667:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1667:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1668:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1668:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:1669:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:1669:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:1670:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_11);
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

                    // InternalJRules.g:1687:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==16) ) {
                        int LA27_1 = input.LA(2);

                        if ( (LA27_1==50) ) {
                            alt27=1;
                        }
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalJRules.g:1688:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,16,FOLLOW_44); 

                            					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                            				
                            // InternalJRules.g:1692:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:1693:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:1693:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:1694:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,50,FOLLOW_11); 

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

                    // InternalJRules.g:1707:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==16) ) {
                        int LA28_1 = input.LA(2);

                        if ( (LA28_1==51) ) {
                            alt28=1;
                        }
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJRules.g:1708:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_45); 

                            					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                            				
                            // InternalJRules.g:1712:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:1713:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:1713:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:1714:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,51,FOLLOW_11); 

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

                    // InternalJRules.g:1727:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==16) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==52) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1728:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,16,FOLLOW_46); 

                            					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                            				
                            // InternalJRules.g:1732:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:1733:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:1733:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:1734:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,52,FOLLOW_11); 

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

                    // InternalJRules.g:1747:4: (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==16) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRules.g:1748:5: otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) )
                            {
                            otherlv_7=(Token)match(input,16,FOLLOW_47); 

                            					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                            				
                            // InternalJRules.g:1752:5: ( (lv_synchronized_8_0= 'synchronized' ) )
                            // InternalJRules.g:1753:6: (lv_synchronized_8_0= 'synchronized' )
                            {
                            // InternalJRules.g:1753:6: (lv_synchronized_8_0= 'synchronized' )
                            // InternalJRules.g:1754:7: lv_synchronized_8_0= 'synchronized'
                            {
                            lv_synchronized_8_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalJRules.g:1769:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1769:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1770:4: ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1770:4: ( (lv_static_9_0= 'static' ) )
                    // InternalJRules.g:1771:5: (lv_static_9_0= 'static' )
                    {
                    // InternalJRules.g:1771:5: (lv_static_9_0= 'static' )
                    // InternalJRules.g:1772:6: lv_static_9_0= 'static'
                    {
                    lv_static_9_0=(Token)match(input,50,FOLLOW_11); 

                    						newLeafNode(lv_static_9_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRules.g:1784:4: (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==16) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==51) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1785:5: otherlv_10= 'and' ( (lv_final_11_0= 'final' ) )
                            {
                            otherlv_10=(Token)match(input,16,FOLLOW_45); 

                            					newLeafNode(otherlv_10, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                            				
                            // InternalJRules.g:1789:5: ( (lv_final_11_0= 'final' ) )
                            // InternalJRules.g:1790:6: (lv_final_11_0= 'final' )
                            {
                            // InternalJRules.g:1790:6: (lv_final_11_0= 'final' )
                            // InternalJRules.g:1791:7: lv_final_11_0= 'final'
                            {
                            lv_final_11_0=(Token)match(input,51,FOLLOW_11); 

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

                    // InternalJRules.g:1804:4: (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==16) ) {
                        int LA32_1 = input.LA(2);

                        if ( (LA32_1==52) ) {
                            alt32=1;
                        }
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1805:5: otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) )
                            {
                            otherlv_12=(Token)match(input,16,FOLLOW_46); 

                            					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                            				
                            // InternalJRules.g:1809:5: ( (lv_abstract_13_0= 'abstract' ) )
                            // InternalJRules.g:1810:6: (lv_abstract_13_0= 'abstract' )
                            {
                            // InternalJRules.g:1810:6: (lv_abstract_13_0= 'abstract' )
                            // InternalJRules.g:1811:7: lv_abstract_13_0= 'abstract'
                            {
                            lv_abstract_13_0=(Token)match(input,52,FOLLOW_11); 

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

                    // InternalJRules.g:1824:4: (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==16) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1825:5: otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) )
                            {
                            otherlv_14=(Token)match(input,16,FOLLOW_47); 

                            					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                            				
                            // InternalJRules.g:1829:5: ( (lv_synchronized_15_0= 'synchronized' ) )
                            // InternalJRules.g:1830:6: (lv_synchronized_15_0= 'synchronized' )
                            {
                            // InternalJRules.g:1830:6: (lv_synchronized_15_0= 'synchronized' )
                            // InternalJRules.g:1831:7: lv_synchronized_15_0= 'synchronized'
                            {
                            lv_synchronized_15_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalJRules.g:1846:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1846:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1847:4: ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1847:4: ( (lv_final_16_0= 'final' ) )
                    // InternalJRules.g:1848:5: (lv_final_16_0= 'final' )
                    {
                    // InternalJRules.g:1848:5: (lv_final_16_0= 'final' )
                    // InternalJRules.g:1849:6: lv_final_16_0= 'final'
                    {
                    lv_final_16_0=(Token)match(input,51,FOLLOW_11); 

                    						newLeafNode(lv_final_16_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRules.g:1861:4: (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==16) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==52) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1862:5: otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) )
                            {
                            otherlv_17=(Token)match(input,16,FOLLOW_46); 

                            					newLeafNode(otherlv_17, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                            				
                            // InternalJRules.g:1866:5: ( (lv_abstract_18_0= 'abstract' ) )
                            // InternalJRules.g:1867:6: (lv_abstract_18_0= 'abstract' )
                            {
                            // InternalJRules.g:1867:6: (lv_abstract_18_0= 'abstract' )
                            // InternalJRules.g:1868:7: lv_abstract_18_0= 'abstract'
                            {
                            lv_abstract_18_0=(Token)match(input,52,FOLLOW_11); 

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

                    // InternalJRules.g:1881:4: (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==16) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:1882:5: otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) )
                            {
                            otherlv_19=(Token)match(input,16,FOLLOW_47); 

                            					newLeafNode(otherlv_19, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                            				
                            // InternalJRules.g:1886:5: ( (lv_synchronized_20_0= 'synchronized' ) )
                            // InternalJRules.g:1887:6: (lv_synchronized_20_0= 'synchronized' )
                            {
                            // InternalJRules.g:1887:6: (lv_synchronized_20_0= 'synchronized' )
                            // InternalJRules.g:1888:7: lv_synchronized_20_0= 'synchronized'
                            {
                            lv_synchronized_20_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalJRules.g:1903:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1903:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1904:4: ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1904:4: ( (lv_abstract_21_0= 'abstract' ) )
                    // InternalJRules.g:1905:5: (lv_abstract_21_0= 'abstract' )
                    {
                    // InternalJRules.g:1905:5: (lv_abstract_21_0= 'abstract' )
                    // InternalJRules.g:1906:6: lv_abstract_21_0= 'abstract'
                    {
                    lv_abstract_21_0=(Token)match(input,52,FOLLOW_11); 

                    						newLeafNode(lv_abstract_21_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRules.g:1918:4: (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==16) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:1919:5: otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) )
                            {
                            otherlv_22=(Token)match(input,16,FOLLOW_47); 

                            					newLeafNode(otherlv_22, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                            				
                            // InternalJRules.g:1923:5: ( (lv_synchronized_23_0= 'synchronized' ) )
                            // InternalJRules.g:1924:6: (lv_synchronized_23_0= 'synchronized' )
                            {
                            // InternalJRules.g:1924:6: (lv_synchronized_23_0= 'synchronized' )
                            // InternalJRules.g:1925:7: lv_synchronized_23_0= 'synchronized'
                            {
                            lv_synchronized_23_0=(Token)match(input,53,FOLLOW_2); 

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
                    // InternalJRules.g:1940:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:1940:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    // InternalJRules.g:1941:4: (lv_synchronized_24_0= 'synchronized' )
                    {
                    // InternalJRules.g:1941:4: (lv_synchronized_24_0= 'synchronized' )
                    // InternalJRules.g:1942:5: lv_synchronized_24_0= 'synchronized'
                    {
                    lv_synchronized_24_0=(Token)match(input,53,FOLLOW_2); 

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
    // InternalJRules.g:1958:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1964:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:1965:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:1965:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt38=1;
                }
                break;
            case 55:
                {
                alt38=2;
                }
                break;
            case 56:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalJRules.g:1966:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:1966:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:1967:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1974:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:1974:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:1975:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:1982:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:1982:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:1983:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); 

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
    // InternalJRules.g:1993:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) ;
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
            // InternalJRules.g:1999:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) )
            // InternalJRules.g:2000:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            {
            // InternalJRules.g:2000:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt39=1;
                }
                break;
            case 58:
                {
                alt39=2;
                }
                break;
            case 59:
                {
                alt39=3;
                }
                break;
            case 60:
                {
                alt39=4;
                }
                break;
            case 61:
                {
                alt39=5;
                }
                break;
            case 62:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalJRules.g:2001:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:2001:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:2002:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2009:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:2009:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:2010:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2017:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:2017:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:2018:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2025:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:2025:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:2026:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2033:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:2033:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:2034:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2041:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:2041:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:2042:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_2); 

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
    // InternalJRules.g:2052:1: ruleNameType returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2058:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRules.g:2059:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRules.g:2059:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt40=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt40=1;
                }
                break;
            case 64:
                {
                alt40=2;
                }
                break;
            case 65:
                {
                alt40=3;
                }
                break;
            case 66:
                {
                alt40=4;
                }
                break;
            case 67:
                {
                alt40=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalJRules.g:2060:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRules.g:2060:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRules.g:2061:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2068:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRules.g:2068:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRules.g:2069:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2076:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRules.g:2076:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRules.g:2077:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2084:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRules.g:2084:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRules.g:2085:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2092:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRules.g:2092:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRules.g:2093:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_2); 

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
    // InternalJRules.g:2103:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2109:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) ) )
            // InternalJRules.g:2110:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) )
            {
            // InternalJRules.g:2110:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==68) ) {
                alt41=1;
            }
            else if ( (LA41_0==69) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRules.g:2111:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRules.g:2111:3: (enumLiteral_0= 'like' )
                    // InternalJRules.g:2112:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2119:3: (enumLiteral_1= 'equal' )
                    {
                    // InternalJRules.g:2119:3: (enumLiteral_1= 'equal' )
                    // InternalJRules.g:2120:4: enumLiteral_1= 'equal'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getEqualEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getEqualEnumLiteralDeclaration_1());
                    			

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
    // InternalJRules.g:2130:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2136:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRules.g:2137:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRules.g:2137:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==70) ) {
                alt42=1;
            }
            else if ( (LA42_0==71) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalJRules.g:2138:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRules.g:2138:3: (enumLiteral_0= 'English' )
                    // InternalJRules.g:2139:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2146:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRules.g:2146:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRules.g:2147:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalJRules.g:2157:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:2163:2: ( ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) ) )
            // InternalJRules.g:2164:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) )
            {
            // InternalJRules.g:2164:2: ( (enumLiteral_0= 'Default' ) | (enumLiteral_1= 'Public' ) | (enumLiteral_2= 'Protected' ) | (enumLiteral_3= 'Private' ) )
            int alt43=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt43=1;
                }
                break;
            case 73:
                {
                alt43=2;
                }
                break;
            case 74:
                {
                alt43=3;
                }
                break;
            case 75:
                {
                alt43=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2165:3: (enumLiteral_0= 'Default' )
                    {
                    // InternalJRules.g:2165:3: (enumLiteral_0= 'Default' )
                    // InternalJRules.g:2166:4: enumLiteral_0= 'Default'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2173:3: (enumLiteral_1= 'Public' )
                    {
                    // InternalJRules.g:2173:3: (enumLiteral_1= 'Public' )
                    // InternalJRules.g:2174:4: enumLiteral_1= 'Public'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2181:3: (enumLiteral_2= 'Protected' )
                    {
                    // InternalJRules.g:2181:3: (enumLiteral_2= 'Protected' )
                    // InternalJRules.g:2182:4: enumLiteral_2= 'Protected'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2189:3: (enumLiteral_3= 'Private' )
                    {
                    // InternalJRules.g:2189:3: (enumLiteral_3= 'Private' )
                    // InternalJRules.g:2190:4: enumLiteral_3= 'Private'
                    {
                    enumLiteral_3=(Token)match(input,75,FOLLOW_2); 

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
    static final String dfa_2s = "\1\21\1\22\16\uffff";
    static final String dfa_3s = "\1\60\1\42\16\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\5\1\7\1\10\1\13\1\14\1\15\1\16\1\6\1\12\1\11\1\4\1\2\1\1";
    static final String dfa_5s = "\20\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\4\uffff\1\3\5\uffff\1\4\1\5\3\uffff\1\6\1\uffff\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\17\1\16\4\uffff\1\15\5\uffff\1\12\2\uffff\1\14\1\13",
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
            return "159:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_NoEmpty_9= ruleNoEmpty | this_Name_10= ruleName | this_JavaDoc_11= ruleJavaDoc | this_Contains_12= ruleContains | this_Modifiers_13= ruleModifiers )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x01C0000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x01C0000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x7E00000000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001205182121000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000A10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0002000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000010010002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00001F8000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00001F0000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00001E0000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00001C0000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x003C000000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});

}