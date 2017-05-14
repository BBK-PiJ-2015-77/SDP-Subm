package decorator

class RomaTomatoes(val pizza: Pizza) extends PizzaDecorator(pizza) {

  val price = 5.20

  override def getDesc: String = {
    super.getDesc + sep + s"RomaTomatoes ($price)"
  }

  override def getPrice: Double = {
    super.getPrice + price
  }
}
