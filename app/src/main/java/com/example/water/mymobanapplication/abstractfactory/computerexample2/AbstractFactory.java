package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * 抽象工厂
 * Created by water on 2017/8/19.
 */

public interface AbstractFactory {
    /**
     * 生产电脑需要的配件
     * @return
     */
    Product createProduct(int type);



}
