package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenatedNumbersTest {
    private ConcatenatedNumbers concatNum;

    @BeforeEach
    void setUp() {
        concatNum = new ConcatenatedNumbers();
    }

    @Test
    void solution() {
        int result = concatNum.solution(new int[] {3, 4, 5, 2, 1});
        assertEquals(393, result);
    }
}