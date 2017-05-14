package acme

import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter

class PizzaTests extends FunSuite with BeforeAndAfter {

  var pizza: Pizza = _

  before {
    pizza = new Pizza
  }


  //TDD methods

  //test("new pizza has zero toppings") {
  ignore("new pizza has zero toppings") {
    assert(pizza.getToppings.size == 0)
  }

  test("adding one topping") {
    pizza.addTopping(Topping("green olives"))
    assert(pizza.getToppings.size === 1)
    //using '===' instead of'==' means that if an assert test fails, the '===' shows the 2 values from the test
  }

  // mark that you want a test here in the future
  test ("test pizza pricing") (pending)


}
