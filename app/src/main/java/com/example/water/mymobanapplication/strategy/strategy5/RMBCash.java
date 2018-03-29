package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 人民币现金支付策略
 */
public class RMBCash implements PaymentStrategy {

	@Override
	public void pay(PaymentContext context) {
		System.out.println("现在给："+context.getUsername()+"支付人民币现金："+context.getMoney()+"元");
	}

}
