package decorator

class Spinach(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 7.92

  override def getDesc: String = {
    super.getDesc + sep +  s"Spinach ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }
}
