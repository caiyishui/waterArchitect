package com.example.water.mymobanapplication.factoryfun;

import com.example.water.mymobanapplication.factoryfun.ExportFileApi;

/**
 * Created by water on 2017/8/19.
 */

public class ExportDBFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.print("导出DB数据"+data);
        return true;
    }
}
