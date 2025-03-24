package com.lemon.hot100;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Created by lemoon on 2025/3/23 15:31
 */
public class L560_Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            if (map.containsKey(total - k)) {
                result += map.get(total - k);
            }
            if (map.containsKey(total)) {
                map.put(total, map.get(total) + 1);
            } else {
                map.put(total, 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L560_Subarray_Sum_Equals_K().subarraySum(new int[]{1, 2, 3}, 3));
        System.out.println(new L560_Subarray_Sum_Equals_K().subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(new L560_Subarray_Sum_Equals_K().subarraySum(new int[]{1}, 0));
    }
}
