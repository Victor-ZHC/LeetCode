package com.victor.all.a_title_1_100.a_1_10;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int origin = x;
        int revert = 0;
        while (x > 0) {
            revert = revert * 10 + x % 10;
            x /= 10;
        }
        return revert == origin;
    }
}
