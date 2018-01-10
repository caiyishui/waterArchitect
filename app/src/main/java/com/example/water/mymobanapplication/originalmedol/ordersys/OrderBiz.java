package com.example.water.mymobanapplication.originalmedol.ordersys;

/**
 * Created by water on 2018/1/10.
 */

public class OrderBiz {

    public void saveOrder(OrderApi order){
        while (order.getOrderProductNum()>1000){
            OrderApi newOrder=null;
            if(order instanceof PersonalOrder){
                PersonalOrder p1=(PersonalOrder) order;
                PersonalOrder p2=new PersonalOrder();
                p2.setProductId(p1.getProductId());
                p2.setCustomerName(p1.getCustomerName());
                newOrder=p2;
            }else if(order instanceof EnterpriseOrder){
                EnterpriseOrder e1=(EnterpriseOrder)order;
                EnterpriseOrder e2=new EnterpriseOrder();
                e2.setProductId(e1.getProductId());
                e2.setEnterpriseName(e1.getEnterpriseName());
                newOrder =e2;
            }
            if(newOrder!=null){

                newOrder.setOrderProductNum(1000);
            }
            order.setOrderProductNum(order.getOrderProductNum()-1000);
        }
        //....
    }
}
