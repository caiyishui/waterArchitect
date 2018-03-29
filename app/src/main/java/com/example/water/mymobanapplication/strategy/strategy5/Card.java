package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 银行卡支付策略
 */
public class Card implements PaymentStrategy {

	@Override
	public void pay(PaymentContext context) {
		PaymentContext2 cxt = (PaymentContext2) context;
		System.out.println("现在给："+context.getUsername()+"转账："+context.getMoney()+"元，账号："+cxt.getCardNo());
	}

}
