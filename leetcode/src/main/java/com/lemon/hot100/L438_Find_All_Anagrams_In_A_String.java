package com.lemon.hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lemoon on 2025/3/23 15:11
 */
public class L438_Find_All_Anagrams_In_A_String {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || p == null || s.length() < p.length()) {
            return result;
        }
        int[] calcS = new int[26];
        int[] calcP = new int[26];
        for (int i = 0; i < p.length(); i++) {
            calcS[s.charAt(i) - 'a']++;
            calcP[p.charAt(i) - 'a']++;
        }
        if (Arrays.equals(calcP, calcS)) {
            result.add(0);
        }
        for (int i = 0; i <= s.length() - p.length() - 1; i++) {
            calcS[s.charAt(i) - 'a']--;
            calcS[s.charAt(i + p.length()) - 'a']++;
            if (Arrays.equals(calcP, calcS)) {
                result.add(i + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new L438_Find_All_Anagrams_In_A_String().findAnagrams("cbaebabacd", "abc"));
        System.out.println(new L438_Find_All_Anagrams_In_A_String().findAnagrams("abab", "ab"));
    }
}
