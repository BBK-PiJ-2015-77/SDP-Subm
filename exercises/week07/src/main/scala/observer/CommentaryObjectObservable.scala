package observer

import scala.collection.mutable.ListBuffer

/**
  * Created by thomasmcgarry on 14/05/2017.
  */
class CommentaryObjectObservable(subscribers: ListBuffer[Observer], title: String) extends CommentaryObject(subscribers, title) with Commentary{

  //var desc = ""

  def this(title: String){
    this(subscribers = ListBuffer.empty,title)
  }

  override def setDesc(desc: String): Unit = {
    details = desc
    notifyObservers()
  }
}
