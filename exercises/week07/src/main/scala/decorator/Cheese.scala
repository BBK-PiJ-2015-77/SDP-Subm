package decorator

class Cheese(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 20.72

  override def getDesc: String = {
    super.getDesc + sep +  s"Cheese ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }

}
