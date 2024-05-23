package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMergerTest {
    private ArrayMerger arrayMerger;

    @BeforeEach
    void setUp() {
        arrayMerger = new ArrayMerger();
    }
    @Test
    void solution() {
        int[] a = {1, 2, 3, 4, 5};
        int[][] b = {{1, 3}, {0, 4}};
        int[] expected = {2, 3, 4, 1, 2, 3, 4, 5};

        int[] result = arrayMerger.solution(a, b);

        assertArrayEquals(expected, result);
    }
}