sealed trait TrafficLight {
  def next: TrafficLight = this match{
    case Red => Green
    case Green => Amber
    case Amber => Red
  }
}

final case object Red extends TrafficLight
final case object Green extends TrafficLight
final case object Amber extends TrafficLight