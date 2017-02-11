package scala

//Look at Keith's original to get a good idea of what we have done making this abstraction. Week05/Examples

sealed trait IntList {

  def length: Int = fold(0, (_, tl) => 1 + tl)

  def product: Int = fold(1, (hd, tl) => hd * tl)

  def sum: Int = fold(0, (hd, tl) => hd + tl)

  def fold(end: Int, f: (Int,Int) => Int): Int = this match{ //f: (Int,Int) => Int, the functions above effectively do this, e.g.: (1 + tl.length)
    case End => end
    case Pair(hd, tl) => f(hd, tl.fold(end, f))
  }

  def double: IntList =
    this match {
      case End => End
      case Pair(hd, tl) => Pair(hd * 2, tl.double)
    }
}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList
