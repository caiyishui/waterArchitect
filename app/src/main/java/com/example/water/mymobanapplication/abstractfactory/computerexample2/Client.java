package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * Created by water on 2017/8/19.
 */

public class Client {
    public  static void main(String[] args){
        ComputerEngineer engineer=new ComputerEngineer();
        //客户选择方案
        AbstractFactory schema=new Schema2();
        engineer.makeComputer(schema);
    }
}
