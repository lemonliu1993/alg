package com.lemon.modules.greedy;

import java.util.Arrays;

/**
 * Created by lemoon on 2023/6/4 06:49
 * l455. 分发饼干
 */
public class T1_Assign_Cookies {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || g.length == 0 || s == null || s.length == 0) {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int index = 0;
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (index == g.length) {
                return count;
            }
            if (s[i] >= g[index]) {
                count++;
                index++;
            }
        }
        return count;
    }
}
