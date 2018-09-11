package com.victor.all.e_title_501_600.e_41_50;

public class FriendCircles {
    public int findCircleNum(int[][] M) {

        int[] set = new int[M.length];
        int count = 0;

        for (int i = 0; i < M.length; i++) {
            if (set[i] == 0) {
                count++;
            } else {
                continue;
            }

            int[] localList = new int[M.length];

            for (int j = 0; j < localList.length; j++) {
                localList[j] = -1;
            }

            int j = 0;
            int length = 0;
            localList[j] = i;

            while (j < localList.length && localList[j] > -1) {
                int[] known = M[localList[j]];
                for (int k = 0; k < known.length; k++) {
                    if (known[k] == 1) {
                        if (set[k] != 1) {
                            set[k] = 1;
                            length++;
                            if (length < M.length) {
                                localList[length] = k;
                            }
                        }
                    }
                }
                j++;
            }
        }
        return count;
    }
}
