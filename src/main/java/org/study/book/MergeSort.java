package org.study.book;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static int[] buff;

    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(a, left, center);
            __mergeSort(a, center + 1, right);

            for (i = left; i <= center; i++)
                buff[p++] = a[i];

            while (i <= right && j < p)
                a[k++] = (buff[j] <= a[i]) ? buff[j++]: a[i++];

            while (j < p)
                a[k++] = buff[j++];

        }
    }

    static void mergeSort(int[] a, int n) {
        buff = new int[n];

        __mergeSort(a, 0,n - 1);

        buff = null;
    }

    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("병합 정렬");
//        System.out.print("요솟수 : ");
//        int nx = stdIn.nextInt();
//        int[] x = new int[nx];
//        for (int i = 0; i < nx; i++) {
//            System.out.println("x[" + i + "]: ");
//            x[i] = stdIn.nextInt();
//        }

        int[] x = {1, 3, 12, 6, 4, 11, 8, 7, 3, 2, 6, 5};

        mergeSort(x, x.length);

        System.out.print("정렬된 정수 배열의 결과: ");
        System.out.println(Arrays.toString(x));
    }
}
