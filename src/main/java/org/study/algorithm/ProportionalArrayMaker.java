package org.study.algorithm;

public class ProportionalArrayMaker {
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;

        boolean flag = x < y;
        int[][] answer = flag ? new int[y][y] : new int[x][x];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }

        return answer;
    }
}
