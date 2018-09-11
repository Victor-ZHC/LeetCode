package com.victor.combat.toutiao.first;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int[][] map = new int[num][num];

        for (int i = 0; i < num; i++) {
            map[i][i] = 1;
            String str = sc.nextLine();
            String[] splitStr = str.split(" ");
            for (int j = 0; j < splitStr.length - 1; j++) {
                int n = Integer.parseInt(splitStr[j]) - 1;
                map[i][n] = 1;
                map[n][i] = 1;
            }
        }

        Set<Integer> set = new HashSet<>();
        long count = 0;

        for (int i = 0; i < map.length; i++) {
            if (!set.contains(i)) {
                count++;
            } else {
                continue;
            }

            List<Integer> localList = new ArrayList<>();
            Set<Integer> localSet = new HashSet<>();
            localList.add(i);
            localSet.add(i);

            int j = 0;
            while (j < localList.size()) {
                int[] known = map[localList.get(j)];
                for (int k = 0; k < known.length; k++) {
                    if (known[k] == 1) {
                        set.add(k);
                        if (!localSet.contains(k)) {
                            localList.add(k);
                            localSet.add(k);
                        }
                    }
                }
                j++;
            }
        }
        System.out.println(count);
    }
}
