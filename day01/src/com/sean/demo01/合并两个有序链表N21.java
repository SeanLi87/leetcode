package com.sean.demo01;
/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。
 * 新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 递归思路还未清晰
 * */


public class 合并两个有序链表N21 {
    public static void main(String[] args) {


        ListNode l1 = new ListNode(1);
        l1 = nodeAdd(l1, 2);
        l1 = nodeAdd(l1, 4);
        System.out.println(l1);
        ListNode l2 = new ListNode(1);
        l2 = nodeAdd(l2, 3);
//        l2 = nodeAdd(l2 ,4);
        l2 = nodeAdd(l2, 5);
        System.out.println(l2);
        System.out.println(mergeTwoLists(l1, l2).toString());
    }

    private static ListNode nodeAdd(ListNode head, int nextVal) {
        if (head == null) {
            head = new ListNode(nextVal);
        } else {
            head.next = nodeAdd(head.next, nextVal);
        }
        return head;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return
                    "val=" + val +
                            ", next=" + next;
        }
    }
}
