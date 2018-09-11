package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.a_title_1_100.a_1_10.TwoSum;
import com.victor.tools.ArrayTools;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {
    private TwoSum twoSum;
    private int[] nums;
    private int target;

    @Before
    public void setUp() throws Exception {
        twoSum = new TwoSum();
        nums = new int[]{-1,-2,-3,-4,-5};
        target = -8;
    }

    @Test
    public void twoSum() {
        try {
            ArrayTools.printIntArray(twoSum.twoSum(nums, target));
            ArrayTools.printIntArray(twoSum.twoSumBetter(nums, target));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}