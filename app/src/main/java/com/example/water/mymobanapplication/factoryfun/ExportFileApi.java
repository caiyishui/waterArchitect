package com.example.water.mymobanapplication.factoryfun;

/**
 * Created by water on 2017/8/19.
 */

public interface ExportFileApi {
    /**
     * 导出内容为文件(数据库的文件，文本文件，xls文件等等)
     * @param data 需要导出的数据
     * @return 导出是否成功
     */
    public boolean export(String data);

}
