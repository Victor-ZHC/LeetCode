package com.victor.combat.huawei;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String IP = sc.nextLine();
        IP = IP.toUpperCase();
        String[] ips = IP.split(":");
        if (ips.length != 8) {
            System.out.println("Error");
            return;
        }
        for (int i = 0; i < 8; i++) {
            if (ips[i].length() != 4) {
                System.out.println("Error");
                return;
            }
            for (int j = 0; j < 4; j++) {
                if (!((ips[i].charAt(j) - 'A' > -1 &&  ips[i].charAt(j) - 'A' < 6) || (ips[i].charAt(j) - '0' > -1 &&  ips[i].charAt(j) - '0' < 10))) {
                    System.out.println("Error");
                    return;
                }
            }
        }

        switch (ips[0].substring(0, 2)) {
            case "FE":
                if (isLinkLocal(ips[0].charAt(2))) {
                    System.out.println("LinkLocal");
                    return;
                }
                if (isSiteLocal(ips[0].charAt(2))) {
                    System.out.println("SiteLocal");
                    return;
                }
                System.out.println("GlobalUnicast");
                return;
            case "FF":
                System.out.println("Multicast");
                return;
            default:
                for (int i = 0; i < 7; i++) {
                    if (! ips[i].equals("0000")) {
                        System.out.println("GlobalUnicast");
                        return;
                    }
                }
                if (ips[7].equals("0000")) {
                    System.out.println("Unspecified");
                    return;
                } else if (ips[7].equals("0001")) {
                    System.out.println("Loopback");
                    return;
                } else {
                    System.out.println("GlobalUnicast");
                    return;
                }
        }
    }
    public static boolean isLinkLocal(char c) {

        int temp = 0;
        if (c - 'A' > -1 &&  c - 'A' < 6) {
            temp = c - 'A' + 10;
        }
        if (c - '0' > -1 &&  c - '0' < 10) {
            temp = c - '0';
        }

        return (temp & 12) == 8;
    }

    public static boolean isSiteLocal(char c) {
        int temp = 0;
        if (c - 'A' > -1 &&  c - 'A' < 6) {
            temp = c - 'A' + 10;
        }
        if (c - '0' > -1 &&  c - '0' < 10) {
            temp = c - '0';
        }
        return (temp & 12) == 12;
    }
}
