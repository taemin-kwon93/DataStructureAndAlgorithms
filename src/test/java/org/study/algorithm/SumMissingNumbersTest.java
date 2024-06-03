package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMissingNumbersTest {
    private SumMissingNumbers sumMissingNumbers;

    @BeforeEach
    void setUp() {
        sumMissingNumbers = new SumMissingNumbers();
    }

    @Test
    void solution() {
        int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};

        int result = sumMissingNumbers.solution(numbers);

        assertEquals(14, result);
    }
}