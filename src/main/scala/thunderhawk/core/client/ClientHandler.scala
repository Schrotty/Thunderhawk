package thunderhawk.core.client

import akka.actor.{Actor, ActorRef, Props}
import akka.event.Logging
import akka.io.Tcp.{PeerClosed, Received, Write}
import thunderhawk.utils.Messages.{NickResponse, ParseRequest, UserResponse}

class ClientHandler extends Actor {
  val parser: ActorRef = context.actorOf(Props[Parser], "parser")
  val log = Logging(context.system, this)
  val client = new Client

  override def preStart(): Unit = {
    log.info("client started!")
  }

  override def postStop(): Unit = {
    log.info("client shutdown")
  }

  def receive: Receive = {
    case Received(data) => parser ! ParseRequest(data.decodeString("ASCII"))
    case response: UserResponse => client.username = response.username
    case response: NickResponse => client.nickname = response.nickname

    case PeerClosed => context.stop(self)
  }
}