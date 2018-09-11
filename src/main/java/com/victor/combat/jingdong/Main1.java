package com.victor.combat.jingdong;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long[] longs = new long[t];

        for (int i = 0; i < t; i++) {
            longs[i] = sc.nextLong();
        }

        for (int i = 0; i < t; i++) {
            if (longs[i] % 2 == 0) {
                long integer = longs[i];
                long a = 2;
                long b = integer >> 1;
                while (b % 2 == 0) {
                    a = a << 1;
                    b = b >> 1;
                }
                System.out.println(b + " " + a);
            } else {
                System.out.println("No");
            }
        }
    }
}
