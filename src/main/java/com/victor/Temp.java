package com.victor;

import java.util.*;
import java.util.concurrent.*;

public class Temp {
    public static void main(String[] args) {

        ArrayList<String> temp = new ArrayList<>();
        String[] s = {"a", "b", "c", "d"};
        p(s, 0, 3);
//        c(s, 0, 2, temp);

//        Integer i = 1;
//        i++;
//        System.out.println(i);
//
//        System.out.println(testTryCatch());
    }

    public static int testTryCatch() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void c(String[] s, int index, int size, ArrayList<String> temp) {

        if (size == temp.size()) {
            print(temp.toArray());
            return;
        }

        if (index == s.length) {
            return;
        }

        temp.add(s[index]);
        c(s, index + 1, size, temp);
        temp.remove(s[index]);
        c(s, index + 1, size, temp);
    }

    public static void p(String[] s, int from, int to) {
        if (from == to) {
            print(s);
        }

        for (int i = from; i <= to; i++) {
            swap(s, i, from);
            p(s, from + 1, to);
            swap(s, i, from);
        }
    }

    public static void swap(String[] s, int i, int j) {
        String temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }

    public static void print(Object[] s) {
        for (Object each : s) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
}
