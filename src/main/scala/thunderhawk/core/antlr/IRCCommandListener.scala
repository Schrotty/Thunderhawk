package thunderhawk.core.antlr

class IRCCommandListener extends IRCBaseListener {
    override def enterClient_request(ctx: IRCParser.Client_requestContext): Unit = {
      println(ctx.getText)
  }
}