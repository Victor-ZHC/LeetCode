package com.victor.datastructure;

import com.victor.tools.ArrayTools;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    public void begin (Object[] Array, int size) {
        List<Object> temp = new ArrayList<>();
        combination(Array, 0, size, temp);
    }

    private void combination (Object[] Array, int index, int size, List<Object> temp) {
        if (size == 0) {
            ArrayTools.printArray(temp.toArray());
            return;
        }

        if (index == Array.length) {
            return;
        }

        temp.add(Array[index]);
        combination(Array, index + 1, size - 1, temp);
        temp.remove(Array[index]);
        combination(Array, index + 1, size, temp);
    }
}
