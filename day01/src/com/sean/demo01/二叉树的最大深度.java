package com.sean.demo01;

import java.util.*;

public class 二叉树的最大深度 {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        levelTraverse(root);

        //先序遍历二叉树//[3,9,20,null,null,15,7]
/*        preOrderTraveral(root);
        System.out.println("\n");
        inOrderTraveral(root);
        System.out.println("\n");
        postOrderTraveral(root);*/
    }


//    public int[] findMode(TreeNode root) {
//        if (root == null){
//            return null;
//        }else {
//            int []
//        }
//    }

    //最大深度递归
    static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    //先序遍历“根左右”，从上往下
    //理解：从上往下遍历时，将每三个节点作为一个子树进行“根左右”判断
    static void preOrderTraveral(TreeNode node) {

        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");//当前节点的值
        preOrderTraveral(node.left);
        preOrderTraveral(node.right);

    }

    //中序遍历“左根右”，从下往上
    //理解：将每三个节点作为一个子树进行“左根右”判断
    static void inOrderTraveral(TreeNode node) {
        if (node == null) {
//            System.out.println("当前节点没有值");
            return;
        }
        inOrderTraveral(node.left);
        System.out.print(node.val + " ");//当前节点的值
        inOrderTraveral(node.right);
    }

    //后序遍历“左右根”，从下往上
    //理解：将每三个节点作为一个子树进行“左右根”判断
    static void postOrderTraveral(TreeNode node) {
        if (node == null) {
//            System.out.println("当前节点没有值");
            return;
        }
        postOrderTraveral(node.left);
        postOrderTraveral(node.right);
        System.out.print(node.val + " ");//当前节点的值
    }

    //层次遍历
    public static void levelTraverse(TreeNode root) {
        int nodeCount = 0;
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            nodeCount++;
            TreeNode node = queue.poll();
            System.out.println(node.val + "  "+queue);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        System.out.println(nodeCount);
    }

}
