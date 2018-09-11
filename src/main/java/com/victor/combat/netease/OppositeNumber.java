package com.victor.combat.netease;

import java.util.Scanner;

public class OppositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        int flip = 0;

        while (tmp >= 10) {
            flip += tmp % 10;
            flip *= 10;
            tmp /= 10;
        }

        flip += tmp;

        System.out.println(flip + n);
    }
}
