package org.study.bohyohshibata;

import java.util.Arrays;

/**
 * 피벗을 선택하는 method가 추가됐습니다.
 * 피벗을 선택하는 방법은 퀵 정렬의 실행 효율에 큰 영향을 줍니다.
 *
 * 나눌 배열의 요솟수가 3 이상이면 임의로 요소 3개를 선택하고,
 * 그중에서 중앙값인 요소를 피벗으로 선택합니다.
 *
 * 위 방법을 조금 더 발전시킨 것이 다음 방법입니다.
 * 나눌 배열의 처음, 가운데, 끝 요소를 정렬한 다음 가운데 요소와 끝에서 두 번째 요소를 교환합니다.
 * 피벗으로 끝에서 두 번째 요솟값((a[right - 1])을 선택하고 나눌 대상의 범위를 a[left + 1] ~ a[right - 2]로 좁힙니다.
 */
public class QuickSort3 {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static int sort3elem(int[] x, int a, int b, int c) {
        if(x[b] < x[a]) swap(x, b, a);
        if(x[c] < x[b]) swap(x, c, b);
        if(x[b] < x[a]) swap(x, b, a);
        return b;
    }

    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int m = sort3elem(a, pl, (pl + pr) / 2, pr);
        int x = a[m];

        swap(a, m, right - 1);
        pl++;
        pr -= 2;

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr) swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        int[] x = {5, 8, 4, 2, 6, 1, 3, 9, 7};
        quickSort(x, 0, x.length - 1);
        System.out.println(Arrays.toString(x));
    }
}
