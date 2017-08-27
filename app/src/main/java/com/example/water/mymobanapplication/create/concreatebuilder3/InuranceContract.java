package com.example.water.mymobanapplication.create.concreatebuilder3;

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
     private  InuranceContract(String contactId, String personName, String companyName, String beginDate, String endDate) {
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

    public static class ConcreteBuilder {
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
        public InuranceContract build(){
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

}
