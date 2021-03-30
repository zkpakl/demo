package com.example.demo.algorithm.test;

/**
 * 平衡二叉树 判断是否是平衡二叉树
 */
public class Offer55_2 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node5.left = node7;
        node3.right = node6;
        System.out.println(isBalanced(root));
    }

    /**
     * 通过后序遍历分别先遍历左右子节点
     *
     * @param root
     * @return
     */
    private static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int left = treeDepth(root.left);
        int right = treeDepth(root.right);
        int diff=left-right;
        if(diff> 1||diff<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }

    static int treeDepth(TreeNode root) {
        if (root != null) {
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            return left > right ? left + 1 : right + 1;
        }
        return 0;
    }
}



