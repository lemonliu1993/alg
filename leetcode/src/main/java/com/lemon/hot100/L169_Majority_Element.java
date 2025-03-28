package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/28 08:46
 */
public class L169_Majority_Element {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        int total = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == result) {
                total++;
            } else {
                total--;
                if (total <= 0) {
                    result = nums[i];
                    total = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L169_Majority_Element().majorityElement(new int[]{1, 3, 1, 1, 4, 1, 1, 5, 1, 1, 6, 2, 2}));
    }
}
