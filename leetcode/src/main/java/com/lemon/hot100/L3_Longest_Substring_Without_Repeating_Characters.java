package com.lemon.hot100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lemoon on 2025/3/23 11:16
 */
public class L3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        int result = 0;
        int lastIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                lastIndex = Math.max(lastIndex, map.get(s.charAt(i)));
            }
            result = Math.max(result, i - lastIndex);

            map.put(s.charAt(i), i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("abc"));
        System.out.println(new L3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new L3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new L3_Longest_Substring_Without_Repeating_Characters().lengthOfLongestSubstring("pwwkew"));
    }
}
