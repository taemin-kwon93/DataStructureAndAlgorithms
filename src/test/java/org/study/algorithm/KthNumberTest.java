package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthNumberTest {
    private KthNumber kthNumber;

    @BeforeEach
    void setUp() {
        kthNumber = new KthNumber();
    }

    @Test
    void solution() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] command = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] expected = {5, 6, 3};
        int[] result = kthNumber.solution(array, command);

        assertArrayEquals(expected, result);
    }
}