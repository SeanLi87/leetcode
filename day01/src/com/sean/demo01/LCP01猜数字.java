package com.sean.demo01;

import java.util.Random;

public class LCP01猜数字 {
    public static void main(String[] args) {
        game(null, null);
    }

    public static int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }
}
