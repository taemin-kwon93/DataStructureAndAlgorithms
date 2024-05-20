package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIntegerTest {
    private FindInteger findInteger;

    @BeforeEach
    void setUp() {
        findInteger = new FindInteger();
    }

    @Test
    void shouldReturnOneWhenNumberIsFound() {
        int result = findInteger.solution(new int[] {1, 2, 3, 4, 5}, 3);
        assertEquals(1, result);
    }

    @Test
    void shouldReturnZeroWhenNumberIsNotFound() {
        int result = findInteger.solution(new int[] {15, 98, 23, 2, 15}, 20);
        assertEquals(0, result);
    }
}