package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CutArrayTest {
    private CutArray cutArray;

    @BeforeEach
    void setUp() {
        cutArray = new CutArray();
    }

    @Test
    void solution() {
        int n = 4;
        long left = 7;
        long right = 14;
        int[] expected = {4, 3, 3, 3, 4, 4, 4, 4};

        int[] result1 = cutArray.solution(n, left, right);

        assertArrayEquals(expected, result1);
    }
}