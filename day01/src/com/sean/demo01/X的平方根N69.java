package com.sean.demo01;

/**
 * 思路：对一个整数从1...n,开始除和取模，当商>n且余数
 */

public class X的平方根N69 {
    public static void main(String[] args) {
        System.out.println(mySqrt2(18));
//        int sqrt = (int) Math.sqrt(8);
//        System.out.println(sqrt);
    }


    //暴力循环
    public static int mySqrt(int x) {
        int sqrt = 0;
        for (int i = 1; i < x; i++) {
            int answer = x / i;
            if (answer < i) {
                break;
            } else if (answer >= i) {
                sqrt = i;
            }
        }
        return sqrt;
    }

    //优化暴力循环,先计算起始点
    public static int mySqrt1(int x) {
        int length = String.valueOf(x).length();
        int times = (length - 1) / 2;
        int start = 1;
        for (int i = 0; i < times; i++) {
            start = start * 10;

        }
        System.out.println("start: " + start);
        int sqrt = 0;
        for (int i = start; i <= x; i++) {
            int answer = x / i;
            if (answer < i) {
                break;
            } else if (answer >= i) {
                sqrt = i;
            }
        }
        return sqrt;
    }

    //二分查找
    public static int mySqrt2(int x) {
        //先排除x=0
        if (x == 0) {
            return 0;
        }
        //从x的中间值mid开始计算，若mid*mid>x, 则需要从1~mid开始查找
        int l = 0, r = x;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            //若mid*mid>x, 则需要从l~mid开重新查找
            if ((long) mid * mid > x) {
                r = mid - 1;
            }
            //如果mid*mid<=x,从mid~r重新查找
            else if (mid * mid <= x) {
                l = mid + 1;
                ans = mid;
            }
        }
        return ans;

    }

}
