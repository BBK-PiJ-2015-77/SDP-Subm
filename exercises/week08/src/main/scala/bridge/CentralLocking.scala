package bridge

case class CentralLocking(s: String) extends Product {

  private val pname = s

  override def productName: String = pname

  override def produce: Unit = ???
}
