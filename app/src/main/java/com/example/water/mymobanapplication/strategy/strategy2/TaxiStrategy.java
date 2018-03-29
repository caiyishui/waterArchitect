package com.example.water.mymobanapplication.strategy.strategy2;

/**
 * 出租车出行策略
 */
public class TaxiStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		return km * 2;
	}

}
