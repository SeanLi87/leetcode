package com.sean.demo01;

import java.util.Base64;

public class 数组排序 {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5};
//        bubbleSort(nums);
//        System.out.println("=======================");
//        bubbleMarkSort(nums);

        quickSort(nums, 0, 4);


//        System.out.println(encode("7288628972886289Lx".getBytes()));
//        System.out.println(decode("NzI4ODYyODk3Mjg4NjI4OUx4"));
    }

    //冒泡排序，时间复杂度为(n-1)+(n-2)+...1 --->((n-1)+1)*(n-1)/2,因此时间复杂度为o(n的平方)
    private static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;

                }
                System.out.println(j);
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }

    //冒泡排序的标记算法：
    // 1。当前内循环调整过顺序，则tag会变成0,表示下一次内循环不知道是否需要调整顺序。
    // 2.当前内循环没有调整顺序，则tag仍然为1，表示下一次内循环也不需要调整顺序，外循环结束
    // 3.因此最优时，只需要循环一次内循环，时间复杂度为O(n)
    private static void bubbleMarkSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int targ = 1;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    targ = 0;
                }
                System.out.println(j);
            }
            if (targ == 1) {
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    //快速排序，给定基准数据

    private static void quickSort(int[] s, int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quickSort(s, l, i - 1); // 递归调用
            quickSort(s, i + 1, r);
        }
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
    }


    //base64加解密
    private static String encode(byte[] bytes) {

        String str = new String(Base64.getEncoder().encode(bytes));
        return str;

    }

    private static String decode(String str) {
        String decode = new String(Base64.getDecoder().decode(str));
        return decode;
    }


}
