package com.victor.datastructure;

public class Fibonacci {
    public long fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public long fibonacciLoop(int n) {
        long[] cache = new long[]{0, 1};
        if (n < 2) {
            return cache[n];
        }

        long sum;
        for (int i = 2; i <= n; i++) {
            sum = cache[0] + cache[1];
            cache[0] = cache[1];
            cache[1] = sum;
        }

        return cache[1];
    }
}
