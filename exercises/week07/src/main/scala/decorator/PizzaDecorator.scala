package decorator

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
abstract class PizzaDecorator (newPizza: Pizza) extends Pizza{

  val sep = ", "

  def getDesc: String = { newPizza.getDesc }

  def getPrice: Double = { newPizza.getPrice }


}
