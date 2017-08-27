package com.example.water.mymobanapplication.create.concreatebuilder2;

/**
 * Created by water on 2017/8/27.
 */

public class InuranceContract {
    /**
     * 保险合同编号
     */
   private String contactId;
    /**
     * 被保险人名字和保险公司二选一
     */
    private String personName;
    /**
     * 被保险公司
     */
    private String companyName;
    /**
     * 保险生效日期
     */
    private String beginDate;
    /**
     * 保险失效日期
     */
    private String endDate;

    /**
     * 默认的同包才能访问
     * 强制开发者使用构建器模式创建对象
     * @param contactId
     * @param personName
     * @param companyName
     * @param beginDate
     * @param endDate
     */
     InuranceContract(String contactId, String personName, String companyName, String beginDate, String endDate) {
        this.contactId = contactId;
        this.personName = personName;
        this.companyName = companyName;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
    public void oprations(){
        System.out.print("保险合同操作");
    }

    @Override
    public String toString() {
        return "InuranceContract{" +
                "contactId='" + contactId + '\'' +
                ", personName='" + personName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", beginDate='" + beginDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
