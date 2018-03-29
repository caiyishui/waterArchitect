package com.example.water.mymobanapplication.strategy.strategy2;

public class Client {

	public static void main(String[] args) {
		CalculateStrategy s1 = new BusStrategy();
		CalculateStrategy s2 = new SubwayStrategy();
		CalculateStrategy s3 = new TaxiStrategy();
		TrafficCalculator c = new TrafficCalculator();
		c.setStrategy(s3);
		int r = c.calculate(20);
		System.out.println("交通费用："+r);
	}

}
