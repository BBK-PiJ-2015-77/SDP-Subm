package person

import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class PersonTest extends FunSuite with BeforeAndAfter {

  var firstName: String = _
  var lastName: String = _
  var name: String = _
  var person: Person = _

  before {
    firstName = "Joe"
    lastName = "Bloggs"
    name = "Joe Bloggs"
    person = new Person(firstName,lastName)
  }

  test("Whole name argument constructor works"){
    //val person2 = new Person(name)
    assert(person.firstName === Person(name).firstName)
    assert(person.lastName === Person(name).lastName)
  }

}
