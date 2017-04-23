package actor

import akka.actor.{Actor, ActorLogging}
import actor.TeacherProtocol._


/**
  * Created by thomasmcgarry on 22/04/2017.
  */
class TeacherLogActor extends Actor with ActorLogging{

  val quotes = List(
    "Moderation is for cowards",
    "Anything worth doing is worth overdoing",
    "The trouble is you think you have time",
    "You never gonna know if you never even try"
  )

  def receive = {

    case QuoteRequest => {

      import util.Random

      //Get a random quote from the list
      val quoteResponse = QuoteResponse(quotes(Random.nextInt(quotes.size)))
      log.info(quoteResponse.toString())

    }

  }

  def quoteList = quotes

}
