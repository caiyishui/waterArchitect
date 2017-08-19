package com.example.water.mymobanapplication.abstractfactory.computerexample;

/**
 * 微星主板
 * Created by water on 2017/8/19.
 */

public class MSIMainboard implements MainboardApi {
    private int cpuHoles;

    public MSIMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.print("微星主板 cpuHoles："+cpuHoles);
    }
}
