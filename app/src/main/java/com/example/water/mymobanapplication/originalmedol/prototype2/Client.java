package com.example.water.mymobanapplication.originalmedol.prototype2;

/**
 * Created by water on 2018/1/10.
 */

public class Client {
    public static void main(String[] args){
        PersonalOrder pOrder=new PersonalOrder();
        pOrder.setCustomerName("我的前任");
        pOrder.setProductId("P001");
        pOrder.setOrderProductNum(2999);

        EnterpriseOrder eOrder=new EnterpriseOrder();
        eOrder.setEnterpriseName("嘻哈");
        eOrder.setProductId("P002");
        eOrder.setOrderProductNum(3999);


        OrderBiz orderBiz=new OrderBiz();
        orderBiz.saveOrder(pOrder);
//        orderBiz.saveOrder(eOrder);
    }
}
