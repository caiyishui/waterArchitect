package com.example.water.mymobanapplication.singleton.singletoninnnerclass;

/**
 * 既能做到延迟加载，又能实现线程安全
 * Created by water on 2017/8/19.
 */

public class Singleton {
    private Singleton(){

    }
    private static class SingletonHolder{
        //静态内部类的属性实例化，由jvm保证线程的安全
        private  static Singleton instance=new Singleton();
    }
    //只有调用了getInstance方法之后，才会实例化SingletonHolder.instance属性
    public  static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
