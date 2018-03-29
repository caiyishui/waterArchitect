package com.example.water.mymobanapplication.strategy.strategy2;

/**
 * 计算接口
 */
public interface CalculateStrategy {

	/**
	 * 计算费用
	 * @param km
	 * @return
	 */
	int calculatePrice(int km);
	
}
