package com.lemon.hot100;

/**
 * Created by lemoon on 2025/4/1 07:27
 */
public class L543_Diameter_Of_Binary_Tree {
    static class TreeNode {
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

    int result = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getHeight(root);
        return result;
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int hLeft = getHeight(node.left);
        int hright = getHeight(node.right);
        result = Math.max(hLeft + hright, result);
        return Math.max(hLeft, hright) + 1;
    }
}
