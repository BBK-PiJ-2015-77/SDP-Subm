package decorator

class Ham(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 18.12

  override def getDesc: String = {
    super.getDesc + sep +  s"Ham ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }

}
