package org.study.book;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] x, int n) {
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = x[i];
            for (j = i; j > 0 && x[j - 1] > tmp; j--) // insertionSort 메서드 알고리즘의 핵심
                x[j] = x[j - 1];
            x[j] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] x = {0, 1, 6, 2, 7, 23, 5, 73};
        insertionSort(x, x.length);
        System.out.println(Arrays.toString(x));
    }
}
