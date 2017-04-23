package actor

import org.scalatest.MustMatchers
import org.scalatest.WordSpecLike
import org.scalatest.BeforeAndAfterAll

import akka.actor.ActorSystem
import akka.testkit.{TestActorRef, TestKit}
import actor.TeacherProtocol.QuoteRequest

/**
  * Created by thomasmcgarry on 23/04/2017.
  */
class TeacherTest extends TestKit(ActorSystem("UniversityMessageSystem"))

  with WordSpecLike
  with MustMatchers
  with BeforeAndAfterAll {

    //1. Sends message to the Print Actor. Not even a test case actually
    "A Teacher" must {

      "print a quote when a QuoteRequest message is sent" in {

        val teacherRef = TestActorRef[TeacherLogActor]
        teacherRef!QuoteRequest

      }

    }

    //2. Sends message to the Log Actor. Again, not a test case per se
    "A teacher with "

  }
