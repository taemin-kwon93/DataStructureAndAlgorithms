package org.study.book;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int[] x, int idx1, int idx2) {
        int t = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = t;
    }
    public static void selectionSort(int[] x, int n) {
        for (int i = 0; i < n - 1; i++){
        int min = i;
            for (int j = i + 1; j < n; j++) {
                if (x[j] < x[min]) min = j;
            }
            swap(x, i, min);
        }
    }

    public static void main(String[] args) {
        int[] x = {3, 11, 1, 4, 6, 9, 2};
        selectionSort(x, x.length);
        System.out.println(Arrays.toString(x));
    }
}
