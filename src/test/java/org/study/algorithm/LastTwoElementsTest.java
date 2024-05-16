package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastTwoElementsTest {
    private LastTwoElements lastTwoElem;

    @BeforeEach
    void setUp() {
        lastTwoElem = new LastTwoElements();
    }

    @Test
    void solution() {
        int[] result = lastTwoElem.solution(new int[] {2, 1, 6});
        assertArrayEquals(new int[] {2, 1, 6, 5}, result);
    }
}