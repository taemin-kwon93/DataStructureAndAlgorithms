package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfStringDigitsTest {
    private SumOfStringDigits sumOfStringDigits;

    @BeforeEach
    void setUp() {
        sumOfStringDigits = new SumOfStringDigits();
    }

    @Test
    void solution() {
        int result = sumOfStringDigits.solution("123456789");
        assertEquals(45, result);
    }
}