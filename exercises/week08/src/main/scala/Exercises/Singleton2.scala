package Exercises


object Singleton2 {
  var args = 0
  lazy val x = args
  def apply(arg: Int): Singleton2 = {
    args = arg
    println(s"The value of x is $x")
    //putting 's' at the beginning makes it an interpolated string
    //this makes it possible to input values preceeded by $ without having to
    //open and close quotation marks
  }
}

class Singleton2 private()

case class SingletonCC private() // this basically does all of the above

object Main extends App{
  val xx = Singleton2
  xx.apply(3)

  val yy = Singleton2
  yy.apply(410)
}
