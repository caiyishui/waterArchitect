package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 美元现金支付策略
 */
public class DollarCash implements PaymentStrategy {

	@Override
	public void pay(PaymentContext context) {
		System.out.println("现在给："+context.getUsername()+"支付美元现金："+context.getMoney()+"元");
	}

}
