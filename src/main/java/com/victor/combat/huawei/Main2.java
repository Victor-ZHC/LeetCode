package com.victor.combat.huawei;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int length = s.length();
        int max = 0;

        if (length == 1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < length; i++) {
                for (int j = i + 1; j <= length; j++) {
                    StringBuilder sb = new StringBuilder(s.substring(i, j));
                    boolean boo = true;
                    for (int k = 0; k < sb.length() / 2; k++) {
                        if (sb.charAt(k) != sb.charAt(sb.length() - 1 - k)) {
                            boo = false;
                        }
                    }
                    if (boo) {
                        max = Math.max(j - i, max);
                    }
                }
            }

            System.out.println(max);
        }
    }


}