package xpay

/**
  * Created by thomasmcgarry on 06/03/2017.
  */
class AdapterMain extends App {

  val xPayCard = new XpayImpl

  val CVV: Short = 123

  xPayCard.setAmount(100.0)
  xPayCard.setCardExpMonth("May")
  xPayCard.setCardCVVNo(CVV)
  xPayCard.setCustomerName("McGarry")
  xPayCard.setCreditCardNo("1234 5678 9876 5432")
  xPayCard.setCardExpYear("2021")

  val payDCard = new XpayToPayDAdapter(xPayCard)

  println("Amount : " + payDCard.getCardExpMonthDate)
  println("Expiry month : " + payDCard.getCardExpMonthDate)
  println("CVV No. : " + payDCard.getCardExpMonthDate)
  println("Customer name: " + payDCard.getCardExpMonthDate)
  println("Credit Card No. : " + payDCard.getCardExpMonthDate)
  println("Expiry year : " + payDCard.getCardExpMonthDate)

}
