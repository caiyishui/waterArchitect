package com.example.water.mymobanapplication.strategy.strategy3;

/**
 * 文件日志策略
 */
public class FileLog implements LogStrategy {

	@Override
	public void log(String msg) {
		System.out.println("把"+msg+"保存到文件中！");
	}

}
