package abstractfactory

/**
  * Created by thomasmcgarry on 10/05/2017.
  */
class NYCParserFactory extends AbstractParserFactory{

  override def getParserInstance(parserType: String): XMLParser = parserType match{
    case "NYCORDER" => new NYCOrderXMLParser
    case "NYCERROR" => new NYCErrorXMLParser
    case "NYCFEEDBACK" => new NYCFeedbackXML
    case "NYCRESPONSE" => new NYCResponseXMLParser
  }

}
