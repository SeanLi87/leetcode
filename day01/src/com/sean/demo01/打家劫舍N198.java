package com.sean.demo01;

/**
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * <p>
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/house-robber
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class 打家劫舍N198 {

    public static void main(String[] args) {
        int[] houses = new int[]{1,1};
        System.out.println(rob(houses));
    }


    public static int rob(int[] nums) {
        int max = 0;
        if (nums.length == 0 || nums == null) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }
        //动态规划初始值，i=2
        int one = nums[0];
        int second = Math.max(nums[0], nums[1]);
//        max = second;
        for (int i = 2; i < nums.length; i++) {
            //从(i-2)最大值+当前值和(i-1)最大值之中选择最大值
            //代表i的最大值
            max = Math.max(one + nums[i], second);
            //初始化下一个循环的one值
            one = second;//代表不包括当前i之前的最大值 f(i-1)
            second = max;
        }
        return max;
    }
}
