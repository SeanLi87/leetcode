package com.sean.demo02;
/*
* 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
* 每次你可以爬 1 或 2 个台阶。
* 你有多少种不同的方法可以爬到楼顶呢？
* 思路：f(n)=f(n-1)+f(n-2)
* */
public class 爬楼梯算法 {

    public static void main(String[] args) {
        System.out.println(palouti(5));
    }

    //递归方式，当n过大时，可能出现栈内存溢出异常
    private static int palouti(int n) {

//        int total = 0;
        if (n < 0) {
            return -1;//-1表示入参错误
        }
        if (n <= 2) {
//            total = n;//<=2无需递归，直接返回n即可额
            return n;
        } else {
//            total = palouti(n - 1) + palouti(n - 2);//大于2时，开始递归
            return palouti(n - 1) + palouti(n - 2);
        }
//        return total;

    }

    //使用for循环
    private static int palouti2(int n) {

        int total = 0;
        if (n < 0) {
            return -1;//-1表示入参错误
        }

        if (n <= 2) {
            total = n;//<=2时无需循环，直接返回n即可
        } else {//大于2时，初始化n=1和n=2的结果作为n=3的参数
                // 然后在循环中迭代替换前两步的结果作为当前n的参数
            int one = 1;
            int two = 2;
            for (int i = 3; i <= n; i++) {
                total = one + two;
                one = two;
                two = total;
            }
        }
        return total;
    }


}
