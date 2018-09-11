package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.ReverseInteger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {
    ReverseInteger reverseInteger;
    int testNum1;
    int testNum2;

    @Before
    public void setUp() throws Exception {
        this.reverseInteger = new ReverseInteger();
        this.testNum1 = 123;
        this.testNum2 = -123;
    }

    @Test
    public void reverse() throws Exception {
        assertEquals(this.reverseInteger.reverse(this.testNum1), 321);
        assertEquals(this.reverseInteger.reverse(this.testNum2), -321);
    }

}