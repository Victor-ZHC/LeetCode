package com.victor.all.a_title_1_100.a_1_10;

import java.util.regex.*;

public class StringToInteger {
    public int myAtoi(String str) {
        str = str.trim();
        String reg = "((\\+?)|(-?))\\d{1,11}";

        if (! str.matches(reg + ".*")) {
            return 0;
        }

        Pattern pattern = Pattern.compile(reg);
        Matcher matcher = pattern.matcher(str);

        matcher.find();
        int start = matcher.start();
        int end = matcher.end();

        Long result = Long.valueOf(str.substring(start, end));

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return result.intValue();
        }
    }

    public int myAtoiBetter(String str) {
        if(str.length()==0) return 0;
        int index=0;
        int result=0;
        while(str.charAt(index)==' ')
        {
            index++;
        }
        int isNegative=1;
        if(str.charAt(index)=='-' || str.charAt(index)=='+')
        {
            isNegative=str.charAt(index)=='+'?1:-1;
            index++;
        }
        while(index<str.length()&&str.charAt(index)=='0')
        {
            index++;
        }
        while(index<str.length())
        {
            int digit=str.charAt(index)-'0';
            if(digit<0||digit>9)
            {
                break;
            }
            if(Integer.MAX_VALUE/10<result || (Integer.MAX_VALUE/10==result && Integer.MAX_VALUE%10<digit))
            {
                return isNegative==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result=result*10+digit;
            index++;
        }

        return result*isNegative;
    }
}
