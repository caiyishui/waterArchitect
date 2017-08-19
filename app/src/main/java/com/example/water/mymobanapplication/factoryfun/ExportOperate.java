package com.example.water.mymobanapplication.factoryfun;

/**
 * 导出操作
 * Created by water on 2017/8/19.
 */

public abstract class ExportOperate {
    /**
     * 这个可以使用带参数可以在里面加int 统一一个类里面就好了
     * @return
     */
    protected  abstract ExportFileApi factoryMethod();



    public boolean exprot(String data){
        //导出特定的文件
        ExportFileApi api=factoryMethod();
        return api.export(data);


    }
}
