package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/29 07:32
 */
public class L238_Product_Of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] result = new int[nums.length];
        left[0] = 1;
        right[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = nums[i - 1] * left[i - 1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }
}
