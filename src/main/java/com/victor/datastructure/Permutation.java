package com.victor.datastructure;

import com.victor.tools.ArrayTools;

public class Permutation {
    public void begin (Object[] Array) {
        permutation(Array, 0, Array.length - 1);
    }

    private void permutation (Object[] Array, int from, int to) {
        if (from == to) {
            ArrayTools.printArray(Array);
        } else {
            for (int i = from; i <= to; i++) {
                swap(Array, i, from);
                permutation(Array, from + 1, to);
                swap(Array, from, i);
            }
        }
    }

    private void swap (Object[] Array, int from, int to) {
        Object temp = Array[from];
        Array[from] = Array[to];
        Array[to] = temp;
    }
}
