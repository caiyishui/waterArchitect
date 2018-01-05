package com.example.water.mymobanapplication.dynamicproxy.first;

import com.example.water.mymobanapplication.jingtaidaili.baohu.Order;
import com.example.water.mymobanapplication.jingtaidaili.baohu.OrderApi;

import java.lang.reflect.Proxy;

/**
 * Created by water on 2018/1/5.
 */

public class Client {
    public static void main(String[] atgs){
        //动态代理句柄
        DynamicProxy handler=new DynamicProxy();
        //将代理对象和目标对象进行绑定
        Order order=new Order("Mac Pro",3,"water");
        handler.setTarget(order);
        //代理对象 动态生成的class 实现了OrderApi的接口，使用这个class实例化了一个对象返回
        //有人自动帮我们创建了一个代理类，使用这个类实例化了一个对象放回给我们
        //并且再OrderProxy类中每一个方法被调用时做了手脚，都会调用handler的invoke方法

       OrderApi orderApi= (OrderApi) Proxy.newProxyInstance(order.getClass().getClassLoader(),//目标对象的类加载器
                order.getClass().getInterfaces(),//目标接口的所属类的父接口
               handler);//代理对象
        orderApi.getOrderNum();
        orderApi.getOrderUser();
        orderApi.setOrderNum(1,"dd");
        orderApi.setOrderUser("22","water");
    }
}
