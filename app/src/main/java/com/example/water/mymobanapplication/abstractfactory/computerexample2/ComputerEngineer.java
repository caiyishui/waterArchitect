package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * 装机工程师
 * Created by water on 2017/8/19.
 */

public class ComputerEngineer {

    public void makeComputer(AbstractFactory abstractFactory){
        //1.准备硬件
        prepareHardwares(abstractFactory);
        //2.组装
        //3.测试
        //4.准备硬件

    }

    /**
     * 准备硬件
     * @param
     */
    private void prepareHardwares(AbstractFactory schema)  {
        CPUApi cpu=(CPUApi) schema.createProduct(1);
        MainboardApi mainboard=(MainboardApi) schema.createProduct(2);
        MemoryApi memoryApi=(MemoryApi) schema.createProduct(3);
        //测试配件
        cpu.calculate();
        mainboard.installCPU();
        memoryApi.memorySave();
    }
}
