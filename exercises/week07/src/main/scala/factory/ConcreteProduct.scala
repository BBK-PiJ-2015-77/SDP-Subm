package factory

/**
  * Created by thomasmcgarry on 13/05/2017.
  */
class ConcreteProduct extends Product{

  private var name = ""
  private var price = 0

  override def setName(name: String): Unit = {this.name = name}

  override def getName = name

  def setPrice(price: Int): Unit = {this.price = price}
  def getPrice: Int = price
}
