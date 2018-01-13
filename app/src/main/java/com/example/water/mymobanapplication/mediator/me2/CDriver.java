package com.example.water.mymobanapplication.mediator.me2;


import com.example.water.mymobanapplication.mediator.me1.*;

/**
 * 光驱类
 * Created by water on 2018/1/13.
 */

public class CDriver extends Colleague {
    private String data;
    public CDriver(Mediator mediator) {
        super(mediator);
    }
    //读取数据
    public void readCD(){
        this.data="设计模式是什么,是巨人的总结";
        //通知主板
        this.getMediator().change(this);
    }
    public String getData(){
        return data;
    }
}
