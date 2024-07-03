package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumArraysTest {
    private SumArrays sumArrays;

    @BeforeEach
    void setUp() {
        sumArrays = new SumArrays();
    }

    @Test
    void solution() {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] expected = {{4, 6}, {7, 9}};

        int[][] result = sumArrays.solution(arr1, arr2);

        assertArrayEquals(expected, result);
    }
}