package com.victor.combat.meituan;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] ints = new int[10];

        for (int i = 0; i < s.length(); i++) {
            ints[s.charAt(i) - '0'] ++;
        }

        int[] min = {0 , 1};

        for (int j = 1; j < 10; j++) {
            if (ints[j] == 0) {
                System.out.println(j);
                return;
            }

            if (ints[j] < ints[min[1]]) {
                if (ints[j] < ints[min[0]]) {
                    min[1] = min[0];
                    min[0] = j;
                } else {
                    min[1] = j;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (min[0] == 0) {
            sb.append(min[1]);
            for (int k = 0; k <= ints[min[0]]; k++) {
                sb.append(min[0]);
            }
        } else {
            for (int k = 0; k <= ints[min[0]]; k++) {
                sb.append(min[0]);
            }
        }

        System.out.println(sb.toString());
    }
}
