package decorator

class GreenOlives(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 5.47

  override def getDesc: String = {
    super.getDesc + sep +  s"GreenOlives ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }
}
