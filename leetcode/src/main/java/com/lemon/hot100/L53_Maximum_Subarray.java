package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/23 20:45
 */
public class L53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int result = nums[0];
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            dp[i + 1] = dp[i] < 0 ? nums[i] : dp[i] + nums[i];
            result = Math.max(result, dp[i + 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L53_Maximum_Subarray().maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(new L53_Maximum_Subarray().maxSubArray(new int[]{1}));
        System.out.println(new L53_Maximum_Subarray().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
