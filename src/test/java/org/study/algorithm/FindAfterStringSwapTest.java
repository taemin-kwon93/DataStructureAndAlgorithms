package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindAfterStringSwapTest {
    private FindAfterStringSwap findAfterStringSwap;

    @BeforeEach
    void setUp() {
        findAfterStringSwap = new FindAfterStringSwap();
    }
    @Test
    void solution() {
        int result = findAfterStringSwap.solution("ABBAA", "AABB");
        assertEquals(1, result);
    }
}