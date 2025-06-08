package com.lemon.hot100.hash;

import java.util.*;

/**
 * 字母异位词分组
 * Created by lemoon on 2025/5/15 08:44
 */
public class L49_Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return null;
        }
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap();
        for (int i = 0; i < strs.length; i++) {
            char[] array = strs[i].toCharArray();
            Arrays.sort(array);
            //PS:这里不能用toString()方法，调用的是Object的toString
//            String sortedStr = array.toString();
            String sortedStr = new String(array);
            List<String> list = map.getOrDefault(sortedStr, new ArrayList<String>());
            list.add(strs[i]);
            map.put(sortedStr,list);

//            if (map.containsKey(sortedStr)) {
//                List<String> stringList = map.get(sortedStr);
//                stringList.add(strs[i]);
//            } else {
//                List<String> list = new ArrayList<>();
//                list.add(strs[i]);
//                map.put(sortedStr, list);
//            }
        }

        for (List<String> list : map.values()) {
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(new L49_Group_Anagrams().groupAnagrams(strs));
    }
}
