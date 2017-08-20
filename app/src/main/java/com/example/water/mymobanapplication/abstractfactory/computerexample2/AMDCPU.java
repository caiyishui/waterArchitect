package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * AMDCPU实现
 * Created by water on 2017/8/19.
 */

public class AMDCPU implements CPUApi {
    private int pins;
    public AMDCPU(int pins){
        super();
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.print("AMDCPU计算 pins："+pins);
    }
}
