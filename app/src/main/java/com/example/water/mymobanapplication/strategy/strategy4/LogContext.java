package com.example.water.mymobanapplication.strategy.strategy4;

public class LogContext {

	public void log(String msg){
		//数据库策略
		DBLog db = new DBLog();
		try {
			db.log(msg);
		} catch (Exception e) {
			e.printStackTrace();
			//发生异常，使用文件日志策略
			FileLog f = new FileLog();
			f.log(msg);
		}
	}

}
