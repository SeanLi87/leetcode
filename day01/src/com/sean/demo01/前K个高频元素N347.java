package com.sean.demo01;

import java.util.*;

public class 前K个高频元素N347 {

    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,3};
        int k = 1;
        topKFrequent(nums,k);
    }

    private static int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> occurences = new HashMap<>();
        for (int num : nums) {
            occurences.put(num, occurences.getOrDefault(num,0)+1);
        }
        List<int[]> values = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : occurences.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            values.add(new int[]{num,count});
        }

        int[] ret = new int[k];
        qsort(values,0,values.size()-1,ret,0,k);
        return ret;

    }

    private static void qsort(List<int[]> values, int start, int end, int[] ret, int retIndex, int k) {
        int picked = (int) (Math.random() * (end - start +1))+start;

    }
}
