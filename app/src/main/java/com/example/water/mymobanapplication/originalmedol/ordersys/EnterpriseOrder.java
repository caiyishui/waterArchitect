package com.example.water.mymobanapplication.originalmedol.ordersys;

/**
 * Created by water on 2018/1/10.
 */

public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String productId;
    private int orderProductNum;


    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
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
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", productId='" + productId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
