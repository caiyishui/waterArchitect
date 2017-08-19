package com.example.water.mymobanapplication.abstractfactory.computerexample;

/**
 * Created by water on 2017/8/19.
 */

public class CPUFactory {
    /**
     * 生产cpu的工厂
     * @param type 1生成intel的cpu，2amdcpu
     * @return
     */
    public static CPUApi createCPUApi(int type){
        CPUApi cpu=null;
        switch (type){
            case 1:
                cpu=new IntelCPU(1156);
                break;
            case 2:
                cpu=new AMDCPU(939);
                break;
            default:
                break;
        }
        return cpu;
    }
}
