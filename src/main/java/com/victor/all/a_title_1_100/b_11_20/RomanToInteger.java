package com.victor.all.a_title_1_100.b_11_20;

import java.util.HashMap;

public class RomanToInteger {
    private static int[] nums = new int[]{1000, 500, 100, 50, 10, 5, 1};
    private static char[] chars = new char[]{'M', 'D', 'C', 'L', 'X', 'V', 'I'};
    private static HashMap<Character, Integer> map = new HashMap<>();

    public int romanToInt(String s) {
        for (int i = 0; i < nums.length; i++) {
            map.put(chars[i], nums[i]);
        }
        
        int result = 0;
        int present;
        int last = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            present = map.get(s.charAt(i));
            if (present < last) {
                result -= present;
            } else {
                result += present;
            }
            last = present;
        }
        return result;
    }
}
