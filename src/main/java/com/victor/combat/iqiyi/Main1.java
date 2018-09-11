package com.victor.combat.iqiyi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char[] chars = s.toCharArray();

        StringBuffer sb = new StringBuffer();

        char c = chars[chars.length - 1];
        sb.append(c);
        for (int i = chars.length - 2; i > -1; i--) {
            if (chars[i] - c > -1) {
                c = chars[i];
                sb.append(c);
            }
        }

        System.out.println(sb.reverse().toString());
    }
}
