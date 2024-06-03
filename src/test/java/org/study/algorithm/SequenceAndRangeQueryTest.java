package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceAndRangeQueryTest {
    private SequenceAndRangeQuery sequenceAndRangeQuery;

    @BeforeEach
    void setUp() {
        sequenceAndRangeQuery = new SequenceAndRangeQuery();
    }

    @Test
    void solution() {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries ={{0, 1},{1, 2},{2, 3}};
        int[] expected = {1, 3, 4, 4, 4};

        int[] result = sequenceAndRangeQuery.solution(arr, queries);

        assertArrayEquals(expected, result);
    }
}