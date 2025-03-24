package com.lemon.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by lemoon on 2025/3/24 08:07
 */
public class L56_Merge_Intervals {
    public int[][] merge(int[][] intervals) {

        //想一下这里为什么不能用右端点

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < intervals.length && intervals[i][0] <= right && intervals[i][1] >= left) {
                right = Math.max(intervals[i][1], right);
                left = Math.min(intervals[i][0], left);
                i++;
            }
            result.add(new int[]{left, right});
            i--;
        }
        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[][] merge = new L56_Merge_Intervals().merge(new int[][]{
                {1, 3}, {2, 6}, {8, 10}, {15, 18}
        });
        int[][] merge1 = new L56_Merge_Intervals().merge(new int[][]{
                {1, 4}, {0, 4}
        });
        int[][] merge2 = new L56_Merge_Intervals().merge(new int[][]{
                {2, 3}, {4, 5}, {6, 7}, {1, 10}
        });
        for (int[] arr : merge) {
            System.out.println(arr[0] + ":" + arr[1]);
        }
        for (int[] arr : merge1) {
            System.out.println(arr[0] + ":" + arr[1]);
        }
        for (int[] arr : merge2) {
            System.out.println(arr[0] + ":" + arr[1]);
        }
    }
}
