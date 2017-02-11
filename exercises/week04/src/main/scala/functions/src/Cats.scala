object Cats extends App {
  case class Cat(name: String, colour: String, favFood: String) {
    def eat(food: String) =
      if(food==favFood)  "OMNOM" else "BLEHH"
  }

  val oswald = Cat("Oswald","black","milk")
  val henderson = Cat("Henderson","ginger and white","chips")
  val quentin = Cat("Quentin","tabby and white","curry")

  println(oswald.name + " is " + oswald.colour + " and likes " + oswald.favFood)
  println(oswald.eat("milk"))
  println(oswald.eat("fish"))
  println(oswald eat "milk")  //just to show another way of expressing it

  val when =  "AM" :: "PM" :: List()
  println(when.toString())
}