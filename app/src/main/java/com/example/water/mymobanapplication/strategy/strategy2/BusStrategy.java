package com.example.water.mymobanapplication.strategy.strategy2;

/**
 * 公交出行策略
 */
public class BusStrategy implements CalculateStrategy {

	@Override
	public int calculatePrice(int km) {
		if(km<=10){
			return 1;
		}else{
			int d = km - 10;
			int y = d % 5;
			int total = 1 + (d / 5) * 1;
			if(y > 0){
				total +=1;
			}
			return total;
		}
	}

}
