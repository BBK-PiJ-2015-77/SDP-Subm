package strategy


case class TextEditor(formatter: TextFormatter) {

  //var txtFormatter: TextFormatter = formatter

  def publishText(s: String) = {
    //val str: String = formatter.format(s)
    println(formatter.format(s))
  }

}
