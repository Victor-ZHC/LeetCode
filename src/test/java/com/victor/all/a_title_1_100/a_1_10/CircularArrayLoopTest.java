package com.victor.all.a_title_1_100.a_1_10;

import com.victor.all.d_title_401_500.CircularArrayLoop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Victor_Zhou on 2017-5-24.
 */
public class CircularArrayLoopTest {
    private CircularArrayLoop circularArrayLoop = null;
    private int[] array1 = null;
    private int[] array2 = null;
    private int[] array3 = null;

    @Before
    public void setUp() throws Exception {
        circularArrayLoop = new CircularArrayLoop();
        array1 = new int[] { 2, -1, 1, 2, 2 };
        array2 = new int[] { -1, 2 };
        array3 = new int[] { 2, -1, 1, -2, -2 };
    }

    @Test
    public void circularArrayLoop() throws Exception {
        assertEquals(true, circularArrayLoop.circularArrayLoop(array1));
        assertEquals(false, circularArrayLoop.circularArrayLoop(array2));
        assertEquals(false, circularArrayLoop.circularArrayLoop(array3));
    }

}