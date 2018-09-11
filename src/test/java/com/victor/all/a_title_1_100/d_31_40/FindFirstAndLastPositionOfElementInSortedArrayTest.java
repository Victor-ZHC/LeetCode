package com.victor.all.a_title_1_100.d_31_40;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void searchRange() {
        int[] nums = new int[]{5,7,7,8,8,10};

        int[] res = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, 10);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}