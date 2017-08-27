package com.example.water.mymobanapplication.create.concreatebuilder1;

import java.util.Collection;
import java.util.Map;

/**
 * Created by water on 2017/8/27.
 */

public class Director {
    private  Builder mBuilder;

    public Director(Builder builder) {
        mBuilder = builder;
    }
    public void construct(ExportHeaderModel ehm, Map<String,Collection<ExportDataModel>> maps, ExportFooterMedol efm){
     //header
        mBuilder.buildHeader(ehm);
        //data
        mBuilder.buildData(maps);
        //footer
        mBuilder.buildFooter(efm);
        System.out.print(mBuilder.getResule());
    }
}
