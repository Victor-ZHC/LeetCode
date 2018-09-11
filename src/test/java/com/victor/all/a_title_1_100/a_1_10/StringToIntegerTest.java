package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.StringToInteger;
import org.junit.Test;

public class StringToIntegerTest {

    @Test
    public void myAtoi() {
        String str = "    010";

        System.out.println(new StringToInteger().myAtoi(str));
    }
}