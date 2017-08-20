package com.example.water.mymobanapplication.abstractfactory.computerexample2;

import com.example.water.mymobanapplication.factoryfun.factorymethod.*;

/**
 * 主板接口
 * Created by water on 2017/8/19.
 */

public interface MainboardApi extends Product {
    /**
     * 安装CPU
     */
    void installCPU();
}
