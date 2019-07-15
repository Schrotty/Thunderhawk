package thunderhawk.core

import java.net.InetSocketAddress

import akka.actor.{Actor, Props}
import akka.event.Logging
import akka.io.{IO, Tcp}
import thunderhawk.core.client.ClientHandler

class ClientManager extends Actor {
  import Tcp._
  import context.system

  val log = Logging(context.system, this)

  IO(Tcp) ! Bind(self, new InetSocketAddress("localhost", 6667))

  override def preStart(): Unit = {
    log.info("client-manager is starting...")
  }

  override def postStop(): Unit = {
    log.info("client-manager has stopped!")
  }

  def receive: Receive = {
    case b @ Bound(localAddress) => context.parent ! b
    case CommandFailed(_: Bind) => context.stop(self)
    case c @ Connected(remote, local) =>
      val handler = context.actorOf(Props[ClientHandler])
      val connection = sender()

      connection ! Register(handler)
  }
}