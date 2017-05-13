package factory

/**
  * Created by thomasmcgarry on 13/05/2017.
  */
class ConcreteCreator extends Creator{

  private var product: Product = _

  override def getProduct(product: String): ConcreteProduct =product match{
    case "ConcreteProduct" => new ConcreteProduct
  }
}
