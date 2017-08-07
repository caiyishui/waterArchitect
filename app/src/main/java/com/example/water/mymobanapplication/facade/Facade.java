package com.example.water.mymobanapplication.facade;

/**
 * Created by water on 2017/8/7.
 */

public class Facade {
    public void generate(){
        ModelModule module=new ModelModule();
        module.genarate();
        DaoModule daoModule=new DaoModule();
        daoModule.genarate();
        BizModule bizModule=new BizModule();
        bizModule.genarate();
    }
}
