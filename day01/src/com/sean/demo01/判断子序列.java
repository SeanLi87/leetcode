package com.sean.demo01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 判断子序列 {

    public static void main(String[] args) {
        String s = "acb", t = "ahbgdc";
        System.out.println(method(s, t));
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(1);
//        System.out.println(array.get(array.size()-1));
    }

    public static boolean isSubsequence(String s, String t) {

        String pattern = "";
        char[] charsS = s.toCharArray();
        for (char c : charsS) {
            pattern += ".*?" + c + ".*?";
        }
        System.out.println(pattern);

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(t);

        if (m.find()) {
            return true;
        }
        return false;

    }

    public static boolean method(String s, String t) {
        char[] charsT = t.toCharArray();
        char[] charsS = s.toCharArray();
        int counterOfT = 0;
        int counterOfS = 0;

        for (int i = 0, j = 0; i < charsS.length && j < charsT.length; ) {
            if (t.charAt(i) == s.charAt(i)) {
                j++;
                counterOfS = j++;
            }
            counterOfT = i++;
        }
        return counterOfT == counterOfS;

//        for (int i = 0; i < charsS.length; i++) {
//
//            for (int i1 = counterOfT; i1 < charsT.length; i1++) {
//                counterOfT++;
//                if (charsS[i] == charsT[i1]){
//                    System.out.println("matched");
//                    counterOfS++;
//                    break;
//                }
//            }
//        }
//        System.out.println(counterOfS);
//        return charsS.length == counterOfS;


    }
}
