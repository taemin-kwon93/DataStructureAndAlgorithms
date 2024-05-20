package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OffsetZeroTest {
    private OffsetZero offsetZero;

    @BeforeEach
    void setUp() {
        offsetZero = new OffsetZero();
    }

    @Test
    void solution() {
        String result = offsetZero.solution("0010");
        assertEquals("10", result);
    }
}