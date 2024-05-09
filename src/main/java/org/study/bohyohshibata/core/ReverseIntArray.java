package org.study.bohyohshibata.core;

import java.util.Arrays;

public class ReverseIntArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - 1 -i);
        }
        System.out.println(Arrays.toString(a));
    }

    private static void swap(int[] a, int idx1, int idx2) {
        int tmp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = tmp;
    }
}
