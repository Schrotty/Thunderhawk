// Generated from src/main/antlr4/thunderhawk/core/antlr/IRC.g4 by ANTLR 4.7.2
package thunderhawk.core.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IRCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DLIMIT=1, WORD=2, WHITESPACE=3, CHAR=4;
	public static final int
		RULE_client_request = 0;
	private static String[] makeRuleNames() {
		return new String[] {
			"client_request"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DLIMIT", "WORD", "WHITESPACE", "CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "IRC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IRCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Client_requestContext extends ParserRuleContext {
		public TerminalNode DLIMIT() { return getToken(IRCParser.DLIMIT, 0); }
		public List<TerminalNode> WORD() { return getTokens(IRCParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(IRCParser.WORD, i);
		}
		public TerminalNode WHITESPACE() { return getToken(IRCParser.WHITESPACE, 0); }
		public Client_requestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_client_request; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IRCListener ) ((IRCListener)listener).enterClient_request(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IRCListener ) ((IRCListener)listener).exitClient_request(this);
		}
	}

	public final Client_requestContext client_request() throws RecognitionException {
		Client_requestContext _localctx = new Client_requestContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_client_request);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2);
			match(DLIMIT);
			{
			setState(3);
			match(WORD);
			setState(4);
			match(WHITESPACE);
			setState(5);
			match(WORD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\6\n\4\2\t\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\2\2\3\2\2\2\2\b\2\4\3\2\2\2\4\5\7\3\2\2\5\6\7\4\2\2"+
		"\6\7\7\5\2\2\7\b\7\4\2\2\b\3\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}