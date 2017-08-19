package com.example.water.mymobanapplication.singleton.singletonenum;

/**
 * Created by water on 2017/8/19.
 */

public enum EnumSingleton {
    instance;
    public void operate(){
        System.out.print("EnumSingleton...枚举方法");
    }
}
