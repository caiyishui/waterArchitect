package com.example.water.mymobanapplication.strategy.strategy4;

/**
 * 数据库日志策略
 */
public class DBLog extends LogStrategyTemplate {

	@Override
	public void doLog(String msg) {
		//模拟出错
		if(msg.length() > 30){
			throw new RuntimeException("数据库连接断开！");
		}
		System.out.println("把："+msg+"保存到数据库");
	}

}
