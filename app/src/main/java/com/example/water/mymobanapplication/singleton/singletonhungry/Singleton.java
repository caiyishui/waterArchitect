package com.example.water.mymobanapplication.singleton.singletonhungry;

/**
 * 饿汉式
 * Created by water on 2017/8/19.
 */

public class Singleton {

    private static Singleton instance=new Singleton();
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    }
}
