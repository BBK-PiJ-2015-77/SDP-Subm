package lifecycle

import akka.actor.{Actor, ActorLogging}
import akka.event.LoggingReceive

/**
  * Created by thomasmcgarry on 27/04/2017.
  */
class BasicLifecycleLoggingActor extends Actor with ActorLogging{

  log.info ("Inside BasicLifecycleLoggingActor Constructor")
  log.info (context.self.toString())

  override def preStart() ={
    log.info("Inside the preStart method of BasicLifecycleLoggingActor")
  }

  def receive = LoggingReceive{
    case "hello" => log.info("hello")
    case "stop" => context.stop(self)
  }

  override def postStop() ={
    log.info ("Inside postStop method of BasicLifecycleLoggingActor")
  }

}
