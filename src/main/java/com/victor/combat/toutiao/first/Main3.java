package com.victor.combat.toutiao.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> l = new ArrayList<>();

        int t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            String[] strings = new String[n];
            for (int j = 0; j < n; j++) {
                strings[j] = sc.nextLine();
            }
            l.add(strings);
        }

        for (String[] strings : l) {
            if (hasDouble(strings)) {
                System.out.println("Yeah");
            } else {
                System.out.println("Sad");
            }
        }

    }

    public static boolean hasDouble(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                String s1 = strings[i];
                String s2 = strings[j];

                if (s1.length() == s2.length()) {
                    for (int k = 0; k < s1.length(); k++) {
                        StringBuilder sb1 = new StringBuilder(s1.substring(0, k));
                        StringBuilder sb2 = new StringBuilder(s1.substring(k));

                        if (s2.equals(sb1.toString() + sb2.reverse().toString())) {
                            return true;
                        }
                        if (s2.equals(sb2.toString() + sb1.toString())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
