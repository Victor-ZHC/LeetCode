package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.ZigZagConversion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    ZigZagConversion zigZagConversion;
    String testString;

    @Before
    public void setUp() throws Exception {
        this.zigZagConversion = new ZigZagConversion();
        this.testString = "PAYPALISHIRING";
    }

    @Test
    public void convert() throws Exception {
        assertEquals(this.zigZagConversion.convert(this.testString, 3), "PAHNAPLSIIGYIR");
    }

}