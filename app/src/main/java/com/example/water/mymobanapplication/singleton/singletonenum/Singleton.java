package com.example.water.mymobanapplication.singleton.singletonenum;

/**
 * Created by water on 2017/8/19.
 */

public class Singleton {
    public  static  void main(String[] args){
        System.out.print(""+MyEnumColor.BLECK.getName());
        System.out.print(""+MyEnumColor.BLECK.getIndex());
        System.out.print(""+MyEnumColor.RED.getName());
        EnumSingleton.instance.operate();
    }

}
enum MyEnumColor{
    //实例必须要放在属性的前面
    RED(1,"红色"),BLECK(2,"黑色");

    private int index;
    private String name;
    MyEnumColor(int index,String name){
        this.index=index;
        this.name=name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}