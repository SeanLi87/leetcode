package com.sean.demo01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class N144二叉树的前序遍历 {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        List<Integer> integers = preorderTraversal(null);
        System.out.println(integers);
        for (Integer integer : integers) {
            System.out.println(integer);
        }



    }

    //前序遍历：递归
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root==null){
            return list;
        }else {
            list.add(root.val);
            List<Integer> integersLeft = preorderTraversal(root.left);
            List<Integer> integersRight = preorderTraversal(root.right);
            if (integersLeft!=null){
                list.addAll(integersLeft);
            }
            if (integersRight!=null){
                list.addAll(integersRight);
            }
        }
        return list;
    }

    //前序遍历：迭代
    public static List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();

        return list;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
