package com.victor.datastructure;

public class Factorial {
    public long factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }
}
