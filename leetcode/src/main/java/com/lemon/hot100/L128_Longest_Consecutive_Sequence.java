package com.lemon.hot100;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lemoon on 2025/3/22 13:25
 */
public class L128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int max = 0;

        for (Integer num : set) {
            int tmp = 0;
            if (!set.contains(num - 1)) {
                int current = num + 1;

                while (set.contains(current++)) {
                    tmp++;
                }

                max = Math.max(max, tmp + 1);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new L128_Longest_Consecutive_Sequence().longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    }
}