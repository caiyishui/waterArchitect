package com.example.water.mymobanapplication.mediator.me1;

/**
 * 同事
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
