package vm

import bc.{ByteCode, ByteCodeParserImpl, ByteCodeValues, InvalidBytecodeException}
import vendor.{Instruction, VendorProgramParserImpl}

import scala.collection.mutable.ListBuffer

/**
  * Created by thomasmcgarry on 01/05/2017.
  */
class VirtualMachineParserImpl extends VirtualMachineParser with ByteCodeValues{

  //Use composition of the other two parsers as part of the implementation

  //parses a vector of `Byte` into a vector of `ByteCode`
  val byteCodeParser = new ByteCodeParserImpl

  //Parses a file representation of a bytecode program into an `InstructionList`.
  val vendorProgramParser = new VendorProgramParserImpl

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a file into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program file correctly.
    *
    * @param file the file containing a program
    * @return a vector of bytecodes
    */
  override def parse(file: String): Vector[ByteCode] = {
    val insList = vendorProgramParser.parse(file)
    val byteVector = insListToByteVector(insList)
    byteCodeParser.parse(byteVector)
  }
  //need to translate file of instructions (String) to InstructionList
  //using VendorParserImpl
  //translate this InstructionList ot Vector[Bytecode]
  //translate InstructionList to Vector[Byte] then use BytecodeParserImpl

  /**
    * Returns a vector of [[bc.ByteCode]].
    *
    * This method parses a string into a vector of bytecode objects.
    * Note, this method should throw a [[bc.InvalidBytecodeException]]
    * if it fails to parse a program string correctly.
    *
    * @param str a string containing a program
    * @return a vector of bytecodes
    */
  override def parseString(str: String): Vector[ByteCode] = {
    val insList = vendorProgramParser.parseString(str)
    val byteVector = insListToByteVector(insList)
    byteCodeParser.parse(byteVector)
  }


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
