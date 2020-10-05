package com.sean.demo01;

public class 罗马数字转整数N13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i == chars.length - 1) {
                num += translateToNum(chars[i]);
            } else if (chars[i] == 'I') {
                if (chars[i + 1] == 'V' || chars[i + 1] == 'X') {
                    num += translateToNum(chars[i],chars[i+1]);
                    i++;
                } else {
                    num += translateToNum(chars[i]);
                }
            } else if (chars[i] == 'X') {
                if (chars[i + 1] == 'L' || chars[i + 1] == 'C') {
                    num += translateToNum(chars[i],chars[i+1]);
                    i++;
                } else {
                    num += translateToNum(chars[i]);
                }
            } else if (chars[i] == 'C') {
                if (chars[i + 1] == 'D' || chars[i + 1] == 'M') {
                    num += translateToNum(chars[i],chars[i+1]);
                    i++;
                } else {
                    num += translateToNum(chars[i]);
                }
            } else {
                num += translateToNum(chars[i]);
            }
        }
        return num;
    }

    public static int translateToNum(char... chars) {
        int num = 0;
        if (chars.length == 1) {
            System.out.println("length is 1"+chars[0]);
            switch (chars[0]) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    num = -1;

            }
        } else if (chars.length == 2) {
            System.out.println("length is 2"+chars[0]+chars[1]);
            switch (chars[0]) {
                case 'I':
                    switch (chars[1]) {
                        case 'V':
                            num = 4;
                            break;
                        case 'X':
                            num = 9;
                            break;
                    }
                    break;
                case 'X':
                    switch (chars[1]) {
                        case 'L':
                            num = 40;
                            break;
                        case 'C':
                            num = 90;
                            break;
                    }
                    break;
                case 'C':
                    switch (chars[1]) {
                        case 'D':
                            num = 400;
                            break;
                        case 'M':
                            num = 900;
                            break;
                    }
                    break;
                default:
                    num = -1;
            }
        }
        System.out.println(num);
        return num;
    }
}
