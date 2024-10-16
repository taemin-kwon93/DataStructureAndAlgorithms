package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    private MergeIntervals mergeIntervals;

    @BeforeEach
    void setUp() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    void merge() {
        int[][] intervals = {{1, 3}, {8, 11}, {2, 6}, {15, 18}};
        int[][] expected = {{1, 6}, {8, 11}, {15, 18}};
        int[][] result = mergeIntervals.merge(intervals);

        assertArrayEquals(expected, result);
    }
}