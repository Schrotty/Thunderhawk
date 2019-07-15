package thunderhawk.core.client

import akka.actor.Actor
import akka.event.Logging
import org.antlr.v4.runtime.{ANTLRInputStream, CommonTokenStream}
import thunderhawk.core.antlr.{IRCCommandListener, IRCLexer, IRCParser}
import thunderhawk.utils.Messages.ParseRequest

class Parser extends Actor {
  val log = Logging(context.system, this)

  def parseMessage(parseRequest: ParseRequest): Unit = {
    val stream = new ANTLRInputStream(parseRequest.message)
    val lexer = new IRCLexer(stream)
    val tokens = new CommonTokenStream(lexer)
    val parser = new IRCParser(tokens)

    val listener = new IRCCommandListener()

    parser.client_request.enterRule(listener)
  }

  def receive: Receive = {
    case request: ParseRequest => sender() ! parseMessage(request)
  }
}
