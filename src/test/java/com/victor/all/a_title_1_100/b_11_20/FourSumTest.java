package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FourSumTest {

    @Test
    public void fourSum() {
        int[] ints = new int[]{1, 0, -1, 0, -2, 2};
        List<List<Integer>> result = new FourSum().fourSum(ints, 0);

        for (List<Integer> list : result) {
            for (Integer i : list) {
                System.out.printf(i + " ");
            }
            System.out.println();
        }
    }
}