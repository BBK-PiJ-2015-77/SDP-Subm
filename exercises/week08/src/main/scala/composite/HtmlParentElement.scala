package composite

// TODO
case class HtmlParentElement(s: String) extends HtmlTag(s) {

  private var startTag: String = ""
  private var endTag: String = ""
  private var list: List[HtmlTag] = Nil


  override def setStartTag(tag: String): Unit = startTag = tag

  override def setEndTag(tag: String): Unit = endTag = tag

  override def addChildTag(htmlTag: HtmlTag) = {list:+=htmlTag}

  override def removeChildTag(htmlTag: HtmlTag) = {list.filter(_ != htmlTag)}

  override def generateHtml: Unit = {
    println(startTag)
    for(html <- list){
      html.generateHtml
    }
    println(endTag)
  }

}
