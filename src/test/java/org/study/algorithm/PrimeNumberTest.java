package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {
    private PrimeNumber primeNumber;

    @BeforeEach
    void setUp() {
        primeNumber = new PrimeNumber();
    }

    // This solution occurs timeout
    @Test
    void solution() {
        int result1 = primeNumber.solution(10);
        int result2 = primeNumber.solution(5);
        int result3 = primeNumber.solution(17);
        int result4 = primeNumber.solution(19);
        int result5 = primeNumber.solution(23);

        assertEquals(4, result1);
        assertEquals(3, result2);
        assertEquals(7, result3);
        assertEquals(8, result4);
        assertEquals(9, result5);
    }

    @Test
    void solution2() {
        int result1 = primeNumber.solution2(10);
        int result2 = primeNumber.solution2(5);
        int result3 = primeNumber.solution2(17);
        int result4 = primeNumber.solution2(19);
        int result5 = primeNumber.solution2(23);

        assertEquals(4, result1);
        assertEquals(3, result2);
        assertEquals(7, result3);
        assertEquals(8, result4);
        assertEquals(9, result5);
    }
}