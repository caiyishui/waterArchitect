package com.example.water.mymobanapplication.abstractfactory.computerexample2;

/**
 * 主板工厂
 * Created by water on 2017/8/19.
 */

public class MainboardFactory {
    /**
     * 主板
     * @param type 1.技嘉主板(1156) 2.微星主板(939)
     * @return
     */
    public static  MainboardApi createMainboardApi(int type){
        MainboardApi mainboardApi=null;
        switch (type){
            case 1:
                mainboardApi=new GAMainboard(1156);
                break;
            case 2:
                mainboardApi=new MSIMainboard(939);
                break;

        }
        return mainboardApi;
    }
}
