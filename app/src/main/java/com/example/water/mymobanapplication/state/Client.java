package com.example.water.mymobanapplication.state;

/**
 * @author caiys
 * @date 2018/3/29.
 * @description
 */

public class Client {
    public static void main(String[] args){
        ContextState contextState=new ContextState();
        contextState.setIstate(new WaterRuner());
        contextState.run();



    }
}
