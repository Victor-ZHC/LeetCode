package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        int[] nums = {3, 0, -2, -1, 1, 2};
        List<List<Integer>> lists = new ThreeSum().threeSum(nums);

        for (List<Integer> l : lists) {
            for (Integer integer : l) {
                System.out.print(integer + ", ");
            }
            System.out.println();
        }
    }
}