package com.example.water.mymobanapplication.templatemethod;

/**
 * Created by water on 2017/8/6.
 */

public abstract class AbstractClass {
    /**
     * 源语操作1
     */
    public abstract void doPrimitiveOperation1();


    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法定义算法的结构
     */
    public final void templateMethod(){
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
