package com.example.water.mymobanapplication.originalmedol.prototype;

/**
 * Created by water on 2018/1/10.
 */

public class Client {
    private Prototype mPrototype;

    public Client(Prototype prototype) {
        mPrototype = prototype;
    }
    public void operation(){
        //创建一个接口的对象
        Prototype prototype=mPrototype.cloneme();
    }
}
