package lifecycle

import akka.actor.{Actor, ActorSystem, DeadLetter, Props}

/**
  * Created by thomasmcgarry on 27/04/2017.
  */
object LifecycleApp extends App{

  val actorSystem=ActorSystem("LifecycleActorSystem")
  val lifecycleActor = actorSystem.actorOf(Props[BasicLifecycleLoggingActor], "lifecycleActor")

  val deadLetterListener = actorSystem.actorOf(Props[MyCustomDeadLetterListener])
  actorSystem.eventStream.subscribe(deadLetterListener, classOf[DeadLetter])

  lifecycleActor!"hello"
  lifecycleActor!"stop"
  lifecycleActor!"hello" //Sending message to an Actor which is already stopped

  //wait for a couple of seconds before shutdown
  //Thread.sleep(2000)
  //actorSystem.terminate()

  class MyCustomDeadLetterListener extends Actor {
    def receive = {
      case deadLetter: DeadLetter => println(s"FROM CUSTOM LISTENER $deadLetter")
    }
  }

}
