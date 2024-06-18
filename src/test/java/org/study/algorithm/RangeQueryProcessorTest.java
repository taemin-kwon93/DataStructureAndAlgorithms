package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeQueryProcessorTest {
    private RangeQueryProcessor rangeQueryProcessor;

    @BeforeEach
    void setUp() {
        rangeQueryProcessor = new RangeQueryProcessor();
    }

    @Test
    void solution() {
        int[] arr  = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] expected = {3, 2, 4, 6, 4};

        int[] result = rangeQueryProcessor.solution(arr, queries);

        assertArrayEquals(expected, result);
    }
}