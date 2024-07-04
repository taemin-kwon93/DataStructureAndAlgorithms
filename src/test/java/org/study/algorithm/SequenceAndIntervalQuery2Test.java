package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceAndIntervalQuery2Test {
    private SequenceAndIntervalQuery2 sequenceAndIntervalQuery2;

    @BeforeEach
    void setUp() {
        sequenceAndIntervalQuery2 = new SequenceAndIntervalQuery2();
    }

    @Test
    void solution() {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        int[] expected = {3, 4, -1};

        int[] result = sequenceAndIntervalQuery2.solution(arr, queries);

        assertArrayEquals(expected, result);
    }
}