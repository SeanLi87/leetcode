package com.sean.demo01;

import java.util.LinkedList;
import java.util.List;

public class N1431拥有最多糖果的孩子 {
    public static void main(String[] args) {
        int[] input = new int[]{2,3,5,1,3};
        List<Boolean> booleans = kidsWithCandies(input,3);
        for (Boolean aBoolean : booleans) {
            System.out.println(aBoolean);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kidsWithCandies = new LinkedList<>();
        int max = 0;
        for (int candy : candies) {
            max = max >= candy ? max : candy;
        }
        for (int candy : candies) {
            int tmp = candy+extraCandies;
            if (tmp >=max){
                kidsWithCandies.add(true);
            }else {
                kidsWithCandies.add(false);
            }
        }
        return kidsWithCandies;
    }
}
