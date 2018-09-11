package com.victor.all.a_title_1_100.d_31_40;

import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] blocks = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int[] row = rows[i];
                    int[] col = cols[j];
                    int[] block = blocks[(i / 3) * 3 + (j / 3)];

                    int index = board[i][j] - '1';
                    if (row[index] == 1 || col[index] == 1 || block[index] == 1) {
                        return false;
                    }
                    row[index] = 1;
                    col[index] = 1;
                    block[index] = 1;
                }
            }
        }
        return true;
    }
}
