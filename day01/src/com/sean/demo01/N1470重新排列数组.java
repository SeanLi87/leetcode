package com.sean.demo01;

import java.util.Collections;

public class N1470重新排列数组 {
    public static void main(String[] args) {
        int[] input = new int[]{2,5,1,3,4,7};
        int[] shuffle = shuffle(input,3);
        for (int i : shuffle) {
            System.out.println(i);
        }
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newList = new int[2*n];
        for (int i = 0, j = n, x = 0; x < 2*n; x++){
            if (x % 2 == 0) {
                newList[x] = nums[i];
                i++;
            } else {
                newList[x] = nums[j];
                j++;
            }
        }
        return newList;
    }
}
