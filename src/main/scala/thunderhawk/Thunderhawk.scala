package thunderhawk

import akka.actor.{ActorSystem, Props}
import thunderhawk.core.GuardianAngel

object Thunderhawk {
    def main(args: Array[String]): Unit = {
        ActorSystem("thunderhawk").actorOf(Props[GuardianAngel], "guardian-angel")
    }
}