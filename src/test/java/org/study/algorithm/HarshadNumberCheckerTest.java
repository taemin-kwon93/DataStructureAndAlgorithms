package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumberCheckerTest {
    private HarshadNumberChecker harshadNumberChecker;

    @BeforeEach
    void setUp() {
        harshadNumberChecker = new HarshadNumberChecker();
    }

    @Test
    void shouldReturnTrueWhenHarshadNumber() {
        boolean result = harshadNumberChecker.solution(10);
        assertEquals(true, result);
    }

    @Test
    void shouldReturnFalseWhenNotHarshadNumber() {
        boolean result = harshadNumberChecker.solution(11);
        assertEquals(false, result);
    }
}