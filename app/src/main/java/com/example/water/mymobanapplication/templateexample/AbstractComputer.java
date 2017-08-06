package com.example.water.mymobanapplication.templateexample;

import android.util.Log;

/**
 * Created by water on 2017/8/6.
 */

public abstract class AbstractComputer  {
    protected  void powerOn(){
        Log.i("log","开启电源");
    }
    protected  void checkHardware(){
        Log.i("log","硬盘检查");
    }
    protected  void loadOS(){
        Log.i("log","载入操作系统");
    }
    protected  void login(){
        Log.i("log","login登陆");
    }

    /**
     * 模板方法定义算法的结构，不能够重写
     */
    public  final void startUp(){
        powerOn();
        checkHardware();
        loadOS();
        login();
    }
}

