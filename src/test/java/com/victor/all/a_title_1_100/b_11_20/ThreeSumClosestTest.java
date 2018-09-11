package com.victor.all.a_title_1_100.b_11_20;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        int[] nums = {1, -1, 2, -2};
        System.out.println(new ThreeSumClosest().threeSumClosest(nums, 0));
    }
}