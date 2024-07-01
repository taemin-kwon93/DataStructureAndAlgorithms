package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThrowTheBallTest {
    private ThrowTheBall throwTheBall;

    @BeforeEach
    void setUp() {
        throwTheBall = new ThrowTheBall();
    }

    @Test
    void solution() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int k = 5;

        int result = throwTheBall.solution(numbers, k);

        assertEquals(3, result);
    }
}