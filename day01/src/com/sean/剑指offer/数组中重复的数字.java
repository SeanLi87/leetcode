package com.sean.剑指offer;

import java.util.HashSet;

import static java.util.Arrays.sort;

public class 数组中重复的数字 {

    public static void main(String[] args) {

        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));

    }

    public static int findRepeatNumber(int[] nums) {
//        sort(nums);//单独实现数组排序功能
//        int result = 0;
//        for (int i = 0; i < nums.length; i++) {
//
//            if (i == nums.length - 1) {
//                break;
//            } else if (nums[i] == nums[i + 1]) {
//                System.out.println(nums[i]);
//                result = nums[i];
//                break;
//
//            }
//        }
//        return result;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }
        return -1;
    }

}
