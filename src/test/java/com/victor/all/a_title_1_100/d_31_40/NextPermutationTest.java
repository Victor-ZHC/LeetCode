package com.victor.all.a_title_1_100.d_31_40;

import com.victor.tools.ArrayTools;
import org.junit.Test;

import static org.junit.Assert.*;

public class NextPermutationTest {

    @Test
    public void nextPermutation() {
        int[] nums = {1, 5, 1};

        new NextPermutation().nextPermutation(nums);

        ArrayTools.printIntArray(nums);
    }
}