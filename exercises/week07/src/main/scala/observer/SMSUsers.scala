package observer

class SMSUsers(s: Subject, msg: String) extends Observer {

  var description = ""

  def update(desc: String) = {
    description = desc
  }

  def subscribe() = {
    s.subscribeObserver(this)
    println(s"$msg subscribed")
  }

  def unSubscribe() = {
    s.unSubscribeObserver(this)
    println(s"$msg unsubscribed")
  }

//  def getName(): String = {
//    msg
//  }

}
