package com.example.water.mymobanapplication.strategy.strategy;

public class Client {

	public static void main(String[] args) {
		Strategy s1 = new ConcreteStrategyA();
		Strategy s2 = new ConcreteStrategyB();
		Context context = new Context(s2);
		context.contextInterface();
	}

}
