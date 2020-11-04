package com.sean.剑指offer;

public class N17打印从1到最大的n位数 {
    public static void main(String[] args) {

        int[] ints = printNumbers(1);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
    public static int[] printNumbers(int n) {
//        StringBuffer count = new StringBuffer();
//        for (int i = 0; i < n; i++) {
//            count.append('9');
//        }
//        Integer integer = Integer.valueOf(count.toString());
        int integer = (int)Math.pow(10,n)-1;
        int[] result = new int[integer];
        for (int i = 0; i < integer; i++) {
            result[i]= i+1;
        }
        return result;
    }
}
