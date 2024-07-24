package org.study.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreaterThanNTest {
    private GreaterThanN greaterThanN;

    @BeforeEach
    void setUp() {
        greaterThanN = new GreaterThanN();
    }

    @Test
    void solution() {
        int n = 78;
        int expected = 83;

        int result = greaterThanN.solution(n);

        assertEquals(expected, result);
    }
}