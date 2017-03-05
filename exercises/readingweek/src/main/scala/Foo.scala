/**
import scala.io.StdIn._

trait Instruction

class FooInstructionImpl extends Instruction{
  def action(name: String): String = s"Executing an instruction $name"
}

object FooMain extends App {
  print("Enter a class name: ")
  val name = readLine
  val foo = Class.forName(name).newInstance.asInstanceOf[Instruction]
  println(foo.action("Crash the machine!"))
}

//This doesn't work because foo has been classed as an Instruction - which doesn't contain the method 'action'
*/