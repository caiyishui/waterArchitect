package com.example.water.mymobanapplication.jingtaidaili.baohu;

/**
 * Created by water on 2018/1/5.
 */

public class Order implements OrderApi {
    private String productName;
    private int orderNum;
    private String orderUser;

    public Order(String productName, int orderNum, String orderUser) {
        super();
        this.productName = productName;
        this.orderNum = orderNum;
        this.orderUser = orderUser;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public void setProductName(String productName, String user) {
        this.productName=productName;
    }

    @Override
    public int getOrderNum() {
        return orderNum;
    }

    @Override
    public void setOrderNum(int num, String user) {
        this.orderNum=num;
    }

    @Override
    public String getOrderUser() {
        return this.orderUser;
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
            this.orderUser=orderUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", orderNum=" + orderNum +
                ", orderUser='" + orderUser + '\'' +
                '}';
    }
}
