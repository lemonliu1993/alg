package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/29 10:16
 */
public class L240_Search_A_2d_Matrix_Ii {

    public boolean searchMatrix(int[][] matrix, int target) {
        int indexX = matrix.length - 1;
        int indexY = 0;
        while (indexX >= 0 && indexY <= matrix[0].length - 1) {
            if (matrix[indexX][indexY] == target) {
                return true;
            } else if (matrix[indexX][indexY] > target) {
                indexX--;
            } else {
                indexY++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{-1, 1}};
        System.out.println(new L240_Search_A_2d_Matrix_Ii().searchMatrix(arr, 1));
    }
}
