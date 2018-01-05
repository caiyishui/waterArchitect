package com.example.water.mymobanapplication.jingtaidaili.baohu;

/**
 * Created by water on 2018/1/5.
 */

public class Client {
    public static void main(String[] args){
        OrderApi orderApi=new OrderProxy(new Order("Mac Pro",2,"water"));
        orderApi.setOrderNum(3,"dd");

        System.out.println(orderApi.toString());

    }
}
