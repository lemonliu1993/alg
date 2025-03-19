package com.lemon.modules.recursive;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lemoon on 2025/3/19 08:53
 */
public class T4_Generate_Parentheses {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {

        String str = "";
        generate(n, 0, 0, str);
        return result;
    }

    private void generate(int n, int left, int right, String str) {
        if (left == n && right == n) {
            result.add(str);
            return;
        }
        if (left > n || right > n || right > left) {
            return;
        }

        String str1 = str + "(";
        generate(n, left + 1, right, str1);
        String str2 = str + ")";
        generate(n, left, right + 1, str2);
    }

    public static void main(String[] args) {
        System.out.println(new T4_Generate_Parentheses().generateParenthesis(3));
    }
}
