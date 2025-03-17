package com.lemon.modules.recursive;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by lemoon on 2023/6/6 12:56
 */
public class T1_Subsets {
    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(new T1_Subsets().subsetsNew(new int[]{1, 2, 3}));
//        System.out.println(new T1_Subsets().generate(new int[]{1, 2, 3}));
    }


    public List<List<Integer>> generate(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tmp = new ArrayList<>();
        generate(0, nums, result, tmp);
        return result;
    }

    private void generate(int i, int[] nums, List<List<Integer>> result, List<Integer> tmp) {
        if (i == nums.length) {
            return;
        }
        tmp.add(nums[i]);
        result.add(new ArrayList<>(tmp));
        generate(i + 1, nums, result, tmp);

    }


    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<Integer> list = new ArrayList<>();
        result.add(new ArrayList<>(list));
        generate(list, 0, nums);

        return result;
    }

    public List<List<Integer>> subsetsNew(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int total = 1 << nums.length;
        for (int i = 0; i < total; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                if ((i & (1 << j)) != 0) {
                    temp.add(nums[j]);
                }
            }
            result.add(temp);
        }
        return result;
    }

    private void generate(List<Integer> list, int i, int[] nums) {
        if (i >= nums.length) {
            return;
        }

        list.add(nums[i]);
        result.add(new ArrayList<>(list));
        generate(list, i + 1, nums);
        list.remove(list.size() - 1);
        generate(list, i + 1, nums);
    }

}
