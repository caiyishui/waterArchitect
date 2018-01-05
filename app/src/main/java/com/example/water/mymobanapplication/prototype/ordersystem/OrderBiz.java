package com.example.water.mymobanapplication.prototype.ordersystem;

/**
 * 业务类
 * Created by water on 2017/9/3.
 */

public class OrderBiz {

    public void saveOrder(OrderApi orderApi){
        while (orderApi.getOrderPrudectNum()>1000){
            OrderApi neworder=null;
            if(orderApi instanceof PresonalOrder){
                neworder=new PresonalOrder();
//                new
            }else if(orderApi instanceof EnterpriseOrder){
                neworder=new EnterpriseOrder();
            }
            neworder.setOrderProductNum(1000);

            orderApi.setOrderProductNum(orderApi.getOrderPrudectNum()-1000);
        }
    }
}
