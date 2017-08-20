package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * interCPU的实现
 * Created by water on 2017/8/19.
 */

public class IntelCPU implements CPUApi {
    /**
     * 针脚数目
     */
    private int pins;
    public  IntelCPU(int pins){
        super();
        this.pins=pins;
    }
    @Override
    public void calculate() {
        System.out.print("InterCPU 计算,pins"+pins);
    }
}
