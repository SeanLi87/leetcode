package com.sean.demo01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 多数元素N169 {

    public static void main(String[] args) {
//        majorityElements(new int[]{1,2,3,3,4});
        majorityElement(new int[]{8, 8, 7, 7, 7});
    }

    private static int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();
        int max=0;
        for (int num : nums) {
            if (elements.containsKey(num)) {
                elements.put(num, elements.get(num) + 1);
                max = Math.max(max, elements.get(num));
            } else {
                elements.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() == max) {
                return entry.getKey();
            }

        }
        return nums[0];
    }


    public static int[] majorityElements(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();
        for (int num : nums) {
            if (elements.containsKey(num)) {
                elements.put(num, elements.get(num) + 1);
            } else {
                elements.put(num, 1);
            }
        }
        int[] result = new int[elements.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            if (entry.getValue() > 1) {
                result[i] = entry.getKey();
                System.out.println(result[i]);
            }
        }
        return result;
    }

}
