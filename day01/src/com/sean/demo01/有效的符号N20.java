package com.sean.demo01;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 思路：
 * 1.有效字符中，任意一个括号后必须是方向一致的括号或者对应的另外一半
 * 2.长度必须是偶数
 * <p>
 * 利用栈来完成对一半方向括号的判断，判断完了就弹栈，判断剩余字符
 */
public class 有效的符号N20 {


    public static void main(String[] args) {

        String s = "{[]}";
        System.out.println(isValidOfficial(s));
    }

    public static boolean isValidOfficial(String s) {
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }
        //创建括号的映射关系
        HashMap<Character, Character> relation = new HashMap<>();
        relation.put('}', '{');
        relation.put(')', '(');
        relation.put(']', '[');
        //初始化栈，用以存储value，来和每个字符进行比较判断
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            //当前元素如果不是key，那么就是某一个value，入栈
            if (!relation.containsKey(ch)) {
                stack.push(ch);
            } else {
                //当前元素如果是key，首先判断栈里是否右值，若没值，则说明出现了一个反方向的字符
                //其次，判断栈首中存储的上一个相邻字符是否为对应的value, 若不是，表示出现了一个反方向字符
                if (stack.isEmpty() || stack.peek() != relation.get(ch)) {
                    return false;
                } else {
                    //表示从栈中找到了一个对应的括号，因此需要弹栈
                    stack.pop();
                }

            }
        }
        //若执行完循环，又没有半路return false，并且栈中没有元素
        //表示所有的符号都能找到符合标准的另外一半，因此为true
        return stack.isEmpty();
    }

}
