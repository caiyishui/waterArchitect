package com.example.water.mymobanapplication.strategy.strategy4;

/**
 * 文件日志策略
 */
public class FileLog extends LogStrategyTemplate {

	@Override
	public void doLog(String msg) {
		System.out.println("把："+msg+"保存到文件");
	}

}
