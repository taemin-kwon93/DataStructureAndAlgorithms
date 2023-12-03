package org.study.book;

import java.util.Arrays;

public class HeapSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // a[left] ~ a[right]를 힙으로 만듦
    static void downHeap(int[] a, int left, int right) {
        int temp = a[left]; // 루트
        int child;          // 큰 값을 갖는 자식
        int parent;         // 부모
        for (parent = left; parent < (right + 1) / 2; parent = child) {
            int cl = parent * 2 + 1;                          // 왼쪽 자식
            int cr = cl + 1;                                  // 오른쪽 자식
            child = (cr <= right && a[cr] > a[cl]) ? cr : cl; // 큰 쪽을 자식에 대입
            if (temp >= a[child]) break;
            a[parent] = a[child];
        }
        a[parent] = temp;
    }

    static void heapSort(int[] a, int n) {
        for (int i = (n - 1) / 2; i >= 0; i--)
            downHeap(a, i, n - 1); // a[i] ~ a[n-1]를 힙으로 만듦
        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i); // 가장 큰 요소와 아직 정렬되지 않은 부분의 마지막 요소를 교환
            downHeap(a, 0, i - 1); // a[0] ~ a[i-1]을 힙으로 만듦
        }
    }

    public static void main(String[] args) {
        int[] x = {6, 4, 3, 7, 1, 9, 2, 8, 5, 10};
        heapSort(x, x.length);
        System.out.println(Arrays.toString(x));
    }
}
