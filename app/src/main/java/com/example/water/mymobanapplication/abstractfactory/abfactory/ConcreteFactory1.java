package com.example.water.mymobanapplication.abstractfactory.abfactory;

/**
 * 创建具体产品簇1
 * Created by water on 2017/8/19.
 */

public class ConcreteFactory1 implements  AbstractFactory{

    @Override
    public AbstactProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstactProductB createProductB() {
        return new ProductB1();
    }
}
