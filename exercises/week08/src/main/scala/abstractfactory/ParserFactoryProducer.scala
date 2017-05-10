package abstractfactory

object ParserFactoryProducer {

  def getFactory(s: String) = s match {
    case "NYCFactory" => new NYCParserFactory
    //case "LDNFactory" => new LDNParserFactory
  }

}
