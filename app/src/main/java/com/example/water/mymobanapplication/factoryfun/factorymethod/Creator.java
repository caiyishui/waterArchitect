package com.example.water.mymobanapplication.factoryfun.factorymethod;

/**
 * 创建器
 * Created by water on 2017/8/19.
 */

public abstract class Creator {
    /***
     * 创建产品的工厂方法
     *
     */
    protected  abstract  Product factoryMethod();

    public void someOpretion(){
         Product p =factoryMethod();
        //使用产品
        //do something
    }
}
