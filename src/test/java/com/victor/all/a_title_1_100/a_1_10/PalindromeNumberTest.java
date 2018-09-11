package com.victor.all.a_title_1_100.a_1_10;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    @Test
    public void isPalindrome() {
        assertEquals(new PalindromeNumber().isPalindrome(12321), true);
    }
}