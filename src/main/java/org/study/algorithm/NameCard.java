package org.study.algorithm;

public class NameCard {
    public int solution(int[][] sizes) {
        int height = 0;
        int width = 0;

        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                int temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }
            height = Math.max(height, arr[0]);
            width = Math.max(width, arr[1]);
        }

        return height * width;
    }
}
