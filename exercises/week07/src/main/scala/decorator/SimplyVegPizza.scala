package decorator

class SimplyVegPizza extends Pizza {

  def getDesc: String = { s"SimplyVegPizza ($getPrice)" }

  def getPrice: Double = { 230.00 }

}
