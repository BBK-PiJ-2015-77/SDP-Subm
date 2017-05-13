package actor

import akka.actor.ActorSystem
import akka.actor.{Actor, ActorRef, Terminated}
import akka.actor.Props
import akka.actor.actorRef2Scala
import actor.TeacherProtocol._
import actor.TeacherLogActor


/**
  * Created by thomasmcgarry on 22/04/2017.
  */
object StudentSimulatorApp extends App{

  //Initialise the Actor system
  val actorSystem = ActorSystem("UniversityMessageSystem")

  //construct the Teacher Actor Ref
  val teacherActorRef = actorSystem.actorOf(Props[TeacherLogActor])

  //send a message to the Teacher Actor
  teacherActorRef!QuoteRequest

  //Lets wait for a couple of seconds before we shut the system down
  Thread.sleep(2000)

  //Shut down the Actor system
  actorSystem.terminate()

}
