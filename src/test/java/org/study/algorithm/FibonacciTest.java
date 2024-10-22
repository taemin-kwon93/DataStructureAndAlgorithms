package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }

    @ParameterizedTest
    @CsvSource({
            "4,3",
            "5,5",
            "3,2"
    })
    void solution(int n, int expected) {
        int result = fibonacci.solution(n);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "4,3",
            "5,5",
            "3,2"
    })
    void solution2(int n, int expected) {
        int result = fibonacci.solution2(n);
        assertEquals(expected, result);
    }
}