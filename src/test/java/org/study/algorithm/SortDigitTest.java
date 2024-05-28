package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortDigitTest {
    private SortDigit sortDigit;

    @BeforeEach
    void setUp() {
        sortDigit = new SortDigit();
    }

    @Test
    void solution() {
        long result = sortDigit.solution(118372);
        assertEquals(873211, result);
    }
}