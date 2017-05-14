package films

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {

  def name: String = {
    firstName + " " + lastName
  }

}

object Director {

  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director = {
    Director(firstName,lastName,yearOfBirth)
  }

  def older(d1: Director, d2: Director): Director = {
    if(d1.yearOfBirth<d2.yearOfBirth) {
      d1
    } else {
      d2
    }
  }

}
