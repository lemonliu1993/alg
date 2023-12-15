package com.lemon.sword;

/**
 * Created by lemoon on 2023/5/9 12:54
 *
 * 找出数组中重复的数字。
 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

 示例 1：
 输入：
 [2, 3, 1, 0, 2, 5, 3]
 输出：2 或 3
 */
public class S3 {
    public int findRepeatNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==i)
            while(nums[i]!=i){
                swap(nums,i,nums[i]);
            }
        }

        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
