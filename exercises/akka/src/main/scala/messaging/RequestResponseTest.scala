package messaging

import actor.TeacherProtocol.{QuoteRequest, QuoteResponse}
import akka.actor.{ActorSystem, Props}
import akka.testkit.{EventFilter, ImplicitSender, TestKit}
import com.typesafe.config.ConfigFactory
import delayedMessaging.StudentDelayedActor
import org.scalatest.{BeforeAndAfterAll, MustMatchers, WordSpecLike}


/**
  * This Test case exactly does what the StudentActor was doing in the
  * requestresponse package
  *
  */
class RequestResponseTest extends TestKit(ActorSystem("TestUniversityMessageSystem", ConfigFactory.parseString("""
                                            akka{
                                              loggers = ["akka.testkit.TestEventListener"]
                                              test{
                                                filter-leeway = 7s
                                              }
                                            }
                                          """)))

with WordSpecLike
with MustMatchers
with BeforeAndAfterAll
with ImplicitSender {

  "A teacher" must {

    "respond with a QuoteResponse when a QuoteRequest message is sent" in {

      val teacherRef = system.actorOf(Props[TeacherActor2], "teacherActorChild")
      teacherRef ! QuoteRequest

      //expectMsg(QuoteResponse(_)) // Asserting that we are expecting a message back
      expectMsgPF() {

        case QuoteResponse(quoteResponse) => println(quoteResponse)
        case _ => fail("QuoteResponse not received")

      }

    }

  }


  "A student" must {

    "log a QuoteResponse eventually when an InitSignal is sent to it" in {

      import actor.StudentProtocol._

      val teacherRef = system.actorOf(Props[TeacherActor2], "teacherActor")

      val studentRef = system.actorOf(Props(new StudentActor(teacherRef)), "studentActor")

      EventFilter.info (start="Printing from Student Actor", occurrences=1).intercept{
        studentRef!InitSignal
      }

    }

  }


  "A delayed student" must {

    "fire the QuoteRequest after 5 seconds when an InitSignal is sent to it" in {

      import actor.StudentProtocol._

      val teacherRef = system.actorOf(Props[TeacherActor2], "teacherActorDelayed")

      val studentRef = system.actorOf(Props(new StudentDelayedActor(teacherRef)), "studentDelayedActor")

      EventFilter.info (start="Printing from Student Actor", occurrences=1).intercept(
        studentRef!InitSignal
      )

    }

  }

}