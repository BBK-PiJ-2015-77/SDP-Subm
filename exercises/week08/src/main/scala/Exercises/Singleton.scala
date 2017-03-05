package Exercises

//immutable singleton

object Singleton {
  var args = 0
  lazy val x = args
  def apply(arg: Int): Singleton = {
    args = arg
    println(s"The value of x is $x")
    //putting 's' at the beginning makes it an interpolated string
    //this makes it possible to input values preceeded by $ without having to
    //open and close quotation marks
  }
}

class Singleton private()

object Main extends App{
  val xx = Singleton
  xx.apply(3)

  val yy = Singleton
  yy.apply(410)
}
