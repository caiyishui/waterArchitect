package com.example.water.mymobanapplication.create.create1;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by water on 2017/8/27.
 */

public class ExportToXml {
    /**
     * 导出数据
     * @param exportHeaderModel
     * @param maps
     * @param exportFooterMedol
     * @return
     */
    public StringBuffer export(ExportHeaderModel exportHeaderModel, Map<String,Collection<ExportDataModel>> maps, ExportFooterMedol exportFooterMedol){
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        stringBuffer.append("<Report>\n");
        stringBuffer.append("<Header>\n");
        stringBuffer.append("<Depid>").append(exportHeaderModel.getDepid()).append("</Depid>\n");
        stringBuffer.append("<ExportDate>").append(exportHeaderModel.getExportDate()).append("</ExportDate>\n");
        stringBuffer.append("</Header>\n");
        stringBuffer.append("<Body>\n");
        //data
        Set<Map.Entry<String, Collection<ExportDataModel>>> entries = maps.entrySet();
        for (Map.Entry<String, Collection<ExportDataModel>> entry:entries){
            stringBuffer.append("        <Datas TableName=\""+entry.getKey()+"\">\n");
            for(ExportDataModel edm:entry.getValue()){
                stringBuffer.append("<ProductId>").append(edm.getProductId()).append("</ProductId>\n");
                stringBuffer.append("<Price>").append(edm.getPrice()).append("</Price>\n");
                stringBuffer.append("<Amount>").append(edm.getAmount()).append("</Amount>\n");

            }
            stringBuffer.append("        </Datas>\n");
        }
        stringBuffer.append("</Body>\n");
        stringBuffer.append("<Footer>\n");
        stringBuffer.append("<ExportUser>").append(exportFooterMedol.getExportUser()).append("</ExportUser>\n");
        stringBuffer.append("</Footer>\n");
        stringBuffer.append("</Report>\n");
        //footer
        return stringBuffer;
    }
}
