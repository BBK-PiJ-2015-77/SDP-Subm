package actor

import org.scalatest.MustMatchers
import org.scalatest.WordSpecLike
import org.scalatest.BeforeAndAfterAll
import akka.actor.ActorSystem
import akka.testkit.{EventFilter, TestActorRef, TestKit}
import actor.TeacherProtocol.QuoteRequest
import com.typesafe.config.ConfigFactory

/**
  * Created by thomasmcgarry on 23/04/2017.
  */
class TeacherTest extends TestKit(ActorSystem("UniversityMessageSystem", ConfigFactory.parseString("""akka.loggers = ["akka.testkit.TestEventListener"]""")))

  with WordSpecLike
  with MustMatchers
  with BeforeAndAfterAll {

    //1. Sends message to the Print Actor. Not even a test case actually
    "A Teacher" must {

      "print a quote when a QuoteRequest message is sent" in {

        val teacherRef = TestActorRef[TeacherActor]
        teacherRef!QuoteRequest

      }

    }

    //2. Sends message to the Log Actor. Again, not a test case per se
    "A teacher with Actor Logging" must {

      "log a quote when a QuoteRequest message is sent" in {

        val teacherRef = TestActorRef[TeacherLogActor]
        teacherRef ! QuoteRequest

      }


      //3. asserts the internal state of the log actor
      "have a quote list of size 4" in {

        val teacherRef = TestActorRef[TeacherLogActor]
        teacherRef.underlyingActor.quoteList must have size (4)
        teacherRef.underlyingActor.quoteList must have size (4)

      }

      //4. Verifying log messages from eventStream
      "be verifiable via EventFilter in response to a QuoteRequest that is sent" in {

        val teacherRef = TestActorRef[TeacherLogActor]
        EventFilter.info(pattern = "QuoteResponse*", occurrences = 1) intercept {
          teacherRef ! QuoteRequest
        }

      }

      //5. have a quote list of the same size as the input parameter
      "have a quote list of the same size as the input parameter" in {

        val quotes = List(
          "Moderation is for cowards",
          "Anything worth doing is worth overdoing",
          "The trouble is you think you have time",
          "You never gonna know if you never even try"
        )

        val teacherRef = TestActorRef(new TeacherLogParameterActor(quotes))

        teacherRef.underlyingActor.quoteList must have size (4)
        EventFilter.info(pattern = "QuoteResponse*", occurrences = 1) intercept {
          teacherRef ! QuoteRequest
        }

      }

    }

    override def afterAll(): Unit = {
      super.afterAll()
      system.terminate()
    }

  }
