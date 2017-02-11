//model: Feline is a lion, tiger, panther of cat

//polymorphism:

/*
sealed trait Feline {
  def dinner: Food
}

final case class Lion() extends Feline {
  def dinner = Antelope()
}

final case class Tiger() extends Feline {
  def dinner = TigerFood()
}

final case class Panther() extends Feline {
  def dinner = Liquorice()
}

final case class Cat() extends Feline {
  def dinner = Mice()
}
*/

//define a method dinner()
//Lion eat Antelope
//Tiger eat Tiger Food
//Panther eat Liquorice
//Cat eat Mice


//pattern matching:
//much more concise

sealed trait Feline {
  def dinner: Food = this match{
    case Lion() => Antelope()
    case Tiger() => TigerFood()
    case Panther() => Liquorice()
    case Cat() => Mice()
  }
}

final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat() extends Feline