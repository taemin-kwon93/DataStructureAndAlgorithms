package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {
    private Carpet carpet;

    @BeforeEach
    void setUp() {
        carpet = new Carpet();
    }

    @Test
    void solution() {
        int[] expected1 = {4, 3};
        int[] expected2 = {3, 3};
        int[] expected3 = {8, 6};

        int[] result1 = carpet.solution(10, 2);
        int[] result2 = carpet.solution(8, 1);
        int[] result3 = carpet.solution(24, 24);

        assertArrayEquals(expected1, result1);
        assertArrayEquals(expected2, result2);
        assertArrayEquals(expected3, result3);
    }
}