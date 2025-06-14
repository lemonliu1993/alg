package com.lemon.hot100.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lemoon on 2025/5/17 10:59
 */
public class L128_Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        //这里不要用for循环原数组，如果有重复的会很占时间
//        for (int i = 0; i < nums.length; i++) {
        for(Integer i: set){
            if (set.contains(i - 1)) {
                continue;
            }
            int temp = 0;
            while (set.contains(i)) {
                temp++;
                i++;
            }
            result = Math.max(result, temp);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{100, 4, 200, 1, 3, 2};
        System.out.println(new L128_Longest_Consecutive_Sequence().longestConsecutive(arr));
        arr = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(new L128_Longest_Consecutive_Sequence().longestConsecutive(arr));

    }
}
