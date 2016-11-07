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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalJRulesParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ProjectName:'", "';'", "'no'", "'which'", "'satisfy'", "'or'", "'and'", "'('", "')'", "'is'", "'implemented'", "'inheritor'", "'implements'", "'min='", "'max='", "'interfaces'", "'extended'", "'numParameters='", "'types='", "'['", "','", "']'", "'constructor'", "'return'", "'type='", "'initialize'", "'not'", "'empty'", "'name'", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'{'", "'}'", "'modifiers:'", "'-'", "'static'", "'final'", "'abstract'", "'synchronized'", "'one'", "'exists'", "'all'", "'Package'", "'Class'", "'Interface'", "'Enum'", "'Method'", "'Attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'equal'", "'end'", "'start'", "'contain'", "'English'", "'Spanish'", "'default'", "'public'", "'protected'", "'private'"
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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleSetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleSet=ruleRuleSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleSet; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getProjectNameKeyword_0());
              		
            }
            // InternalJRules.g:84:3: ( (lv_ProjectName_1_0= ruleEString ) )
            // InternalJRules.g:85:4: (lv_ProjectName_1_0= ruleEString )
            {
            // InternalJRules.g:85:4: (lv_ProjectName_1_0= ruleEString )
            // InternalJRules.g:86:5: lv_ProjectName_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_ProjectName_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:103:3: ( (lv_rules_2_0= ruleRule ) )
            // InternalJRules.g:104:4: (lv_rules_2_0= ruleRule )
            {
            // InternalJRules.g:104:4: (lv_rules_2_0= ruleRule )
            // InternalJRules.g:105:5: lv_rules_2_0= ruleRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_rules_2_0=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getRuleSetAccess().getSemicolonKeyword_3());
              		
            }
            // InternalJRules.g:126:3: ( ( (lv_rules_4_0= ruleRule ) ) otherlv_5= ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13||(LA1_0>=56 && LA1_0<=58)) ) {
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
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_4_0_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_rules_4_0=ruleRule();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_5=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getRuleSetAccess().getSemicolonKeyword_4_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSatisfyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSatisfy=ruleSatisfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSatisfy; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:162:1: ruleSatisfy returns [EObject current=null] : (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers ) ;
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
            // InternalJRules.g:168:2: ( (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers ) )
            // InternalJRules.g:169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )
            {
            // InternalJRules.g:169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )
            int alt2=15;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalJRules.g:170:3: this_isImplemented_0= ruleisImplemented
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getIsImplementedParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_isImplemented_0=ruleisImplemented();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_isImplemented_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJRules.g:179:3: this_IsInheritor_1= ruleIsInheritor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getIsInheritorParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsInheritor_1=ruleIsInheritor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IsInheritor_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalJRules.g:188:3: this_Implements_2= ruleImplements
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getImplementsParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Implements_2=ruleImplements();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Implements_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalJRules.g:197:3: this_IsExtended_3= ruleIsExtended
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getIsExtendedParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_IsExtended_3=ruleIsExtended();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IsExtended_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalJRules.g:206:3: this_Parameter_4= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getParameterParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Parameter_4=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Parameter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalJRules.g:215:3: this_Constructor_5= ruleConstructor
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getConstructorParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Constructor_5=ruleConstructor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Constructor_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalJRules.g:224:3: this_Return_6= ruleReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getReturnParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Return_6=ruleReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Return_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalJRules.g:233:3: this_AttributeType_7= ruleAttributeType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getAttributeTypeParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AttributeType_7=ruleAttributeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeType_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalJRules.g:242:3: this_Initialize_8= ruleInitialize
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getInitializeParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Initialize_8=ruleInitialize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Initialize_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalJRules.g:251:3: this_Empty_9= ruleEmpty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getEmptyParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Empty_9=ruleEmpty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Empty_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalJRules.g:260:3: this_NameOperation_10= ruleNameOperation
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getNameOperationParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameOperation_10=ruleNameOperation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameOperation_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalJRules.g:269:3: this_NameType_11= ruleNameType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getNameTypeParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_NameType_11=ruleNameType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NameType_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalJRules.g:278:3: this_JavaDoc_12= ruleJavaDoc
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getJavaDocParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_JavaDoc_12=ruleJavaDoc();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_JavaDoc_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalJRules.g:287:3: this_Contains_13= ruleContains
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getContainsParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Contains_13=ruleContains();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Contains_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalJRules.g:296:3: this_Modifiers_14= ruleModifiers
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSatisfyAccess().getModifiersParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Modifiers_14=ruleModifiers();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Modifiers_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSatisfy"


    // $ANTLR start "entryRuleEString"
    // InternalJRules.g:308:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRules.g:308:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRules.g:309:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:315:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRules.g:321:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRules.g:322:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRules.g:322:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalJRules.g:323:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalJRules.g:331:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRule"
    // InternalJRules.g:342:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRules.g:342:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRules.g:343:2: iv_ruleRule= ruleRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:349:1: ruleRule returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) ;
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
            // InternalJRules.g:355:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? ) )
            // InternalJRules.g:356:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            {
            // InternalJRules.g:356:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )? )
            // InternalJRules.g:357:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElementJava ) ) (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )? (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            {
            // InternalJRules.g:357:3: ( (lv_no_0_0= 'no' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRules.g:358:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:358:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:359:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_no_0_0, grammarAccess.getRuleAccess().getNoNoKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getRuleRule());
                      					}
                      					setWithLastConsumed(current, "no", true, "no");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:371:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRules.g:372:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRules.g:372:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRules.g:373:5: lv_quantifier_1_0= ruleQuantifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getQuantifierQuantifierEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_quantifier_1_0=ruleQuantifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:390:3: ( (lv_element_2_0= ruleElementJava ) )
            // InternalJRules.g:391:4: (lv_element_2_0= ruleElementJava )
            {
            // InternalJRules.g:391:4: (lv_element_2_0= ruleElementJava )
            // InternalJRules.g:392:5: lv_element_2_0= ruleElementJava
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getRuleAccess().getElementElementJavaEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_element_2_0=ruleElementJava();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:409:3: (otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalJRules.g:410:4: otherlv_3= 'which' ( (lv_filter_4_0= ruleFilter ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getWhichKeyword_3_0());
                      			
                    }
                    // InternalJRules.g:414:4: ( (lv_filter_4_0= ruleFilter ) )
                    // InternalJRules.g:415:5: (lv_filter_4_0= ruleFilter )
                    {
                    // InternalJRules.g:415:5: (lv_filter_4_0= ruleFilter )
                    // InternalJRules.g:416:6: lv_filter_4_0= ruleFilter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getFilterFilterParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_10);
                    lv_filter_4_0=ruleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            // InternalJRules.g:434:3: (otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRules.g:435:4: otherlv_5= 'satisfy' ( (lv_satisfy_6_0= ruleOr ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getSatisfyKeyword_4_0());
                      			
                    }
                    // InternalJRules.g:439:4: ( (lv_satisfy_6_0= ruleOr ) )
                    // InternalJRules.g:440:5: (lv_satisfy_6_0= ruleOr )
                    {
                    // InternalJRules.g:440:5: (lv_satisfy_6_0= ruleOr )
                    // InternalJRules.g:441:6: lv_satisfy_6_0= ruleOr
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRuleAccess().getSatisfyOrParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_satisfy_6_0=ruleOr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleFilter"
    // InternalJRules.g:463:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalJRules.g:463:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalJRules.g:464:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:470:1: ruleFilter returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        EObject lv_filter_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:476:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) ) )
            // InternalJRules.g:477:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            {
            // InternalJRules.g:477:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) ) )
            // InternalJRules.g:478:3: ( (lv_no_0_0= 'no' ) )? ( (lv_filter_1_0= ruleOr ) )
            {
            // InternalJRules.g:478:3: ( (lv_no_0_0= 'no' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalJRules.g:479:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRules.g:479:4: (lv_no_0_0= 'no' )
                    // InternalJRules.g:480:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,13,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_no_0_0, grammarAccess.getFilterAccess().getNoNoKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getFilterRule());
                      					}
                      					setWithLastConsumed(current, "no", true, "no");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:492:3: ( (lv_filter_1_0= ruleOr ) )
            // InternalJRules.g:493:4: (lv_filter_1_0= ruleOr )
            {
            // InternalJRules.g:493:4: (lv_filter_1_0= ruleOr )
            // InternalJRules.g:494:5: lv_filter_1_0= ruleOr
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterAccess().getFilterOrParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_filter_1_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleOr"
    // InternalJRules.g:515:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRules.g:515:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRules.g:516:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:522:1: ruleOr returns [EObject current=null] : ( ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico ) | this_OrComplejo_1= ruleOrComplejo ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        EObject this_OrUnico_0 = null;

        EObject this_OrComplejo_1 = null;



        	enterRule();

        try {
            // InternalJRules.g:528:2: ( ( ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico ) | this_OrComplejo_1= ruleOrComplejo ) )
            // InternalJRules.g:529:2: ( ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico ) | this_OrComplejo_1= ruleOrComplejo )
            {
            // InternalJRules.g:529:2: ( ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico ) | this_OrComplejo_1= ruleOrComplejo )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalJRules.g:530:3: ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico )
                    {
                    // InternalJRules.g:530:3: ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico )
                    // InternalJRules.g:531:4: ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getOrAccess().getOrUnicoParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    this_OrUnico_0=ruleOrUnico();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_OrUnico_0;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:542:3: this_OrComplejo_1= ruleOrComplejo
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getOrAccess().getOrComplejoParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OrComplejo_1=ruleOrComplejo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OrComplejo_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleOrUnico"
    // InternalJRules.g:554:1: entryRuleOrUnico returns [EObject current=null] : iv_ruleOrUnico= ruleOrUnico EOF ;
    public final EObject entryRuleOrUnico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrUnico = null;


        try {
            // InternalJRules.g:554:48: (iv_ruleOrUnico= ruleOrUnico EOF )
            // InternalJRules.g:555:2: iv_ruleOrUnico= ruleOrUnico EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrUnicoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrUnico=ruleOrUnico();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrUnico; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrUnico"


    // $ANTLR start "ruleOrUnico"
    // InternalJRules.g:561:1: ruleOrUnico returns [EObject current=null] : ( (lv_op_0_0= ruleAndSimple ) ) ;
    public final EObject ruleOrUnico() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:567:2: ( ( (lv_op_0_0= ruleAndSimple ) ) )
            // InternalJRules.g:568:2: ( (lv_op_0_0= ruleAndSimple ) )
            {
            // InternalJRules.g:568:2: ( (lv_op_0_0= ruleAndSimple ) )
            // InternalJRules.g:569:3: (lv_op_0_0= ruleAndSimple )
            {
            // InternalJRules.g:569:3: (lv_op_0_0= ruleAndSimple )
            // InternalJRules.g:570:4: lv_op_0_0= ruleAndSimple
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getOrUnicoAccess().getOpAndSimpleParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_op_0_0=ruleAndSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getOrUnicoRule());
              				}
              				add(
              					current,
              					"op",
              					lv_op_0_0,
              					"es.uam.sara.tfg.dsl.JRules.AndSimple");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrUnico"


    // $ANTLR start "entryRuleOrComplejo"
    // InternalJRules.g:590:1: entryRuleOrComplejo returns [EObject current=null] : iv_ruleOrComplejo= ruleOrComplejo EOF ;
    public final EObject entryRuleOrComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrComplejo = null;


        try {
            // InternalJRules.g:590:51: (iv_ruleOrComplejo= ruleOrComplejo EOF )
            // InternalJRules.g:591:2: iv_ruleOrComplejo= ruleOrComplejo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrComplejoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrComplejo=ruleOrComplejo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrComplejo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrComplejo"


    // $ANTLR start "ruleOrComplejo"
    // InternalJRules.g:597:1: ruleOrComplejo returns [EObject current=null] : ( ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) ) (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+ ) ;
    public final EObject ruleOrComplejo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_1 = null;

        EObject lv_op_0_2 = null;

        EObject lv_op_2_1 = null;

        EObject lv_op_2_2 = null;



        	enterRule();

        try {
            // InternalJRules.g:603:2: ( ( ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) ) (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+ ) )
            // InternalJRules.g:604:2: ( ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) ) (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+ )
            {
            // InternalJRules.g:604:2: ( ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) ) (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+ )
            // InternalJRules.g:605:3: ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) ) (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+
            {
            // InternalJRules.g:605:3: ( ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) ) )
            // InternalJRules.g:606:4: ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) )
            {
            // InternalJRules.g:606:4: ( (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico ) )
            // InternalJRules.g:607:5: (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico )
            {
            // InternalJRules.g:607:5: (lv_op_0_1= ruleAndComplejo | lv_op_0_2= ruleAndUnico )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            else if ( (LA9_0==20||LA9_0==23||LA9_0==28||(LA9_0>=34 && LA9_0<=35)||(LA9_0>=39 && LA9_0<=40)||LA9_0==47||LA9_0==50) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRules.g:608:6: lv_op_0_1= ruleAndComplejo
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrComplejoAccess().getOpAndComplejoParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_op_0_1=ruleAndComplejo();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrComplejoRule());
                      						}
                      						add(
                      							current,
                      							"op",
                      							lv_op_0_1,
                      							"es.uam.sara.tfg.dsl.JRules.AndComplejo");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalJRules.g:624:6: lv_op_0_2= ruleAndUnico
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrComplejoAccess().getOpAndUnicoParserRuleCall_0_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_op_0_2=ruleAndUnico();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrComplejoRule());
                      						}
                      						add(
                      							current,
                      							"op",
                      							lv_op_0_2,
                      							"es.uam.sara.tfg.dsl.JRules.AndUnico");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalJRules.g:642:3: (otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalJRules.g:643:4: otherlv_1= 'or' ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) )
            	    {
            	    otherlv_1=(Token)match(input,16,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getOrComplejoAccess().getOrKeyword_1_0());
            	      			
            	    }
            	    // InternalJRules.g:647:4: ( ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) ) )
            	    // InternalJRules.g:648:5: ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) )
            	    {
            	    // InternalJRules.g:648:5: ( (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico ) )
            	    // InternalJRules.g:649:6: (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico )
            	    {
            	    // InternalJRules.g:649:6: (lv_op_2_1= ruleAndComplejo | lv_op_2_2= ruleAndUnico )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==18) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==20||LA10_0==23||LA10_0==28||(LA10_0>=34 && LA10_0<=35)||(LA10_0>=39 && LA10_0<=40)||LA10_0==47||LA10_0==50) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalJRules.g:650:7: lv_op_2_1= ruleAndComplejo
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getOrComplejoAccess().getOpAndComplejoParserRuleCall_1_1_0_0());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_op_2_1=ruleAndComplejo();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getOrComplejoRule());
            	              							}
            	              							add(
            	              								current,
            	              								"op",
            	              								lv_op_2_1,
            	              								"es.uam.sara.tfg.dsl.JRules.AndComplejo");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalJRules.g:666:7: lv_op_2_2= ruleAndUnico
            	            {
            	            if ( state.backtracking==0 ) {

            	              							newCompositeNode(grammarAccess.getOrComplejoAccess().getOpAndUnicoParserRuleCall_1_1_0_1());
            	              						
            	            }
            	            pushFollow(FOLLOW_12);
            	            lv_op_2_2=ruleAndUnico();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElementForParent(grammarAccess.getOrComplejoRule());
            	              							}
            	              							add(
            	              								current,
            	              								"op",
            	              								lv_op_2_2,
            	              								"es.uam.sara.tfg.dsl.JRules.AndUnico");
            	              							afterParserOrEnumRuleCall();
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOrComplejo"


    // $ANTLR start "entryRuleAndUnico"
    // InternalJRules.g:689:1: entryRuleAndUnico returns [EObject current=null] : iv_ruleAndUnico= ruleAndUnico EOF ;
    public final EObject entryRuleAndUnico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndUnico = null;


        try {
            // InternalJRules.g:689:49: (iv_ruleAndUnico= ruleAndUnico EOF )
            // InternalJRules.g:690:2: iv_ruleAndUnico= ruleAndUnico EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndUnicoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndUnico=ruleAndUnico();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndUnico; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndUnico"


    // $ANTLR start "ruleAndUnico"
    // InternalJRules.g:696:1: ruleAndUnico returns [EObject current=null] : ( (lv_op_0_0= ruleSatisfy ) ) ;
    public final EObject ruleAndUnico() throws RecognitionException {
        EObject current = null;

        EObject lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:702:2: ( ( (lv_op_0_0= ruleSatisfy ) ) )
            // InternalJRules.g:703:2: ( (lv_op_0_0= ruleSatisfy ) )
            {
            // InternalJRules.g:703:2: ( (lv_op_0_0= ruleSatisfy ) )
            // InternalJRules.g:704:3: (lv_op_0_0= ruleSatisfy )
            {
            // InternalJRules.g:704:3: (lv_op_0_0= ruleSatisfy )
            // InternalJRules.g:705:4: lv_op_0_0= ruleSatisfy
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAndUnicoAccess().getOpSatisfyParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_op_0_0=ruleSatisfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAndUnicoRule());
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndUnico"


    // $ANTLR start "entryRuleAndSimple"
    // InternalJRules.g:725:1: entryRuleAndSimple returns [EObject current=null] : iv_ruleAndSimple= ruleAndSimple EOF ;
    public final EObject entryRuleAndSimple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndSimple = null;


        try {
            // InternalJRules.g:725:50: (iv_ruleAndSimple= ruleAndSimple EOF )
            // InternalJRules.g:726:2: iv_ruleAndSimple= ruleAndSimple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndSimpleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndSimple=ruleAndSimple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndSimple; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndSimple"


    // $ANTLR start "ruleAndSimple"
    // InternalJRules.g:732:1: ruleAndSimple returns [EObject current=null] : ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+ ) ;
    public final EObject ruleAndSimple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:738:2: ( ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+ ) )
            // InternalJRules.g:739:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+ )
            {
            // InternalJRules.g:739:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+ )
            // InternalJRules.g:740:3: ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+
            {
            // InternalJRules.g:740:3: ( (lv_op_0_0= ruleSatisfy ) )
            // InternalJRules.g:741:4: (lv_op_0_0= ruleSatisfy )
            {
            // InternalJRules.g:741:4: (lv_op_0_0= ruleSatisfy )
            // InternalJRules.g:742:5: lv_op_0_0= ruleSatisfy
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndSimpleAccess().getOpSatisfyParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_op_0_0=ruleSatisfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndSimpleRule());
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

            // InternalJRules.g:759:3: (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalJRules.g:760:4: otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_1, grammarAccess.getAndSimpleAccess().getAndKeyword_1_0());
            	      			
            	    }
            	    // InternalJRules.g:764:4: ( (lv_op_2_0= ruleSatisfy ) )
            	    // InternalJRules.g:765:5: (lv_op_2_0= ruleSatisfy )
            	    {
            	    // InternalJRules.g:765:5: (lv_op_2_0= ruleSatisfy )
            	    // InternalJRules.g:766:6: lv_op_2_0= ruleSatisfy
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndSimpleAccess().getOpSatisfyParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_op_2_0=ruleSatisfy();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndSimpleRule());
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


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndSimple"


    // $ANTLR start "entryRuleAndComplejo"
    // InternalJRules.g:788:1: entryRuleAndComplejo returns [EObject current=null] : iv_ruleAndComplejo= ruleAndComplejo EOF ;
    public final EObject entryRuleAndComplejo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndComplejo = null;


        try {
            // InternalJRules.g:788:52: (iv_ruleAndComplejo= ruleAndComplejo EOF )
            // InternalJRules.g:789:2: iv_ruleAndComplejo= ruleAndComplejo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndComplejoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAndComplejo=ruleAndComplejo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndComplejo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndComplejo"


    // $ANTLR start "ruleAndComplejo"
    // InternalJRules.g:795:1: ruleAndComplejo returns [EObject current=null] : (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+ otherlv_4= ')' ) ;
    public final EObject ruleAndComplejo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_op_1_0 = null;

        EObject lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:801:2: ( (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+ otherlv_4= ')' ) )
            // InternalJRules.g:802:2: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+ otherlv_4= ')' )
            {
            // InternalJRules.g:802:2: (otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+ otherlv_4= ')' )
            // InternalJRules.g:803:3: otherlv_0= '(' ( (lv_op_1_0= ruleSatisfy ) ) (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+ otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAndComplejoAccess().getLeftParenthesisKeyword_0());
              		
            }
            // InternalJRules.g:807:3: ( (lv_op_1_0= ruleSatisfy ) )
            // InternalJRules.g:808:4: (lv_op_1_0= ruleSatisfy )
            {
            // InternalJRules.g:808:4: (lv_op_1_0= ruleSatisfy )
            // InternalJRules.g:809:5: lv_op_1_0= ruleSatisfy
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAndComplejoAccess().getOpSatisfyParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_op_1_0=ruleSatisfy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAndComplejoRule());
              					}
              					add(
              						current,
              						"op",
              						lv_op_1_0,
              						"es.uam.sara.tfg.dsl.JRules.Satisfy");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalJRules.g:826:3: (otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==17) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalJRules.g:827:4: otherlv_2= 'and' ( (lv_op_3_0= ruleSatisfy ) )
            	    {
            	    otherlv_2=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getAndComplejoAccess().getAndKeyword_2_0());
            	      			
            	    }
            	    // InternalJRules.g:831:4: ( (lv_op_3_0= ruleSatisfy ) )
            	    // InternalJRules.g:832:5: (lv_op_3_0= ruleSatisfy )
            	    {
            	    // InternalJRules.g:832:5: (lv_op_3_0= ruleSatisfy )
            	    // InternalJRules.g:833:6: lv_op_3_0= ruleSatisfy
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndComplejoAccess().getOpSatisfyParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_op_3_0=ruleSatisfy();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndComplejoRule());
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


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAndComplejoAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAndComplejo"


    // $ANTLR start "entryRuleisImplemented"
    // InternalJRules.g:859:1: entryRuleisImplemented returns [EObject current=null] : iv_ruleisImplemented= ruleisImplemented EOF ;
    public final EObject entryRuleisImplemented() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleisImplemented = null;


        try {
            // InternalJRules.g:859:54: (iv_ruleisImplemented= ruleisImplemented EOF )
            // InternalJRules.g:860:2: iv_ruleisImplemented= ruleisImplemented EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsImplementedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleisImplemented=ruleisImplemented();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleisImplemented; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:866:1: ruleisImplemented returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'implemented' ) ;
    public final EObject ruleisImplemented() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:872:2: ( ( () otherlv_1= 'is' otherlv_2= 'implemented' ) )
            // InternalJRules.g:873:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            {
            // InternalJRules.g:873:2: ( () otherlv_1= 'is' otherlv_2= 'implemented' )
            // InternalJRules.g:874:3: () otherlv_1= 'is' otherlv_2= 'implemented'
            {
            // InternalJRules.g:874:3: ()
            // InternalJRules.g:875:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIsImplementedAccess().getIsImplementedAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIsImplementedAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,21,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIsImplementedAccess().getImplementedKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleisImplemented"


    // $ANTLR start "entryRuleIsInheritor"
    // InternalJRules.g:893:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRules.g:893:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRules.g:894:2: iv_ruleIsInheritor= ruleIsInheritor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsInheritorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsInheritor=ruleIsInheritor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsInheritor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:900:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:906:2: ( ( () otherlv_1= 'is' otherlv_2= 'inheritor' ) )
            // InternalJRules.g:907:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            {
            // InternalJRules.g:907:2: ( () otherlv_1= 'is' otherlv_2= 'inheritor' )
            // InternalJRules.g:908:3: () otherlv_1= 'is' otherlv_2= 'inheritor'
            {
            // InternalJRules.g:908:3: ()
            // InternalJRules.g:909:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIsInheritorAccess().getInheritorKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsInheritor"


    // $ANTLR start "entryRuleImplements"
    // InternalJRules.g:927:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRules.g:927:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRules.g:928:2: iv_ruleImplements= ruleImplements EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImplements=ruleImplements();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplements; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:934:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) ;
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
            // InternalJRules.g:940:2: ( ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' ) )
            // InternalJRules.g:941:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            {
            // InternalJRules.g:941:2: ( () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces' )
            // InternalJRules.g:942:3: () otherlv_1= 'implements' ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )? otherlv_12= 'interfaces'
            {
            // InternalJRules.g:942:3: ()
            // InternalJRules.g:943:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getImplementsAccess().getImplementsAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsKeyword_1());
              		
            }
            // InternalJRules.g:953:3: ( (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? ) | (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? ) )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            else if ( (LA16_0==25) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // InternalJRules.g:954:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:954:4: (otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )? )
                    // InternalJRules.g:955:5: otherlv_2= 'min=' ( (lv_minInterface_3_0= ruleEInt ) ) (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getMinKeyword_2_0_0());
                      				
                    }
                    // InternalJRules.g:959:5: ( (lv_minInterface_3_0= ruleEInt ) )
                    // InternalJRules.g:960:6: (lv_minInterface_3_0= ruleEInt )
                    {
                    // InternalJRules.g:960:6: (lv_minInterface_3_0= ruleEInt )
                    // InternalJRules.g:961:7: lv_minInterface_3_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_0_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_minInterface_3_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    // InternalJRules.g:978:5: (otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==17) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalJRules.g:979:6: otherlv_4= 'and' otherlv_5= 'max=' ( (lv_maxInterface_6_0= ruleEInt ) )
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_22); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_4, grammarAccess.getImplementsAccess().getAndKeyword_2_0_2_0());
                              					
                            }
                            otherlv_5=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_5, grammarAccess.getImplementsAccess().getMaxKeyword_2_0_2_1());
                              					
                            }
                            // InternalJRules.g:987:6: ( (lv_maxInterface_6_0= ruleEInt ) )
                            // InternalJRules.g:988:7: (lv_maxInterface_6_0= ruleEInt )
                            {
                            // InternalJRules.g:988:7: (lv_maxInterface_6_0= ruleEInt )
                            // InternalJRules.g:989:8: lv_maxInterface_6_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_0_2_2_0());
                              							
                            }
                            pushFollow(FOLLOW_23);
                            lv_maxInterface_6_0=ruleEInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1009:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    {
                    // InternalJRules.g:1009:4: (otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )? )
                    // InternalJRules.g:1010:5: otherlv_7= 'max=' ( (lv_maxInterface_8_0= ruleEInt ) ) (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getImplementsAccess().getMaxKeyword_2_1_0());
                      				
                    }
                    // InternalJRules.g:1014:5: ( (lv_maxInterface_8_0= ruleEInt ) )
                    // InternalJRules.g:1015:6: (lv_maxInterface_8_0= ruleEInt )
                    {
                    // InternalJRules.g:1015:6: (lv_maxInterface_8_0= ruleEInt )
                    // InternalJRules.g:1016:7: lv_maxInterface_8_0= ruleEInt
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEIntParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FOLLOW_21);
                    lv_maxInterface_8_0=ruleEInt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalJRules.g:1033:5: (otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==17) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalJRules.g:1034:6: otherlv_9= 'and' otherlv_10= 'min=' ( (lv_minInterface_11_0= ruleEInt ) )
                            {
                            otherlv_9=(Token)match(input,17,FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_9, grammarAccess.getImplementsAccess().getAndKeyword_2_1_2_0());
                              					
                            }
                            otherlv_10=(Token)match(input,24,FOLLOW_20); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(otherlv_10, grammarAccess.getImplementsAccess().getMinKeyword_2_1_2_1());
                              					
                            }
                            // InternalJRules.g:1042:6: ( (lv_minInterface_11_0= ruleEInt ) )
                            // InternalJRules.g:1043:7: (lv_minInterface_11_0= ruleEInt )
                            {
                            // InternalJRules.g:1043:7: (lv_minInterface_11_0= ruleEInt )
                            // InternalJRules.g:1044:8: lv_minInterface_11_0= ruleEInt
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getImplementsAccess().getMinInterfaceEIntParserRuleCall_2_1_2_2_0());
                              							
                            }
                            pushFollow(FOLLOW_23);
                            lv_minInterface_11_0=ruleEInt();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getImplementsAccess().getInterfacesKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleIsExtended"
    // InternalJRules.g:1072:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRules.g:1072:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRules.g:1073:2: iv_ruleIsExtended= ruleIsExtended EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIsExtendedRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIsExtended=ruleIsExtended();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIsExtended; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1079:1: ruleIsExtended returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'extended' ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1085:2: ( ( () otherlv_1= 'is' otherlv_2= 'extended' ) )
            // InternalJRules.g:1086:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            {
            // InternalJRules.g:1086:2: ( () otherlv_1= 'is' otherlv_2= 'extended' )
            // InternalJRules.g:1087:3: () otherlv_1= 'is' otherlv_2= 'extended'
            {
            // InternalJRules.g:1087:3: ()
            // InternalJRules.g:1088:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getIsExtendedAccess().getIsExtendedAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getIsExtendedAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getIsExtendedAccess().getExtendedKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleIsExtended"


    // $ANTLR start "entryRuleParameter"
    // InternalJRules.g:1106:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalJRules.g:1106:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalJRules.g:1107:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1113:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) ;
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
            // InternalJRules.g:1119:2: ( (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? ) )
            // InternalJRules.g:1120:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            {
            // InternalJRules.g:1120:2: (otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )? )
            // InternalJRules.g:1121:3: otherlv_0= 'numParameters=' ( (lv_numParam_1_0= ruleEInt ) ) (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getNumParametersKeyword_0());
              		
            }
            // InternalJRules.g:1125:3: ( (lv_numParam_1_0= ruleEInt ) )
            // InternalJRules.g:1126:4: (lv_numParam_1_0= ruleEInt )
            {
            // InternalJRules.g:1126:4: (lv_numParam_1_0= ruleEInt )
            // InternalJRules.g:1127:5: lv_numParam_1_0= ruleEInt
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParameterAccess().getNumParamEIntParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_numParam_1_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:1144:3: (otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==29) ) {
                    alt18=1;
                }
            }
            switch (alt18) {
                case 1 :
                    // InternalJRules.g:1145:4: otherlv_2= 'and' otherlv_3= 'types=' otherlv_4= '[' ( (lv_typesParam_5_0= ruleEString ) ) (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )* otherlv_8= ']'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getAndKeyword_2_0());
                      			
                    }
                    otherlv_3=(Token)match(input,29,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getTypesKeyword_2_1());
                      			
                    }
                    otherlv_4=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getLeftSquareBracketKeyword_2_2());
                      			
                    }
                    // InternalJRules.g:1157:4: ( (lv_typesParam_5_0= ruleEString ) )
                    // InternalJRules.g:1158:5: (lv_typesParam_5_0= ruleEString )
                    {
                    // InternalJRules.g:1158:5: (lv_typesParam_5_0= ruleEString )
                    // InternalJRules.g:1159:6: lv_typesParam_5_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_3_0());
                      					
                    }
                    pushFollow(FOLLOW_28);
                    lv_typesParam_5_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalJRules.g:1176:4: (otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==31) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalJRules.g:1177:5: otherlv_6= ',' ( (lv_typesParam_7_0= ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_6, grammarAccess.getParameterAccess().getCommaKeyword_2_4_0());
                    	      				
                    	    }
                    	    // InternalJRules.g:1181:5: ( (lv_typesParam_7_0= ruleEString ) )
                    	    // InternalJRules.g:1182:6: (lv_typesParam_7_0= ruleEString )
                    	    {
                    	    // InternalJRules.g:1182:6: (lv_typesParam_7_0= ruleEString )
                    	    // InternalJRules.g:1183:7: lv_typesParam_7_0= ruleEString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterAccess().getTypesParamEStringParserRuleCall_2_4_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_28);
                    	    lv_typesParam_7_0=ruleEString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getParameterAccess().getRightSquareBracketKeyword_2_5());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleConstructor"
    // InternalJRules.g:1210:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRules.g:1210:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRules.g:1211:2: iv_ruleConstructor= ruleConstructor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstructor=ruleConstructor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructor; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1217:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1223:2: ( ( () otherlv_1= 'is' otherlv_2= 'constructor' ) )
            // InternalJRules.g:1224:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            {
            // InternalJRules.g:1224:2: ( () otherlv_1= 'is' otherlv_2= 'constructor' )
            // InternalJRules.g:1225:3: () otherlv_1= 'is' otherlv_2= 'constructor'
            {
            // InternalJRules.g:1225:3: ()
            // InternalJRules.g:1226:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getConstructorAccess().getConstructorAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getConstructorAccess().getConstructorKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleConstructor"


    // $ANTLR start "entryRuleReturn"
    // InternalJRules.g:1244:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRules.g:1244:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRules.g:1245:2: iv_ruleReturn= ruleReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleReturn=ruleReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1251:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_returnType_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1257:2: ( (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) ) )
            // InternalJRules.g:1258:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            {
            // InternalJRules.g:1258:2: (otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) ) )
            // InternalJRules.g:1259:3: otherlv_0= 'return' otherlv_1= 'type=' ( (lv_returnType_2_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getTypeKeyword_1());
              		
            }
            // InternalJRules.g:1267:3: ( (lv_returnType_2_0= ruleEString ) )
            // InternalJRules.g:1268:4: (lv_returnType_2_0= ruleEString )
            {
            // InternalJRules.g:1268:4: (lv_returnType_2_0= ruleEString )
            // InternalJRules.g:1269:5: lv_returnType_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getReturnAccess().getReturnTypeEStringParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_returnType_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleAttributeType"
    // InternalJRules.g:1290:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRules.g:1290:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRules.g:1291:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1297:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1303:2: ( (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRules.g:1304:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRules.g:1304:2: (otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRules.g:1305:3: otherlv_0= 'type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getTypeKeyword_0());
              		
            }
            // InternalJRules.g:1309:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRules.g:1310:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRules.g:1310:4: (lv_Type_1_0= ruleEString )
            // InternalJRules.g:1311:5: lv_Type_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeTypeAccess().getTypeEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_Type_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleInitialize"
    // InternalJRules.g:1332:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRules.g:1332:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRules.g:1333:2: iv_ruleInitialize= ruleInitialize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInitializeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInitialize=ruleInitialize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInitialize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1339:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is' otherlv_2= 'initialize' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalJRules.g:1345:2: ( ( () otherlv_1= 'is' otherlv_2= 'initialize' ) )
            // InternalJRules.g:1346:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            {
            // InternalJRules.g:1346:2: ( () otherlv_1= 'is' otherlv_2= 'initialize' )
            // InternalJRules.g:1347:3: () otherlv_1= 'is' otherlv_2= 'initialize'
            {
            // InternalJRules.g:1347:3: ()
            // InternalJRules.g:1348:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getInitializeAccess().getInitializeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getInitializeAccess().getInitializeKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleInitialize"


    // $ANTLR start "entryRuleEmpty"
    // InternalJRules.g:1366:1: entryRuleEmpty returns [EObject current=null] : iv_ruleEmpty= ruleEmpty EOF ;
    public final EObject entryRuleEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmpty = null;


        try {
            // InternalJRules.g:1366:46: (iv_ruleEmpty= ruleEmpty EOF )
            // InternalJRules.g:1367:2: iv_ruleEmpty= ruleEmpty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmpty=ruleEmpty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmpty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1373:1: ruleEmpty returns [EObject current=null] : ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) ;
    public final EObject ruleEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_no_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalJRules.g:1379:2: ( ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' ) )
            // InternalJRules.g:1380:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            {
            // InternalJRules.g:1380:2: ( () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty' )
            // InternalJRules.g:1381:3: () otherlv_1= 'is' ( (lv_no_2_0= 'not' ) )? otherlv_3= 'empty'
            {
            // InternalJRules.g:1381:3: ()
            // InternalJRules.g:1382:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEmptyAccess().getEmptyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEmptyAccess().getIsKeyword_1());
              		
            }
            // InternalJRules.g:1392:3: ( (lv_no_2_0= 'not' ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==37) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalJRules.g:1393:4: (lv_no_2_0= 'not' )
                    {
                    // InternalJRules.g:1393:4: (lv_no_2_0= 'not' )
                    // InternalJRules.g:1394:5: lv_no_2_0= 'not'
                    {
                    lv_no_2_0=(Token)match(input,37,FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_no_2_0, grammarAccess.getEmptyAccess().getNoNotKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEmptyRule());
                      					}
                      					setWithLastConsumed(current, "no", true, "not");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEmptyAccess().getEmptyKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEmpty"


    // $ANTLR start "entryRuleNameOperation"
    // InternalJRules.g:1414:1: entryRuleNameOperation returns [EObject current=null] : iv_ruleNameOperation= ruleNameOperation EOF ;
    public final EObject entryRuleNameOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameOperation = null;


        try {
            // InternalJRules.g:1414:54: (iv_ruleNameOperation= ruleNameOperation EOF )
            // InternalJRules.g:1415:2: iv_ruleNameOperation= ruleNameOperation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameOperationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameOperation=ruleNameOperation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameOperation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1421:1: ruleNameOperation returns [EObject current=null] : ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) ;
    public final EObject ruleNameOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Enumerator lv_operator_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_Language_5_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1427:2: ( ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? ) )
            // InternalJRules.g:1428:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            {
            // InternalJRules.g:1428:2: ( () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )? )
            // InternalJRules.g:1429:3: () otherlv_1= 'name' ( (lv_operator_2_0= ruleNameOperator ) ) ( (lv_name_3_0= ruleEString ) ) (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            {
            // InternalJRules.g:1429:3: ()
            // InternalJRules.g:1430:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getNameOperationAccess().getNameOperationAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNameOperationAccess().getNameKeyword_1());
              		
            }
            // InternalJRules.g:1440:3: ( (lv_operator_2_0= ruleNameOperator ) )
            // InternalJRules.g:1441:4: (lv_operator_2_0= ruleNameOperator )
            {
            // InternalJRules.g:1441:4: (lv_operator_2_0= ruleNameOperator )
            // InternalJRules.g:1442:5: lv_operator_2_0= ruleNameOperator
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameOperationAccess().getOperatorNameOperatorEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_3);
            lv_operator_2_0=ruleNameOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:1459:3: ( (lv_name_3_0= ruleEString ) )
            // InternalJRules.g:1460:4: (lv_name_3_0= ruleEString )
            {
            // InternalJRules.g:1460:4: (lv_name_3_0= ruleEString )
            // InternalJRules.g:1461:5: lv_name_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameOperationAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalJRules.g:1478:3: (otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRules.g:1479:4: otherlv_4= ',' ( (lv_Language_5_0= ruleLanguage ) )
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getNameOperationAccess().getCommaKeyword_4_0());
                      			
                    }
                    // InternalJRules.g:1483:4: ( (lv_Language_5_0= ruleLanguage ) )
                    // InternalJRules.g:1484:5: (lv_Language_5_0= ruleLanguage )
                    {
                    // InternalJRules.g:1484:5: (lv_Language_5_0= ruleLanguage )
                    // InternalJRules.g:1485:6: lv_Language_5_0= ruleLanguage
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getNameOperationAccess().getLanguageLanguageEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_Language_5_0=ruleLanguage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameOperation"


    // $ANTLR start "entryRuleNameType"
    // InternalJRules.g:1507:1: entryRuleNameType returns [EObject current=null] : iv_ruleNameType= ruleNameType EOF ;
    public final EObject entryRuleNameType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNameType = null;


        try {
            // InternalJRules.g:1507:49: (iv_ruleNameType= ruleNameType EOF )
            // InternalJRules.g:1508:2: iv_ruleNameType= ruleNameType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNameTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNameType=ruleNameType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNameType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1514:1: ruleNameType returns [EObject current=null] : (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) ) ;
    public final EObject ruleNameType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Enumerator lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1520:2: ( (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) ) )
            // InternalJRules.g:1521:2: (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) )
            {
            // InternalJRules.g:1521:2: (otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) ) )
            // InternalJRules.g:1522:3: otherlv_0= 'name' otherlv_1= 'type=' ( (lv_type_2_0= ruleNameCheck ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getNameTypeAccess().getNameKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,35,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getNameTypeAccess().getTypeKeyword_1());
              		
            }
            // InternalJRules.g:1530:3: ( (lv_type_2_0= ruleNameCheck ) )
            // InternalJRules.g:1531:4: (lv_type_2_0= ruleNameCheck )
            {
            // InternalJRules.g:1531:4: (lv_type_2_0= ruleNameCheck )
            // InternalJRules.g:1532:5: lv_type_2_0= ruleNameCheck
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNameTypeAccess().getTypeNameCheckEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleNameCheck();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameType"


    // $ANTLR start "entryRuleJavaDoc"
    // InternalJRules.g:1553:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRules.g:1553:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRules.g:1554:2: iv_ruleJavaDoc= ruleJavaDoc EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJavaDocRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJavaDoc=ruleJavaDoc();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJavaDoc; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1560:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
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
            // InternalJRules.g:1566:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRules.g:1567:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRules.g:1567:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRules.g:1568:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parameter_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRules.g:1568:3: ()
            // InternalJRules.g:1569:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,40,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
              		
            }
            // InternalJRules.g:1579:3: ( (lv_author_2_0= '@author' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRules.g:1580:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRules.g:1580:4: (lv_author_2_0= '@author' )
                    // InternalJRules.g:1581:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,41,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "author", true, "@author");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:1593:3: ( (lv_parameter_3_0= '@parameter' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRules.g:1594:4: (lv_parameter_3_0= '@parameter' )
                    {
                    // InternalJRules.g:1594:4: (lv_parameter_3_0= '@parameter' )
                    // InternalJRules.g:1595:5: lv_parameter_3_0= '@parameter'
                    {
                    lv_parameter_3_0=(Token)match(input,42,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_parameter_3_0, grammarAccess.getJavaDocAccess().getParameterParameterKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "parameter", true, "@parameter");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:1607:3: ( (lv_return_4_0= '@return' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRules.g:1608:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRules.g:1608:4: (lv_return_4_0= '@return' )
                    // InternalJRules.g:1609:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,43,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "return", true, "@return");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:1621:3: ( (lv_version_5_0= '@version' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==44) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRules.g:1622:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRules.g:1622:4: (lv_version_5_0= '@version' )
                    // InternalJRules.g:1623:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,44,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "version", true, "@version");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:1635:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRules.g:1636:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRules.g:1636:4: (lv_throws_6_0= '@throws' )
                    // InternalJRules.g:1637:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,45,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "throws", true, "@throws");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalJRules.g:1649:3: ( (lv_see_7_0= '@see' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRules.g:1650:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRules.g:1650:4: (lv_see_7_0= '@see' )
                    // InternalJRules.g:1651:5: lv_see_7_0= '@see'
                    {
                    lv_see_7_0=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_see_7_0, grammarAccess.getJavaDocAccess().getSeeSeeKeyword_7_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getJavaDocRule());
                      					}
                      					setWithLastConsumed(current, "see", true, "@see");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleJavaDoc"


    // $ANTLR start "entryRuleContains"
    // InternalJRules.g:1667:1: entryRuleContains returns [EObject current=null] : iv_ruleContains= ruleContains EOF ;
    public final EObject entryRuleContains() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContains = null;


        try {
            // InternalJRules.g:1667:49: (iv_ruleContains= ruleContains EOF )
            // InternalJRules.g:1668:2: iv_ruleContains= ruleContains EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContains=ruleContains();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContains; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1674:1: ruleContains returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) ;
    public final EObject ruleContains() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRules.g:1680:2: ( (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' ) )
            // InternalJRules.g:1681:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            {
            // InternalJRules.g:1681:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}' )
            // InternalJRules.g:1682:3: otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleRule ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getContainsAccess().getHaveKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,48,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getContainsAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalJRules.g:1690:3: ( (lv_which_2_0= ruleRule ) )
            // InternalJRules.g:1691:4: (lv_which_2_0= ruleRule )
            {
            // InternalJRules.g:1691:4: (lv_which_2_0= ruleRule )
            // InternalJRules.g:1692:5: lv_which_2_0= ruleRule
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getContainsAccess().getWhichRuleParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_which_2_0=ruleRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getContainsAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContains"


    // $ANTLR start "entryRuleModifiers"
    // InternalJRules.g:1717:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRules.g:1717:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRules.g:1718:2: iv_ruleModifiers= ruleModifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModifiersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModifiers=ruleModifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModifiers; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1724:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) ;
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
            // InternalJRules.g:1730:2: ( (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' ) )
            // InternalJRules.g:1731:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            {
            // InternalJRules.g:1731:2: (otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']' )
            // InternalJRules.g:1732:3: otherlv_0= 'modifiers:' otherlv_1= '[' otherlv_2= '(' ( (lv_blend_3_0= ruleBlendModifiers ) ) otherlv_4= ')' (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )* otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,30,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftSquareBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalJRules.g:1744:3: ( (lv_blend_3_0= ruleBlendModifiers ) )
            // InternalJRules.g:1745:4: (lv_blend_3_0= ruleBlendModifiers )
            {
            // InternalJRules.g:1745:4: (lv_blend_3_0= ruleBlendModifiers )
            // InternalJRules.g:1746:5: lv_blend_3_0= ruleBlendModifiers
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_blend_3_0=ruleBlendModifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,19,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalJRules.g:1767:3: (otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==16) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJRules.g:1768:4: otherlv_5= 'or' otherlv_6= '(' ( (lv_blend_7_0= ruleBlendModifiers ) ) otherlv_8= ')'
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getOrKeyword_5_0());
            	      			
            	    }
            	    otherlv_6=(Token)match(input,18,FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_5_1());
            	      			
            	    }
            	    // InternalJRules.g:1776:4: ( (lv_blend_7_0= ruleBlendModifiers ) )
            	    // InternalJRules.g:1777:5: (lv_blend_7_0= ruleBlendModifiers )
            	    {
            	    // InternalJRules.g:1777:5: (lv_blend_7_0= ruleBlendModifiers )
            	    // InternalJRules.g:1778:6: lv_blend_7_0= ruleBlendModifiers
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_5_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_blend_7_0=ruleBlendModifiers();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_49); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_5_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_9=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getModifiersAccess().getRightSquareBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModifiers"


    // $ANTLR start "entryRuleEInt"
    // InternalJRules.g:1808:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalJRules.g:1808:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalJRules.g:1809:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1815:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRules.g:1821:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRules.g:1822:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRules.g:1822:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRules.g:1823:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRules.g:1823:3: (kw= '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==51) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalJRules.g:1824:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_50); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                      			
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleBlendModifiers"
    // InternalJRules.g:1841:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRules.g:1841:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRules.g:1842:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBlendModifiersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBlendModifiers=ruleBlendModifiers();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBlendModifiers; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalJRules.g:1848:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) ;
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
            // InternalJRules.g:1854:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) ) )
            // InternalJRules.g:1855:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            {
            // InternalJRules.g:1855:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? ) | ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? ) | ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? ) | ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? ) | ( (lv_synchronized_24_0= 'synchronized' ) ) )
            int alt39=5;
            switch ( input.LA(1) ) {
            case 77:
            case 78:
            case 79:
            case 80:
                {
                alt39=1;
                }
                break;
            case 52:
                {
                alt39=2;
                }
                break;
            case 53:
                {
                alt39=3;
                }
                break;
            case 54:
                {
                alt39=4;
                }
                break;
            case 55:
                {
                alt39=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalJRules.g:1856:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1856:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1857:4: ( (lv_access_0_0= ruleAccessModifier ) ) (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )? (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )? (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )? (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1857:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRules.g:1858:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRules.g:1858:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRules.g:1859:6: lv_access_0_0= ruleAccessModifier
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_access_0_0=ruleAccessModifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalJRules.g:1876:4: (otherlv_1= 'and' ( (lv_static_2_0= 'static' ) ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==17) ) {
                        int LA29_1 = input.LA(2);

                        if ( (LA29_1==52) ) {
                            alt29=1;
                        }
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRules.g:1877:5: otherlv_1= 'and' ( (lv_static_2_0= 'static' ) )
                            {
                            otherlv_1=(Token)match(input,17,FOLLOW_51); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_1_0());
                              				
                            }
                            // InternalJRules.g:1881:5: ( (lv_static_2_0= 'static' ) )
                            // InternalJRules.g:1882:6: (lv_static_2_0= 'static' )
                            {
                            // InternalJRules.g:1882:6: (lv_static_2_0= 'static' )
                            // InternalJRules.g:1883:7: lv_static_2_0= 'static'
                            {
                            lv_static_2_0=(Token)match(input,52,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_static_2_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_0_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "static", true, "static");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1896:4: (otherlv_3= 'and' ( (lv_final_4_0= 'final' ) ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==17) ) {
                        int LA30_1 = input.LA(2);

                        if ( (LA30_1==53) ) {
                            alt30=1;
                        }
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRules.g:1897:5: otherlv_3= 'and' ( (lv_final_4_0= 'final' ) )
                            {
                            otherlv_3=(Token)match(input,17,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_2_0());
                              				
                            }
                            // InternalJRules.g:1901:5: ( (lv_final_4_0= 'final' ) )
                            // InternalJRules.g:1902:6: (lv_final_4_0= 'final' )
                            {
                            // InternalJRules.g:1902:6: (lv_final_4_0= 'final' )
                            // InternalJRules.g:1903:7: lv_final_4_0= 'final'
                            {
                            lv_final_4_0=(Token)match(input,53,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_final_4_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_0_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "final", true, "final");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1916:4: (otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==17) ) {
                        int LA31_1 = input.LA(2);

                        if ( (LA31_1==54) ) {
                            alt31=1;
                        }
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRules.g:1917:5: otherlv_5= 'and' ( (lv_abstract_6_0= 'abstract' ) )
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_3_0());
                              				
                            }
                            // InternalJRules.g:1921:5: ( (lv_abstract_6_0= 'abstract' ) )
                            // InternalJRules.g:1922:6: (lv_abstract_6_0= 'abstract' )
                            {
                            // InternalJRules.g:1922:6: (lv_abstract_6_0= 'abstract' )
                            // InternalJRules.g:1923:7: lv_abstract_6_0= 'abstract'
                            {
                            lv_abstract_6_0=(Token)match(input,54,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_abstract_6_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_0_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "abstract", true, "abstract");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1936:4: (otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==17) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRules.g:1937:5: otherlv_7= 'and' ( (lv_synchronized_8_0= 'synchronized' ) )
                            {
                            otherlv_7=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_7, grammarAccess.getBlendModifiersAccess().getAndKeyword_0_4_0());
                              				
                            }
                            // InternalJRules.g:1941:5: ( (lv_synchronized_8_0= 'synchronized' ) )
                            // InternalJRules.g:1942:6: (lv_synchronized_8_0= 'synchronized' )
                            {
                            // InternalJRules.g:1942:6: (lv_synchronized_8_0= 'synchronized' )
                            // InternalJRules.g:1943:7: lv_synchronized_8_0= 'synchronized'
                            {
                            lv_synchronized_8_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_synchronized_8_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_0_4_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "synchronized", true, "synchronized");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:1958:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:1958:3: ( ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:1959:4: ( (lv_static_9_0= 'static' ) ) (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )? (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )? (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:1959:4: ( (lv_static_9_0= 'static' ) )
                    // InternalJRules.g:1960:5: (lv_static_9_0= 'static' )
                    {
                    // InternalJRules.g:1960:5: (lv_static_9_0= 'static' )
                    // InternalJRules.g:1961:6: lv_static_9_0= 'static'
                    {
                    lv_static_9_0=(Token)match(input,52,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_static_9_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBlendModifiersRule());
                      						}
                      						setWithLastConsumed(current, "static", true, "static");
                      					
                    }

                    }


                    }

                    // InternalJRules.g:1973:4: (otherlv_10= 'and' ( (lv_final_11_0= 'final' ) ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==17) ) {
                        int LA33_1 = input.LA(2);

                        if ( (LA33_1==53) ) {
                            alt33=1;
                        }
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRules.g:1974:5: otherlv_10= 'and' ( (lv_final_11_0= 'final' ) )
                            {
                            otherlv_10=(Token)match(input,17,FOLLOW_52); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_10, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_1_0());
                              				
                            }
                            // InternalJRules.g:1978:5: ( (lv_final_11_0= 'final' ) )
                            // InternalJRules.g:1979:6: (lv_final_11_0= 'final' )
                            {
                            // InternalJRules.g:1979:6: (lv_final_11_0= 'final' )
                            // InternalJRules.g:1980:7: lv_final_11_0= 'final'
                            {
                            lv_final_11_0=(Token)match(input,53,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_final_11_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_1_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "final", true, "final");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:1993:4: (otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==17) ) {
                        int LA34_1 = input.LA(2);

                        if ( (LA34_1==54) ) {
                            alt34=1;
                        }
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRules.g:1994:5: otherlv_12= 'and' ( (lv_abstract_13_0= 'abstract' ) )
                            {
                            otherlv_12=(Token)match(input,17,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_12, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_2_0());
                              				
                            }
                            // InternalJRules.g:1998:5: ( (lv_abstract_13_0= 'abstract' ) )
                            // InternalJRules.g:1999:6: (lv_abstract_13_0= 'abstract' )
                            {
                            // InternalJRules.g:1999:6: (lv_abstract_13_0= 'abstract' )
                            // InternalJRules.g:2000:7: lv_abstract_13_0= 'abstract'
                            {
                            lv_abstract_13_0=(Token)match(input,54,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_abstract_13_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_1_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "abstract", true, "abstract");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:2013:4: (otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==17) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRules.g:2014:5: otherlv_14= 'and' ( (lv_synchronized_15_0= 'synchronized' ) )
                            {
                            otherlv_14=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_14, grammarAccess.getBlendModifiersAccess().getAndKeyword_1_3_0());
                              				
                            }
                            // InternalJRules.g:2018:5: ( (lv_synchronized_15_0= 'synchronized' ) )
                            // InternalJRules.g:2019:6: (lv_synchronized_15_0= 'synchronized' )
                            {
                            // InternalJRules.g:2019:6: (lv_synchronized_15_0= 'synchronized' )
                            // InternalJRules.g:2020:7: lv_synchronized_15_0= 'synchronized'
                            {
                            lv_synchronized_15_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_synchronized_15_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_1_3_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "synchronized", true, "synchronized");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2035:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2035:3: ( ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2036:4: ( (lv_final_16_0= 'final' ) ) (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )? (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2036:4: ( (lv_final_16_0= 'final' ) )
                    // InternalJRules.g:2037:5: (lv_final_16_0= 'final' )
                    {
                    // InternalJRules.g:2037:5: (lv_final_16_0= 'final' )
                    // InternalJRules.g:2038:6: lv_final_16_0= 'final'
                    {
                    lv_final_16_0=(Token)match(input,53,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_final_16_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBlendModifiersRule());
                      						}
                      						setWithLastConsumed(current, "final", true, "final");
                      					
                    }

                    }


                    }

                    // InternalJRules.g:2050:4: (otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==17) ) {
                        int LA36_1 = input.LA(2);

                        if ( (LA36_1==54) ) {
                            alt36=1;
                        }
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRules.g:2051:5: otherlv_17= 'and' ( (lv_abstract_18_0= 'abstract' ) )
                            {
                            otherlv_17=(Token)match(input,17,FOLLOW_53); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_1_0());
                              				
                            }
                            // InternalJRules.g:2055:5: ( (lv_abstract_18_0= 'abstract' ) )
                            // InternalJRules.g:2056:6: (lv_abstract_18_0= 'abstract' )
                            {
                            // InternalJRules.g:2056:6: (lv_abstract_18_0= 'abstract' )
                            // InternalJRules.g:2057:7: lv_abstract_18_0= 'abstract'
                            {
                            lv_abstract_18_0=(Token)match(input,54,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_abstract_18_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_2_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "abstract", true, "abstract");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRules.g:2070:4: (otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==17) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRules.g:2071:5: otherlv_19= 'and' ( (lv_synchronized_20_0= 'synchronized' ) )
                            {
                            otherlv_19=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_19, grammarAccess.getBlendModifiersAccess().getAndKeyword_2_2_0());
                              				
                            }
                            // InternalJRules.g:2075:5: ( (lv_synchronized_20_0= 'synchronized' ) )
                            // InternalJRules.g:2076:6: (lv_synchronized_20_0= 'synchronized' )
                            {
                            // InternalJRules.g:2076:6: (lv_synchronized_20_0= 'synchronized' )
                            // InternalJRules.g:2077:7: lv_synchronized_20_0= 'synchronized'
                            {
                            lv_synchronized_20_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_synchronized_20_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_2_2_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "synchronized", true, "synchronized");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2092:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    {
                    // InternalJRules.g:2092:3: ( ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )? )
                    // InternalJRules.g:2093:4: ( (lv_abstract_21_0= 'abstract' ) ) (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    {
                    // InternalJRules.g:2093:4: ( (lv_abstract_21_0= 'abstract' ) )
                    // InternalJRules.g:2094:5: (lv_abstract_21_0= 'abstract' )
                    {
                    // InternalJRules.g:2094:5: (lv_abstract_21_0= 'abstract' )
                    // InternalJRules.g:2095:6: lv_abstract_21_0= 'abstract'
                    {
                    lv_abstract_21_0=(Token)match(input,54,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_abstract_21_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getBlendModifiersRule());
                      						}
                      						setWithLastConsumed(current, "abstract", true, "abstract");
                      					
                    }

                    }


                    }

                    // InternalJRules.g:2107:4: (otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==17) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // InternalJRules.g:2108:5: otherlv_22= 'and' ( (lv_synchronized_23_0= 'synchronized' ) )
                            {
                            otherlv_22=(Token)match(input,17,FOLLOW_54); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_22, grammarAccess.getBlendModifiersAccess().getAndKeyword_3_1_0());
                              				
                            }
                            // InternalJRules.g:2112:5: ( (lv_synchronized_23_0= 'synchronized' ) )
                            // InternalJRules.g:2113:6: (lv_synchronized_23_0= 'synchronized' )
                            {
                            // InternalJRules.g:2113:6: (lv_synchronized_23_0= 'synchronized' )
                            // InternalJRules.g:2114:7: lv_synchronized_23_0= 'synchronized'
                            {
                            lv_synchronized_23_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_synchronized_23_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getBlendModifiersRule());
                              							}
                              							setWithLastConsumed(current, "synchronized", true, "synchronized");
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2129:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    {
                    // InternalJRules.g:2129:3: ( (lv_synchronized_24_0= 'synchronized' ) )
                    // InternalJRules.g:2130:4: (lv_synchronized_24_0= 'synchronized' )
                    {
                    // InternalJRules.g:2130:4: (lv_synchronized_24_0= 'synchronized' )
                    // InternalJRules.g:2131:5: lv_synchronized_24_0= 'synchronized'
                    {
                    lv_synchronized_24_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_synchronized_24_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getBlendModifiersRule());
                      					}
                      					setWithLastConsumed(current, "synchronized", true, "synchronized");
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBlendModifiers"


    // $ANTLR start "ruleQuantifier"
    // InternalJRules.g:2147:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRules.g:2153:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRules.g:2154:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRules.g:2154:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt40=1;
                }
                break;
            case 57:
                {
                alt40=2;
                }
                break;
            case 58:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalJRules.g:2155:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRules.g:2155:3: (enumLiteral_0= 'one' )
                    // InternalJRules.g:2156:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2163:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRules.g:2163:3: (enumLiteral_1= 'exists' )
                    // InternalJRules.g:2164:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2171:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRules.g:2171:3: (enumLiteral_2= 'all' )
                    // InternalJRules.g:2172:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getQuantifierAccess().getAllEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQuantifier"


    // $ANTLR start "ruleElementJava"
    // InternalJRules.g:2182:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) ;
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
            // InternalJRules.g:2188:2: ( ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) ) )
            // InternalJRules.g:2189:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            {
            // InternalJRules.g:2189:2: ( (enumLiteral_0= 'Package' ) | (enumLiteral_1= 'Class' ) | (enumLiteral_2= 'Interface' ) | (enumLiteral_3= 'Enum' ) | (enumLiteral_4= 'Method' ) | (enumLiteral_5= 'Attribute' ) )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt41=1;
                }
                break;
            case 60:
                {
                alt41=2;
                }
                break;
            case 61:
                {
                alt41=3;
                }
                break;
            case 62:
                {
                alt41=4;
                }
                break;
            case 63:
                {
                alt41=5;
                }
                break;
            case 64:
                {
                alt41=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalJRules.g:2190:3: (enumLiteral_0= 'Package' )
                    {
                    // InternalJRules.g:2190:3: (enumLiteral_0= 'Package' )
                    // InternalJRules.g:2191:4: enumLiteral_0= 'Package'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2198:3: (enumLiteral_1= 'Class' )
                    {
                    // InternalJRules.g:2198:3: (enumLiteral_1= 'Class' )
                    // InternalJRules.g:2199:4: enumLiteral_1= 'Class'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2206:3: (enumLiteral_2= 'Interface' )
                    {
                    // InternalJRules.g:2206:3: (enumLiteral_2= 'Interface' )
                    // InternalJRules.g:2207:4: enumLiteral_2= 'Interface'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2214:3: (enumLiteral_3= 'Enum' )
                    {
                    // InternalJRules.g:2214:3: (enumLiteral_3= 'Enum' )
                    // InternalJRules.g:2215:4: enumLiteral_3= 'Enum'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2222:3: (enumLiteral_4= 'Method' )
                    {
                    // InternalJRules.g:2222:3: (enumLiteral_4= 'Method' )
                    // InternalJRules.g:2223:4: enumLiteral_4= 'Method'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalJRules.g:2230:3: (enumLiteral_5= 'Attribute' )
                    {
                    // InternalJRules.g:2230:3: (enumLiteral_5= 'Attribute' )
                    // InternalJRules.g:2231:4: enumLiteral_5= 'Attribute'
                    {
                    enumLiteral_5=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getElementJavaAccess().getAttributeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getElementJavaAccess().getAttributeEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleElementJava"


    // $ANTLR start "ruleNameCheck"
    // InternalJRules.g:2241:1: ruleNameCheck returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameCheck() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2247:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRules.g:2248:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRules.g:2248:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt42=5;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt42=1;
                }
                break;
            case 66:
                {
                alt42=2;
                }
                break;
            case 67:
                {
                alt42=3;
                }
                break;
            case 68:
                {
                alt42=4;
                }
                break;
            case 69:
                {
                alt42=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalJRules.g:2249:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRules.g:2249:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRules.g:2250:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getNameCheckAccess().getUPPER_CASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2257:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRules.g:2257:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRules.g:2258:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getNameCheckAccess().getLOWER_CASEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2265:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRules.g:2265:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRules.g:2266:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getNameCheckAccess().getUPPER_CAMEL_CASEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2273:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRules.g:2273:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRules.g:2274:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getNameCheckAccess().getLOWER_CAMEL_CASEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2281:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRules.g:2281:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRules.g:2282:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameCheckAccess().getSTART_UPPER_CASEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getNameCheckAccess().getSTART_UPPER_CASEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameCheck"


    // $ANTLR start "ruleNameOperator"
    // InternalJRules.g:2292:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRules.g:2298:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) ) )
            // InternalJRules.g:2299:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            {
            // InternalJRules.g:2299:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) | (enumLiteral_2= 'end' ) | (enumLiteral_3= 'start' ) | (enumLiteral_4= 'contain' ) )
            int alt43=5;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt43=1;
                }
                break;
            case 71:
                {
                alt43=2;
                }
                break;
            case 72:
                {
                alt43=3;
                }
                break;
            case 73:
                {
                alt43=4;
                }
                break;
            case 74:
                {
                alt43=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // InternalJRules.g:2300:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRules.g:2300:3: (enumLiteral_0= 'like' )
                    // InternalJRules.g:2301:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLIKEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2308:3: (enumLiteral_1= 'equal' )
                    {
                    // InternalJRules.g:2308:3: (enumLiteral_1= 'equal' )
                    // InternalJRules.g:2309:4: enumLiteral_1= 'equal'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getNameOperatorAccess().getEQUALEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2316:3: (enumLiteral_2= 'end' )
                    {
                    // InternalJRules.g:2316:3: (enumLiteral_2= 'end' )
                    // InternalJRules.g:2317:4: enumLiteral_2= 'end'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getNameOperatorAccess().getENDEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2324:3: (enumLiteral_3= 'start' )
                    {
                    // InternalJRules.g:2324:3: (enumLiteral_3= 'start' )
                    // InternalJRules.g:2325:4: enumLiteral_3= 'start'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getNameOperatorAccess().getSTARTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalJRules.g:2332:3: (enumLiteral_4= 'contain' )
                    {
                    // InternalJRules.g:2332:3: (enumLiteral_4= 'contain' )
                    // InternalJRules.g:2333:4: enumLiteral_4= 'contain'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getNameOperatorAccess().getCONTAINEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNameOperator"


    // $ANTLR start "ruleLanguage"
    // InternalJRules.g:2343:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRules.g:2349:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRules.g:2350:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRules.g:2350:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==75) ) {
                alt44=1;
            }
            else if ( (LA44_0==76) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalJRules.g:2351:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRules.g:2351:3: (enumLiteral_0= 'English' )
                    // InternalJRules.g:2352:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2359:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRules.g:2359:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRules.g:2360:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLanguageAccess().getSPANISHEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguage"


    // $ANTLR start "ruleAccessModifier"
    // InternalJRules.g:2370:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalJRules.g:2376:2: ( ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) ) )
            // InternalJRules.g:2377:2: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            {
            // InternalJRules.g:2377:2: ( (enumLiteral_0= 'default' ) | (enumLiteral_1= 'public' ) | (enumLiteral_2= 'protected' ) | (enumLiteral_3= 'private' ) )
            int alt45=4;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt45=1;
                }
                break;
            case 78:
                {
                alt45=2;
                }
                break;
            case 79:
                {
                alt45=3;
                }
                break;
            case 80:
                {
                alt45=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalJRules.g:2378:3: (enumLiteral_0= 'default' )
                    {
                    // InternalJRules.g:2378:3: (enumLiteral_0= 'default' )
                    // InternalJRules.g:2379:4: enumLiteral_0= 'default'
                    {
                    enumLiteral_0=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getDefaultEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalJRules.g:2386:3: (enumLiteral_1= 'public' )
                    {
                    // InternalJRules.g:2386:3: (enumLiteral_1= 'public' )
                    // InternalJRules.g:2387:4: enumLiteral_1= 'public'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalJRules.g:2394:3: (enumLiteral_2= 'protected' )
                    {
                    // InternalJRules.g:2394:3: (enumLiteral_2= 'protected' )
                    // InternalJRules.g:2395:4: enumLiteral_2= 'protected'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalJRules.g:2402:3: (enumLiteral_3= 'private' )
                    {
                    // InternalJRules.g:2402:3: (enumLiteral_3= 'private' )
                    // InternalJRules.g:2403:4: enumLiteral_3= 'private'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAccessModifierAccess().getPrivateEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAccessModifier"

    // $ANTLR start synpred1_InternalJRules
    public final void synpred1_InternalJRules_fragment() throws RecognitionException {   
        // InternalJRules.g:531:4: ( ruleOrUnico )
        // InternalJRules.g:531:5: ruleOrUnico
        {
        pushFollow(FOLLOW_2);
        ruleOrUnico();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalJRules

    // Delegated rules

    public final boolean synpred1_InternalJRules() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalJRules_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA8 dfa8 = new DFA8(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\24\1\25\4\uffff\1\43\13\uffff";
    static final String dfa_3s = "\1\62\1\46\4\uffff\1\112\13\uffff";
    static final String dfa_4s = "\2\uffff\1\3\1\5\1\7\1\10\1\uffff\1\15\1\16\1\17\1\6\1\12\1\2\1\11\1\1\1\4\1\14\1\13";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\2\uffff\1\2\4\uffff\1\3\5\uffff\1\4\1\5\3\uffff\1\6\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\16\1\14\4\uffff\1\17\5\uffff\1\12\2\uffff\1\15\2\13",
            "",
            "",
            "",
            "",
            "\1\20\42\uffff\5\21",
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
            return "169:2: (this_isImplemented_0= ruleisImplemented | this_IsInheritor_1= ruleIsInheritor | this_Implements_2= ruleImplements | this_IsExtended_3= ruleIsExtended | this_Parameter_4= ruleParameter | this_Constructor_5= ruleConstructor | this_Return_6= ruleReturn | this_AttributeType_7= ruleAttributeType | this_Initialize_8= ruleInitialize | this_Empty_9= ruleEmpty | this_NameOperation_10= ruleNameOperation | this_NameType_11= ruleNameType | this_JavaDoc_12= ruleJavaDoc | this_Contains_13= ruleContains | this_Modifiers_14= ruleModifiers )";
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\22\11\0\2\uffff";
    static final String dfa_9s = "\1\62\11\0\2\uffff";
    static final String dfa_10s = "\12\uffff\1\2\1\1";
    static final String dfa_11s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\12\1\uffff\1\1\2\uffff\1\2\4\uffff\1\3\5\uffff\1\4\1\5\3\uffff\1\6\1\7\6\uffff\1\10\2\uffff\1\11",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "529:2: ( ( ( ruleOrUnico )=>this_OrUnico_0= ruleOrUnico ) | this_OrComplejo_1= ruleOrComplejo )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_1 = input.LA(1);

                         
                        int index8_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA8_2 = input.LA(1);

                         
                        int index8_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA8_3 = input.LA(1);

                         
                        int index8_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA8_4 = input.LA(1);

                         
                        int index8_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA8_5 = input.LA(1);

                         
                        int index8_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA8_6 = input.LA(1);

                         
                        int index8_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA8_7 = input.LA(1);

                         
                        int index8_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA8_8 = input.LA(1);

                         
                        int index8_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA8_9 = input.LA(1);

                         
                        int index8_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalJRules()) ) {s = 11;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index8_9);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0700000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0700000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0xF800000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0004818C10942000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0004818C10900000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007C0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000000L,0x000000000000003EL});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00007E0000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000780000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00F0000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000100010000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0080000000000000L});

}