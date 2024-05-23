package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzConjectureTest {
    private CollatzConjecture collatzConjecture;

    @BeforeEach
    void setUp() {
        collatzConjecture = new CollatzConjecture();
    }

    @Test
    void solution() {
        int[] result = collatzConjecture.solution(10);
        assertArrayEquals(new int[] {10, 5, 16, 8, 4, 2, 1}, result);
    }
}