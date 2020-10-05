package com.sean.demo01;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 思路：广度优先搜索
 * 搜索的同时计算每个节点和其父节点的总和，因此需要两个队列
 * */
public class 路径总和N112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(hasPathSum(root,15));
    }

    private static boolean hasPathSum(TreeNode root, int sum) {
        //空指针判断
        if (root == null) {
            return false;
        }
        //初始化两个队列用来存储当前节点和截止当前节点路径的值的总和
        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> nodeSum = new LinkedList<>();
        nodes.offer(root);
        nodeSum.offer(root.val);
        //如果队列中还有值，说明还没有循环到叶子节点
        while (!nodes.isEmpty()) {
            int tmp = nodeSum.poll();
            TreeNode currentNode = nodes.poll();
            //判断是否当前节点的左右节点还有值，若都没有，则说明当前节点为叶子节点
            if (currentNode.left == null && currentNode.right == null){
                if (tmp==sum){//如果总和=sum，则说明符合要求，返回true
                    return true;
                }
                continue;
            }
            //若左子节点不为空，则将左子节点以及路径总和压入队列
            if (currentNode.left != null){
                nodes.offer(currentNode.left);
                nodeSum.offer(tmp+currentNode.left.val);
            }
            //若右子节点不为空，则将左子节点以及路径总和压入队列
            if (currentNode.right != null){
                nodes.offer(currentNode.right);
                nodeSum.offer(tmp+currentNode.right.val);
            }

        }

        return false;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
