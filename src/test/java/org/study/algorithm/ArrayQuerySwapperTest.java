package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayQuerySwapperTest {
    private ArrayQuerySwapper arrayQuerySwapper;

    @BeforeEach
    void setUp() {
        arrayQuerySwapper = new ArrayQuerySwapper();
    }

    @Test
    void solution() {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3},{1, 2},{1, 4}};
        int[] expected = {3, 4, 1, 0, 2};

        int[] result = arrayQuerySwapper.solution(arr, queries);
        assertArrayEquals(expected, result);
    }

    @Test
    void swap() {
        int[] a = {0, 1, 2, 3, 4};
        int idx1 = 0;
        int idx2 = 4;
        int[] expected = {4, 1, 2, 3, 0};

        int[] result = arrayQuerySwapper.swap(a, idx1, idx2);

        assertArrayEquals(expected, result);
    }
}