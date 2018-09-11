package com.victor.combat.iqiyi;

import java.util.Scanner;

public class Main3 {

    public static int result = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] ints = new int[n][2];

        for (int i = 0; i < n; i++) {
            ints[i][0] = sc.nextInt();
            ints[i][1] = sc.nextInt();
        }

        count(ints, 0, 0, m);

        System.out.println(result);
    }

    private static void count(int[][] ints, int i, int sum, int m) {
        if (i == ints.length) {
            if (sum == m) {
                result++;
            }
            return;
        }

        if (sum > m) {
            return;
        }

        for (int j = ints[i][0]; j < ints[i][1] + 1; j++) {
            count(ints, i + 1, sum + j, m);
        }
    }
}
