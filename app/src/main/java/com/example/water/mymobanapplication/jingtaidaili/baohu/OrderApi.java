package com.example.water.mymobanapplication.jingtaidaili.baohu;

/**
 * Created by water on 2018/1/5.
 */

public interface OrderApi {

    String getProductName();

    void setProductName(String productName,String user);

    int getOrderNum();
    void setOrderNum(int num,String user);

    /**
     * 获取创建订单的人员
     * @return
     */
   String  getOrderUser();

    /**
     * 设置穿件订单的人员
     * @param orderUser 创建订单的人员
     * @param user 操作人员
     */
   void setOrderUser(String orderUser,String user);

}
