package com.lemon.hot100.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 * Created by lemoon on 2025/5/15 08:36
 */
public class L1_Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int[] result = new int[]{map.get(target - nums[i]), i};
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
