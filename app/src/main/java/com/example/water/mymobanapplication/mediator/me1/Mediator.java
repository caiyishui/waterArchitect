package com.example.water.mymobanapplication.mediator.me1;

/**
 * Created by water on 2018/1/13.
 */

public interface Mediator {
    //自己改变了，通知主板的方法，让中介者通知其他的colleague，进行交互
    void change(Colleague colleague);
}
