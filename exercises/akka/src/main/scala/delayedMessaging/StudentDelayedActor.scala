package delayedMessaging

import actor.StudentProtocol._
import actor.TeacherProtocol._
import akka.actor.{Actor, ActorLogging, ActorRef}
import scala.concurrent.duration._

/**
  * Created by thomasmcgarry on 26/04/2017.
  */
class StudentDelayedActor (teacherActorRef:ActorRef) extends Actor with ActorLogging{

  def receive = {

    case InitSignal => {
      import context.dispatcher
      context.system.scheduler.schedule(0 seconds, 5 seconds, teacherActorRef, QuoteRequest)
      //teacherActorRef!QuoteRequest
    }

    case QuoteResponse(quoteString) => {
      log.info("Received QuoteResponse from teacher")
      log.info(s"Printing from Student Actor $quoteString")
    }

  }

}
