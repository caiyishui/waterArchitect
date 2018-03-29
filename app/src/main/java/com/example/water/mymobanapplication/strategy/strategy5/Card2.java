package com.example.water.mymobanapplication.strategy.strategy5;

public class Card2 implements PaymentStrategy {
	
	private String cardNo;
	public Card2(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public void pay(PaymentContext context) {
		System.out.println("现在给："+context.getUsername()+"转账："+context.getMoney()+"元，账号："+cardNo);
	}

}
