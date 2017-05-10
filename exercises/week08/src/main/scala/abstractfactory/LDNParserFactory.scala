package abstractfactory

/**
  * Created by thomasmcgarry on 10/05/2017.
  */
class LDNParserFactory extends AbstractParserFactory{

  override def getParserInstance(parserType: String): XMLParser = parserType match{
    case "LondonORDER" => new LDNOrderXMLParser
    case "LondonERROR" => new LDNErrorXMLParser
    case "LondonFEEDBACK" => new LDNFeedbackXML
    case "LondonRESPONSE" => new LDNResponseXMLParser
  }

}
