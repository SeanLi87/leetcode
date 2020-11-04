package com.sean.demo01;

import java.util.HashSet;
import java.util.Hashtable;

public class N771宝石与石头 {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(numJewelsInStones(J, S));
        HashSet<Character> Diamond = new HashSet<>();
        System.out.println(Diamond.add('a'));
        System.out.println(Diamond.contains('a'));
        System.out.println(Diamond.contains('b'));
    }
    public static int numJewelsInStones(String J, String S) {

        HashSet<Character> Diamond = new HashSet<>();
        char[] chars = J.toCharArray();
        char[] chars1 = S.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            Diamond.add(aChar);
        }
        for (char aChar : chars1) {
            if (Diamond.contains(aChar)){
                count++;
            }
        }
        return count;
    }
}
