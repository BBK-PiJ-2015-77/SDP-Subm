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

  test("counter has increased by one") {
    assert(counter.inc().count === 1)
  }

  test("counter has increased by three") {
    assert(counter.inc().inc().inc().count === 3)
  }

  test("counter has decreased by one") {
    assert(counter.dec().count === -1)
  }

  test("counter has decreased by three") {
    assert(counter.dec().dec().dec().count === -3)
  }

  test("counter has increased by ten") {
    assert(counter.inc(10).count === 10)
  }

  test("counter can increase and decrease using inc and dec with arguments") {
    assert(counter.inc(10).dec(5).count === 5)
  }

  test("counterCase increases and decreases") {
    assert(CounterCase(0).inc(10).dec(5).count === 5)
  }

}
