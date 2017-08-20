package com.example.water.mymobanapplication.abstractfactory.computerexample;

import com.example.water.mymobanapplication.abstractfactory.abfactory.AbstactProductA;
import com.example.water.mymobanapplication.abstractfactory.abfactory.AbstactProductB;

/**
 * 抽象工厂
 * Created by water on 2017/8/19.
 */

public interface AbstractFactory {
    /**
     * 生成A类型的产品
     * @return
     */
    CPUApi createProductA();

    /**
     * 生产B类型的产品
     * @return
     */
    MainboardApi createProductB();

}
