package observer

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {

  var details = ""

//  def this(title: String){
//    var subscribers: ListBuffer[Observer] = ListBuffer.empty
//    this(subscribers,title)
//  }

  def subscribeObserver(observer: Observer) = subscribers += observer

  def unSubscribeObserver(observer: Observer) = {
    subscribers -= observer
  }

  def notifyObservers() = {
    var i = 1
    for(subscriber <- subscribers){
      subscriber.update(details)
      println(s"User $i :" + details)
      i+=1
    }
  }

  def subjectDetails: String = details

}
