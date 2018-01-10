package com.example.water.mymobanapplication.originalmedol.prototype;

/**
 * Created by water on 2018/1/10.
 */

public class Test {
    public static void main(String[] args){
        Prototype p=new ConcretePrototype1();
        Client c=new Client(p);
        c.operation();



    }
}
