package com.lemon.sword;

/**
 * Created by lemoon on 2023/5/9 10:21
 */
public class S5 {

    //    输入：s = "We are happy."
//    输出："We%20are%20happy."
    public String replaceSpace(String s) {
        if (s == null || s == "") {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                sb.append(s.charAt(i));
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
