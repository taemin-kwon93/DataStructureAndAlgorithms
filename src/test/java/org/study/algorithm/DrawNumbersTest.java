package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawNumbersTest {
    private DrawNumbers drawNumbers;

    @BeforeEach
    void setUp() {
        drawNumbers = new DrawNumbers();
    }
    @Test
    void solution() {
        int[] arr = {0, 1, 1, 1, 1};
        int[] expected = {0, 1, -1, -1};

        int[] result = drawNumbers.solution(arr, 4);

        assertArrayEquals(expected, result);
    }
}