package com.sean.demo01;

import java.util.ArrayList;

public class 整数反转N7 {

    /**
     * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
     * 注意:
     *
     * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/reverse-integer
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
    public static void main(String[] args) {
        int nums = 2147483647;

        System.out.println(reverse(nums));
    }

    public static int reverse(int n){
        String s = String.valueOf(n);
        char[] chars = s.toCharArray();
        int l = 0;
        if (chars[0] == '-'){
            l = 1;
        }
        for (int i = l,j=chars.length - 1; i < chars.length; i++,j--) {
            if (i > j){
                char tmp = chars[i];
                chars[i] = chars[j];
                chars[j] = tmp;
            }
        }
        String s1 = String.valueOf(chars);

        long aLong = Long.valueOf(s1);
        int integer = (int)aLong;
        if (aLong == integer){
            return integer;
        }else {
            return 0;
        }
    }
}
