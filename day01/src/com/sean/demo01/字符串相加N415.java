package com.sean.demo01;

public class 字符串相加N415 {

    public static void main(String[] args) {

        String s1 = "0";
        String s2 = "9";
        System.out.println(stringSum(s1, s2));
    }

    private static String stringSum(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer result = new StringBuffer();
        while (i >= 0 || j >= 0 || add > 0) {

            //从个位开始，当指针为止超出字符串长度时，用0补齐
            int n1 = i <0 ? 0 : num1.charAt(i)-'0';
            int n2 = j <0 ? 0 : num2.charAt(j)-'0';
            //add是上一次的进位数字
            int sum = n1 + n2 + add;
            int left = sum % 10;
            add = sum / 10;
            result.append(left);
            i--;
            j--;
        }
        return result.reverse().toString();
    }
}
