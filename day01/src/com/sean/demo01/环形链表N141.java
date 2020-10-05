package com.sean.demo01;

import java.util.HashSet;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/linked-list-cycle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/

public class 环形链表N141 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = head;
        System.out.println(hasCycle(head));

    }

    public static boolean hasCycle(ListNode head) {
        boolean isLoop = false;
        //声明一个hashset，用于存储被循环过的链表元素
        HashSet<ListNode> passedE = new HashSet<>();
        //循环链表
        while (head!=null){
            if (passedE.add(head)){//若hashset中没有出现链表的值时，说明没有环
                head = head.next;
            }else {//若hashset中出现链表的值时，说明有环,退出循环
                isLoop = true;
                break;
            }
        }
        return isLoop;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
