package com.sean.demo01;

public class N1365有多少小于当前数字的数字 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if(nums == null || nums.length==0){
            return null;
        }
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            int tmp=0;
            for(int j=0; j<nums.length;j++){
                if(nums[j]<nums[i]){
                    tmp++;
                }
            }
            result[i]=tmp;
        }
        return result;
    }
}
