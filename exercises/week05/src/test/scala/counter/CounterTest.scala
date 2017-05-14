package counter

import acme.Pizza
import org.scalatest.{BeforeAndAfter, FunSuite}

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class CounterTest extends FunSuite with BeforeAndAfter{

  var counter: Counter = _

  before {
    counter = new Counter(0)
  }

  test("counter has been created with value 0") {
    assert(counter.count === 0)
  }

}
