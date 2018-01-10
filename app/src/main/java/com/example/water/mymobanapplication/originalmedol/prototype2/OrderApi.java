package com.example.water.mymobanapplication.originalmedol.prototype2;

import com.example.water.mymobanapplication.jingtaidaili.baohu.Order;

/**
 * Created by water on 2018/1/10.
 */

public interface OrderApi {
    int getOrderProductNum();
    void setOrderProductNum(int num);
    OrderApi cloneOrder();
}
