package factory

/**
  * Created by thomasmcgarry on 13/05/2017.
  */
trait Creator {
  def getProduct(product: String): Product
}
