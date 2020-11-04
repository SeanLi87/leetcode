package com.sean.demo01;

import java.util.LinkedList;
import java.util.Queue;

public class N617合并二叉树 {

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(6);
        root1.right.right = new TreeNode(7);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
//        root2.right.right = new TreeNode(7);

        TreeNode treeNode = mergeTrees(root1, root2);
        System.out.println(treeNode);


    }

//    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        if (t1 == null) {
//            return t2;
//        }
//        if (t2 == null) {
//            return t1;
//        }
//        TreeNode merged = new TreeNode(t1.val + t2.val);
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
//        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
//        queue.offer(merged);
//        queue1.offer(t1);
//        queue2.offer(t2);
//        while (!queue1.isEmpty() && !queue2.isEmpty()) {
//            TreeNode node = queue.poll(), node1 = queue1.poll(), node2 = queue2.poll();
//            TreeNode left1 = node1.left, left2 = node2.left, right1 = node1.right, right2 = node2.right;
//            if (left1 != null || left2 != null) {
//                if (left1 != null && left2 != null) {
//                    TreeNode left = new TreeNode(left1.val + left2.val);
//                    node.left = left;
//                    queue.offer(left);
//                    queue1.offer(left1);
//                    queue2.offer(left2);
//                } else if (left1 != null) {
//                    node.left = left1;
//                } else if (left2 != null) {
//                    node.left = left2;
//                }
//            }
//            if (right1 != null || right2 != null) {
//                if (right1 != null && right2 != null) {
//                    TreeNode right = new TreeNode(right1.val + right2.val);
//                    node.right = right;
//                    queue.offer(right);
//                    queue1.offer(right1);
//                    queue2.offer(right2);
//                } else if (right1 != null) {
//                    node.right = right1;
//                } else {
//                    node.right = right2;
//                }
//            }
//        }
//        return merged;
//    }


    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        TreeNode newTree = new TreeNode(t1.val + t2.val);
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> newQueue = new LinkedList<>();
        queue.offer(t1);
        queue.offer(t2);
        newQueue.offer(newTree);
        while (!queue.isEmpty()) {
            TreeNode tmp1 = queue.poll();
            TreeNode tmp2 = queue.poll();
            TreeNode tmp3 = newQueue.poll();
            if (tmp1.left != null || tmp2.left != null) {
                if (tmp1.left != null && tmp2.left != null) {
                    queue.offer(tmp1.left);
                    queue.offer(tmp2.left);
                    tmp3.left = new TreeNode(tmp1.left.val + tmp2.left.val);
                } else if (tmp1.left == null) {
                    queue.offer(new TreeNode(0));
                    queue.offer(tmp2.left);
                    tmp3.left = new TreeNode(tmp2.left.val);
                } else if (tmp2.left == null) {
                    queue.offer(tmp1.left);
                    queue.offer(new TreeNode(0));
                    tmp3.left = new TreeNode(tmp1.left.val);
                }
                newQueue.offer(tmp3.left);
            }
            if (tmp1.right != null || tmp2.right != null) {
                if (tmp1.right != null && tmp2.right != null) {
                    queue.offer(tmp1.right);
                    queue.offer(tmp2.right);
                    tmp3.right = new TreeNode(tmp1.right.val + tmp2.right.val);
                } else if (tmp1.right == null) {
                    queue.offer(new TreeNode(0));
                    queue.offer(tmp2.right);
                    tmp3.right = new TreeNode(tmp2.right.val);
                } else if (tmp2.right == null) {
                    queue.offer(tmp1.right);
                    queue.offer(new TreeNode(0));
                    tmp3.right = new TreeNode(tmp1.right.val);
                }
                newQueue.offer(tmp3.right);

            }
        }
        return newTree;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
