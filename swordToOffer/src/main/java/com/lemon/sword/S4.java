package com.lemon.sword;

/**
 * Created by lemoon on 2023/5/9 14:16
 * <p>
 * [
 * [1,   4,  7, 11, 15],
 * [2,   5,  8, 12, 19],
 * [3,   6,  9, 16, 22],
 * [10, 13, 14, 17, 24],
 * [18, 21, 23, 26, 30]
 * ]
 * 给定 target = 5，返回 true。
 * <p>
 * 给定 target = 20，返回 false。
 */
public class S4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null|| matrix.length ==0) {
            return false;
        }

        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        int l = 0;
        while (m >= 0 && l <= n) {
            if (target == matrix[m][l]) {
                return true;
            }
            if (target < matrix[m][l]) {
                m--;
            }else if (target > matrix[m][l]) {
                l++;
            }
        }

        return false;
    }

    public static void main(String[] args) {
         int[][] arr= new int[][]{{5}};
         new S4().findNumberIn2DArray(arr,-10);

    }
}
