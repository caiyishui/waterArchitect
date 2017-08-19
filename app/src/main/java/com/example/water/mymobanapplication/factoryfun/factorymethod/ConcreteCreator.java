package com.example.water.mymobanapplication.factoryfun.factorymethod;

/**
 * 具体的创建器
 * Created by water on 2017/8/19.
 */

public class ConcreteCreator extends  Creator{
    @Override
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}
