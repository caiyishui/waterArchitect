package com.example.water.mymobanapplication.mediator.me1;

/**
 * Created by water on 2018/1/13.
 */

public class ConcreteColleagueA extends Colleague{
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    /**
     * 執行某些业务功能
     */
    public void someOperation(){
        getMediator().change(this);
    }
}
