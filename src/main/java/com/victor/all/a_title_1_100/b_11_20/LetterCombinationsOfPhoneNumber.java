package com.victor.all.a_title_1_100.b_11_20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {

    HashMap<Character, char[]> map = new HashMap<>();

    {
        map.put('2', new char[]{'a', 'b', 'c'});
        map.put('3', new char[]{'d', 'e', 'f'});
        map.put('4', new char[]{'g', 'h', 'i'});
        map.put('5', new char[]{'j', 'k', 'l'});
        map.put('6', new char[]{'m', 'n', 'o'});
        map.put('7', new char[]{'p', 'q', 'r', 's'});
        map.put('8', new char[]{'t', 'u', 'v'});
        map.put('9', new char[]{'w', 'x', 'y', 'z'});
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        int length;
        if ((length = digits.length()) == 0) {
            return result;
        }

        char[] chars = new char[length];

        int[] ints = new int[length];
        int pointer = 0;

        while (pointer > -1) {
            char[] temp = map.get(digits.charAt(pointer));
            if (ints[pointer] == temp.length) {
                ints[pointer] = 0;
                pointer--;
                continue;
            }
            chars[pointer] = temp[ints[pointer]];
            ints[pointer]++;
            pointer++;
            if (pointer == length) {
                result.add(String.valueOf(chars));
                pointer--;
            }
        }
        return result;
    }

    public List<String> letterCombinationsInRecursion(String digits) {
        List<String> result = new ArrayList<>();

        char[] temp = new char[digits.length()];
        recursion(result, digits, 0, temp);

        return result;
    }

    private void recursion(List result, String digits, int index, char[] temp) {
        if (index == digits.length()) {
            result.add(String.valueOf(temp));
            return;
        }

        char[] list = map.get(digits.charAt(index));
        for (int i = 0; i < list.length; i++) {
            temp[index] = list[i];
            recursion(result, digits, index + 1, temp);
        }
    }
}
