package person

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
case class Person(firstName: String, lastName: String){

}

object Person {

  def apply(name: String): Person = {
    val parts = name.split(" ")
    new Person(parts(0),parts(1))
  }

}
