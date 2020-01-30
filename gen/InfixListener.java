// Generated from /home/kathy/IdeaProjects/ANTLR Intro/Infix.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InfixParser}.
 */
public interface InfixListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InfixParser#stuff}.
	 * @param ctx the parse tree
	 */
	void enterStuff(InfixParser.StuffContext ctx);
	/**
	 * Exit a parse tree produced by {@link InfixParser#stuff}.
	 * @param ctx the parse tree
	 */
	void exitStuff(InfixParser.StuffContext ctx);
}