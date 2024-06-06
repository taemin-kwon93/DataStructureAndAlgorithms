package org.study.algorithm;

import java.util.Arrays;

public class ClosestNumberFinder {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int idx = Arrays.binarySearch(array, n);

        if (idx >= 0) {
            // If n is found in the array
            return array[idx];
        } else {
            // If n is not found in the array
            idx = -idx - 1; // Insertion point

            if (idx == 0) {
                // If n is less than the smallest element
                return array[0];
            } else if (idx == array.length) {
                // If n is greater than the largest element
                return array[array.length - 1];
            } else {
                // Find the closest element
                int previous = array[idx - 1];
                int next = array[idx];
                if (Math.abs(n - previous) <= Math.abs(n - next)) {
                    return previous;
                } else {
                    return next;
                }
            }
        }
    }
}
