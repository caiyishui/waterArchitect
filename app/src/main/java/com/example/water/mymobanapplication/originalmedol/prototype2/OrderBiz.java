package com.example.water.mymobanapplication.originalmedol.prototype2;

/**
 * Created by water on 2018/1/10.
 */

public class OrderBiz {

    public void saveOrder(OrderApi order){
        while (order.getOrderProductNum()>1000){
            OrderApi newOrder=order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            System.out.println(newOrder);
            order.setOrderProductNum(order.getOrderProductNum()-1000);
        }
        System.out.println(order);
        //....
    }
}
