package org.study.bohyohshibata;

import java.util.Arrays;

public class BubbleSort2 {
    static void swap(int[] x, int idx1, int idx2) {
        int temp = idx1;
        idx1 = idx2;
        idx2 = temp;
    }

    static void bubbleSort2(int[] x, int n) {
        int k = 0; // a[k] 보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n - 1;
            for (int j = n - 1; j > k; j--) {
                if (x[j - 1] > x[j]) {
                    swap(x, j - 1, j);
                    last = j;
                }
            }
            k = last; // last는 이번 패스에서 마지막으로 교환된 위치로, 다음 패스에서 검사할 배열의 범위를 결정한다.
        }

    }

    public static void main(String[] args) {
        int[] x = {0, 1, 6, 2, 7, 23, 5, 73};
        bubbleSort2(x, x.length);
        System.out.println(Arrays.toString(x)); // [0, 1, 2, 5, 6, 7, 23, 73]
    }
}
