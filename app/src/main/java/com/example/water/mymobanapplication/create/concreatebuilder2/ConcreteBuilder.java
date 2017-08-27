package com.example.water.mymobanapplication.create.concreatebuilder2;

/**
 * 保险合同的构建器
 * (没有了构建起的接口，将构建器和指导者融为一体)
 * Created by water on 2017/8/27.
 */

public class ConcreteBuilder {
    private  String contractId;
    private String personName;
    private String companyName;
    private String beginDate;
    private String endDate;
    public ConcreteBuilder() {

    }
    public ConcreteBuilder(String contractId, String personName, String endDate) {
        this.contractId = contractId;
        this.personName = personName;

        this.endDate = endDate;
    }
    public  InuranceContract build(){
        try {
            if(contractId==null&&contractId.trim().length()==0){
                throw new Exception("合同编号不能为空");
            }
            if(beginDate==null&&beginDate.trim().length()==0){
                throw new Exception("合同开始生效日期不能为空");
            }
            if(endDate==null&&endDate.trim().length()==0){
                throw new Exception("合同到期日期不能为空");
            }
        boolean flagPersonName=(personName!=null&&personName.trim().length()>0);
        boolean flagCompanyName=(companyName!=null&&companyName.trim().length()>0);
        if(flagCompanyName&&flagPersonName){

                throw new Exception("一份合同不能同时个人和公司");

        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  new InuranceContract(contractId,personName,companyName,beginDate,endDate);
    }
    public ConcreteBuilder setContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public ConcreteBuilder setPersonName(String personName) {
        this.personName = personName;
        return this;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public ConcreteBuilder setBeginDate(String beginDate) {
        this.beginDate = beginDate;
        return this;
    }

    public ConcreteBuilder setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
}
