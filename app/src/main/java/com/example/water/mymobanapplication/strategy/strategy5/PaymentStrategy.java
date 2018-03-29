package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 支付策略
 */
public interface PaymentStrategy {

	/**
	 * 支付算法
	 * @param context 支付上下文，包含算法所需的数据
	 */
	void pay(PaymentContext context);
	
}
