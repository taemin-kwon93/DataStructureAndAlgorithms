package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorCountSumTest {
    private DivisorCountSum divisorCountSum;

    @BeforeEach
    void setUp() {
        divisorCountSum = new DivisorCountSum();
    }
    @Test
    void solution() {
        int result = divisorCountSum.solution(13, 17);

        assertEquals(43, result);
    }
}