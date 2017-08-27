package com.example.water.mymobanapplication.create.create1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by water on 2017/8/27.
 */

public class ExportToTxt {
    /**
     * 导出数据
     * @param exportHeaderModel
     * @param maps
     * @param exportFooterMedol
     * @return
     */
    public StringBuffer export(ExportHeaderModel exportHeaderModel, Map<String,Collection<ExportDataModel>> maps, ExportFooterMedol exportFooterMedol){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append(exportHeaderModel.getDepid()+","+exportHeaderModel.getExportDate()).append("\n");
        //data
        Set<Map.Entry<String, Collection<ExportDataModel>>> entries = maps.entrySet();
        for (Map.Entry<String, Collection<ExportDataModel>> entry:entries){
            stringBuffer.append(entry.getKey()).append("\n");
            for(ExportDataModel edm:entry.getValue()){
                stringBuffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");

            }

        }
        //footer
        stringBuffer.append(exportFooterMedol.getExportUser()+"\n");
        return stringBuffer;
    }
}
