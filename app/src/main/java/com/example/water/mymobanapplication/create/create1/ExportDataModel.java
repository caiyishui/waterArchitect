package com.example.water.mymobanapplication.create.create1;

/**
 * 输出数据的对象
 * Created by water on 2017/8/27.
 */

public class ExportDataModel {
    /**
     * 产品id
     */
    private String productId;
    /**
     * 产品价格
     */
    private double price;
    /**
     * 产品数量
     */
    private double amount;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
