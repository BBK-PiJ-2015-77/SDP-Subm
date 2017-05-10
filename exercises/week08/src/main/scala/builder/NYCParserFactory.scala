package builder

import abstractfactory.{AbstractParserFactory, XMLParser}

/**
  * Created by thomasmcgarry on 10/05/2017.
  */
class NYCParserFactory extends AbstractParserFactory{

  override def getParserInstance(parserType: String): XMLParser = parserType match{
    case "NYCORDER" => new
    case "NYCERROR" =>
    case "NYCFEEDBACK" =>
    case "NYCRESPONSE" =>
  }

}
