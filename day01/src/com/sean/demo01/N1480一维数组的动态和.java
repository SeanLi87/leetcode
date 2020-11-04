package com.sean.demo01;

public class N1480一维数组的动态和 {
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4};
        int[] ints = runningSum(input);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }

    public static int[] runningSum(int[] nums) {
        if (nums == null){
            return null;
        }
        int[] result = new int[nums.length];
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current = current + nums[i];
            result[i] = current;
        }
        return result;
    }
}
