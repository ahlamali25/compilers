// Generated from C:/Users/NOUR-ALSHAM/IdeaProjects/compilers/src/grammar/HTML.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HTMLParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(HTMLParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HTMLParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#normalElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormalElement(HTMLParser.NormalElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#selfClosingElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HTMLParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#voidElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidElement(HTMLParser.VoidElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(HTMLParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(HTMLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#thymeleafAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThymeleafAttribute(HTMLParser.ThymeleafAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(HTMLParser.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLParser#textNode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextNode(HTMLParser.TextNodeContext ctx);
}