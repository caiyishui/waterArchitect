package com.example.water.mymobanapplication.strategy.strategy4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日志策略模板
 */
public abstract class LogStrategyTemplate implements LogStrategy {

	/**
	 * 模板方法
	 * @param msg
	 */
	public final void log(String msg){
		//1.获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		msg = sdf.format(new Date()) +"内容是："+msg;
		//2.保存日志
		doLog(msg);
	}
	
	@Override
	public abstract void doLog(String msg);

}
