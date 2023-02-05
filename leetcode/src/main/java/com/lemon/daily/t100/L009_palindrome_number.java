package com.lemon.daily.t100;

/**
 * Created by lemoon on 2023/2/5 22:11
 */
public class L009_palindrome_number {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return res == x || res / 10 == x;
    }

    public static void main(String[] args) {
        System.out.println(new L009_palindrome_number().isPalindrome(123));
        System.out.println(new L009_palindrome_number().isPalindrome(10));
        System.out.println(new L009_palindrome_number().isPalindrome(12321));
        System.out.println(new L009_palindrome_number().isPalindrome(1221));
    }
}
