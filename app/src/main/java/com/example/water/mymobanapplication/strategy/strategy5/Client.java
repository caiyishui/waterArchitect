package com.example.water.mymobanapplication.strategy.strategy5;

public class Client {

	public static void main(String[] args) {
		PaymentStrategy s1 = new RMBCash();
		PaymentStrategy s2 = new DollarCash();
		PaymentContext cxt = new PaymentContext("时泽明", 250000, s2);
		cxt.payNow();
		
		//只要一种策略的数据现有的上下文无法满足，就需要扩展一个上下文类
		PaymentStrategy s3 = new Card();
		PaymentContext2 cxt2 = new PaymentContext2("万全鹏", 30000, s3, "8888888888888888");
		cxt2.payNow();
		
		//不便于动态切换策略
		PaymentStrategy s4 = new Card2("666666666666666666");
		PaymentContext cxt3 = new PaymentContext("时泽明", 250000, s4);
		cxt3.payNow();
	}

}
