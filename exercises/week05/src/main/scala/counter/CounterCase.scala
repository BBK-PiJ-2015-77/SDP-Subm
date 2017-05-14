package counter

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
case class CounterCase(var count: Int = 0) {

  def inc(x: Int = 1): CounterCase = {
    new CounterCase(count+x)
  }

  def dec(x: Int = 1): CounterCase = {
    new CounterCase(count-x)
  }

}
