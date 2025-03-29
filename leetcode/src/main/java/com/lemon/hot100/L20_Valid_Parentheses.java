package com.lemon.hot100;

import java.util.Stack;

/**
 * Created by lemoon on 2025/3/29 16:38
 */
public class L20_Valid_Parentheses {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            Character pop = stack.pop();

            if (s.charAt(i) == ')') {
                if (pop != '(') {
                    return false;
                }
            }
            if (s.charAt(i) == ']') {
                if (pop != '[') {
                    return false;
                }
            }
            if (s.charAt(i) == '}') {
                if (pop != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new L20_Valid_Parentheses().isValid("()"));
        System.out.println(new L20_Valid_Parentheses().isValid("()[]{}"));
        System.out.println(new L20_Valid_Parentheses().isValid("(]"));
        System.out.println(new L20_Valid_Parentheses().isValid("([])"));
    }
}
