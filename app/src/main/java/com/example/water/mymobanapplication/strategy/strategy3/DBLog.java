package com.example.water.mymobanapplication.strategy.strategy3;

/**
 * 数据库日志策略
 */
public class DBLog implements LogStrategy {

	@Override
	public void log(String msg) {
		//模拟出错
		if(msg.length() > 5){
			throw new RuntimeException("数据库连接断开！");
		}
		System.out.println("把"+msg+"记录到数据库中");
	}

}
