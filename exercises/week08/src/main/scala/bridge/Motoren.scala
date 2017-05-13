package bridge

case class Motoren(product: Product, s: String) extends Car(product, s) {

  override def assemble: Unit = {
    println("Modifying product " + product.productName + s" according to $s")
  }

  override def produceProduct: Unit = {
    println("Producing " + product.productName)
  }

  override def printDetails: Unit = {
    println(s"Car: $s, Product: " + product.productName)
  }

}
