package com.example.water.mymobanapplication.strategy.strategy2;

/**
 * 地铁出行策略
 * @author Jason
 */
public class SubwayStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		if(km <= 6){
			return 3;
		}else if(km <= 12){
			return 4;
		}else if(km <= 22){
			return 5;
		}else if(km <= 32){
			return 6;
		}else{
			return 7;
		}
	}

}
