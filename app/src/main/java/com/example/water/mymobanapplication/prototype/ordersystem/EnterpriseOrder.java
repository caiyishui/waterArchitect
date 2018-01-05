package com.example.water.mymobanapplication.prototype.ordersystem;

/**
 * Created by water on 2017/9/3.
 */

public class EnterpriseOrder implements OrderApi {
    private String enterpriseName;
    private String prodectId;
    private int orderProductNum;
    @Override
    public int getOrderPrudectNum() {
        return orderProductNum;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getProdectId() {
        return prodectId;
    }

    public void setProdectId(String prodectId) {
        this.prodectId = prodectId;
    }

    public int getOrderProductNum() {
        return orderProductNum;
    }

    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public String toString() {
        return "EnterpriseOrder{" +
                "enterpriseName='" + enterpriseName + '\'' +
                ", prodectId='" + prodectId + '\'' +
                ", orderProductNum=" + orderProductNum +
                '}';
    }
}
