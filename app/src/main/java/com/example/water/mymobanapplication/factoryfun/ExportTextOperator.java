package com.example.water.mymobanapplication.factoryfun;

/**
 * 导出数据为文本文件的操作
 * Created by water on 2017/8/19.
 */

public class ExportTextOperator extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTextFileAPi();
    }
}
