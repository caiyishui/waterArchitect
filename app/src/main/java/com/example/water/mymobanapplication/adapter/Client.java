package com.example.water.mymobanapplication.adapter;

/**
 * Created by water on 2017/8/15.
 *
 */

public class Client {
    public static void main(String[] args){
        //Adapter将Adaptee适配成client需要的Target
        Adaptee adaptee=new AdapteeImpl();
        Target target=new Adapter(adaptee);
        target.request();
        //给一个新的接口，还是使用老的方法去使用
    }
}
