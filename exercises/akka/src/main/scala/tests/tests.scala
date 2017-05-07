package tests

/**
  * Created by thomasmcgarry on 29/04/2017.
  */
object tests extends App{

  val names = Vector("iconst", "iadd", "isub", "imul", "idiv", "irem",
    "ineg", "iinc", "idec", "idup", "iswap", "print")


  val bytecode = names.zip(1.to(names.length).map(_.toByte)).toMap

  for(x <- bytecode) {
    println(x)
  }


  //the names are the keys, the values are numbers 1 to 12 (because 12 is the length of the name list), cast to bytes, rather than ints

  println("-----")

  val bytecode2 = names.zip(1.to(names.length).map(_.toByte))

  for(x <- bytecode2) {
    println(x)
  }

  println("-----")
  println(s"Length of names list: ${names.length}")

  val bytecode3 = 1.to(names.length).map(_.toByte)

  for(x <- bytecode3) {
    println(x)
  }


}
