package com.example.water.mymobanapplication.originalmedol.prototype2;

/**
 * 个人订单
 * Created by water on 2018/1/10.
 */

public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private int orderProductNum;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order=new PersonalOrder();
        order.setCustomerName(customerName);
        order.setProductId(productId);
        order.setOrderProductNum(orderProductNum);
        return order;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public String toString() {
        return "PersonalOrder{" +
                "customerName='" + customerName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
