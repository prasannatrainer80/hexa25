package com.java.enm;

enum Wallet {
	PHONEPE,GPAY,PAYPAL,PAYTM
}

class Payment {
	
	int paymentId;
	double payMentAmount;
	Wallet wallet;
	
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", payMentAmount=" + payMentAmount + ", wallet=" + wallet + "]";
	}
	
}

public class EnumEx3 {
	public static void main(String[] args) {
		Payment payment1 = new Payment();
		payment1.paymentId = 1;
		payment1.wallet = Wallet.PHONEPE;
		payment1.payMentAmount = 88244.22;
		
		Payment payment2 = new Payment();
		payment2.paymentId = 2;
		payment2.wallet = Wallet.PAYPAL;
		payment2.payMentAmount = 78773.22;
		
		System.out.println(payment1);
		System.out.println(payment2);
	}
}
