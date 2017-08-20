package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * Created by water on 2017/8/20.
 */

public class Schema2 implements AbstractFactory {
    @Override
    public Product createProduct(int type) {
        Product obj=null;
        switch (type){
            case 1:
                obj=new AMDCPU(939);
                break;
            case 2:
                obj=new MSIMainboard(939);
                break;
            case 3:
                obj=new KingstonMemory();
            default:
                break;


        }
        return obj;
    }
}
