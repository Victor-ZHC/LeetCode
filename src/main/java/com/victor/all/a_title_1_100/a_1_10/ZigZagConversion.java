package com.victor.all.a_title_1_100.a_1_10;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() == 0 || numRows >= s.length()) {
            return s;
        }
        StringBuffer sb = new StringBuffer();
        char[] charArray = s.toCharArray();
        int gap = (numRows - 1) * 2;

        int firstGap, secondGap, index;
        for (int i = 0; i < numRows; i++) {
            secondGap = i * 2;
            firstGap = gap - secondGap;
            index = i;

            while (index < charArray.length) {
                if (firstGap != 0 && index < charArray.length) {
                    sb.append(charArray[index]);
                    index += firstGap;
                }
                if (secondGap != 0 && index < charArray.length) {
                    sb.append(charArray[index]);
                    index += secondGap;
                }
            }
        }

        return sb.toString();
    }
}
