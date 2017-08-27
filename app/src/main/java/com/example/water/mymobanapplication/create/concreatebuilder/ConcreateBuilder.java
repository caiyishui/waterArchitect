package com.example.water.mymobanapplication.create.concreatebuilder;

import com.example.water.mymobanapplication.abstractfactory.computerexample2.*;

/**
 * Created by water on 2017/8/27.
 */

public class ConcreateBuilder implements Builder {


    private Product mProduct;

    /**
     * 构建起最终构建的产品对象
     * @return
     */
    public Product getProduct() {
        return mProduct;
    }

    @Override
    public void builderPart() {
        //构建某个部件
    }
}
