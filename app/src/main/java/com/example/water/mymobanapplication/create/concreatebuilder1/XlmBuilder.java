package com.example.water.mymobanapplication.create.concreatebuilder1;



import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by water on 2017/8/27.
 */

public class XlmBuilder implements Builder {
    private StringBuffer stringBuffer=new StringBuffer();
    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        stringBuffer.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>");
        stringBuffer.append("<Report>\n");
        stringBuffer.append("<Header>\n");
        stringBuffer.append("<Depid>").append(ehm.getDepid()).append("</Depid>\n");
        stringBuffer.append("<ExportDate>").append(ehm.getExportDate()).append("</ExportDate>\n");
        stringBuffer.append("</Header>\n");
        stringBuffer.append("<Body>\n");
    }

    @Override
    public void buildData(Map<String, Collection<ExportDataModel>> maps) {
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
    }

    @Override
    public void buildFooter(ExportFooterMedol efm) {
        stringBuffer.append("<Footer>\n");
        stringBuffer.append("<ExportUser>").append(efm.getExportUser()).append("</ExportUser>\n");
        stringBuffer.append("</Footer>\n");
        stringBuffer.append("</Report>\n");
    }

    @Override
    public StringBuffer getResule() {
        return stringBuffer;
    }
}
