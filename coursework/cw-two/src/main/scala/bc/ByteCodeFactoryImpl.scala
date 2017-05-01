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

    /**
    val iaddByte = bytecode("iadd")
    val iconstByte = bytecode("iconst")
    val idecByte = bytecode("idec")
    val idupByte = bytecode("idup")
    val iincByte = bytecode("iinc")
    val imulByte = bytecode("imul")
    val inegByte = bytecode("ineg")
    val iremByte = bytecode("irem")
    val isubByte = bytecode("isub")
    val iswapByte = bytecode("iswap")
    val printByte = bytecode("print")
      */
    val byteMax = bytecode.size


    if ((byte > byteMax) || ( byte <= 0)) {
      throw new InvalidBytecodeException("Invalid Bytecode")
    }




    (byte) match {
      case byte if (byte == bytecode("iadd")) => new Iadd
      case byte if (byte == bytecode("iconst")) => new Iconst(args(0))
      case byte if (byte == bytecode("idec")) => new Idec
      case byte if (byte == bytecode("idiv")) => new Idiv
      case byte if (byte == bytecode("idup")) => new Idup
      case byte if (byte == bytecode("iinc")) => new Iinc
      case byte if (byte == bytecode("imul")) => new Imul
      case byte if (byte == bytecode("ineg")) => new Ineg
      case byte if (byte == bytecode("irem")) => new Irem
      case byte if (byte == bytecode("isub")) => new Isub
      case byte if (byte == bytecode("iswap")) => new Iswap
      case byte if (byte == bytecode("print")) => new Print
        /**
      case (byte == bytecode("iadd")) => new Iadd
      case `iconstByte` => new Iconst(args(0))
      case `idecByte` => new Idec
      case `idupByte` => new Idup
      case `iincByte` => new Iinc
      case `imulByte` => new Imul
      case `inegByte` => new Ineg
      case `iremByte` => new Irem
      case `isubByte` => new Isub
      case `iswapByte` => new Iswap
      case `printByte` => new Print
          */
    }

  }

}
