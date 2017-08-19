package com.example.water.mymobanapplication.abstractfactory.abfactory;

/**
 * Created by water on 2017/8/19.
 */

public class Client {
    public static void main(String[] args){
        AbstractFactory factory=new ConcreteFactory1();
        System.out.print(factory.createProductA()+"\n");
        System.out.print(factory.createProductB());

    }
}
