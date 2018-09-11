package com.victor.all.a_title_1_100.c_21_30;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GenerateParenthesesTest {

    @Test
    public void generateParenthesis() {
        GenerateParentheses generateParentheses = new GenerateParentheses();

        List<String> result = generateParentheses.generateParenthesis(3);

        for (String s : result) {
            System.out.println(s);
        }
    }
}