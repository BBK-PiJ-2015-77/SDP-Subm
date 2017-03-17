package decorator

/**
  * Created by thomasmcgarry on 11/03/2017.
  */
abstract class PizzaDecorator (newPizza: Pizza) extends Pizza{

  val sep = ", "

  def getDesc: String = { newPizza.getDesc }

  def getPrice: Double = { newPizza.getPrice }


}
