package com.example.water.mymobanapplication.abstractfactory.abfactory;

/**
 * 抽象工厂
 * Created by water on 2017/8/19.
 */

public interface AbstractFactory {
    /**
     * 生成A类型的产品
     * @return
     */
    AbstactProductA createProductA();

    /**
     * 生产B类型的产品
     * @return
     */
    AbstactProductB createProductB();

}
