package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitReverserTest {
    private DigitReverser digitReverser;

    @BeforeEach
    void setUp() {
        digitReverser = new DigitReverser();
    }

    @Test
    void solution() {
        int[] expected = {5, 4, 3, 2, 1};

        int[] result = digitReverser.solution(12345);

        assertArrayEquals(expected, result);
    }
}