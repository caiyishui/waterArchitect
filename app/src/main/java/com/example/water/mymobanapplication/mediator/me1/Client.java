package com.example.water.mymobanapplication.mediator.me1;

/**
 * Created by water on 2018/1/13.
 */

public class Client {
     public static void main(String[] args){
         //中介者
         ConcreteMediator cMediator=new ConcreteMediator();
         //同时A
         ConcreteColleagueA colleagueA=new ConcreteColleagueA(cMediator);
         //同事b
         ConcreteColleagueB colleagueB=new ConcreteColleagueB(cMediator);

         //中介者持有所有同事对象
         cMediator.setColleagueA(colleagueA);
         cMediator.setColleagueB(colleagueB);
         colleagueA.someOperation();


     }
}
