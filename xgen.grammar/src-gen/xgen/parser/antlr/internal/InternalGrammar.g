/*
* generated by Xtext
*/
grammar InternalGrammar;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package xgen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package xgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xgen.services.GrammarGrammarAccess;

}

@parser::members {

 	private GrammarGrammarAccess grammarAccess;
 	
    public InternalGrammarParser(TokenStream input, GrammarGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Grammar";	
   	}
   	
   	@Override
   	protected GrammarGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleGrammar
entryRuleGrammar returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getGrammarRule()); }
	 iv_ruleGrammar=ruleGrammar 
	 { $current=$iv_ruleGrammar.current; } 
	 EOF 
;

// Rule Grammar
ruleGrammar returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getGrammarAccess().getGrammarAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getGrammarAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
	    }
		lv_definitions_1_0=ruleDefinition		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getGrammarRule());
	        }
       		add(
       			$current, 
       			"definitions",
        		lv_definitions_1_0, 
        		"Definition");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	 iv_ruleDefinition=ruleDefinition 
	 { $current=$iv_ruleDefinition.current; } 
	 EOF 
;

// Rule Definition
ruleDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getDefinitionAccess().getDefinitionAction_0(),
            $current);
    }
)(
(
		lv_lexical_1_0=	'lexical' 
    {
        newLeafNode(lv_lexical_1_0, grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefinitionRule());
	        }
       		setWithLastConsumed($current, "lexical", true, "lexical");
	    }

)
)?(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDefinitionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getColonKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
	    }
		lv_rhs_4_0=ruleConstruct0		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDefinitionRule());
	        }
       		set(
       			$current, 
       			"rhs",
        		lv_rhs_4_0, 
        		"Construct0");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleConstruct0
entryRuleConstruct0 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstruct0Rule()); }
	 iv_ruleConstruct0=ruleConstruct0 
	 { $current=$iv_ruleConstruct0.current; } 
	 EOF 
;

// Rule Construct0
ruleConstruct0 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
    }
    this_Construct1_0=ruleConstruct1
    { 
        $current = $this_Construct1_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0(),
            $current);
    }
)	otherlv_2='|' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
	    }
		lv_operands_3_0=ruleConstruct1		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstruct0Rule());
	        }
       		add(
       			$current, 
       			"operands",
        		lv_operands_3_0, 
        		"Construct1");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_4='|' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
	    }
		lv_operands_5_0=ruleConstruct1		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstruct0Rule());
	        }
       		add(
       			$current, 
       			"operands",
        		lv_operands_5_0, 
        		"Construct1");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?)
;





// Entry rule entryRuleConstruct1
entryRuleConstruct1 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstruct1Rule()); }
	 iv_ruleConstruct1=ruleConstruct1 
	 { $current=$iv_ruleConstruct1.current; } 
	 EOF 
;

// Rule Construct1
ruleConstruct1 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
    }
    this_Construct2_0=ruleConstruct2
    { 
        $current = $this_Construct2_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndAdd(
            grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
	    }
		lv_operands_2_0=ruleConstruct2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstruct1Rule());
	        }
       		add(
       			$current, 
       			"operands",
        		lv_operands_2_0, 
        		"Construct2");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
	    }
		lv_operands_3_0=ruleConstruct2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstruct1Rule());
	        }
       		add(
       			$current, 
       			"operands",
        		lv_operands_3_0, 
        		"Construct2");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?)
;





// Entry rule entryRuleConstruct2
entryRuleConstruct2 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstruct2Rule()); }
	 iv_ruleConstruct2=ruleConstruct2 
	 { $current=$iv_ruleConstruct2.current; } 
	 EOF 
;

// Rule Construct2
ruleConstruct2 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstruct2Access().getNotAction_0_0(),
            $current);
    }
)	otherlv_1='!' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
	    }
		lv_operand_2_0=ruleConstruct2		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConstruct2Rule());
	        }
       		set(
       			$current, 
       			"operand",
        		lv_operand_2_0, 
        		"Construct2");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_1()); 
    }
    this_Construct3_3=ruleConstruct3
    { 
        $current = $this_Construct3_3.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleConstruct3
entryRuleConstruct3 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstruct3Rule()); }
	 iv_ruleConstruct3=ruleConstruct3 
	 { $current=$iv_ruleConstruct3.current; } 
	 EOF 
;

// Rule Construct3
ruleConstruct3 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
    }
    this_Construct4_0=ruleConstruct4
    { 
        $current = $this_Construct4_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0(),
            $current);
    }
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1());
    }
(
(
		lv_min_3_0=RULE_INT
		{
			newLeafNode(lv_min_3_0, grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct3Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"min",
        		lv_min_3_0, 
        		"INT");
	    }

)
)((
(
		lv_upperBounded_4_0=	',' 
    {
        newLeafNode(lv_upperBounded_4_0, grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct3Rule());
	        }
       		setWithLastConsumed($current, "upperBounded", true, ",");
	    }

)
)(
(
		lv_max_5_0=RULE_INT
		{
			newLeafNode(lv_max_5_0, grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct3Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_5_0, 
        		"INT");
	    }

)
))?	otherlv_6='}' 
    {
    	newLeafNode(otherlv_6, grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4());
    }
)*)
;





// Entry rule entryRuleConstruct4
entryRuleConstruct4 returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConstruct4Rule()); }
	 iv_ruleConstruct4=ruleConstruct4 
	 { $current=$iv_ruleConstruct4.current; } 
	 EOF 
;

// Rule Construct4
ruleConstruct4 returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstruct4Access().getReferenceAction_0_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct4Rule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getConstruct4Access().getTargetDefinitionCrossReference_0_1_0()); 
	}

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstruct4Access().getRangeAction_1_0(),
            $current);
    }
)(
(
		lv_min_3_0=RULE_CHAR
		{
			newLeafNode(lv_min_3_0, grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct4Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"min",
        		lv_min_3_0, 
        		"CHAR");
	    }

)
)	otherlv_4='..' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getConstruct4Access().getFullStopFullStopKeyword_1_2());
    }
(
(
		lv_max_5_0=RULE_CHAR
		{
			newLeafNode(lv_max_5_0, grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_1_3_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct4Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"max",
        		lv_max_5_0, 
        		"CHAR");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstruct4Access().getKeywordAction_2_0(),
            $current);
    }
)(
(
		lv_value_7_0=RULE_STRING
		{
			newLeafNode(lv_value_7_0, grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConstruct4Rule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_7_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getConstruct4Access().getAnyAction_3_0(),
            $current);
    }
)	otherlv_9='.' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getConstruct4Access().getFullStopKeyword_3_1());
    }
)
    |(	otherlv_10='(' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0());
    }

    { 
        newCompositeNode(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
    }
    this_Construct0_11=ruleConstruct0
    { 
        $current = $this_Construct0_11.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_12=')' 
    {
    	newLeafNode(otherlv_12, grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2());
    }
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

RULE_CHAR : '\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\''))) '\'';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


