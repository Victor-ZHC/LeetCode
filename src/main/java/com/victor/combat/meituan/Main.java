package com.victor.combat.meituan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int distance = 0;

        String longer, shorter;
        int top = s1.length() - s2.length();

        if (top > 0) {
            longer = s1;
            shorter = s2;
        } else {
            shorter = s1;
            longer = s2;
            top = -top;
        }

        for (int i = 0; i <= top; i++) {
            distance += dis(longer.substring(i, i + shorter.length()), shorter);
        }

        System.out.println(distance);
    }

    public static int dis(String s1, String s2) {
        int dis = 0;
        for (int i = 0; i < s1.length(); i++) {
            dis += Math.abs(s1.charAt(i) - s2.charAt(i));
        }
        return dis;
    }
}
