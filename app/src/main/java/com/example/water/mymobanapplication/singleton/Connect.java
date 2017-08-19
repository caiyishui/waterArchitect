package com.example.water.mymobanapplication.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by water on 2017/8/19.
 */

public class Connect {
    private  static Map<Integer,Connect> map=new HashMap<>();
    private static int key=1;
    private static int max=5;
    private Connect(){}
    public  static  Connect getConnect(){
        Connect instance=map.get(key);
        if(instance==null){
            synchronized(Connect.class){
                if(instance==null){

                    instance=new Connect();
                    map.put(key,instance);
                }
            }
        }
        key++;
        if(key>max){
            key=1;
        }
        return instance;
    }

}
class  Test{
    public static void main(String[] args){
        for (int i=0;i<20;i++){
            System.out.print(Connect.getConnect()+"\n");
        }
    }
}