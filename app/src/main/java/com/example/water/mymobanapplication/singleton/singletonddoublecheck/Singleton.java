package com.example.water.mymobanapplication.singleton.singletonddoublecheck;

/**
 * Created by water on 2017/8/19.
 */

public class Singleton {
    //volatile 1.4以后出现的，这个作用，当instance 在其他线程有改变了，就会通知另外的线程
    private volatile static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if(instance==null){
            synchronized(Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
