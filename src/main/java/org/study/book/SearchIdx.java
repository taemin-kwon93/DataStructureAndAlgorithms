package org.study.book;

import java.util.Arrays;

public class SearchIdx {
    static int searchIdx(int[] a, int n, int key) {
        int i = 0;
        int counter = 0;

        while(i < n) {
            if(a[i] == key) counter++;
            i++;
        }

        int[] idx = new int[counter];

        int j = 0;
        int counter2 = 0;
        while(j < n) {
            if(a[j] == key) idx[counter2++] = j;
            j++;
        }

        System.out.println(Arrays.toString(idx));
        return counter;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 5, 3, 4, 5, 6, 7, 5, 9, 10};
        System.out.println(searchIdx(a, a.length, 5));
    }
}
