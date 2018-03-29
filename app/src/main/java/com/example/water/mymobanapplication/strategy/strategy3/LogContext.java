package com.example.water.mymobanapplication.strategy.strategy3;

public class LogContext {

	public void log(String msg){
		//保存到数据库中
		DBLog db = new DBLog();
		try {
			db.log(msg);
		} catch (Exception e) {
			e.printStackTrace();
			//日志保存到数据库出现异常，写入文件
			FileLog f = new FileLog();
			f.log(msg);
		}
	}
	
}
