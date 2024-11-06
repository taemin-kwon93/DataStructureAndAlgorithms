package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularSubsequenceSumCountTest {
    private CircularSubsequenceSumCount cssc;

    @BeforeEach
    void setUp() {
        cssc = new CircularSubsequenceSumCount();
    }

    @Test
    void solution() {
        int[] elements = {7,9,1,1,4};
        int result = cssc.solution(elements);

        assertEquals(18, result);
    }
}