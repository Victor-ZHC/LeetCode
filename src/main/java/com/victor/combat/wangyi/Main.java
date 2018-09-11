package com.victor.combat.wangyi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int result = x / 5;

        if (x % 5 > 0) {
            System.out.println(result + 1);
        } else {
            System.out.println(result);
        }
    }
}
