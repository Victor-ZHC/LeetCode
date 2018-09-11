package com.victor.all.a_title_1_100.a_1_10;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        String[] letterArray = new String[s.length() * 2 + 1];
        for (int i = 0; i < letterArray.length; i++) {
            letterArray[i] = i % 2 == 1 ? s.charAt((i - 1) / 2) + "" : "";
        }

        int maxLength = 0;
        int maxCenter = 0;
        for (int i = 0; i < letterArray.length; i++) {
            int j = 1;
            while (i + j < letterArray.length && i - j > -1 && letterArray[i + j].equals(letterArray[i - j])) {
                j++;
            }
            if (j > maxLength) {
                maxLength = j;
                maxCenter = i;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int index = maxCenter - maxLength + 1; index < maxCenter + maxLength; index++) {
            sb.append(letterArray[index]);
        }
        String longestPalindrome = sb.toString();

        return longestPalindrome;
    }

}
