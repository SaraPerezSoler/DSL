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
import es.uam.sara.tfg.dsl.services.JRuleGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalJRuleParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Project Name:'", "';'", "'no'", "'satisfy'", "'which'", "'('", "')'", "'or'", "'and'", "'is inheritor'", "'max level='", "'implements interface'", "'max interface='", "'is extends'", "'use constant'", "'variables'", "'right position'", "'and '", "'initialized'", "'number of parameters ='", "'and types='", "','", "'is constructor'", "'return type='", "'attribute type='", "'is initialized'", "'no empty'", "'type name ='", "'and name '", "'in'", "'name '", "'and type name ='", "'JavaDoc'", "'@author'", "'@parameter'", "'@return'", "'@version'", "'@throws'", "'@see'", "'have'", "'{'", "'}'", "'modifiers: '", "'and static'", "'and final'", "'and abstract'", "'and synchronized'", "'static'", "'final'", "'abstract'", "'synchronized'", "'-'", "'check'", "'correct'", "'one'", "'exists'", "'all'", "'package'", "'class'", "'interface'", "'enum'", "'method'", "'attribute'", "'upperCase'", "'lowerCase'", "'upperCamelCase'", "'lowerCamelCase'", "'startUpperCase'", "'like'", "'equal'", "'English'", "'Spanish'", "'Public'", "'Protected'", "'Private'"
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
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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
    public static final int RULE_STRING=5;
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
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalJRuleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalJRuleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalJRuleParser.tokenNames; }
    public String getGrammarFileName() { return "InternalJRule.g"; }



     	private JRuleGrammarAccess grammarAccess;

        public InternalJRuleParser(TokenStream input, JRuleGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RuleSet";
       	}

       	@Override
       	protected JRuleGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRuleSet"
    // InternalJRule.g:65:1: entryRuleRuleSet returns [EObject current=null] : iv_ruleRuleSet= ruleRuleSet EOF ;
    public final EObject entryRuleRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleSet = null;


        try {
            // InternalJRule.g:65:48: (iv_ruleRuleSet= ruleRuleSet EOF )
            // InternalJRule.g:66:2: iv_ruleRuleSet= ruleRuleSet EOF
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
    // InternalJRule.g:72:1: ruleRuleSet returns [EObject current=null] : ( (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )? ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* ) ;
    public final EObject ruleRuleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_ProjectName_1_0 = null;

        EObject lv_rules_2_0 = null;

        EObject lv_rules_3_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:78:2: ( ( (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )? ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* ) )
            // InternalJRule.g:79:2: ( (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )? ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* )
            {
            // InternalJRule.g:79:2: ( (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )? ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )* )
            // InternalJRule.g:80:3: (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )? ( (lv_rules_2_0= ruleRule ) ) ( (lv_rules_3_0= ruleRule ) )*
            {
            // InternalJRule.g:80:3: (otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalJRule.g:81:4: otherlv_0= 'Project Name:' ( (lv_ProjectName_1_0= ruleEString ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRuleSetAccess().getProjectNameKeyword_0_0());
                    			
                    // InternalJRule.g:85:4: ( (lv_ProjectName_1_0= ruleEString ) )
                    // InternalJRule.g:86:5: (lv_ProjectName_1_0= ruleEString )
                    {
                    // InternalJRule.g:86:5: (lv_ProjectName_1_0= ruleEString )
                    // InternalJRule.g:87:6: lv_ProjectName_1_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRuleSetAccess().getProjectNameEStringParserRuleCall_0_1_0());
                    					
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
                    							"es.uam.sara.tfg.dsl.JRule.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalJRule.g:105:3: ( (lv_rules_2_0= ruleRule ) )
            // InternalJRule.g:106:4: (lv_rules_2_0= ruleRule )
            {
            // InternalJRule.g:106:4: (lv_rules_2_0= ruleRule )
            // InternalJRule.g:107:5: lv_rules_2_0= ruleRule
            {

            					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_1_0());
            				
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
            						"es.uam.sara.tfg.dsl.JRule.Rule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:124:3: ( (lv_rules_3_0= ruleRule ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=63 && LA2_0<=64)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalJRule.g:125:4: (lv_rules_3_0= ruleRule )
            	    {
            	    // InternalJRule.g:125:4: (lv_rules_3_0= ruleRule )
            	    // InternalJRule.g:126:5: lv_rules_3_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getRuleSetAccess().getRulesRuleParserRuleCall_2_0());
            	    				
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
            	    						"es.uam.sara.tfg.dsl.JRule.Rule");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


    // $ANTLR start "entryRuleRule"
    // InternalJRule.g:147:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalJRule.g:147:45: (iv_ruleRule= ruleRule EOF )
            // InternalJRule.g:148:2: iv_ruleRule= ruleRule EOF
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
    // InternalJRule.g:154:1: ruleRule returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) ( (lv_on_1_0= ruleTesting ) ) otherlv_2= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Enumerator lv_action_0_0 = null;

        EObject lv_on_1_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:160:2: ( ( ( (lv_action_0_0= ruleAction ) ) ( (lv_on_1_0= ruleTesting ) ) otherlv_2= ';' ) )
            // InternalJRule.g:161:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_on_1_0= ruleTesting ) ) otherlv_2= ';' )
            {
            // InternalJRule.g:161:2: ( ( (lv_action_0_0= ruleAction ) ) ( (lv_on_1_0= ruleTesting ) ) otherlv_2= ';' )
            // InternalJRule.g:162:3: ( (lv_action_0_0= ruleAction ) ) ( (lv_on_1_0= ruleTesting ) ) otherlv_2= ';'
            {
            // InternalJRule.g:162:3: ( (lv_action_0_0= ruleAction ) )
            // InternalJRule.g:163:4: (lv_action_0_0= ruleAction )
            {
            // InternalJRule.g:163:4: (lv_action_0_0= ruleAction )
            // InternalJRule.g:164:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getActionActionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"es.uam.sara.tfg.dsl.JRule.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:181:3: ( (lv_on_1_0= ruleTesting ) )
            // InternalJRule.g:182:4: (lv_on_1_0= ruleTesting )
            {
            // InternalJRule.g:182:4: (lv_on_1_0= ruleTesting )
            // InternalJRule.g:183:5: lv_on_1_0= ruleTesting
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getOnTestingParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_on_1_0=ruleTesting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"on",
            						lv_on_1_0,
            						"es.uam.sara.tfg.dsl.JRule.Testing");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleTesting"
    // InternalJRule.g:208:1: entryRuleTesting returns [EObject current=null] : iv_ruleTesting= ruleTesting EOF ;
    public final EObject entryRuleTesting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTesting = null;


        try {
            // InternalJRule.g:208:48: (iv_ruleTesting= ruleTesting EOF )
            // InternalJRule.g:209:2: iv_ruleTesting= ruleTesting EOF
            {
             newCompositeNode(grammarAccess.getTestingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTesting=ruleTesting();

            state._fsp--;

             current =iv_ruleTesting; 
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
    // $ANTLR end "entryRuleTesting"


    // $ANTLR start "ruleTesting"
    // InternalJRule.g:215:1: ruleTesting returns [EObject current=null] : ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) ) ;
    public final EObject ruleTesting() throws RecognitionException {
        EObject current = null;

        Token lv_no_0_0=null;
        Token otherlv_3=null;
        Enumerator lv_quantifier_1_0 = null;

        EObject lv_element_2_0 = null;

        EObject lv_satisfy_4_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:221:2: ( ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) ) )
            // InternalJRule.g:222:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) )
            {
            // InternalJRule.g:222:2: ( ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) ) )
            // InternalJRule.g:223:3: ( (lv_no_0_0= 'no' ) )? ( (lv_quantifier_1_0= ruleQuantifier ) ) ( (lv_element_2_0= ruleElement ) ) otherlv_3= 'satisfy' ( (lv_satisfy_4_0= ruleOr ) )
            {
            // InternalJRule.g:223:3: ( (lv_no_0_0= 'no' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalJRule.g:224:4: (lv_no_0_0= 'no' )
                    {
                    // InternalJRule.g:224:4: (lv_no_0_0= 'no' )
                    // InternalJRule.g:225:5: lv_no_0_0= 'no'
                    {
                    lv_no_0_0=(Token)match(input,13,FOLLOW_6); 

                    					newLeafNode(lv_no_0_0, grammarAccess.getTestingAccess().getNoNoKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTestingRule());
                    					}
                    					setWithLastConsumed(current, "no", true, "no");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:237:3: ( (lv_quantifier_1_0= ruleQuantifier ) )
            // InternalJRule.g:238:4: (lv_quantifier_1_0= ruleQuantifier )
            {
            // InternalJRule.g:238:4: (lv_quantifier_1_0= ruleQuantifier )
            // InternalJRule.g:239:5: lv_quantifier_1_0= ruleQuantifier
            {

            					newCompositeNode(grammarAccess.getTestingAccess().getQuantifierQuantifierEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_quantifier_1_0=ruleQuantifier();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestingRule());
            					}
            					set(
            						current,
            						"quantifier",
            						lv_quantifier_1_0,
            						"es.uam.sara.tfg.dsl.JRule.Quantifier");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:256:3: ( (lv_element_2_0= ruleElement ) )
            // InternalJRule.g:257:4: (lv_element_2_0= ruleElement )
            {
            // InternalJRule.g:257:4: (lv_element_2_0= ruleElement )
            // InternalJRule.g:258:5: lv_element_2_0= ruleElement
            {

            					newCompositeNode(grammarAccess.getTestingAccess().getElementElementParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_element_2_0=ruleElement();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestingRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_2_0,
            						"es.uam.sara.tfg.dsl.JRule.Element");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getTestingAccess().getSatisfyKeyword_3());
            		
            // InternalJRule.g:279:3: ( (lv_satisfy_4_0= ruleOr ) )
            // InternalJRule.g:280:4: (lv_satisfy_4_0= ruleOr )
            {
            // InternalJRule.g:280:4: (lv_satisfy_4_0= ruleOr )
            // InternalJRule.g:281:5: lv_satisfy_4_0= ruleOr
            {

            					newCompositeNode(grammarAccess.getTestingAccess().getSatisfyOrParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_satisfy_4_0=ruleOr();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTestingRule());
            					}
            					set(
            						current,
            						"satisfy",
            						lv_satisfy_4_0,
            						"es.uam.sara.tfg.dsl.JRule.Or");
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
    // $ANTLR end "ruleTesting"


    // $ANTLR start "entryRuleElement"
    // InternalJRule.g:302:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // InternalJRule.g:302:48: (iv_ruleElement= ruleElement EOF )
            // InternalJRule.g:303:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // InternalJRule.g:309:1: ruleElement returns [EObject current=null] : ( ( (lv_element_0_0= ruleElementJava ) ) (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )? ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_element_0_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:315:2: ( ( ( (lv_element_0_0= ruleElementJava ) ) (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )? ) )
            // InternalJRule.g:316:2: ( ( (lv_element_0_0= ruleElementJava ) ) (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )? )
            {
            // InternalJRule.g:316:2: ( ( (lv_element_0_0= ruleElementJava ) ) (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )? )
            // InternalJRule.g:317:3: ( (lv_element_0_0= ruleElementJava ) ) (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )?
            {
            // InternalJRule.g:317:3: ( (lv_element_0_0= ruleElementJava ) )
            // InternalJRule.g:318:4: (lv_element_0_0= ruleElementJava )
            {
            // InternalJRule.g:318:4: (lv_element_0_0= ruleElementJava )
            // InternalJRule.g:319:5: lv_element_0_0= ruleElementJava
            {

            					newCompositeNode(grammarAccess.getElementAccess().getElementElementJavaEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_element_0_0=ruleElementJava();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getElementRule());
            					}
            					set(
            						current,
            						"element",
            						lv_element_0_0,
            						"es.uam.sara.tfg.dsl.JRule.ElementJava");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:336:3: (otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalJRule.g:337:4: otherlv_1= 'which' ( (lv_filter_2_0= ruleOr ) )
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_1, grammarAccess.getElementAccess().getWhichKeyword_1_0());
                    			
                    // InternalJRule.g:341:4: ( (lv_filter_2_0= ruleOr ) )
                    // InternalJRule.g:342:5: (lv_filter_2_0= ruleOr )
                    {
                    // InternalJRule.g:342:5: (lv_filter_2_0= ruleOr )
                    // InternalJRule.g:343:6: lv_filter_2_0= ruleOr
                    {

                    						newCompositeNode(grammarAccess.getElementAccess().getFilterOrParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filter_2_0=ruleOr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getElementRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_2_0,
                    							"es.uam.sara.tfg.dsl.JRule.Or");
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleOr"
    // InternalJRule.g:365:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalJRule.g:365:43: (iv_ruleOr= ruleOr EOF )
            // InternalJRule.g:366:2: iv_ruleOr= ruleOr EOF
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
    // InternalJRule.g:372:1: ruleOr returns [EObject current=null] : ( ( (lv_op_0_0= ruleAnd ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ ) ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;

        EObject lv_op_6_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:378:2: ( ( ( (lv_op_0_0= ruleAnd ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ ) ) )
            // InternalJRule.g:379:2: ( ( (lv_op_0_0= ruleAnd ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ ) )
            {
            // InternalJRule.g:379:2: ( ( (lv_op_0_0= ruleAnd ) ) | (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20||LA6_0==22||(LA6_0>=24 && LA6_0<=26)||LA6_0==30||(LA6_0>=33 && LA6_0<=38)||LA6_0==41||LA6_0==43||LA6_0==50||LA6_0==53) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalJRule.g:380:3: ( (lv_op_0_0= ruleAnd ) )
                    {
                    // InternalJRule.g:380:3: ( (lv_op_0_0= ruleAnd ) )
                    // InternalJRule.g:381:4: (lv_op_0_0= ruleAnd )
                    {
                    // InternalJRule.g:381:4: (lv_op_0_0= ruleAnd )
                    // InternalJRule.g:382:5: lv_op_0_0= ruleAnd
                    {

                    					newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_op_0_0=ruleAnd();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getOrRule());
                    					}
                    					add(
                    						current,
                    						"op",
                    						lv_op_0_0,
                    						"es.uam.sara.tfg.dsl.JRule.And");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:400:3: (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ )
                    {
                    // InternalJRule.g:400:3: (otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+ )
                    // InternalJRule.g:401:4: otherlv_1= '(' ( (lv_op_2_0= ruleAnd ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalJRule.g:405:4: ( (lv_op_2_0= ruleAnd ) )
                    // InternalJRule.g:406:5: (lv_op_2_0= ruleAnd )
                    {
                    // InternalJRule.g:406:5: (lv_op_2_0= ruleAnd )
                    // InternalJRule.g:407:6: lv_op_2_0= ruleAnd
                    {

                    						newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_op_2_0=ruleAnd();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOrRule());
                    						}
                    						add(
                    							current,
                    							"op",
                    							lv_op_2_0,
                    							"es.uam.sara.tfg.dsl.JRule.And");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getOrAccess().getRightParenthesisKeyword_1_2());
                    			
                    // InternalJRule.g:428:4: (otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalJRule.g:429:5: otherlv_4= 'or' otherlv_5= '(' ( (lv_op_6_0= ruleAnd ) ) otherlv_7= ')'
                    	    {
                    	    otherlv_4=(Token)match(input,18,FOLLOW_15); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getOrAccess().getOrKeyword_1_3_0());
                    	    				
                    	    otherlv_5=(Token)match(input,16,FOLLOW_12); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getOrAccess().getLeftParenthesisKeyword_1_3_1());
                    	    				
                    	    // InternalJRule.g:437:5: ( (lv_op_6_0= ruleAnd ) )
                    	    // InternalJRule.g:438:6: (lv_op_6_0= ruleAnd )
                    	    {
                    	    // InternalJRule.g:438:6: (lv_op_6_0= ruleAnd )
                    	    // InternalJRule.g:439:7: lv_op_6_0= ruleAnd
                    	    {

                    	    							newCompositeNode(grammarAccess.getOrAccess().getOpAndParserRuleCall_1_3_2_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_op_6_0=ruleAnd();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getOrRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"op",
                    	    								lv_op_6_0,
                    	    								"es.uam.sara.tfg.dsl.JRule.And");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,17,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getOrAccess().getRightParenthesisKeyword_1_3_3());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalJRule.g:466:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalJRule.g:466:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalJRule.g:467:2: iv_ruleAnd= ruleAnd EOF
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
    // InternalJRule.g:473:1: ruleAnd returns [EObject current=null] : ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_op_0_0 = null;

        EObject lv_op_2_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:479:2: ( ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* ) )
            // InternalJRule.g:480:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* )
            {
            // InternalJRule.g:480:2: ( ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )* )
            // InternalJRule.g:481:3: ( (lv_op_0_0= ruleSatisfy ) ) (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )*
            {
            // InternalJRule.g:481:3: ( (lv_op_0_0= ruleSatisfy ) )
            // InternalJRule.g:482:4: (lv_op_0_0= ruleSatisfy )
            {
            // InternalJRule.g:482:4: (lv_op_0_0= ruleSatisfy )
            // InternalJRule.g:483:5: lv_op_0_0= ruleSatisfy
            {

            					newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_op_0_0=ruleSatisfy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAndRule());
            					}
            					add(
            						current,
            						"op",
            						lv_op_0_0,
            						"es.uam.sara.tfg.dsl.JRule.Satisfy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:500:3: (otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalJRule.g:501:4: otherlv_1= 'and' ( (lv_op_2_0= ruleSatisfy ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getAndAccess().getAndKeyword_1_0());
            	    			
            	    // InternalJRule.g:505:4: ( (lv_op_2_0= ruleSatisfy ) )
            	    // InternalJRule.g:506:5: (lv_op_2_0= ruleSatisfy )
            	    {
            	    // InternalJRule.g:506:5: (lv_op_2_0= ruleSatisfy )
            	    // InternalJRule.g:507:6: lv_op_2_0= ruleSatisfy
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getOpSatisfyParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_op_2_0=ruleSatisfy();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_2_0,
            	    							"es.uam.sara.tfg.dsl.JRule.Satisfy");
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleSatisfy"
    // InternalJRule.g:529:1: entryRuleSatisfy returns [EObject current=null] : iv_ruleSatisfy= ruleSatisfy EOF ;
    public final EObject entryRuleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSatisfy = null;


        try {
            // InternalJRule.g:529:48: (iv_ruleSatisfy= ruleSatisfy EOF )
            // InternalJRule.g:530:2: iv_ruleSatisfy= ruleSatisfy EOF
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
    // InternalJRule.g:536:1: ruleSatisfy returns [EObject current=null] : (this_IsInheritor_0= ruleIsInheritor | this_Implements_1= ruleImplements | this_IsExtended_2= ruleIsExtended | this_HaveConstant_3= ruleHaveConstant | this_Variable_4= ruleVariable | this_Parametre_5= ruleParametre | this_Constructor_6= ruleConstructor | this_Return_7= ruleReturn | this_AttributeType_8= ruleAttributeType | this_Initialize_9= ruleInitialize | this_NoEmpty_10= ruleNoEmpty | this_Name_11= ruleName | this_JavaDoc_12= ruleJavaDoc | this_Conteins_13= ruleConteins | this_Modifiers_14= ruleModifiers ) ;
    public final EObject ruleSatisfy() throws RecognitionException {
        EObject current = null;

        EObject this_IsInheritor_0 = null;

        EObject this_Implements_1 = null;

        EObject this_IsExtended_2 = null;

        EObject this_HaveConstant_3 = null;

        EObject this_Variable_4 = null;

        EObject this_Parametre_5 = null;

        EObject this_Constructor_6 = null;

        EObject this_Return_7 = null;

        EObject this_AttributeType_8 = null;

        EObject this_Initialize_9 = null;

        EObject this_NoEmpty_10 = null;

        EObject this_Name_11 = null;

        EObject this_JavaDoc_12 = null;

        EObject this_Conteins_13 = null;

        EObject this_Modifiers_14 = null;



        	enterRule();

        try {
            // InternalJRule.g:542:2: ( (this_IsInheritor_0= ruleIsInheritor | this_Implements_1= ruleImplements | this_IsExtended_2= ruleIsExtended | this_HaveConstant_3= ruleHaveConstant | this_Variable_4= ruleVariable | this_Parametre_5= ruleParametre | this_Constructor_6= ruleConstructor | this_Return_7= ruleReturn | this_AttributeType_8= ruleAttributeType | this_Initialize_9= ruleInitialize | this_NoEmpty_10= ruleNoEmpty | this_Name_11= ruleName | this_JavaDoc_12= ruleJavaDoc | this_Conteins_13= ruleConteins | this_Modifiers_14= ruleModifiers ) )
            // InternalJRule.g:543:2: (this_IsInheritor_0= ruleIsInheritor | this_Implements_1= ruleImplements | this_IsExtended_2= ruleIsExtended | this_HaveConstant_3= ruleHaveConstant | this_Variable_4= ruleVariable | this_Parametre_5= ruleParametre | this_Constructor_6= ruleConstructor | this_Return_7= ruleReturn | this_AttributeType_8= ruleAttributeType | this_Initialize_9= ruleInitialize | this_NoEmpty_10= ruleNoEmpty | this_Name_11= ruleName | this_JavaDoc_12= ruleJavaDoc | this_Conteins_13= ruleConteins | this_Modifiers_14= ruleModifiers )
            {
            // InternalJRule.g:543:2: (this_IsInheritor_0= ruleIsInheritor | this_Implements_1= ruleImplements | this_IsExtended_2= ruleIsExtended | this_HaveConstant_3= ruleHaveConstant | this_Variable_4= ruleVariable | this_Parametre_5= ruleParametre | this_Constructor_6= ruleConstructor | this_Return_7= ruleReturn | this_AttributeType_8= ruleAttributeType | this_Initialize_9= ruleInitialize | this_NoEmpty_10= ruleNoEmpty | this_Name_11= ruleName | this_JavaDoc_12= ruleJavaDoc | this_Conteins_13= ruleConteins | this_Modifiers_14= ruleModifiers )
            int alt8=15;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            case 26:
                {
                alt8=5;
                }
                break;
            case 30:
                {
                alt8=6;
                }
                break;
            case 33:
                {
                alt8=7;
                }
                break;
            case 34:
                {
                alt8=8;
                }
                break;
            case 35:
                {
                alt8=9;
                }
                break;
            case 36:
                {
                alt8=10;
                }
                break;
            case 37:
                {
                alt8=11;
                }
                break;
            case 38:
            case 41:
                {
                alt8=12;
                }
                break;
            case 43:
                {
                alt8=13;
                }
                break;
            case 50:
                {
                alt8=14;
                }
                break;
            case 53:
                {
                alt8=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalJRule.g:544:3: this_IsInheritor_0= ruleIsInheritor
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsInheritorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsInheritor_0=ruleIsInheritor();

                    state._fsp--;


                    			current = this_IsInheritor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalJRule.g:553:3: this_Implements_1= ruleImplements
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getImplementsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Implements_1=ruleImplements();

                    state._fsp--;


                    			current = this_Implements_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalJRule.g:562:3: this_IsExtended_2= ruleIsExtended
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getIsExtendedParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_IsExtended_2=ruleIsExtended();

                    state._fsp--;


                    			current = this_IsExtended_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalJRule.g:571:3: this_HaveConstant_3= ruleHaveConstant
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getHaveConstantParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_HaveConstant_3=ruleHaveConstant();

                    state._fsp--;


                    			current = this_HaveConstant_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalJRule.g:580:3: this_Variable_4= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getVariableParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_4=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalJRule.g:589:3: this_Parametre_5= ruleParametre
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getParametreParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Parametre_5=ruleParametre();

                    state._fsp--;


                    			current = this_Parametre_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalJRule.g:598:3: this_Constructor_6= ruleConstructor
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getConstructorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Constructor_6=ruleConstructor();

                    state._fsp--;


                    			current = this_Constructor_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalJRule.g:607:3: this_Return_7= ruleReturn
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getReturnParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Return_7=ruleReturn();

                    state._fsp--;


                    			current = this_Return_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalJRule.g:616:3: this_AttributeType_8= ruleAttributeType
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getAttributeTypeParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttributeType_8=ruleAttributeType();

                    state._fsp--;


                    			current = this_AttributeType_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalJRule.g:625:3: this_Initialize_9= ruleInitialize
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getInitializeParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Initialize_9=ruleInitialize();

                    state._fsp--;


                    			current = this_Initialize_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalJRule.g:634:3: this_NoEmpty_10= ruleNoEmpty
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNoEmptyParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_NoEmpty_10=ruleNoEmpty();

                    state._fsp--;


                    			current = this_NoEmpty_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalJRule.g:643:3: this_Name_11= ruleName
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getNameParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Name_11=ruleName();

                    state._fsp--;


                    			current = this_Name_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalJRule.g:652:3: this_JavaDoc_12= ruleJavaDoc
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
                    // InternalJRule.g:661:3: this_Conteins_13= ruleConteins
                    {

                    			newCompositeNode(grammarAccess.getSatisfyAccess().getConteinsParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_Conteins_13=ruleConteins();

                    state._fsp--;


                    			current = this_Conteins_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalJRule.g:670:3: this_Modifiers_14= ruleModifiers
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


    // $ANTLR start "entryRuleIsInheritor"
    // InternalJRule.g:682:1: entryRuleIsInheritor returns [EObject current=null] : iv_ruleIsInheritor= ruleIsInheritor EOF ;
    public final EObject entryRuleIsInheritor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsInheritor = null;


        try {
            // InternalJRule.g:682:52: (iv_ruleIsInheritor= ruleIsInheritor EOF )
            // InternalJRule.g:683:2: iv_ruleIsInheritor= ruleIsInheritor EOF
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
    // InternalJRule.g:689:1: ruleIsInheritor returns [EObject current=null] : ( () otherlv_1= 'is inheritor' (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )? ) ;
    public final EObject ruleIsInheritor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_maxLevel_3_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:695:2: ( ( () otherlv_1= 'is inheritor' (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )? ) )
            // InternalJRule.g:696:2: ( () otherlv_1= 'is inheritor' (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )? )
            {
            // InternalJRule.g:696:2: ( () otherlv_1= 'is inheritor' (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )? )
            // InternalJRule.g:697:3: () otherlv_1= 'is inheritor' (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )?
            {
            // InternalJRule.g:697:3: ()
            // InternalJRule.g:698:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getIsInheritorAccess().getIsInheritorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getIsInheritorAccess().getIsInheritorKeyword_1());
            		
            // InternalJRule.g:708:3: (otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalJRule.g:709:4: otherlv_2= 'max level=' ( (lv_maxLevel_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getIsInheritorAccess().getMaxLevelKeyword_2_0());
                    			
                    // InternalJRule.g:713:4: ( (lv_maxLevel_3_0= ruleEBigInteger ) )
                    // InternalJRule.g:714:5: (lv_maxLevel_3_0= ruleEBigInteger )
                    {
                    // InternalJRule.g:714:5: (lv_maxLevel_3_0= ruleEBigInteger )
                    // InternalJRule.g:715:6: lv_maxLevel_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getIsInheritorAccess().getMaxLevelEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_maxLevel_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIsInheritorRule());
                    						}
                    						set(
                    							current,
                    							"maxLevel",
                    							lv_maxLevel_3_0,
                    							"es.uam.sara.tfg.dsl.JRule.EBigInteger");
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
    // $ANTLR end "ruleIsInheritor"


    // $ANTLR start "entryRuleImplements"
    // InternalJRule.g:737:1: entryRuleImplements returns [EObject current=null] : iv_ruleImplements= ruleImplements EOF ;
    public final EObject entryRuleImplements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplements = null;


        try {
            // InternalJRule.g:737:51: (iv_ruleImplements= ruleImplements EOF )
            // InternalJRule.g:738:2: iv_ruleImplements= ruleImplements EOF
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
    // InternalJRule.g:744:1: ruleImplements returns [EObject current=null] : ( () otherlv_1= 'implements interface' (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )? ) ;
    public final EObject ruleImplements() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_maxInterface_3_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:750:2: ( ( () otherlv_1= 'implements interface' (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )? ) )
            // InternalJRule.g:751:2: ( () otherlv_1= 'implements interface' (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )? )
            {
            // InternalJRule.g:751:2: ( () otherlv_1= 'implements interface' (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )? )
            // InternalJRule.g:752:3: () otherlv_1= 'implements interface' (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )?
            {
            // InternalJRule.g:752:3: ()
            // InternalJRule.g:753:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getImplementsAccess().getImplementsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getImplementsAccess().getImplementsInterfaceKeyword_1());
            		
            // InternalJRule.g:763:3: (otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalJRule.g:764:4: otherlv_2= 'max interface=' ( (lv_maxInterface_3_0= ruleEBigInteger ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_2, grammarAccess.getImplementsAccess().getMaxInterfaceKeyword_2_0());
                    			
                    // InternalJRule.g:768:4: ( (lv_maxInterface_3_0= ruleEBigInteger ) )
                    // InternalJRule.g:769:5: (lv_maxInterface_3_0= ruleEBigInteger )
                    {
                    // InternalJRule.g:769:5: (lv_maxInterface_3_0= ruleEBigInteger )
                    // InternalJRule.g:770:6: lv_maxInterface_3_0= ruleEBigInteger
                    {

                    						newCompositeNode(grammarAccess.getImplementsAccess().getMaxInterfaceEBigIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_maxInterface_3_0=ruleEBigInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getImplementsRule());
                    						}
                    						set(
                    							current,
                    							"maxInterface",
                    							lv_maxInterface_3_0,
                    							"es.uam.sara.tfg.dsl.JRule.EBigInteger");
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
    // $ANTLR end "ruleImplements"


    // $ANTLR start "entryRuleIsExtended"
    // InternalJRule.g:792:1: entryRuleIsExtended returns [EObject current=null] : iv_ruleIsExtended= ruleIsExtended EOF ;
    public final EObject entryRuleIsExtended() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIsExtended = null;


        try {
            // InternalJRule.g:792:51: (iv_ruleIsExtended= ruleIsExtended EOF )
            // InternalJRule.g:793:2: iv_ruleIsExtended= ruleIsExtended EOF
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
    // InternalJRule.g:799:1: ruleIsExtended returns [EObject current=null] : ( (lv_isExtends_0_0= 'is extends' ) ) ;
    public final EObject ruleIsExtended() throws RecognitionException {
        EObject current = null;

        Token lv_isExtends_0_0=null;


        	enterRule();

        try {
            // InternalJRule.g:805:2: ( ( (lv_isExtends_0_0= 'is extends' ) ) )
            // InternalJRule.g:806:2: ( (lv_isExtends_0_0= 'is extends' ) )
            {
            // InternalJRule.g:806:2: ( (lv_isExtends_0_0= 'is extends' ) )
            // InternalJRule.g:807:3: (lv_isExtends_0_0= 'is extends' )
            {
            // InternalJRule.g:807:3: (lv_isExtends_0_0= 'is extends' )
            // InternalJRule.g:808:4: lv_isExtends_0_0= 'is extends'
            {
            lv_isExtends_0_0=(Token)match(input,24,FOLLOW_2); 

            				newLeafNode(lv_isExtends_0_0, grammarAccess.getIsExtendedAccess().getIsExtendsIsExtendsKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIsExtendedRule());
            				}
            				setWithLastConsumed(current, "isExtends", true, "is extends");
            			

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
    // $ANTLR end "ruleIsExtended"


    // $ANTLR start "entryRuleHaveConstant"
    // InternalJRule.g:823:1: entryRuleHaveConstant returns [EObject current=null] : iv_ruleHaveConstant= ruleHaveConstant EOF ;
    public final EObject entryRuleHaveConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHaveConstant = null;


        try {
            // InternalJRule.g:823:53: (iv_ruleHaveConstant= ruleHaveConstant EOF )
            // InternalJRule.g:824:2: iv_ruleHaveConstant= ruleHaveConstant EOF
            {
             newCompositeNode(grammarAccess.getHaveConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHaveConstant=ruleHaveConstant();

            state._fsp--;

             current =iv_ruleHaveConstant; 
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
    // $ANTLR end "entryRuleHaveConstant"


    // $ANTLR start "ruleHaveConstant"
    // InternalJRule.g:830:1: ruleHaveConstant returns [EObject current=null] : ( () otherlv_1= 'use constant' ) ;
    public final EObject ruleHaveConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJRule.g:836:2: ( ( () otherlv_1= 'use constant' ) )
            // InternalJRule.g:837:2: ( () otherlv_1= 'use constant' )
            {
            // InternalJRule.g:837:2: ( () otherlv_1= 'use constant' )
            // InternalJRule.g:838:3: () otherlv_1= 'use constant'
            {
            // InternalJRule.g:838:3: ()
            // InternalJRule.g:839:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHaveConstantAccess().getHaveConstantAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHaveConstantAccess().getUseConstantKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHaveConstant"


    // $ANTLR start "entryRuleVariable"
    // InternalJRule.g:853:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalJRule.g:853:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalJRule.g:854:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalJRule.g:860:1: ruleVariable returns [EObject current=null] : (otherlv_0= 'variables' ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_position_1_0=null;
        Token otherlv_2=null;
        Token lv_initialize_3_0=null;
        Token lv_initialize_4_0=null;
        Token otherlv_5=null;
        Token lv_position_6_0=null;


        	enterRule();

        try {
            // InternalJRule.g:866:2: ( (otherlv_0= 'variables' ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) ) ) )
            // InternalJRule.g:867:2: (otherlv_0= 'variables' ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) ) )
            {
            // InternalJRule.g:867:2: (otherlv_0= 'variables' ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) ) )
            // InternalJRule.g:868:3: otherlv_0= 'variables' ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVariablesKeyword_0());
            		
            // InternalJRule.g:872:3: ( ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? ) | ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            else if ( (LA13_0==29) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalJRule.g:873:4: ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? )
                    {
                    // InternalJRule.g:873:4: ( ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )? )
                    // InternalJRule.g:874:5: ( (lv_position_1_0= 'right position' ) ) (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )?
                    {
                    // InternalJRule.g:874:5: ( (lv_position_1_0= 'right position' ) )
                    // InternalJRule.g:875:6: (lv_position_1_0= 'right position' )
                    {
                    // InternalJRule.g:875:6: (lv_position_1_0= 'right position' )
                    // InternalJRule.g:876:7: lv_position_1_0= 'right position'
                    {
                    lv_position_1_0=(Token)match(input,27,FOLLOW_22); 

                    							newLeafNode(lv_position_1_0, grammarAccess.getVariableAccess().getPositionRightPositionKeyword_1_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableRule());
                    							}
                    							setWithLastConsumed(current, "position", true, "right position");
                    						

                    }


                    }

                    // InternalJRule.g:888:5: (otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==28) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalJRule.g:889:6: otherlv_2= 'and ' ( (lv_initialize_3_0= 'initialized' ) )
                            {
                            otherlv_2=(Token)match(input,28,FOLLOW_23); 

                            						newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getAndKeyword_1_0_1_0());
                            					
                            // InternalJRule.g:893:6: ( (lv_initialize_3_0= 'initialized' ) )
                            // InternalJRule.g:894:7: (lv_initialize_3_0= 'initialized' )
                            {
                            // InternalJRule.g:894:7: (lv_initialize_3_0= 'initialized' )
                            // InternalJRule.g:895:8: lv_initialize_3_0= 'initialized'
                            {
                            lv_initialize_3_0=(Token)match(input,29,FOLLOW_2); 

                            								newLeafNode(lv_initialize_3_0, grammarAccess.getVariableAccess().getInitializeInitializedKeyword_1_0_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getVariableRule());
                            								}
                            								setWithLastConsumed(current, "initialize", true, "initialized");
                            							

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:910:4: ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? )
                    {
                    // InternalJRule.g:910:4: ( ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )? )
                    // InternalJRule.g:911:5: ( (lv_initialize_4_0= 'initialized' ) ) (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )?
                    {
                    // InternalJRule.g:911:5: ( (lv_initialize_4_0= 'initialized' ) )
                    // InternalJRule.g:912:6: (lv_initialize_4_0= 'initialized' )
                    {
                    // InternalJRule.g:912:6: (lv_initialize_4_0= 'initialized' )
                    // InternalJRule.g:913:7: lv_initialize_4_0= 'initialized'
                    {
                    lv_initialize_4_0=(Token)match(input,29,FOLLOW_22); 

                    							newLeafNode(lv_initialize_4_0, grammarAccess.getVariableAccess().getInitializeInitializedKeyword_1_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getVariableRule());
                    							}
                    							setWithLastConsumed(current, "initialize", true, "initialized");
                    						

                    }


                    }

                    // InternalJRule.g:925:5: (otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==28) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalJRule.g:926:6: otherlv_5= 'and ' ( (lv_position_6_0= 'right position' ) )
                            {
                            otherlv_5=(Token)match(input,28,FOLLOW_24); 

                            						newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getAndKeyword_1_1_1_0());
                            					
                            // InternalJRule.g:930:6: ( (lv_position_6_0= 'right position' ) )
                            // InternalJRule.g:931:7: (lv_position_6_0= 'right position' )
                            {
                            // InternalJRule.g:931:7: (lv_position_6_0= 'right position' )
                            // InternalJRule.g:932:8: lv_position_6_0= 'right position'
                            {
                            lv_position_6_0=(Token)match(input,27,FOLLOW_2); 

                            								newLeafNode(lv_position_6_0, grammarAccess.getVariableAccess().getPositionRightPositionKeyword_1_1_1_1_0());
                            							

                            								if (current==null) {
                            									current = createModelElement(grammarAccess.getVariableRule());
                            								}
                            								setWithLastConsumed(current, "position", true, "right position");
                            							

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleParametre"
    // InternalJRule.g:951:1: entryRuleParametre returns [EObject current=null] : iv_ruleParametre= ruleParametre EOF ;
    public final EObject entryRuleParametre() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParametre = null;


        try {
            // InternalJRule.g:951:50: (iv_ruleParametre= ruleParametre EOF )
            // InternalJRule.g:952:2: iv_ruleParametre= ruleParametre EOF
            {
             newCompositeNode(grammarAccess.getParametreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParametre=ruleParametre();

            state._fsp--;

             current =iv_ruleParametre; 
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
    // $ANTLR end "entryRuleParametre"


    // $ANTLR start "ruleParametre"
    // InternalJRule.g:958:1: ruleParametre returns [EObject current=null] : ( () otherlv_1= 'number of parameters =' ( (lv_numParam_2_0= ruleEBigInteger ) ) (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )? ) ;
    public final EObject ruleParametre() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_numParam_2_0 = null;

        AntlrDatatypeRuleToken lv_typesParam_4_0 = null;

        AntlrDatatypeRuleToken lv_typesParam_6_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:964:2: ( ( () otherlv_1= 'number of parameters =' ( (lv_numParam_2_0= ruleEBigInteger ) ) (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )? ) )
            // InternalJRule.g:965:2: ( () otherlv_1= 'number of parameters =' ( (lv_numParam_2_0= ruleEBigInteger ) ) (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )? )
            {
            // InternalJRule.g:965:2: ( () otherlv_1= 'number of parameters =' ( (lv_numParam_2_0= ruleEBigInteger ) ) (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )? )
            // InternalJRule.g:966:3: () otherlv_1= 'number of parameters =' ( (lv_numParam_2_0= ruleEBigInteger ) ) (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )?
            {
            // InternalJRule.g:966:3: ()
            // InternalJRule.g:967:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParametreAccess().getParametreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getParametreAccess().getNumberOfParametersKeyword_1());
            		
            // InternalJRule.g:977:3: ( (lv_numParam_2_0= ruleEBigInteger ) )
            // InternalJRule.g:978:4: (lv_numParam_2_0= ruleEBigInteger )
            {
            // InternalJRule.g:978:4: (lv_numParam_2_0= ruleEBigInteger )
            // InternalJRule.g:979:5: lv_numParam_2_0= ruleEBigInteger
            {

            					newCompositeNode(grammarAccess.getParametreAccess().getNumParamEBigIntegerParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_25);
            lv_numParam_2_0=ruleEBigInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParametreRule());
            					}
            					set(
            						current,
            						"numParam",
            						lv_numParam_2_0,
            						"es.uam.sara.tfg.dsl.JRule.EBigInteger");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalJRule.g:996:3: (otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )* )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==31) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalJRule.g:997:4: otherlv_3= 'and types=' ( (lv_typesParam_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )*
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getParametreAccess().getAndTypesKeyword_3_0());
                    			
                    // InternalJRule.g:1001:4: ( (lv_typesParam_4_0= ruleEString ) )
                    // InternalJRule.g:1002:5: (lv_typesParam_4_0= ruleEString )
                    {
                    // InternalJRule.g:1002:5: (lv_typesParam_4_0= ruleEString )
                    // InternalJRule.g:1003:6: lv_typesParam_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParametreAccess().getTypesParamEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_typesParam_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParametreRule());
                    						}
                    						add(
                    							current,
                    							"typesParam",
                    							lv_typesParam_4_0,
                    							"es.uam.sara.tfg.dsl.JRule.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRule.g:1020:4: (otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==32) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalJRule.g:1021:5: otherlv_5= ',' ( (lv_typesParam_6_0= ruleEString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,32,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getParametreAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalJRule.g:1025:5: ( (lv_typesParam_6_0= ruleEString ) )
                    	    // InternalJRule.g:1026:6: (lv_typesParam_6_0= ruleEString )
                    	    {
                    	    // InternalJRule.g:1026:6: (lv_typesParam_6_0= ruleEString )
                    	    // InternalJRule.g:1027:7: lv_typesParam_6_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getParametreAccess().getTypesParamEStringParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_26);
                    	    lv_typesParam_6_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParametreRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"typesParam",
                    	    								lv_typesParam_6_0,
                    	    								"es.uam.sara.tfg.dsl.JRule.EString");
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
    // $ANTLR end "ruleParametre"


    // $ANTLR start "entryRuleConstructor"
    // InternalJRule.g:1050:1: entryRuleConstructor returns [EObject current=null] : iv_ruleConstructor= ruleConstructor EOF ;
    public final EObject entryRuleConstructor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructor = null;


        try {
            // InternalJRule.g:1050:52: (iv_ruleConstructor= ruleConstructor EOF )
            // InternalJRule.g:1051:2: iv_ruleConstructor= ruleConstructor EOF
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
    // InternalJRule.g:1057:1: ruleConstructor returns [EObject current=null] : ( () otherlv_1= 'is constructor' ) ;
    public final EObject ruleConstructor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1063:2: ( ( () otherlv_1= 'is constructor' ) )
            // InternalJRule.g:1064:2: ( () otherlv_1= 'is constructor' )
            {
            // InternalJRule.g:1064:2: ( () otherlv_1= 'is constructor' )
            // InternalJRule.g:1065:3: () otherlv_1= 'is constructor'
            {
            // InternalJRule.g:1065:3: ()
            // InternalJRule.g:1066:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConstructorAccess().getConstructorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,33,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getConstructorAccess().getIsConstructorKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalJRule.g:1080:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // InternalJRule.g:1080:47: (iv_ruleReturn= ruleReturn EOF )
            // InternalJRule.g:1081:2: iv_ruleReturn= ruleReturn EOF
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
    // InternalJRule.g:1087:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'return type=' ( (lv_returnType_1_0= ruleEString ) ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_returnType_1_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:1093:2: ( (otherlv_0= 'return type=' ( (lv_returnType_1_0= ruleEString ) ) ) )
            // InternalJRule.g:1094:2: (otherlv_0= 'return type=' ( (lv_returnType_1_0= ruleEString ) ) )
            {
            // InternalJRule.g:1094:2: (otherlv_0= 'return type=' ( (lv_returnType_1_0= ruleEString ) ) )
            // InternalJRule.g:1095:3: otherlv_0= 'return type=' ( (lv_returnType_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getReturnTypeKeyword_0());
            		
            // InternalJRule.g:1099:3: ( (lv_returnType_1_0= ruleEString ) )
            // InternalJRule.g:1100:4: (lv_returnType_1_0= ruleEString )
            {
            // InternalJRule.g:1100:4: (lv_returnType_1_0= ruleEString )
            // InternalJRule.g:1101:5: lv_returnType_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReturnAccess().getReturnTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_returnType_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReturnRule());
            					}
            					set(
            						current,
            						"returnType",
            						lv_returnType_1_0,
            						"es.uam.sara.tfg.dsl.JRule.EString");
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
    // InternalJRule.g:1122:1: entryRuleAttributeType returns [EObject current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final EObject entryRuleAttributeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeType = null;


        try {
            // InternalJRule.g:1122:54: (iv_ruleAttributeType= ruleAttributeType EOF )
            // InternalJRule.g:1123:2: iv_ruleAttributeType= ruleAttributeType EOF
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
    // InternalJRule.g:1129:1: ruleAttributeType returns [EObject current=null] : (otherlv_0= 'attribute type=' ( (lv_Type_1_0= ruleEString ) ) ) ;
    public final EObject ruleAttributeType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_Type_1_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:1135:2: ( (otherlv_0= 'attribute type=' ( (lv_Type_1_0= ruleEString ) ) ) )
            // InternalJRule.g:1136:2: (otherlv_0= 'attribute type=' ( (lv_Type_1_0= ruleEString ) ) )
            {
            // InternalJRule.g:1136:2: (otherlv_0= 'attribute type=' ( (lv_Type_1_0= ruleEString ) ) )
            // InternalJRule.g:1137:3: otherlv_0= 'attribute type=' ( (lv_Type_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeTypeAccess().getAttributeTypeKeyword_0());
            		
            // InternalJRule.g:1141:3: ( (lv_Type_1_0= ruleEString ) )
            // InternalJRule.g:1142:4: (lv_Type_1_0= ruleEString )
            {
            // InternalJRule.g:1142:4: (lv_Type_1_0= ruleEString )
            // InternalJRule.g:1143:5: lv_Type_1_0= ruleEString
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
            						"es.uam.sara.tfg.dsl.JRule.EString");
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
    // InternalJRule.g:1164:1: entryRuleInitialize returns [EObject current=null] : iv_ruleInitialize= ruleInitialize EOF ;
    public final EObject entryRuleInitialize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialize = null;


        try {
            // InternalJRule.g:1164:51: (iv_ruleInitialize= ruleInitialize EOF )
            // InternalJRule.g:1165:2: iv_ruleInitialize= ruleInitialize EOF
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
    // InternalJRule.g:1171:1: ruleInitialize returns [EObject current=null] : ( () otherlv_1= 'is initialized' ) ;
    public final EObject ruleInitialize() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1177:2: ( ( () otherlv_1= 'is initialized' ) )
            // InternalJRule.g:1178:2: ( () otherlv_1= 'is initialized' )
            {
            // InternalJRule.g:1178:2: ( () otherlv_1= 'is initialized' )
            // InternalJRule.g:1179:3: () otherlv_1= 'is initialized'
            {
            // InternalJRule.g:1179:3: ()
            // InternalJRule.g:1180:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitializeAccess().getInitializeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInitializeAccess().getIsInitializedKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalJRule.g:1194:1: entryRuleNoEmpty returns [EObject current=null] : iv_ruleNoEmpty= ruleNoEmpty EOF ;
    public final EObject entryRuleNoEmpty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoEmpty = null;


        try {
            // InternalJRule.g:1194:48: (iv_ruleNoEmpty= ruleNoEmpty EOF )
            // InternalJRule.g:1195:2: iv_ruleNoEmpty= ruleNoEmpty EOF
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
    // InternalJRule.g:1201:1: ruleNoEmpty returns [EObject current=null] : ( () otherlv_1= 'no empty' ) ;
    public final EObject ruleNoEmpty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1207:2: ( ( () otherlv_1= 'no empty' ) )
            // InternalJRule.g:1208:2: ( () otherlv_1= 'no empty' )
            {
            // InternalJRule.g:1208:2: ( () otherlv_1= 'no empty' )
            // InternalJRule.g:1209:3: () otherlv_1= 'no empty'
            {
            // InternalJRule.g:1209:3: ()
            // InternalJRule.g:1210:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNoEmptyAccess().getNoEmptyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNoEmptyAccess().getNoEmptyKeyword_1());
            		

            }


            }


            	leaveRule();

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
    // InternalJRule.g:1224:1: entryRuleName returns [EObject current=null] : iv_ruleName= ruleName EOF ;
    public final EObject entryRuleName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleName = null;


        try {
            // InternalJRule.g:1224:45: (iv_ruleName= ruleName EOF )
            // InternalJRule.g:1225:2: iv_ruleName= ruleName EOF
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
    // InternalJRule.g:1231:1: ruleName returns [EObject current=null] : ( (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? ) | (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? ) ) ;
    public final EObject ruleName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_type_1_0 = null;

        Enumerator lv_operator_3_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_Language_6_0 = null;

        Enumerator lv_operator_8_0 = null;

        AntlrDatatypeRuleToken lv_name_9_0 = null;

        Enumerator lv_Language_11_0 = null;

        Enumerator lv_type_13_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:1237:2: ( ( (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? ) | (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? ) ) )
            // InternalJRule.g:1238:2: ( (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? ) | (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? ) )
            {
            // InternalJRule.g:1238:2: ( (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? ) | (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalJRule.g:1239:3: (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? )
                    {
                    // InternalJRule.g:1239:3: (otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )? )
                    // InternalJRule.g:1240:4: otherlv_0= 'type name =' ( (lv_type_1_0= ruleNameType ) ) (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )?
                    {
                    otherlv_0=(Token)match(input,38,FOLLOW_27); 

                    				newLeafNode(otherlv_0, grammarAccess.getNameAccess().getTypeNameKeyword_0_0());
                    			
                    // InternalJRule.g:1244:4: ( (lv_type_1_0= ruleNameType ) )
                    // InternalJRule.g:1245:5: (lv_type_1_0= ruleNameType )
                    {
                    // InternalJRule.g:1245:5: (lv_type_1_0= ruleNameType )
                    // InternalJRule.g:1246:6: lv_type_1_0= ruleNameType
                    {

                    						newCompositeNode(grammarAccess.getNameAccess().getTypeNameTypeEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_type_1_0=ruleNameType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_1_0,
                    							"es.uam.sara.tfg.dsl.JRule.NameType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRule.g:1263:4: (otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==39) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalJRule.g:1264:5: otherlv_2= 'and name ' ( (lv_operator_3_0= ruleNameOperator ) ) ( (lv_name_4_0= ruleEString ) ) (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )?
                            {
                            otherlv_2=(Token)match(input,39,FOLLOW_29); 

                            					newLeafNode(otherlv_2, grammarAccess.getNameAccess().getAndNameKeyword_0_2_0());
                            				
                            // InternalJRule.g:1268:5: ( (lv_operator_3_0= ruleNameOperator ) )
                            // InternalJRule.g:1269:6: (lv_operator_3_0= ruleNameOperator )
                            {
                            // InternalJRule.g:1269:6: (lv_operator_3_0= ruleNameOperator )
                            // InternalJRule.g:1270:7: lv_operator_3_0= ruleNameOperator
                            {

                            							newCompositeNode(grammarAccess.getNameAccess().getOperatorNameOperatorEnumRuleCall_0_2_1_0());
                            						
                            pushFollow(FOLLOW_3);
                            lv_operator_3_0=ruleNameOperator();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNameRule());
                            							}
                            							set(
                            								current,
                            								"operator",
                            								lv_operator_3_0,
                            								"es.uam.sara.tfg.dsl.JRule.NameOperator");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalJRule.g:1287:5: ( (lv_name_4_0= ruleEString ) )
                            // InternalJRule.g:1288:6: (lv_name_4_0= ruleEString )
                            {
                            // InternalJRule.g:1288:6: (lv_name_4_0= ruleEString )
                            // InternalJRule.g:1289:7: lv_name_4_0= ruleEString
                            {

                            							newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_0_2_2_0());
                            						
                            pushFollow(FOLLOW_30);
                            lv_name_4_0=ruleEString();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNameRule());
                            							}
                            							set(
                            								current,
                            								"name",
                            								lv_name_4_0,
                            								"es.uam.sara.tfg.dsl.JRule.EString");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalJRule.g:1306:5: (otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) ) )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==40) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // InternalJRule.g:1307:6: otherlv_5= 'in' ( (lv_Language_6_0= ruleLanguage ) )
                                    {
                                    otherlv_5=(Token)match(input,40,FOLLOW_31); 

                                    						newLeafNode(otherlv_5, grammarAccess.getNameAccess().getInKeyword_0_2_3_0());
                                    					
                                    // InternalJRule.g:1311:6: ( (lv_Language_6_0= ruleLanguage ) )
                                    // InternalJRule.g:1312:7: (lv_Language_6_0= ruleLanguage )
                                    {
                                    // InternalJRule.g:1312:7: (lv_Language_6_0= ruleLanguage )
                                    // InternalJRule.g:1313:8: lv_Language_6_0= ruleLanguage
                                    {

                                    								newCompositeNode(grammarAccess.getNameAccess().getLanguageLanguageEnumRuleCall_0_2_3_1_0());
                                    							
                                    pushFollow(FOLLOW_2);
                                    lv_Language_6_0=ruleLanguage();

                                    state._fsp--;


                                    								if (current==null) {
                                    									current = createModelElementForParent(grammarAccess.getNameRule());
                                    								}
                                    								set(
                                    									current,
                                    									"Language",
                                    									lv_Language_6_0,
                                    									"es.uam.sara.tfg.dsl.JRule.Language");
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
                    // InternalJRule.g:1334:3: (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? )
                    {
                    // InternalJRule.g:1334:3: (otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )? )
                    // InternalJRule.g:1335:4: otherlv_7= 'name ' ( (lv_operator_8_0= ruleNameOperator ) ) ( (lv_name_9_0= ruleEString ) ) (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )? (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )?
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_29); 

                    				newLeafNode(otherlv_7, grammarAccess.getNameAccess().getNameKeyword_1_0());
                    			
                    // InternalJRule.g:1339:4: ( (lv_operator_8_0= ruleNameOperator ) )
                    // InternalJRule.g:1340:5: (lv_operator_8_0= ruleNameOperator )
                    {
                    // InternalJRule.g:1340:5: (lv_operator_8_0= ruleNameOperator )
                    // InternalJRule.g:1341:6: lv_operator_8_0= ruleNameOperator
                    {

                    						newCompositeNode(grammarAccess.getNameAccess().getOperatorNameOperatorEnumRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_operator_8_0=ruleNameOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameRule());
                    						}
                    						set(
                    							current,
                    							"operator",
                    							lv_operator_8_0,
                    							"es.uam.sara.tfg.dsl.JRule.NameOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRule.g:1358:4: ( (lv_name_9_0= ruleEString ) )
                    // InternalJRule.g:1359:5: (lv_name_9_0= ruleEString )
                    {
                    // InternalJRule.g:1359:5: (lv_name_9_0= ruleEString )
                    // InternalJRule.g:1360:6: lv_name_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getNameAccess().getNameEStringParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_name_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNameRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_9_0,
                    							"es.uam.sara.tfg.dsl.JRule.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRule.g:1377:4: (otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==40) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalJRule.g:1378:5: otherlv_10= 'in' ( (lv_Language_11_0= ruleLanguage ) )
                            {
                            otherlv_10=(Token)match(input,40,FOLLOW_31); 

                            					newLeafNode(otherlv_10, grammarAccess.getNameAccess().getInKeyword_1_3_0());
                            				
                            // InternalJRule.g:1382:5: ( (lv_Language_11_0= ruleLanguage ) )
                            // InternalJRule.g:1383:6: (lv_Language_11_0= ruleLanguage )
                            {
                            // InternalJRule.g:1383:6: (lv_Language_11_0= ruleLanguage )
                            // InternalJRule.g:1384:7: lv_Language_11_0= ruleLanguage
                            {

                            							newCompositeNode(grammarAccess.getNameAccess().getLanguageLanguageEnumRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_33);
                            lv_Language_11_0=ruleLanguage();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNameRule());
                            							}
                            							set(
                            								current,
                            								"Language",
                            								lv_Language_11_0,
                            								"es.uam.sara.tfg.dsl.JRule.Language");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1402:4: (otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==42) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalJRule.g:1403:5: otherlv_12= 'and type name =' ( (lv_type_13_0= ruleNameType ) )
                            {
                            otherlv_12=(Token)match(input,42,FOLLOW_27); 

                            					newLeafNode(otherlv_12, grammarAccess.getNameAccess().getAndTypeNameKeyword_1_4_0());
                            				
                            // InternalJRule.g:1407:5: ( (lv_type_13_0= ruleNameType ) )
                            // InternalJRule.g:1408:6: (lv_type_13_0= ruleNameType )
                            {
                            // InternalJRule.g:1408:6: (lv_type_13_0= ruleNameType )
                            // InternalJRule.g:1409:7: lv_type_13_0= ruleNameType
                            {

                            							newCompositeNode(grammarAccess.getNameAccess().getTypeNameTypeEnumRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_type_13_0=ruleNameType();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getNameRule());
                            							}
                            							set(
                            								current,
                            								"type",
                            								lv_type_13_0,
                            								"es.uam.sara.tfg.dsl.JRule.NameType");
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
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleJavaDoc"
    // InternalJRule.g:1432:1: entryRuleJavaDoc returns [EObject current=null] : iv_ruleJavaDoc= ruleJavaDoc EOF ;
    public final EObject entryRuleJavaDoc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaDoc = null;


        try {
            // InternalJRule.g:1432:48: (iv_ruleJavaDoc= ruleJavaDoc EOF )
            // InternalJRule.g:1433:2: iv_ruleJavaDoc= ruleJavaDoc EOF
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
    // InternalJRule.g:1439:1: ruleJavaDoc returns [EObject current=null] : ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) ;
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
            // InternalJRule.g:1445:2: ( ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? ) )
            // InternalJRule.g:1446:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            {
            // InternalJRule.g:1446:2: ( () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )? )
            // InternalJRule.g:1447:3: () otherlv_1= 'JavaDoc' ( (lv_author_2_0= '@author' ) )? ( (lv_parametre_3_0= '@parameter' ) )? ( (lv_return_4_0= '@return' ) )? ( (lv_version_5_0= '@version' ) )? ( (lv_throws_6_0= '@throws' ) )? ( (lv_see_7_0= '@see' ) )?
            {
            // InternalJRule.g:1447:3: ()
            // InternalJRule.g:1448:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getJavaDocAccess().getJavaDocAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_34); 

            			newLeafNode(otherlv_1, grammarAccess.getJavaDocAccess().getJavaDocKeyword_1());
            		
            // InternalJRule.g:1458:3: ( (lv_author_2_0= '@author' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==44) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalJRule.g:1459:4: (lv_author_2_0= '@author' )
                    {
                    // InternalJRule.g:1459:4: (lv_author_2_0= '@author' )
                    // InternalJRule.g:1460:5: lv_author_2_0= '@author'
                    {
                    lv_author_2_0=(Token)match(input,44,FOLLOW_35); 

                    					newLeafNode(lv_author_2_0, grammarAccess.getJavaDocAccess().getAuthorAuthorKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "author", true, "@author");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:1472:3: ( (lv_parametre_3_0= '@parameter' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalJRule.g:1473:4: (lv_parametre_3_0= '@parameter' )
                    {
                    // InternalJRule.g:1473:4: (lv_parametre_3_0= '@parameter' )
                    // InternalJRule.g:1474:5: lv_parametre_3_0= '@parameter'
                    {
                    lv_parametre_3_0=(Token)match(input,45,FOLLOW_36); 

                    					newLeafNode(lv_parametre_3_0, grammarAccess.getJavaDocAccess().getParametreParameterKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "parametre", true, "@parameter");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:1486:3: ( (lv_return_4_0= '@return' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalJRule.g:1487:4: (lv_return_4_0= '@return' )
                    {
                    // InternalJRule.g:1487:4: (lv_return_4_0= '@return' )
                    // InternalJRule.g:1488:5: lv_return_4_0= '@return'
                    {
                    lv_return_4_0=(Token)match(input,46,FOLLOW_37); 

                    					newLeafNode(lv_return_4_0, grammarAccess.getJavaDocAccess().getReturnReturnKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "return", true, "@return");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:1500:3: ( (lv_version_5_0= '@version' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==47) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalJRule.g:1501:4: (lv_version_5_0= '@version' )
                    {
                    // InternalJRule.g:1501:4: (lv_version_5_0= '@version' )
                    // InternalJRule.g:1502:5: lv_version_5_0= '@version'
                    {
                    lv_version_5_0=(Token)match(input,47,FOLLOW_38); 

                    					newLeafNode(lv_version_5_0, grammarAccess.getJavaDocAccess().getVersionVersionKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "version", true, "@version");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:1514:3: ( (lv_throws_6_0= '@throws' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==48) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalJRule.g:1515:4: (lv_throws_6_0= '@throws' )
                    {
                    // InternalJRule.g:1515:4: (lv_throws_6_0= '@throws' )
                    // InternalJRule.g:1516:5: lv_throws_6_0= '@throws'
                    {
                    lv_throws_6_0=(Token)match(input,48,FOLLOW_39); 

                    					newLeafNode(lv_throws_6_0, grammarAccess.getJavaDocAccess().getThrowsThrowsKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getJavaDocRule());
                    					}
                    					setWithLastConsumed(current, "throws", true, "@throws");
                    				

                    }


                    }
                    break;

            }

            // InternalJRule.g:1528:3: ( (lv_see_7_0= '@see' ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==49) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalJRule.g:1529:4: (lv_see_7_0= '@see' )
                    {
                    // InternalJRule.g:1529:4: (lv_see_7_0= '@see' )
                    // InternalJRule.g:1530:5: lv_see_7_0= '@see'
                    {
                    lv_see_7_0=(Token)match(input,49,FOLLOW_2); 

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


    // $ANTLR start "entryRuleConteins"
    // InternalJRule.g:1546:1: entryRuleConteins returns [EObject current=null] : iv_ruleConteins= ruleConteins EOF ;
    public final EObject entryRuleConteins() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConteins = null;


        try {
            // InternalJRule.g:1546:49: (iv_ruleConteins= ruleConteins EOF )
            // InternalJRule.g:1547:2: iv_ruleConteins= ruleConteins EOF
            {
             newCompositeNode(grammarAccess.getConteinsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConteins=ruleConteins();

            state._fsp--;

             current =iv_ruleConteins; 
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
    // $ANTLR end "entryRuleConteins"


    // $ANTLR start "ruleConteins"
    // InternalJRule.g:1553:1: ruleConteins returns [EObject current=null] : (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleTesting ) ) otherlv_3= '}' ) ;
    public final EObject ruleConteins() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_which_2_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:1559:2: ( (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleTesting ) ) otherlv_3= '}' ) )
            // InternalJRule.g:1560:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleTesting ) ) otherlv_3= '}' )
            {
            // InternalJRule.g:1560:2: (otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleTesting ) ) otherlv_3= '}' )
            // InternalJRule.g:1561:3: otherlv_0= 'have' otherlv_1= '{' ( (lv_which_2_0= ruleTesting ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getConteinsAccess().getHaveKeyword_0());
            		
            otherlv_1=(Token)match(input,51,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getConteinsAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalJRule.g:1569:3: ( (lv_which_2_0= ruleTesting ) )
            // InternalJRule.g:1570:4: (lv_which_2_0= ruleTesting )
            {
            // InternalJRule.g:1570:4: (lv_which_2_0= ruleTesting )
            // InternalJRule.g:1571:5: lv_which_2_0= ruleTesting
            {

            					newCompositeNode(grammarAccess.getConteinsAccess().getWhichTestingParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_41);
            lv_which_2_0=ruleTesting();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConteinsRule());
            					}
            					set(
            						current,
            						"which",
            						lv_which_2_0,
            						"es.uam.sara.tfg.dsl.JRule.Testing");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,52,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConteinsAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConteins"


    // $ANTLR start "entryRuleModifiers"
    // InternalJRule.g:1596:1: entryRuleModifiers returns [EObject current=null] : iv_ruleModifiers= ruleModifiers EOF ;
    public final EObject entryRuleModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModifiers = null;


        try {
            // InternalJRule.g:1596:50: (iv_ruleModifiers= ruleModifiers EOF )
            // InternalJRule.g:1597:2: iv_ruleModifiers= ruleModifiers EOF
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
    // InternalJRule.g:1603:1: ruleModifiers returns [EObject current=null] : (otherlv_0= 'modifiers: ' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* ) ;
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
            // InternalJRule.g:1609:2: ( (otherlv_0= 'modifiers: ' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* ) )
            // InternalJRule.g:1610:2: (otherlv_0= 'modifiers: ' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* )
            {
            // InternalJRule.g:1610:2: (otherlv_0= 'modifiers: ' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )* )
            // InternalJRule.g:1611:3: otherlv_0= 'modifiers: ' otherlv_1= '(' ( (lv_blend_2_0= ruleBlendModifiers ) ) otherlv_3= ')' (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )*
            {
            otherlv_0=(Token)match(input,53,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getModifiersAccess().getModifiersKeyword_0());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_1());
            		
            // InternalJRule.g:1619:3: ( (lv_blend_2_0= ruleBlendModifiers ) )
            // InternalJRule.g:1620:4: (lv_blend_2_0= ruleBlendModifiers )
            {
            // InternalJRule.g:1620:4: (lv_blend_2_0= ruleBlendModifiers )
            // InternalJRule.g:1621:5: lv_blend_2_0= ruleBlendModifiers
            {

            					newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_13);
            lv_blend_2_0=ruleBlendModifiers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModifiersRule());
            					}
            					add(
            						current,
            						"blend",
            						lv_blend_2_0,
            						"es.uam.sara.tfg.dsl.JRule.BlendModifiers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_3());
            		
            // InternalJRule.g:1642:3: (otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalJRule.g:1643:4: otherlv_4= 'or' otherlv_5= '(' ( (lv_blend_6_0= ruleBlendModifiers ) ) otherlv_7= ')'
            	    {
            	    otherlv_4=(Token)match(input,18,FOLLOW_15); 

            	    				newLeafNode(otherlv_4, grammarAccess.getModifiersAccess().getOrKeyword_4_0());
            	    			
            	    otherlv_5=(Token)match(input,16,FOLLOW_42); 

            	    				newLeafNode(otherlv_5, grammarAccess.getModifiersAccess().getLeftParenthesisKeyword_4_1());
            	    			
            	    // InternalJRule.g:1651:4: ( (lv_blend_6_0= ruleBlendModifiers ) )
            	    // InternalJRule.g:1652:5: (lv_blend_6_0= ruleBlendModifiers )
            	    {
            	    // InternalJRule.g:1652:5: (lv_blend_6_0= ruleBlendModifiers )
            	    // InternalJRule.g:1653:6: lv_blend_6_0= ruleBlendModifiers
            	    {

            	    						newCompositeNode(grammarAccess.getModifiersAccess().getBlendBlendModifiersParserRuleCall_4_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_blend_6_0=ruleBlendModifiers();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getModifiersRule());
            	    						}
            	    						add(
            	    							current,
            	    							"blend",
            	    							lv_blend_6_0,
            	    							"es.uam.sara.tfg.dsl.JRule.BlendModifiers");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_7=(Token)match(input,17,FOLLOW_16); 

            	    				newLeafNode(otherlv_7, grammarAccess.getModifiersAccess().getRightParenthesisKeyword_4_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop27;
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


    // $ANTLR start "entryRuleBlendModifiers"
    // InternalJRule.g:1679:1: entryRuleBlendModifiers returns [EObject current=null] : iv_ruleBlendModifiers= ruleBlendModifiers EOF ;
    public final EObject entryRuleBlendModifiers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlendModifiers = null;


        try {
            // InternalJRule.g:1679:55: (iv_ruleBlendModifiers= ruleBlendModifiers EOF )
            // InternalJRule.g:1680:2: iv_ruleBlendModifiers= ruleBlendModifiers EOF
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
    // InternalJRule.g:1686:1: ruleBlendModifiers returns [EObject current=null] : ( ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? ) | ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? ) | ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? ) | ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? ) | ( (lv_synchronized_14_0= 'synchronized' ) ) ) ;
    public final EObject ruleBlendModifiers() throws RecognitionException {
        EObject current = null;

        Token lv_static_1_0=null;
        Token lv_final_2_0=null;
        Token lv_abstract_3_0=null;
        Token lv_synchronized_4_0=null;
        Token lv_static_5_0=null;
        Token lv_final_6_0=null;
        Token lv_abstract_7_0=null;
        Token lv_synchronized_8_0=null;
        Token lv_final_9_0=null;
        Token lv_abstract_10_0=null;
        Token lv_synchronized_11_0=null;
        Token lv_abstract_12_0=null;
        Token lv_synchronized_13_0=null;
        Token lv_synchronized_14_0=null;
        Enumerator lv_access_0_0 = null;



        	enterRule();

        try {
            // InternalJRule.g:1692:2: ( ( ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? ) | ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? ) | ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? ) | ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? ) | ( (lv_synchronized_14_0= 'synchronized' ) ) ) )
            // InternalJRule.g:1693:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? ) | ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? ) | ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? ) | ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? ) | ( (lv_synchronized_14_0= 'synchronized' ) ) )
            {
            // InternalJRule.g:1693:2: ( ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? ) | ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? ) | ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? ) | ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? ) | ( (lv_synchronized_14_0= 'synchronized' ) ) )
            int alt38=5;
            switch ( input.LA(1) ) {
            case 83:
            case 84:
            case 85:
                {
                alt38=1;
                }
                break;
            case 58:
                {
                alt38=2;
                }
                break;
            case 59:
                {
                alt38=3;
                }
                break;
            case 60:
                {
                alt38=4;
                }
                break;
            case 61:
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
                    // InternalJRule.g:1694:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? )
                    {
                    // InternalJRule.g:1694:3: ( ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )? )
                    // InternalJRule.g:1695:4: ( (lv_access_0_0= ruleAccessModifier ) ) ( (lv_static_1_0= 'and static' ) )? ( (lv_final_2_0= 'and final' ) )? ( (lv_abstract_3_0= 'and abstract' ) )? ( (lv_synchronized_4_0= 'and synchronized' ) )?
                    {
                    // InternalJRule.g:1695:4: ( (lv_access_0_0= ruleAccessModifier ) )
                    // InternalJRule.g:1696:5: (lv_access_0_0= ruleAccessModifier )
                    {
                    // InternalJRule.g:1696:5: (lv_access_0_0= ruleAccessModifier )
                    // InternalJRule.g:1697:6: lv_access_0_0= ruleAccessModifier
                    {

                    						newCompositeNode(grammarAccess.getBlendModifiersAccess().getAccessAccessModifierEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_access_0_0=ruleAccessModifier();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlendModifiersRule());
                    						}
                    						set(
                    							current,
                    							"access",
                    							lv_access_0_0,
                    							"es.uam.sara.tfg.dsl.JRule.AccessModifier");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalJRule.g:1714:4: ( (lv_static_1_0= 'and static' ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==54) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalJRule.g:1715:5: (lv_static_1_0= 'and static' )
                            {
                            // InternalJRule.g:1715:5: (lv_static_1_0= 'and static' )
                            // InternalJRule.g:1716:6: lv_static_1_0= 'and static'
                            {
                            lv_static_1_0=(Token)match(input,54,FOLLOW_44); 

                            						newLeafNode(lv_static_1_0, grammarAccess.getBlendModifiersAccess().getStaticAndStaticKeyword_0_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "static", true, "and static");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1728:4: ( (lv_final_2_0= 'and final' ) )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==55) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalJRule.g:1729:5: (lv_final_2_0= 'and final' )
                            {
                            // InternalJRule.g:1729:5: (lv_final_2_0= 'and final' )
                            // InternalJRule.g:1730:6: lv_final_2_0= 'and final'
                            {
                            lv_final_2_0=(Token)match(input,55,FOLLOW_45); 

                            						newLeafNode(lv_final_2_0, grammarAccess.getBlendModifiersAccess().getFinalAndFinalKeyword_0_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "final", true, "and final");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1742:4: ( (lv_abstract_3_0= 'and abstract' ) )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==56) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalJRule.g:1743:5: (lv_abstract_3_0= 'and abstract' )
                            {
                            // InternalJRule.g:1743:5: (lv_abstract_3_0= 'and abstract' )
                            // InternalJRule.g:1744:6: lv_abstract_3_0= 'and abstract'
                            {
                            lv_abstract_3_0=(Token)match(input,56,FOLLOW_46); 

                            						newLeafNode(lv_abstract_3_0, grammarAccess.getBlendModifiersAccess().getAbstractAndAbstractKeyword_0_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "abstract", true, "and abstract");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1756:4: ( (lv_synchronized_4_0= 'and synchronized' ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==57) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalJRule.g:1757:5: (lv_synchronized_4_0= 'and synchronized' )
                            {
                            // InternalJRule.g:1757:5: (lv_synchronized_4_0= 'and synchronized' )
                            // InternalJRule.g:1758:6: lv_synchronized_4_0= 'and synchronized'
                            {
                            lv_synchronized_4_0=(Token)match(input,57,FOLLOW_2); 

                            						newLeafNode(lv_synchronized_4_0, grammarAccess.getBlendModifiersAccess().getSynchronizedAndSynchronizedKeyword_0_4_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "synchronized", true, "and synchronized");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:1772:3: ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? )
                    {
                    // InternalJRule.g:1772:3: ( ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )? )
                    // InternalJRule.g:1773:4: ( (lv_static_5_0= 'static' ) ) ( (lv_final_6_0= 'and final' ) )? ( (lv_abstract_7_0= 'and abstract' ) )? ( (lv_synchronized_8_0= 'and synchronized' ) )?
                    {
                    // InternalJRule.g:1773:4: ( (lv_static_5_0= 'static' ) )
                    // InternalJRule.g:1774:5: (lv_static_5_0= 'static' )
                    {
                    // InternalJRule.g:1774:5: (lv_static_5_0= 'static' )
                    // InternalJRule.g:1775:6: lv_static_5_0= 'static'
                    {
                    lv_static_5_0=(Token)match(input,58,FOLLOW_44); 

                    						newLeafNode(lv_static_5_0, grammarAccess.getBlendModifiersAccess().getStaticStaticKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "static", true, "static");
                    					

                    }


                    }

                    // InternalJRule.g:1787:4: ( (lv_final_6_0= 'and final' ) )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==55) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalJRule.g:1788:5: (lv_final_6_0= 'and final' )
                            {
                            // InternalJRule.g:1788:5: (lv_final_6_0= 'and final' )
                            // InternalJRule.g:1789:6: lv_final_6_0= 'and final'
                            {
                            lv_final_6_0=(Token)match(input,55,FOLLOW_45); 

                            						newLeafNode(lv_final_6_0, grammarAccess.getBlendModifiersAccess().getFinalAndFinalKeyword_1_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "final", true, "and final");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1801:4: ( (lv_abstract_7_0= 'and abstract' ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==56) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalJRule.g:1802:5: (lv_abstract_7_0= 'and abstract' )
                            {
                            // InternalJRule.g:1802:5: (lv_abstract_7_0= 'and abstract' )
                            // InternalJRule.g:1803:6: lv_abstract_7_0= 'and abstract'
                            {
                            lv_abstract_7_0=(Token)match(input,56,FOLLOW_46); 

                            						newLeafNode(lv_abstract_7_0, grammarAccess.getBlendModifiersAccess().getAbstractAndAbstractKeyword_1_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "abstract", true, "and abstract");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1815:4: ( (lv_synchronized_8_0= 'and synchronized' ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==57) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // InternalJRule.g:1816:5: (lv_synchronized_8_0= 'and synchronized' )
                            {
                            // InternalJRule.g:1816:5: (lv_synchronized_8_0= 'and synchronized' )
                            // InternalJRule.g:1817:6: lv_synchronized_8_0= 'and synchronized'
                            {
                            lv_synchronized_8_0=(Token)match(input,57,FOLLOW_2); 

                            						newLeafNode(lv_synchronized_8_0, grammarAccess.getBlendModifiersAccess().getSynchronizedAndSynchronizedKeyword_1_3_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "synchronized", true, "and synchronized");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalJRule.g:1831:3: ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? )
                    {
                    // InternalJRule.g:1831:3: ( ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )? )
                    // InternalJRule.g:1832:4: ( (lv_final_9_0= 'final' ) ) ( (lv_abstract_10_0= 'and abstract' ) )? ( (lv_synchronized_11_0= 'and synchronized' ) )?
                    {
                    // InternalJRule.g:1832:4: ( (lv_final_9_0= 'final' ) )
                    // InternalJRule.g:1833:5: (lv_final_9_0= 'final' )
                    {
                    // InternalJRule.g:1833:5: (lv_final_9_0= 'final' )
                    // InternalJRule.g:1834:6: lv_final_9_0= 'final'
                    {
                    lv_final_9_0=(Token)match(input,59,FOLLOW_45); 

                    						newLeafNode(lv_final_9_0, grammarAccess.getBlendModifiersAccess().getFinalFinalKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "final", true, "final");
                    					

                    }


                    }

                    // InternalJRule.g:1846:4: ( (lv_abstract_10_0= 'and abstract' ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==56) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalJRule.g:1847:5: (lv_abstract_10_0= 'and abstract' )
                            {
                            // InternalJRule.g:1847:5: (lv_abstract_10_0= 'and abstract' )
                            // InternalJRule.g:1848:6: lv_abstract_10_0= 'and abstract'
                            {
                            lv_abstract_10_0=(Token)match(input,56,FOLLOW_46); 

                            						newLeafNode(lv_abstract_10_0, grammarAccess.getBlendModifiersAccess().getAbstractAndAbstractKeyword_2_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "abstract", true, "and abstract");
                            					

                            }


                            }
                            break;

                    }

                    // InternalJRule.g:1860:4: ( (lv_synchronized_11_0= 'and synchronized' ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==57) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalJRule.g:1861:5: (lv_synchronized_11_0= 'and synchronized' )
                            {
                            // InternalJRule.g:1861:5: (lv_synchronized_11_0= 'and synchronized' )
                            // InternalJRule.g:1862:6: lv_synchronized_11_0= 'and synchronized'
                            {
                            lv_synchronized_11_0=(Token)match(input,57,FOLLOW_2); 

                            						newLeafNode(lv_synchronized_11_0, grammarAccess.getBlendModifiersAccess().getSynchronizedAndSynchronizedKeyword_2_2_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "synchronized", true, "and synchronized");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalJRule.g:1876:3: ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? )
                    {
                    // InternalJRule.g:1876:3: ( ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )? )
                    // InternalJRule.g:1877:4: ( (lv_abstract_12_0= 'abstract' ) ) ( (lv_synchronized_13_0= 'and synchronized' ) )?
                    {
                    // InternalJRule.g:1877:4: ( (lv_abstract_12_0= 'abstract' ) )
                    // InternalJRule.g:1878:5: (lv_abstract_12_0= 'abstract' )
                    {
                    // InternalJRule.g:1878:5: (lv_abstract_12_0= 'abstract' )
                    // InternalJRule.g:1879:6: lv_abstract_12_0= 'abstract'
                    {
                    lv_abstract_12_0=(Token)match(input,60,FOLLOW_46); 

                    						newLeafNode(lv_abstract_12_0, grammarAccess.getBlendModifiersAccess().getAbstractAbstractKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBlendModifiersRule());
                    						}
                    						setWithLastConsumed(current, "abstract", true, "abstract");
                    					

                    }


                    }

                    // InternalJRule.g:1891:4: ( (lv_synchronized_13_0= 'and synchronized' ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==57) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalJRule.g:1892:5: (lv_synchronized_13_0= 'and synchronized' )
                            {
                            // InternalJRule.g:1892:5: (lv_synchronized_13_0= 'and synchronized' )
                            // InternalJRule.g:1893:6: lv_synchronized_13_0= 'and synchronized'
                            {
                            lv_synchronized_13_0=(Token)match(input,57,FOLLOW_2); 

                            						newLeafNode(lv_synchronized_13_0, grammarAccess.getBlendModifiersAccess().getSynchronizedAndSynchronizedKeyword_3_1_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getBlendModifiersRule());
                            						}
                            						setWithLastConsumed(current, "synchronized", true, "and synchronized");
                            					

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalJRule.g:1907:3: ( (lv_synchronized_14_0= 'synchronized' ) )
                    {
                    // InternalJRule.g:1907:3: ( (lv_synchronized_14_0= 'synchronized' ) )
                    // InternalJRule.g:1908:4: (lv_synchronized_14_0= 'synchronized' )
                    {
                    // InternalJRule.g:1908:4: (lv_synchronized_14_0= 'synchronized' )
                    // InternalJRule.g:1909:5: lv_synchronized_14_0= 'synchronized'
                    {
                    lv_synchronized_14_0=(Token)match(input,61,FOLLOW_2); 

                    					newLeafNode(lv_synchronized_14_0, grammarAccess.getBlendModifiersAccess().getSynchronizedSynchronizedKeyword_4_0());
                    				

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


    // $ANTLR start "entryRuleEBigInteger"
    // InternalJRule.g:1925:1: entryRuleEBigInteger returns [String current=null] : iv_ruleEBigInteger= ruleEBigInteger EOF ;
    public final String entryRuleEBigInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBigInteger = null;


        try {
            // InternalJRule.g:1925:51: (iv_ruleEBigInteger= ruleEBigInteger EOF )
            // InternalJRule.g:1926:2: iv_ruleEBigInteger= ruleEBigInteger EOF
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
    // InternalJRule.g:1932:1: ruleEBigInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEBigInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1938:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalJRule.g:1939:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalJRule.g:1939:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalJRule.g:1940:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalJRule.g:1940:3: (kw= '-' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==62) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalJRule.g:1941:4: kw= '-'
                    {
                    kw=(Token)match(input,62,FOLLOW_47); 

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


    // $ANTLR start "entryRuleEString"
    // InternalJRule.g:1958:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalJRule.g:1958:47: (iv_ruleEString= ruleEString EOF )
            // InternalJRule.g:1959:2: iv_ruleEString= ruleEString EOF
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
    // InternalJRule.g:1965:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1971:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalJRule.g:1972:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalJRule.g:1972:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalJRule.g:1973:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalJRule.g:1981:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleAction"
    // InternalJRule.g:1992:1: ruleAction returns [Enumerator current=null] : ( (enumLiteral_0= 'check' ) | (enumLiteral_1= 'correct' ) ) ;
    public final Enumerator ruleAction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRule.g:1998:2: ( ( (enumLiteral_0= 'check' ) | (enumLiteral_1= 'correct' ) ) )
            // InternalJRule.g:1999:2: ( (enumLiteral_0= 'check' ) | (enumLiteral_1= 'correct' ) )
            {
            // InternalJRule.g:1999:2: ( (enumLiteral_0= 'check' ) | (enumLiteral_1= 'correct' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            else if ( (LA41_0==64) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalJRule.g:2000:3: (enumLiteral_0= 'check' )
                    {
                    // InternalJRule.g:2000:3: (enumLiteral_0= 'check' )
                    // InternalJRule.g:2001:4: enumLiteral_0= 'check'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCheckEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getActionAccess().getCheckEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2008:3: (enumLiteral_1= 'correct' )
                    {
                    // InternalJRule.g:2008:3: (enumLiteral_1= 'correct' )
                    // InternalJRule.g:2009:4: enumLiteral_1= 'correct'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getActionAccess().getCorrectEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getActionAccess().getCorrectEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "ruleQuantifier"
    // InternalJRule.g:2019:1: ruleQuantifier returns [Enumerator current=null] : ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) ;
    public final Enumerator ruleQuantifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRule.g:2025:2: ( ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) ) )
            // InternalJRule.g:2026:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            {
            // InternalJRule.g:2026:2: ( (enumLiteral_0= 'one' ) | (enumLiteral_1= 'exists' ) | (enumLiteral_2= 'all' ) )
            int alt42=3;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalJRule.g:2027:3: (enumLiteral_0= 'one' )
                    {
                    // InternalJRule.g:2027:3: (enumLiteral_0= 'one' )
                    // InternalJRule.g:2028:4: enumLiteral_0= 'one'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getQuantifierAccess().getOneEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2035:3: (enumLiteral_1= 'exists' )
                    {
                    // InternalJRule.g:2035:3: (enumLiteral_1= 'exists' )
                    // InternalJRule.g:2036:4: enumLiteral_1= 'exists'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getQuantifierAccess().getExistsEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRule.g:2043:3: (enumLiteral_2= 'all' )
                    {
                    // InternalJRule.g:2043:3: (enumLiteral_2= 'all' )
                    // InternalJRule.g:2044:4: enumLiteral_2= 'all'
                    {
                    enumLiteral_2=(Token)match(input,67,FOLLOW_2); 

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
    // InternalJRule.g:2054:1: ruleElementJava returns [Enumerator current=null] : ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'interface' ) | (enumLiteral_3= 'enum' ) | (enumLiteral_4= 'method' ) | (enumLiteral_5= 'attribute' ) ) ;
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
            // InternalJRule.g:2060:2: ( ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'interface' ) | (enumLiteral_3= 'enum' ) | (enumLiteral_4= 'method' ) | (enumLiteral_5= 'attribute' ) ) )
            // InternalJRule.g:2061:2: ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'interface' ) | (enumLiteral_3= 'enum' ) | (enumLiteral_4= 'method' ) | (enumLiteral_5= 'attribute' ) )
            {
            // InternalJRule.g:2061:2: ( (enumLiteral_0= 'package' ) | (enumLiteral_1= 'class' ) | (enumLiteral_2= 'interface' ) | (enumLiteral_3= 'enum' ) | (enumLiteral_4= 'method' ) | (enumLiteral_5= 'attribute' ) )
            int alt43=6;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt43=1;
                }
                break;
            case 69:
                {
                alt43=2;
                }
                break;
            case 70:
                {
                alt43=3;
                }
                break;
            case 71:
                {
                alt43=4;
                }
                break;
            case 72:
                {
                alt43=5;
                }
                break;
            case 73:
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
                    // InternalJRule.g:2062:3: (enumLiteral_0= 'package' )
                    {
                    // InternalJRule.g:2062:3: (enumLiteral_0= 'package' )
                    // InternalJRule.g:2063:4: enumLiteral_0= 'package'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getElementJavaAccess().getPackageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2070:3: (enumLiteral_1= 'class' )
                    {
                    // InternalJRule.g:2070:3: (enumLiteral_1= 'class' )
                    // InternalJRule.g:2071:4: enumLiteral_1= 'class'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getElementJavaAccess().getClassEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRule.g:2078:3: (enumLiteral_2= 'interface' )
                    {
                    // InternalJRule.g:2078:3: (enumLiteral_2= 'interface' )
                    // InternalJRule.g:2079:4: enumLiteral_2= 'interface'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getElementJavaAccess().getInterfaceEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRule.g:2086:3: (enumLiteral_3= 'enum' )
                    {
                    // InternalJRule.g:2086:3: (enumLiteral_3= 'enum' )
                    // InternalJRule.g:2087:4: enumLiteral_3= 'enum'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getElementJavaAccess().getEnumEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRule.g:2094:3: (enumLiteral_4= 'method' )
                    {
                    // InternalJRule.g:2094:3: (enumLiteral_4= 'method' )
                    // InternalJRule.g:2095:4: enumLiteral_4= 'method'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getElementJavaAccess().getMethodEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalJRule.g:2102:3: (enumLiteral_5= 'attribute' )
                    {
                    // InternalJRule.g:2102:3: (enumLiteral_5= 'attribute' )
                    // InternalJRule.g:2103:4: enumLiteral_5= 'attribute'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

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
    // InternalJRule.g:2113:1: ruleNameType returns [Enumerator current=null] : ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) ;
    public final Enumerator ruleNameType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalJRule.g:2119:2: ( ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) ) )
            // InternalJRule.g:2120:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            {
            // InternalJRule.g:2120:2: ( (enumLiteral_0= 'upperCase' ) | (enumLiteral_1= 'lowerCase' ) | (enumLiteral_2= 'upperCamelCase' ) | (enumLiteral_3= 'lowerCamelCase' ) | (enumLiteral_4= 'startUpperCase' ) )
            int alt44=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt44=1;
                }
                break;
            case 75:
                {
                alt44=2;
                }
                break;
            case 76:
                {
                alt44=3;
                }
                break;
            case 77:
                {
                alt44=4;
                }
                break;
            case 78:
                {
                alt44=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalJRule.g:2121:3: (enumLiteral_0= 'upperCase' )
                    {
                    // InternalJRule.g:2121:3: (enumLiteral_0= 'upperCase' )
                    // InternalJRule.g:2122:4: enumLiteral_0= 'upperCase'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameTypeAccess().getUpperCaseEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2129:3: (enumLiteral_1= 'lowerCase' )
                    {
                    // InternalJRule.g:2129:3: (enumLiteral_1= 'lowerCase' )
                    // InternalJRule.g:2130:4: enumLiteral_1= 'lowerCase'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNameTypeAccess().getLowerCaseEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRule.g:2137:3: (enumLiteral_2= 'upperCamelCase' )
                    {
                    // InternalJRule.g:2137:3: (enumLiteral_2= 'upperCamelCase' )
                    // InternalJRule.g:2138:4: enumLiteral_2= 'upperCamelCase'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getNameTypeAccess().getUpperCamelCaseEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalJRule.g:2145:3: (enumLiteral_3= 'lowerCamelCase' )
                    {
                    // InternalJRule.g:2145:3: (enumLiteral_3= 'lowerCamelCase' )
                    // InternalJRule.g:2146:4: enumLiteral_3= 'lowerCamelCase'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getNameTypeAccess().getLowerCamelCaseEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalJRule.g:2153:3: (enumLiteral_4= 'startUpperCase' )
                    {
                    // InternalJRule.g:2153:3: (enumLiteral_4= 'startUpperCase' )
                    // InternalJRule.g:2154:4: enumLiteral_4= 'startUpperCase'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); 

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
    // InternalJRule.g:2164:1: ruleNameOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) ) ;
    public final Enumerator ruleNameOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRule.g:2170:2: ( ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) ) )
            // InternalJRule.g:2171:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) )
            {
            // InternalJRule.g:2171:2: ( (enumLiteral_0= 'like' ) | (enumLiteral_1= 'equal' ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==79) ) {
                alt45=1;
            }
            else if ( (LA45_0==80) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalJRule.g:2172:3: (enumLiteral_0= 'like' )
                    {
                    // InternalJRule.g:2172:3: (enumLiteral_0= 'like' )
                    // InternalJRule.g:2173:4: enumLiteral_0= 'like'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNameOperatorAccess().getLikeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2180:3: (enumLiteral_1= 'equal' )
                    {
                    // InternalJRule.g:2180:3: (enumLiteral_1= 'equal' )
                    // InternalJRule.g:2181:4: enumLiteral_1= 'equal'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); 

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
    // InternalJRule.g:2191:1: ruleLanguage returns [Enumerator current=null] : ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) ;
    public final Enumerator ruleLanguage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalJRule.g:2197:2: ( ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) ) )
            // InternalJRule.g:2198:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            {
            // InternalJRule.g:2198:2: ( (enumLiteral_0= 'English' ) | (enumLiteral_1= 'Spanish' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==81) ) {
                alt46=1;
            }
            else if ( (LA46_0==82) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalJRule.g:2199:3: (enumLiteral_0= 'English' )
                    {
                    // InternalJRule.g:2199:3: (enumLiteral_0= 'English' )
                    // InternalJRule.g:2200:4: enumLiteral_0= 'English'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLanguageAccess().getENGLISHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2207:3: (enumLiteral_1= 'Spanish' )
                    {
                    // InternalJRule.g:2207:3: (enumLiteral_1= 'Spanish' )
                    // InternalJRule.g:2208:4: enumLiteral_1= 'Spanish'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_2); 

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
    // InternalJRule.g:2218:1: ruleAccessModifier returns [Enumerator current=null] : ( (enumLiteral_0= 'Public' ) | (enumLiteral_1= 'Protected' ) | (enumLiteral_2= 'Private' ) ) ;
    public final Enumerator ruleAccessModifier() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalJRule.g:2224:2: ( ( (enumLiteral_0= 'Public' ) | (enumLiteral_1= 'Protected' ) | (enumLiteral_2= 'Private' ) ) )
            // InternalJRule.g:2225:2: ( (enumLiteral_0= 'Public' ) | (enumLiteral_1= 'Protected' ) | (enumLiteral_2= 'Private' ) )
            {
            // InternalJRule.g:2225:2: ( (enumLiteral_0= 'Public' ) | (enumLiteral_1= 'Protected' ) | (enumLiteral_2= 'Private' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt47=1;
                }
                break;
            case 84:
                {
                alt47=2;
                }
                break;
            case 85:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalJRule.g:2226:3: (enumLiteral_0= 'Public' )
                    {
                    // InternalJRule.g:2226:3: (enumLiteral_0= 'Public' )
                    // InternalJRule.g:2227:4: enumLiteral_0= 'Public'
                    {
                    enumLiteral_0=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAccessModifierAccess().getPublicEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalJRule.g:2234:3: (enumLiteral_1= 'Protected' )
                    {
                    // InternalJRule.g:2234:3: (enumLiteral_1= 'Protected' )
                    // InternalJRule.g:2235:4: enumLiteral_1= 'Protected'
                    {
                    enumLiteral_1=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAccessModifierAccess().getProtectedEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalJRule.g:2242:3: (enumLiteral_2= 'Private' )
                    {
                    // InternalJRule.g:2242:3: (enumLiteral_2= 'Private' )
                    // InternalJRule.g:2243:4: enumLiteral_2= 'Private'
                    {
                    enumLiteral_2=(Token)match(input,85,FOLLOW_2); 

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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L,0x000000000000000EL});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x00000000000003F0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00240A7E47510000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00240A7E47500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x4000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000007C00L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000018000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000060000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003F00000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003E00000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0003800000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x3C00000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x03C0000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000010L});

}