package counter

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class Counter(var count: Int) {

  def inc: Counter = {
    new Counter(count+1)
  }

  def dec: Counter = {
    new Counter(count-1)
  }



}
