package factory

import bc.{ByteCodeFactory, ByteCodeParser}
import vm.{VirtualMachine, VirtualMachineParser}
import vendor.ProgramParser

/**
  * The `VirtualMachineFactory` follows the *factory pattern*. It provides
  * methods for each of the important parts in this assignment. You must
  * implement each method such that it returns an object of the correct type.
  */
object VirtualMachineFactory {
  // TODO
  def byteCodeFactory: ByteCodeFactory = ???

  // TODO
  def vendorParser: ProgramParser = ???

  // TODO
  def byteCodeParser: ByteCodeParser = ???

  // TODO
  def virtualMachineParser: VirtualMachineParser = ???

  // TODO
  def virtualMachine: VirtualMachine = ???
}
