package com.example.water.mymobanapplication.abstractfactory.abfactory;

/**
 * 创建具体产品簇2
 * Created by water on 2017/8/19.
 */

public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstactProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstactProductB createProductB() {
        return new ProductB2();
    }
}
