package com.sean.demo01;

public class N1486数组异或操作 {
    public int xorOperation(int n, int start) {
        int result = start;
        for(int i = 1; i<n;i++){
            result = result ^(start + 2*i);
        }
        return result;
    }
}
