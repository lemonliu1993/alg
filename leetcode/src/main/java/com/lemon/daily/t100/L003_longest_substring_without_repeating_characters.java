package com.lemon.daily.t100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemoon on 2023/2/1 20:45
 */
public class L003_longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int result = 1;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        map.put(s.charAt(0), 0);
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                int len = i - map.get(ch);
                dp[i] = Math.min(dp[i - 1] + 1, len);
            } else {
                dp[i] = dp[i - 1] + 1;
            }
            map.put(s.charAt(i), i);
            result = result > dp[i] ? result : dp[i];
        }
        return result;
    }

    public static void main(String[] args) {
//        String s = "abcabcbb";
//        String s = "bbbbb";
        String s = "pwwkew";
        int i = new L003_longest_substring_without_repeating_characters().lengthOfLongestSubstring(s);
        System.out.println(i);
    }
}
