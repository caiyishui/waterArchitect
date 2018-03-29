package com.example.water.mymobanapplication.state;

/**
 * @author caiys
 * @date 2018/3/29.
 * @description
 */

public class WaterRuner implements Istate {
    @Override
    public void run() {
        System.out.print("每小时100公里");
    }
}
