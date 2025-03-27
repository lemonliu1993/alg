package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/27 08:06
 */
public class L136_Single_Number {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L136_Single_Number().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
