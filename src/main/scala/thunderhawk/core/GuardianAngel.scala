package thunderhawk.core

import akka.actor.{Actor, ActorRef, Props}
import akka.event.Logging
import akka.io.Tcp.Bound

class GuardianAngel extends Actor {
  val log = Logging(context.system, this)

  val clientManager: ActorRef = context.actorOf(Props[ClientManager], "client-manager")

  override def preStart(): Unit = {
    log.info("guardian-angel is starting...")
  }

  override def postStop(): Unit = {
    log.info("guardian has stopped!")
  }

  def receive: Receive = {
    case Bound(localAddress) => log.info(localAddress.toString)
  }
}
