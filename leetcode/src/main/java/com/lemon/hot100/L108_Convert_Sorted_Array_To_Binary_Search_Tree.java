package com.lemon.hot100;

/**
 * Created by lemoon on 2025/4/1 22:25
 */
public class L108_Convert_Sorted_Array_To_Binary_Search_Tree {
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

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[nums.length / 2]);
        root.left = buildNode(nums, 0, nums.length / 2 - 1);
        root.right = buildNode(nums, nums.length / 2 + 1, nums.length - 1);
        return root;
    }

    private TreeNode buildNode(int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (end < start) {
            return null;
        }
        int middle = (start + end) / 2;
        TreeNode root = new TreeNode(nums[middle]);
        root.left = buildNode(nums, start, middle - 1);
        root.right = buildNode(nums, middle + 1, end);
        return root;
    }

}
