import scala.io.StdIn._

trait Instruction {
  def action(name: String): String
}
trait Add extends Instruction

class AddImpl extends Instruction{
  def action(name: String): String = s"Executing an instruction $name"
}

object FooMain extends App {
  print("Enter a class name: ")
  val name = readLine
  try {
    Class.forName(name)
    val className = name + "Impl"
    try {
      val actualClass = Class.forName(className)
      val foo = actualClass.newInstance.asInstanceOf[Instruction]
      println(foo.action("Crash the machine!"))
    }
    catch {
      case ex: ClassNotFoundException => println("No implementation for [$name] found")
    }
  }
  catch {
    case ex: ClassNotFoundException => println("No class of instruction [$name]")
  }
  finally {
    println("Well I got here anyway")
  }
  print(reverse("Hello".toList))
}