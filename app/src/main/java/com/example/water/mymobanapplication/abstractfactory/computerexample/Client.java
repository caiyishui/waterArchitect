package com.example.water.mymobanapplication.abstractfactory.computerexample;

/**
 * Created by water on 2017/8/19.
 */

public class Client {
    public  static void main(String[] args){
        ComputerEngineer engineer=new ComputerEngineer();
        engineer.makeComputer(1,1);
    }
}
