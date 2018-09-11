package com.victor.all.a_title_1_100.d_31_40;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void search() {
        int[] nums = {1,3};

        System.out.println(new SearchInRotatedSortedArray().search(nums, 1));
    }
}