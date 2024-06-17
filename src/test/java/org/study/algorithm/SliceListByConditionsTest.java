package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SliceListByConditionsTest {
    private SliceListByConditions sliceListByConditions;

    @BeforeEach
    void setUp() {
        sliceListByConditions = new SliceListByConditions();
    }

    @Test
    void solution() {
        int n = 3;
        int[] slicer = {1, 5, 2};
        int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expected = {2, 3, 4, 5, 6};

        int[] result = sliceListByConditions.solution(n, slicer, num_list);

        assertArrayEquals(expected, result);
    }
}