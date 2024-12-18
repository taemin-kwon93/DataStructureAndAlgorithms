package org.study.parksangkhil;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {
    private FibonacciNumber fibonacciNumber;

    @BeforeEach
    void setUp() {
        fibonacciNumber = new FibonacciNumber();
    }

    @Test
    void fib() {
        int result1 = fibonacciNumber.fib(6);
        int result2 = fibonacciNumber.fib(4);
        int result3 = fibonacciNumber.fib(3);

        assertEquals(8, result1);
        assertEquals(3, result2);
        assertEquals(2, result3);
    }
}