package com.victor.all.a_title_1_100.a_1_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatchingTest {

    @Test
    public void isMatch() {
        System.out.println(new RegularExpressionMatching().isMatch("aaaaa", "a*"));
    }
}