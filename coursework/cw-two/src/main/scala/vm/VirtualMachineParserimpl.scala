package vm

import bc.{ByteCode, ByteCodeParserImpl}
import vendor.VendorProgramParserImpl

/**
  * Created by thomasmcgarry on 01/05/2017.
  */
class VirtualMachineParserimpl extends VirtualMachineParser{

  //Use composition of the other two parsers as part of the implementation
  val byteCodeParser = new ByteCodeParserImpl
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
  override def parse(file: String): Vector[ByteCode] = ???

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
    val insList = vendorProgramParser.parseString(str) //gives an InstructionList (which is a Vector[Instruction])
    //and an Instruction is (String, Vector[Int])
  }
}
