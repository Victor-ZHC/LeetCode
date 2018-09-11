package com.victor.all.a_title_1_100.a_1_10;

public class ReverseInteger {
    public int reverse(int x) {
        long result = 0L;
        int value = Math.abs(x);
        int number;

        if (x > 0) {
            while (value > 0) {
                number = value % 10;
                value = value / 10;
                result = result * 10 + number;
            }
        } else {
            while (value > 0) {
                number = value % 10;
                value = value / 10;
                result = result * 10 - number;
            }
        }

        return result > Integer.MAX_VALUE || result < Integer.MIN_VALUE ? 0 : new Long(result).intValue();
    }
}
