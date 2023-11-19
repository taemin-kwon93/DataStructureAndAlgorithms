package org.study.book;

import java.util.Scanner;

public class QuickSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if(pl < right) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("퀵 정렬");
        System.out.print("요솟 수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("요소 입력: ");
            x[i] = stdIn.nextInt();
        }
//        int[] x = {1, 6, 2, 345, 7, 12, 15, 11, 0, 23};
        quickSort(x, 0, x.length - 1);

        for (int i = 0; i < x.length; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}
