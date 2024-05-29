package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumBetweenIntegersTest {
    private SumBetweenIntegers sumBetweenIntegers;

    @BeforeEach
    void setUp() {
        sumBetweenIntegers = new SumBetweenIntegers();
    }

    @Test
    void shouldReturnSumWhenTheNumbersAreDifferent() {
        long result = sumBetweenIntegers.solution(3, 5);
        assertEquals(12, result); // 3 + 4 + 5 = 12
    }

    @Test
    void shouldReturnWhenTheNumbersAreSame() {
        long result = sumBetweenIntegers.solution(5, 5);
        assertEquals(5, result); // When both numbers are the same, return either of them
    }

    @Test
    void shouldReturnSumWhenFirstNumberIsLarger() {
        long result = sumBetweenIntegers.solution(5, 3);
        assertEquals(12, result); // 3 + 4 + 5 = 12
    }
}