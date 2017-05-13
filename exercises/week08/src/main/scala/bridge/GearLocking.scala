package bridge

case class GearLocking(s: String) extends Product {

  private val pname = s

  override def productName: String = pname

  override def produce: Unit = ???
}
