package com.example.water.mymobanapplication.mediator.me1;

/**
 * 具体中介者实现
 * Created by water on 2018/1/13.
 */

public class ConcreteMediator implements Mediator {
    private ConcreteColleagueA mColleagueA;
    private ConcreteColleagueB mColleagueB;


    public ConcreteColleagueA getColleagueA() {
        return mColleagueA;
    }

    public void setColleagueA(ConcreteColleagueA colleagueA) {
        mColleagueA = colleagueA;
    }

    public ConcreteColleagueB getColleagueB() {
        return mColleagueB;
    }

    public void setColleagueB(ConcreteColleagueB colleagueB) {
        mColleagueB = colleagueB;
    }

    @Override
    public void change(Colleague colleague) {
    //如果A改变了之后
        System.out.println("A--------------");

        System.out.println("B--------------");

    }
}
