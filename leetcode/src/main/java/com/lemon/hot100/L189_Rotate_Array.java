package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/29 07:20
 */
public class L189_Rotate_Array {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        k = k % nums.length;
        rotate(nums, 0, nums.length - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, nums.length - 1);
    }

    private void rotate(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
