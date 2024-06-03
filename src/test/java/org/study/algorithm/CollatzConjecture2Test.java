package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollatzConjecture2Test {
    private CollatzConjecture2 collatzConjecture2;

    @BeforeEach
    void setUp() {
        collatzConjecture2 = new CollatzConjecture2();
    }
    @Test
    void solution() {
        int result = collatzConjecture2.solution(626331);

        assertEquals(-1, result);
    }
}