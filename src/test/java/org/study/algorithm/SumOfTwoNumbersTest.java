package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoNumbersTest {
    private SumOfTwoNumbers sumOfTwoNumbers;

    @BeforeEach
    void setUp() {
        sumOfTwoNumbers = new SumOfTwoNumbers();
    }

    @Test
    void solution() {
        String expected = "305793246910280479981";

        String result = sumOfTwoNumbers.solution("18446744073709551615", "287346502836570928366");

        assertEquals(expected, result);
    }
}