package org.study.parksangkhil;

public class FibonacciNumber {
    public int fib(int n) {
        int[] arr = new int[31];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++)
            arr[i] = arr[i - 2] + arr[i - 1];

        return arr[n];
    }
}
