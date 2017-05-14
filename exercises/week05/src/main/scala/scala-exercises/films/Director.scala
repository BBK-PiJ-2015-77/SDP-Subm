package films

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class Director(val firstName: String, val lastName: String, val yearOfBirth: Int) {

  def name: String = {
    firstName + " " + lastName
  }

}
