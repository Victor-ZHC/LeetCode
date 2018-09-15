package com.victor.combat.wap;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String a[] = new String[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt() + "";
        }

        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isDivisibleBySeven(stringToints(a[i] + a[j]))) {
                    ans++;
                }

                if (isDivisibleBySeven(stringToints(a[j] + a[i]))) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }

    public static int[] stringToints(String s) {
        int[] ints = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            ints[i] = Integer.parseInt("" + s.charAt(i));
        }
        return ints;
    }

    public static boolean isDivisibleBySeven(int[] n) {
        int m = n.length;
        int b = 0;
        for (int i = 0; i < n.length - 3; i++) {
            b = n[m - 4] * 100 + n[m - 3] * 10 + n[m - 2];
            b = b - 2 * n[m - 1];
            n[m - 4] = b / 100;
            n[m - 3] = b % 100 / 10;
            n[m - 2] = b % 10;
            n[m - 1] = 0;
            m--;
        }

        if (3 == m) {
            b = n[0] * 100 + n[1] * 10 + n[2];
            if (b % 7 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (2 == m) {
            b = n[0] * 10 + n[1];
            if (b % 7 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (1 == m) {
            b = n[0];
            if (b % 7 == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
