// Generated from src/main/antlr4/thunderhawk/core/antlr/IRC.g4 by ANTLR 4.7.2
package thunderhawk.core.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IRCParser}.
 */
public interface IRCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IRCParser#client_request}.
	 * @param ctx the parse tree
	 */
	void enterClient_request(IRCParser.Client_requestContext ctx);
	/**
	 * Exit a parse tree produced by {@link IRCParser#client_request}.
	 * @param ctx the parse tree
	 */
	void exitClient_request(IRCParser.Client_requestContext ctx);
}