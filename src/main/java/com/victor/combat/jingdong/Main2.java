package com.victor.combat.jingdong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    private static long count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        for (int i = 1; i < Math.pow(2, s.length()); i++) {
            List<Character> chars = new ArrayList<>();
            int t = i;
            int index = 0;
            while (t != 0) {
                if (t % 2 == 1) {
                    chars.add(s.charAt(index));
                }
                index ++;
                t = t >>> 1;
            }
            if (isR(chars)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static void combination (Character[] Array, int index, int size, List<Character> temp) {
        if (size == 0) {
            if (isR(temp)) {
                count ++;
            }
            return;
        }

        if (index == Array.length) {
            return;
        }

        temp.add(Array[index]);
        combination(Array, index + 1, size - 1, temp);
        temp.remove(Array[index]);
        combination(Array, index + 1, size, temp);
    }

    private static boolean isR(List<Character> temp) {
        int size = temp.size();
        for (int i = 0; i < size / 2; i++) {
            if (! temp.get(i).equals(temp.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
