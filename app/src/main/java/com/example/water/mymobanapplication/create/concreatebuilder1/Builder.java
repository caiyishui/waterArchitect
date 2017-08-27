package com.example.water.mymobanapplication.create.concreatebuilder1;

import com.example.water.mymobanapplication.create.create1.*;


import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口，定义创建一个product对象所需的各个部件的操作
 * Created by water on 2017/8/27.
 */

public interface Builder {
    /**
     * 构建头部
     * @param ehm
     */
    void buildHeader(ExportHeaderModel ehm) ;

    /**
     * 构建数据
     * @param maps
     */
    void buildData(Map<String,Collection<ExportDataModel>> maps);

    /**
     * 构建尾部
     * @param efm
     */
    void buildFooter(ExportFooterMedol efm);

    StringBuffer getResule();
}
