package com.sean.demo01;

import java.util.ArrayList;

public class 反转链表 {

    public static void main(String[] args) {
        ListNode listnode = null;
//        listnode.next = new ListNode(2);

        System.out.println(reversLink(listnode));


    }

    private static ListNode reversLink(ListNode head) {

        if (head ==null || head.next == null){
            return head;//入参为null或者只有1个元素时返回入参链表
        }
        //1.将链表转成arraylist集合
        ArrayList<Integer> list = new ArrayList<>();
        ListNode reversed = null;
            while (head != null) {//当前节点不为空时，获取元素值到arraylist中
                list.add(head.val);
                head = head.next;//遍历next节点
            }
        //2.倒序遍历arraylist集合，并将每个元素存入新的链表中
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed = listNodeAdd(reversed, list.get(i));
        }

        return reversed;
    }

    //使用递归来添加链表元素
    private static ListNode listNodeAdd(ListNode head, int nextVal) {
        if (head == null) {//递归到最底层，返回链表
            head = new ListNode(nextVal);
        } else {//未都最底层，继续递归
            head.next = listNodeAdd(head.next,nextVal);
        }

        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
