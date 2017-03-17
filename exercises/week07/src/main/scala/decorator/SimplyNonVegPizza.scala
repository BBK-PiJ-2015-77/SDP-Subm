package decorator

class SimplyNonVegPizza extends Pizza {

  def getDesc: String = { s"SimplyNonVegPizza ($getPrice)" }

  def getPrice: Double = { 350.00 }

}
