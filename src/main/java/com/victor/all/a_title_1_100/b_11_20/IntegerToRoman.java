package com.victor.all.a_title_1_100.b_11_20;

public class IntegerToRoman {
    public String intToRoman(int num) {
        //1, 5, 10, 50, 100, 500, 1000
        //I, V, X,  L,  C,   D,   M
        String result = "";

        while (num > 0) {
            if (num >= 1000) {
                result += "M";
                num -= 1000;
            } else if (num >= 900) {
                result += "CM";
                num -= 900;
            } else if (num >= 500) {
                result += "D";
                num -= 500;
            } else if (num >= 400) {
                result += "CD";
                num -= 400;
            } else if (num >= 100) {
                result += "C";
                num -= 100;
            } else if (num >= 90) {
                result += "XC";
                num -= 90;
            } else if (num >= 50) {
                result += "L";
                num -= 50;
            } else if (num >= 40) {
                result += "XL";
                num -= 40;
            } else if (num >= 10) {
                result += "X";
                num -= 10;
            } else if (num >= 9) {
                result += "IX";
                num -= 9;
            } else if (num >= 5) {
                result += "V";
                num -= 5;
            } else if (num >= 4) {
                result += "IV";
                num -= 4;
            } else if (num >= 1) {
                result += "I";
                num -= 1;
            }
        }
        return result;
    }

    private static int[] nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static String[] strings = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRomanBetter(int num) {
        StringBuilder res = new StringBuilder();
        for (int i  = 0 ; i<nums.length; i++) {
            while (num >= nums[i]) {
                res.append(strings[i]);
                num -= nums[i];
            }
        }

        return res.toString();
    }
}
