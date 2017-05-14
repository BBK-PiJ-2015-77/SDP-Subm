package decorator

class Meat(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 14.25

  override def getDesc: String = {
    super.getDesc + sep +  s"Meat ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }

}
