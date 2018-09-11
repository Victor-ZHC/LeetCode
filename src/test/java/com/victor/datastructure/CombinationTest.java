package com.victor.datastructure;

import com.victor.datastructure.Combination;
import org.junit.Before;
import org.junit.Test;

public class CombinationTest {
    Combination combination;
    Integer[] integers;
    String[] strings;

    @Before
    public void setUp() throws Exception {
        this.combination = new Combination();
        this.integers = new Integer[] {1, 2, 3, 4};
        this.strings = new String[] {"a", "b", "c", "d", "e"};
    }

    @Test
    public void begin() throws Exception {
        combination.begin(integers, 3);
        combination.begin(strings, 3);
    }
}