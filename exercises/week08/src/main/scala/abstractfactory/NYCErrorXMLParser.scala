package abstractfactory

/**
  * Created by thomasmcgarry on 10/05/2017.
  */
class NYCErrorXMLParser extends XMLParser{
  override def parse: String = {
    "NYC Parsing error XML...\nNYC Error XML Message"
  }
}
