package com.lks.payment.beans;

public class CreditCardPaymentImpl implements IPayment {
 public CreditCardPaymentImpl() {
	System.out.println("CCD Payment:0-param constructor");
}
	@Override
	public boolean pay(double amount, int pin) {
		System.out.println("Connecting to Paypal...");
		return true;
	}

}
