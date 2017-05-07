package messaging

import actor.StudentProtocol._
import actor.TeacherProtocol._
import akka.actor.{Actor, ActorLogging, ActorRef}

/**
  * Created by thomasmcgarry on 24/04/2017.
  */
class StudentActor (teacherActorRef:ActorRef) extends Actor with ActorLogging {

  def receive = {
    case InitSignal => {
      teacherActorRef!QuoteRequest
    }

    case QuoteResponse(quoteString) => {
      log.info("Received QuoteResponse from teacher")
      log.info(s"Printing from Student Actor $quoteString")
    }

  }

}
