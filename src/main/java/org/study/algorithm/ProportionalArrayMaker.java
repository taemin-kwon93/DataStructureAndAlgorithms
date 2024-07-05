package org.study.algorithm;

public class ProportionalArrayMaker {
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;

        boolean flag = x < y;
        int[][] answer = flag ? new int[y][y] : new int[x][x];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }

        return answer;
    }
}
