package com.sean.practice;

import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {

        maxOfArray();

    }

    private static void maxOfArray() {
        int[] a = new int[]{1, 3, 7, 8, 2, 0};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }


    //99乘法表
    private static void ninenine() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int result = i * j;
                System.out.print(j + "*" + i + "=" + result);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    //用每行相同数字表示直角三角形
    private static void printReverseRTbySameNum() {

        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(a - i);
            }
            System.out.println();
        }
    }


    //用每行相同数字表示直角三角形
    private static void printReverseRTbyNum() {

        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print(a - j);
            }
            System.out.println();
        }

    }

    //输出倒直角三角形
    private static void printReverseRT() {

        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //输出直角三角形
    private static void printRT() {
        int a = 4;
        for (int i = 0; i <= a; i++) {
            for (int j = a - i; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //判断三边是否是直角三角形
    private static void outputRT() {

        Scanner sc = new Scanner(System.in);
        System.out.println("输入三边：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("这是个直角三角形");
        } else {
            System.out.println("这不是直角三角形");
        }
    }

    //输出100以内6的倍数的总个数
    private static void sixTimeCounter() {
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 6 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    //输出1-10的和
    private static void sum() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }


}
