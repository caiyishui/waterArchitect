package com.example.water.mymobanapplication.singleton.singletonlazy;

/**
 * 懒汉式 --要用的时候采用问你有没有
 * Created by water on 2017/8/19.
 */

public class Singleton {
    private static Singleton instance;

    /**
     * 构造方法私有化
     */
    private Singleton(){

    }

    /**
     * 会影响性能
     * @return
     */
    public static synchronized   Singleton getInstance(){

        if (instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
