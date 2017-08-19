package com.example.water.mymobanapplication.factoryfun;

/**
 * Created by water on 2017/8/19.
 */

public class ExportTextFileAPi implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.print("导出生成了文本文件"+data);
        return true;
    }
}
