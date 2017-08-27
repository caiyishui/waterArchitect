package com.example.water.mymobanapplication.create.create1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by water on 2017/8/27.
 */

public class Client {
    public static void main(String[] args){
        //tou
        ExportHeaderModel exportHeaderModel=new ExportHeaderModel();
        exportHeaderModel.setDepid("温州公司");
        exportHeaderModel.setExportDate("2017-8-27");
        //data
        Map<String,Collection<ExportDataModel>> maps=new HashMap<>();
        Collection<ExportDataModel> col_1=new ArrayList<>();
        ExportDataModel edm1=new ExportDataModel();
        edm1.setProductId("001");
        edm1.setAmount(100);
        edm1.setAmount(10);
        col_1.add(edm1);

        ExportDataModel edm2=new ExportDataModel();
        edm1.setProductId("002");
        edm1.setAmount(200);
        edm1.setAmount(20);
        col_1.add(edm1);
        maps.put("开发表",col_1);


        Collection<ExportDataModel> col_2=new ArrayList<>();
        ExportDataModel edm3=new ExportDataModel();
        edm1.setProductId("003");
        edm1.setAmount(300);
        edm1.setAmount(30);
        col_2.add(edm3);

        ExportDataModel edm4=new ExportDataModel();
        edm1.setProductId("004");
        edm1.setAmount(400);
        edm1.setAmount(40);
        col_2.add(edm4);
        maps.put("销售",col_2);
        //footer
        ExportFooterMedol exportFooterMedol=new ExportFooterMedol();
        exportFooterMedol.setExportUser("heihei");

        ExportToTxt exportToTxt=new ExportToTxt();
        StringBuffer result=exportToTxt.export(exportHeaderModel,maps,exportFooterMedol);
        System.out.print(result);
        ExportToXml exportToXml=new ExportToXml();
        StringBuffer result1=exportToXml.export(exportHeaderModel,maps,exportFooterMedol);
        System.out.print(result1);

    }
}
