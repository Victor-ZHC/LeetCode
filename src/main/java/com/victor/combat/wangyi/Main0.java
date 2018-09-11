package com.victor.combat.wangyi;

import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {
        int n = 1;
        int m = 2;

        int[] tower = {8};
        int[][] order = {
                {2, 1, 9},
                {1, 1}
        };

        int[] filed = new int[n]; // 初始化全0
        for (int i = 0; i < m; i++) {
            if (order[i][0] == 2) {
                int x = order[i][1] - 1;
                int v = order[i][2];
                while (x < n && filed[x] + v > tower[x]) {
                    v = v - tower[x] + filed[x];
                    filed[x] = tower[x];
                    x = x + 1;
                }

                if (v > 0 && x < n) {
                    filed[x] = filed[x] + v;
                }
            } else {
                System.out.println(filed[order[i][1] - 1]);
            }
        }
    }
}
