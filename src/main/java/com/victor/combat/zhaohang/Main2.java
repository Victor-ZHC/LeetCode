package com.victor.combat.zhaohang;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringBuilder inputSb = new StringBuilder(input);
        StringBuilder outputSb = new StringBuilder();

        int length = inputSb.length();

        int numOfDot = 0;
        int lastLIndex = 0;
        int lastRIndex = 0;

        for (int i = 0; i < length; i++) {
            char c = inputSb.charAt(i);

            switch (c) {
                case '.':
                    numOfDot++;
                    break;
                case 'L':
                    lastLIndex = i;
                    if (numOfDot != 0) {
                        appendOutput(outputSb, 'L', numOfDot + 1);
                    } else {
                        if (lastRIndex < lastLIndex) {
                            int num = (lastLIndex - lastRIndex) / 2;
                            appendOutput(outputSb, 'R', num);
                            appendOutput(outputSb, '.', 1);
                            appendOutput(outputSb, 'L', num);
                            lastRIndex = 0;
                        }
                    }
                    numOfDot = 0;

                    break;
                case 'R':
                    lastRIndex = i;

                    if (lastRIndex > lastLIndex) {
                        int num = lastLIndex - lastRIndex - 1;
                        appendOutput(outputSb, '.', num);
                        appendOutput(outputSb, 'R', 1);
                        lastLIndex = 0;
                    }
                    numOfDot = 0;
                    break;
            }
        }

        System.out.println(outputSb.toString());
    }

    public static void appendOutput(StringBuilder sb, char c, int num) {
        for (int i = 0; i < num; i++) {
            sb.append(c);
        }
    }
}
