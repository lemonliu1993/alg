package com.lemon.modules.greedy;

/**
 * Created by lemoon on 2023/6/4 09:56
 */
public class T2_Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }
        int[] diff = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }

        int status = 0;
        int result = 1;

        for (int j = 1; j < diff.length; j++) {
            if (diff[j] > 0) {
                if (status == 2 || status == 0) {
                    result++;
                    status = 1;
                }
            } else if (diff[j] < 0) {
                if (status == 1 || status == 0) {
                    result++;
                    status = 2;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 17, 5, 10, 13, 15, 10, 5, 16, 8};
        System.out.println(new T2_Wiggle_Subsequence().wiggleMaxLength(arr));
    }
}
