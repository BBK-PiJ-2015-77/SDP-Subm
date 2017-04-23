package actor

/**
  * Created by thomasmcgarry on 22/04/2017.
  */
object TeacherProtocol {

  case class QuoteRequest()
  case class QuoteResponse(quoteString: String)

}
