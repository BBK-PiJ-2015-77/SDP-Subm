package vm

import bc.{ByteCode, ByteCodeParserImpl, ByteCodeValues, InvalidBytecodeException}
import vendor.{Instruction, VendorProgramParserImpl}

import scala.collection.mutable.ListBuffer

/**
  * Created by thomasmcgarry on 01/05/2017.
  */
class VirtualMachineParserImpl extends VirtualMachineParser with ByteCodeValues{

  val byteCodeParser = new ByteCodeParserImpl
  val vendorProgramParser = new VendorProgramParserImpl

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a file into a vector of bytecode objects.
    * Note, this method throws a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program file correctly.
    *
    * @param file the file containing a program
    * @return a vector of bytecodes
    */
  override def parse(file: String): Vector[ByteCode] = {

    //Parses a file representation of a bytecode program into an `InstructionList`.
    val insList = vendorProgramParser.parse(file)

    //Parses an 'InstructionList' to a Vector[Byte]
    val byteVector = insListToByteVector(insList)

    //Parses a Vector[Byte] into a Vector[ByteCode]
    byteCodeParser.parse(byteVector)
  }

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a string into a vector of bytecode objects.
    * Note, this method throws a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program string correctly.
    *
    * @param str a string containing a program
    * @return a vector of bytecodes
    */
  override def parseString(str: String): Vector[ByteCode] = {

    //Parses a file representation of a bytecode program into an `InstructionList`.
    val insList = vendorProgramParser.parseString(str)

    //Parses an 'InstructionList' to a Vector[Byte]
    val byteVector = insListToByteVector(insList)

    //Parses a Vector[Byte] into a Vector[ByteCode]
    byteCodeParser.parse(byteVector)
  }

  /**
    * Returns a vector of [[Byte]].
    *
    * This method parses a vector of Instruction objects into a
    * vector of Byte objects.
    *
    * @param insList an instruction list
    * @return a vector of Bytes
    */
  def insListToByteVector(insList: Vector[Instruction]): Vector[Byte] = {

    val byteList : ListBuffer[Byte] = ListBuffer.empty[Byte]

    for(ins <- insList) {
      if (ins.args.length > 0) {
        byteList += bytecode(ins.name)
        byteList += ins.args(0).toByte
      } else if ((ins.args.length == 0) && bytecode.contains(ins.name)) {
        byteList += bytecode(ins.name)
      } else {
        throw new InvalidBytecodeException("Invalid ByteCode")
      }
    }

    val result : Vector[Byte] = byteList.toVector
    result

  }


}
