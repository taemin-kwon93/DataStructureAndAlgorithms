package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiagonalTraversalSumTest {
    private DiagonalTraversalSum diagonalTraversalSum;

    @BeforeEach
    void setUp() {
        diagonalTraversalSum = new DiagonalTraversalSum();
    }

    @Test
    void solution() {
        int[][] board = {{0, 1, 2},{1, 2, 3},{2, 3, 4},{3, 4, 5}};
        int k = 2;

        int result = diagonalTraversalSum.solution(board, k);

        assertEquals(8, result);
    }
}