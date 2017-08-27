package com.example.water.mymobanapplication.create.concreatebuilder;

/**
 * 指导者 主要来使用builder接口，以一个统一的过程来构建所需要的product对象
 * Created by water on 2017/8/27.
 */

public class Director {
    private  Builder mBuilder;
    public  Director(Builder builder){
        super();
        this.mBuilder=builder;

    }
    public void construct(){
        mBuilder.builderPart();
    }
}
