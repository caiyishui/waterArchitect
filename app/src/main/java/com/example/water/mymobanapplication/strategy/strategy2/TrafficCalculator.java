package com.example.water.mymobanapplication.strategy.strategy2;

/**
 * Context上下文
 */
public class TrafficCalculator {

	private CalculateStrategy strategy;

	/**
	 * 计算
	 * @param km
	 * @return
	 */
	public int calculate(int km){
		if(strategy == null){
			strategy = new BusStrategy();
		}
		return strategy.calculatePrice(km);
	}
	
	
	public void setStrategy(CalculateStrategy strategy) {
		this.strategy = strategy;
	}
	
}
