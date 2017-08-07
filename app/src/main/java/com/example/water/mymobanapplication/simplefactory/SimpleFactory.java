package com.example.water.mymobanapplication.simplefactory;

/**
 * Created by water on 2017/8/6.
 */

public class SimpleFactory {
    /**
     * 构造方法最好私有的
     */
    private SimpleFactory(){

    }
    /**
     * 提供一个创建对象的方法
     * 客户端和模块的耦合度
     *可以根据具体的情况产生具体的实现类应用场景bitmapFactory
     * @return
     */
    public static Api creteApi(int positon){
        switch (positon){
            case 1:
                return new IApiA();

            case 2:
                return  new IApiB();
            default:
                break;


        }
       return  null;
    }
}
