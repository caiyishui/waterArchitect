package com.example.water.mymobanapplication.create.concreatebuilder3;

/**
 * Created by water on 2017/8/27.
 */

public class Client {
    public static void main(String[] args){
        InuranceContract.ConcreteBuilder builder=new InuranceContract.ConcreteBuilder();
        builder.setContractId("A001").setBeginDate("1998-09-17").setEndDate("2200-10-19");
        builder.setPersonName("小狗");
        builder.setCompanyName("科技公司");
        InuranceContract inuranceContract=builder.build();
        System.out.print(inuranceContract);
    }
}
