package com.example.water.mymobanapplication.templateexample;

import android.util.Log;

/**
 * Created by water on 2017/8/6.
 */

public class MulitaryComputer extends  AbstractComputer {
    @Override
    protected void checkHardware() {
        Log.i("log","防火墙检查");
    }

    @Override
    protected void login() {
        Log.i("log","指纹识别");
    }
}
