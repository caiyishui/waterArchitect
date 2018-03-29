package com.example.water.mymobanapplication.jingtaidaili.baohu;

/**
 * Created by water on 2018/1/5.
 */

public class Client {
    public static void main(String[] args){
        OrderApi orderApi=new OrderProxy(new Order("Mac Pro",2,"water"));
        orderApi.setOrderNum(3,"dd");
        int[] arr={3,2,4};
        int targe=6;
       int[] arr1= twoSum(arr,targe);
        System.out.println(orderApi.toString());
        System.out.println(arr1[0]+"===="+arr[1]+"=====");
    }

    public static int[] twoSum(int[] nums, int target) {
        int len=nums.length;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int result=nums[i]+nums[j];
                if(result==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }

}
