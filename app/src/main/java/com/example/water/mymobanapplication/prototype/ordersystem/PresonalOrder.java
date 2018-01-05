package com.example.water.mymobanapplication.prototype.ordersystem;

/**
 * Created by water on 2017/9/3.
 */

public class PresonalOrder implements OrderApi{
        private String personalName;
        private String prodectId;
        private int orderProductNum;
    @Override
    public int getOrderPrudectNum() {
        return orderProductNum;
    }


        public String getPersonalName() {
            return personalName;
        }

        public void setPersonalName(String personalName) {
            this.personalName = personalName;
        }

        public String getProdectId() {
            return prodectId;
        }

        public void setProdectId(String prodectId) {
            this.prodectId = prodectId;
        }

        public int getOrderProductNum() {
            return orderProductNum;
        }

        public void setOrderProductNum(int orderProductNum) {
            this.orderProductNum = orderProductNum;
        }

        @Override
        public String toString() {
            return "PresonalOrder{" +
                    "personalName='" + personalName + '\'' +
                    ", prodectId='" + prodectId + '\'' +
                    ", orderProductNum=" + orderProductNum +
                    '}';
        }
}
