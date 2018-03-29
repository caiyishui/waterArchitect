package com.example.water.mymobanapplication.strategy.strategy;

/**
 * 上下文，负责与策略对象进行交互
 * 
 * @author Jason QQ: 1476949583
 * @date 2016年1月8日
 * @version 1.0
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void contextInterface(){
		//调用策略对象的算法
		strategy.algorithm();
	}
}
