package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        String[] strs = {"zhouhanchen", "zhouvictor", "zhouhanchenseniyuting", "zhouseniyutingshizhu"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
    }
}