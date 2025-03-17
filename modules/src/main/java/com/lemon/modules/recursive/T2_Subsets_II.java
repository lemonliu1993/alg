package com.lemon.modules.recursive;

import java.util.*;

/**
 * Created by lemoon on 2023/6/6 12:56
 * <p>
 * leetcode 90
 */
public class T2_Subsets_II {

    Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();
        set.add(new ArrayList<>());
        getResult(0, nums, list);


        return new ArrayList<>(set);
    }

    private void getResult(int i, int[] nums, List<Integer> list) {
        if (i == nums.length) {
            return;
        }
        list.add(nums[i]);
        if (!set.contains(list)) {
            set.add(new ArrayList<>(list));
        }
        getResult(i + 1, nums, list);
        list.remove(list.size() - 1);
        getResult(i + 1, nums, list);
    }

    public static void main(String[] args) {
        System.out.println(new T2_Subsets_II().subsetsWithDup(new int[]{2, 1, 2, 2}));
    }
}
