package com.sean.demo01;

public class 顺时针打印矩阵N29 {

    public static void main(String[] args) {
        int[][] nums4x4 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] nums3x3 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] nums4x3 = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
//        spiralOrder(nums3x3);//[1,2,3,6,9,8,7,4,5]
//        spiralOrder(nums4x3); //：[1,2,3,4,8,12,11,10,9,5,6,7]
        int[][] nums3x1 = new int[][]{{1,2,3}};
        int[] ints = spiralOrder(nums4x3);
        for (int anInt : ints) {
            System.out.println(anInt);
        }


    }

    public static int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length==0){
            return new int[0];
        }
        //定义四个角的初始值
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;
        //定义返回元素
        int[] seq = new int[matrix.length * matrix[0].length];
        int index = 0;
        //当top<=bottom或者right<=left的时候，持续循环遍历矩阵
        while (top <= bottom && left <= right) {
            //从[top,left]到[top,right]
            for (int i = left; i <= right; i++) {
                seq[index++] = matrix[top][i];
            }

            //从[top,right]到[bottom,right]
            for (int i = top + 1; i <= bottom; i++) {
                seq[index++] = matrix[i][right];
            }
            //以下逻辑可以避免非正方形矩形时的重复元素打印
            if (left < right && top < bottom) {
                //从[bottom,right]到[bottom,left]
                for (int i = right - 1; i >= left; i--) {
                    seq[index++] = matrix[bottom][i];
                }
                //从[bottom,left]到[top,left]
                for (int i = bottom - 1; i > top; i--) {
                    seq[index++] = matrix[i][left];
                }

            }
            //将top,bottom,right,left分别向里移动一位
            top++;
            bottom--;
            right--;
            left++;
        }
        return seq;
    }
}
