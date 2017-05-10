package abstractfactory

import builder.NYCParserFactory

object ParserFactoryProducer {

  def getFactory(s: String) = s match {
    case "NYCFactory" => new NYCParserFactory.getParserInstance(...)
  }

}
