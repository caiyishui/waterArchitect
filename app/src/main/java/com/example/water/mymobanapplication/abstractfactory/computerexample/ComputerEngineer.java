package com.example.water.mymobanapplication.abstractfactory.computerexample;

/**
 * 装机工程师
 * Created by water on 2017/8/19.
 */

public class ComputerEngineer {
    public void makeComputer(int cpuType,int mainboardType){
        //1.准备硬件
        prepareHardwares(cpuType,mainboardType);
        //2.组装
        //3.测试
        //4.准备硬件

    }

    /**
     * 准备硬件
     * @param type
     * @param mainboardType
     */
    private void prepareHardwares(int type, int mainboardType) {
        CPUApi cpu=CPUFactory.createCPUApi(type);
        MainboardApi mainboard=MainboardFactory.createMainboardApi(mainboardType);
        //测试配件
        cpu.calculate();
        mainboard.installCPU();

    }
}
