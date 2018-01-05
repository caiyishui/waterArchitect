package com.example.water.mymobanapplication.jingtaidaili.baohu;

/**
 * Created by water on 2018/1/5.
 */

public class OrderProxy implements OrderApi {

    private  Order mOrder;

    public OrderProxy(Order order) {
        super();
        mOrder = order;

    }

    @Override
    public String getProductName() {
        return mOrder.getProductName();
    }

    @Override
    public void setProductName(String productName, String user)  {
        if(user!=null&& user.equals(mOrder.getOrderUser())){

            mOrder.setProductName(productName,user);
        }else{
//            throw new IllegalAccessException("NO Permission");
            System.out.println("NO Permission");
        }
    }

    @Override
    public int getOrderNum() {
        return mOrder.getOrderNum();
    }

    @Override
    public void setOrderNum(int num, String user) {
        if(user!=null&& user.equals(mOrder.getOrderUser())){

            mOrder.setOrderNum(num,user);
        }else{
//            throw new IllegalAccessException("NO Permission");
            System.out.println("NO Permission");
        }
    }

    @Override
    public String getOrderUser() {
        return mOrder.getOrderUser();
    }

    @Override
    public void setOrderUser(String orderUser, String user) {
        if(user!=null&& user.equals(mOrder.getOrderUser())){

            mOrder.setOrderUser(orderUser,user);
        }else{
//            throw new IllegalAccessException("NO Permission");
            System.out.println("NO Permission");
        }
    }

    @Override
    public String toString() {
        return "OrderProxy{" +
                "mOrder=" + mOrder.toString() +
                '}';
    }
}
