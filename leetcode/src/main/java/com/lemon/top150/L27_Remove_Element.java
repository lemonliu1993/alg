package com.lemon.top150;

/**
 * Created by lemoon on 2023/5/4 09:10
 */
public class L27_Remove_Element {
    //nums = [0,1,2,2,3,0,4,2], val = 2
    //输出：5, nums = [0,1,4,0,3]
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                swap(nums, index, i);
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        return index;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
//        int[] nums= {0,1,2,2,3,0,4,2};
//        int[] nums= {0,1,3,0,2,2,4,2};

        int i = new L27_Remove_Element().removeElement(nums, 2);
        System.out.println(i);
    }
}
