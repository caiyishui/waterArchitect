package com.example.water.mymobanapplication.adapter;

/**
 *简单适配器模式
 * 将两个不相关联的接口连接起来了
 * Created by water on 2017/8/15.
 */

public class Adapter implements Target {

    private Adaptee mAdaptee;

    public Adapter(Adaptee adaptee) {
        super();
        mAdaptee = adaptee;
    }

    @Override
    public void request() {
        mAdaptee.specificalRequest();
    }
}
