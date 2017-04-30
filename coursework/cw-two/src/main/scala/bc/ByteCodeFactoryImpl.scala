package bc

/**
  * Created by thomasmcgarry on 30/04/2017.
  */
class ByteCodeFactoryImpl extends ByteCodeFactory with ByteCodeValues{
  /**
    * Returns a [[ByteCode]].
    *
    * This method creates a new [[ByteCode]] object given the `byte`
    * that corresponds to the bytecode (see [[ByteCodeValues]]. If
    * the bytecode requires arguments then an optional integer
    * argument is provided.
    *
    * This method should throw an [[InvalidBytecodeException]] if the
    * given bytecode value is unknown.
    *
    * @param byte the byte code of a bytecode
    * @param args an optional integer argument (depends on bytecode)
    * @return a new bytecode object
    */
  override def make(byte: Byte, args: Int*): ByteCode = {
    val iaddByte = bytecode ("iadd")
    val iconstByte = bytecode ("iconst")
    val idecByte = bytecode ("idec")
    val idupByte = bytecode ("idup")
    val iincByte = bytecode ("iinc")
    val imulByte = bytecode ("imul")
    val inegByte = bytecode ("ineg")
    val iremByte = bytecode ("irem")
    val isubByte = bytecode ("isub")
    val iswapByte = bytecode ("iswap")
    val printByte = bytecode ("print")

    byte match {
      case iaddByte => new Iadd
      case iconstByte => new Iconst(args(0))
      case idecByte => new Idec
      case idupByte => new Idup
      case iincByte => new Iinc
      case imulByte => new Imul
      case inegByte => new Ineg
      case iremByte => new Irem
      case isubByte => new Isub
      case iswapByte => new Iswap
      case printByte => new Print
    }

  }

}
