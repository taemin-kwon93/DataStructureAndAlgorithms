package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {
    private MatrixMultiplication matrixMultiplication;

    @BeforeEach
    void setUp() {
        matrixMultiplication = new MatrixMultiplication();
    }

    @Test
    void solution() {
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};
        int[][] arr3 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr4 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] arr5 = {{1,2,3,4},{1,2,3,4}};
        int[][] arr6 = {{1,2},{1,2},{1,2},{1,2}};

        int[][] expected1 = {{15, 15}, {15, 15}, {15, 15}};
        int[][] expected2 = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        int[][] expected3 = {{10, 20}, {10, 20}};

        int[][] result1 = matrixMultiplication.solution(arr1, arr2);
        int[][] result2 = matrixMultiplication.solution(arr3, arr4);
        int[][] result3 = matrixMultiplication.solution(arr5, arr6);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}