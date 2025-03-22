package com.lemon.hot100;

/**
 * Created by lemoon on 2025/2/28 08:25
 * 输入: nums = [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */
public class L283_Move_Zeroes {
    public void moveZeroes(int[] nums) {
        int indexZero = 0;
        int indexNoneZero = 0;
        while (indexNoneZero < nums.length && indexZero < nums.length) {
            while (indexZero < nums.length && nums[indexZero] != 0) {
                indexZero++;
            }
            indexNoneZero = indexZero+1;
            while (indexNoneZero < nums.length && nums[indexNoneZero] == 0) {
                indexNoneZero++;
            }
            if (indexNoneZero >= nums.length || indexZero >= nums.length) {
                return;
            }
            swap(nums, indexNoneZero, indexZero);
        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String[] args) {
//        int[] arr = new int[]{1, 2, 3, 1};
//        int[] arr = new int[]{0, 1, 0, 3, 12};
        int[] arr = new int[]{1,0};
        new L283_Move_Zeroes().moveZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
