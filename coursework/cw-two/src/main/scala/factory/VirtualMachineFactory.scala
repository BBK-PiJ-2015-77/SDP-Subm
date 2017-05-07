package factory

import bc.{ByteCodeFactory, ByteCodeFactoryImpl, ByteCodeParser, ByteCodeParserImpl}
import vm.{VirtualMachine, VirtualMachineParser, VirtualMachineParserImpl}
import vendor.{ProgramParser, VendorProgramParserImpl}

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  // TODO
  def byteCodeFactory: ByteCodeFactory = new ByteCodeFactoryImpl

  // TODO
  def vendorParser: ProgramParser = new VendorProgramParserImpl

  // TODO
  def byteCodeParser: ByteCodeParser = new ByteCodeParserImpl

  // TODO
  def virtualMachineParser: VirtualMachineParser = new VirtualMachineParserImpl

  // TODO
  def virtualMachine: VirtualMachine = ???
}
