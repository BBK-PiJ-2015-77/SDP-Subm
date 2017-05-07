package composite

// TODO

case class HtmlElement(s: String) extends HtmlTag(s) {

  var startTag: String
  var endTag: String
  var bodyTag: String

  override def setStartTag(tag: String): Unit = {startTag = tag}

  override def setEndTag(tag: String): Unit = {endTag = tag}

  override def setTagBody(tagBody: String): Unit = {bodyTag = tagBody}

  override def generateHtml: Unit = ???

}
