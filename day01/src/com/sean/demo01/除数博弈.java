package com.sean.demo01;

/*
 * 思路：
 * 找数学规律
 * 当N=1时，alice必败
 * 当N=2时，alice必胜
 * 当N=3时，alice必败
 * 当N=4时，alice必胜
 * 当N=5时，alice必败
 * 当N=6时，alice必胜
 * 当N=K时，alice必败/必胜
 * ...
 * ...
 * 证明：
 * 当N=k+1
 * 若K为偶数，K+1为奇数，则N为奇数，N的因数x为奇数，N-X必定为偶数，而且N-X<=K，则bob若是偶数开头，必胜
 * 若K为奇数，k+1为偶数，则N为偶数，N的因数x可以为奇数也可以为偶数，若x为奇数，则N-X为奇数，bob若是奇数开头，必败
 * */
public class 除数博弈 {

    public static void main(String[] args) {
        System.out.println(pick(11));

    }

    public static boolean pick(int N) {

        return (N%2 == 0)?true:false;
    }
}
