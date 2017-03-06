package xpay

/**
  * Created by thomasmcgarry on 06/03/2017.
  */
class XpayToPayDAdapter extends PayD{
/**
  private var creditCardNo: String = null
  private var customerName: String = null
  private var cardExpMonth: String = null
  private var cardExpYear: String = null
  private var cardCVVNo: Short = 0
  private var amount: Double = .0
*/
  private var theXPayImpl: XpayImpl = _

  def this(newXpayImpl: XpayImpl) {
    this()
    theXPayImpl = newXpayImpl
  }


  def getCustCardNo: String = {
    theXPayImpl.getCreditCardNo
  }

  def setCustCardNo(custCardNo: String) {
    theXPayImpl.setCreditCardNo(custCardNo)
  }

  def getCardOwnerName: String

  def setCardOwnerName(cardOwnerName: String)

  def getCardExpMonthDate: String

  def setCardExpMonthDate(cardExpMonthDate: String)

  def getCVVNo: Integer

  def setCVVNo(cVVNo: Integer)

  def getTotalAmount: Double

  def setTotalAmount(totalAmount: Double)

}

class XpayImpl extends Xpay {
  private var creditCardNo: String = null
  private var customerName: String = null
  private var cardExpMonth: String = null
  private var cardExpYear: String = null
  private var cardCVVNo: Short = 0
  private var amount: Double = .0

  def getCreditCardNo: String = {
    return creditCardNo
  }

  def setCreditCardNo(creditCardNo: String) {
    this.creditCardNo = creditCardNo
  }

  def getCustomerName: String = {
    return customerName
  }

  def setCustomerName(customerName: String) {
    this.customerName = customerName
  }

  def getCardExpMonth: String = {
    return cardExpMonth
  }

  def setCardExpMonth(cardExpMonth: String) {
    this.cardExpMonth = cardExpMonth
  }

  def getCardExpYear: String = {
    return cardExpYear
  }

  def setCardExpYear(cardExpYear: String) {
    this.cardExpYear = cardExpYear
  }

  def getCardCVVNo: Short = {
    return cardCVVNo
  }

  def setCardCVVNo(cardCVVNo: Short) {
    this.cardCVVNo = cardCVVNo
  }

  def getAmount: Double = {
    return amount
  }

  def setAmount(amount: Double) {
    this.amount = amount
  }
}