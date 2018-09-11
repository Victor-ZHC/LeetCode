package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.MedianOfTwoSortedArrays;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Victor_Zhou on 2017-5-26.
 */
public class MedianOfTwoSortedArraysTest {
    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;
    private int[] nums1, nums2;

    @Before
    public void setUp() throws Exception {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        nums1 = new int[]{ };
        nums2 = new int[]{ 1, 3 };
    }

    @Test
    public void findMedianSortedArrays() throws Exception {
        assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(nums1, nums2), 0.001);
    }

}