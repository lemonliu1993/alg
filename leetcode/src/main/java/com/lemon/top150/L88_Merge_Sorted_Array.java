package com.lemon.top150;

/**
 * Created by lemoon on 2023/5/2 06:36
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 */
public class L88_Merge_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int len = m + n;

        int index = len - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (m - 1 < 0) {
                nums1[i] = nums2[n - 1];
                n--;
            } else if (n - 1 < 0) {
                nums1[i] = nums1[m - 1];
                m--;
            } else if (nums1[m - 1] > nums2[n - 1]) {
                nums1[i] = nums1[m - 1];
                m--;
            } else {
                nums1[i] = nums2[n - 1];
                n--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 0, 0, 0};
        int[] a2 = {2, 5, 6};
        new L88_Merge_Sorted_Array().merge(a1, 3, a2, 3);
        for (int i = 0; i < a1.length; i++) {
            System.out.println(a1[i]);
        }
    }
}
