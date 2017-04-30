package out

import vendor.Instruction
import vendor.ProgramParser


/**
  * Created by thomasmcgarry on 29/04/2017.
  */
class VendorProgramParser extends ProgramParser{
  /**
    * Parses a file representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param file the file to parse
    * @return an instruction list
    */
  override def parse(file: String): InstructionList = ???
  /**
  {
    val vectorA : Vector[Int] = Vector(4)
    val vectorB : Vector[Int] = Vector(5)
    val vectorEmpty : Vector[Int] = Vector.empty


    var a : Instruction = ("iconst", vectorA)
    var b : Instruction = ("iconst", vectorB)
    var c : Instruction = ("iadd", vectorEmpty)
    var d : Instruction = ("print", vectorEmpty)

    val result : Vector[Instruction] = Vector(a,b,c,d)

  }
    */

    //readAndTranslate?
  //what is an instructionlist? - a vector of Instruction objects
  //what is an Instruction? A (`String`, `Vector[Int]`) pair

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = ???
  /**
  {
    import scala.io.Source
    val lines =
  }
  */
}
