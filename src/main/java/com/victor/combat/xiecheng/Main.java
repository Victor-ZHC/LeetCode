package com.victor.combat.xiecheng;

import java.util.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int calculate(int M, String[] strs) {
        int index = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < s.length(); j += 2) {
                if (! map.containsKey(s.charAt(j))) {
                    map.put(s.charAt(j), index);
                    index++;
                }
            }
        }

        int nodes = map.size();
        int[][] graph = new int[nodes][nodes];

        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                graph[i][j] = 0;
            }
        }

        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < s.length() - 2; j += 2) {
                graph[map.get(s.charAt(j))][map.get(s.charAt(j + 2))] = s.charAt(j + 1);
            }
        }


        for(int k=0; k < nodes; k++){
            for(int i=0; i < nodes; i++){
                for(int j=0; j < nodes; j++){
                    if(graph[i][k] != Integer.MAX_VALUE &&
                            graph[k][j] != Integer.MAX_VALUE &&
                            graph[i][k] + graph[k][j] > graph[i][j]){
                        graph[i][j]=graph[i][k]+graph[k][j];
                    }
                }
            }
        }

        return graph[0][nodes - 1];
    }
    /******************************结束写代码******************************/



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int res;

        int _M;
        _M = Integer.parseInt(in.nextLine().trim());

        int _strs_size = _M;
        String[] _strs = new String[_strs_size];
        String _strs_item;
        for(int _strs_i = 0; _strs_i < _strs_size; _strs_i++) {
            try {
                _strs_item = in.nextLine();
            } catch (Exception e) {
                _strs_item = null;
            }
            _strs[_strs_i] = _strs_item;
        }

        res = calculate(_M, _strs);
        System.out.println(String.valueOf(res));

    }
}

