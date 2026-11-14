// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/CSS.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CSSParser}.
 */
public interface CSSListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CSSParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void enterRule(CSSParser.RuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#rule}.
	 * @param ctx the parse tree
	 */
	void exitRule(CSSParser.RuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterSelectorList(CSSParser.SelectorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitSelectorList(CSSParser.SelectorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CSSParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CSSParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void enterSelectorPart(CSSParser.SelectorPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#selectorPart}.
	 * @param ctx the parse tree
	 */
	void exitSelectorPart(CSSParser.SelectorPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CSSParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CSSParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CSSParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CSSParser#valueAtom}.
	 * @param ctx the parse tree
	 */
	void enterValueAtom(CSSParser.ValueAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link CSSParser#valueAtom}.
	 * @param ctx the parse tree
	 */
	void exitValueAtom(CSSParser.ValueAtomContext ctx);
}