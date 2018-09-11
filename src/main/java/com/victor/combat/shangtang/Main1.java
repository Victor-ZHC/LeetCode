package com.victor.combat.shangtang;

import java.util.Scanner;

public class Main1 {

    public static int globalMin = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line1 = sc.nextLine().split(" ");
        String[] line2 = sc.nextLine().split(" ");
        int n = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        int[] num = new int[n];
        int[] newNum = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(line2[i]);
        }

        count(num, newNum, 0, k);

        System.out.println(globalMin);
    }

    private static void count(int[] num, int[] newNum, int index, int k) {
        if (index == num.length) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < num.length; i++) {
                if (newNum[i] > max) {
                    max = newNum[i];
                }
                if (newNum[i] < min) {
                    min = newNum[i];
                }
            }

            int dis = max - min;
            globalMin = dis < globalMin ? dis : globalMin;
            return;
        }
        newNum[index] = num[index] + k;
        count(num, newNum,index + 1, k);
        newNum[index] = num[index] - k;
        count(num, newNum, index + 1, k);
    }
}
