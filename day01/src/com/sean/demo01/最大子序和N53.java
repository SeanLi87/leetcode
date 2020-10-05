package com.sean.demo01;

public class 最大子序和N53 {

    public static void main(String[] args) {

        int[] nums = {1};
        System.out.println(MaxSubArray(nums));
    }
/*
* 贪心算法
* */
    public static int MaxSubArray(int[] nums) {
        int pre = nums[0], maxAns = nums[0];
        //初始化第一个元素所需要的参数：
        //pre代表当前指针之前元素的和,大于0则保留，小于0则丢弃
        //maxAns代表pre+当前元素的和，若>之前和则保留，<之前和则丢弃
        for (int i = 1; i < nums.length; i++) {
            pre = Math.max(pre + nums[i],nums[i]);
            maxAns = Math.max(pre, maxAns);
        }
        return maxAns;
    }

}
