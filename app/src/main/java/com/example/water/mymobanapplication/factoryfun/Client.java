package com.example.water.mymobanapplication.factoryfun;

/**
 * Created by water on 2017/8/19.
 */

public class Client {


    public static void main(String[] args){
        ExportOperate exportOperate=new ExportTextOperator();
        exportOperate.exprot("aaa");
         exportOperate=new ExportDBOperate();
        exportOperate.exprot("db");
    }
}
