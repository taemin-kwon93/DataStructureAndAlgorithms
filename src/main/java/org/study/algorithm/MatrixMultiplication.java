package org.study.algorithm;

public class MatrixMultiplication {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int arr1RowLen = arr1.length;         // arr1의 행 개수
        int arr2ColLen = arr2[0].length;      // arr2의 열 개수
        int arr1ColLen = arr1[0].length;      // arr1의 열 개수 (즉, arr2의 행 개수)

        int[][] answer = new int[arr1RowLen][arr2ColLen];

        for (int i = 0; i < arr1RowLen; i++) {
            for (int j = 0; j < arr2ColLen; j++) {
                int tmp = 0;
                for (int k = 0; k < arr1ColLen; k++) {  // 또는 k < arr2.length
                    tmp += (arr1[i][k] * arr2[k][j]);
                }
                answer[i][j] = tmp;
            }
        }

        return answer;
    }
}
