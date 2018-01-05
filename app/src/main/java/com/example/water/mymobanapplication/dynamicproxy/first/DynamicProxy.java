package com.example.water.mymobanapplication.dynamicproxy.first;

import com.example.water.mymobanapplication.jingtaidaili.baohu.Order;
import com.example.water.mymobanapplication.jingtaidaili.baohu.OrderApi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 * Created by water on 2018/1/5.
 */

public class DynamicProxy implements InvocationHandler {
    OrderApi mOrderApi;
    public void setTarget(OrderApi orderApi){
        mOrderApi=orderApi;
    }
    /**
     * 要執行的方法
     * @param o
     * @param method
     * @param objects  執行的参数列表
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(""+method.getName());

        //只要是set方法都做权限都要检查
        if(method.getName().startsWith("set")){
            if(mOrderApi.getOrderUser()!=null&&mOrderApi.getOrderUser().equals(objects[1])){
                return method.invoke(mOrderApi,objects);
            }else {
                System.out.println("NO permission");
            }


        }else{
            return method.invoke(mOrderApi,objects);
        }
        return null;
    }
}
