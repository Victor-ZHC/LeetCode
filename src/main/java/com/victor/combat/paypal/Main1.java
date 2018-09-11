package com.victor.combat.paypal;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String number = "";
        String result = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ':') {
                count++;
                if (count == 2) {
                    result += StringToInt(number) + " ";
                    count = 0;
                    number = "";
                }
            } else {
                number = number + s.charAt(i);
            }
        }

        result += StringToInt(number) + " ";

        System.out.println(result.substring(0, result.length() - 1));
    }

    private static int StringToInt(String s) {
        int sum = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            sum += pow(s.charAt(i), s.length() - 1 - i);
        }
        return sum;
    }

    private static int pow(char c, int i) {
        int value = 0;
        if (c - 'A' >= 0 && c - 'F' <= 0) {
            value = c - 'A' + 10;
        } else if (c - '0' >= 0 && c - '9' <= 0) {
            value = c -'0';
        }

        return (int) Math.pow(16, i) * value;
    }
}
