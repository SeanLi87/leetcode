package com.sean.demo01;

import java.util.ArrayList;

public class 两数之和 {


    public static void main(String[] args) {
        int[] numbers = new int[]{-1, -2, -3, -4, -5};
        for (int i : twoSum(numbers, -8)) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i1] == target - nums[i]) {
                    System.out.println("i:" + i + " i1:" + i1);
                    System.out.println(nums[i] + ":" + nums[i1]);
                    return new int[]{i, i1};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
