// Generated from /home/kathy/IdeaProjects/ANTLR Intro/Infix.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InfixParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InfixVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InfixParser#stuff}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStuff(InfixParser.StuffContext ctx);
}