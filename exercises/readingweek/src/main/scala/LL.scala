
trait Animal
trait Cat extends Animal
trait Dog extends Animal
case class Siamese(name: String) extends Cat
case class Sheltie(name: String) extends Dog

//invariant
sealed trait LinkedList[+A]
final case class Node[A](value: A, next: LinkedList[A]) extends LinkedList[A]
//final case class End[A]() extends LinkedList[A]
final case object End extends LinkedList[Nothing] //The type has to be able to accept all subclasses of A that was passed in, so we pass in Nothing

// Covariant Generic Sum Type Pattern
//
// sealed trait A[+T]
// final case class B[T](t: T) extends A[T]
// final case object C extends A[Nothing]

object LLMain extends App {
  val l = Node(Siamese("Fred"),
            Node(Sheltie("Rebbie"),
              Node(Siamese("Bertie"), End)))

  //The below wouldn't work, if we hadn't put A+ in the LinkedList type. If would see the first value (Siamese)
  // and create a list of that type and would not compile because it contains a Dog
  /**
  val l = Node(Siamese("Fred"),
            Node(Sheltie("Rebbie"),
              Node(Siamese("Bertie"), End())))
    */
  println(l)
}