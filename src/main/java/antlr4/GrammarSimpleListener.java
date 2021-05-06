// Generated from /home/vadbeg/Projects/University/compilers/simple-compiler/src/main/java/antlr4/GrammarSimple.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarSimpleParser}.
 */
public interface GrammarSimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarSimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarSimpleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void enterModuleName(GrammarSimpleParser.ModuleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#moduleName}.
	 * @param ctx the parse tree
	 */
	void exitModuleName(GrammarSimpleParser.ModuleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(GrammarSimpleParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(GrammarSimpleParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarSimpleParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarSimpleParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#attributs}.
	 * @param ctx the parse tree
	 */
	void enterAttributs(GrammarSimpleParser.AttributsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#attributs}.
	 * @param ctx the parse tree
	 */
	void exitAttributs(GrammarSimpleParser.AttributsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#callAttributs}.
	 * @param ctx the parse tree
	 */
	void enterCallAttributs(GrammarSimpleParser.CallAttributsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#callAttributs}.
	 * @param ctx the parse tree
	 */
	void exitCallAttributs(GrammarSimpleParser.CallAttributsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(GrammarSimpleParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(GrammarSimpleParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void enterCallFunction(GrammarSimpleParser.CallFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#callFunction}.
	 * @param ctx the parse tree
	 */
	void exitCallFunction(GrammarSimpleParser.CallFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#ifFunc}.
	 * @param ctx the parse tree
	 */
	void enterIfFunc(GrammarSimpleParser.IfFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#ifFunc}.
	 * @param ctx the parse tree
	 */
	void exitIfFunc(GrammarSimpleParser.IfFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#bodyFunc}.
	 * @param ctx the parse tree
	 */
	void enterBodyFunc(GrammarSimpleParser.BodyFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#bodyFunc}.
	 * @param ctx the parse tree
	 */
	void exitBodyFunc(GrammarSimpleParser.BodyFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#thenFunc}.
	 * @param ctx the parse tree
	 */
	void enterThenFunc(GrammarSimpleParser.ThenFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#thenFunc}.
	 * @param ctx the parse tree
	 */
	void exitThenFunc(GrammarSimpleParser.ThenFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#elseFunc}.
	 * @param ctx the parse tree
	 */
	void enterElseFunc(GrammarSimpleParser.ElseFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#elseFunc}.
	 * @param ctx the parse tree
	 */
	void exitElseFunc(GrammarSimpleParser.ElseFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#forFunc}.
	 * @param ctx the parse tree
	 */
	void enterForFunc(GrammarSimpleParser.ForFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#forFunc}.
	 * @param ctx the parse tree
	 */
	void exitForFunc(GrammarSimpleParser.ForFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturn(GrammarSimpleParser.FunctionReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#functionReturn}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturn(GrammarSimpleParser.FunctionReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#callProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCallProcedure(GrammarSimpleParser.CallProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#callProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCallProcedure(GrammarSimpleParser.CallProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#bodyProc}.
	 * @param ctx the parse tree
	 */
	void enterBodyProc(GrammarSimpleParser.BodyProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#bodyProc}.
	 * @param ctx the parse tree
	 */
	void exitBodyProc(GrammarSimpleParser.BodyProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#ifProc}.
	 * @param ctx the parse tree
	 */
	void enterIfProc(GrammarSimpleParser.IfProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#ifProc}.
	 * @param ctx the parse tree
	 */
	void exitIfProc(GrammarSimpleParser.IfProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#thenProc}.
	 * @param ctx the parse tree
	 */
	void enterThenProc(GrammarSimpleParser.ThenProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#thenProc}.
	 * @param ctx the parse tree
	 */
	void exitThenProc(GrammarSimpleParser.ThenProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#elseProc}.
	 * @param ctx the parse tree
	 */
	void enterElseProc(GrammarSimpleParser.ElseProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#elseProc}.
	 * @param ctx the parse tree
	 */
	void exitElseProc(GrammarSimpleParser.ElseProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#forProc}.
	 * @param ctx the parse tree
	 */
	void enterForProc(GrammarSimpleParser.ForProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#forProc}.
	 * @param ctx the parse tree
	 */
	void exitForProc(GrammarSimpleParser.ForProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(GrammarSimpleParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(GrammarSimpleParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#conditionFor}.
	 * @param ctx the parse tree
	 */
	void enterConditionFor(GrammarSimpleParser.ConditionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#conditionFor}.
	 * @param ctx the parse tree
	 */
	void exitConditionFor(GrammarSimpleParser.ConditionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(GrammarSimpleParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(GrammarSimpleParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(GrammarSimpleParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(GrammarSimpleParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#ass}.
	 * @param ctx the parse tree
	 */
	void enterAss(GrammarSimpleParser.AssContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#ass}.
	 * @param ctx the parse tree
	 */
	void exitAss(GrammarSimpleParser.AssContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#summOperation}.
	 * @param ctx the parse tree
	 */
	void enterSummOperation(GrammarSimpleParser.SummOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#summOperation}.
	 * @param ctx the parse tree
	 */
	void exitSummOperation(GrammarSimpleParser.SummOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#diffOperation}.
	 * @param ctx the parse tree
	 */
	void enterDiffOperation(GrammarSimpleParser.DiffOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#diffOperation}.
	 * @param ctx the parse tree
	 */
	void exitDiffOperation(GrammarSimpleParser.DiffOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#multOperation}.
	 * @param ctx the parse tree
	 */
	void enterMultOperation(GrammarSimpleParser.MultOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#multOperation}.
	 * @param ctx the parse tree
	 */
	void exitMultOperation(GrammarSimpleParser.MultOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#divOperation}.
	 * @param ctx the parse tree
	 */
	void enterDivOperation(GrammarSimpleParser.DivOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#divOperation}.
	 * @param ctx the parse tree
	 */
	void exitDivOperation(GrammarSimpleParser.DivOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#inPowOperation}.
	 * @param ctx the parse tree
	 */
	void enterInPowOperation(GrammarSimpleParser.InPowOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#inPowOperation}.
	 * @param ctx the parse tree
	 */
	void exitInPowOperation(GrammarSimpleParser.InPowOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#summ}.
	 * @param ctx the parse tree
	 */
	void enterSumm(GrammarSimpleParser.SummContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#summ}.
	 * @param ctx the parse tree
	 */
	void exitSumm(GrammarSimpleParser.SummContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#diff}.
	 * @param ctx the parse tree
	 */
	void enterDiff(GrammarSimpleParser.DiffContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#diff}.
	 * @param ctx the parse tree
	 */
	void exitDiff(GrammarSimpleParser.DiffContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void enterMult(GrammarSimpleParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#mult}.
	 * @param ctx the parse tree
	 */
	void exitMult(GrammarSimpleParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(GrammarSimpleParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(GrammarSimpleParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#inPow}.
	 * @param ctx the parse tree
	 */
	void enterInPow(GrammarSimpleParser.InPowContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#inPow}.
	 * @param ctx the parse tree
	 */
	void exitInPow(GrammarSimpleParser.InPowContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarSimpleParser#inSqrt}.
	 * @param ctx the parse tree
	 */
	void enterInSqrt(GrammarSimpleParser.InSqrtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarSimpleParser#inSqrt}.
	 * @param ctx the parse tree
	 */
	void exitInSqrt(GrammarSimpleParser.InSqrtContext ctx);
}