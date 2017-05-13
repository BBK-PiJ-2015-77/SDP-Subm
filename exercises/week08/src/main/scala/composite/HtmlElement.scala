package composite

// TODO

case class HtmlElement(s: String) extends HtmlTag(s) {

  private var startTag: String = ""
  private var endTag: String = ""
  private var body: String = ""

  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def setTagBody(tagBody: String) = {body = tagBody}

  override def generateHtml: Unit = {
    println(s"$startTag$body$endTag")
  }

}
