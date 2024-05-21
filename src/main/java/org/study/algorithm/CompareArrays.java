package org.study.algorithm;

import java.util.Arrays;

public class CompareArrays {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return 1;
        } else if (arr1.length < arr2.length) {
            return -1;
        } else {
            int a = Arrays.stream(arr1).sum();
            int b = Arrays.stream(arr2).sum();

            if (a == b) {
                return 0;
            } else {
                return (a > b) ? 1 : -1;
            }
        }
    }
}
