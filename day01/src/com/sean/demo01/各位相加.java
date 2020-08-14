package com.sean.demo01;


/*
* 思路:
* 1.拆分数字:先把数字转成string，再将string转成char，再将char元素转成数字再相加
* 2.将各位相加
* 3.判断是否为1位：true则return，false则循环
* */
public class 各位相加 {
    public static void main(String[] args) {

        System.out.println(add(10));


    }

    public static int add(int num) {
        Integer a= num;
        while (a >= 10){
            int sum = 0;
            char[] chars = a.toString().toCharArray();
            for (char ch:chars){
                Character nch = ch;
                sum+=Integer.valueOf(nch.toString());
            }
            a = sum;
        }
        return a;
    }
}
