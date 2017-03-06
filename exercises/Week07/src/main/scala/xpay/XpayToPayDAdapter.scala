package xpay

/**
  * Created by thomasmcgarry on 06/03/2017.
  */
class XpayToPayDAdapter extends PayD{

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

  def getCardOwnerName: String = {
    theXPayImpl.getCustomerName
  }

  def setCardOwnerName(cardOwnerName: String) {
    theXPayImpl.setCustomerName(cardOwnerName)
  }

  def getCardExpMonthDate: String = {
    theXPayImpl.getCardExpMonth
  }

  def setCardExpMonthDate(cardExpMonthDate: String) {
    theXPayImpl.setCardExpMonth(cardExpMonthDate)
  }

  def getCVVNo: Integer = {
    theXPayImpl.getCardCVVNo
  }

  def setCVVNo(cVVNo: Integer) {
    theXPayImpl.setCardCVVNo(cVVNo.toShort)
  }

  def getTotalAmount: Double = {
    theXPayImpl.getAmount
  }

  def setTotalAmount(totalAmount: Double) {
    theXPayImpl.setAmount(totalAmount)
  }

}
