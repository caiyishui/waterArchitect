package com.example.water.mymobanapplication.jingtaidaili.first;

/**
 * Created by water on 2018/1/5.
 * 代理对象
 */

public class Proxy  implements Subject{
    private  RealSubject mRealSubject;
    public Proxy(RealSubject realSubject){
        super();
        this.mRealSubject=realSubject;
    }
    @Override
    public void request() {
        //再调用具体方法时干一些事情
        request();
        //再调用后具体方法时干一些事情
    }
}
