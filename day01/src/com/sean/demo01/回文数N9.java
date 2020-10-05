package com.sean.demo01;

public class 回文数N9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1));
    }
    public static boolean isPalindrome(int x) {
        if(-10<x && x<10){
            return true;
        }
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        for(int l = 0, r = chars.length -1; l < r; l++, r--){
            if(chars[l] != chars[r]){
                return false;
            }
        }
        return true;

    }
}
