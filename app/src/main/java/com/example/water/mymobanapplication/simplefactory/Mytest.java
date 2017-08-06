package com.example.water.mymobanapplication.simplefactory;

/**
 * Created by water on 2017/8/6.
 */

public class Mytest {
    public static  void main(String[] args){
        Api api=SimpleFactory.creteApi(2);
        api.opration();
    }
}
