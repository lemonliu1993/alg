package com.lemon.hot100;

import java.util.*;

/**
 * Created by lemoon on 2025/3/23 11:03
 */
public class L15_3sum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return null;
        }
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i <= nums.length - 3; i++) {
            generate(result, nums, i);
        }
        return new ArrayList<>(result);
    }

    private void generate(Set<List<Integer>> result, int[] nums, int i) {
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int total = nums[i] + nums[left] + nums[right];
            if (total == 0) {
                List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                result.add(list);
                left++;
            } else if (total > 0) {
                right--;
            } else {
                left++;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new L15_3sum().threeSum(new int[]{0, 1, 1}));
    }
}
