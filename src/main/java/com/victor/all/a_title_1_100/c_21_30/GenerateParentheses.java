package com.victor.all.a_title_1_100.c_21_30;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        generate(n, n, "", result);

        return result;
    }

    private void generate(int left, int right, String temp, List<String> result) {
        if (left > right) {
            return;
        }

        if (left == 0) {
            StringBuilder tail = new StringBuilder();
            for (int i = 0; i < right; i++) {
                tail.append(")");
            }
            result.add(temp + tail.toString());
            return;
        }

        generate(left - 1, right, temp + "(", result);
        generate(left, right - 1, temp + ")", result);
    }
}
