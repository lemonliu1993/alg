package com.lemon.hot100;


import java.util.*;

/**
 * Created by lemoon on 2025/3/22 10:45
 */
public class L49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        if (strs.length == 1) {
            List<String> list = new ArrayList<>();
            list.add(strs[0]);
            result.add(list);
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String val = new String(array);
            if (map.containsKey(val)) {
                map.get(val).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(val, list);
            }
        }

        return new ArrayList<List<String>>(map.values());
    }

    public static void main(String[] args) {
        System.out.println(new L49_Group_Anagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }
}
