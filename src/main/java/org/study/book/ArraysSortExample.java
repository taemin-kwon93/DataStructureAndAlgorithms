package org.study.book;

import java.util.Arrays;

public class ArraysSortExample {
    public static void main(String[] args) {
        int[] x = {1, 3, 2, 7, 4, 5, 9, 6, 8, 0};
        Arrays.sort(x); // 퀵정렬을 개선한 sort method 이다. 안정적이지 않다.
        System.out.println(Arrays.toString(x));
    }
}
