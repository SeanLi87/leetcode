package com.sean.demo01;

import java.util.Scanner;

public class 二分查找 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字：");
        int num = sc.nextInt();
        int[] list = new int[]{1, 2, 3, 4, 5, 6, 7, 8};


        binarySearch(num, list);
    }

    private static void binarySearch(int target, int[] list) {

        if (list == null) {
            System.out.println("空list");
            return;
        }
        //二分查找，需要有两个临时指针，用来标记左右边界
        int left = 0;
        int right = list.length - 1;
        while (left <= right) {//当left>right时，说明已经找完所有的值了
            int mid = (left + right) / 2;
            System.out.println("left:" + left + " mid:" + mid + " right:" + right);
            if (list[mid] == target) {
                System.out.println("find it and index is : " + mid);
                return;
            } else if (list[mid] < target) {
                left = mid + 1;
            } else if (list[mid] > target) {
                right = mid - 1;
            }
        }
    }

    public static void test(int target, int[] source){
        //如果数组为空，则中断
        if (source == null){
            return;
        }
        //定义左右指针
        int l = 0;
        int r = source.length-1;
        //当左指针小于等于右指针时，说明还未找到target
        while (l<=r){
            //计算中间值，用于和target进行比较
            int mid = (l+r)/2;
            //当该中间值和target相等时，查找结束
            if (source[mid] == target){
                System.out.println("Bingo");
                return;
            }
            //当中间值大于target时，重新设置右边界为中间值-1，左边界不变
            else if (source[mid] > target){
                r = mid-1;
            }
            //当中间值小于target时。重设左边界为中间值+1，右边界不变
            else if (source[mid]<target){
                l = mid+1;
            }
        }
    }
}
