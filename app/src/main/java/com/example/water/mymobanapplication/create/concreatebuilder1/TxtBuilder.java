package com.example.water.mymobanapplication.create.concreatebuilder1;



import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 实现导出文本数据的生成器
 * Created by water on 2017/8/27.
 */

public class TxtBuilder implements Builder {
    private  StringBuffer stringBuffer=new StringBuffer();
    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        stringBuffer.append(ehm.getDepid()+","+ehm.getExportDate()).append("\n");
    }

    @Override
    public void buildData(Map<String, Collection<ExportDataModel>> maps) {
        Set<Map.Entry<String, Collection<ExportDataModel>>> entries = maps.entrySet();
        for (Map.Entry<String, Collection<ExportDataModel>> entry:entries){
            stringBuffer.append(entry.getKey()).append("\n");
            for(ExportDataModel edm:entry.getValue()){
                stringBuffer.append(edm.getProductId()+","+edm.getPrice()+","+edm.getAmount()+"\n");

            }

        }
    }



    @Override
    public StringBuffer getResule() {
        return stringBuffer;
    }

    @Override
    public void buildFooter(ExportFooterMedol efm) {
        stringBuffer.append(efm.getExportUser()+"\n");
    }
}
