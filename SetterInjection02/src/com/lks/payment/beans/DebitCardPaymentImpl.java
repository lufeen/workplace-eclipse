package com.lks.payment.beans;

public class DebitCardPaymentImpl implements IPayment {
public DebitCardPaymentImpl() {
	System.out.println("DC Payment:0-Param Constructor");
}
	@Override
	public boolean pay(double amount, int pin) {
		System.out.println("Connecting to Paypal..");
		return true;
	}

}
