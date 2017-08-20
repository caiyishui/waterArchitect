package com.example.water.mymobanapplication.abstractfactory.computerexample;

import com.example.water.mymobanapplication.abstractfactory.abfactory.*;

/**
 * Created by water on 2017/8/20.
 */

public class Schema1 implements AbstractFactory {
    @Override
    public CPUApi createProductA() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboardApi createProductB() {
        return new GAMainboard(1156);
    }
}
