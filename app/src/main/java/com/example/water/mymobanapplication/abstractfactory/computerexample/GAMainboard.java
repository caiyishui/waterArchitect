package com.example.water.mymobanapplication.abstractfactory.computerexample;

/**
 * 技嘉主板
 * Created by water on 2017/8/19.
 */

public class GAMainboard implements MainboardApi{
    /**
     * CPU插槽孔数
     */
    private int cpuHoles;

    public GAMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.print("技嘉主板，cpuHoles:"+cpuHoles);
    }
}
