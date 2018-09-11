package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import java.util.List;

public class LetterCombinationsOfPhoneNumberTest {

    @Test
    public void letterCombinations() {
        List<String> result = new LetterCombinationsOfPhoneNumber().letterCombinationsInRecursion("23");

        for (String s : result) {
            System.out.println(s);
        }
    }
}