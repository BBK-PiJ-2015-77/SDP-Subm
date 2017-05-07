package composite

// TODO
case class HtmlParentElement(s: String) extends HtmlTag(s) {

  var startTag: String
  var endTag: String
  var childElements: List[HtmlTag] = List.empty
  var html: String

  override def setStartTag(tag: String): Unit = {startTag = tag}

  override def setEndTag(tag: String): Unit = {endTag = tag}

  override def generateHtml: Unit = {
    html = s"$startTag" + s"\n$endTag"
  }

  override def addChildTag(htmlTag: HtmlTag): Unit = {childElements :+= htmlTag}

  override def removeChildTag(htmlTag: HtmlTag): Unit = {childElements = childElements.filter(_ != htmlTag)}

}
