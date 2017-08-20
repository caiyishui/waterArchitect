package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * 方案1
 * Created by water on 2017/8/20.
 */

public class Schema1 implements AbstractFactory {
    @Override
    public Product createProduct(int type) {
        Product obj=null;
        switch (type){
            case 1:
                obj=new IntelCPU(1156);
                break;
            case 2:
                obj=new GAMainboard(1156);
                break;
            case 3:
                obj=new SamSungMemory();
            default:
                break;


        }
        return obj;
    }
}
