package com.example.water.mymobanapplication.prototype.ordersystem;

/**
 * Created by water on 2017/9/3.
 */

public class Client {
    public  static  void main(String[] args){
        PresonalOrder presonalOrder=new PresonalOrder();
        presonalOrder.setOrderProductNum(2000);
        presonalOrder.setPersonalName("蟑螂");
        presonalOrder.setProdectId("A001") ;
        EnterpriseOrder enterpriseOrder=new EnterpriseOrder();
        enterpriseOrder.setProdectId("A002");
        enterpriseOrder.setOrderProductNum(3000);
        enterpriseOrder.setEnterpriseName("腾讯");
        OrderBiz orderBiz=new OrderBiz();
        orderBiz.saveOrder(presonalOrder);

    }
}
