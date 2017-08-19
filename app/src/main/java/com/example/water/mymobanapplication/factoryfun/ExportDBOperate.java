package com.example.water.mymobanapplication.factoryfun;

/**
 * Created by water on 2017/8/19.
 */

public class ExportDBOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDBFile();
    }
}
