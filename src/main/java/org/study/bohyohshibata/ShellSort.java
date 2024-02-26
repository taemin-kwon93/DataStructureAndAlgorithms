package org.study.bohyohshibata;

import java.util.Arrays;

public class ShellSort {
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j-=h)
                    a[j + h] = a[j];
                a[j + h] = tmp;
            }
    }

    public static void main(String[] args) {
        int[] a = {6, 4, 3, 7, 1, 9, 8};
        shellSort(a, a.length);
        System.out.println(Arrays.toString(a));
    }
}
