package com.victor.combat.zhaohang;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.valueOf(sc.nextLine());

        List<int[]> picture = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String board = sc.nextLine();
            int[] boards = {Integer.valueOf(board.split(" ")[0]), Integer.valueOf(board.split(" ")[1])};

            picture.add(boards);
        }

        int cov = 0;
        for (int i = 0; i < picture.size(); i++) {
            int[] down = picture.get(i);
            int ll = down[0];
            int lr = down[1];
            int rl = down[0];
            int rr = down[1];

            for (int j = i + 1; j < picture.size(); j++) {
                int[] on = picture.get(j);

                if (down[0] <= on[0] && down[1] >= on[0]) {
                    lr = lr > on[0] ? on[0] : lr;
                    if (on[1] >= down[1]) {
                        rl = down[1];
                        rr = down[1];
                    }
                }

                if (down[0] <= on[1] && down[1] >= on[1]) {
                    rl = rl < on[1] ? on[1] : rl;
                    if (on[0] <= down[0]) {
                        ll = down[0];
                        lr = down[0];
                    }
                }

                if (on[0] <= down[0] && down[1] <= on[1]) {
                    ll = down[0];
                    lr = down[0];
                    rl = down[1];
                    rr = down[1];
                    break;
                }
            }

            if (ll >= lr && rl >= rr) {
                cov++;
            }
        }

        System.out.println(picture.size() - cov);
    }
}
