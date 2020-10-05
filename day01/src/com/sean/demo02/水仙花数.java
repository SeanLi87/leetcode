package com.sean.demo02;

import java.util.Scanner;

public class 水仙花数 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int flag = 0;
            for (int i = n; i <= m; i++) {
                //判断是否水仙花数
                int sum = 0;
                char[] chars = String.valueOf(i).toCharArray();
                for (char aChar : chars) {
                    int tmp = (aChar - '0') * (aChar - '0') * (aChar - '0');
                    sum = sum + tmp;
                }
                if (sum == i) {
                    System.out.print(sum + " ");
                    flag++;
                }
            }
            if (flag == 0) {
                System.out.print("no");
            }
            System.out.println();
        }
    }
}
