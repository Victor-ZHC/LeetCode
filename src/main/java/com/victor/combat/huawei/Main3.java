package com.victor.combat.huawei;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int all = Integer.parseInt(sc.nextLine());
        String cost = sc.nextLine();
        String reward = sc.nextLine();

        String[] costs = cost.split(" ");
        String[] rewards = reward.split(" ");

        int[] costsInt = new int[costs.length + 2];
        int[] rewardsInt = new int[rewards.length + 2];
        for (int i = 1; i <= costs.length; i++) {
            costsInt[i] = Integer.parseInt(costs[i - 1]);
            rewardsInt[i] = Integer.parseInt(rewards[i - 1]);
        }

        int[][] m = new int[costsInt.length + 2][all + 2];
        for(int i = 1; i <= costs.length; i++)
        {
            for(int j = 1; j <= all; j++)
            {
                if(j >= costsInt[i])
                    m[i][j] = Math.max(m[i-1][j], m[i-1][j - costsInt[i]] + rewardsInt[i]);
                else
                    m[i][j] = m[i-1][j];
            }
        }


        int[] result = new int[costsInt.length + 2];
        int c = all;
        for(int i = costs.length; i > 1; i--)
        {
            if(m[i][c] == m[i-1][c])
                result[i] = 0;
            else
            {
                result[i] = 1;
                c -= costsInt[i];
            }
        }
        result[1]=(m[1][c]>0) ? 1 : 0;

        String s = "";
        for (int i = 1; i < result.length; i++) {
            if (result[i] == 1) {
                s += i + " ";
            }
        }

        System.out.println(s.trim());
    }
}
