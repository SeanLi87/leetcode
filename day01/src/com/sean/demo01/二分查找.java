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
        if (source==null){
            return;
        }
        int left = 0,right = source.length-1;
        while (left<=right){
            int mid = (left+right)/2;
            if (source[mid]==target){
                return;
            }else if (source[mid]>target){
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
    }
}
