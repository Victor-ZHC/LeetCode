package com.victor.combat.netease;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Vector;

public class MagicCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        StringBuffer sb = new StringBuffer();

        Vector<String> v = null;
        HashMap<String, String> hm = null;
        HashSet<String> hs = null;

        while (x > 0) {
            if (x % 2 == 1) {
                sb.insert(0, "1");
                x -= 1;
                x /= 2;
            } else {
                sb.insert(0, "2");
                x -= 2;
                x /= 2;
            }
        }

        System.out.println(sb.toString());
    }
}
