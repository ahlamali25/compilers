// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/HTML.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLParser}.
 */
public interface HTMLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(HTMLParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(HTMLParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HTMLParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HTMLParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void enterNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 */
	void exitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#voidElement}.
	 * @param ctx the parse tree
	 */
	void enterVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#voidElement}.
	 * @param ctx the parse tree
	 */
	void exitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(HTMLParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(HTMLParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void enterThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 */
	void exitThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLParser#textNode}.
	 * @param ctx the parse tree
	 */
	void enterTextNode(HTMLParser.TextNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLParser#textNode}.
	 * @param ctx the parse tree
	 */
	void exitTextNode(HTMLParser.TextNodeContext ctx);
}