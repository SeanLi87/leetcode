package com.sean.demo01;


import com.sun.tools.javac.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        System.out.println(1/2);

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
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
