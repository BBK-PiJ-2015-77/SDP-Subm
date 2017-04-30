package out

import vendor.Instruction
import vendor.ProgramParser

import scala.collection.mutable.ListBuffer
import scala.io.Source


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
  override def parse(file: String): InstructionList = {

    val instructionString = Source.fromFile(file).toString()

    parseString(instructionString)

  }

  /**
    * Parses a string representation of a bytecode program
    * into an `InstructionList`.
    *
    * @param string the string to parse
    * @return an instruction list
    */
  override def parseString(string: String): InstructionList = {

    val insList : ListBuffer[Instruction] = ListBuffer.empty[Instruction]

    val parts = string.split("\n")

    for (part <- parts) {
      val fields = part.split(" ")
      if (fields.size > 1) {
        insList += new Instruction(fields(0),Vector(fields(1).toInt))
      } else {
        insList += new Instruction(fields(0),Vector.empty)
      }
    }

    val result : InstructionList = insList.toVector
    result

  }

}
