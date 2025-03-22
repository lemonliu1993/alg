package com.lemon.hot100;

/**
 * Created by lemoon on 2025/3/22 19:24
 */
public class L11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int x = 0;
        int y = height.length - 1;
        int max = 0;
        while (x < y) {
            int area = Math.min(height[x], height[y]) * (y - x);
            max = Math.max(area, max);
            if (height[x] <= height[y]) {
                x++;
            } else {
                y--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new L11_Container_With_Most_Water().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
