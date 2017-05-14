package counter

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class Counter(var count: Int) {

  def inc(x: Int = 1): Counter = {
    new Counter(count+x)
  }

  def dec(x: Int = 1): Counter = {
    new Counter(count-x)
  }



}
