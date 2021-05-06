// Generated from /home/vadbeg/Projects/University/compilers/simple-compiler/src/main/java/antlr4/GrammarSimple.g4 by ANTLR 4.9.1
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarSimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarSimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarSimpleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#moduleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleName(GrammarSimpleParser.ModuleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(GrammarSimpleParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarSimpleParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#attributs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributs(GrammarSimpleParser.AttributsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#callAttributs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAttributs(GrammarSimpleParser.CallAttributsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GrammarSimpleParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#callFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunction(GrammarSimpleParser.CallFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#ifFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfFunc(GrammarSimpleParser.IfFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#bodyFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyFunc(GrammarSimpleParser.BodyFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#thenFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenFunc(GrammarSimpleParser.ThenFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#elseFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseFunc(GrammarSimpleParser.ElseFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#forFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForFunc(GrammarSimpleParser.ForFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#functionReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturn(GrammarSimpleParser.FunctionReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#callProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallProcedure(GrammarSimpleParser.CallProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#bodyProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyProc(GrammarSimpleParser.BodyProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#ifProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfProc(GrammarSimpleParser.IfProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#thenProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenProc(GrammarSimpleParser.ThenProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#elseProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseProc(GrammarSimpleParser.ElseProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#forProc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForProc(GrammarSimpleParser.ForProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(GrammarSimpleParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#conditionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionFor(GrammarSimpleParser.ConditionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#math}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMath(GrammarSimpleParser.MathContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(GrammarSimpleParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#ass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAss(GrammarSimpleParser.AssContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#summOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSummOperation(GrammarSimpleParser.SummOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#diffOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiffOperation(GrammarSimpleParser.DiffOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#multOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultOperation(GrammarSimpleParser.MultOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#divOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivOperation(GrammarSimpleParser.DivOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#inPowOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPowOperation(GrammarSimpleParser.InPowOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#summ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumm(GrammarSimpleParser.SummContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#diff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiff(GrammarSimpleParser.DiffContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#mult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(GrammarSimpleParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(GrammarSimpleParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#inPow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPow(GrammarSimpleParser.InPowContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarSimpleParser#inSqrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSqrt(GrammarSimpleParser.InSqrtContext ctx);
}