package com.victor.all.a_title_1_100.b_11_20;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 1) {
            return "";
        }
        StringBuffer sb = new StringBuffer(strs[0]);

        for (int i = 1; i < strs.length; i++) {
            if (sb.length() == 0) {
                return "";
            }
            char[] chars = strs[i].toCharArray();
            for (int j = 0; j < sb.length(); j++) {
                if (j >= chars.length || chars[j] != sb.charAt(j)) {
                    sb.delete(j, sb.length());
                    break;
                }
            }
        }

        return sb.toString();
    }
}
