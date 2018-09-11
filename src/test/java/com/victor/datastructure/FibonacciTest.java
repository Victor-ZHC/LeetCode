package com.victor.datastructure;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void fibonacci() {
        assertEquals(2, new Fibonacci().fibonacci(3));
        System.out.println(new Fibonacci().fibonacci(50));
    }
}