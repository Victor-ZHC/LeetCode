package com.victor.tools;

public class ArrayTools {
    public static void printArray(Object[] array) {
        for (Object o : array) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void printIntArray(int[] array) {
        if (array == null) {
            System.out.println("");
            return;
        }

        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
