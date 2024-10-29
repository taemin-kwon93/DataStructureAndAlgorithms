package org.study.algorithm;

import java.util.Arrays;

public class SearchTargetIn2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix) {
            for (int j = 0; j < arr.length; j++) {
                int index = Math.max(Arrays.binarySearch(arr, target), 0);
                if (arr[index] == target) return true;
            }
        }

        return false;
    }
}
