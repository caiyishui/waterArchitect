package com.example.water.mymobanapplication.abstractfactory.computerexample;

import com.example.water.mymobanapplication.abstractfactory.abfactory.*;

/**
 * Created by water on 2017/8/20.
 */

public class Schema2 implements AbstractFactory {
    @Override
    public CPUApi createProductA() {
        return  new AMDCPU(939);
    }

    @Override
    public MainboardApi createProductB() {
        return new MSIMainboard(939);
    }
}
