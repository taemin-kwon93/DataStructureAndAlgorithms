package org.study.bohyohshibata;

import java.util.Arrays;

public class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchange = 0;
            for (int j = n - 1; j >  i; j--)
                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    exchange++;
                }
            if (exchange == 0) break;
        }
    }

    public static void main(String[] args) {
        int[] x = {0, 1, 6, 2, 7, 23, 5, 73};
        bubbleSort(x, x.length);
        System.out.println(Arrays.toString(x)); // [0, 1, 2, 5, 6, 7, 23, 73]
    }
}
