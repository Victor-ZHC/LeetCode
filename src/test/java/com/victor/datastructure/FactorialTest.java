package com.victor.datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial() {
        assertEquals(6, new Factorial().factorial(3));
    }
}