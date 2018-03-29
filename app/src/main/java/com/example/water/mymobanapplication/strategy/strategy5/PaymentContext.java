package com.example.water.mymobanapplication.strategy.strategy5;

/**
 * 支付上下文 用来 1.与支付策略进行交互 2.保存支付算法所需的数据
 *
 */
public class PaymentContext {

	// 支付给谁
	private String username;

	// 金额
	private double money;

	private PaymentStrategy strategy;

	public PaymentContext(String username, double money, PaymentStrategy strategy) {
		super();
		this.username = username;
		this.money = money;
		this.strategy = strategy;
	}

	/**
	 * 支付
	 */
	public void payNow() {
		strategy.pay(this);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

}
