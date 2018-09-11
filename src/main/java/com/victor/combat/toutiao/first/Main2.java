package com.victor.combat.toutiao.first;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public static String[] token = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+", "-", "(", ")"};
    public static long count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println(count);
            return;
        }

        for (int i = 0; i < token.length; i++) {
            countLegal(n - 1, token[i]);
        }

        System.out.println(count);
    }

    private static void countLegal(int size, String s) {
        Stack<Character> stack = new Stack<>();

        StringBuilder re = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                if (re.length() > 0 && re.charAt(re.length() - 1) != '#') {
                    re.append('#');
                } else if (re.length() == 0){
                    re.append('#');
                }
            } else {
                re.append(s.charAt(i));
            }
        }

        String reString = re.toString();
        for (int i = 0; i < reString.length(); i++) {
            char current = reString.charAt(i);
            if (current == '-' || current == '+') {
                if (stack.isEmpty()) {
                    return;
                }
                Character c = stack.peek();
                if (c.equals('#')) {
                    stack.push(current);
                } else {
                    return;
                }
            } else if (current == '#') {
                if (!stack.isEmpty()) {
                    Character c = stack.peek();
                    if (c.equals('+') || c.equals('-')) {
                        stack.pop();
                    } else if (c.equals('(')) {
                        stack.push(current);
                    } else {
                        return;
                    }
                } else {
                    stack.push(current);
                }
            } else if (current == '(') {
                if (!stack.isEmpty()) {
                    Character c = stack.peek();
                    if (c.equals('+') || c.equals('-') || c.equals('(')) {
                        stack.push(c);
                    } else {
                        return;
                    }
                } else {
                    stack.push(current);
                }
            } else {
                if (!stack.isEmpty()) {
                    Character c = stack.peek();
                    if (c.equals('#')) {
                        stack.pop();
                        if (stack.isEmpty()) {
                            return;
                        }
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push('#');
                        } else {
                            Character c_1 = stack.peek();
                            if (c_1.equals('(')) {
                                stack.push('#');
                            } else {
                                stack.pop();
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }

        if (size == 0) {
            if (stack.isEmpty()) {
                count += 1;
            } else if (stack.size() == 1 && stack.peek().equals('#')) {
                count += 1;
            }

            if (count > 1000000007) {
                count = count % 1000000007;
            }
        } else {
            for (int i = 0; i < token.length; i++) {
                countLegal(size - 1, s + token[i]);
            }
        }
    }

}
