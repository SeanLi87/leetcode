package com.sean.demo01;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class 用栈实现队列N232 {

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        int param_2 = obj.pop();
        System.out.println(param_2);//1
        int param_3 = obj.peek();
        int param_4 = obj.peek();
        System.out.println(param_3);//2
        System.out.println(param_4);//2
        boolean param_5 = obj.empty();
        System.out.println(param_5);//false
    }

    public static class MyQueue {
        Deque<Integer> stack1 = new LinkedList<>();
        Deque<Integer> stack2 = new LinkedList<>();

        public MyQueue() {
        }

        /**
         * Push element x to the back of queue.
         * 思路：将最新元素存入栈底
         */
        public void push(int x) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            stack2.push(x);
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }


        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return stack1.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return stack1.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return stack1.isEmpty();
        }
    }


}
