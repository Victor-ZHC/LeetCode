package com.victor.combat.paypal;

import java.util.Scanner;

public class Main2 {
    private static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n * 3);
            return;
        }
        int[] ints = new int[n];
        countNum(0, ints);
        System.out.println(count);
    }

    private static void countNum(int index, int[] ints) {

        if (index == ints.length - 1) {
            if (ints[index - 1] == ints[0]) {
                count += 2;
            } else {
                count += 1;
            }
            return;
        }

        if (index == 0) {
            ints[index] = 0;
            countNum(index + 1, ints);
            ints[index] = 1;
            countNum(index + 1, ints);
            ints[index] = 2;
            countNum(index + 1, ints);
        } else {
            if (ints[index - 1] == 0) {
                ints[index] = 1;
                countNum(index + 1, ints);
                ints[index] = 2;
                countNum(index + 1, ints);
            } else if (ints[index - 1] == 1) {
                ints[index] = 0;
                countNum(index + 1, ints);
                ints[index] = 2;
                countNum(index + 1, ints);
            } else if (ints[index - 1] == 2) {
                ints[index] = 0;
                countNum(index + 1, ints);
                ints[index] = 1;
                countNum(index + 1, ints);
            }
        }
    }
}
