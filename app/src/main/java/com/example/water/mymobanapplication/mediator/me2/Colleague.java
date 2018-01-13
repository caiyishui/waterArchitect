package com.example.water.mymobanapplication.mediator.me2;

import com.example.water.mymobanapplication.mediator.me2.Mediator;

/**
 * 同事类 电脑类的配件的父类
 * Created by water on 2018/1/13.
 */

public abstract class Colleague {
    //持有中介者對象
    private Mediator mMediator;

    public Colleague(Mediator mediator) {
        mMediator = mediator;
    }

    public Mediator getMediator() {
        return mMediator;
    }
}
