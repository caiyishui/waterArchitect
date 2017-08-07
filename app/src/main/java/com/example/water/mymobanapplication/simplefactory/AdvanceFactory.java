package com.example.water.mymobanapplication.simplefactory;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by water on 2017/8/6.
 */

public class AdvanceFactory {
    private  static String impl;
    static {
        try{
            //加载配置文件
            Properties properties=new Properties();
            InputStream is=AdvanceFactory.class.getClassLoader().getResourceAsStream("Factory.properties");

            properties.load(is);
            impl=properties.getProperty(impl);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Api createApi(){
        try{
            Class impCls=Class.forName(impl);
            return (Api)impCls.newInstance();



        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
