package com.example.water.mymobanapplication.originalmedol.prototype;

/**
 * Created by water on 2018/1/10.
 */

public class ConcretePrototype1 implements Prototype {
    @Override
    public Prototype cloneme() {
        Prototype prototype=new ConcretePrototype1();
        return prototype;
    }
}
