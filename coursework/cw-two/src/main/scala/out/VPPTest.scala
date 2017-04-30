package out

import vendor.Instruction

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Created by thomasmcgarry on 29/04/2017.
  */
object VPPTest extends App{

  val vectorA : Vector[Int] = Vector(4)
  val vectorB : Vector[Int] = Vector(5)
  val vectorEmpty : Vector[Int] = Vector.empty


  var a : Instruction = new Instruction("iconst", vectorA)
  var b : Instruction = new Instruction("iconst", vectorB)
  var c : Instruction = new Instruction("iadd", vectorEmpty)
  var d : Instruction = new Instruction("print", vectorEmpty)

  val result : Vector[Instruction] = Vector(a,b,c,d)

  for(a <- result) {
    println(a)
  }

  println("\nFrom File:")

  val listOut : List[Instruction] = List.empty


  val fileName: String = "src/main/scala/out/p01.vm"

  /**
  val lines = Source.fromFile(fileName).getLines

  for (line <- lines) {
    val fields = line.split(" ")
    if (fields.length > 1) {
      listOut :+ (new Instruction(fields(0), Vector(fields(1).toInt))) //dont think this works because vector is immutable, creates a new copy
      //vectorOut :+ (new Instruction(fields(0), Vector(fields(1).toInt)))
      //println(fields(0) + " and " + fields(1))
    }

  }
  */

  println("Latest:")

  val testString = "iconst 4\niconst 5\niadd\nprint"

  val parts = testString.split("\n")

  val insList : ListBuffer[Instruction] = ListBuffer.empty[Instruction]

  for (part <- parts) {
    val fields = part.split(" ")
    if (fields.size > 1) {
      insList += new Instruction(fields(0),Vector(fields(1).toInt))
    } else {
      insList += new Instruction(fields(0),Vector.empty)
    }
  }

  for (ins <- insList) {
    println(ins)
  }

  /**
  if (parts.length > 1) {
    val outInstruction : Instruction = new Instruction(parts(0),Vector(parts(1).toInt))
    println("1: " + outInstruction)
  } else {
    val outInstruction : Instruction = new Instruction(parts(0),Vector.empty)
    println("2: " + outInstruction)
  }
    */





}
