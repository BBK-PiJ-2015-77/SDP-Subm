package Exercises

import scala.util.Try

/**
  * Created by thomasmcgarry on 02/03/2017.
  */
class ObjectExample {

  def sum(optionA: Option[Int], optionB: Option[Int]): Option[Int] =
    optionA.flatMap(a => optionB.map(b => a + b))

  //check what he did in the lecture - v.good
  //this is a standard functional pattern
  //drill yourself on what these do!
  //you can use a for comprehension loop
  //when things are abstracted out from observing repeated structures - these are called Monads

  val optionA = readInt("12")
  val optionB = readInt("34")

  for {
    a <- optionA
    b <- optionB
  } yield a + b


  //Example//

  for{
    a <- getFrstNumber //getFirstNumber returns Option[Int]
    b <- getSecondNumber //getSecondNumber returns Option[Int]
  } yield a + b

  // Option[Int]

  for{
    a <- getFrstNumber //getFirstNumber returns Seq[Int]
    b <- getSecondNumber //getSecondNumber returns Seq[Int]
  } yield a + b

  // Seq[Int]

  for{
    a <- getFrstNumber //getFirstNumber returns Future[Int]
    b <- getSecondNumber //getSecondNumber returns Future[Int]
  } yield a + b

  // Future[Int]

  //Monads allow us to abstract the three examples above to create a general case



  //Example2//

  object Monads extends App {
    val opt1 = Some(1)
    val opt2 = Some(2)
    val opt3 = Some(3)

    val seq1 = Seq(1)
    val seq2 = Seq(2)
    val seq3 = Seq(3)

    val try1 = Try(1)
    val try2 = Try(2)
    val try3 = Try(3)

    for {
      x <- opt1
      y <- opt2
      z <- opt3
    } yield x + y + z

    for {
      x <- seq1
      y <- seq2
      z <- seq3
    } yield x + y + z

    for {
      x <- try1
      y <- try2
      z <- try3
    } yield x + y + z

  }


}
