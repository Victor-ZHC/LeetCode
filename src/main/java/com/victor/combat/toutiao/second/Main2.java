package com.victor.combat.toutiao.second;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = Integer.valueOf(sc.nextLine());

        String[][] group = new String[m][m];

        for (int i = 0; i < m; i++) {
            group[i] = sc.nextLine().split(" ");
        }

        int[][] groupSet = new int[m][m];
        int groupNum = 0;

        for (int j = 0; j < m; j++) {
            for (int k = 0; k < m; k++) {
                if (groupSet[j][k] == 0) {
                    String s = group[j][k];
                    if (s.equals("1")) {
                        groupNum++;
                        makeSet(groupSet, group, groupNum, j, k, m);
                    }
                }
            }
        }

        System.out.println(groupNum);
    }

    private static void makeSet(int[][] groupSet, String[][] group, int groupNum, int j, int k, int m) {
        if (j < 0 || j >= m || k < 0 || k >= m) {
            return;
        }
        if (groupSet[j][k] == 0) {
            if (group[j][k].equals("1")) {
                groupSet[j][k] = groupNum;
                makeSet(groupSet, group, groupNum, j, k + 1, m);
                makeSet(groupSet, group, groupNum, j, k - 1, m);
                makeSet(groupSet, group, groupNum, j + 1, k, m);
            } else {
                return;
            }
        } else {
            return;
        }
    }
}
