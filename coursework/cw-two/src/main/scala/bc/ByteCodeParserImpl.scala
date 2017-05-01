package bc

import factory.VirtualMachineFactory

import scala.collection.mutable.ListBuffer

/**
  * Created by thomasmcgarry on 01/05/2017.
  */
class ByteCodeParserImpl extends ByteCodeParser with ByteCodeValues{

  val bcf = VirtualMachineFactory.byteCodeFactory
  /**
    * Parses a vector of `Byte` into a vector of `ByteCode`.
    *
    * You should use [[ByteCodeValues.bytecode]] to help translate
    * the individual `Byte`s into a correponding [[ByteCode]].
    *
    * @param bc a vector of bytes representing bytecodes
    * @return a vector of `ByteCode` objects
    */
  override def parse(bc: Vector[Byte]): Vector[ByteCode] = {

    //From test:
    //val code = Vector(bytecode("iconst"), 4.toByte, bytecode("iconst"), 5.toByte, bytecode("iadd"))

    val bcList : ListBuffer[ByteCode] = ListBuffer.empty[ByteCode]

    for (byte <- bc) {
      bcList += bcf.make(byte)
    }

    bcList.toVector

  }


}
