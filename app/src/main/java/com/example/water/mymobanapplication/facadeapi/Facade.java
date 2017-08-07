package com.example.water.mymobanapplication.facadeapi;

/**
 * Created by water on 2017/8/7.
 */

public class Facade {
    public void oprate(){
        AModeImApi aModeImApi=new AModeImApi();
        aModeImApi.oprate();
        BModeImApi bModeImApi=new BModeImApi();
       bModeImApi.oprate();
    }
}
