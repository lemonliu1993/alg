package com.lemon.modules.recursive;

import java.util.*;

/**
 * Created by lemoon on 2025/3/17 23:06
 *
 * leetcode 40
 */
public class T3_Combination_Sum_II {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        if (candidates == null || candidates.length == 0) {
            return new ArrayList<>(result);
        }
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        generate(0, target, candidates, list, result);
        return new ArrayList<>(result);
    }

    private void generate(int i, int target, int[] candidates, List<Integer> list, Set<List<Integer>> result) {
        if (i >= candidates.length || candidates[i] > target) {
            return;
        }

        if (candidates[i] == target) {
            list.add(candidates[i]);
            result.add(new ArrayList<>(list));
            list.remove(list.size() - 1);
            return;
        }
        // 选择当前数字，继续搜
        list.add(candidates[i]);
        generate(i + 1, target - candidates[i], candidates, list, result);
        list.remove(list.size() - 1);
        // 不选择当前数字，直接暴力去重，然后继续搜
        while (++i < candidates.length && candidates[i] == candidates[i-1]){

        }
        if(i<candidates.length){
            generate(i , target, candidates, list, result);
        }
    }



//    public List<List<Integer>> combinationSum2(int[] candidates, int target) {  //超时了
//        Set<List<Integer>> result = new HashSet<>();
//        if (candidates == null || candidates.length == 0) {
//            return new ArrayList<>(result);
//        }
//        Arrays.sort(candidates);
//        List<Integer> list = new ArrayList<>();
//        generate(0, target, candidates, list, result);
//        return new ArrayList<>(result);
//    }
//
//    private void generate(int i, int target, int[] candidates, List<Integer> list, Set<List<Integer>> result) {
//        if (i >= candidates.length || candidates[i] > target) {
//            return;
//        }
//        list.add(candidates[i]);
//
//        if (candidates[i] == target) {
//            result.add(new ArrayList<>(list));
//            list.remove(list.size() - 1);
//            return;
//        }
//        generate(i + 1, target - candidates[i], candidates, list, result);
//        list.remove(list.size() - 1);
//        generate(i + 1, target, candidates, list, result);
//    }

    public static void main(String[] args) {
        System.out.println(new T3_Combination_Sum_II().combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
        System.out.println(new T3_Combination_Sum_II().combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println(new T3_Combination_Sum_II().combinationSum2(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, 30));
    }
}
