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
class TeacherPreTest extends TestKit(ActorSystem("UniversityMessageSystem"))

  with WordSpecLike
  with MustMatchers
  with BeforeAndAfterAll {

    "A teacher with ActorLogging" must  {

      "log a quote when a QuoteRequest message is sent" in {

        val teacherRef = TestActorRef[TeacherLogActor]
        teacherRef!QuoteRequest

      }

    }

    override def afterAll(): Unit = {
      super.afterAll()
      system.terminate()
    }


  }


