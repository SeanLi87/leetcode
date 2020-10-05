package com.sean.demo01;
/**
 * 思路：所有波谷---波峰的值总和
 * */
public class 买卖股票的最佳时机2N122 {

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,2,2,2,3,3,3,3,1};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {


        int low = prices[0], high = prices[0], sum = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            //若i+1小于i的值，则有两种情况，x为第一个元素或者x不是第一个元素
            if (prices[i + 1] < prices[i]) {
                if (i == 0) {
                    high = prices[i + 1];
                    low = prices[i + 1];
                } else {
                    sum = sum + (high - low);
                    high = prices[i+1];
                    low = prices[i+1];
                }
            }
            //若i+1大于等于i的值
            else {
                high = prices[i + 1];
                if (i == prices.length-2){
                    sum += high-low;
                }
            }



        }
        return sum;
    }
}
