package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void intToRoman() {
        System.out.println(new IntegerToRoman().intToRoman(99));
    }

    @Test
    public void intToRomanBetter() {
        System.out.println(new IntegerToRoman().intToRomanBetter(99));
    }
}