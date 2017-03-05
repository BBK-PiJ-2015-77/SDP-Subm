/**
  * Created by thomasmcgarry on 16/02/2017.
  */
class WK4 {

  class Test {
    def foldLeft[A, B](ls: List[A], z: B)(f: (B, A) => B): B = ls match{
      //goes from head to tail
      case Nil => z
      case l :: ls => foldLeft(ls, f(z,l))(f)
    }

    def reverse[A](ls: List[A]): List[A] = {
      //case hd :: tl => foldLeft(hd :: tl, 0)((x,y) => y) :: reverse(tl) //need help
      foldLeft(Nil,ls)((x,y) => (y))
      //case hd :: tl => reverse(tl)::foldLeft(hd,Nil)((x,y) => y)
    }
  }

  object WK4Main extends App {
    val x =
  }

}
