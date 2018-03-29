package com.example.water.mymobanapplication.strategy.traffic;

/**
 * 计算交通费用
 */
public class PriceCalculator {
	
	public static final int TYPE_BUS = 1;
	public static final int TYPE_SUBWAY = 2;
	public static final int TYPE_TAXI = 3;
	
	/**
	 * 公交费用，10公里以内，1元，超过10公里，每5公里一元
	 * @param km
	 * @return
	 */
	private int busPrice(int km){
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
	
	/**
	 * 	6公里（含）以内，3元
		6-12公里（含），4
		12-22公里（含），5元
		22-32公里（含），6元
		超过7
	 * @param km
	 * @return
	 */
	private int subwayPrice(int km){
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
	/**
	 * 打的
	 * @param km
	 * @return
	 */
	private int taxiPrice(int km){
		return km * 2;
	}
	
	public int calculatePrice(int km,int type){
		switch (type) {
		case TYPE_BUS:
			return busPrice(km);
		case TYPE_SUBWAY:
			return subwayPrice(km);	
		case TYPE_TAXI:
			return taxiPrice(km);
		default:
			throw new IllegalArgumentException("没有这种类型！");
		}
	}
	

	public static void main(String[] args) {
		PriceCalculator c = new PriceCalculator();
		int r = c.calculatePrice(20, PriceCalculator.TYPE_TAXI);
		System.out.println("交通费用："+r+"元");
	}

}
