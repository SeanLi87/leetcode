package com.sean.demo01;

import java.util.Arrays;

/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 *
 *  
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class 合并两个有序数组N88 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        merge(nums1,3,nums2,3);
        mergeCopy(nums1,3,nums2,3);
    }

    private static void mergeCopy(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2,0,nums1,m,n);
        Arrays.sort(nums1);
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m, j = 0; i<nums1.length; i++,j++){
            nums1[i] = nums2[j];
        }
        //冒泡排序
        for(int i = 0; i < nums1.length; i++){
            int flag = 0;
            for(int j = 0; j < nums1.length - 1 -i;j++){
                if(nums1[j] > nums1[j+1]){
                    int tmp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = tmp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int i = 0; i < nums1.length; i++){
            System.out.print(nums1[i]);
        }
    }
}
