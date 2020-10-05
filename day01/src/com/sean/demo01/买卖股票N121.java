package com.sean.demo01;

public class 买卖股票N121 {

    public static void main(String[] args) {
        int[] stuck = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfitOfficial(stuck));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        for(int i = prices.length - 1; i > 0; i--){
            for(int j = i - 1; j >= 0; j--){
                if(prices[i] - prices[j] > max){
                    max = prices[i] - prices[j];
                }
            }
        }
        return max;
    }
    public static int maxProfitOfficial(int[] prices){
        int minprice = prices[0];
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice){
                minprice = prices[i];
                continue;
            }
            if (prices[i] - minprice > maxprofit){
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}
