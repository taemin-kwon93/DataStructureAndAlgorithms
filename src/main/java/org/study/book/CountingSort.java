package org.study.book;

import java.util.Arrays;

public class CountingSort {
    static void countingSort(int[] a, int n, int max) {
        int[] f = new int[max + 1];
        int[] b = new int[n];

        for (int i = 0; i< n; i++) f[a[i]]++;
        for (int i = 1; i <= max; i++) f[i] += f[i - 1];
        for (int i = n - 1; i >= 0; i--) b[--f[a[i]]] = a[i];
        for (int i = 0; i < n; i++) a[i] = b[i];
    }

    public static void main(String[] args) {
        int[] x = {1, 3, 12, 6, 4, 11, 8, 7, 3, 2, 6, 5};
        int max = x[0];
        for (int i = 1; i < x.length; i++)
            if (x[i] > max) max = x[i];

        countingSort(x, x.length, max);

        System.out.println("배열: " + Arrays.toString(x));
    }
}
