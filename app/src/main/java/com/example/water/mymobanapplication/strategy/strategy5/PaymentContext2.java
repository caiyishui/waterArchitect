package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 带支付卡号的支付上下文
 */
public class PaymentContext2 extends PaymentContext {

	//支付卡号
	private String cardNo;
	
	public PaymentContext2(String username, double money, PaymentStrategy strategy,String cardNo) {
		super(username, money, strategy);
		this.cardNo = cardNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}

}
