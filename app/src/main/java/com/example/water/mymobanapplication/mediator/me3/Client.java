package com.example.water.mymobanapplication.mediator.me3;

/**
 * Created by water on 2018/1/13.
 */

public class Client {
    public static void main(String[] args){
        DepUserMediator mediator=DepUserMediator.getmInstance();

        User user=new User();
        user.setUserId("U01");
        user.dismiss();

        mediator.showUserDeps();

        Department department=new Department();
        department.setDepid("DEP01");
        department.deleteDep();
        mediator.showUserDeps();
    }
}
