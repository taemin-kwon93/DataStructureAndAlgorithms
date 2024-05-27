package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitSumCalculatorTest {
    private DigitSumCalculator digitSumCalculator;

    @BeforeEach
    void setUp() {
        digitSumCalculator = new DigitSumCalculator();
    }
    @Test
    void solution() {
        int result = digitSumCalculator.solution(987);
        assertEquals(24, result);
    }

}