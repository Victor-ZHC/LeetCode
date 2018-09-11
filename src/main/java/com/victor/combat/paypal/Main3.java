package com.victor.combat.paypal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = Integer.parseInt(s.split(" ")[0]);
        int n = Integer.parseInt(s.split(" ")[1]);

        String[] original = new String[m];
        String[] modified = new String[n];

        for (int i = 0; i < m; i++) {
            original[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            modified[i] = sc.nextLine();
        }

        List<String> list = new ArrayList<>();
        int beginModified = 0;
        for (int i = 0; i < m; i++) {
            int notSameCount = 0;
            for (int j = beginModified; j < n; j++) {
                if (original[i].equals(modified[j])) {
                    for (int k = beginModified; k < beginModified + notSameCount; k++) {
                        list.add("+" + modified[k]);
                    }
                    beginModified = j + 1;
                    list.add(original[i]);
                    break;
                } else {
                    notSameCount++;
                }
            }
            if (notSameCount + beginModified == n) {
                list.add("-" + original[i]);
            }
        }

        for (int k = beginModified; k < modified.length; k++) {
            list.add("+" + modified[k]);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
