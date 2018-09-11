package com.victor.datastructure;

import com.victor.datastructure.Permutation;
import org.junit.Before;
import org.junit.Test;

public class PermutationTest {
    Permutation permutation;
    Integer[] integers;
    String[] strings;


    @Before
    public void setUp() throws Exception {
        this.permutation = new Permutation();
        this.integers = new Integer[] {1, 2, 3, 4};
        this.strings = new String[] {"a", "b", "c", "d", "e"};
    }

    @Test
    public void begin() throws Exception {
        permutation.begin(integers);
        permutation.begin(strings);
    }

}