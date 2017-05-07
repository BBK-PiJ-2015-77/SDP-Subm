package messaging

import actor.StudentProtocol.InitSignal
import akka.actor.{ActorSystem, Props}

/**
  * Created by thomasmcgarry on 24/04/2017.
  */
class DriverApp extends App{

  //Initialise the Actor system
  val system = ActorSystem("UniversityMessageSystem")

  //Construct the teacher Actor
  val teacherRef = system.actorOf(Props[TeacherActor2], "teacherActor")

  //Construct the student Actor - pass the teacher actorRef as a constructor parameter to StudentActor
  val studentRef = system.actorOf(Props(new StudentActor(teacherRef)), "studentActor")

  //Send a message to the Student Actor
  studentRef!InitSignal

  //Wait for a couple of seconds for the system to shutdown
  Thread.sleep(2000)

  //Shutdown the system
  system.terminate()

}
